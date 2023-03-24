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

case class PgStatisticExtRow(
  oid: PgStatisticExtId /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"oid","ordinal_position":1,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxrelid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxrelid","ordinal_position":2,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxname: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxname","ordinal_position":3,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxnamespace: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxnamespace","ordinal_position":4,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxowner: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxowner","ordinal_position":5,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxstattarget: Int /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxstattarget","ordinal_position":6,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxkeys: PGobject /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxkeys","ordinal_position":7,"is_nullable":"NO","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int2vector","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxkind: Array[String] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxkind","ordinal_position":8,"is_nullable":"NO","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_char","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  stxexprs: Option[PGobject] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_statistic_ext","column_name":"stxexprs","ordinal_position":9,"is_nullable":"YES","data_type":"pg_node_tree","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"pg_node_tree","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PgStatisticExtRow {
  implicit val rowParser: RowParser[PgStatisticExtRow] = { row =>
    Success(
      PgStatisticExtRow(
        oid = row[PgStatisticExtId]("oid"),
        stxrelid = row[Long]("stxrelid"),
        stxname = row[String]("stxname"),
        stxnamespace = row[Long]("stxnamespace"),
        stxowner = row[Long]("stxowner"),
        stxstattarget = row[Int]("stxstattarget"),
        stxkeys = row[PGobject]("stxkeys"),
        stxkind = row[Array[String]]("stxkind"),
        stxexprs = row[Option[PGobject]]("stxexprs")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatisticExtRow] = new OFormat[PgStatisticExtRow]{
    override def writes(o: PgStatisticExtRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "stxrelid" -> o.stxrelid,
      "stxname" -> o.stxname,
      "stxnamespace" -> o.stxnamespace,
      "stxowner" -> o.stxowner,
      "stxstattarget" -> o.stxstattarget,
      "stxkeys" -> o.stxkeys,
      "stxkind" -> o.stxkind,
      "stxexprs" -> o.stxexprs
      )

    override def reads(json: JsValue): JsResult[PgStatisticExtRow] = {
      JsResult.fromTry(
        Try(
          PgStatisticExtRow(
            oid = json.\("oid").as[PgStatisticExtId],
            stxrelid = json.\("stxrelid").as[Long],
            stxname = json.\("stxname").as[String],
            stxnamespace = json.\("stxnamespace").as[Long],
            stxowner = json.\("stxowner").as[Long],
            stxstattarget = json.\("stxstattarget").as[Int],
            stxkeys = json.\("stxkeys").as[PGobject],
            stxkind = json.\("stxkind").as[Array[String]],
            stxexprs = json.\("stxexprs").toOption.map(_.as[PGobject])
          )
        )
      )
    }
  }
}
