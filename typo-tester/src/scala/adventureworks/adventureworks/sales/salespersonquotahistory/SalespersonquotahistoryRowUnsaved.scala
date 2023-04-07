/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salespersonquotahistory

import adventureworks.Defaulted
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `sales.salespersonquotahistory` which has not been persisted yet */
case class SalespersonquotahistoryRowUnsaved(
  salesquota: BigDecimal,
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object SalespersonquotahistoryRowUnsaved {
  implicit val oFormat: OFormat[SalespersonquotahistoryRowUnsaved] = new OFormat[SalespersonquotahistoryRowUnsaved]{
    override def writes(o: SalespersonquotahistoryRowUnsaved): JsObject =
      Json.obj(
        "salesquota" -> o.salesquota,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SalespersonquotahistoryRowUnsaved] = {
      JsResult.fromTry(
        Try(
          SalespersonquotahistoryRowUnsaved(
            salesquota = json.\("salesquota").as[BigDecimal],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
