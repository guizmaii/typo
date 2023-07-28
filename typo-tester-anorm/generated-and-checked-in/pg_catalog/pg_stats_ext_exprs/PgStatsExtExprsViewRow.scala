/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stats_ext_exprs

import adventureworks.TypoAnyArray
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatsExtExprsViewRow(
  schemaname: Option[String],
  tablename: Option[String],
  statisticsSchemaname: Option[String],
  statisticsName: Option[String],
  statisticsOwner: Option[String],
  expr: Option[String],
  nullFrac: Option[Float],
  avgWidth: Option[Int],
  nDistinct: Option[Float],
  mostCommonVals: Option[TypoAnyArray],
  mostCommonFreqs: Option[Array[Float]],
  histogramBounds: Option[TypoAnyArray],
  correlation: Option[Float],
  mostCommonElems: Option[TypoAnyArray],
  mostCommonElemFreqs: Option[Array[Float]],
  elemCountHistogram: Option[Array[Float]]
)

object PgStatsExtExprsViewRow {
  def rowParser(idx: Int): RowParser[PgStatsExtExprsViewRow] =
    RowParser[PgStatsExtExprsViewRow] { row =>
      Success(
        PgStatsExtExprsViewRow(
          schemaname = row[Option[String]](idx + 0),
          tablename = row[Option[String]](idx + 1),
          statisticsSchemaname = row[Option[String]](idx + 2),
          statisticsName = row[Option[String]](idx + 3),
          statisticsOwner = row[Option[String]](idx + 4),
          expr = row[Option[String]](idx + 5),
          nullFrac = row[Option[Float]](idx + 6),
          avgWidth = row[Option[Int]](idx + 7),
          nDistinct = row[Option[Float]](idx + 8),
          mostCommonVals = row[Option[TypoAnyArray]](idx + 9),
          mostCommonFreqs = row[Option[Array[Float]]](idx + 10),
          histogramBounds = row[Option[TypoAnyArray]](idx + 11),
          correlation = row[Option[Float]](idx + 12),
          mostCommonElems = row[Option[TypoAnyArray]](idx + 13),
          mostCommonElemFreqs = row[Option[Array[Float]]](idx + 14),
          elemCountHistogram = row[Option[Array[Float]]](idx + 15)
        )
      )
    }
  implicit val oFormat: OFormat[PgStatsExtExprsViewRow] = new OFormat[PgStatsExtExprsViewRow]{
    override def writes(o: PgStatsExtExprsViewRow): JsObject =
      Json.obj(
        "schemaname" -> o.schemaname,
        "tablename" -> o.tablename,
        "statistics_schemaname" -> o.statisticsSchemaname,
        "statistics_name" -> o.statisticsName,
        "statistics_owner" -> o.statisticsOwner,
        "expr" -> o.expr,
        "null_frac" -> o.nullFrac,
        "avg_width" -> o.avgWidth,
        "n_distinct" -> o.nDistinct,
        "most_common_vals" -> o.mostCommonVals,
        "most_common_freqs" -> o.mostCommonFreqs,
        "histogram_bounds" -> o.histogramBounds,
        "correlation" -> o.correlation,
        "most_common_elems" -> o.mostCommonElems,
        "most_common_elem_freqs" -> o.mostCommonElemFreqs,
        "elem_count_histogram" -> o.elemCountHistogram
      )
  
    override def reads(json: JsValue): JsResult[PgStatsExtExprsViewRow] = {
      JsResult.fromTry(
        Try(
          PgStatsExtExprsViewRow(
            schemaname = json.\("schemaname").toOption.map(_.as[String]),
            tablename = json.\("tablename").toOption.map(_.as[String]),
            statisticsSchemaname = json.\("statistics_schemaname").toOption.map(_.as[String]),
            statisticsName = json.\("statistics_name").toOption.map(_.as[String]),
            statisticsOwner = json.\("statistics_owner").toOption.map(_.as[String]),
            expr = json.\("expr").toOption.map(_.as[String]),
            nullFrac = json.\("null_frac").toOption.map(_.as[Float]),
            avgWidth = json.\("avg_width").toOption.map(_.as[Int]),
            nDistinct = json.\("n_distinct").toOption.map(_.as[Float]),
            mostCommonVals = json.\("most_common_vals").toOption.map(_.as[TypoAnyArray]),
            mostCommonFreqs = json.\("most_common_freqs").toOption.map(_.as[Array[Float]]),
            histogramBounds = json.\("histogram_bounds").toOption.map(_.as[TypoAnyArray]),
            correlation = json.\("correlation").toOption.map(_.as[Float]),
            mostCommonElems = json.\("most_common_elems").toOption.map(_.as[TypoAnyArray]),
            mostCommonElemFreqs = json.\("most_common_elem_freqs").toOption.map(_.as[Array[Float]]),
            elemCountHistogram = json.\("elem_count_histogram").toOption.map(_.as[Array[Float]])
          )
        )
      )
    }
  }
}
