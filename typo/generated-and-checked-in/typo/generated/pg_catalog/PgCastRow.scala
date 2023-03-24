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
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgCastRow(
  oid: PgCastId /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"oid","ordinal_position":1,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  castsource: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"castsource","ordinal_position":2,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  casttarget: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"casttarget","ordinal_position":3,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  castfunc: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"castfunc","ordinal_position":4,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  castcontext: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"castcontext","ordinal_position":5,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  castmethod: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_cast","column_name":"castmethod","ordinal_position":6,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PgCastRow {
  implicit val rowParser: RowParser[PgCastRow] = { row =>
    Success(
      PgCastRow(
        oid = row[PgCastId]("oid"),
        castsource = row[Long]("castsource"),
        casttarget = row[Long]("casttarget"),
        castfunc = row[Long]("castfunc"),
        castcontext = row[String]("castcontext"),
        castmethod = row[String]("castmethod")
      )
    )
  }

  implicit val oFormat: OFormat[PgCastRow] = new OFormat[PgCastRow]{
    override def writes(o: PgCastRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "castsource" -> o.castsource,
      "casttarget" -> o.casttarget,
      "castfunc" -> o.castfunc,
      "castcontext" -> o.castcontext,
      "castmethod" -> o.castmethod
      )

    override def reads(json: JsValue): JsResult[PgCastRow] = {
      JsResult.fromTry(
        Try(
          PgCastRow(
            oid = json.\("oid").as[PgCastId],
            castsource = json.\("castsource").as[Long],
            casttarget = json.\("casttarget").as[Long],
            castfunc = json.\("castfunc").as[Long],
            castcontext = json.\("castcontext").as[String],
            castmethod = json.\("castmethod").as[String]
          )
        )
      )
    }
  }
}
