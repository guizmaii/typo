/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.person.businessentity.BusinessentityId
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

case class PersonRow(
  /** Points to [[businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"businessentityid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  persontype: /* bpchar */ String /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"persontype","ordinal_position":2,"is_nullable":"NO","data_type":"character","character_maximum_length":2,"character_octet_length":8,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  namestyle: Boolean /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"namestyle","ordinal_position":3,"column_default":"false","is_nullable":"NO","data_type":"boolean","domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"NameStyle","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  title: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"title","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":8,"character_octet_length":32,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  firstname: String /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"firstname","ordinal_position":5,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  middlename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"middlename","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  lastname: String /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"lastname","ordinal_position":7,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  suffix: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"suffix","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":10,"character_octet_length":40,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  emailpromotion: Int /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"emailpromotion","ordinal_position":9,"column_default":"0","is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  additionalcontactinfo: Option[/* xml */ String] /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"additionalcontactinfo","ordinal_position":10,"is_nullable":"YES","data_type":"xml","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"xml","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  demographics: Option[/* xml */ String] /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"demographics","ordinal_position":11,"is_nullable":"YES","data_type":"xml","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"xml","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rowguid: UUID /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"rowguid","ordinal_position":12,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"person","column_name":"modifieddate","ordinal_position":13,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PersonRow {
  def rowParser(prefix: String): RowParser[PersonRow] = { row =>
    Success(
      PersonRow(
        businessentityid = row[BusinessentityId](prefix + "businessentityid"),
        persontype = row[/* bpchar */ String](prefix + "persontype"),
        namestyle = row[Boolean](prefix + "namestyle"),
        title = row[Option[String]](prefix + "title"),
        firstname = row[String](prefix + "firstname"),
        middlename = row[Option[String]](prefix + "middlename"),
        lastname = row[String](prefix + "lastname"),
        suffix = row[Option[String]](prefix + "suffix"),
        emailpromotion = row[Int](prefix + "emailpromotion"),
        additionalcontactinfo = row[Option[/* xml */ String]](prefix + "additionalcontactinfo"),
        demographics = row[Option[/* xml */ String]](prefix + "demographics"),
        rowguid = row[UUID](prefix + "rowguid"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[PersonRow] = new OFormat[PersonRow]{
    override def writes(o: PersonRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "persontype" -> o.persontype,
        "namestyle" -> o.namestyle,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "emailpromotion" -> o.emailpromotion,
        "additionalcontactinfo" -> o.additionalcontactinfo,
        "demographics" -> o.demographics,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PersonRow] = {
      JsResult.fromTry(
        Try(
          PersonRow(
            businessentityid = json.\("businessentityid").as[BusinessentityId],
            persontype = json.\("persontype").as[/* bpchar */ String],
            namestyle = json.\("namestyle").as[Boolean],
            title = json.\("title").toOption.map(_.as[String]),
            firstname = json.\("firstname").as[String],
            middlename = json.\("middlename").toOption.map(_.as[String]),
            lastname = json.\("lastname").as[String],
            suffix = json.\("suffix").toOption.map(_.as[String]),
            emailpromotion = json.\("emailpromotion").as[Int],
            additionalcontactinfo = json.\("additionalcontactinfo").toOption.map(_.as[/* xml */ String]),
            demographics = json.\("demographics").toOption.map(_.as[/* xml */ String]),
            rowguid = json.\("rowguid").as[UUID],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
