/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

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
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SalesorderheaderStructure[Row](val prefix: Option[String], val extract: Row => SalesorderheaderRow, val merge: (Row, SalesorderheaderRow) => Row)
  extends Relation[SalesorderheaderFields, SalesorderheaderRow, Row]
    with SalesorderheaderFields[Row] { outer =>

  override val salesorderid = new IdField[SalesorderheaderId, Row](prefix, "salesorderid", None, Some("int4"))(x => extract(x).salesorderid, (row, value) => merge(row, extract(row).copy(salesorderid = value)))
  override val revisionnumber = new Field[Int, Row](prefix, "revisionnumber", None, Some("int2"))(x => extract(x).revisionnumber, (row, value) => merge(row, extract(row).copy(revisionnumber = value)))
  override val orderdate = new Field[TypoLocalDateTime, Row](prefix, "orderdate", Some("text"), Some("timestamp"))(x => extract(x).orderdate, (row, value) => merge(row, extract(row).copy(orderdate = value)))
  override val duedate = new Field[TypoLocalDateTime, Row](prefix, "duedate", Some("text"), Some("timestamp"))(x => extract(x).duedate, (row, value) => merge(row, extract(row).copy(duedate = value)))
  override val shipdate = new OptField[TypoLocalDateTime, Row](prefix, "shipdate", Some("text"), Some("timestamp"))(x => extract(x).shipdate, (row, value) => merge(row, extract(row).copy(shipdate = value)))
  override val status = new Field[Int, Row](prefix, "status", None, Some("int2"))(x => extract(x).status, (row, value) => merge(row, extract(row).copy(status = value)))
  override val onlineorderflag = new Field[Flag, Row](prefix, "onlineorderflag", None, Some(""""public"."Flag""""))(x => extract(x).onlineorderflag, (row, value) => merge(row, extract(row).copy(onlineorderflag = value)))
  override val purchaseordernumber = new OptField[OrderNumber, Row](prefix, "purchaseordernumber", None, Some(""""public".OrderNumber"""))(x => extract(x).purchaseordernumber, (row, value) => merge(row, extract(row).copy(purchaseordernumber = value)))
  override val accountnumber = new OptField[AccountNumber, Row](prefix, "accountnumber", None, Some(""""public".AccountNumber"""))(x => extract(x).accountnumber, (row, value) => merge(row, extract(row).copy(accountnumber = value)))
  override val customerid = new Field[CustomerId, Row](prefix, "customerid", None, Some("int4"))(x => extract(x).customerid, (row, value) => merge(row, extract(row).copy(customerid = value)))
  override val salespersonid = new OptField[BusinessentityId, Row](prefix, "salespersonid", None, Some("int4"))(x => extract(x).salespersonid, (row, value) => merge(row, extract(row).copy(salespersonid = value)))
  override val territoryid = new OptField[SalesterritoryId, Row](prefix, "territoryid", None, Some("int4"))(x => extract(x).territoryid, (row, value) => merge(row, extract(row).copy(territoryid = value)))
  override val billtoaddressid = new Field[AddressId, Row](prefix, "billtoaddressid", None, Some("int4"))(x => extract(x).billtoaddressid, (row, value) => merge(row, extract(row).copy(billtoaddressid = value)))
  override val shiptoaddressid = new Field[AddressId, Row](prefix, "shiptoaddressid", None, Some("int4"))(x => extract(x).shiptoaddressid, (row, value) => merge(row, extract(row).copy(shiptoaddressid = value)))
  override val shipmethodid = new Field[ShipmethodId, Row](prefix, "shipmethodid", None, Some("int4"))(x => extract(x).shipmethodid, (row, value) => merge(row, extract(row).copy(shipmethodid = value)))
  override val creditcardid = new OptField[/* user-picked */ CustomCreditcardId, Row](prefix, "creditcardid", None, Some("int4"))(x => extract(x).creditcardid, (row, value) => merge(row, extract(row).copy(creditcardid = value)))
  override val creditcardapprovalcode = new OptField[/* max 15 chars */ String, Row](prefix, "creditcardapprovalcode", None, None)(x => extract(x).creditcardapprovalcode, (row, value) => merge(row, extract(row).copy(creditcardapprovalcode = value)))
  override val currencyrateid = new OptField[CurrencyrateId, Row](prefix, "currencyrateid", None, Some("int4"))(x => extract(x).currencyrateid, (row, value) => merge(row, extract(row).copy(currencyrateid = value)))
  override val subtotal = new Field[BigDecimal, Row](prefix, "subtotal", None, Some("numeric"))(x => extract(x).subtotal, (row, value) => merge(row, extract(row).copy(subtotal = value)))
  override val taxamt = new Field[BigDecimal, Row](prefix, "taxamt", None, Some("numeric"))(x => extract(x).taxamt, (row, value) => merge(row, extract(row).copy(taxamt = value)))
  override val freight = new Field[BigDecimal, Row](prefix, "freight", None, Some("numeric"))(x => extract(x).freight, (row, value) => merge(row, extract(row).copy(freight = value)))
  override val totaldue = new OptField[BigDecimal, Row](prefix, "totaldue", None, Some("numeric"))(x => extract(x).totaldue, (row, value) => merge(row, extract(row).copy(totaldue = value)))
  override val comment = new OptField[/* max 128 chars */ String, Row](prefix, "comment", None, None)(x => extract(x).comment, (row, value) => merge(row, extract(row).copy(comment = value)))
  override val rowguid = new Field[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new Field[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](salesorderid, revisionnumber, orderdate, duedate, shipdate, status, onlineorderflag, purchaseordernumber, accountnumber, customerid, salespersonid, territoryid, billtoaddressid, shiptoaddressid, shipmethodid, creditcardid, creditcardapprovalcode, currencyrateid, subtotal, taxamt, freight, totaldue, comment, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SalesorderheaderRow, merge: (NewRow, SalesorderheaderRow) => NewRow): SalesorderheaderStructure[NewRow] =
    new SalesorderheaderStructure(prefix, extract, merge)
}
