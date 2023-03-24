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
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgRolesRow(
  /** Points to [[PgAuthidRow.rolname]] */
  rolname: String /* {"baseColumnName":"rolname","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"rolname","columnName":"rolname","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolsuper]] */
  rolsuper: Boolean /* {"baseColumnName":"rolsuper","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolsuper","columnName":"rolsuper","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolinherit]] */
  rolinherit: Boolean /* {"baseColumnName":"rolinherit","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolinherit","columnName":"rolinherit","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolcreaterole]] */
  rolcreaterole: Boolean /* {"baseColumnName":"rolcreaterole","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolcreaterole","columnName":"rolcreaterole","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolcreatedb]] */
  rolcreatedb: Boolean /* {"baseColumnName":"rolcreatedb","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolcreatedb","columnName":"rolcreatedb","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolcanlogin]] */
  rolcanlogin: Boolean /* {"baseColumnName":"rolcanlogin","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolcanlogin","columnName":"rolcanlogin","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolreplication]] */
  rolreplication: Boolean /* {"baseColumnName":"rolreplication","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolreplication","columnName":"rolreplication","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolconnlimit]] */
  rolconnlimit: Int /* {"baseColumnName":"rolconnlimit","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"rolconnlimit","columnName":"rolconnlimit","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0,"tableName":"pg_authid"} */,
  rolpassword: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"rolpassword","columnName":"rolpassword","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  /** Points to [[PgAuthidRow.rolvaliduntil]] */
  rolvaliduntil: Option[LocalDateTime] /* {"baseColumnName":"rolvaliduntil","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.sql.Timestamp","columnDisplaySize":35,"columnLabel":"rolvaliduntil","columnName":"rolvaliduntil","columnType":"Timestamp","columnTypeName":"timestamptz","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":35,"scale":6,"tableName":"pg_authid"} */,
  /** Points to [[PgAuthidRow.rolbypassrls]] */
  rolbypassrls: Boolean /* {"baseColumnName":"rolbypassrls","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"rolbypassrls","columnName":"rolbypassrls","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_authid"} */,
  /** Points to [[PgDbRoleSettingRow.setconfig]] */
  rolconfig: Option[Array[String]] /* {"baseColumnName":"setconfig","baseRelationName":"pg_catalog.pg_db_role_setting","columnClassName":"java.sql.Array","columnDisplaySize":2147483647,"columnLabel":"rolconfig","columnName":"rolconfig","columnType":"Array","columnTypeName":"_text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_db_role_setting"} */,
  /** Points to [[PgAuthidRow.oid]] */
  oid: Long /* {"baseColumnName":"oid","baseRelationName":"pg_catalog.pg_authid","columnClassName":"java.lang.Long","columnDisplaySize":10,"columnLabel":"oid","columnName":"oid","columnType":"BigInt","columnTypeName":"oid","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":10,"scale":0,"tableName":"pg_authid"} */
)

object PgRolesRow {
  implicit val rowParser: RowParser[PgRolesRow] = { row =>
    Success(
      PgRolesRow(
        rolname = row[String]("rolname"),
        rolsuper = row[Boolean]("rolsuper"),
        rolinherit = row[Boolean]("rolinherit"),
        rolcreaterole = row[Boolean]("rolcreaterole"),
        rolcreatedb = row[Boolean]("rolcreatedb"),
        rolcanlogin = row[Boolean]("rolcanlogin"),
        rolreplication = row[Boolean]("rolreplication"),
        rolconnlimit = row[Int]("rolconnlimit"),
        rolpassword = row[/* unknown nullability */ Option[String]]("rolpassword"),
        rolvaliduntil = row[Option[LocalDateTime]]("rolvaliduntil"),
        rolbypassrls = row[Boolean]("rolbypassrls"),
        rolconfig = row[Option[Array[String]]]("rolconfig"),
        oid = row[Long]("oid")
      )
    )
  }

  implicit val oFormat: OFormat[PgRolesRow] = new OFormat[PgRolesRow]{
    override def writes(o: PgRolesRow): JsObject =
      Json.obj(
        "rolname" -> o.rolname,
      "rolsuper" -> o.rolsuper,
      "rolinherit" -> o.rolinherit,
      "rolcreaterole" -> o.rolcreaterole,
      "rolcreatedb" -> o.rolcreatedb,
      "rolcanlogin" -> o.rolcanlogin,
      "rolreplication" -> o.rolreplication,
      "rolconnlimit" -> o.rolconnlimit,
      "rolpassword" -> o.rolpassword,
      "rolvaliduntil" -> o.rolvaliduntil,
      "rolbypassrls" -> o.rolbypassrls,
      "rolconfig" -> o.rolconfig,
      "oid" -> o.oid
      )

    override def reads(json: JsValue): JsResult[PgRolesRow] = {
      JsResult.fromTry(
        Try(
          PgRolesRow(
            rolname = json.\("rolname").as[String],
            rolsuper = json.\("rolsuper").as[Boolean],
            rolinherit = json.\("rolinherit").as[Boolean],
            rolcreaterole = json.\("rolcreaterole").as[Boolean],
            rolcreatedb = json.\("rolcreatedb").as[Boolean],
            rolcanlogin = json.\("rolcanlogin").as[Boolean],
            rolreplication = json.\("rolreplication").as[Boolean],
            rolconnlimit = json.\("rolconnlimit").as[Int],
            rolpassword = json.\("rolpassword").toOption.map(_.as[String]),
            rolvaliduntil = json.\("rolvaliduntil").toOption.map(_.as[LocalDateTime]),
            rolbypassrls = json.\("rolbypassrls").as[Boolean],
            rolconfig = json.\("rolconfig").toOption.map(_.as[Array[String]]),
            oid = json.\("oid").as[Long]
          )
        )
      )
    }
  }
}
