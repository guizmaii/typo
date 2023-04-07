/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package w

import adventureworks.production.product.ProductId
import adventureworks.production.scrapreason.ScrapreasonId
import adventureworks.production.workorder.WorkorderId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class WRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.workorderid]] */
  workorderid: Option[WorkorderId] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"workorderid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.productid]] */
  productid: Option[ProductId] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"productid","ordinal_position":3,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.orderqty]] */
  orderqty: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"orderqty","ordinal_position":4,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.scrappedqty]] */
  scrappedqty: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"scrappedqty","ordinal_position":5,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.startdate]] */
  startdate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"startdate","ordinal_position":6,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.enddate]] */
  enddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"enddate","ordinal_position":7,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.duedate]] */
  duedate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"duedate","ordinal_position":8,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.scrapreasonid]] */
  scrapreasonid: Option[ScrapreasonId] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"scrapreasonid","ordinal_position":9,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.workorder.WorkorderRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"w","column_name":"modifieddate","ordinal_position":10,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object WRow {
  def rowParser(prefix: String): RowParser[WRow] = { row =>
    Success(
      WRow(
        id = row[Option[Int]](prefix + "id"),
        workorderid = row[Option[WorkorderId]](prefix + "workorderid"),
        productid = row[Option[ProductId]](prefix + "productid"),
        orderqty = row[Option[Int]](prefix + "orderqty"),
        scrappedqty = row[Option[Int]](prefix + "scrappedqty"),
        startdate = row[Option[LocalDateTime]](prefix + "startdate"),
        enddate = row[Option[LocalDateTime]](prefix + "enddate"),
        duedate = row[Option[LocalDateTime]](prefix + "duedate"),
        scrapreasonid = row[Option[ScrapreasonId]](prefix + "scrapreasonid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[WRow] = new OFormat[WRow]{
    override def writes(o: WRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "workorderid" -> o.workorderid,
        "productid" -> o.productid,
        "orderqty" -> o.orderqty,
        "scrappedqty" -> o.scrappedqty,
        "startdate" -> o.startdate,
        "enddate" -> o.enddate,
        "duedate" -> o.duedate,
        "scrapreasonid" -> o.scrapreasonid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[WRow] = {
      JsResult.fromTry(
        Try(
          WRow(
            id = json.\("id").toOption.map(_.as[Int]),
            workorderid = json.\("workorderid").toOption.map(_.as[WorkorderId]),
            productid = json.\("productid").toOption.map(_.as[ProductId]),
            orderqty = json.\("orderqty").toOption.map(_.as[Int]),
            scrappedqty = json.\("scrappedqty").toOption.map(_.as[Int]),
            startdate = json.\("startdate").toOption.map(_.as[LocalDateTime]),
            enddate = json.\("enddate").toOption.map(_.as[LocalDateTime]),
            duedate = json.\("duedate").toOption.map(_.as[LocalDateTime]),
            scrapreasonid = json.\("scrapreasonid").toOption.map(_.as[ScrapreasonId]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
