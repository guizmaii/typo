/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package a

import adventureworks.person.address.AddressId
import adventureworks.person.stateprovince.StateprovinceId
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ARow(
  /** debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  id: Option[Int],
  /** Points to [[person.address.AddressRow.addressid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"addressid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  addressid: Option[AddressId],
  /** Points to [[person.address.AddressRow.addressline1]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"addressline1","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  addressline1: Option[String],
  /** Points to [[person.address.AddressRow.addressline2]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"addressline2","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  addressline2: Option[String],
  /** Points to [[person.address.AddressRow.city]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"city","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":30,"character_octet_length":120,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  city: Option[String],
  /** Points to [[person.address.AddressRow.stateprovinceid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"stateprovinceid","ordinal_position":6,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  stateprovinceid: Option[StateprovinceId],
  /** Points to [[person.address.AddressRow.postalcode]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"postalcode","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  postalcode: Option[String],
  /** Points to [[person.address.AddressRow.spatiallocation]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"spatiallocation","ordinal_position":8,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  spatiallocation: Option[Byte],
  /** Points to [[person.address.AddressRow.rowguid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"rowguid","ordinal_position":9,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Option[UUID],
  /** Points to [[person.address.AddressRow.modifieddate]]
      debug: {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"a","column_name":"modifieddate","ordinal_position":10,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Option[LocalDateTime]
)

object ARow {
  implicit val oFormat: OFormat[ARow] = new OFormat[ARow]{
    override def writes(o: ARow): JsObject =
      Json.obj(
        "id" -> o.id,
        "addressid" -> o.addressid,
        "addressline1" -> o.addressline1,
        "addressline2" -> o.addressline2,
        "city" -> o.city,
        "stateprovinceid" -> o.stateprovinceid,
        "postalcode" -> o.postalcode,
        "spatiallocation" -> o.spatiallocation,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ARow] = {
      JsResult.fromTry(
        Try(
          ARow(
            id = json.\("id").toOption.map(_.as[Int]),
            addressid = json.\("addressid").toOption.map(_.as[AddressId]),
            addressline1 = json.\("addressline1").toOption.map(_.as[String]),
            addressline2 = json.\("addressline2").toOption.map(_.as[String]),
            city = json.\("city").toOption.map(_.as[String]),
            stateprovinceid = json.\("stateprovinceid").toOption.map(_.as[StateprovinceId]),
            postalcode = json.\("postalcode").toOption.map(_.as[String]),
            spatiallocation = json.\("spatiallocation").toOption.map(_.as[Byte]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
