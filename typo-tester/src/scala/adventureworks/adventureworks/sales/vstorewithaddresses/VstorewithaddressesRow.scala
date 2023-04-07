/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithaddresses

import adventureworks.person.businessentity.BusinessentityId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VstorewithaddressesRow(
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"businessentityid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.stateprovince.StateprovinceRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"name","ordinal_position":2,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  addresstype: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"addresstype","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.addressline1]] */
  addressline1: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"addressline1","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.addressline2]] */
  addressline2: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"addressline2","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.city]] */
  city: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"city","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":30,"character_octet_length":120,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  stateprovincename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"stateprovincename","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.address.AddressRow.postalcode]] */
  postalcode: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"postalcode","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  countryregionname: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"vstorewithaddresses","column_name":"countryregionname","ordinal_position":9,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object VstorewithaddressesRow {
  def rowParser(prefix: String): RowParser[VstorewithaddressesRow] = { row =>
    Success(
      VstorewithaddressesRow(
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        name = row[Option[String]](prefix + "name"),
        addresstype = row[Option[String]](prefix + "addresstype"),
        addressline1 = row[Option[String]](prefix + "addressline1"),
        addressline2 = row[Option[String]](prefix + "addressline2"),
        city = row[Option[String]](prefix + "city"),
        stateprovincename = row[Option[String]](prefix + "stateprovincename"),
        postalcode = row[Option[String]](prefix + "postalcode"),
        countryregionname = row[Option[String]](prefix + "countryregionname")
      )
    )
  }

  implicit val oFormat: OFormat[VstorewithaddressesRow] = new OFormat[VstorewithaddressesRow]{
    override def writes(o: VstorewithaddressesRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "name" -> o.name,
        "addresstype" -> o.addresstype,
        "addressline1" -> o.addressline1,
        "addressline2" -> o.addressline2,
        "city" -> o.city,
        "stateprovincename" -> o.stateprovincename,
        "postalcode" -> o.postalcode,
        "countryregionname" -> o.countryregionname
      )
  
    override def reads(json: JsValue): JsResult[VstorewithaddressesRow] = {
      JsResult.fromTry(
        Try(
          VstorewithaddressesRow(
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            name = json.\("name").toOption.map(_.as[String]),
            addresstype = json.\("addresstype").toOption.map(_.as[String]),
            addressline1 = json.\("addressline1").toOption.map(_.as[String]),
            addressline2 = json.\("addressline2").toOption.map(_.as[String]),
            city = json.\("city").toOption.map(_.as[String]),
            stateprovincename = json.\("stateprovincename").toOption.map(_.as[String]),
            postalcode = json.\("postalcode").toOption.map(_.as[String]),
            countryregionname = json.\("countryregionname").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
