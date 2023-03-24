/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog

import org.postgresql.util.PGobject

sealed abstract class PgStatsExtExprsFieldValue[T](val name: String, val value: T)

object PgStatsExtExprsFieldValue {
  case class schemaname(override val value: String) extends PgStatsExtExprsFieldValue("schemaname", value)
  case class tablename(override val value: String) extends PgStatsExtExprsFieldValue("tablename", value)
  case class statisticsSchemaname(override val value: String) extends PgStatsExtExprsFieldValue("statistics_schemaname", value)
  case class statisticsName(override val value: String) extends PgStatsExtExprsFieldValue("statistics_name", value)
  case class statisticsOwner(override val value: /* unknown nullability */ Option[String]) extends PgStatsExtExprsFieldValue("statistics_owner", value)
  case class expr(override val value: /* unknown nullability */ Option[String]) extends PgStatsExtExprsFieldValue("expr", value)
  case class nullFrac(override val value: /* unknown nullability */ Option[Float]) extends PgStatsExtExprsFieldValue("null_frac", value)
  case class avgWidth(override val value: /* unknown nullability */ Option[Int]) extends PgStatsExtExprsFieldValue("avg_width", value)
  case class nDistinct(override val value: /* unknown nullability */ Option[Float]) extends PgStatsExtExprsFieldValue("n_distinct", value)
  case class mostCommonVals(override val value: /* unknown nullability */ Option[/* anyarray */ PGobject]) extends PgStatsExtExprsFieldValue("most_common_vals", value)
  case class mostCommonFreqs(override val value: /* unknown nullability */ Option[Array[Float]]) extends PgStatsExtExprsFieldValue("most_common_freqs", value)
  case class histogramBounds(override val value: /* unknown nullability */ Option[/* anyarray */ PGobject]) extends PgStatsExtExprsFieldValue("histogram_bounds", value)
  case class correlation(override val value: /* unknown nullability */ Option[Float]) extends PgStatsExtExprsFieldValue("correlation", value)
  case class mostCommonElems(override val value: /* unknown nullability */ Option[/* anyarray */ PGobject]) extends PgStatsExtExprsFieldValue("most_common_elems", value)
  case class mostCommonElemFreqs(override val value: /* unknown nullability */ Option[Array[Float]]) extends PgStatsExtExprsFieldValue("most_common_elem_freqs", value)
  case class elemCountHistogram(override val value: /* unknown nullability */ Option[Array[Float]]) extends PgStatsExtExprsFieldValue("elem_count_histogram", value)
}
