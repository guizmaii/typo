/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pp

import adventureworks.person.businessentity.BusinessentityId
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

case class PpRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pp","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.personphone.PersonphoneRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pp","column_name":"businessentityid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.personphone.PersonphoneRow.phonenumber]] */
  phonenumber: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pp","column_name":"phonenumber","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":25,"character_octet_length":100,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Phone","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.personphone.PersonphoneRow.phonenumbertypeid]] */
  phonenumbertypeid: Option[PhonenumbertypeId] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pp","column_name":"phonenumbertypeid","ordinal_position":4,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[person.personphone.PersonphoneRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pe","table_name":"pp","column_name":"modifieddate","ordinal_position":5,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PpRow {
  def rowParser(prefix: String): RowParser[PpRow] = { row =>
    Success(
      PpRow(
        id = row[Option[Int]](prefix + "id"),
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        phonenumber = row[Option[String]](prefix + "phonenumber"),
        phonenumbertypeid = row[Option[PhonenumbertypeId]](prefix + "phonenumbertypeid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[PpRow] = new OFormat[PpRow]{
    override def writes(o: PpRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "businessentityid" -> o.businessentityid,
        "phonenumber" -> o.phonenumber,
        "phonenumbertypeid" -> o.phonenumbertypeid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PpRow] = {
      JsResult.fromTry(
        Try(
          PpRow(
            id = json.\("id").toOption.map(_.as[Int]),
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            phonenumber = json.\("phonenumber").toOption.map(_.as[String]),
            phonenumbertypeid = json.\("phonenumbertypeid").toOption.map(_.as[PhonenumbertypeId]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
