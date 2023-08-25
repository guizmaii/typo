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
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.DecodingFailure
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import java.util.UUID
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
  implicit lazy val decoder: Decoder[SohViewRow] = Decoder.instanceTry[SohViewRow]((c: HCursor) =>
    Try {
      def orThrow[R](either: Either[DecodingFailure, R]): R = either match {
        case Left(err) => throw err
        case Right(r)  => r
      }
      SohViewRow(
        id = orThrow(c.get("id")(Decoder.decodeOption(Decoder.decodeInt))),
        salesorderid = orThrow(c.get("salesorderid")(Decoder.decodeOption(SalesorderheaderId.decoder))),
        revisionnumber = orThrow(c.get("revisionnumber")(Decoder.decodeOption(Decoder.decodeInt))),
        orderdate = orThrow(c.get("orderdate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        duedate = orThrow(c.get("duedate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        shipdate = orThrow(c.get("shipdate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        status = orThrow(c.get("status")(Decoder.decodeOption(Decoder.decodeInt))),
        onlineorderflag = orThrow(c.get("onlineorderflag")(Flag.decoder)),
        purchaseordernumber = orThrow(c.get("purchaseordernumber")(Decoder.decodeOption(OrderNumber.decoder))),
        accountnumber = orThrow(c.get("accountnumber")(Decoder.decodeOption(AccountNumber.decoder))),
        customerid = orThrow(c.get("customerid")(Decoder.decodeOption(CustomerId.decoder))),
        salespersonid = orThrow(c.get("salespersonid")(Decoder.decodeOption(BusinessentityId.decoder))),
        territoryid = orThrow(c.get("territoryid")(Decoder.decodeOption(SalesterritoryId.decoder))),
        billtoaddressid = orThrow(c.get("billtoaddressid")(Decoder.decodeOption(AddressId.decoder))),
        shiptoaddressid = orThrow(c.get("shiptoaddressid")(Decoder.decodeOption(AddressId.decoder))),
        shipmethodid = orThrow(c.get("shipmethodid")(Decoder.decodeOption(ShipmethodId.decoder))),
        creditcardid = orThrow(c.get("creditcardid")(Decoder.decodeOption(CustomCreditcardId.decoder))),
        creditcardapprovalcode = orThrow(c.get("creditcardapprovalcode")(Decoder.decodeOption(Decoder.decodeString))),
        currencyrateid = orThrow(c.get("currencyrateid")(Decoder.decodeOption(CurrencyrateId.decoder))),
        subtotal = orThrow(c.get("subtotal")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        taxamt = orThrow(c.get("taxamt")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        freight = orThrow(c.get("freight")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        totaldue = orThrow(c.get("totaldue")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        comment = orThrow(c.get("comment")(Decoder.decodeOption(Decoder.decodeString))),
        rowguid = orThrow(c.get("rowguid")(Decoder.decodeOption(Decoder.decodeUUID))),
        modifieddate = orThrow(c.get("modifieddate")(Decoder.decodeOption(TypoLocalDateTime.decoder)))
      )
    }
  )
  implicit lazy val encoder: Encoder[SohViewRow] = Encoder[SohViewRow](row =>
    Json.obj(
      "id" -> Encoder.encodeOption(Encoder.encodeInt).apply(row.id),
      "salesorderid" -> Encoder.encodeOption(SalesorderheaderId.encoder).apply(row.salesorderid),
      "revisionnumber" -> Encoder.encodeOption(Encoder.encodeInt).apply(row.revisionnumber),
      "orderdate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.orderdate),
      "duedate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.duedate),
      "shipdate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.shipdate),
      "status" -> Encoder.encodeOption(Encoder.encodeInt).apply(row.status),
      "onlineorderflag" -> Flag.encoder.apply(row.onlineorderflag),
      "purchaseordernumber" -> Encoder.encodeOption(OrderNumber.encoder).apply(row.purchaseordernumber),
      "accountnumber" -> Encoder.encodeOption(AccountNumber.encoder).apply(row.accountnumber),
      "customerid" -> Encoder.encodeOption(CustomerId.encoder).apply(row.customerid),
      "salespersonid" -> Encoder.encodeOption(BusinessentityId.encoder).apply(row.salespersonid),
      "territoryid" -> Encoder.encodeOption(SalesterritoryId.encoder).apply(row.territoryid),
      "billtoaddressid" -> Encoder.encodeOption(AddressId.encoder).apply(row.billtoaddressid),
      "shiptoaddressid" -> Encoder.encodeOption(AddressId.encoder).apply(row.shiptoaddressid),
      "shipmethodid" -> Encoder.encodeOption(ShipmethodId.encoder).apply(row.shipmethodid),
      "creditcardid" -> Encoder.encodeOption(CustomCreditcardId.encoder).apply(row.creditcardid),
      "creditcardapprovalcode" -> Encoder.encodeOption(Encoder.encodeString).apply(row.creditcardapprovalcode),
      "currencyrateid" -> Encoder.encodeOption(CurrencyrateId.encoder).apply(row.currencyrateid),
      "subtotal" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.subtotal),
      "taxamt" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.taxamt),
      "freight" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.freight),
      "totaldue" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.totaldue),
      "comment" -> Encoder.encodeOption(Encoder.encodeString).apply(row.comment),
      "rowguid" -> Encoder.encodeOption(Encoder.encodeUUID).apply(row.rowguid),
      "modifieddate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.modifieddate)
    )
  )
  implicit lazy val read: Read[SohViewRow] = new Read[SohViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (SalesorderheaderId.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (Flag.get, Nullability.NoNulls),
      (OrderNumber.get, Nullability.Nullable),
      (AccountNumber.get, Nullability.Nullable),
      (CustomerId.get, Nullability.Nullable),
      (BusinessentityId.get, Nullability.Nullable),
      (SalesterritoryId.get, Nullability.Nullable),
      (AddressId.get, Nullability.Nullable),
      (AddressId.get, Nullability.Nullable),
      (ShipmethodId.get, Nullability.Nullable),
      (/* user-picked */ CustomCreditcardId.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (CurrencyrateId.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SohViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      salesorderid = SalesorderheaderId.get.unsafeGetNullable(rs, i + 1),
      revisionnumber = Meta.IntMeta.get.unsafeGetNullable(rs, i + 2),
      orderdate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 3),
      duedate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 4),
      shipdate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 5),
      status = Meta.IntMeta.get.unsafeGetNullable(rs, i + 6),
      onlineorderflag = Flag.get.unsafeGetNonNullable(rs, i + 7),
      purchaseordernumber = OrderNumber.get.unsafeGetNullable(rs, i + 8),
      accountnumber = AccountNumber.get.unsafeGetNullable(rs, i + 9),
      customerid = CustomerId.get.unsafeGetNullable(rs, i + 10),
      salespersonid = BusinessentityId.get.unsafeGetNullable(rs, i + 11),
      territoryid = SalesterritoryId.get.unsafeGetNullable(rs, i + 12),
      billtoaddressid = AddressId.get.unsafeGetNullable(rs, i + 13),
      shiptoaddressid = AddressId.get.unsafeGetNullable(rs, i + 14),
      shipmethodid = ShipmethodId.get.unsafeGetNullable(rs, i + 15),
      creditcardid = /* user-picked */ CustomCreditcardId.get.unsafeGetNullable(rs, i + 16),
      creditcardapprovalcode = Meta.StringMeta.get.unsafeGetNullable(rs, i + 17),
      currencyrateid = CurrencyrateId.get.unsafeGetNullable(rs, i + 18),
      subtotal = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 19),
      taxamt = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 20),
      freight = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 21),
      totaldue = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 22),
      comment = Meta.StringMeta.get.unsafeGetNullable(rs, i + 23),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 24),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 25)
    )
  )
}
