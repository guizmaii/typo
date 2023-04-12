/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salestaxrate

import adventureworks.Defaulted
import adventureworks.person.stateprovince.StateprovinceId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `sales.salestaxrate` which has not been persisted yet */
case class SalestaxrateRowUnsaved(
  /** State, province, or country/region the sales tax applies to.
      Points to [[person.stateprovince.StateprovinceRow.stateprovinceid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"stateprovinceid","ordinal_position":2,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  stateprovinceid: StateprovinceId,
  /** 1 = Tax applied to retail transactions, 2 = Tax applied to wholesale transactions, 3 = Tax applied to all sales (retail and wholesale) transactions.
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"taxtype","ordinal_position":3,"is_nullable":"NO","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  taxtype: Int,
  /** Default: 0.00
      Tax rate amount.
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"taxrate","ordinal_position":4,"column_default":"0.00","is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  taxrate: Defaulted[BigDecimal],
  /** Tax rate description.
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"name","ordinal_position":5,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  name: Name,
  /** Default: uuid_generate_v1()
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"rowguid","ordinal_position":6,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Defaulted[UUID],
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salestaxrate","column_name":"modifieddate","ordinal_position":7,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(salestaxrateid: SalestaxrateId): SalestaxrateRow =
    SalestaxrateRow(
      salestaxrateid = salestaxrateid,
      stateprovinceid = stateprovinceid,
      taxtype = taxtype,
      taxrate = taxrate match {
                  case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                  case Defaulted.Provided(value) => value
                },
      name = name,
      rowguid = rowguid match {
                  case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                       case Defaulted.Provided(value) => value
                     }
    )
}
object SalestaxrateRowUnsaved {
  implicit val oFormat: OFormat[SalestaxrateRowUnsaved] = new OFormat[SalestaxrateRowUnsaved]{
    override def writes(o: SalestaxrateRowUnsaved): JsObject =
      Json.obj(
        "stateprovinceid" -> o.stateprovinceid,
        "taxtype" -> o.taxtype,
        "taxrate" -> o.taxrate,
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SalestaxrateRowUnsaved] = {
      JsResult.fromTry(
        Try(
          SalestaxrateRowUnsaved(
            stateprovinceid = json.\("stateprovinceid").as[StateprovinceId],
            taxtype = json.\("taxtype").as[Int],
            taxrate = json.\("taxrate").as[Defaulted[BigDecimal]],
            name = json.\("name").as[Name],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
