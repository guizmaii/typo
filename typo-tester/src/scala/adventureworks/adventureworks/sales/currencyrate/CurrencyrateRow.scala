/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currencyrate

import adventureworks.sales.currency.CurrencyId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class CurrencyrateRow(
  currencyrateid: CurrencyrateId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"currencyrateid","ordinal_position":1,"column_default":"nextval('sales.currencyrate_currencyrateid_seq'::regclass)","is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  currencyratedate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"currencyratedate","ordinal_position":2,"is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[currency.CurrencyRow.currencycode]] */
  fromcurrencycode: CurrencyId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"fromcurrencycode","ordinal_position":3,"is_nullable":"NO","data_type":"character","character_maximum_length":3,"character_octet_length":12,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[currency.CurrencyRow.currencycode]] */
  tocurrencycode: CurrencyId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"tocurrencycode","ordinal_position":4,"is_nullable":"NO","data_type":"character","character_maximum_length":3,"character_octet_length":12,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  averagerate: BigDecimal /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"averagerate","ordinal_position":5,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  endofdayrate: BigDecimal /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"endofdayrate","ordinal_position":6,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"currencyrate","column_name":"modifieddate","ordinal_position":7,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object CurrencyrateRow {
  def rowParser(prefix: String): RowParser[CurrencyrateRow] = { row =>
    Success(
      CurrencyrateRow(
        currencyrateid = row[CurrencyrateId](prefix + "currencyrateid"),
        currencyratedate = row[LocalDateTime](prefix + "currencyratedate"),
        fromcurrencycode = row[CurrencyId](prefix + "fromcurrencycode"),
        tocurrencycode = row[CurrencyId](prefix + "tocurrencycode"),
        averagerate = row[BigDecimal](prefix + "averagerate"),
        endofdayrate = row[BigDecimal](prefix + "endofdayrate"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[CurrencyrateRow] = new OFormat[CurrencyrateRow]{
    override def writes(o: CurrencyrateRow): JsObject =
      Json.obj(
        "currencyrateid" -> o.currencyrateid,
        "currencyratedate" -> o.currencyratedate,
        "fromcurrencycode" -> o.fromcurrencycode,
        "tocurrencycode" -> o.tocurrencycode,
        "averagerate" -> o.averagerate,
        "endofdayrate" -> o.endofdayrate,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[CurrencyrateRow] = {
      JsResult.fromTry(
        Try(
          CurrencyrateRow(
            currencyrateid = json.\("currencyrateid").as[CurrencyrateId],
            currencyratedate = json.\("currencyratedate").as[LocalDateTime],
            fromcurrencycode = json.\("fromcurrencycode").as[CurrencyId],
            tocurrencycode = json.\("tocurrencycode").as[CurrencyId],
            averagerate = json.\("averagerate").as[BigDecimal],
            endofdayrate = json.\("endofdayrate").as[BigDecimal],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
