/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package soh

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.address.AddressId
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.AccountNumber
import adventureworks.public.Flag
import adventureworks.public.OrderNumber
import adventureworks.purchasing.shipmethod.ShipmethodId
import adventureworks.sales.currencyrate.CurrencyrateId
import adventureworks.sales.customer.CustomerId
import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.salesterritory.SalesterritoryId
import adventureworks.userdefined.CustomCreditcardId
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

case class SohViewRow(
  id: Option[Int],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.salesorderid]] */
  salesorderid: Option[SalesorderheaderId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.revisionnumber]] */
  revisionnumber: Option[Int],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.orderdate]] */
  orderdate: Option[TypoLocalDateTime],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.duedate]] */
  duedate: Option[TypoLocalDateTime],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.shipdate]] */
  shipdate: Option[TypoLocalDateTime],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.status]] */
  status: Option[Int],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.onlineorderflag]] */
  onlineorderflag: Flag,
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.purchaseordernumber]] */
  purchaseordernumber: Option[OrderNumber],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.accountnumber]] */
  accountnumber: Option[AccountNumber],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.customerid]] */
  customerid: Option[CustomerId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.salespersonid]] */
  salespersonid: Option[BusinessentityId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.billtoaddressid]] */
  billtoaddressid: Option[AddressId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.shiptoaddressid]] */
  shiptoaddressid: Option[AddressId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.shipmethodid]] */
  shipmethodid: Option[ShipmethodId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.creditcardid]] */
  creditcardid: Option[/* user-picked */ CustomCreditcardId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.creditcardapprovalcode]] */
  creditcardapprovalcode: Option[/* max 15 chars */ String],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.currencyrateid]] */
  currencyrateid: Option[CurrencyrateId],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.subtotal]] */
  subtotal: Option[BigDecimal],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.taxamt]] */
  taxamt: Option[BigDecimal],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.freight]] */
  freight: Option[BigDecimal],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.totaldue]] */
  totaldue: Option[BigDecimal],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.comment]] */
  comment: Option[/* max 128 chars */ String],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[sales.salesorderheader.SalesorderheaderRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SohViewRow {
  implicit lazy val reads: Reads[SohViewRow] = Reads[SohViewRow](json => JsResult.fromTry(
      Try(
        SohViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          salesorderid = json.\("salesorderid").toOption.map(_.as(SalesorderheaderId.reads)),
          revisionnumber = json.\("revisionnumber").toOption.map(_.as(Reads.IntReads)),
          orderdate = json.\("orderdate").toOption.map(_.as(TypoLocalDateTime.reads)),
          duedate = json.\("duedate").toOption.map(_.as(TypoLocalDateTime.reads)),
          shipdate = json.\("shipdate").toOption.map(_.as(TypoLocalDateTime.reads)),
          status = json.\("status").toOption.map(_.as(Reads.IntReads)),
          onlineorderflag = json.\("onlineorderflag").as(Flag.reads),
          purchaseordernumber = json.\("purchaseordernumber").toOption.map(_.as(OrderNumber.reads)),
          accountnumber = json.\("accountnumber").toOption.map(_.as(AccountNumber.reads)),
          customerid = json.\("customerid").toOption.map(_.as(CustomerId.reads)),
          salespersonid = json.\("salespersonid").toOption.map(_.as(BusinessentityId.reads)),
          territoryid = json.\("territoryid").toOption.map(_.as(SalesterritoryId.reads)),
          billtoaddressid = json.\("billtoaddressid").toOption.map(_.as(AddressId.reads)),
          shiptoaddressid = json.\("shiptoaddressid").toOption.map(_.as(AddressId.reads)),
          shipmethodid = json.\("shipmethodid").toOption.map(_.as(ShipmethodId.reads)),
          creditcardid = json.\("creditcardid").toOption.map(_.as(CustomCreditcardId.reads)),
          creditcardapprovalcode = json.\("creditcardapprovalcode").toOption.map(_.as(Reads.StringReads)),
          currencyrateid = json.\("currencyrateid").toOption.map(_.as(CurrencyrateId.reads)),
          subtotal = json.\("subtotal").toOption.map(_.as(Reads.bigDecReads)),
          taxamt = json.\("taxamt").toOption.map(_.as(Reads.bigDecReads)),
          freight = json.\("freight").toOption.map(_.as(Reads.bigDecReads)),
          totaldue = json.\("totaldue").toOption.map(_.as(Reads.bigDecReads)),
          comment = json.\("comment").toOption.map(_.as(Reads.StringReads)),
          rowguid = json.\("rowguid").toOption.map(_.as(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SohViewRow] = RowParser[SohViewRow] { row =>
    Success(
      SohViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        salesorderid = row(idx + 1)(Column.columnToOption(SalesorderheaderId.column)),
        revisionnumber = row(idx + 2)(Column.columnToOption(Column.columnToInt)),
        orderdate = row(idx + 3)(Column.columnToOption(TypoLocalDateTime.column)),
        duedate = row(idx + 4)(Column.columnToOption(TypoLocalDateTime.column)),
        shipdate = row(idx + 5)(Column.columnToOption(TypoLocalDateTime.column)),
        status = row(idx + 6)(Column.columnToOption(Column.columnToInt)),
        onlineorderflag = row(idx + 7)(Flag.column),
        purchaseordernumber = row(idx + 8)(Column.columnToOption(OrderNumber.column)),
        accountnumber = row(idx + 9)(Column.columnToOption(AccountNumber.column)),
        customerid = row(idx + 10)(Column.columnToOption(CustomerId.column)),
        salespersonid = row(idx + 11)(Column.columnToOption(BusinessentityId.column)),
        territoryid = row(idx + 12)(Column.columnToOption(SalesterritoryId.column)),
        billtoaddressid = row(idx + 13)(Column.columnToOption(AddressId.column)),
        shiptoaddressid = row(idx + 14)(Column.columnToOption(AddressId.column)),
        shipmethodid = row(idx + 15)(Column.columnToOption(ShipmethodId.column)),
        creditcardid = row(idx + 16)(Column.columnToOption(CustomCreditcardId.column)),
        creditcardapprovalcode = row(idx + 17)(Column.columnToOption(Column.columnToString)),
        currencyrateid = row(idx + 18)(Column.columnToOption(CurrencyrateId.column)),
        subtotal = row(idx + 19)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        taxamt = row(idx + 20)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        freight = row(idx + 21)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        totaldue = row(idx + 22)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        comment = row(idx + 23)(Column.columnToOption(Column.columnToString)),
        rowguid = row(idx + 24)(Column.columnToOption(Column.columnToUUID)),
        modifieddate = row(idx + 25)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[SohViewRow] = OWrites[SohViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "salesorderid" -> Writes.OptionWrites(SalesorderheaderId.writes).writes(o.salesorderid),
      "revisionnumber" -> Writes.OptionWrites(Writes.IntWrites).writes(o.revisionnumber),
      "orderdate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.orderdate),
      "duedate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.duedate),
      "shipdate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.shipdate),
      "status" -> Writes.OptionWrites(Writes.IntWrites).writes(o.status),
      "onlineorderflag" -> Flag.writes.writes(o.onlineorderflag),
      "purchaseordernumber" -> Writes.OptionWrites(OrderNumber.writes).writes(o.purchaseordernumber),
      "accountnumber" -> Writes.OptionWrites(AccountNumber.writes).writes(o.accountnumber),
      "customerid" -> Writes.OptionWrites(CustomerId.writes).writes(o.customerid),
      "salespersonid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.salespersonid),
      "territoryid" -> Writes.OptionWrites(SalesterritoryId.writes).writes(o.territoryid),
      "billtoaddressid" -> Writes.OptionWrites(AddressId.writes).writes(o.billtoaddressid),
      "shiptoaddressid" -> Writes.OptionWrites(AddressId.writes).writes(o.shiptoaddressid),
      "shipmethodid" -> Writes.OptionWrites(ShipmethodId.writes).writes(o.shipmethodid),
      "creditcardid" -> Writes.OptionWrites(CustomCreditcardId.writes).writes(o.creditcardid),
      "creditcardapprovalcode" -> Writes.OptionWrites(Writes.StringWrites).writes(o.creditcardapprovalcode),
      "currencyrateid" -> Writes.OptionWrites(CurrencyrateId.writes).writes(o.currencyrateid),
      "subtotal" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.subtotal),
      "taxamt" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.taxamt),
      "freight" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.freight),
      "totaldue" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.totaldue),
      "comment" -> Writes.OptionWrites(Writes.StringWrites).writes(o.comment),
      "rowguid" -> Writes.OptionWrites(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
