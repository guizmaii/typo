/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

/** Type for the composite primary key of table `purchasing.purchaseorderdetail` */
case class PurchaseorderdetailId(purchaseorderid: PurchaseorderheaderId, purchaseorderdetailid: Int)
object PurchaseorderdetailId {
  implicit val ordering: Ordering[PurchaseorderdetailId] = Ordering.by(x => (x.purchaseorderid, x.purchaseorderdetailid))
  implicit val decoder: Decoder[PurchaseorderdetailId] =
    (c: HCursor) =>
      for {
        purchaseorderid <- c.downField("purchaseorderid").as[PurchaseorderheaderId]
        purchaseorderdetailid <- c.downField("purchaseorderdetailid").as[Int]
      } yield PurchaseorderdetailId(purchaseorderid, purchaseorderdetailid)
  implicit val encoder: Encoder[PurchaseorderdetailId] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "purchaseorderid" := row.purchaseorderid,
        "purchaseorderdetailid" := row.purchaseorderdetailid
      )}
}
