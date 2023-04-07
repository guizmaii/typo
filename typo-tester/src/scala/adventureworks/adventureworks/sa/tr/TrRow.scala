/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package tr

import adventureworks.person.stateprovince.StateprovinceId
import adventureworks.sales.salestaxrate.SalestaxrateId
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

case class TrRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.salestaxrateid]] */
  salestaxrateid: Option[SalestaxrateId] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"salestaxrateid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.stateprovinceid]] */
  stateprovinceid: Option[StateprovinceId] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"stateprovinceid","ordinal_position":3,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.taxtype]] */
  taxtype: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"taxtype","ordinal_position":4,"is_nullable":"YES","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.taxrate]] */
  taxrate: Option[BigDecimal] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"taxrate","ordinal_position":5,"is_nullable":"YES","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.name]] */
  name: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"name","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.rowguid]] */
  rowguid: Option[UUID] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"rowguid","ordinal_position":7,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.salestaxrate.SalestaxrateRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"tr","column_name":"modifieddate","ordinal_position":8,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object TrRow {
  def rowParser(prefix: String): RowParser[TrRow] = { row =>
    Success(
      TrRow(
        id = row[Option[Int]](prefix + "id"),
        salestaxrateid = row[Option[SalestaxrateId]](prefix + "salestaxrateid"),
        stateprovinceid = row[Option[StateprovinceId]](prefix + "stateprovinceid"),
        taxtype = row[Option[Int]](prefix + "taxtype"),
        taxrate = row[Option[BigDecimal]](prefix + "taxrate"),
        name = row[Option[String]](prefix + "name"),
        rowguid = row[Option[UUID]](prefix + "rowguid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[TrRow] = new OFormat[TrRow]{
    override def writes(o: TrRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "salestaxrateid" -> o.salestaxrateid,
        "stateprovinceid" -> o.stateprovinceid,
        "taxtype" -> o.taxtype,
        "taxrate" -> o.taxrate,
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[TrRow] = {
      JsResult.fromTry(
        Try(
          TrRow(
            id = json.\("id").toOption.map(_.as[Int]),
            salestaxrateid = json.\("salestaxrateid").toOption.map(_.as[SalestaxrateId]),
            stateprovinceid = json.\("stateprovinceid").toOption.map(_.as[StateprovinceId]),
            taxtype = json.\("taxtype").toOption.map(_.as[Int]),
            taxrate = json.\("taxrate").toOption.map(_.as[BigDecimal]),
            name = json.\("name").toOption.map(_.as[String]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
