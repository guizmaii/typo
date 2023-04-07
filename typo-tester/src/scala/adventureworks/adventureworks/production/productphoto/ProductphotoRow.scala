/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productphoto

import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ProductphotoRow(
  productphotoid: ProductphotoId /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"productphotoid","ordinal_position":1,"column_default":"nextval('production.productphoto_productphotoid_seq'::regclass)","is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  thumbnailphoto: Option[Array[Byte]] /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"thumbnailphoto","ordinal_position":2,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  thumbnailphotofilename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"thumbnailphotofilename","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  largephoto: Option[Array[Byte]] /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"largephoto","ordinal_position":4,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  largephotofilename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"largephotofilename","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"production","table_name":"productphoto","column_name":"modifieddate","ordinal_position":6,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object ProductphotoRow {
  def rowParser(prefix: String): RowParser[ProductphotoRow] = { row =>
    Success(
      ProductphotoRow(
        productphotoid = row[ProductphotoId](prefix + "productphotoid"),
        thumbnailphoto = row[Option[Array[Byte]]](prefix + "thumbnailphoto"),
        thumbnailphotofilename = row[Option[String]](prefix + "thumbnailphotofilename"),
        largephoto = row[Option[Array[Byte]]](prefix + "largephoto"),
        largephotofilename = row[Option[String]](prefix + "largephotofilename"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[ProductphotoRow] = new OFormat[ProductphotoRow]{
    override def writes(o: ProductphotoRow): JsObject =
      Json.obj(
        "productphotoid" -> o.productphotoid,
        "thumbnailphoto" -> o.thumbnailphoto,
        "thumbnailphotofilename" -> o.thumbnailphotofilename,
        "largephoto" -> o.largephoto,
        "largephotofilename" -> o.largephotofilename,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductphotoRow] = {
      JsResult.fromTry(
        Try(
          ProductphotoRow(
            productphotoid = json.\("productphotoid").as[ProductphotoId],
            thumbnailphoto = json.\("thumbnailphoto").toOption.map(_.as[Array[Byte]]),
            thumbnailphotofilename = json.\("thumbnailphotofilename").toOption.map(_.as[String]),
            largephoto = json.\("largephoto").toOption.map(_.as[Array[Byte]]),
            largephotofilename = json.\("largephotofilename").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
