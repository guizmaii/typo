/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sod

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.specialoffer.SpecialofferId
import anorm.Column
import anorm.RowParser
import anorm.Success
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class SodViewRow(
  id: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.salesorderid]] */
  salesorderid: Option[SalesorderheaderId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.salesorderdetailid]] */
  salesorderdetailid: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.carriertrackingnumber]] */
  carriertrackingnumber: Option[/* max 25 chars */ String],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.orderqty]] */
  orderqty: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.specialofferid]] */
  specialofferid: Option[SpecialofferId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.unitprice]] */
  unitprice: Option[BigDecimal],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.unitpricediscount]] */
  unitpricediscount: Option[BigDecimal],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SodViewRow {
  implicit lazy val reads: Reads[SodViewRow] = Reads[SodViewRow](json => JsResult.fromTry(
      Try(
        SodViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          salesorderid = json.\("salesorderid").toOption.map(_.as(SalesorderheaderId.reads)),
          salesorderdetailid = json.\("salesorderdetailid").toOption.map(_.as(Reads.IntReads)),
          carriertrackingnumber = json.\("carriertrackingnumber").toOption.map(_.as(Reads.StringReads)),
          orderqty = json.\("orderqty").toOption.map(_.as(Reads.IntReads)),
          productid = json.\("productid").toOption.map(_.as(ProductId.reads)),
          specialofferid = json.\("specialofferid").toOption.map(_.as(SpecialofferId.reads)),
          unitprice = json.\("unitprice").toOption.map(_.as(Reads.bigDecReads)),
          unitpricediscount = json.\("unitpricediscount").toOption.map(_.as(Reads.bigDecReads)),
          rowguid = json.\("rowguid").toOption.map(_.as(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SodViewRow] = RowParser[SodViewRow] { row =>
    Success(
      SodViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        salesorderid = row(idx + 1)(Column.columnToOption(SalesorderheaderId.column)),
        salesorderdetailid = row(idx + 2)(Column.columnToOption(Column.columnToInt)),
        carriertrackingnumber = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        orderqty = row(idx + 4)(Column.columnToOption(Column.columnToInt)),
        productid = row(idx + 5)(Column.columnToOption(ProductId.column)),
        specialofferid = row(idx + 6)(Column.columnToOption(SpecialofferId.column)),
        unitprice = row(idx + 7)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        unitpricediscount = row(idx + 8)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        rowguid = row(idx + 9)(Column.columnToOption(Column.columnToUUID)),
        modifieddate = row(idx + 10)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[SodViewRow] = OWrites[SodViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "salesorderid" -> Writes.OptionWrites(SalesorderheaderId.writes).writes(o.salesorderid),
      "salesorderdetailid" -> Writes.OptionWrites(Writes.IntWrites).writes(o.salesorderdetailid),
      "carriertrackingnumber" -> Writes.OptionWrites(Writes.StringWrites).writes(o.carriertrackingnumber),
      "orderqty" -> Writes.OptionWrites(Writes.IntWrites).writes(o.orderqty),
      "productid" -> Writes.OptionWrites(ProductId.writes).writes(o.productid),
      "specialofferid" -> Writes.OptionWrites(SpecialofferId.writes).writes(o.specialofferid),
      "unitprice" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.unitprice),
      "unitpricediscount" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.unitpricediscount),
      "rowguid" -> Writes.OptionWrites(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
