/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pmpdc

import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PmpdcRow(
  /** Points to [[production.productmodelproductdescriptionculture.ProductmodelproductdescriptioncultureRow.productmodelid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pmpdc","column_name":"productmodelid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productmodelid: Option[ProductmodelId],
  /** Points to [[production.productmodelproductdescriptionculture.ProductmodelproductdescriptioncultureRow.productdescriptionid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pmpdc","column_name":"productdescriptionid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productdescriptionid: Option[ProductdescriptionId],
  /** Points to [[production.productmodelproductdescriptionculture.ProductmodelproductdescriptioncultureRow.cultureid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pmpdc","column_name":"cultureid","ordinal_position":3,"is_nullable":"YES","data_type":"character","character_maximum_length":6,"character_octet_length":24,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  cultureid: Option[CultureId],
  /** Points to [[production.productmodelproductdescriptionculture.ProductmodelproductdescriptioncultureRow.modifieddate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pmpdc","column_name":"modifieddate","ordinal_position":4,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Option[LocalDateTime]
)

object PmpdcRow {
  implicit val oFormat: OFormat[PmpdcRow] = new OFormat[PmpdcRow]{
    override def writes(o: PmpdcRow): JsObject =
      Json.obj(
        "productmodelid" -> o.productmodelid,
        "productdescriptionid" -> o.productdescriptionid,
        "cultureid" -> o.cultureid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PmpdcRow] = {
      JsResult.fromTry(
        Try(
          PmpdcRow(
            productmodelid = json.\("productmodelid").toOption.map(_.as[ProductmodelId]),
            productdescriptionid = json.\("productdescriptionid").toOption.map(_.as[ProductdescriptionId]),
            cultureid = json.\("cultureid").toOption.map(_.as[CultureId]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
