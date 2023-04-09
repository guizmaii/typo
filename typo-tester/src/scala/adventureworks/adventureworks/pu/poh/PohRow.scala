/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package poh

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import adventureworks.purchasing.shipmethod.ShipmethodId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PohRow(
  /** debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  id: Option[Int],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.purchaseorderid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"purchaseorderid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  purchaseorderid: Option[PurchaseorderheaderId],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.revisionnumber]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"revisionnumber","ordinal_position":3,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  revisionnumber: Option[Int],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.status]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"status","ordinal_position":4,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  status: Option[Int],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.employeeid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"employeeid","ordinal_position":5,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  employeeid: Option[BusinessentityId],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.vendorid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"vendorid","ordinal_position":6,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  vendorid: Option[BusinessentityId],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.shipmethodid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"shipmethodid","ordinal_position":7,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  shipmethodid: Option[ShipmethodId],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.orderdate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"orderdate","ordinal_position":8,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  orderdate: Option[LocalDateTime],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.shipdate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"shipdate","ordinal_position":9,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  shipdate: Option[LocalDateTime],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.subtotal]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"subtotal","ordinal_position":10,"is_nullable":"YES","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  subtotal: Option[BigDecimal],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.taxamt]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"taxamt","ordinal_position":11,"is_nullable":"YES","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  taxamt: Option[BigDecimal],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.freight]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"freight","ordinal_position":12,"is_nullable":"YES","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  freight: Option[BigDecimal],
  /** Points to [[purchasing.purchaseorderheader.PurchaseorderheaderRow.modifieddate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"poh","column_name":"modifieddate","ordinal_position":13,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Option[LocalDateTime]
)

object PohRow {
  implicit val oFormat: OFormat[PohRow] = new OFormat[PohRow]{
    override def writes(o: PohRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "purchaseorderid" -> o.purchaseorderid,
        "revisionnumber" -> o.revisionnumber,
        "status" -> o.status,
        "employeeid" -> o.employeeid,
        "vendorid" -> o.vendorid,
        "shipmethodid" -> o.shipmethodid,
        "orderdate" -> o.orderdate,
        "shipdate" -> o.shipdate,
        "subtotal" -> o.subtotal,
        "taxamt" -> o.taxamt,
        "freight" -> o.freight,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PohRow] = {
      JsResult.fromTry(
        Try(
          PohRow(
            id = json.\("id").toOption.map(_.as[Int]),
            purchaseorderid = json.\("purchaseorderid").toOption.map(_.as[PurchaseorderheaderId]),
            revisionnumber = json.\("revisionnumber").toOption.map(_.as[Int]),
            status = json.\("status").toOption.map(_.as[Int]),
            employeeid = json.\("employeeid").toOption.map(_.as[BusinessentityId]),
            vendorid = json.\("vendorid").toOption.map(_.as[BusinessentityId]),
            shipmethodid = json.\("shipmethodid").toOption.map(_.as[ShipmethodId]),
            orderdate = json.\("orderdate").toOption.map(_.as[LocalDateTime]),
            shipdate = json.\("shipdate").toOption.map(_.as[LocalDateTime]),
            subtotal = json.\("subtotal").toOption.map(_.as[BigDecimal]),
            taxamt = json.\("taxamt").toOption.map(_.as[BigDecimal]),
            freight = json.\("freight").toOption.map(_.as[BigDecimal]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
