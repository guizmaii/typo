/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.address.AddressId
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.AccountNumber
import adventureworks.public.Flag
import adventureworks.public.OrderNumber
import adventureworks.purchasing.shipmethod.ShipmethodId
import adventureworks.sales.currencyrate.CurrencyrateId
import adventureworks.sales.customer.CustomerId
import adventureworks.sales.salesterritory.SalesterritoryId
import adventureworks.userdefined.CustomCreditcardId
import io.circe.Decoder
import io.circe.DecodingFailure
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.util.UUID
import scala.util.Try

/** This class corresponds to a row in table `sales.salesorderheader` which has not been persisted yet */
case class SalesorderheaderRowUnsaved(
  /** Date the order is due to the customer. */
  duedate: TypoLocalDateTime,
  /** Date the order was shipped to the customer. */
  shipdate: Option[TypoLocalDateTime],
  /** Customer purchase order number reference. */
  purchaseordernumber: Option[OrderNumber],
  /** Financial accounting number reference. */
  accountnumber: Option[AccountNumber],
  /** Customer identification number. Foreign key to Customer.BusinessEntityID.
      Points to [[customer.CustomerRow.customerid]] */
  customerid: CustomerId,
  /** Sales person who created the sales order. Foreign key to SalesPerson.BusinessEntityID.
      Points to [[salesperson.SalespersonRow.businessentityid]] */
  salespersonid: Option[BusinessentityId],
  /** Territory in which the sale was made. Foreign key to SalesTerritory.SalesTerritoryID.
      Points to [[salesterritory.SalesterritoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Customer billing address. Foreign key to Address.AddressID.
      Points to [[person.address.AddressRow.addressid]] */
  billtoaddressid: AddressId,
  /** Customer shipping address. Foreign key to Address.AddressID.
      Points to [[person.address.AddressRow.addressid]] */
  shiptoaddressid: AddressId,
  /** Shipping method. Foreign key to ShipMethod.ShipMethodID.
      Points to [[purchasing.shipmethod.ShipmethodRow.shipmethodid]] */
  shipmethodid: ShipmethodId,
  /** Credit card identification number. Foreign key to CreditCard.CreditCardID.
      Points to [[creditcard.CreditcardRow.creditcardid]] */
  creditcardid: Option[/* user-picked */ CustomCreditcardId],
  /** Approval code provided by the credit card company. */
  creditcardapprovalcode: Option[/* max 15 chars */ String],
  /** Currency exchange rate used. Foreign key to CurrencyRate.CurrencyRateID.
      Points to [[currencyrate.CurrencyrateRow.currencyrateid]] */
  currencyrateid: Option[CurrencyrateId],
  /** Total due from customer. Computed as Subtotal + TaxAmt + Freight. */
  totaldue: Option[BigDecimal],
  /** Sales representative comments. */
  comment: Option[/* max 128 chars */ String],
  /** Default: nextval('sales.salesorderheader_salesorderid_seq'::regclass)
      Primary key. */
  salesorderid: Defaulted[SalesorderheaderId] = Defaulted.UseDefault,
  /** Default: 0
      Incremental number to track changes to the sales order over time. */
  revisionnumber: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: now()
      Dates the sales order was created. */
  orderdate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault,
  /** Default: 1
      Order current status. 1 = In process; 2 = Approved; 3 = Backordered; 4 = Rejected; 5 = Shipped; 6 = Cancelled */
  status: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: true
      0 = Order placed by sales person. 1 = Order placed online by customer. */
  onlineorderflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: 0.00
      Sales subtotal. Computed as SUM(SalesOrderDetail.LineTotal)for the appropriate SalesOrderID. */
  subtotal: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Tax amount. */
  taxamt: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Shipping cost. */
  freight: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(salesorderidDefault: => SalesorderheaderId, revisionnumberDefault: => Int, orderdateDefault: => TypoLocalDateTime, statusDefault: => Int, onlineorderflagDefault: => Flag, subtotalDefault: => BigDecimal, taxamtDefault: => BigDecimal, freightDefault: => BigDecimal, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): SalesorderheaderRow =
    SalesorderheaderRow(
      duedate = duedate,
      shipdate = shipdate,
      purchaseordernumber = purchaseordernumber,
      accountnumber = accountnumber,
      customerid = customerid,
      salespersonid = salespersonid,
      territoryid = territoryid,
      billtoaddressid = billtoaddressid,
      shiptoaddressid = shiptoaddressid,
      shipmethodid = shipmethodid,
      creditcardid = creditcardid,
      creditcardapprovalcode = creditcardapprovalcode,
      currencyrateid = currencyrateid,
      totaldue = totaldue,
      comment = comment,
      salesorderid = salesorderid match {
                       case Defaulted.UseDefault => salesorderidDefault
                       case Defaulted.Provided(value) => value
                     },
      revisionnumber = revisionnumber match {
                         case Defaulted.UseDefault => revisionnumberDefault
                         case Defaulted.Provided(value) => value
                       },
      orderdate = orderdate match {
                    case Defaulted.UseDefault => orderdateDefault
                    case Defaulted.Provided(value) => value
                  },
      status = status match {
                 case Defaulted.UseDefault => statusDefault
                 case Defaulted.Provided(value) => value
               },
      onlineorderflag = onlineorderflag match {
                          case Defaulted.UseDefault => onlineorderflagDefault
                          case Defaulted.Provided(value) => value
                        },
      subtotal = subtotal match {
                   case Defaulted.UseDefault => subtotalDefault
                   case Defaulted.Provided(value) => value
                 },
      taxamt = taxamt match {
                 case Defaulted.UseDefault => taxamtDefault
                 case Defaulted.Provided(value) => value
               },
      freight = freight match {
                  case Defaulted.UseDefault => freightDefault
                  case Defaulted.Provided(value) => value
                },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object SalesorderheaderRowUnsaved {
  implicit lazy val decoder: Decoder[SalesorderheaderRowUnsaved] = Decoder.instanceTry[SalesorderheaderRowUnsaved]((c: HCursor) =>
    Try {
      def orThrow[R](either: Either[DecodingFailure, R]): R = either match {
        case Left(err) => throw err
        case Right(r)  => r
      }
      SalesorderheaderRowUnsaved(
        duedate = orThrow(c.get("duedate")(TypoLocalDateTime.decoder)),
        shipdate = orThrow(c.get("shipdate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        purchaseordernumber = orThrow(c.get("purchaseordernumber")(Decoder.decodeOption(OrderNumber.decoder))),
        accountnumber = orThrow(c.get("accountnumber")(Decoder.decodeOption(AccountNumber.decoder))),
        customerid = orThrow(c.get("customerid")(CustomerId.decoder)),
        salespersonid = orThrow(c.get("salespersonid")(Decoder.decodeOption(BusinessentityId.decoder))),
        territoryid = orThrow(c.get("territoryid")(Decoder.decodeOption(SalesterritoryId.decoder))),
        billtoaddressid = orThrow(c.get("billtoaddressid")(AddressId.decoder)),
        shiptoaddressid = orThrow(c.get("shiptoaddressid")(AddressId.decoder)),
        shipmethodid = orThrow(c.get("shipmethodid")(ShipmethodId.decoder)),
        creditcardid = orThrow(c.get("creditcardid")(Decoder.decodeOption(CustomCreditcardId.decoder))),
        creditcardapprovalcode = orThrow(c.get("creditcardapprovalcode")(Decoder.decodeOption(Decoder.decodeString))),
        currencyrateid = orThrow(c.get("currencyrateid")(Decoder.decodeOption(CurrencyrateId.decoder))),
        totaldue = orThrow(c.get("totaldue")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        comment = orThrow(c.get("comment")(Decoder.decodeOption(Decoder.decodeString))),
        salesorderid = orThrow(c.get("salesorderid")(Defaulted.decoder(SalesorderheaderId.decoder))),
        revisionnumber = orThrow(c.get("revisionnumber")(Defaulted.decoder(Decoder.decodeInt))),
        orderdate = orThrow(c.get("orderdate")(Defaulted.decoder(TypoLocalDateTime.decoder))),
        status = orThrow(c.get("status")(Defaulted.decoder(Decoder.decodeInt))),
        onlineorderflag = orThrow(c.get("onlineorderflag")(Defaulted.decoder(Flag.decoder))),
        subtotal = orThrow(c.get("subtotal")(Defaulted.decoder(Decoder.decodeBigDecimal))),
        taxamt = orThrow(c.get("taxamt")(Defaulted.decoder(Decoder.decodeBigDecimal))),
        freight = orThrow(c.get("freight")(Defaulted.decoder(Decoder.decodeBigDecimal))),
        rowguid = orThrow(c.get("rowguid")(Defaulted.decoder(Decoder.decodeUUID))),
        modifieddate = orThrow(c.get("modifieddate")(Defaulted.decoder(TypoLocalDateTime.decoder)))
      )
    }
  )
  implicit lazy val encoder: Encoder[SalesorderheaderRowUnsaved] = Encoder[SalesorderheaderRowUnsaved](row =>
    Json.obj(
      "duedate" -> TypoLocalDateTime.encoder.apply(row.duedate),
      "shipdate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.shipdate),
      "purchaseordernumber" -> Encoder.encodeOption(OrderNumber.encoder).apply(row.purchaseordernumber),
      "accountnumber" -> Encoder.encodeOption(AccountNumber.encoder).apply(row.accountnumber),
      "customerid" -> CustomerId.encoder.apply(row.customerid),
      "salespersonid" -> Encoder.encodeOption(BusinessentityId.encoder).apply(row.salespersonid),
      "territoryid" -> Encoder.encodeOption(SalesterritoryId.encoder).apply(row.territoryid),
      "billtoaddressid" -> AddressId.encoder.apply(row.billtoaddressid),
      "shiptoaddressid" -> AddressId.encoder.apply(row.shiptoaddressid),
      "shipmethodid" -> ShipmethodId.encoder.apply(row.shipmethodid),
      "creditcardid" -> Encoder.encodeOption(CustomCreditcardId.encoder).apply(row.creditcardid),
      "creditcardapprovalcode" -> Encoder.encodeOption(Encoder.encodeString).apply(row.creditcardapprovalcode),
      "currencyrateid" -> Encoder.encodeOption(CurrencyrateId.encoder).apply(row.currencyrateid),
      "totaldue" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.totaldue),
      "comment" -> Encoder.encodeOption(Encoder.encodeString).apply(row.comment),
      "salesorderid" -> Defaulted.encoder(SalesorderheaderId.encoder).apply(row.salesorderid),
      "revisionnumber" -> Defaulted.encoder(Encoder.encodeInt).apply(row.revisionnumber),
      "orderdate" -> Defaulted.encoder(TypoLocalDateTime.encoder).apply(row.orderdate),
      "status" -> Defaulted.encoder(Encoder.encodeInt).apply(row.status),
      "onlineorderflag" -> Defaulted.encoder(Flag.encoder).apply(row.onlineorderflag),
      "subtotal" -> Defaulted.encoder(Encoder.encodeBigDecimal).apply(row.subtotal),
      "taxamt" -> Defaulted.encoder(Encoder.encodeBigDecimal).apply(row.taxamt),
      "freight" -> Defaulted.encoder(Encoder.encodeBigDecimal).apply(row.freight),
      "rowguid" -> Defaulted.encoder(Encoder.encodeUUID).apply(row.rowguid),
      "modifieddate" -> Defaulted.encoder(TypoLocalDateTime.encoder).apply(row.modifieddate)
    )
  )
}
