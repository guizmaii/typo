/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package view_column_usage

import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class ViewColumnUsageViewRow(
  viewCatalog: /* nullability unknown */ Option[String],
  viewSchema: /* nullability unknown */ Option[String],
  viewName: /* nullability unknown */ Option[String],
  tableCatalog: /* nullability unknown */ Option[String],
  tableSchema: /* nullability unknown */ Option[String],
  tableName: /* nullability unknown */ Option[String],
  columnName: /* nullability unknown */ Option[String]
)

object ViewColumnUsageViewRow {
  implicit lazy val reads: Reads[ViewColumnUsageViewRow] = Reads[ViewColumnUsageViewRow](json => JsResult.fromTry(
      Try(
        ViewColumnUsageViewRow(
          viewCatalog = json.\("view_catalog").toOption.map(_.as(Reads.StringReads)),
          viewSchema = json.\("view_schema").toOption.map(_.as(Reads.StringReads)),
          viewName = json.\("view_name").toOption.map(_.as(Reads.StringReads)),
          tableCatalog = json.\("table_catalog").toOption.map(_.as(Reads.StringReads)),
          tableSchema = json.\("table_schema").toOption.map(_.as(Reads.StringReads)),
          tableName = json.\("table_name").toOption.map(_.as(Reads.StringReads)),
          columnName = json.\("column_name").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[ViewColumnUsageViewRow] = RowParser[ViewColumnUsageViewRow] { row =>
    Success(
      ViewColumnUsageViewRow(
        viewCatalog = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        viewSchema = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        viewName = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        tableCatalog = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        tableSchema = row(idx + 4)(Column.columnToOption(Column.columnToString)),
        tableName = row(idx + 5)(Column.columnToOption(Column.columnToString)),
        columnName = row(idx + 6)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[ViewColumnUsageViewRow] = OWrites[ViewColumnUsageViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "view_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.viewCatalog),
      "view_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.viewSchema),
      "view_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.viewName),
      "table_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableCatalog),
      "table_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableSchema),
      "table_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableName),
      "column_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.columnName)
    ))
  )
}
