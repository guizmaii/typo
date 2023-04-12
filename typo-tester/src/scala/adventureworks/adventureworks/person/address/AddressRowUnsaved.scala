/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package address

import adventureworks.Defaulted
import adventureworks.person.stateprovince.StateprovinceId
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.address` which has not been persisted yet */
case class AddressRowUnsaved(
  /** First street address line.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"addressline1","ordinal_position":2,"is_nullable":"NO","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  addressline1: String,
  /** Second street address line.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"addressline2","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":60,"character_octet_length":240,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  addressline2: Option[String],
  /** Name of the city.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"city","ordinal_position":4,"is_nullable":"NO","data_type":"character varying","character_maximum_length":30,"character_octet_length":120,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  city: String,
  /** Unique identification number for the state or province. Foreign key to StateProvince table.
      Points to [[stateprovince.StateprovinceRow.stateprovinceid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"stateprovinceid","ordinal_position":5,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  stateprovinceid: StateprovinceId,
  /** Postal code for the street address.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"postalcode","ordinal_position":6,"is_nullable":"NO","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  postalcode: String,
  /** Latitude and longitude of this address.
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"spatiallocation","ordinal_position":7,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  spatiallocation: Option[Array[Byte]],
  /** Default: uuid_generate_v1()
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"rowguid","ordinal_position":8,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Defaulted[UUID],
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"address","column_name":"modifieddate","ordinal_position":9,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(addressid: AddressId): AddressRow =
    AddressRow(
      addressid = addressid,
      addressline1 = addressline1,
      addressline2 = addressline2,
      city = city,
      stateprovinceid = stateprovinceid,
      postalcode = postalcode,
      spatiallocation = spatiallocation,
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
object AddressRowUnsaved {
  implicit val oFormat: OFormat[AddressRowUnsaved] = new OFormat[AddressRowUnsaved]{
    override def writes(o: AddressRowUnsaved): JsObject =
      Json.obj(
        "addressline1" -> o.addressline1,
        "addressline2" -> o.addressline2,
        "city" -> o.city,
        "stateprovinceid" -> o.stateprovinceid,
        "postalcode" -> o.postalcode,
        "spatiallocation" -> o.spatiallocation,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[AddressRowUnsaved] = {
      JsResult.fromTry(
        Try(
          AddressRowUnsaved(
            addressline1 = json.\("addressline1").as[String],
            addressline2 = json.\("addressline2").toOption.map(_.as[String]),
            city = json.\("city").as[String],
            stateprovinceid = json.\("stateprovinceid").as[StateprovinceId],
            postalcode = json.\("postalcode").as[String],
            spatiallocation = json.\("spatiallocation").toOption.map(_.as[Array[Byte]]),
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
