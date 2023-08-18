/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_slru

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

case class PgStatSlruViewRow(
  name: Option[String],
  blksZeroed: Option[Long],
  blksHit: Option[Long],
  blksRead: Option[Long],
  blksWritten: Option[Long],
  blksExists: Option[Long],
  flushes: Option[Long],
  truncates: Option[Long],
  statsReset: Option[TypoOffsetDateTime]
)

object PgStatSlruViewRow {
  implicit lazy val reads: Reads[PgStatSlruViewRow] = Reads[PgStatSlruViewRow](json => JsResult.fromTry(
      Try(
        PgStatSlruViewRow(
          name = json.\("name").toOption.map(_.as(Reads.StringReads)),
          blksZeroed = json.\("blks_zeroed").toOption.map(_.as(Reads.LongReads)),
          blksHit = json.\("blks_hit").toOption.map(_.as(Reads.LongReads)),
          blksRead = json.\("blks_read").toOption.map(_.as(Reads.LongReads)),
          blksWritten = json.\("blks_written").toOption.map(_.as(Reads.LongReads)),
          blksExists = json.\("blks_exists").toOption.map(_.as(Reads.LongReads)),
          flushes = json.\("flushes").toOption.map(_.as(Reads.LongReads)),
          truncates = json.\("truncates").toOption.map(_.as(Reads.LongReads)),
          statsReset = json.\("stats_reset").toOption.map(_.as(TypoOffsetDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PgStatSlruViewRow] = RowParser[PgStatSlruViewRow] { row =>
    Success(
      PgStatSlruViewRow(
        name = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        blksZeroed = row(idx + 1)(Column.columnToOption(Column.columnToLong)),
        blksHit = row(idx + 2)(Column.columnToOption(Column.columnToLong)),
        blksRead = row(idx + 3)(Column.columnToOption(Column.columnToLong)),
        blksWritten = row(idx + 4)(Column.columnToOption(Column.columnToLong)),
        blksExists = row(idx + 5)(Column.columnToOption(Column.columnToLong)),
        flushes = row(idx + 6)(Column.columnToOption(Column.columnToLong)),
        truncates = row(idx + 7)(Column.columnToOption(Column.columnToLong)),
        statsReset = row(idx + 8)(Column.columnToOption(TypoOffsetDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[PgStatSlruViewRow] = OWrites[PgStatSlruViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.name),
      "blks_zeroed" -> Writes.OptionWrites(Writes.LongWrites).writes(o.blksZeroed),
      "blks_hit" -> Writes.OptionWrites(Writes.LongWrites).writes(o.blksHit),
      "blks_read" -> Writes.OptionWrites(Writes.LongWrites).writes(o.blksRead),
      "blks_written" -> Writes.OptionWrites(Writes.LongWrites).writes(o.blksWritten),
      "blks_exists" -> Writes.OptionWrites(Writes.LongWrites).writes(o.blksExists),
      "flushes" -> Writes.OptionWrites(Writes.LongWrites).writes(o.flushes),
      "truncates" -> Writes.OptionWrites(Writes.LongWrites).writes(o.truncates),
      "stats_reset" -> Writes.OptionWrites(TypoOffsetDateTime.writes).writes(o.statsReset)
    ))
  )
}
