/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package productvendor

import adventureworks.Defaulted
import adventureworks.production.unitmeasure.UnitmeasureId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductvendorRowUnsaved(
  averageleadtime: Int,
  standardprice: BigDecimal,
  lastreceiptcost: Option[BigDecimal],
  lastreceiptdate: Option[LocalDateTime],
  minorderqty: Int,
  maxorderqty: Int,
  onorderqty: Option[Int],
  unitmeasurecode: UnitmeasureId,
  modifieddate: Defaulted[LocalDateTime]
)
object ProductvendorRowUnsaved {
  implicit val oFormat: OFormat[ProductvendorRowUnsaved] = new OFormat[ProductvendorRowUnsaved]{
    override def writes(o: ProductvendorRowUnsaved): JsObject =
      Json.obj(
        "averageleadtime" -> o.averageleadtime,
        "standardprice" -> o.standardprice,
        "lastreceiptcost" -> o.lastreceiptcost,
        "lastreceiptdate" -> o.lastreceiptdate,
        "minorderqty" -> o.minorderqty,
        "maxorderqty" -> o.maxorderqty,
        "onorderqty" -> o.onorderqty,
        "unitmeasurecode" -> o.unitmeasurecode,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductvendorRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductvendorRowUnsaved(
            averageleadtime = json.\("averageleadtime").as[Int],
            standardprice = json.\("standardprice").as[BigDecimal],
            lastreceiptcost = json.\("lastreceiptcost").toOption.map(_.as[BigDecimal]),
            lastreceiptdate = json.\("lastreceiptdate").toOption.map(_.as[LocalDateTime]),
            minorderqty = json.\("minorderqty").as[Int],
            maxorderqty = json.\("maxorderqty").as[Int],
            onorderqty = json.\("onorderqty").toOption.map(_.as[Int]),
            unitmeasurecode = json.\("unitmeasurecode").as[UnitmeasureId],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
