/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stats_ext_exprs

import adventureworks.customtypes.TypoAnyArray
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgStatsExtExprsViewRow(
  /** Points to [[pg_namespace.PgNamespaceRow.nspname]] */
  schemaname: Option[String],
  /** Points to [[pg_class.PgClassRow.relname]] */
  tablename: String,
  /** Points to [[pg_namespace.PgNamespaceRow.nspname]] */
  statisticsSchemaname: Option[String],
  /** Points to [[pg_statistic_ext.PgStatisticExtRow.stxname]] */
  statisticsName: String,
  statisticsOwner: /* nullability unknown */ Option[String],
  expr: /* nullability unknown */ Option[String],
  nullFrac: /* nullability unknown */ Option[Float],
  avgWidth: /* nullability unknown */ Option[Int],
  nDistinct: /* nullability unknown */ Option[Float],
  mostCommonVals: /* nullability unknown */ Option[TypoAnyArray],
  mostCommonFreqs: /* nullability unknown */ Option[Array[Float]],
  histogramBounds: /* nullability unknown */ Option[TypoAnyArray],
  correlation: /* nullability unknown */ Option[Float],
  mostCommonElems: /* nullability unknown */ Option[TypoAnyArray],
  mostCommonElemFreqs: /* nullability unknown */ Option[Array[Float]],
  elemCountHistogram: /* nullability unknown */ Option[Array[Float]]
)

object PgStatsExtExprsViewRow {
  implicit lazy val decoder: Decoder[PgStatsExtExprsViewRow] = Decoder.forProduct16[PgStatsExtExprsViewRow, Option[String], String, Option[String], String, /* nullability unknown */ Option[String], /* nullability unknown */ Option[String], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[Int], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Array[Float]], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Array[Float]], /* nullability unknown */ Option[Array[Float]]]("schemaname", "tablename", "statistics_schemaname", "statistics_name", "statistics_owner", "expr", "null_frac", "avg_width", "n_distinct", "most_common_vals", "most_common_freqs", "histogram_bounds", "correlation", "most_common_elems", "most_common_elem_freqs", "elem_count_histogram")(PgStatsExtExprsViewRow.apply)(Decoder.decodeOption(Decoder.decodeString), Decoder.decodeString, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeString, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeFloat), Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(Decoder.decodeFloat), Decoder.decodeOption(TypoAnyArray.decoder), Decoder.decodeOption(Decoder.decodeArray[Float](Decoder.decodeFloat, implicitly)), Decoder.decodeOption(TypoAnyArray.decoder), Decoder.decodeOption(Decoder.decodeFloat), Decoder.decodeOption(TypoAnyArray.decoder), Decoder.decodeOption(Decoder.decodeArray[Float](Decoder.decodeFloat, implicitly)), Decoder.decodeOption(Decoder.decodeArray[Float](Decoder.decodeFloat, implicitly)))
  implicit lazy val encoder: Encoder[PgStatsExtExprsViewRow] = Encoder.forProduct16[PgStatsExtExprsViewRow, Option[String], String, Option[String], String, /* nullability unknown */ Option[String], /* nullability unknown */ Option[String], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[Int], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Array[Float]], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Float], /* nullability unknown */ Option[TypoAnyArray], /* nullability unknown */ Option[Array[Float]], /* nullability unknown */ Option[Array[Float]]]("schemaname", "tablename", "statistics_schemaname", "statistics_name", "statistics_owner", "expr", "null_frac", "avg_width", "n_distinct", "most_common_vals", "most_common_freqs", "histogram_bounds", "correlation", "most_common_elems", "most_common_elem_freqs", "elem_count_histogram")(x => (x.schemaname, x.tablename, x.statisticsSchemaname, x.statisticsName, x.statisticsOwner, x.expr, x.nullFrac, x.avgWidth, x.nDistinct, x.mostCommonVals, x.mostCommonFreqs, x.histogramBounds, x.correlation, x.mostCommonElems, x.mostCommonElemFreqs, x.elemCountHistogram))(Encoder.encodeOption(Encoder.encodeString), Encoder.encodeString, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeString, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeFloat), Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(Encoder.encodeFloat), Encoder.encodeOption(TypoAnyArray.encoder), Encoder.encodeOption(Encoder.encodeIterable[Float, Array](Encoder.encodeFloat, implicitly)), Encoder.encodeOption(TypoAnyArray.encoder), Encoder.encodeOption(Encoder.encodeFloat), Encoder.encodeOption(TypoAnyArray.encoder), Encoder.encodeOption(Encoder.encodeIterable[Float, Array](Encoder.encodeFloat, implicitly)), Encoder.encodeOption(Encoder.encodeIterable[Float, Array](Encoder.encodeFloat, implicitly)))
  implicit lazy val read: Read[PgStatsExtExprsViewRow] = new Read[PgStatsExtExprsViewRow](
    gets = List(
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.FloatMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (Meta.FloatMeta.get, Nullability.Nullable),
      (TypoAnyArray.get, Nullability.Nullable),
      (adventureworks.FloatArrayMeta.get, Nullability.Nullable),
      (TypoAnyArray.get, Nullability.Nullable),
      (Meta.FloatMeta.get, Nullability.Nullable),
      (TypoAnyArray.get, Nullability.Nullable),
      (adventureworks.FloatArrayMeta.get, Nullability.Nullable),
      (adventureworks.FloatArrayMeta.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgStatsExtExprsViewRow(
      schemaname = Meta.StringMeta.get.unsafeGetNullable(rs, i + 0),
      tablename = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 1),
      statisticsSchemaname = Meta.StringMeta.get.unsafeGetNullable(rs, i + 2),
      statisticsName = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 3),
      statisticsOwner = Meta.StringMeta.get.unsafeGetNullable(rs, i + 4),
      expr = Meta.StringMeta.get.unsafeGetNullable(rs, i + 5),
      nullFrac = Meta.FloatMeta.get.unsafeGetNullable(rs, i + 6),
      avgWidth = Meta.IntMeta.get.unsafeGetNullable(rs, i + 7),
      nDistinct = Meta.FloatMeta.get.unsafeGetNullable(rs, i + 8),
      mostCommonVals = TypoAnyArray.get.unsafeGetNullable(rs, i + 9),
      mostCommonFreqs = adventureworks.FloatArrayMeta.get.unsafeGetNullable(rs, i + 10),
      histogramBounds = TypoAnyArray.get.unsafeGetNullable(rs, i + 11),
      correlation = Meta.FloatMeta.get.unsafeGetNullable(rs, i + 12),
      mostCommonElems = TypoAnyArray.get.unsafeGetNullable(rs, i + 13),
      mostCommonElemFreqs = adventureworks.FloatArrayMeta.get.unsafeGetNullable(rs, i + 14),
      elemCountHistogram = adventureworks.FloatArrayMeta.get.unsafeGetNullable(rs, i + 15)
    )
  )
}
