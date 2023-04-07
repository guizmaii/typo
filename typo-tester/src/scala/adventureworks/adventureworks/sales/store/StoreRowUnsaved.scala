/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package store

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class StoreRowUnsaved(
  name: String,
  salespersonid: Option[BusinessentityId],
  demographics: Option[/* xml */ String],
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object StoreRowUnsaved {
  implicit val oFormat: OFormat[StoreRowUnsaved] = new OFormat[StoreRowUnsaved]{
    override def writes(o: StoreRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "salespersonid" -> o.salespersonid,
        "demographics" -> o.demographics,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[StoreRowUnsaved] = {
      JsResult.fromTry(
        Try(
          StoreRowUnsaved(
            name = json.\("name").as[String],
            salespersonid = json.\("salespersonid").toOption.map(_.as[BusinessentityId]),
            demographics = json.\("demographics").toOption.map(_.as[/* xml */ String]),
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
