/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentityaddress

import adventureworks.Defaulted
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.businessentityaddress` which has not been persisted yet */
case class BusinessentityaddressRowUnsaved(
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object BusinessentityaddressRowUnsaved {
  implicit val oFormat: OFormat[BusinessentityaddressRowUnsaved] = new OFormat[BusinessentityaddressRowUnsaved]{
    override def writes(o: BusinessentityaddressRowUnsaved): JsObject =
      Json.obj(
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[BusinessentityaddressRowUnsaved] = {
      JsResult.fromTry(
        Try(
          BusinessentityaddressRowUnsaved(
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
