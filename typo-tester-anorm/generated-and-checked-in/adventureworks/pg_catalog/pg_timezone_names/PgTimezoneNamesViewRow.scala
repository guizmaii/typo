/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_timezone_names

import adventureworks.customtypes.TypoInterval
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

case class PgTimezoneNamesViewRow(
  name: Option[String],
  abbrev: Option[String],
  utcOffset: Option[TypoInterval],
  isDst: Option[Boolean]
)

object PgTimezoneNamesViewRow {
  implicit lazy val reads: Reads[PgTimezoneNamesViewRow] = Reads[PgTimezoneNamesViewRow](json => JsResult.fromTry(
      Try(
        PgTimezoneNamesViewRow(
          name = json.\("name").toOption.map(_.as(Reads.StringReads)),
          abbrev = json.\("abbrev").toOption.map(_.as(Reads.StringReads)),
          utcOffset = json.\("utc_offset").toOption.map(_.as(TypoInterval.reads)),
          isDst = json.\("is_dst").toOption.map(_.as(Reads.BooleanReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PgTimezoneNamesViewRow] = RowParser[PgTimezoneNamesViewRow] { row =>
    Success(
      PgTimezoneNamesViewRow(
        name = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        abbrev = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        utcOffset = row(idx + 2)(Column.columnToOption(TypoInterval.column)),
        isDst = row(idx + 3)(Column.columnToOption(Column.columnToBoolean))
      )
    )
  }
  implicit lazy val writes: OWrites[PgTimezoneNamesViewRow] = OWrites[PgTimezoneNamesViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.name),
      "abbrev" -> Writes.OptionWrites(Writes.StringWrites).writes(o.abbrev),
      "utc_offset" -> Writes.OptionWrites(TypoInterval.writes).writes(o.utcOffset),
      "is_dst" -> Writes.OptionWrites(Writes.BooleanWrites).writes(o.isDst)
    ))
  )
}
