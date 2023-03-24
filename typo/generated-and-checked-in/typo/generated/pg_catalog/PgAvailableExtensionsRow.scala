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

case class PgAvailableExtensionsRow(
  name: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"name","columnName":"name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  defaultVersion: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"default_version","columnName":"default_version","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  /** Points to [[PgExtensionRow.extversion]] */
  installedVersion: String /* {"baseColumnName":"extversion","baseRelationName":"pg_catalog.pg_extension","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"installed_version","columnName":"installed_version","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NoNulls","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"pg_extension"} */,
  comment: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"comment","columnName":"comment","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object PgAvailableExtensionsRow {
  implicit val rowParser: RowParser[PgAvailableExtensionsRow] = { row =>
    Success(
      PgAvailableExtensionsRow(
        name = row[/* unknown nullability */ Option[String]]("name"),
        defaultVersion = row[/* unknown nullability */ Option[String]]("default_version"),
        installedVersion = row[String]("installed_version"),
        comment = row[/* unknown nullability */ Option[String]]("comment")
      )
    )
  }

  implicit val oFormat: OFormat[PgAvailableExtensionsRow] = new OFormat[PgAvailableExtensionsRow]{
    override def writes(o: PgAvailableExtensionsRow): JsObject =
      Json.obj(
        "name" -> o.name,
      "default_version" -> o.defaultVersion,
      "installed_version" -> o.installedVersion,
      "comment" -> o.comment
      )

    override def reads(json: JsValue): JsResult[PgAvailableExtensionsRow] = {
      JsResult.fromTry(
        Try(
          PgAvailableExtensionsRow(
            name = json.\("name").toOption.map(_.as[String]),
            defaultVersion = json.\("default_version").toOption.map(_.as[String]),
            installedVersion = json.\("installed_version").as[String],
            comment = json.\("comment").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
