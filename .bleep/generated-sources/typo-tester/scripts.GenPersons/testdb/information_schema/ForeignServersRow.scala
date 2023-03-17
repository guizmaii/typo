package testdb
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ForeignServersRow(
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignServerName]] */
  foreignServerName: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignDataWrapperCatalog]] */
  foreignDataWrapperCatalog: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignDataWrapperName]] */
  foreignDataWrapperName: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignServerType]] */
  foreignServerType: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.foreignServerVersion]] */
  foreignServerVersion: Option[String],
  /** Points to [[testdb.information_schema.PgForeignServersRow.authorizationIdentifier]] */
  authorizationIdentifier: Option[String]
)

object ForeignServersRow {
  implicit val rowParser: RowParser[ForeignServersRow] = { row =>
    Success(
      ForeignServersRow(
        foreignServerCatalog = row[Option[String]]("foreign_server_catalog"),
        foreignServerName = row[Option[String]]("foreign_server_name"),
        foreignDataWrapperCatalog = row[Option[String]]("foreign_data_wrapper_catalog"),
        foreignDataWrapperName = row[Option[String]]("foreign_data_wrapper_name"),
        foreignServerType = row[Option[String]]("foreign_server_type"),
        foreignServerVersion = row[Option[String]]("foreign_server_version"),
        authorizationIdentifier = row[Option[String]]("authorization_identifier")
      )
    )
  }

  implicit val oFormat: OFormat[ForeignServersRow] = new OFormat[ForeignServersRow]{
    override def writes(o: ForeignServersRow): JsObject =
      Json.obj(
        "foreign_server_catalog" -> o.foreignServerCatalog,
      "foreign_server_name" -> o.foreignServerName,
      "foreign_data_wrapper_catalog" -> o.foreignDataWrapperCatalog,
      "foreign_data_wrapper_name" -> o.foreignDataWrapperName,
      "foreign_server_type" -> o.foreignServerType,
      "foreign_server_version" -> o.foreignServerVersion,
      "authorization_identifier" -> o.authorizationIdentifier
      )

    override def reads(json: JsValue): JsResult[ForeignServersRow] = {
      JsResult.fromTry(
        Try(
          ForeignServersRow(
            foreignServerCatalog = json.\("foreign_server_catalog").toOption.map(_.as[String]),
            foreignServerName = json.\("foreign_server_name").toOption.map(_.as[String]),
            foreignDataWrapperCatalog = json.\("foreign_data_wrapper_catalog").toOption.map(_.as[String]),
            foreignDataWrapperName = json.\("foreign_data_wrapper_name").toOption.map(_.as[String]),
            foreignServerType = json.\("foreign_server_type").toOption.map(_.as[String]),
            foreignServerVersion = json.\("foreign_server_version").toOption.map(_.as[String]),
            authorizationIdentifier = json.\("authorization_identifier").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
