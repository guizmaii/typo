/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package shipmethod

import adventureworks.Defaulted
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `purchasing.shipmethod` which has not been persisted yet */
case class ShipmethodRowUnsaved(
  name: Name,
  shipbase: Defaulted[BigDecimal],
  shiprate: Defaulted[BigDecimal],
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object ShipmethodRowUnsaved {
  implicit val oFormat: OFormat[ShipmethodRowUnsaved] = new OFormat[ShipmethodRowUnsaved]{
    override def writes(o: ShipmethodRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "shipbase" -> o.shipbase,
        "shiprate" -> o.shiprate,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ShipmethodRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ShipmethodRowUnsaved(
            name = json.\("name").as[Name],
            shipbase = json.\("shipbase").as[Defaulted[BigDecimal]],
            shiprate = json.\("shiprate").as[Defaulted[BigDecimal]],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
