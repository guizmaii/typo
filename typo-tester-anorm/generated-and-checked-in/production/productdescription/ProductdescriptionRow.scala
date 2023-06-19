/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productdescription

import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductdescriptionRow(
  /** Primary key for ProductDescription records. */
  productdescriptionid: ProductdescriptionId,
  /** Description of the product. */
  description: /* max 400 chars */ String,
  rowguid: UUID,
  modifieddate: LocalDateTime
)

object ProductdescriptionRow {
  implicit val oFormat: OFormat[ProductdescriptionRow] = new OFormat[ProductdescriptionRow]{
    override def writes(o: ProductdescriptionRow): JsObject =
      Json.obj(
        "productdescriptionid" -> o.productdescriptionid,
        "description" -> o.description,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductdescriptionRow] = {
      JsResult.fromTry(
        Try(
          ProductdescriptionRow(
            productdescriptionid = json.\("productdescriptionid").as[ProductdescriptionId],
            description = json.\("description").as[/* max 400 chars */ String],
            rowguid = json.\("rowguid").as[UUID],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
