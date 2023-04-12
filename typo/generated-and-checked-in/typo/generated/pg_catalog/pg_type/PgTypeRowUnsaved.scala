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
package pg_type

import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `pg_catalog.pg_type` which has not been persisted yet */
case class PgTypeRowUnsaved(
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typname","ordinal_position":2,"is_nullable":"NO","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typname: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typnamespace","ordinal_position":3,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typnamespace: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typowner","ordinal_position":4,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typowner: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typlen","ordinal_position":5,"is_nullable":"NO","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typlen: Int,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typbyval","ordinal_position":6,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typbyval: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typtype","ordinal_position":7,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typtype: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typcategory","ordinal_position":8,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typcategory: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typispreferred","ordinal_position":9,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typispreferred: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typisdefined","ordinal_position":10,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typisdefined: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typdelim","ordinal_position":11,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typdelim: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typrelid","ordinal_position":12,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typrelid: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typsubscript","ordinal_position":13,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typsubscript: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typelem","ordinal_position":14,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"14","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typelem: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typarray","ordinal_position":15,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"15","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typarray: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typinput","ordinal_position":16,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"16","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typinput: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typoutput","ordinal_position":17,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"17","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typoutput: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typreceive","ordinal_position":18,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"18","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typreceive: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typsend","ordinal_position":19,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"19","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typsend: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typmodin","ordinal_position":20,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"20","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typmodin: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typmodout","ordinal_position":21,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"21","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typmodout: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typanalyze","ordinal_position":22,"is_nullable":"NO","data_type":"regproc","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"regproc","dtd_identifier":"22","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typanalyze: /* regproc */ PGobject,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typalign","ordinal_position":23,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"23","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typalign: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typstorage","ordinal_position":24,"is_nullable":"NO","data_type":"\"char\"","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"char","dtd_identifier":"24","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typstorage: String,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typnotnull","ordinal_position":25,"is_nullable":"NO","data_type":"boolean","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"25","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typnotnull: Boolean,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typbasetype","ordinal_position":26,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"26","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typbasetype: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typtypmod","ordinal_position":27,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"27","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typtypmod: Int,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typndims","ordinal_position":28,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"28","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typndims: Int,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typcollation","ordinal_position":29,"is_nullable":"NO","data_type":"oid","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"oid","dtd_identifier":"29","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typcollation: /* oid */ Long,
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typdefaultbin","ordinal_position":30,"is_nullable":"YES","data_type":"pg_node_tree","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"pg_node_tree","dtd_identifier":"30","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typdefaultbin: Option[/* pg_node_tree */ PGobject],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typdefault","ordinal_position":31,"is_nullable":"YES","data_type":"text","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"text","dtd_identifier":"31","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typdefault: Option[String],
  /** debug: {"table_catalog":"postgres","table_schema":"pg_catalog","table_name":"pg_type","column_name":"typacl","ordinal_position":32,"is_nullable":"YES","data_type":"ARRAY","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"_aclitem","dtd_identifier":"32","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  typacl: Option[Array[/* aclitem */ PGobject]]
) {
  def toRow(oid: PgTypeId): PgTypeRow =
    PgTypeRow(
      oid = oid,
      typname = typname,
      typnamespace = typnamespace,
      typowner = typowner,
      typlen = typlen,
      typbyval = typbyval,
      typtype = typtype,
      typcategory = typcategory,
      typispreferred = typispreferred,
      typisdefined = typisdefined,
      typdelim = typdelim,
      typrelid = typrelid,
      typsubscript = typsubscript,
      typelem = typelem,
      typarray = typarray,
      typinput = typinput,
      typoutput = typoutput,
      typreceive = typreceive,
      typsend = typsend,
      typmodin = typmodin,
      typmodout = typmodout,
      typanalyze = typanalyze,
      typalign = typalign,
      typstorage = typstorage,
      typnotnull = typnotnull,
      typbasetype = typbasetype,
      typtypmod = typtypmod,
      typndims = typndims,
      typcollation = typcollation,
      typdefaultbin = typdefaultbin,
      typdefault = typdefault,
      typacl = typacl
    )
}
object PgTypeRowUnsaved {
  implicit val oFormat: OFormat[PgTypeRowUnsaved] = new OFormat[PgTypeRowUnsaved]{
    override def writes(o: PgTypeRowUnsaved): JsObject =
      Json.obj(
        "typname" -> o.typname,
        "typnamespace" -> o.typnamespace,
        "typowner" -> o.typowner,
        "typlen" -> o.typlen,
        "typbyval" -> o.typbyval,
        "typtype" -> o.typtype,
        "typcategory" -> o.typcategory,
        "typispreferred" -> o.typispreferred,
        "typisdefined" -> o.typisdefined,
        "typdelim" -> o.typdelim,
        "typrelid" -> o.typrelid,
        "typsubscript" -> o.typsubscript,
        "typelem" -> o.typelem,
        "typarray" -> o.typarray,
        "typinput" -> o.typinput,
        "typoutput" -> o.typoutput,
        "typreceive" -> o.typreceive,
        "typsend" -> o.typsend,
        "typmodin" -> o.typmodin,
        "typmodout" -> o.typmodout,
        "typanalyze" -> o.typanalyze,
        "typalign" -> o.typalign,
        "typstorage" -> o.typstorage,
        "typnotnull" -> o.typnotnull,
        "typbasetype" -> o.typbasetype,
        "typtypmod" -> o.typtypmod,
        "typndims" -> o.typndims,
        "typcollation" -> o.typcollation,
        "typdefaultbin" -> o.typdefaultbin,
        "typdefault" -> o.typdefault,
        "typacl" -> o.typacl
      )
  
    override def reads(json: JsValue): JsResult[PgTypeRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PgTypeRowUnsaved(
            typname = json.\("typname").as[String],
            typnamespace = json.\("typnamespace").as[/* oid */ Long],
            typowner = json.\("typowner").as[/* oid */ Long],
            typlen = json.\("typlen").as[Int],
            typbyval = json.\("typbyval").as[Boolean],
            typtype = json.\("typtype").as[String],
            typcategory = json.\("typcategory").as[String],
            typispreferred = json.\("typispreferred").as[Boolean],
            typisdefined = json.\("typisdefined").as[Boolean],
            typdelim = json.\("typdelim").as[String],
            typrelid = json.\("typrelid").as[/* oid */ Long],
            typsubscript = json.\("typsubscript").as[/* regproc */ PGobject],
            typelem = json.\("typelem").as[/* oid */ Long],
            typarray = json.\("typarray").as[/* oid */ Long],
            typinput = json.\("typinput").as[/* regproc */ PGobject],
            typoutput = json.\("typoutput").as[/* regproc */ PGobject],
            typreceive = json.\("typreceive").as[/* regproc */ PGobject],
            typsend = json.\("typsend").as[/* regproc */ PGobject],
            typmodin = json.\("typmodin").as[/* regproc */ PGobject],
            typmodout = json.\("typmodout").as[/* regproc */ PGobject],
            typanalyze = json.\("typanalyze").as[/* regproc */ PGobject],
            typalign = json.\("typalign").as[String],
            typstorage = json.\("typstorage").as[String],
            typnotnull = json.\("typnotnull").as[Boolean],
            typbasetype = json.\("typbasetype").as[/* oid */ Long],
            typtypmod = json.\("typtypmod").as[Int],
            typndims = json.\("typndims").as[Int],
            typcollation = json.\("typcollation").as[/* oid */ Long],
            typdefaultbin = json.\("typdefaultbin").toOption.map(_.as[/* pg_node_tree */ PGobject]),
            typdefault = json.\("typdefault").toOption.map(_.as[String]),
            typacl = json.\("typacl").toOption.map(_.as[Array[/* aclitem */ PGobject]])
          )
        )
      )
    }
  }
}
