/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vvendorwithcontacts

import adventureworks.person.businessentity.BusinessentityId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VvendorwithcontactsRow(
  /** Points to [[person.person.PersonRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"businessentityid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.contacttype.ContacttypeRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"name","ordinal_position":2,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  contacttype: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"contacttype","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.title]] */
  title: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"title","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":8,"character_octet_length":32,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.firstname]] */
  firstname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"firstname","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.middlename]] */
  middlename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"middlename","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.lastname]] */
  lastname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"lastname","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.suffix]] */
  suffix: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"suffix","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":10,"character_octet_length":40,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.personphone.PersonphoneRow.phonenumber]] */
  phonenumber: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"phonenumber","ordinal_position":9,"is_nullable":"YES","data_type":"character varying","character_maximum_length":25,"character_octet_length":100,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Phone","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  phonenumbertype: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"phonenumbertype","ordinal_position":10,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.emailaddress.EmailaddressRow.emailaddress]] */
  emailaddress: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"emailaddress","ordinal_position":11,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.emailpromotion]] */
  emailpromotion: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"purchasing","table_name":"vvendorwithcontacts","column_name":"emailpromotion","ordinal_position":12,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object VvendorwithcontactsRow {
  def rowParser(prefix: String): RowParser[VvendorwithcontactsRow] = { row =>
    Success(
      VvendorwithcontactsRow(
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        name = row[Option[String]](prefix + "name"),
        contacttype = row[Option[String]](prefix + "contacttype"),
        title = row[Option[String]](prefix + "title"),
        firstname = row[Option[String]](prefix + "firstname"),
        middlename = row[Option[String]](prefix + "middlename"),
        lastname = row[Option[String]](prefix + "lastname"),
        suffix = row[Option[String]](prefix + "suffix"),
        phonenumber = row[Option[String]](prefix + "phonenumber"),
        phonenumbertype = row[Option[String]](prefix + "phonenumbertype"),
        emailaddress = row[Option[String]](prefix + "emailaddress"),
        emailpromotion = row[Option[Int]](prefix + "emailpromotion")
      )
    )
  }

  implicit val oFormat: OFormat[VvendorwithcontactsRow] = new OFormat[VvendorwithcontactsRow]{
    override def writes(o: VvendorwithcontactsRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "name" -> o.name,
        "contacttype" -> o.contacttype,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "phonenumber" -> o.phonenumber,
        "phonenumbertype" -> o.phonenumbertype,
        "emailaddress" -> o.emailaddress,
        "emailpromotion" -> o.emailpromotion
      )
  
    override def reads(json: JsValue): JsResult[VvendorwithcontactsRow] = {
      JsResult.fromTry(
        Try(
          VvendorwithcontactsRow(
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            name = json.\("name").toOption.map(_.as[String]),
            contacttype = json.\("contacttype").toOption.map(_.as[String]),
            title = json.\("title").toOption.map(_.as[String]),
            firstname = json.\("firstname").toOption.map(_.as[String]),
            middlename = json.\("middlename").toOption.map(_.as[String]),
            lastname = json.\("lastname").toOption.map(_.as[String]),
            suffix = json.\("suffix").toOption.map(_.as[String]),
            phonenumber = json.\("phonenumber").toOption.map(_.as[String]),
            phonenumbertype = json.\("phonenumbertype").toOption.map(_.as[String]),
            emailaddress = json.\("emailaddress").toOption.map(_.as[String]),
            emailpromotion = json.\("emailpromotion").toOption.map(_.as[Int])
          )
        )
      )
    }
  }
}
