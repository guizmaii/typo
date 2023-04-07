/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodelproductdescriptionculture

import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductmodelproductdescriptioncultureRow(
  /** Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: ProductmodelId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelproductdescriptionculture","column_name":"productmodelid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[productdescription.ProductdescriptionRow.productdescriptionid]] */
  productdescriptionid: ProductdescriptionId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelproductdescriptionculture","column_name":"productdescriptionid","ordinal_position":2,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[culture.CultureRow.cultureid]] */
  cultureid: CultureId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelproductdescriptionculture","column_name":"cultureid","ordinal_position":3,"is_nullable":"NO","data_type":"character","character_maximum_length":6,"character_octet_length":24,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelproductdescriptionculture","column_name":"modifieddate","ordinal_position":4,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
){
   val compositeId: ProductmodelproductdescriptioncultureId = ProductmodelproductdescriptioncultureId(productmodelid, productdescriptionid, cultureid)
 }

object ProductmodelproductdescriptioncultureRow {
  def rowParser(prefix: String): RowParser[ProductmodelproductdescriptioncultureRow] = { row =>
    Success(
      ProductmodelproductdescriptioncultureRow(
        productmodelid = row[ProductmodelId](prefix + "productmodelid"),
        productdescriptionid = row[ProductdescriptionId](prefix + "productdescriptionid"),
        cultureid = row[CultureId](prefix + "cultureid"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[ProductmodelproductdescriptioncultureRow] = new OFormat[ProductmodelproductdescriptioncultureRow]{
    override def writes(o: ProductmodelproductdescriptioncultureRow): JsObject =
      Json.obj(
        "productmodelid" -> o.productmodelid,
        "productdescriptionid" -> o.productdescriptionid,
        "cultureid" -> o.cultureid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductmodelproductdescriptioncultureRow] = {
      JsResult.fromTry(
        Try(
          ProductmodelproductdescriptioncultureRow(
            productmodelid = json.\("productmodelid").as[ProductmodelId],
            productdescriptionid = json.\("productdescriptionid").as[ProductdescriptionId],
            cultureid = json.\("cultureid").as[CultureId],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
