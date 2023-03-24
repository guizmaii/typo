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

case class PgMatviewsRow(
  /** Points to [[PgNamespaceRow.nspname]] */
  schemaname: String /* {"baseColumnName":"nspname","baseRelationName":"pg_catalog.pg_namespace","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"schemaname","columnName":"schemaname","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_namespace"} */,
  /** Points to [[PgClassRow.relname]] */
  matviewname: String /* {"baseColumnName":"relname","baseRelationName":"pg_catalog.pg_class","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"matviewname","columnName":"matviewname","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_class"} */,
  matviewowner: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"matviewowner","columnName":"matviewowner","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  /** Points to [[PgTablespaceRow.spcname]] */
  tablespace: String /* {"baseColumnName":"spcname","baseRelationName":"pg_catalog.pg_tablespace","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"tablespace","columnName":"tablespace","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_tablespace"} */,
  /** Points to [[PgClassRow.relhasindex]] */
  hasindexes: Boolean /* {"baseColumnName":"relhasindex","baseRelationName":"pg_catalog.pg_class","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"hasindexes","columnName":"hasindexes","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_class"} */,
  /** Points to [[PgClassRow.relispopulated]] */
  ispopulated: Boolean /* {"baseColumnName":"relispopulated","baseRelationName":"pg_catalog.pg_class","columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"ispopulated","columnName":"ispopulated","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0,"tableName":"pg_class"} */,
  definition: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"definition","columnName":"definition","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object PgMatviewsRow {
  implicit val rowParser: RowParser[PgMatviewsRow] = { row =>
    Success(
      PgMatviewsRow(
        schemaname = row[String]("schemaname"),
        matviewname = row[String]("matviewname"),
        matviewowner = row[/* unknown nullability */ Option[String]]("matviewowner"),
        tablespace = row[String]("tablespace"),
        hasindexes = row[Boolean]("hasindexes"),
        ispopulated = row[Boolean]("ispopulated"),
        definition = row[/* unknown nullability */ Option[String]]("definition")
      )
    )
  }

  implicit val oFormat: OFormat[PgMatviewsRow] = new OFormat[PgMatviewsRow]{
    override def writes(o: PgMatviewsRow): JsObject =
      Json.obj(
        "schemaname" -> o.schemaname,
      "matviewname" -> o.matviewname,
      "matviewowner" -> o.matviewowner,
      "tablespace" -> o.tablespace,
      "hasindexes" -> o.hasindexes,
      "ispopulated" -> o.ispopulated,
      "definition" -> o.definition
      )

    override def reads(json: JsValue): JsResult[PgMatviewsRow] = {
      JsResult.fromTry(
        Try(
          PgMatviewsRow(
            schemaname = json.\("schemaname").as[String],
            matviewname = json.\("matviewname").as[String],
            matviewowner = json.\("matviewowner").toOption.map(_.as[String]),
            tablespace = json.\("tablespace").as[String],
            hasindexes = json.\("hasindexes").as[Boolean],
            ispopulated = json.\("ispopulated").as[Boolean],
            definition = json.\("definition").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
