/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pm

import adventureworks.production.productmodel.ProductmodelId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PmRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: Option[ProductmodelId] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"productmodelid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"name","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.catalogdescription]] */
  catalogdescription: Option[/* xml */ String] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"catalogdescription","ordinal_position":4,"is_nullable":"YES","data_type":"xml","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"xml","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.instructions]] */
  instructions: Option[/* xml */ String] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"instructions","ordinal_position":5,"is_nullable":"YES","data_type":"xml","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"xml","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.rowguid]] */
  rowguid: Option[UUID] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"rowguid","ordinal_position":6,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productmodel.ProductmodelRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pm","column_name":"modifieddate","ordinal_position":7,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PmRow {
  def rowParser(prefix: String): RowParser[PmRow] = { row =>
    Success(
      PmRow(
        id = row[Option[Int]](prefix + "id"),
        productmodelid = row[Option[ProductmodelId]](prefix + "productmodelid"),
        name = row[Option[String]](prefix + "name"),
        catalogdescription = row[Option[/* xml */ String]](prefix + "catalogdescription"),
        instructions = row[Option[/* xml */ String]](prefix + "instructions"),
        rowguid = row[Option[UUID]](prefix + "rowguid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[PmRow] = new OFormat[PmRow]{
    override def writes(o: PmRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "productmodelid" -> o.productmodelid,
        "name" -> o.name,
        "catalogdescription" -> o.catalogdescription,
        "instructions" -> o.instructions,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PmRow] = {
      JsResult.fromTry(
        Try(
          PmRow(
            id = json.\("id").toOption.map(_.as[Int]),
            productmodelid = json.\("productmodelid").toOption.map(_.as[ProductmodelId]),
            name = json.\("name").toOption.map(_.as[String]),
            catalogdescription = json.\("catalogdescription").toOption.map(_.as[/* xml */ String]),
            instructions = json.\("instructions").toOption.map(_.as[/* xml */ String]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
