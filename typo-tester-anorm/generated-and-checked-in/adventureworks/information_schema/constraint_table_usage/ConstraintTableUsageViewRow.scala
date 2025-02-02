/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package constraint_table_usage

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

case class ConstraintTableUsageViewRow(
  tableCatalog: /* nullability unknown */ Option[String],
  tableSchema: /* nullability unknown */ Option[String],
  tableName: /* nullability unknown */ Option[String],
  constraintCatalog: /* nullability unknown */ Option[String],
  constraintSchema: /* nullability unknown */ Option[String],
  constraintName: /* nullability unknown */ Option[String]
)

object ConstraintTableUsageViewRow {
  implicit lazy val reads: Reads[ConstraintTableUsageViewRow] = Reads[ConstraintTableUsageViewRow](json => JsResult.fromTry(
      Try(
        ConstraintTableUsageViewRow(
          tableCatalog = json.\("table_catalog").toOption.map(_.as(Reads.StringReads)),
          tableSchema = json.\("table_schema").toOption.map(_.as(Reads.StringReads)),
          tableName = json.\("table_name").toOption.map(_.as(Reads.StringReads)),
          constraintCatalog = json.\("constraint_catalog").toOption.map(_.as(Reads.StringReads)),
          constraintSchema = json.\("constraint_schema").toOption.map(_.as(Reads.StringReads)),
          constraintName = json.\("constraint_name").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[ConstraintTableUsageViewRow] = RowParser[ConstraintTableUsageViewRow] { row =>
    Success(
      ConstraintTableUsageViewRow(
        tableCatalog = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        tableSchema = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        tableName = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        constraintCatalog = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        constraintSchema = row(idx + 4)(Column.columnToOption(Column.columnToString)),
        constraintName = row(idx + 5)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[ConstraintTableUsageViewRow] = OWrites[ConstraintTableUsageViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "table_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableCatalog),
      "table_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableSchema),
      "table_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.tableName),
      "constraint_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.constraintCatalog),
      "constraint_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.constraintSchema),
      "constraint_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.constraintName)
    ))
  )
}
