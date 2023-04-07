/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodelillustration

import adventureworks.production.illustration.IllustrationId
import adventureworks.production.productmodel.ProductmodelId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductmodelillustrationRow(
  /** Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: ProductmodelId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelillustration","column_name":"productmodelid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[illustration.IllustrationRow.illustrationid]] */
  illustrationid: IllustrationId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelillustration","column_name":"illustrationid","ordinal_position":2,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productmodelillustration","column_name":"modifieddate","ordinal_position":3,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
){
   val compositeId: ProductmodelillustrationId = ProductmodelillustrationId(productmodelid, illustrationid)
 }

object ProductmodelillustrationRow {
  def rowParser(prefix: String): RowParser[ProductmodelillustrationRow] = { row =>
    Success(
      ProductmodelillustrationRow(
        productmodelid = row[ProductmodelId](prefix + "productmodelid"),
        illustrationid = row[IllustrationId](prefix + "illustrationid"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[ProductmodelillustrationRow] = new OFormat[ProductmodelillustrationRow]{
    override def writes(o: ProductmodelillustrationRow): JsObject =
      Json.obj(
        "productmodelid" -> o.productmodelid,
        "illustrationid" -> o.illustrationid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductmodelillustrationRow] = {
      JsResult.fromTry(
        Try(
          ProductmodelillustrationRow(
            productmodelid = json.\("productmodelid").as[ProductmodelId],
            illustrationid = json.\("illustrationid").as[IllustrationId],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
