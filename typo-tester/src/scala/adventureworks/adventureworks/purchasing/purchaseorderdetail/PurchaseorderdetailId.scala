/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PurchaseorderdetailId(purchaseorderid: PurchaseorderheaderId, purchaseorderdetailid: Int)
object PurchaseorderdetailId {
  implicit def ordering: Ordering[PurchaseorderdetailId] = Ordering.by(x => (x.purchaseorderid, x.purchaseorderdetailid))
  implicit val oFormat: OFormat[PurchaseorderdetailId] = new OFormat[PurchaseorderdetailId]{
    override def writes(o: PurchaseorderdetailId): JsObject =
      Json.obj(
        "purchaseorderid" -> o.purchaseorderid,
        "purchaseorderdetailid" -> o.purchaseorderdetailid
      )
  
    override def reads(json: JsValue): JsResult[PurchaseorderdetailId] = {
      JsResult.fromTry(
        Try(
          PurchaseorderdetailId(
            purchaseorderid = json.\("purchaseorderid").as[PurchaseorderheaderId],
            purchaseorderdetailid = json.\("purchaseorderdetailid").as[Int]
          )
        )
      )
    }
  }
  def rowParser(prefix: String): RowParser[PurchaseorderdetailId] = { row =>
    Success(
      PurchaseorderdetailId(
        purchaseorderid = row[PurchaseorderheaderId](prefix + "purchaseorderid"),
        purchaseorderdetailid = row[Int](prefix + "purchaseorderdetailid")
      )
    )
  }

}
