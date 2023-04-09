/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package department

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object DepartmentRepoImpl extends DepartmentRepo {
  override def delete(departmentid: DepartmentId)(implicit c: Connection): Boolean = {
    SQL"""delete from humanresources.department where departmentid = $departmentid""".executeUpdate() > 0
  }
  override def insert(unsaved: DepartmentRowUnsaved)(implicit c: Connection): DepartmentId = {
    val namedParameters = List(
      Some(NamedParameter("name", ParameterValue.from(unsaved.name))),
      Some(NamedParameter("groupname", ParameterValue.from(unsaved.groupname))),
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into humanresources.department(${namedParameters.map(_.name).mkString(", ")})
          values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
          returning departmentid
    """
      .on(namedParameters :_*)
      .executeInsert(idRowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[DepartmentRow] = {
    SQL"""select departmentid, name, groupname, modifieddate from humanresources.department""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[DepartmentFieldOrIdValue[_]])(implicit c: Connection): List[DepartmentRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case DepartmentFieldValue.departmentid(value) => NamedParameter("departmentid", ParameterValue.from(value))
          case DepartmentFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case DepartmentFieldValue.groupname(value) => NamedParameter("groupname", ParameterValue.from(value))
          case DepartmentFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from humanresources.department where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(departmentid: DepartmentId)(implicit c: Connection): Option[DepartmentRow] = {
    SQL"""select departmentid, name, groupname, modifieddate from humanresources.department where departmentid = $departmentid""".as(rowParser.singleOpt)
  }
  override def selectByIds(departmentids: List[DepartmentId])(implicit c: Connection): List[DepartmentRow] = {
    SQL"""select departmentid, name, groupname, modifieddate from humanresources.department where departmentid in $departmentids""".as(rowParser.*)
  }
  override def update(departmentid: DepartmentId, row: DepartmentRow)(implicit c: Connection): Boolean = {
    SQL"""update humanresources.department
          set name = ${row.name},
              groupname = ${row.groupname},
              modifieddate = ${row.modifieddate}
          where departmentid = $departmentid""".executeUpdate() > 0
  }
  override def updateFieldValues(departmentid: DepartmentId, fieldValues: List[DepartmentFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case DepartmentFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case DepartmentFieldValue.groupname(value) => NamedParameter("groupname", ParameterValue.from(value))
          case DepartmentFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update humanresources.department
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where departmentid = $departmentid"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[DepartmentRow] =
    RowParser[DepartmentRow] { row =>
      Success(
        DepartmentRow(
          departmentid = row[DepartmentId]("departmentid"),
          name = row[Name]("name"),
          groupname = row[Name]("groupname"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[DepartmentId] =
    SqlParser.get[DepartmentId]("departmentid")
}
