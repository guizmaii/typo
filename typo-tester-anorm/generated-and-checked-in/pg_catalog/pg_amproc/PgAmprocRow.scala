/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_amproc

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

case class PgAmprocRow(
  oid: PgAmprocId,
  amprocfamily: /* oid */ Long,
  amproclefttype: /* oid */ Long,
  amprocrighttype: /* oid */ Long,
  amprocnum: Int,
  amproc: TypoRegproc
)

object PgAmprocRow {
  implicit lazy val reads: Reads[PgAmprocRow] = Reads[PgAmprocRow](json => JsResult.fromTry(
      Try(
        PgAmprocRow(
          oid = json.\("oid").as(PgAmprocId.reads),
          amprocfamily = json.\("amprocfamily").as(Reads.LongReads),
          amproclefttype = json.\("amproclefttype").as(Reads.LongReads),
          amprocrighttype = json.\("amprocrighttype").as(Reads.LongReads),
          amprocnum = json.\("amprocnum").as(Reads.IntReads),
          amproc = json.\("amproc").as(TypoRegproc.reads)
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PgAmprocRow] = RowParser[PgAmprocRow] { row =>
    Success(
      PgAmprocRow(
        oid = row(idx + 0)(PgAmprocId.column),
        amprocfamily = row(idx + 1)(Column.columnToLong),
        amproclefttype = row(idx + 2)(Column.columnToLong),
        amprocrighttype = row(idx + 3)(Column.columnToLong),
        amprocnum = row(idx + 4)(Column.columnToInt),
        amproc = row(idx + 5)(TypoRegproc.column)
      )
    )
  }
  implicit lazy val writes: OWrites[PgAmprocRow] = OWrites[PgAmprocRow](o =>
    new JsObject(ListMap[String, JsValue](
      "oid" -> PgAmprocId.writes.writes(o.oid),
      "amprocfamily" -> Writes.LongWrites.writes(o.amprocfamily),
      "amproclefttype" -> Writes.LongWrites.writes(o.amproclefttype),
      "amprocrighttype" -> Writes.LongWrites.writes(o.amprocrighttype),
      "amprocnum" -> Writes.IntWrites.writes(o.amprocnum),
      "amproc" -> TypoRegproc.writes.writes(o.amproc)
    ))
  )
}
