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

case class SchemataRow(
  catalogName: /* unknown nullability */ Option[String],
  schemaName: /* unknown nullability */ Option[String],
  schemaOwner: /* unknown nullability */ Option[String],
  defaultCharacterSetCatalog: /* unknown nullability */ Option[String],
  defaultCharacterSetSchema: /* unknown nullability */ Option[String],
  defaultCharacterSetName: /* unknown nullability */ Option[String],
  sqlPath: /* unknown nullability */ Option[String]
)

object SchemataRow {
  implicit val rowParser: RowParser[SchemataRow] = { row =>
    Success(
      SchemataRow(
        catalogName = row[/* unknown nullability */ Option[String]]("catalog_name"),
        schemaName = row[/* unknown nullability */ Option[String]]("schema_name"),
        schemaOwner = row[/* unknown nullability */ Option[String]]("schema_owner"),
        defaultCharacterSetCatalog = row[/* unknown nullability */ Option[String]]("default_character_set_catalog"),
        defaultCharacterSetSchema = row[/* unknown nullability */ Option[String]]("default_character_set_schema"),
        defaultCharacterSetName = row[/* unknown nullability */ Option[String]]("default_character_set_name"),
        sqlPath = row[/* unknown nullability */ Option[String]]("sql_path")
      )
    )
  }

  implicit val oFormat: OFormat[SchemataRow] = new OFormat[SchemataRow]{
    override def writes(o: SchemataRow): JsObject =
      Json.obj(
        "catalog_name" -> o.catalogName,
      "schema_name" -> o.schemaName,
      "schema_owner" -> o.schemaOwner,
      "default_character_set_catalog" -> o.defaultCharacterSetCatalog,
      "default_character_set_schema" -> o.defaultCharacterSetSchema,
      "default_character_set_name" -> o.defaultCharacterSetName,
      "sql_path" -> o.sqlPath
      )

    override def reads(json: JsValue): JsResult[SchemataRow] = {
      JsResult.fromTry(
        Try(
          SchemataRow(
            catalogName = json.\("catalog_name").toOption.map(_.as[String]),
            schemaName = json.\("schema_name").toOption.map(_.as[String]),
            schemaOwner = json.\("schema_owner").toOption.map(_.as[String]),
            defaultCharacterSetCatalog = json.\("default_character_set_catalog").toOption.map(_.as[String]),
            defaultCharacterSetSchema = json.\("default_character_set_schema").toOption.map(_.as[String]),
            defaultCharacterSetName = json.\("default_character_set_name").toOption.map(_.as[String]),
            sqlPath = json.\("sql_path").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
