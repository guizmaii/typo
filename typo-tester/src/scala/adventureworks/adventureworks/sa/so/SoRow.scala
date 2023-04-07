/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package so

import adventureworks.sales.specialoffer.SpecialofferId
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

case class SoRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.specialofferid]] */
  specialofferid: Option[SpecialofferId] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"specialofferid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.description]] */
  description: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"description","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":255,"character_octet_length":1020,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.discountpct]] */
  discountpct: Option[BigDecimal] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"discountpct","ordinal_position":4,"is_nullable":"YES","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.`type`]] */
  `type`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"type","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.category]] */
  category: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"category","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.startdate]] */
  startdate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"startdate","ordinal_position":7,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.enddate]] */
  enddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"enddate","ordinal_position":8,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.minqty]] */
  minqty: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"minqty","ordinal_position":9,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.maxqty]] */
  maxqty: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"maxqty","ordinal_position":10,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.rowguid]] */
  rowguid: Option[UUID] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"rowguid","ordinal_position":11,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialoffer.SpecialofferRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"so","column_name":"modifieddate","ordinal_position":12,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object SoRow {
  def rowParser(prefix: String): RowParser[SoRow] = { row =>
    Success(
      SoRow(
        id = row[Option[Int]](prefix + "id"),
        specialofferid = row[Option[SpecialofferId]](prefix + "specialofferid"),
        description = row[Option[String]](prefix + "description"),
        discountpct = row[Option[BigDecimal]](prefix + "discountpct"),
        `type` = row[Option[String]](prefix + "type"),
        category = row[Option[String]](prefix + "category"),
        startdate = row[Option[LocalDateTime]](prefix + "startdate"),
        enddate = row[Option[LocalDateTime]](prefix + "enddate"),
        minqty = row[Option[Int]](prefix + "minqty"),
        maxqty = row[Option[Int]](prefix + "maxqty"),
        rowguid = row[Option[UUID]](prefix + "rowguid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[SoRow] = new OFormat[SoRow]{
    override def writes(o: SoRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "specialofferid" -> o.specialofferid,
        "description" -> o.description,
        "discountpct" -> o.discountpct,
        "type" -> o.`type`,
        "category" -> o.category,
        "startdate" -> o.startdate,
        "enddate" -> o.enddate,
        "minqty" -> o.minqty,
        "maxqty" -> o.maxqty,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SoRow] = {
      JsResult.fromTry(
        Try(
          SoRow(
            id = json.\("id").toOption.map(_.as[Int]),
            specialofferid = json.\("specialofferid").toOption.map(_.as[SpecialofferId]),
            description = json.\("description").toOption.map(_.as[String]),
            discountpct = json.\("discountpct").toOption.map(_.as[BigDecimal]),
            `type` = json.\("type").toOption.map(_.as[String]),
            category = json.\("category").toOption.map(_.as[String]),
            startdate = json.\("startdate").toOption.map(_.as[LocalDateTime]),
            enddate = json.\("enddate").toOption.map(_.as[LocalDateTime]),
            minqty = json.\("minqty").toOption.map(_.as[Int]),
            maxqty = json.\("maxqty").toOption.map(_.as[Int]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
