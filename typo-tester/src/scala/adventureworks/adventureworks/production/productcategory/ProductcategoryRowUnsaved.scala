/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productcategory

import adventureworks.Defaulted
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `production.productcategory` which has not been persisted yet */
case class ProductcategoryRowUnsaved(
  /** Category description.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productcategory","column_name":"name","ordinal_position":2,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  name: Name,
  /** Default: uuid_generate_v1()
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productcategory","column_name":"rowguid","ordinal_position":3,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Defaulted[UUID],
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productcategory","column_name":"modifieddate","ordinal_position":4,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(productcategoryid: ProductcategoryId): ProductcategoryRow =
    ProductcategoryRow(
      productcategoryid = productcategoryid,
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
object ProductcategoryRowUnsaved {
  implicit val oFormat: OFormat[ProductcategoryRowUnsaved] = new OFormat[ProductcategoryRowUnsaved]{
    override def writes(o: ProductcategoryRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductcategoryRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductcategoryRowUnsaved(
            name = json.\("name").as[Name],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
