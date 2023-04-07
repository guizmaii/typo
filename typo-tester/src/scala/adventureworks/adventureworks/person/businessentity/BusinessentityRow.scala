/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentity

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

case class BusinessentityRow(
  businessentityid: BusinessentityId /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"businessentity","column_name":"businessentityid","ordinal_position":1,"column_default":"nextval('person.businessentity_businessentityid_seq'::regclass)","is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rowguid: UUID /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"businessentity","column_name":"rowguid","ordinal_position":2,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"person","table_name":"businessentity","column_name":"modifieddate","ordinal_position":3,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object BusinessentityRow {
  def rowParser(prefix: String): RowParser[BusinessentityRow] = { row =>
    Success(
      BusinessentityRow(
        businessentityid = row[BusinessentityId](prefix + "businessentityid"),
        rowguid = row[UUID](prefix + "rowguid"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[BusinessentityRow] = new OFormat[BusinessentityRow]{
    override def writes(o: BusinessentityRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[BusinessentityRow] = {
      JsResult.fromTry(
        Try(
          BusinessentityRow(
            businessentityid = json.\("businessentityid").as[BusinessentityId],
            rowguid = json.\("rowguid").as[UUID],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
