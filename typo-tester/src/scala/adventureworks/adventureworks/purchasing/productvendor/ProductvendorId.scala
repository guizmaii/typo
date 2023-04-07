/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package productvendor

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.production.product.ProductId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** Type for the composite primary key of table `purchasing.productvendor` */
case class ProductvendorId(productid: ProductId, businessentityid: BusinessentityId)
object ProductvendorId {
  implicit def ordering: Ordering[ProductvendorId] = Ordering.by(x => (x.productid, x.businessentityid))
  implicit val oFormat: OFormat[ProductvendorId] = new OFormat[ProductvendorId]{
    override def writes(o: ProductvendorId): JsObject =
      Json.obj(
        "productid" -> o.productid,
        "businessentityid" -> o.businessentityid
      )
  
    override def reads(json: JsValue): JsResult[ProductvendorId] = {
      JsResult.fromTry(
        Try(
          ProductvendorId(
            productid = json.\("productid").as[ProductId],
            businessentityid = json.\("businessentityid").as[BusinessentityId]
          )
        )
      )
    }
  }
  def rowParser(prefix: String): RowParser[ProductvendorId] = { row =>
    Success(
      ProductvendorId(
        productid = row[ProductId](prefix + "productid"),
        businessentityid = row[BusinessentityId](prefix + "businessentityid")
      )
    )
  }

}
