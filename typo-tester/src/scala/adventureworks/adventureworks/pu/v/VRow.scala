/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package v

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.AccountNumber
import adventureworks.public.Flag
import adventureworks.public.Name
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"businessentityid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.accountnumber]] */
  accountnumber: Option[AccountNumber] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"accountnumber","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"AccountNumber","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.name]] */
  name: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"name","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.creditrating]] */
  creditrating: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"creditrating","ordinal_position":5,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.preferredvendorstatus]] */
  preferredvendorstatus: Flag /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"preferredvendorstatus","ordinal_position":6,"is_nullable":"NO","data_type":"boolean","domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Flag","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.activeflag]] */
  activeflag: Flag /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"activeflag","ordinal_position":7,"is_nullable":"NO","data_type":"boolean","domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Flag","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.purchasingwebserviceurl]] */
  purchasingwebserviceurl: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"purchasingwebserviceurl","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":1024,"character_octet_length":4096,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[purchasing.vendor.VendorRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pu","table_name":"v","column_name":"modifieddate","ordinal_position":9,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object VRow {
  def rowParser(prefix: String): RowParser[VRow] = { row =>
    Success(
      VRow(
        id = row[Option[Int]](prefix + "id"),
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        accountnumber = row[Option[AccountNumber]](prefix + "accountnumber"),
        name = row[Option[Name]](prefix + "name"),
        creditrating = row[Option[Int]](prefix + "creditrating"),
        preferredvendorstatus = row[Flag](prefix + "preferredvendorstatus"),
        activeflag = row[Flag](prefix + "activeflag"),
        purchasingwebserviceurl = row[Option[String]](prefix + "purchasingwebserviceurl"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[VRow] = new OFormat[VRow]{
    override def writes(o: VRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "businessentityid" -> o.businessentityid,
        "accountnumber" -> o.accountnumber,
        "name" -> o.name,
        "creditrating" -> o.creditrating,
        "preferredvendorstatus" -> o.preferredvendorstatus,
        "activeflag" -> o.activeflag,
        "purchasingwebserviceurl" -> o.purchasingwebserviceurl,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[VRow] = {
      JsResult.fromTry(
        Try(
          VRow(
            id = json.\("id").toOption.map(_.as[Int]),
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            accountnumber = json.\("accountnumber").toOption.map(_.as[AccountNumber]),
            name = json.\("name").toOption.map(_.as[Name]),
            creditrating = json.\("creditrating").toOption.map(_.as[Int]),
            preferredvendorstatus = json.\("preferredvendorstatus").as[Flag],
            activeflag = json.\("activeflag").as[Flag],
            purchasingwebserviceurl = json.\("purchasingwebserviceurl").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
