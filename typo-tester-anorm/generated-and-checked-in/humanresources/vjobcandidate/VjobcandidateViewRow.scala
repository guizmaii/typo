/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidate

import adventureworks.humanresources.jobcandidate.JobcandidateId
import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VjobcandidateViewRow(
  /** Points to [[jobcandidate.JobcandidateRow.jobcandidateid]] */
  jobcandidateid: Option[JobcandidateId],
  /** Points to [[jobcandidate.JobcandidateRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  `Name.Prefix`: Option[/* max 30 chars */ String],
  `Name.First`: Option[/* max 30 chars */ String],
  `Name.Middle`: Option[/* max 30 chars */ String],
  `Name.Last`: Option[/* max 30 chars */ String],
  `Name.Suffix`: Option[/* max 30 chars */ String],
  Skills: Option[String],
  `Addr.Type`: Option[/* max 30 chars */ String],
  `Addr.Loc.CountryRegion`: Option[/* max 100 chars */ String],
  `Addr.Loc.State`: Option[/* max 100 chars */ String],
  `Addr.Loc.City`: Option[/* max 100 chars */ String],
  `Addr.PostalCode`: Option[/* max 20 chars */ String],
  EMail: Option[String],
  WebSite: Option[String],
  /** Points to [[jobcandidate.JobcandidateRow.modifieddate]] */
  modifieddate: Option[LocalDateTime]
)

object VjobcandidateViewRow {
  implicit val oFormat: OFormat[VjobcandidateViewRow] = new OFormat[VjobcandidateViewRow]{
    override def writes(o: VjobcandidateViewRow): JsObject =
      Json.obj(
        "jobcandidateid" -> o.jobcandidateid,
        "businessentityid" -> o.businessentityid,
        "Name.Prefix" -> o.`Name.Prefix`,
        "Name.First" -> o.`Name.First`,
        "Name.Middle" -> o.`Name.Middle`,
        "Name.Last" -> o.`Name.Last`,
        "Name.Suffix" -> o.`Name.Suffix`,
        "Skills" -> o.Skills,
        "Addr.Type" -> o.`Addr.Type`,
        "Addr.Loc.CountryRegion" -> o.`Addr.Loc.CountryRegion`,
        "Addr.Loc.State" -> o.`Addr.Loc.State`,
        "Addr.Loc.City" -> o.`Addr.Loc.City`,
        "Addr.PostalCode" -> o.`Addr.PostalCode`,
        "EMail" -> o.EMail,
        "WebSite" -> o.WebSite,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[VjobcandidateViewRow] = {
      JsResult.fromTry(
        Try(
          VjobcandidateViewRow(
            jobcandidateid = json.\("jobcandidateid").toOption.map(_.as[JobcandidateId]),
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            `Name.Prefix` = json.\("Name.Prefix").toOption.map(_.as[/* max 30 chars */ String]),
            `Name.First` = json.\("Name.First").toOption.map(_.as[/* max 30 chars */ String]),
            `Name.Middle` = json.\("Name.Middle").toOption.map(_.as[/* max 30 chars */ String]),
            `Name.Last` = json.\("Name.Last").toOption.map(_.as[/* max 30 chars */ String]),
            `Name.Suffix` = json.\("Name.Suffix").toOption.map(_.as[/* max 30 chars */ String]),
            Skills = json.\("Skills").toOption.map(_.as[String]),
            `Addr.Type` = json.\("Addr.Type").toOption.map(_.as[/* max 30 chars */ String]),
            `Addr.Loc.CountryRegion` = json.\("Addr.Loc.CountryRegion").toOption.map(_.as[/* max 100 chars */ String]),
            `Addr.Loc.State` = json.\("Addr.Loc.State").toOption.map(_.as[/* max 100 chars */ String]),
            `Addr.Loc.City` = json.\("Addr.Loc.City").toOption.map(_.as[/* max 100 chars */ String]),
            `Addr.PostalCode` = json.\("Addr.PostalCode").toOption.map(_.as[/* max 20 chars */ String]),
            EMail = json.\("EMail").toOption.map(_.as[String]),
            WebSite = json.\("WebSite").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
