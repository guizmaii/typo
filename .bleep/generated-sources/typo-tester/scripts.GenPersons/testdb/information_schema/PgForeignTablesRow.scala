package testdb.information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgForeignTablesRow(
  foreignTableCatalog: /* unknown nullability */ Option[String],
  foreignTableSchema: /* unknown nullability */ Option[String],
  foreignTableName: /* unknown nullability */ Option[String],
  /** Points to [[testdb.pg_catalog.PgForeignTableRow.ftoptions]] */
  ftoptions: Option[Array[String]],
  foreignServerCatalog: /* unknown nullability */ Option[String],
  foreignServerName: /* unknown nullability */ Option[String],
  authorizationIdentifier: /* unknown nullability */ Option[String]
)

object PgForeignTablesRow {
  implicit val rowParser: RowParser[PgForeignTablesRow] = { row =>
    Success(
      PgForeignTablesRow(
        foreignTableCatalog = row[/* unknown nullability */ Option[String]]("foreign_table_catalog"),
        foreignTableSchema = row[/* unknown nullability */ Option[String]]("foreign_table_schema"),
        foreignTableName = row[/* unknown nullability */ Option[String]]("foreign_table_name"),
        ftoptions = row[Option[Array[String]]]("ftoptions"),
        foreignServerCatalog = row[/* unknown nullability */ Option[String]]("foreign_server_catalog"),
        foreignServerName = row[/* unknown nullability */ Option[String]]("foreign_server_name"),
        authorizationIdentifier = row[/* unknown nullability */ Option[String]]("authorization_identifier")
      )
    )
  }

  implicit val oFormat: OFormat[PgForeignTablesRow] = new OFormat[PgForeignTablesRow]{
    override def writes(o: PgForeignTablesRow): JsObject =
      Json.obj(
        "foreign_table_catalog" -> o.foreignTableCatalog,
      "foreign_table_schema" -> o.foreignTableSchema,
      "foreign_table_name" -> o.foreignTableName,
      "ftoptions" -> o.ftoptions,
      "foreign_server_catalog" -> o.foreignServerCatalog,
      "foreign_server_name" -> o.foreignServerName,
      "authorization_identifier" -> o.authorizationIdentifier
      )

    override def reads(json: JsValue): JsResult[PgForeignTablesRow] = {
      JsResult.fromTry(
        Try(
          PgForeignTablesRow(
            foreignTableCatalog = json.\("foreign_table_catalog").toOption.map(_.as[String]),
            foreignTableSchema = json.\("foreign_table_schema").toOption.map(_.as[String]),
            foreignTableName = json.\("foreign_table_name").toOption.map(_.as[String]),
            ftoptions = json.\("ftoptions").toOption.map(_.as[Array[String]]),
            foreignServerCatalog = json.\("foreign_server_catalog").toOption.map(_.as[String]),
            foreignServerName = json.\("foreign_server_name").toOption.map(_.as[String]),
            authorizationIdentifier = json.\("authorization_identifier").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
