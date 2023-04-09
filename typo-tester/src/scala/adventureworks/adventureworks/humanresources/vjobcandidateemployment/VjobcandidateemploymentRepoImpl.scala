/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidateemployment

import adventureworks.humanresources.jobcandidate.JobcandidateId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDate

object VjobcandidateemploymentRepoImpl extends VjobcandidateemploymentRepo {
  override def selectAll(implicit c: Connection): List[VjobcandidateemploymentRow] = {
    SQL"""select jobcandidateid, "Emp.StartDate", "Emp.EndDate", "Emp.OrgName", "Emp.JobTitle", "Emp.Responsibility", "Emp.FunctionCategory", "Emp.IndustryCategory", "Emp.Loc.CountryRegion", "Emp.Loc.State", "Emp.Loc.City" from humanresources.vjobcandidateemployment""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[VjobcandidateemploymentFieldOrIdValue[_]])(implicit c: Connection): List[VjobcandidateemploymentRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case VjobcandidateemploymentFieldValue.jobcandidateid(value) => NamedParameter("jobcandidateid", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.StartDate`(value) => NamedParameter("Emp.StartDate", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.EndDate`(value) => NamedParameter("Emp.EndDate", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.OrgName`(value) => NamedParameter("Emp.OrgName", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.JobTitle`(value) => NamedParameter("Emp.JobTitle", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.Responsibility`(value) => NamedParameter("Emp.Responsibility", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.FunctionCategory`(value) => NamedParameter("Emp.FunctionCategory", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.IndustryCategory`(value) => NamedParameter("Emp.IndustryCategory", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.Loc.CountryRegion`(value) => NamedParameter("Emp.Loc.CountryRegion", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.Loc.State`(value) => NamedParameter("Emp.Loc.State", ParameterValue.from(value))
          case VjobcandidateemploymentFieldValue.`Emp.Loc.City`(value) => NamedParameter("Emp.Loc.City", ParameterValue.from(value))
        }
        val q = s"""select * from humanresources.vjobcandidateemployment where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[VjobcandidateemploymentRow] =
    RowParser[VjobcandidateemploymentRow] { row =>
      Success(
        VjobcandidateemploymentRow(
          jobcandidateid = row[Option[JobcandidateId]]("jobcandidateid"),
          `Emp.StartDate` = row[Option[LocalDate]]("Emp.StartDate"),
          `Emp.EndDate` = row[Option[LocalDate]]("Emp.EndDate"),
          `Emp.OrgName` = row[Option[String]]("Emp.OrgName"),
          `Emp.JobTitle` = row[Option[String]]("Emp.JobTitle"),
          `Emp.Responsibility` = row[Option[String]]("Emp.Responsibility"),
          `Emp.FunctionCategory` = row[Option[String]]("Emp.FunctionCategory"),
          `Emp.IndustryCategory` = row[Option[String]]("Emp.IndustryCategory"),
          `Emp.Loc.CountryRegion` = row[Option[String]]("Emp.Loc.CountryRegion"),
          `Emp.Loc.State` = row[Option[String]]("Emp.Loc.State"),
          `Emp.Loc.City` = row[Option[String]]("Emp.Loc.City")
        )
      )
    }
}
