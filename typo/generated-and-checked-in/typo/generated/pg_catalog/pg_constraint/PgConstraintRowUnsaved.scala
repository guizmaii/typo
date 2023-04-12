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
package pg_constraint

import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `pg_catalog.pg_constraint` which has not been persisted yet */
case class PgConstraintRowUnsaved(
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conname","ordinal_position":2,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conname: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"connamespace","ordinal_position":3,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  connamespace: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"contype","ordinal_position":4,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  contype: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"condeferrable","ordinal_position":5,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  condeferrable: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"condeferred","ordinal_position":6,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  condeferred: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"convalidated","ordinal_position":7,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  convalidated: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conrelid","ordinal_position":8,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conrelid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"contypid","ordinal_position":9,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  contypid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conindid","ordinal_position":10,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conindid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conparentid","ordinal_position":11,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conparentid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confrelid","ordinal_position":12,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  confrelid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confupdtype","ordinal_position":13,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  confupdtype: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confdeltype","ordinal_position":14,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"14","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  confdeltype: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confmatchtype","ordinal_position":15,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"15","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  confmatchtype: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conislocal","ordinal_position":16,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"16","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conislocal: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"coninhcount","ordinal_position":17,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"17","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  coninhcount: Int,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"connoinherit","ordinal_position":18,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"18","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  connoinherit: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conkey","ordinal_position":19,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_int2","dtd_identifier":"19","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conkey: Option[Array[Int]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"confkey","ordinal_position":20,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_int2","dtd_identifier":"20","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  confkey: Option[Array[Int]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conpfeqop","ordinal_position":21,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"21","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conpfeqop: Option[Array[/* oid */ Long]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conppeqop","ordinal_position":22,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"22","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conppeqop: Option[Array[/* oid */ Long]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conffeqop","ordinal_position":23,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"23","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conffeqop: Option[Array[/* oid */ Long]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conexclop","ordinal_position":24,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_oid","dtd_identifier":"24","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conexclop: Option[Array[/* oid */ Long]],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_constraint","column_name":"conbin","ordinal_position":25,"is_nullable":"YES","data_type":"pg_node_tree","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"pg_node_tree","dtd_identifier":"25","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  conbin: Option[/* pg_node_tree */ PGobject]
) {
  def toRow(oid: PgConstraintId): PgConstraintRow =
    PgConstraintRow(
      oid = oid,
      conname = conname,
      connamespace = connamespace,
      contype = contype,
      condeferrable = condeferrable,
      condeferred = condeferred,
      convalidated = convalidated,
      conrelid = conrelid,
      contypid = contypid,
      conindid = conindid,
      conparentid = conparentid,
      confrelid = confrelid,
      confupdtype = confupdtype,
      confdeltype = confdeltype,
      confmatchtype = confmatchtype,
      conislocal = conislocal,
      coninhcount = coninhcount,
      connoinherit = connoinherit,
      conkey = conkey,
      confkey = confkey,
      conpfeqop = conpfeqop,
      conppeqop = conppeqop,
      conffeqop = conffeqop,
      conexclop = conexclop,
      conbin = conbin
    )
}
object PgConstraintRowUnsaved {
  implicit val oFormat: OFormat[PgConstraintRowUnsaved] = new OFormat[PgConstraintRowUnsaved]{
    override def writes(o: PgConstraintRowUnsaved): JsObject =
      Json.obj(
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
  
    override def reads(json: JsValue): JsResult[PgConstraintRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PgConstraintRowUnsaved(
            conname = json.\("conname").as[String],
            connamespace = json.\("connamespace").as[/* oid */ Long],
            contype = json.\("contype").as[String],
            condeferrable = json.\("condeferrable").as[Boolean],
            condeferred = json.\("condeferred").as[Boolean],
            convalidated = json.\("convalidated").as[Boolean],
            conrelid = json.\("conrelid").as[/* oid */ Long],
            contypid = json.\("contypid").as[/* oid */ Long],
            conindid = json.\("conindid").as[/* oid */ Long],
            conparentid = json.\("conparentid").as[/* oid */ Long],
            confrelid = json.\("confrelid").as[/* oid */ Long],
            confupdtype = json.\("confupdtype").as[String],
            confdeltype = json.\("confdeltype").as[String],
            confmatchtype = json.\("confmatchtype").as[String],
            conislocal = json.\("conislocal").as[Boolean],
            coninhcount = json.\("coninhcount").as[Int],
            connoinherit = json.\("connoinherit").as[Boolean],
            conkey = json.\("conkey").toOption.map(_.as[Array[Int]]),
            confkey = json.\("confkey").toOption.map(_.as[Array[Int]]),
            conpfeqop = json.\("conpfeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conppeqop = json.\("conppeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conffeqop = json.\("conffeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conexclop = json.\("conexclop").toOption.map(_.as[Array[/* oid */ Long]]),
            conbin = json.\("conbin").toOption.map(_.as[/* pg_node_tree */ PGobject])
          )
        )
      )
    }
  }
}
