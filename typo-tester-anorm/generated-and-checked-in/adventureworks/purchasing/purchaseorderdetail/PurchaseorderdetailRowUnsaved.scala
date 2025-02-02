/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoShort
import adventureworks.production.product.ProductId
import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `purchasing.purchaseorderdetail` which has not been persisted yet */
case class PurchaseorderdetailRowUnsaved(
  /** Primary key. Foreign key to PurchaseOrderHeader.PurchaseOrderID.
      Points to [[purchaseorderheader.PurchaseorderheaderRow.purchaseorderid]] */
  purchaseorderid: PurchaseorderheaderId,
  /** Date the product is expected to be received. */
  duedate: TypoLocalDateTime,
  /** Quantity ordered.
      Constraint CK_PurchaseOrderDetail_OrderQty affecting columns "orderqty":  ((orderqty > 0)) */
  orderqty: TypoShort,
  /** Product identification number. Foreign key to Product.ProductID.
      Points to [[production.product.ProductRow.productid]] */
  productid: ProductId,
  /** Vendor's selling price of a single product.
      Constraint CK_PurchaseOrderDetail_UnitPrice affecting columns "unitprice":  ((unitprice >= 0.00)) */
  unitprice: BigDecimal,
  /** Quantity actually received from the vendor.
      Constraint CK_PurchaseOrderDetail_ReceivedQty affecting columns "receivedqty":  ((receivedqty >= 0.00)) */
  receivedqty: BigDecimal,
  /** Quantity rejected during inspection.
      Constraint CK_PurchaseOrderDetail_RejectedQty affecting columns "rejectedqty":  ((rejectedqty >= 0.00)) */
  rejectedqty: BigDecimal,
  /** Default: nextval('purchasing.purchaseorderdetail_purchaseorderdetailid_seq'::regclass)
      Primary key. One line number per purchased product. */
  purchaseorderdetailid: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(purchaseorderdetailidDefault: => Int, modifieddateDefault: => TypoLocalDateTime): PurchaseorderdetailRow =
    PurchaseorderdetailRow(
      purchaseorderid = purchaseorderid,
      duedate = duedate,
      orderqty = orderqty,
      productid = productid,
      unitprice = unitprice,
      receivedqty = receivedqty,
      rejectedqty = rejectedqty,
      purchaseorderdetailid = purchaseorderdetailid match {
                                case Defaulted.UseDefault => purchaseorderdetailidDefault
                                case Defaulted.Provided(value) => value
                              },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object PurchaseorderdetailRowUnsaved {
  implicit lazy val reads: Reads[PurchaseorderdetailRowUnsaved] = Reads[PurchaseorderdetailRowUnsaved](json => JsResult.fromTry(
      Try(
        PurchaseorderdetailRowUnsaved(
          purchaseorderid = json.\("purchaseorderid").as(PurchaseorderheaderId.reads),
          duedate = json.\("duedate").as(TypoLocalDateTime.reads),
          orderqty = json.\("orderqty").as(TypoShort.reads),
          productid = json.\("productid").as(ProductId.reads),
          unitprice = json.\("unitprice").as(Reads.bigDecReads),
          receivedqty = json.\("receivedqty").as(Reads.bigDecReads),
          rejectedqty = json.\("rejectedqty").as(Reads.bigDecReads),
          purchaseorderdetailid = json.\("purchaseorderdetailid").as(Defaulted.reads(Reads.IntReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[PurchaseorderdetailRowUnsaved] = OWrites[PurchaseorderdetailRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "purchaseorderid" -> PurchaseorderheaderId.writes.writes(o.purchaseorderid),
      "duedate" -> TypoLocalDateTime.writes.writes(o.duedate),
      "orderqty" -> TypoShort.writes.writes(o.orderqty),
      "productid" -> ProductId.writes.writes(o.productid),
      "unitprice" -> Writes.BigDecimalWrites.writes(o.unitprice),
      "receivedqty" -> Writes.BigDecimalWrites.writes(o.receivedqty),
      "rejectedqty" -> Writes.BigDecimalWrites.writes(o.rejectedqty),
      "purchaseorderdetailid" -> Defaulted.writes(Writes.IntWrites).writes(o.purchaseorderdetailid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
