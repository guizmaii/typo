/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productsubcategory

import adventureworks.Defaulted
import adventureworks.production.productcategory.ProductcategoryId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `production.productsubcategory` which has not been persisted yet */
case class ProductsubcategoryRowUnsaved(
  productcategoryid: ProductcategoryId,
  name: Name,
  rowguid: Defaulted[UUID],
  modifieddate: Defaulted[LocalDateTime]
)
object ProductsubcategoryRowUnsaved {
  implicit val oFormat: OFormat[ProductsubcategoryRowUnsaved] = new OFormat[ProductsubcategoryRowUnsaved]{
    override def writes(o: ProductsubcategoryRowUnsaved): JsObject =
      Json.obj(
        "productcategoryid" -> o.productcategoryid,
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductsubcategoryRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductsubcategoryRowUnsaved(
            productcategoryid = json.\("productcategoryid").as[ProductcategoryId],
            name = json.\("name").as[Name],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
