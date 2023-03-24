/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog

import anorm.RowParser
import anorm.Success
import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgConversionRow(
  oid: PgConversionId /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"oid","ordinal_position":1,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conname: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"conname","ordinal_position":2,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  connamespace: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"connamespace","ordinal_position":3,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conowner: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"conowner","ordinal_position":4,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conforencoding: Int /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"conforencoding","ordinal_position":5,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  contoencoding: Int /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"contoencoding","ordinal_position":6,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conproc: PGobject /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"conproc","ordinal_position":7,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  condefault: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_conversion","column_name":"condefault","ordinal_position":8,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PgConversionRow {
  implicit val rowParser: RowParser[PgConversionRow] = { row =>
    Success(
      PgConversionRow(
        oid = row[PgConversionId]("oid"),
        conname = row[String]("conname"),
        connamespace = row[Long]("connamespace"),
        conowner = row[Long]("conowner"),
        conforencoding = row[Int]("conforencoding"),
        contoencoding = row[Int]("contoencoding"),
        conproc = row[PGobject]("conproc"),
        condefault = row[Boolean]("condefault")
      )
    )
  }

  implicit val oFormat: OFormat[PgConversionRow] = new OFormat[PgConversionRow]{
    override def writes(o: PgConversionRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "conname" -> o.conname,
      "connamespace" -> o.connamespace,
      "conowner" -> o.conowner,
      "conforencoding" -> o.conforencoding,
      "contoencoding" -> o.contoencoding,
      "conproc" -> o.conproc,
      "condefault" -> o.condefault
      )

    override def reads(json: JsValue): JsResult[PgConversionRow] = {
      JsResult.fromTry(
        Try(
          PgConversionRow(
            oid = json.\("oid").as[PgConversionId],
            conname = json.\("conname").as[String],
            connamespace = json.\("connamespace").as[Long],
            conowner = json.\("conowner").as[Long],
            conforencoding = json.\("conforencoding").as[Int],
            contoencoding = json.\("contoencoding").as[Int],
            conproc = json.\("conproc").as[PGobject],
            condefault = json.\("condefault").as[Boolean]
          )
        )
      )
    }
  }
}
