/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package th

import adventureworks.production.product.ProductId
import adventureworks.production.transactionhistory.TransactionhistoryId
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

case class ThViewRow(
  id: Option[Int],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.transactionid]] */
  transactionid: Option[TransactionhistoryId],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.referenceorderid]] */
  referenceorderid: Option[Int],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.referenceorderlineid]] */
  referenceorderlineid: Option[Int],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.transactiondate]] */
  transactiondate: Option[TypoLocalDateTime],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.transactiontype]] */
  transactiontype: Option[/* bpchar, max 1 chars */ String],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.quantity]] */
  quantity: Option[Int],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.actualcost]] */
  actualcost: Option[BigDecimal],
  /** Points to [[production.transactionhistory.TransactionhistoryRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object ThViewRow {
  implicit lazy val reads: Reads[ThViewRow] = Reads[ThViewRow](json => JsResult.fromTry(
      Try(
        ThViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          transactionid = json.\("transactionid").toOption.map(_.as(TransactionhistoryId.reads)),
          productid = json.\("productid").toOption.map(_.as(ProductId.reads)),
          referenceorderid = json.\("referenceorderid").toOption.map(_.as(Reads.IntReads)),
          referenceorderlineid = json.\("referenceorderlineid").toOption.map(_.as(Reads.IntReads)),
          transactiondate = json.\("transactiondate").toOption.map(_.as(TypoLocalDateTime.reads)),
          transactiontype = json.\("transactiontype").toOption.map(_.as(Reads.StringReads)),
          quantity = json.\("quantity").toOption.map(_.as(Reads.IntReads)),
          actualcost = json.\("actualcost").toOption.map(_.as(Reads.bigDecReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[ThViewRow] = RowParser[ThViewRow] { row =>
    Success(
      ThViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        transactionid = row(idx + 1)(Column.columnToOption(TransactionhistoryId.column)),
        productid = row(idx + 2)(Column.columnToOption(ProductId.column)),
        referenceorderid = row(idx + 3)(Column.columnToOption(Column.columnToInt)),
        referenceorderlineid = row(idx + 4)(Column.columnToOption(Column.columnToInt)),
        transactiondate = row(idx + 5)(Column.columnToOption(TypoLocalDateTime.column)),
        transactiontype = row(idx + 6)(Column.columnToOption(Column.columnToString)),
        quantity = row(idx + 7)(Column.columnToOption(Column.columnToInt)),
        actualcost = row(idx + 8)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        modifieddate = row(idx + 9)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[ThViewRow] = OWrites[ThViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "transactionid" -> Writes.OptionWrites(TransactionhistoryId.writes).writes(o.transactionid),
      "productid" -> Writes.OptionWrites(ProductId.writes).writes(o.productid),
      "referenceorderid" -> Writes.OptionWrites(Writes.IntWrites).writes(o.referenceorderid),
      "referenceorderlineid" -> Writes.OptionWrites(Writes.IntWrites).writes(o.referenceorderlineid),
      "transactiondate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.transactiondate),
      "transactiontype" -> Writes.OptionWrites(Writes.StringWrites).writes(o.transactiontype),
      "quantity" -> Writes.OptionWrites(Writes.IntWrites).writes(o.quantity),
      "actualcost" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.actualcost),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
