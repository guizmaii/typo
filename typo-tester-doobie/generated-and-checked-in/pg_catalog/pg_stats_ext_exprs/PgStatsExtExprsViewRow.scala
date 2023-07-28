/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stats_ext_exprs

import adventureworks.TypoAnyArray
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

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
  implicit val decoder: Decoder[PgStatsExtExprsViewRow] =
    (c: HCursor) =>
      for {
        schemaname <- c.downField("schemaname").as[Option[String]]
        tablename <- c.downField("tablename").as[Option[String]]
        statisticsSchemaname <- c.downField("statistics_schemaname").as[Option[String]]
        statisticsName <- c.downField("statistics_name").as[Option[String]]
        statisticsOwner <- c.downField("statistics_owner").as[Option[String]]
        expr <- c.downField("expr").as[Option[String]]
        nullFrac <- c.downField("null_frac").as[Option[Float]]
        avgWidth <- c.downField("avg_width").as[Option[Int]]
        nDistinct <- c.downField("n_distinct").as[Option[Float]]
        mostCommonVals <- c.downField("most_common_vals").as[Option[TypoAnyArray]]
        mostCommonFreqs <- c.downField("most_common_freqs").as[Option[Array[Float]]]
        histogramBounds <- c.downField("histogram_bounds").as[Option[TypoAnyArray]]
        correlation <- c.downField("correlation").as[Option[Float]]
        mostCommonElems <- c.downField("most_common_elems").as[Option[TypoAnyArray]]
        mostCommonElemFreqs <- c.downField("most_common_elem_freqs").as[Option[Array[Float]]]
        elemCountHistogram <- c.downField("elem_count_histogram").as[Option[Array[Float]]]
      } yield PgStatsExtExprsViewRow(schemaname, tablename, statisticsSchemaname, statisticsName, statisticsOwner, expr, nullFrac, avgWidth, nDistinct, mostCommonVals, mostCommonFreqs, histogramBounds, correlation, mostCommonElems, mostCommonElemFreqs, elemCountHistogram)
  implicit val encoder: Encoder[PgStatsExtExprsViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "schemaname" := row.schemaname,
        "tablename" := row.tablename,
        "statistics_schemaname" := row.statisticsSchemaname,
        "statistics_name" := row.statisticsName,
        "statistics_owner" := row.statisticsOwner,
        "expr" := row.expr,
        "null_frac" := row.nullFrac,
        "avg_width" := row.avgWidth,
        "n_distinct" := row.nDistinct,
        "most_common_vals" := row.mostCommonVals,
        "most_common_freqs" := row.mostCommonFreqs,
        "histogram_bounds" := row.histogramBounds,
        "correlation" := row.correlation,
        "most_common_elems" := row.mostCommonElems,
        "most_common_elem_freqs" := row.mostCommonElemFreqs,
        "elem_count_histogram" := row.elemCountHistogram
      )}
  implicit val read: Read[PgStatsExtExprsViewRow] =
    new Read[PgStatsExtExprsViewRow](
      gets = List(
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Float], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[Float], Nullability.Nullable),
        (Get[TypoAnyArray], Nullability.Nullable),
        (Get[Array[Float]], Nullability.Nullable),
        (Get[TypoAnyArray], Nullability.Nullable),
        (Get[Float], Nullability.Nullable),
        (Get[TypoAnyArray], Nullability.Nullable),
        (Get[Array[Float]], Nullability.Nullable),
        (Get[Array[Float]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgStatsExtExprsViewRow(
        schemaname = Get[String].unsafeGetNullable(rs, i + 0),
        tablename = Get[String].unsafeGetNullable(rs, i + 1),
        statisticsSchemaname = Get[String].unsafeGetNullable(rs, i + 2),
        statisticsName = Get[String].unsafeGetNullable(rs, i + 3),
        statisticsOwner = Get[String].unsafeGetNullable(rs, i + 4),
        expr = Get[String].unsafeGetNullable(rs, i + 5),
        nullFrac = Get[Float].unsafeGetNullable(rs, i + 6),
        avgWidth = Get[Int].unsafeGetNullable(rs, i + 7),
        nDistinct = Get[Float].unsafeGetNullable(rs, i + 8),
        mostCommonVals = Get[TypoAnyArray].unsafeGetNullable(rs, i + 9),
        mostCommonFreqs = Get[Array[Float]].unsafeGetNullable(rs, i + 10),
        histogramBounds = Get[TypoAnyArray].unsafeGetNullable(rs, i + 11),
        correlation = Get[Float].unsafeGetNullable(rs, i + 12),
        mostCommonElems = Get[TypoAnyArray].unsafeGetNullable(rs, i + 13),
        mostCommonElemFreqs = Get[Array[Float]].unsafeGetNullable(rs, i + 14),
        elemCountHistogram = Get[Array[Float]].unsafeGetNullable(rs, i + 15)
      )
    )
  

}
