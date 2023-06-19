/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidateemployment

import adventureworks.humanresources.jobcandidate.JobcandidateId
import java.time.LocalDate
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VjobcandidateemploymentViewRow(
  /** Points to [[jobcandidate.JobcandidateRow.jobcandidateid]] */
  jobcandidateid: Option[JobcandidateId],
  `Emp.StartDate`: Option[LocalDate],
  `Emp.EndDate`: Option[LocalDate],
  `Emp.OrgName`: Option[/* max 100 chars */ String],
  `Emp.JobTitle`: Option[/* max 100 chars */ String],
  `Emp.Responsibility`: Option[String],
  `Emp.FunctionCategory`: Option[String],
  `Emp.IndustryCategory`: Option[String],
  `Emp.Loc.CountryRegion`: Option[String],
  `Emp.Loc.State`: Option[String],
  `Emp.Loc.City`: Option[String]
)

object VjobcandidateemploymentViewRow {
  implicit val oFormat: OFormat[VjobcandidateemploymentViewRow] = new OFormat[VjobcandidateemploymentViewRow]{
    override def writes(o: VjobcandidateemploymentViewRow): JsObject =
      Json.obj(
        "jobcandidateid" -> o.jobcandidateid,
        "Emp.StartDate" -> o.`Emp.StartDate`,
        "Emp.EndDate" -> o.`Emp.EndDate`,
        "Emp.OrgName" -> o.`Emp.OrgName`,
        "Emp.JobTitle" -> o.`Emp.JobTitle`,
        "Emp.Responsibility" -> o.`Emp.Responsibility`,
        "Emp.FunctionCategory" -> o.`Emp.FunctionCategory`,
        "Emp.IndustryCategory" -> o.`Emp.IndustryCategory`,
        "Emp.Loc.CountryRegion" -> o.`Emp.Loc.CountryRegion`,
        "Emp.Loc.State" -> o.`Emp.Loc.State`,
        "Emp.Loc.City" -> o.`Emp.Loc.City`
      )
  
    override def reads(json: JsValue): JsResult[VjobcandidateemploymentViewRow] = {
      JsResult.fromTry(
        Try(
          VjobcandidateemploymentViewRow(
            jobcandidateid = json.\("jobcandidateid").toOption.map(_.as[JobcandidateId]),
            `Emp.StartDate` = json.\("Emp.StartDate").toOption.map(_.as[LocalDate]),
            `Emp.EndDate` = json.\("Emp.EndDate").toOption.map(_.as[LocalDate]),
            `Emp.OrgName` = json.\("Emp.OrgName").toOption.map(_.as[/* max 100 chars */ String]),
            `Emp.JobTitle` = json.\("Emp.JobTitle").toOption.map(_.as[/* max 100 chars */ String]),
            `Emp.Responsibility` = json.\("Emp.Responsibility").toOption.map(_.as[String]),
            `Emp.FunctionCategory` = json.\("Emp.FunctionCategory").toOption.map(_.as[String]),
            `Emp.IndustryCategory` = json.\("Emp.IndustryCategory").toOption.map(_.as[String]),
            `Emp.Loc.CountryRegion` = json.\("Emp.Loc.CountryRegion").toOption.map(_.as[String]),
            `Emp.Loc.State` = json.\("Emp.Loc.State").toOption.map(_.as[String]),
            `Emp.Loc.City` = json.\("Emp.Loc.City").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
