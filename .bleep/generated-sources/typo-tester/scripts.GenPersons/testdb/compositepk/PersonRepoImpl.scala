package testdb
package compositepk

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PersonRepoImpl extends PersonRepo {
  override def selectAll(implicit c: Connection): List[PersonRow] = {
    SQL"""select one, two, name from compositepk.person""".as(PersonRow.rowParser.*)
  }
  override def selectById(oneAndTwo: PersonId)(implicit c: Connection): Option[PersonRow] = {
    SQL"""select one, two, name from compositepk.person where one = ${oneAndTwo.one}, two = ${oneAndTwo.two}""".as(PersonRow.rowParser.singleOpt)
  }
  override def selectByFieldValues(fieldValues: List[PersonFieldValue[_]])(implicit c: Connection): List[PersonRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonFieldValue.one(value) => NamedParameter("one", ParameterValue.from(value))
          case PersonFieldValue.two(value) => NamedParameter("two", ParameterValue.from(value))
          case PersonFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
        }
        SQL"""select * from compositepk.person where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PersonRow.rowParser.*)
    }

  }
  override def updateFieldValues(oneAndTwo: PersonId, fieldValues: List[PersonFieldValue[_]])(implicit c: Connection): Int = {
    fieldValues match {
      case Nil => 0
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonFieldValue.one(value) => NamedParameter("one", ParameterValue.from(value))
          case PersonFieldValue.two(value) => NamedParameter("two", ParameterValue.from(value))
          case PersonFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
        }
        SQL"""update compositepk.person
          set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
          where one = ${oneAndTwo.one}, two = ${oneAndTwo.two}"""
          .on(namedParams: _*)
          .executeUpdate()
    }

  }
  override def insert(unsaved: PersonRowUnsaved)(implicit c: Connection): PersonId = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name)))
    ).flatten

    SQL"""insert into compositepk.person(${namedParameters.map(_.name).mkString(", ")})
      values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
      returning one, two
      """
      .on(namedParameters :_*)
      .executeInsert(PersonId.rowParser.single)

  }
  override def delete(oneAndTwo: PersonId)(implicit c: Connection): Boolean = {
    SQL"""delete from compositepk.person where one = ${oneAndTwo.one}, two = ${oneAndTwo.two}""".executeUpdate() > 0
  }
}
