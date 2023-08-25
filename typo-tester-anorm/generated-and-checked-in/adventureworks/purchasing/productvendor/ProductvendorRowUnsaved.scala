/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package productvendor

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.production.product.ProductId
import adventureworks.production.unitmeasure.UnitmeasureId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `purchasing.productvendor` which has not been persisted yet */
case class ProductvendorRowUnsaved(
  /** Primary key. Foreign key to Product.ProductID.
      Points to [[production.product.ProductRow.productid]] */
  productid: ProductId,
  /** Primary key. Foreign key to Vendor.BusinessEntityID.
      Points to [[vendor.VendorRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** The average span of time (in days) between placing an order with the vendor and receiving the purchased product. */
  averageleadtime: Int,
  /** The vendor's usual selling price. */
  standardprice: BigDecimal,
  /** The selling price when last purchased. */
  lastreceiptcost: Option[BigDecimal],
  /** Date the product was last received by the vendor. */
  lastreceiptdate: Option[TypoLocalDateTime],
  /** The maximum quantity that should be ordered. */
  minorderqty: Int,
  /** The minimum quantity that should be ordered. */
  maxorderqty: Int,
  /** The quantity currently on order. */
  onorderqty: Option[Int],
  /** The product's unit of measure.
      Points to [[production.unitmeasure.UnitmeasureRow.unitmeasurecode]] */
  unitmeasurecode: UnitmeasureId,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): ProductvendorRow =
    ProductvendorRow(
      productid = productid,
      businessentityid = businessentityid,
      averageleadtime = averageleadtime,
      standardprice = standardprice,
      lastreceiptcost = lastreceiptcost,
      lastreceiptdate = lastreceiptdate,
      minorderqty = minorderqty,
      maxorderqty = maxorderqty,
      onorderqty = onorderqty,
      unitmeasurecode = unitmeasurecode,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductvendorRowUnsaved {
  implicit lazy val reads: Reads[ProductvendorRowUnsaved] = Reads[ProductvendorRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductvendorRowUnsaved(
          productid = json.\("productid").as(ProductId.reads),
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          averageleadtime = json.\("averageleadtime").as(Reads.IntReads),
          standardprice = json.\("standardprice").as(Reads.bigDecReads),
          lastreceiptcost = json.\("lastreceiptcost").toOption.map(_.as(Reads.bigDecReads)),
          lastreceiptdate = json.\("lastreceiptdate").toOption.map(_.as(TypoLocalDateTime.reads)),
          minorderqty = json.\("minorderqty").as(Reads.IntReads),
          maxorderqty = json.\("maxorderqty").as(Reads.IntReads),
          onorderqty = json.\("onorderqty").toOption.map(_.as(Reads.IntReads)),
          unitmeasurecode = json.\("unitmeasurecode").as(UnitmeasureId.reads),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductvendorRowUnsaved] = OWrites[ProductvendorRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "productid" -> ProductId.writes.writes(o.productid),
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "averageleadtime" -> Writes.IntWrites.writes(o.averageleadtime),
      "standardprice" -> Writes.BigDecimalWrites.writes(o.standardprice),
      "lastreceiptcost" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.lastreceiptcost),
      "lastreceiptdate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.lastreceiptdate),
      "minorderqty" -> Writes.IntWrites.writes(o.minorderqty),
      "maxorderqty" -> Writes.IntWrites.writes(o.maxorderqty),
      "onorderqty" -> Writes.OptionWrites(Writes.IntWrites).writes(o.onorderqty),
      "unitmeasurecode" -> UnitmeasureId.writes.writes(o.unitmeasurecode),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
