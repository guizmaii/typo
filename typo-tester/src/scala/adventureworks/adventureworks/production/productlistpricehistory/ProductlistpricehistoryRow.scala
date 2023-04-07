/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productlistpricehistory

import adventureworks.production.product.ProductId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductlistpricehistoryRow(
  /** Points to [[product.ProductRow.productid]] */
  productid: ProductId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productlistpricehistory","column_name":"productid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  startdate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productlistpricehistory","column_name":"startdate","ordinal_position":2,"is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  enddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productlistpricehistory","column_name":"enddate","ordinal_position":3,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  listprice: BigDecimal /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productlistpricehistory","column_name":"listprice","ordinal_position":4,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productlistpricehistory","column_name":"modifieddate","ordinal_position":5,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
){
   val compositeId: ProductlistpricehistoryId = ProductlistpricehistoryId(productid, startdate)
 }

object ProductlistpricehistoryRow {
  def rowParser(prefix: String): RowParser[ProductlistpricehistoryRow] = { row =>
    Success(
      ProductlistpricehistoryRow(
        productid = row[ProductId](prefix + "productid"),
        startdate = row[LocalDateTime](prefix + "startdate"),
        enddate = row[Option[LocalDateTime]](prefix + "enddate"),
        listprice = row[BigDecimal](prefix + "listprice"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[ProductlistpricehistoryRow] = new OFormat[ProductlistpricehistoryRow]{
    override def writes(o: ProductlistpricehistoryRow): JsObject =
      Json.obj(
        "productid" -> o.productid,
        "startdate" -> o.startdate,
        "enddate" -> o.enddate,
        "listprice" -> o.listprice,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductlistpricehistoryRow] = {
      JsResult.fromTry(
        Try(
          ProductlistpricehistoryRow(
            productid = json.\("productid").as[ProductId],
            startdate = json.\("startdate").as[LocalDateTime],
            enddate = json.\("enddate").toOption.map(_.as[LocalDateTime]),
            listprice = json.\("listprice").as[BigDecimal],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
