/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime

object UnitmeasureRepoImpl extends UnitmeasureRepo {
  override def delete(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Boolean = {
    SQL"""delete from production.unitmeasure where unitmeasurecode = $unitmeasurecode""".executeUpdate() > 0
  }
  override def insert(unitmeasurecode: UnitmeasureId, unsaved: UnitmeasureRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name))),
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into production.unitmeasure(unitmeasurecode, ${namedParameters.map(_.name).mkString(", ")})
          values (${unitmeasurecode}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[UnitmeasureRow] = {
    SQL"""select unitmeasurecode, name, modifieddate from production.unitmeasure""".as(UnitmeasureRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[UnitmeasureFieldOrIdValue[_]])(implicit c: Connection): List[UnitmeasureRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UnitmeasureFieldValue.unitmeasurecode(value) => NamedParameter("unitmeasurecode", ParameterValue.from(value))
          case UnitmeasureFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case UnitmeasureFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from production.unitmeasure where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(UnitmeasureRow.rowParser("").*)
    }
  
  }
  override def selectById(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Option[UnitmeasureRow] = {
    SQL"""select unitmeasurecode, name, modifieddate from production.unitmeasure where unitmeasurecode = $unitmeasurecode""".as(UnitmeasureRow.rowParser("").singleOpt)
  }
  override def selectByIds(unitmeasurecodes: List[UnitmeasureId])(implicit c: Connection): List[UnitmeasureRow] = {
    SQL"""select unitmeasurecode, name, modifieddate from production.unitmeasure where unitmeasurecode in $unitmeasurecodes""".as(UnitmeasureRow.rowParser("").*)
  }
  override def update(unitmeasurecode: UnitmeasureId, row: UnitmeasureRow)(implicit c: Connection): Boolean = {
    SQL"""update production.unitmeasure
          set name = ${row.name},
              modifieddate = ${row.modifieddate}
          where unitmeasurecode = $unitmeasurecode""".executeUpdate() > 0
  }
  override def updateFieldValues(unitmeasurecode: UnitmeasureId, fieldValues: List[UnitmeasureFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UnitmeasureFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case UnitmeasureFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.unitmeasure
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where unitmeasurecode = $unitmeasurecode"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
