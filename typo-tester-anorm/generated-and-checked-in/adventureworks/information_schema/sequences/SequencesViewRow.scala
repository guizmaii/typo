/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sequences

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

case class SequencesViewRow(
  sequenceCatalog: /* nullability unknown */ Option[String],
  sequenceSchema: /* nullability unknown */ Option[String],
  sequenceName: /* nullability unknown */ Option[String],
  dataType: /* nullability unknown */ Option[String],
  numericPrecision: /* nullability unknown */ Option[Int],
  numericPrecisionRadix: /* nullability unknown */ Option[Int],
  numericScale: /* nullability unknown */ Option[Int],
  startValue: /* nullability unknown */ Option[String],
  minimumValue: /* nullability unknown */ Option[String],
  maximumValue: /* nullability unknown */ Option[String],
  increment: /* nullability unknown */ Option[String],
  cycleOption: /* nullability unknown */ Option[/* max 3 chars */ String]
)

object SequencesViewRow {
  implicit lazy val reads: Reads[SequencesViewRow] = Reads[SequencesViewRow](json => JsResult.fromTry(
      Try(
        SequencesViewRow(
          sequenceCatalog = json.\("sequence_catalog").toOption.map(_.as(Reads.StringReads)),
          sequenceSchema = json.\("sequence_schema").toOption.map(_.as(Reads.StringReads)),
          sequenceName = json.\("sequence_name").toOption.map(_.as(Reads.StringReads)),
          dataType = json.\("data_type").toOption.map(_.as(Reads.StringReads)),
          numericPrecision = json.\("numeric_precision").toOption.map(_.as(Reads.IntReads)),
          numericPrecisionRadix = json.\("numeric_precision_radix").toOption.map(_.as(Reads.IntReads)),
          numericScale = json.\("numeric_scale").toOption.map(_.as(Reads.IntReads)),
          startValue = json.\("start_value").toOption.map(_.as(Reads.StringReads)),
          minimumValue = json.\("minimum_value").toOption.map(_.as(Reads.StringReads)),
          maximumValue = json.\("maximum_value").toOption.map(_.as(Reads.StringReads)),
          increment = json.\("increment").toOption.map(_.as(Reads.StringReads)),
          cycleOption = json.\("cycle_option").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SequencesViewRow] = RowParser[SequencesViewRow] { row =>
    Success(
      SequencesViewRow(
        sequenceCatalog = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        sequenceSchema = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        sequenceName = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        dataType = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        numericPrecision = row(idx + 4)(Column.columnToOption(Column.columnToInt)),
        numericPrecisionRadix = row(idx + 5)(Column.columnToOption(Column.columnToInt)),
        numericScale = row(idx + 6)(Column.columnToOption(Column.columnToInt)),
        startValue = row(idx + 7)(Column.columnToOption(Column.columnToString)),
        minimumValue = row(idx + 8)(Column.columnToOption(Column.columnToString)),
        maximumValue = row(idx + 9)(Column.columnToOption(Column.columnToString)),
        increment = row(idx + 10)(Column.columnToOption(Column.columnToString)),
        cycleOption = row(idx + 11)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[SequencesViewRow] = OWrites[SequencesViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "sequence_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.sequenceCatalog),
      "sequence_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.sequenceSchema),
      "sequence_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.sequenceName),
      "data_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.dataType),
      "numeric_precision" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericPrecision),
      "numeric_precision_radix" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericPrecisionRadix),
      "numeric_scale" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericScale),
      "start_value" -> Writes.OptionWrites(Writes.StringWrites).writes(o.startValue),
      "minimum_value" -> Writes.OptionWrites(Writes.StringWrites).writes(o.minimumValue),
      "maximum_value" -> Writes.OptionWrites(Writes.StringWrites).writes(o.maximumValue),
      "increment" -> Writes.OptionWrites(Writes.StringWrites).writes(o.increment),
      "cycle_option" -> Writes.OptionWrites(Writes.StringWrites).writes(o.cycleOption)
    ))
  )
}
