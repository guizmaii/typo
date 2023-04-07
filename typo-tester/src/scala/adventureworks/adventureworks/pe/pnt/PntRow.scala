/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pnt

import adventureworks.person.phonenumbertype.PhonenumbertypeId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PntRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pnt","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.phonenumbertype.PhonenumbertypeRow.phonenumbertypeid]] */
  phonenumbertypeid: Option[PhonenumbertypeId] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pnt","column_name":"phonenumbertypeid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.phonenumbertype.PhonenumbertypeRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pnt","column_name":"name","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.phonenumbertype.PhonenumbertypeRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pnt","column_name":"modifieddate","ordinal_position":4,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PntRow {
  def rowParser(prefix: String): RowParser[PntRow] = { row =>
    Success(
      PntRow(
        id = row[Option[Int]](prefix + "id"),
        phonenumbertypeid = row[Option[PhonenumbertypeId]](prefix + "phonenumbertypeid"),
        name = row[Option[String]](prefix + "name"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[PntRow] = new OFormat[PntRow]{
    override def writes(o: PntRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "phonenumbertypeid" -> o.phonenumbertypeid,
        "name" -> o.name,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PntRow] = {
      JsResult.fromTry(
        Try(
          PntRow(
            id = json.\("id").toOption.map(_.as[Int]),
            phonenumbertypeid = json.\("phonenumbertypeid").toOption.map(_.as[PhonenumbertypeId]),
            name = json.\("name").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
