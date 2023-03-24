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
import java.time.ZonedDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgAuthidRow(
  oid: PgAuthidId /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"oid","ordinal_position":1,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolname: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolname","ordinal_position":2,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolsuper: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolsuper","ordinal_position":3,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolinherit: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolinherit","ordinal_position":4,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolcreaterole: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolcreaterole","ordinal_position":5,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolcreatedb: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolcreatedb","ordinal_position":6,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolcanlogin: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolcanlogin","ordinal_position":7,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolreplication: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolreplication","ordinal_position":8,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolbypassrls: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolbypassrls","ordinal_position":9,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolconnlimit: Int /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolconnlimit","ordinal_position":10,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolpassword: Option[String] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolpassword","ordinal_position":11,"is_nullable":"YES","data_type":"text","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"text","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rolvaliduntil: Option[ZonedDateTime] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_authid","column_name":"rolvaliduntil","ordinal_position":12,"is_nullable":"YES","data_type":"timestamp with time zone","datetime_precision":6,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"timestamptz","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PgAuthidRow {
  implicit val rowParser: RowParser[PgAuthidRow] = { row =>
    Success(
      PgAuthidRow(
        oid = row[PgAuthidId]("oid"),
        rolname = row[String]("rolname"),
        rolsuper = row[Boolean]("rolsuper"),
        rolinherit = row[Boolean]("rolinherit"),
        rolcreaterole = row[Boolean]("rolcreaterole"),
        rolcreatedb = row[Boolean]("rolcreatedb"),
        rolcanlogin = row[Boolean]("rolcanlogin"),
        rolreplication = row[Boolean]("rolreplication"),
        rolbypassrls = row[Boolean]("rolbypassrls"),
        rolconnlimit = row[Int]("rolconnlimit"),
        rolpassword = row[Option[String]]("rolpassword"),
        rolvaliduntil = row[Option[ZonedDateTime]]("rolvaliduntil")
      )
    )
  }

  implicit val oFormat: OFormat[PgAuthidRow] = new OFormat[PgAuthidRow]{
    override def writes(o: PgAuthidRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "rolname" -> o.rolname,
      "rolsuper" -> o.rolsuper,
      "rolinherit" -> o.rolinherit,
      "rolcreaterole" -> o.rolcreaterole,
      "rolcreatedb" -> o.rolcreatedb,
      "rolcanlogin" -> o.rolcanlogin,
      "rolreplication" -> o.rolreplication,
      "rolbypassrls" -> o.rolbypassrls,
      "rolconnlimit" -> o.rolconnlimit,
      "rolpassword" -> o.rolpassword,
      "rolvaliduntil" -> o.rolvaliduntil
      )

    override def reads(json: JsValue): JsResult[PgAuthidRow] = {
      JsResult.fromTry(
        Try(
          PgAuthidRow(
            oid = json.\("oid").as[PgAuthidId],
            rolname = json.\("rolname").as[String],
            rolsuper = json.\("rolsuper").as[Boolean],
            rolinherit = json.\("rolinherit").as[Boolean],
            rolcreaterole = json.\("rolcreaterole").as[Boolean],
            rolcreatedb = json.\("rolcreatedb").as[Boolean],
            rolcanlogin = json.\("rolcanlogin").as[Boolean],
            rolreplication = json.\("rolreplication").as[Boolean],
            rolbypassrls = json.\("rolbypassrls").as[Boolean],
            rolconnlimit = json.\("rolconnlimit").as[Int],
            rolpassword = json.\("rolpassword").toOption.map(_.as[String]),
            rolvaliduntil = json.\("rolvaliduntil").toOption.map(_.as[ZonedDateTime])
          )
        )
      )
    }
  }
}
