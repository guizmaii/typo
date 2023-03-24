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

case class UserMappingOptionsRow(
  /** Points to [[PgUserMappingsRow.authorizationIdentifier]] */
  authorizationIdentifier: Option[String] /* {"baseColumnName":"authorization_identifier","baseRelationName":"information_schema._pg_user_mappings","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"authorization_identifier","columnName":"authorization_identifier","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_user_mappings"} */,
  /** Points to [[PgUserMappingsRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[String] /* {"baseColumnName":"foreign_server_catalog","baseRelationName":"information_schema._pg_user_mappings","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"foreign_server_catalog","columnName":"foreign_server_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_user_mappings"} */,
  /** Points to [[PgUserMappingsRow.foreignServerName]] */
  foreignServerName: Option[String] /* {"baseColumnName":"foreign_server_name","baseRelationName":"information_schema._pg_user_mappings","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"foreign_server_name","columnName":"foreign_server_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"_pg_user_mappings"} */,
  optionName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"option_name","columnName":"option_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  optionValue: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"option_value","columnName":"option_value","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object UserMappingOptionsRow {
  implicit val rowParser: RowParser[UserMappingOptionsRow] = { row =>
    Success(
      UserMappingOptionsRow(
        authorizationIdentifier = row[Option[String]]("authorization_identifier"),
        foreignServerCatalog = row[Option[String]]("foreign_server_catalog"),
        foreignServerName = row[Option[String]]("foreign_server_name"),
        optionName = row[/* unknown nullability */ Option[String]]("option_name"),
        optionValue = row[/* unknown nullability */ Option[String]]("option_value")
      )
    )
  }

  implicit val oFormat: OFormat[UserMappingOptionsRow] = new OFormat[UserMappingOptionsRow]{
    override def writes(o: UserMappingOptionsRow): JsObject =
      Json.obj(
        "authorization_identifier" -> o.authorizationIdentifier,
      "foreign_server_catalog" -> o.foreignServerCatalog,
      "foreign_server_name" -> o.foreignServerName,
      "option_name" -> o.optionName,
      "option_value" -> o.optionValue
      )

    override def reads(json: JsValue): JsResult[UserMappingOptionsRow] = {
      JsResult.fromTry(
        Try(
          UserMappingOptionsRow(
            authorizationIdentifier = json.\("authorization_identifier").toOption.map(_.as[String]),
            foreignServerCatalog = json.\("foreign_server_catalog").toOption.map(_.as[String]),
            foreignServerName = json.\("foreign_server_name").toOption.map(_.as[String]),
            optionName = json.\("option_name").toOption.map(_.as[String]),
            optionValue = json.\("option_value").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
