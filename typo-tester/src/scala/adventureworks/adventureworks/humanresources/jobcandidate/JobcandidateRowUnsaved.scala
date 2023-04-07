/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package jobcandidate

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class JobcandidateRowUnsaved(
  businessentityid: Option[BusinessentityId],
  resume: Option[String],
  modifieddate: Defaulted[LocalDateTime]
)
object JobcandidateRowUnsaved {
  implicit val oFormat: OFormat[JobcandidateRowUnsaved] = new OFormat[JobcandidateRowUnsaved]{
    override def writes(o: JobcandidateRowUnsaved): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "resume" -> o.resume,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[JobcandidateRowUnsaved] = {
      JsResult.fromTry(
        Try(
          JobcandidateRowUnsaved(
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            resume = json.\("resume").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
