package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgStatsRepoImpl extends PgStatsRepo {
  override def selectAll(implicit c: Connection): List[PgStatsRow] = {
    SQL"""select schemaname, tablename, attname, inherited, null_frac, avg_width, n_distinct, most_common_vals, most_common_freqs, histogram_bounds, correlation, most_common_elems, most_common_elem_freqs, elem_count_histogram from pg_catalog.pg_stats""".as(PgStatsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgStatsFieldValue[_]])(implicit c: Connection): List[PgStatsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgStatsFieldValue.schemaname(value) => NamedParameter("schemaname", ParameterValue.from(value))
          case PgStatsFieldValue.tablename(value) => NamedParameter("tablename", ParameterValue.from(value))
          case PgStatsFieldValue.attname(value) => NamedParameter("attname", ParameterValue.from(value))
          case PgStatsFieldValue.inherited(value) => NamedParameter("inherited", ParameterValue.from(value))
          case PgStatsFieldValue.nullFrac(value) => NamedParameter("null_frac", ParameterValue.from(value))
          case PgStatsFieldValue.avgWidth(value) => NamedParameter("avg_width", ParameterValue.from(value))
          case PgStatsFieldValue.nDistinct(value) => NamedParameter("n_distinct", ParameterValue.from(value))
          case PgStatsFieldValue.mostCommonVals(value) => NamedParameter("most_common_vals", ParameterValue.from(value))
          case PgStatsFieldValue.mostCommonFreqs(value) => NamedParameter("most_common_freqs", ParameterValue.from(value))
          case PgStatsFieldValue.histogramBounds(value) => NamedParameter("histogram_bounds", ParameterValue.from(value))
          case PgStatsFieldValue.correlation(value) => NamedParameter("correlation", ParameterValue.from(value))
          case PgStatsFieldValue.mostCommonElems(value) => NamedParameter("most_common_elems", ParameterValue.from(value))
          case PgStatsFieldValue.mostCommonElemFreqs(value) => NamedParameter("most_common_elem_freqs", ParameterValue.from(value))
          case PgStatsFieldValue.elemCountHistogram(value) => NamedParameter("elem_count_histogram", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_stats where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgStatsRow.rowParser.*)
    }

  }
}
