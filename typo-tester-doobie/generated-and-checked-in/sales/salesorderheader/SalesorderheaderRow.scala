/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

import adventureworks.person.address.AddressId
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.AccountNumber
import adventureworks.public.Flag
import adventureworks.public.OrderNumber
import adventureworks.purchasing.shipmethod.ShipmethodId
import adventureworks.sales.creditcard.CreditcardId
import adventureworks.sales.currencyrate.CurrencyrateId
import adventureworks.sales.customer.CustomerId
import adventureworks.sales.salesterritory.SalesterritoryId
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

case class SalesorderheaderRow(
  /** Primary key. */
  salesorderid: SalesorderheaderId,
  /** Incremental number to track changes to the sales order over time. */
  revisionnumber: Int,
  /** Dates the sales order was created. */
  orderdate: LocalDateTime,
  /** Date the order is due to the customer. */
  duedate: LocalDateTime,
  /** Date the order was shipped to the customer. */
  shipdate: Option[LocalDateTime],
  /** Order current status. 1 = In process; 2 = Approved; 3 = Backordered; 4 = Rejected; 5 = Shipped; 6 = Cancelled */
  status: Int,
  /** 0 = Order placed by sales person. 1 = Order placed online by customer. */
  onlineorderflag: Flag,
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
  creditcardid: Option[CreditcardId],
  /** Approval code provided by the credit card company. */
  creditcardapprovalcode: Option[/* max 15 chars */ String],
  /** Currency exchange rate used. Foreign key to CurrencyRate.CurrencyRateID.
      Points to [[currencyrate.CurrencyrateRow.currencyrateid]] */
  currencyrateid: Option[CurrencyrateId],
  /** Sales subtotal. Computed as SUM(SalesOrderDetail.LineTotal)for the appropriate SalesOrderID. */
  subtotal: BigDecimal,
  /** Tax amount. */
  taxamt: BigDecimal,
  /** Shipping cost. */
  freight: BigDecimal,
  /** Total due from customer. Computed as Subtotal + TaxAmt + Freight. */
  totaldue: Option[BigDecimal],
  /** Sales representative comments. */
  comment: Option[/* max 128 chars */ String],
  rowguid: UUID,
  modifieddate: LocalDateTime
)

object SalesorderheaderRow {
  implicit val decoder: Decoder[SalesorderheaderRow] =
    (c: HCursor) =>
      for {
        salesorderid <- c.downField("salesorderid").as[SalesorderheaderId]
        revisionnumber <- c.downField("revisionnumber").as[Int]
        orderdate <- c.downField("orderdate").as[LocalDateTime]
        duedate <- c.downField("duedate").as[LocalDateTime]
        shipdate <- c.downField("shipdate").as[Option[LocalDateTime]]
        status <- c.downField("status").as[Int]
        onlineorderflag <- c.downField("onlineorderflag").as[Flag]
        purchaseordernumber <- c.downField("purchaseordernumber").as[Option[OrderNumber]]
        accountnumber <- c.downField("accountnumber").as[Option[AccountNumber]]
        customerid <- c.downField("customerid").as[CustomerId]
        salespersonid <- c.downField("salespersonid").as[Option[BusinessentityId]]
        territoryid <- c.downField("territoryid").as[Option[SalesterritoryId]]
        billtoaddressid <- c.downField("billtoaddressid").as[AddressId]
        shiptoaddressid <- c.downField("shiptoaddressid").as[AddressId]
        shipmethodid <- c.downField("shipmethodid").as[ShipmethodId]
        creditcardid <- c.downField("creditcardid").as[Option[CreditcardId]]
        creditcardapprovalcode <- c.downField("creditcardapprovalcode").as[Option[/* max 15 chars */ String]]
        currencyrateid <- c.downField("currencyrateid").as[Option[CurrencyrateId]]
        subtotal <- c.downField("subtotal").as[BigDecimal]
        taxamt <- c.downField("taxamt").as[BigDecimal]
        freight <- c.downField("freight").as[BigDecimal]
        totaldue <- c.downField("totaldue").as[Option[BigDecimal]]
        comment <- c.downField("comment").as[Option[/* max 128 chars */ String]]
        rowguid <- c.downField("rowguid").as[UUID]
        modifieddate <- c.downField("modifieddate").as[LocalDateTime]
      } yield SalesorderheaderRow(salesorderid, revisionnumber, orderdate, duedate, shipdate, status, onlineorderflag, purchaseordernumber, accountnumber, customerid, salespersonid, territoryid, billtoaddressid, shiptoaddressid, shipmethodid, creditcardid, creditcardapprovalcode, currencyrateid, subtotal, taxamt, freight, totaldue, comment, rowguid, modifieddate)
  implicit val encoder: Encoder[SalesorderheaderRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "salesorderid" := row.salesorderid,
        "revisionnumber" := row.revisionnumber,
        "orderdate" := row.orderdate,
        "duedate" := row.duedate,
        "shipdate" := row.shipdate,
        "status" := row.status,
        "onlineorderflag" := row.onlineorderflag,
        "purchaseordernumber" := row.purchaseordernumber,
        "accountnumber" := row.accountnumber,
        "customerid" := row.customerid,
        "salespersonid" := row.salespersonid,
        "territoryid" := row.territoryid,
        "billtoaddressid" := row.billtoaddressid,
        "shiptoaddressid" := row.shiptoaddressid,
        "shipmethodid" := row.shipmethodid,
        "creditcardid" := row.creditcardid,
        "creditcardapprovalcode" := row.creditcardapprovalcode,
        "currencyrateid" := row.currencyrateid,
        "subtotal" := row.subtotal,
        "taxamt" := row.taxamt,
        "freight" := row.freight,
        "totaldue" := row.totaldue,
        "comment" := row.comment,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate
      )}
}
