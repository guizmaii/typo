/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vemployee

import adventureworks.person.businessentity.BusinessentityId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VemployeeRow(
  /** Points to [[person.person.PersonRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"businessentityid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.title]] */
  title: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"title","ordinal_position":2,"is_nullable":"YES","data_type":"character varying","character_maximum_length":8,"character_octet_length":32,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.firstname]] */
  firstname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"firstname","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.middlename]] */
  middlename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"middlename","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.lastname]] */
  lastname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"lastname","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.suffix]] */
  suffix: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"suffix","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":10,"character_octet_length":40,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[employee.EmployeeRow.jobtitle]] */
  jobtitle: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"jobtitle","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.personphone.PersonphoneRow.phonenumber]] */
  phonenumber: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"phonenumber","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":25,"character_octet_length":100,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Phone","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  phonenumbertype: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"phonenumbertype","ordinal_position":9,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.emailaddress.EmailaddressRow.emailaddress]] */
  emailaddress: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"emailaddress","ordinal_position":10,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.emailpromotion]] */
  emailpromotion: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"emailpromotion","ordinal_position":11,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.addressline1]] */
  addressline1: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"addressline1","ordinal_position":12,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.addressline2]] */
  addressline2: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"addressline2","ordinal_position":13,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.city]] */
  city: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"city","ordinal_position":14,"is_nullable":"YES","data_type":"character varying","character_maximum_length":30,"character_octet_length":120,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"14","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  stateprovincename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"stateprovincename","ordinal_position":15,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"15","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.postalcode]] */
  postalcode: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"postalcode","ordinal_position":16,"is_nullable":"YES","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"16","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  countryregionname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"countryregionname","ordinal_position":17,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"17","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.additionalcontactinfo]] */
  additionalcontactinfo: Option[/* xml */ String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployee","column_name":"additionalcontactinfo","ordinal_position":18,"is_nullable":"YES","data_type":"xml","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"xml","dtd_identifier":"18","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object VemployeeRow {
  def rowParser(prefix: String): RowParser[VemployeeRow] = { row =>
    Success(
      VemployeeRow(
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        title = row[Option[String]](prefix + "title"),
        firstname = row[Option[String]](prefix + "firstname"),
        middlename = row[Option[String]](prefix + "middlename"),
        lastname = row[Option[String]](prefix + "lastname"),
        suffix = row[Option[String]](prefix + "suffix"),
        jobtitle = row[Option[String]](prefix + "jobtitle"),
        phonenumber = row[Option[String]](prefix + "phonenumber"),
        phonenumbertype = row[Option[String]](prefix + "phonenumbertype"),
        emailaddress = row[Option[String]](prefix + "emailaddress"),
        emailpromotion = row[Option[Int]](prefix + "emailpromotion"),
        addressline1 = row[Option[String]](prefix + "addressline1"),
        addressline2 = row[Option[String]](prefix + "addressline2"),
        city = row[Option[String]](prefix + "city"),
        stateprovincename = row[Option[String]](prefix + "stateprovincename"),
        postalcode = row[Option[String]](prefix + "postalcode"),
        countryregionname = row[Option[String]](prefix + "countryregionname"),
        additionalcontactinfo = row[Option[/* xml */ String]](prefix + "additionalcontactinfo")
      )
    )
  }

  implicit val oFormat: OFormat[VemployeeRow] = new OFormat[VemployeeRow]{
    override def writes(o: VemployeeRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "jobtitle" -> o.jobtitle,
        "phonenumber" -> o.phonenumber,
        "phonenumbertype" -> o.phonenumbertype,
        "emailaddress" -> o.emailaddress,
        "emailpromotion" -> o.emailpromotion,
        "addressline1" -> o.addressline1,
        "addressline2" -> o.addressline2,
        "city" -> o.city,
        "stateprovincename" -> o.stateprovincename,
        "postalcode" -> o.postalcode,
        "countryregionname" -> o.countryregionname,
        "additionalcontactinfo" -> o.additionalcontactinfo
      )
  
    override def reads(json: JsValue): JsResult[VemployeeRow] = {
      JsResult.fromTry(
        Try(
          VemployeeRow(
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            title = json.\("title").toOption.map(_.as[String]),
            firstname = json.\("firstname").toOption.map(_.as[String]),
            middlename = json.\("middlename").toOption.map(_.as[String]),
            lastname = json.\("lastname").toOption.map(_.as[String]),
            suffix = json.\("suffix").toOption.map(_.as[String]),
            jobtitle = json.\("jobtitle").toOption.map(_.as[String]),
            phonenumber = json.\("phonenumber").toOption.map(_.as[String]),
            phonenumbertype = json.\("phonenumbertype").toOption.map(_.as[String]),
            emailaddress = json.\("emailaddress").toOption.map(_.as[String]),
            emailpromotion = json.\("emailpromotion").toOption.map(_.as[Int]),
            addressline1 = json.\("addressline1").toOption.map(_.as[String]),
            addressline2 = json.\("addressline2").toOption.map(_.as[String]),
            city = json.\("city").toOption.map(_.as[String]),
            stateprovincename = json.\("stateprovincename").toOption.map(_.as[String]),
            postalcode = json.\("postalcode").toOption.map(_.as[String]),
            countryregionname = json.\("countryregionname").toOption.map(_.as[String]),
            additionalcontactinfo = json.\("additionalcontactinfo").toOption.map(_.as[/* xml */ String])
          )
        )
      )
    }
  }
}
