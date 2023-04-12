/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentitycontact

import adventureworks.Defaulted
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.businessentitycontact` which has not been persisted yet */
case class BusinessentitycontactRowUnsaved(
  /** Default: uuid_generate_v1()
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"businessentitycontact","column_name":"rowguid","ordinal_position":4,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Defaulted[UUID],
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"person","table_name":"businessentitycontact","column_name":"modifieddate","ordinal_position":5,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(compositeId: BusinessentitycontactId): BusinessentitycontactRow =
    BusinessentitycontactRow(
      businessentityid = compositeId.businessentityid,
      personid = compositeId.personid,
      contacttypeid = compositeId.contacttypeid,
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
object BusinessentitycontactRowUnsaved {
  implicit val oFormat: OFormat[BusinessentitycontactRowUnsaved] = new OFormat[BusinessentitycontactRowUnsaved]{
    override def writes(o: BusinessentitycontactRowUnsaved): JsObject =
      Json.obj(
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[BusinessentitycontactRowUnsaved] = {
      JsResult.fromTry(
        Try(
          BusinessentitycontactRowUnsaved(
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
