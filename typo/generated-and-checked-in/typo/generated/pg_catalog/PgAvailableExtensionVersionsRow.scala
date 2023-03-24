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

case class PgAvailableExtensionVersionsRow(
  name: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"name","columnName":"name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  version: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"version","columnName":"version","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  installed: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"installed","columnName":"installed","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  superuser: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"superuser","columnName":"superuser","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  trusted: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"trusted","columnName":"trusted","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  relocatable: /* unknown nullability */ Option[Boolean] /* {"columnClassName":"java.lang.Boolean","columnDisplaySize":1,"columnLabel":"relocatable","columnName":"relocatable","columnType":"Bit","columnTypeName":"bool","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":1,"scale":0} */,
  schema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"schema","columnName":"schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  requires: /* unknown nullability */ Option[Array[String]] /* {"columnClassName":"java.sql.Array","columnDisplaySize":2147483647,"columnLabel":"requires","columnName":"requires","columnType":"Array","columnTypeName":"_name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  comment: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"comment","columnName":"comment","columnType":"VarChar","columnTypeName":"text","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object PgAvailableExtensionVersionsRow {
  implicit val rowParser: RowParser[PgAvailableExtensionVersionsRow] = { row =>
    Success(
      PgAvailableExtensionVersionsRow(
        name = row[/* unknown nullability */ Option[String]]("name"),
        version = row[/* unknown nullability */ Option[String]]("version"),
        installed = row[/* unknown nullability */ Option[Boolean]]("installed"),
        superuser = row[/* unknown nullability */ Option[Boolean]]("superuser"),
        trusted = row[/* unknown nullability */ Option[Boolean]]("trusted"),
        relocatable = row[/* unknown nullability */ Option[Boolean]]("relocatable"),
        schema = row[/* unknown nullability */ Option[String]]("schema"),
        requires = row[/* unknown nullability */ Option[Array[String]]]("requires"),
        comment = row[/* unknown nullability */ Option[String]]("comment")
      )
    )
  }

  implicit val oFormat: OFormat[PgAvailableExtensionVersionsRow] = new OFormat[PgAvailableExtensionVersionsRow]{
    override def writes(o: PgAvailableExtensionVersionsRow): JsObject =
      Json.obj(
        "name" -> o.name,
      "version" -> o.version,
      "installed" -> o.installed,
      "superuser" -> o.superuser,
      "trusted" -> o.trusted,
      "relocatable" -> o.relocatable,
      "schema" -> o.schema,
      "requires" -> o.requires,
      "comment" -> o.comment
      )

    override def reads(json: JsValue): JsResult[PgAvailableExtensionVersionsRow] = {
      JsResult.fromTry(
        Try(
          PgAvailableExtensionVersionsRow(
            name = json.\("name").toOption.map(_.as[String]),
            version = json.\("version").toOption.map(_.as[String]),
            installed = json.\("installed").toOption.map(_.as[Boolean]),
            superuser = json.\("superuser").toOption.map(_.as[Boolean]),
            trusted = json.\("trusted").toOption.map(_.as[Boolean]),
            relocatable = json.\("relocatable").toOption.map(_.as[Boolean]),
            schema = json.\("schema").toOption.map(_.as[String]),
            requires = json.\("requires").toOption.map(_.as[Array[String]]),
            comment = json.\("comment").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
