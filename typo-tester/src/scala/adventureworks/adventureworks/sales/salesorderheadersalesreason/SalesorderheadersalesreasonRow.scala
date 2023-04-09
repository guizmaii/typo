/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheadersalesreason

import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.salesreason.SalesreasonId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class SalesorderheadersalesreasonRow(
  /** Primary key. Foreign key to SalesOrderHeader.SalesOrderID.
      Points to [[salesorderheader.SalesorderheaderRow.salesorderid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderheadersalesreason","column_name":"salesorderid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  salesorderid: SalesorderheaderId,
  /** Primary key. Foreign key to SalesReason.SalesReasonID.
      Points to [[salesreason.SalesreasonRow.salesreasonid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderheadersalesreason","column_name":"salesreasonid","ordinal_position":2,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  salesreasonid: SalesreasonId,
  /** debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderheadersalesreason","column_name":"modifieddate","ordinal_position":3,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: LocalDateTime
){
   val compositeId: SalesorderheadersalesreasonId = SalesorderheadersalesreasonId(salesorderid, salesreasonid)
 }

object SalesorderheadersalesreasonRow {
  implicit val oFormat: OFormat[SalesorderheadersalesreasonRow] = new OFormat[SalesorderheadersalesreasonRow]{
    override def writes(o: SalesorderheadersalesreasonRow): JsObject =
      Json.obj(
        "salesorderid" -> o.salesorderid,
        "salesreasonid" -> o.salesreasonid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SalesorderheadersalesreasonRow] = {
      JsResult.fromTry(
        Try(
          SalesorderheadersalesreasonRow(
            salesorderid = json.\("salesorderid").as[SalesorderheaderId],
            salesreasonid = json.\("salesreasonid").as[SalesreasonId],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
