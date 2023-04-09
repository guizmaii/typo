/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package psc

import adventureworks.production.productcategory.ProductcategoryId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PscRow(
  /** debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  id: Option[Int],
  /** Points to [[production.productsubcategory.ProductsubcategoryRow.productsubcategoryid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"productsubcategoryid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productsubcategoryid: Option[ProductsubcategoryId],
  /** Points to [[production.productsubcategory.ProductsubcategoryRow.productcategoryid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"productcategoryid","ordinal_position":3,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productcategoryid: Option[ProductcategoryId],
  /** Points to [[production.productsubcategory.ProductsubcategoryRow.name]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"name","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  name: Option[Name],
  /** Points to [[production.productsubcategory.ProductsubcategoryRow.rowguid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"rowguid","ordinal_position":5,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Option[UUID],
  /** Points to [[production.productsubcategory.ProductsubcategoryRow.modifieddate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"psc","column_name":"modifieddate","ordinal_position":6,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Option[LocalDateTime]
)

object PscRow {
  implicit val oFormat: OFormat[PscRow] = new OFormat[PscRow]{
    override def writes(o: PscRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "productsubcategoryid" -> o.productsubcategoryid,
        "productcategoryid" -> o.productcategoryid,
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PscRow] = {
      JsResult.fromTry(
        Try(
          PscRow(
            id = json.\("id").toOption.map(_.as[Int]),
            productsubcategoryid = json.\("productsubcategoryid").toOption.map(_.as[ProductsubcategoryId]),
            productcategoryid = json.\("productcategoryid").toOption.map(_.as[ProductcategoryId]),
            name = json.\("name").toOption.map(_.as[Name]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
