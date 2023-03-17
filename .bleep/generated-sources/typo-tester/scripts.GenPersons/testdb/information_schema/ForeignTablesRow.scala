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

case class ForeignTablesRow(
  /** Points to [[testdb.information_schema.PgForeignTablesRow.foreignTableCatalog]] */
  foreignTableCatalog: Option[String],
  /** Points to [[testdb.information_schema.PgForeignTablesRow.foreignTableSchema]] */
  foreignTableSchema: Option[String],
  /** Points to [[testdb.information_schema.PgForeignTablesRow.foreignTableName]] */
  foreignTableName: Option[String],
  /** Points to [[testdb.information_schema.PgForeignTablesRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[String],
  /** Points to [[testdb.information_schema.PgForeignTablesRow.foreignServerName]] */
  foreignServerName: Option[String]
)

object ForeignTablesRow {
  implicit val rowParser: RowParser[ForeignTablesRow] = { row =>
    Success(
      ForeignTablesRow(
        foreignTableCatalog = row[Option[String]]("foreign_table_catalog"),
        foreignTableSchema = row[Option[String]]("foreign_table_schema"),
        foreignTableName = row[Option[String]]("foreign_table_name"),
        foreignServerCatalog = row[Option[String]]("foreign_server_catalog"),
        foreignServerName = row[Option[String]]("foreign_server_name")
      )
    )
  }

  implicit val oFormat: OFormat[ForeignTablesRow] = new OFormat[ForeignTablesRow]{
    override def writes(o: ForeignTablesRow): JsObject =
      Json.obj(
        "foreign_table_catalog" -> o.foreignTableCatalog,
      "foreign_table_schema" -> o.foreignTableSchema,
      "foreign_table_name" -> o.foreignTableName,
      "foreign_server_catalog" -> o.foreignServerCatalog,
      "foreign_server_name" -> o.foreignServerName
      )

    override def reads(json: JsValue): JsResult[ForeignTablesRow] = {
      JsResult.fromTry(
        Try(
          ForeignTablesRow(
            foreignTableCatalog = json.\("foreign_table_catalog").toOption.map(_.as[String]),
            foreignTableSchema = json.\("foreign_table_schema").toOption.map(_.as[String]),
            foreignTableName = json.\("foreign_table_name").toOption.map(_.as[String]),
            foreignServerCatalog = json.\("foreign_server_catalog").toOption.map(_.as[String]),
            foreignServerName = json.\("foreign_server_name").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
