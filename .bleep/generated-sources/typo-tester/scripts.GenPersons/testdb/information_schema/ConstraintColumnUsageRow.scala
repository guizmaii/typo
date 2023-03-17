package testdb.information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ConstraintColumnUsageRow(
  tableCatalog: /* unknown nullability */ Option[String],
  tableSchema: /* unknown nullability */ Option[String],
  tableName: /* unknown nullability */ Option[String],
  columnName: /* unknown nullability */ Option[String],
  constraintCatalog: /* unknown nullability */ Option[String],
  constraintSchema: /* unknown nullability */ Option[String],
  constraintName: /* unknown nullability */ Option[String]
)

object ConstraintColumnUsageRow {
  implicit val rowParser: RowParser[ConstraintColumnUsageRow] = { row =>
    Success(
      ConstraintColumnUsageRow(
        tableCatalog = row[/* unknown nullability */ Option[String]]("table_catalog"),
        tableSchema = row[/* unknown nullability */ Option[String]]("table_schema"),
        tableName = row[/* unknown nullability */ Option[String]]("table_name"),
        columnName = row[/* unknown nullability */ Option[String]]("column_name"),
        constraintCatalog = row[/* unknown nullability */ Option[String]]("constraint_catalog"),
        constraintSchema = row[/* unknown nullability */ Option[String]]("constraint_schema"),
        constraintName = row[/* unknown nullability */ Option[String]]("constraint_name")
      )
    )
  }

  implicit val oFormat: OFormat[ConstraintColumnUsageRow] = new OFormat[ConstraintColumnUsageRow]{
    override def writes(o: ConstraintColumnUsageRow): JsObject =
      Json.obj(
        "table_catalog" -> o.tableCatalog,
      "table_schema" -> o.tableSchema,
      "table_name" -> o.tableName,
      "column_name" -> o.columnName,
      "constraint_catalog" -> o.constraintCatalog,
      "constraint_schema" -> o.constraintSchema,
      "constraint_name" -> o.constraintName
      )

    override def reads(json: JsValue): JsResult[ConstraintColumnUsageRow] = {
      JsResult.fromTry(
        Try(
          ConstraintColumnUsageRow(
            tableCatalog = json.\("table_catalog").toOption.map(_.as[String]),
            tableSchema = json.\("table_schema").toOption.map(_.as[String]),
            tableName = json.\("table_name").toOption.map(_.as[String]),
            columnName = json.\("column_name").toOption.map(_.as[String]),
            constraintCatalog = json.\("constraint_catalog").toOption.map(_.as[String]),
            constraintSchema = json.\("constraint_schema").toOption.map(_.as[String]),
            constraintName = json.\("constraint_name").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
