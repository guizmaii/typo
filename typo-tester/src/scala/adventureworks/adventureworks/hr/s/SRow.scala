/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package s

import adventureworks.humanresources.shift.ShiftId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class SRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[humanresources.shift.ShiftRow.shiftid]] */
  shiftid: Option[ShiftId] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"shiftid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[humanresources.shift.ShiftRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"name","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[humanresources.shift.ShiftRow.starttime]] */
  starttime: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"starttime","ordinal_position":4,"is_nullable":"YES","data_type":"time without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"time","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[humanresources.shift.ShiftRow.endtime]] */
  endtime: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"endtime","ordinal_position":5,"is_nullable":"YES","data_type":"time without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"time","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[humanresources.shift.ShiftRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"hr","table_name":"s","column_name":"modifieddate","ordinal_position":6,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object SRow {
  def rowParser(prefix: String): RowParser[SRow] = { row =>
    Success(
      SRow(
        id = row[Option[Int]](prefix + "id"),
        shiftid = row[Option[ShiftId]](prefix + "shiftid"),
        name = row[Option[String]](prefix + "name"),
        starttime = row[Option[String]](prefix + "starttime"),
        endtime = row[Option[String]](prefix + "endtime"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[SRow] = new OFormat[SRow]{
    override def writes(o: SRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "shiftid" -> o.shiftid,
        "name" -> o.name,
        "starttime" -> o.starttime,
        "endtime" -> o.endtime,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SRow] = {
      JsResult.fromTry(
        Try(
          SRow(
            id = json.\("id").toOption.map(_.as[Int]),
            shiftid = json.\("shiftid").toOption.map(_.as[ShiftId]),
            name = json.\("name").toOption.map(_.as[String]),
            starttime = json.\("starttime").toOption.map(_.as[String]),
            endtime = json.\("endtime").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
