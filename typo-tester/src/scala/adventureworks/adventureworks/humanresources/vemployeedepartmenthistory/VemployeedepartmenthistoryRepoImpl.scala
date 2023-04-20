/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vemployeedepartmenthistory

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDate

object VemployeedepartmenthistoryRepoImpl extends VemployeedepartmenthistoryRepo {
  override def selectAll(implicit c: Connection): List[VemployeedepartmenthistoryRow] = {
    SQL"""select businessentityid, title, firstname, middlename, lastname, suffix, shift, department, groupname, startdate, enddate
          from humanresources.vemployeedepartmenthistory
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[VemployeedepartmenthistoryFieldOrIdValue[_]])(implicit c: Connection): List[VemployeedepartmenthistoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case VemployeedepartmenthistoryFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.title(value) => NamedParameter("title", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.firstname(value) => NamedParameter("firstname", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.middlename(value) => NamedParameter("middlename", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.lastname(value) => NamedParameter("lastname", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.suffix(value) => NamedParameter("suffix", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.shift(value) => NamedParameter("shift", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.department(value) => NamedParameter("department", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.groupname(value) => NamedParameter("groupname", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.startdate(value) => NamedParameter("startdate", ParameterValue.from(value))
          case VemployeedepartmenthistoryFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from humanresources.vemployeedepartmenthistory
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[VemployeedepartmenthistoryRow] =
    RowParser[VemployeedepartmenthistoryRow] { row =>
      Success(
        VemployeedepartmenthistoryRow(
          businessentityid = row[Option[BusinessentityId]]("businessentityid"),
          title = row[Option[String]]("title"),
          firstname = row[Option[Name]]("firstname"),
          middlename = row[Option[Name]]("middlename"),
          lastname = row[Option[Name]]("lastname"),
          suffix = row[Option[String]]("suffix"),
          shift = row[Option[Name]]("shift"),
          department = row[Option[Name]]("department"),
          groupname = row[Option[Name]]("groupname"),
          startdate = row[Option[LocalDate]]("startdate"),
          enddate = row[Option[LocalDate]]("enddate")
        )
      )
    }
}
