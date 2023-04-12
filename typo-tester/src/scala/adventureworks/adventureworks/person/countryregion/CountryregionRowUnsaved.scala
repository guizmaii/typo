/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package countryregion

import adventureworks.Defaulted
import adventureworks.public.Name
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.countryregion` which has not been persisted yet */
case class CountryregionRowUnsaved(
  /** Country or region name.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"countryregion","column_name":"name","ordinal_position":2,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  name: Name,
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"countryregion","column_name":"modifieddate","ordinal_position":3,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(countryregioncode: CountryregionId): CountryregionRow =
    CountryregionRow(
      countryregioncode = countryregioncode,
      name = name,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                       case Defaulted.Provided(value) => value
                     }
    )
}
object CountryregionRowUnsaved {
  implicit val oFormat: OFormat[CountryregionRowUnsaved] = new OFormat[CountryregionRowUnsaved]{
    override def writes(o: CountryregionRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[CountryregionRowUnsaved] = {
      JsResult.fromTry(
        Try(
          CountryregionRowUnsaved(
            name = json.\("name").as[Name],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
