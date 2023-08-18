/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productcosthistory

import adventureworks.production.product.ProductId
import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class ProductcosthistoryRow(
  /** Product identification number. Foreign key to Product.ProductID
      Points to [[product.ProductRow.productid]] */
  productid: ProductId,
  /** Product cost start date. */
  startdate: TypoLocalDateTime,
  /** Product cost end date. */
  enddate: Option[TypoLocalDateTime],
  /** Standard cost of the product. */
  standardcost: BigDecimal,
  modifieddate: TypoLocalDateTime
){
   val compositeId: ProductcosthistoryId = ProductcosthistoryId(productid, startdate)
 }

object ProductcosthistoryRow {
  implicit lazy val reads: Reads[ProductcosthistoryRow] = Reads[ProductcosthistoryRow](json => JsResult.fromTry(
      Try(
        ProductcosthistoryRow(
          productid = json.\("productid").as(ProductId.reads),
          startdate = json.\("startdate").as(TypoLocalDateTime.reads),
          enddate = json.\("enddate").toOption.map(_.as(TypoLocalDateTime.reads)),
          standardcost = json.\("standardcost").as(Reads.bigDecReads),
          modifieddate = json.\("modifieddate").as(TypoLocalDateTime.reads)
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[ProductcosthistoryRow] = RowParser[ProductcosthistoryRow] { row =>
    Success(
      ProductcosthistoryRow(
        productid = row(idx + 0)(ProductId.column),
        startdate = row(idx + 1)(TypoLocalDateTime.column),
        enddate = row(idx + 2)(Column.columnToOption(TypoLocalDateTime.column)),
        standardcost = row(idx + 3)(Column.columnToScalaBigDecimal),
        modifieddate = row(idx + 4)(TypoLocalDateTime.column)
      )
    )
  }
  implicit lazy val writes: OWrites[ProductcosthistoryRow] = OWrites[ProductcosthistoryRow](o =>
    new JsObject(ListMap[String, JsValue](
      "productid" -> ProductId.writes.writes(o.productid),
      "startdate" -> TypoLocalDateTime.writes.writes(o.startdate),
      "enddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.enddate),
      "standardcost" -> Writes.BigDecimalWrites.writes(o.standardcost),
      "modifieddate" -> TypoLocalDateTime.writes.writes(o.modifieddate)
    ))
  )
}
