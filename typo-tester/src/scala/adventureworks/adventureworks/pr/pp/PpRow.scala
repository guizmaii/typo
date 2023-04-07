/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pp

import adventureworks.production.productphoto.ProductphotoId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PpRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.productphotoid]] */
  productphotoid: Option[ProductphotoId] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"productphotoid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphoto]] */
  thumbnailphoto: Option[Byte] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"thumbnailphoto","ordinal_position":3,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphotofilename]] */
  thumbnailphotofilename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"thumbnailphotofilename","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.largephoto]] */
  largephoto: Option[Byte] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"largephoto","ordinal_position":5,"is_nullable":"YES","data_type":"bytea","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bytea","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.largephotofilename]] */
  largephotofilename: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"largephotofilename","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[production.productphoto.ProductphotoRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"pr","table_name":"pp","column_name":"modifieddate","ordinal_position":7,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PpRow {
  def rowParser(prefix: String): RowParser[PpRow] = { row =>
    Success(
      PpRow(
        id = row[Option[Int]](prefix + "id"),
        productphotoid = row[Option[ProductphotoId]](prefix + "productphotoid"),
        thumbnailphoto = row[Option[Byte]](prefix + "thumbnailphoto"),
        thumbnailphotofilename = row[Option[String]](prefix + "thumbnailphotofilename"),
        largephoto = row[Option[Byte]](prefix + "largephoto"),
        largephotofilename = row[Option[String]](prefix + "largephotofilename"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[PpRow] = new OFormat[PpRow]{
    override def writes(o: PpRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "productphotoid" -> o.productphotoid,
        "thumbnailphoto" -> o.thumbnailphoto,
        "thumbnailphotofilename" -> o.thumbnailphotofilename,
        "largephoto" -> o.largephoto,
        "largephotofilename" -> o.largephotofilename,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PpRow] = {
      JsResult.fromTry(
        Try(
          PpRow(
            id = json.\("id").toOption.map(_.as[Int]),
            productphotoid = json.\("productphotoid").toOption.map(_.as[ProductphotoId]),
            thumbnailphoto = json.\("thumbnailphoto").toOption.map(_.as[Byte]),
            thumbnailphotofilename = json.\("thumbnailphotofilename").toOption.map(_.as[String]),
            largephoto = json.\("largephoto").toOption.map(_.as[Byte]),
            largephotofilename = json.\("largephotofilename").toOption.map(_.as[String]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
