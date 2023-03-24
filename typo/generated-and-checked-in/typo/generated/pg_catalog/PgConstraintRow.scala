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

case class PgConstraintRow(
  oid: PgConstraintId /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"oid","ordinal_position":1,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conname: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conname","ordinal_position":2,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  connamespace: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"connamespace","ordinal_position":3,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  contype: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"contype","ordinal_position":4,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  condeferrable: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"condeferrable","ordinal_position":5,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  condeferred: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"condeferred","ordinal_position":6,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  convalidated: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"convalidated","ordinal_position":7,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conrelid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conrelid","ordinal_position":8,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  contypid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"contypid","ordinal_position":9,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conindid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conindid","ordinal_position":10,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conparentid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conparentid","ordinal_position":11,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  confrelid: Long /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confrelid","ordinal_position":12,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  confupdtype: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confupdtype","ordinal_position":13,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  confdeltype: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confdeltype","ordinal_position":14,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"14","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  confmatchtype: String /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confmatchtype","ordinal_position":15,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"15","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conislocal: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conislocal","ordinal_position":16,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"16","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  coninhcount: Int /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"coninhcount","ordinal_position":17,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"17","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  connoinherit: Boolean /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"connoinherit","ordinal_position":18,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"18","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conkey: Option[Array[Int]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conkey","ordinal_position":19,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_int2","dtd_identifier":"19","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  confkey: Option[Array[Int]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confkey","ordinal_position":20,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_int2","dtd_identifier":"20","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conpfeqop: Option[Array[Long]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conpfeqop","ordinal_position":21,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"21","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conppeqop: Option[Array[Long]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conppeqop","ordinal_position":22,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"22","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conffeqop: Option[Array[Long]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conffeqop","ordinal_position":23,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"23","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conexclop: Option[Array[Long]] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conexclop","ordinal_position":24,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"24","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  conbin: Option[PGobject] /* {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conbin","ordinal_position":25,"is_nullable":"YES","data_type":"pg_node_tree","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"pg_node_tree","dtd_identifier":"25","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object PgConstraintRow {
  implicit val rowParser: RowParser[PgConstraintRow] = { row =>
    Success(
      PgConstraintRow(
        oid = row[PgConstraintId]("oid"),
        conname = row[String]("conname"),
        connamespace = row[Long]("connamespace"),
        contype = row[String]("contype"),
        condeferrable = row[Boolean]("condeferrable"),
        condeferred = row[Boolean]("condeferred"),
        convalidated = row[Boolean]("convalidated"),
        conrelid = row[Long]("conrelid"),
        contypid = row[Long]("contypid"),
        conindid = row[Long]("conindid"),
        conparentid = row[Long]("conparentid"),
        confrelid = row[Long]("confrelid"),
        confupdtype = row[String]("confupdtype"),
        confdeltype = row[String]("confdeltype"),
        confmatchtype = row[String]("confmatchtype"),
        conislocal = row[Boolean]("conislocal"),
        coninhcount = row[Int]("coninhcount"),
        connoinherit = row[Boolean]("connoinherit"),
        conkey = row[Option[Array[Int]]]("conkey"),
        confkey = row[Option[Array[Int]]]("confkey"),
        conpfeqop = row[Option[Array[Long]]]("conpfeqop"),
        conppeqop = row[Option[Array[Long]]]("conppeqop"),
        conffeqop = row[Option[Array[Long]]]("conffeqop"),
        conexclop = row[Option[Array[Long]]]("conexclop"),
        conbin = row[Option[PGobject]]("conbin")
      )
    )
  }

  implicit val oFormat: OFormat[PgConstraintRow] = new OFormat[PgConstraintRow]{
    override def writes(o: PgConstraintRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "conname" -> o.conname,
      "connamespace" -> o.connamespace,
      "contype" -> o.contype,
      "condeferrable" -> o.condeferrable,
      "condeferred" -> o.condeferred,
      "convalidated" -> o.convalidated,
      "conrelid" -> o.conrelid,
      "contypid" -> o.contypid,
      "conindid" -> o.conindid,
      "conparentid" -> o.conparentid,
      "confrelid" -> o.confrelid,
      "confupdtype" -> o.confupdtype,
      "confdeltype" -> o.confdeltype,
      "confmatchtype" -> o.confmatchtype,
      "conislocal" -> o.conislocal,
      "coninhcount" -> o.coninhcount,
      "connoinherit" -> o.connoinherit,
      "conkey" -> o.conkey,
      "confkey" -> o.confkey,
      "conpfeqop" -> o.conpfeqop,
      "conppeqop" -> o.conppeqop,
      "conffeqop" -> o.conffeqop,
      "conexclop" -> o.conexclop,
      "conbin" -> o.conbin
      )

    override def reads(json: JsValue): JsResult[PgConstraintRow] = {
      JsResult.fromTry(
        Try(
          PgConstraintRow(
            oid = json.\("oid").as[PgConstraintId],
            conname = json.\("conname").as[String],
            connamespace = json.\("connamespace").as[Long],
            contype = json.\("contype").as[String],
            condeferrable = json.\("condeferrable").as[Boolean],
            condeferred = json.\("condeferred").as[Boolean],
            convalidated = json.\("convalidated").as[Boolean],
            conrelid = json.\("conrelid").as[Long],
            contypid = json.\("contypid").as[Long],
            conindid = json.\("conindid").as[Long],
            conparentid = json.\("conparentid").as[Long],
            confrelid = json.\("confrelid").as[Long],
            confupdtype = json.\("confupdtype").as[String],
            confdeltype = json.\("confdeltype").as[String],
            confmatchtype = json.\("confmatchtype").as[String],
            conislocal = json.\("conislocal").as[Boolean],
            coninhcount = json.\("coninhcount").as[Int],
            connoinherit = json.\("connoinherit").as[Boolean],
            conkey = json.\("conkey").toOption.map(_.as[Array[Int]]),
            confkey = json.\("confkey").toOption.map(_.as[Array[Int]]),
            conpfeqop = json.\("conpfeqop").toOption.map(_.as[Array[Long]]),
            conppeqop = json.\("conppeqop").toOption.map(_.as[Array[Long]]),
            conffeqop = json.\("conffeqop").toOption.map(_.as[Array[Long]]),
            conexclop = json.\("conexclop").toOption.map(_.as[Array[Long]]),
            conbin = json.\("conbin").toOption.map(_.as[PGobject])
          )
        )
      )
    }
  }
}
