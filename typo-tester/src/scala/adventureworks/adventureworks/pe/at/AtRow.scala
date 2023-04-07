/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package at

import adventureworks.person.addresstype.AddresstypeId
import adventureworks.public.Name
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

case class AtRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"at","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.addresstype.AddresstypeRow.addresstypeid]] */
  addresstypeid: Option[AddresstypeId] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"at","column_name":"addresstypeid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.addresstype.AddresstypeRow.name]] */
  name: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"at","column_name":"name","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.addresstype.AddresstypeRow.rowguid]] */
  rowguid: Option[UUID] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"at","column_name":"rowguid","ordinal_position":4,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.addresstype.AddresstypeRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"at","column_name":"modifieddate","ordinal_position":5,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object AtRow {
  def rowParser(prefix: String): RowParser[AtRow] = { row =>
    Success(
      AtRow(
        id = row[Option[Int]](prefix + "id"),
        addresstypeid = row[Option[AddresstypeId]](prefix + "addresstypeid"),
        name = row[Option[Name]](prefix + "name"),
        rowguid = row[Option[UUID]](prefix + "rowguid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[AtRow] = new OFormat[AtRow]{
    override def writes(o: AtRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "addresstypeid" -> o.addresstypeid,
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[AtRow] = {
      JsResult.fromTry(
        Try(
          AtRow(
            id = json.\("id").toOption.map(_.as[Int]),
            addresstypeid = json.\("addresstypeid").toOption.map(_.as[AddresstypeId]),
            name = json.\("name").toOption.map(_.as[Name]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
