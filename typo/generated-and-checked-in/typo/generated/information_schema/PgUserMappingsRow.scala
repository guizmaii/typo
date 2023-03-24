/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try
import typo.generated.pg_catalog.PgUserMappingRow

case class PgUserMappingsRow(
  /** Points to [[PgUserMappingRow.oid]] */
  oid: Long /* {"baseColumnName":"oid","baseRelationName":"pg_catalog.pg_user_mapping","columnClassName":"java.lang.Long","columnDisplaySize":10,"columnLabel":"oid","columnName":"oid","columnType":"BigInt","columnTypeName":"oid","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":10,"scale":0,"tableName":"pg_user_mapping"} */,
  /** Points to [[PgUserMappingRow.umoptions]] */
  umoptions: Option[Array[String]] /* {"baseColumnName":"umoptions","baseRelationName":"pg_catalog.pg_user_mapping","columnClassName":"java.sql.Array","columnDisplaySize":2147483647,"columnLabel":"umoptions","columnName":"umoptions","columnType":"Array","columnTypeName":"_text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_user_mapping"} */,
  /** Points to [[PgUserMappingRow.umuser]] */
  umuser: Long /* {"baseColumnName":"umuser","baseRelationName":"pg_catalog.pg_user_mapping","columnClassName":"java.lang.Long","columnDisplaySize":10,"columnLabel":"umuser","columnName":"umuser","columnType":"BigInt","columnTypeName":"oid","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":10,"scale":0,"tableName":"pg_user_mapping"} */,
  authorizationIdentifier: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"authorization_identifier","columnName":"authorization_identifier","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  /** Points to [[PgForeignServersRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[String] /* {"baseColumnName":"foreign_server_catalog","baseRelationName":"information_schema._pg_foreign_servers","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"foreign_server_catalog","columnName":"foreign_server_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_foreign_servers"} */,
  /** Points to [[PgForeignServersRow.foreignServerName]] */
  foreignServerName: Option[String] /* {"baseColumnName":"foreign_server_name","baseRelationName":"information_schema._pg_foreign_servers","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"foreign_server_name","columnName":"foreign_server_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_foreign_servers"} */,
  /** Points to [[PgForeignServersRow.authorizationIdentifier]] */
  srvowner: Option[String] /* {"baseColumnName":"authorization_identifier","baseRelationName":"information_schema._pg_foreign_servers","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"srvowner","columnName":"srvowner","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_foreign_servers"} */
)

object PgUserMappingsRow {
  implicit val rowParser: RowParser[PgUserMappingsRow] = { row =>
    Success(
      PgUserMappingsRow(
        oid = row[Long]("oid"),
        umoptions = row[Option[Array[String]]]("umoptions"),
        umuser = row[Long]("umuser"),
        authorizationIdentifier = row[/* unknown nullability */ Option[String]]("authorization_identifier"),
        foreignServerCatalog = row[Option[String]]("foreign_server_catalog"),
        foreignServerName = row[Option[String]]("foreign_server_name"),
        srvowner = row[Option[String]]("srvowner")
      )
    )
  }

  implicit val oFormat: OFormat[PgUserMappingsRow] = new OFormat[PgUserMappingsRow]{
    override def writes(o: PgUserMappingsRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
      "umoptions" -> o.umoptions,
      "umuser" -> o.umuser,
      "authorization_identifier" -> o.authorizationIdentifier,
      "foreign_server_catalog" -> o.foreignServerCatalog,
      "foreign_server_name" -> o.foreignServerName,
      "srvowner" -> o.srvowner
      )

    override def reads(json: JsValue): JsResult[PgUserMappingsRow] = {
      JsResult.fromTry(
        Try(
          PgUserMappingsRow(
            oid = json.\("oid").as[Long],
            umoptions = json.\("umoptions").toOption.map(_.as[Array[String]]),
            umuser = json.\("umuser").as[Long],
            authorizationIdentifier = json.\("authorization_identifier").toOption.map(_.as[String]),
            foreignServerCatalog = json.\("foreign_server_catalog").toOption.map(_.as[String]),
            foreignServerName = json.\("foreign_server_name").toOption.map(_.as[String]),
            srvowner = json.\("srvowner").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
