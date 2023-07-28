/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stats_ext

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgStatsExtViewRow(
  schemaname: Option[String],
  tablename: Option[String],
  statisticsSchemaname: Option[String],
  statisticsName: Option[String],
  statisticsOwner: Option[String],
  attnames: Option[Array[String]],
  exprs: Option[Array[String]],
  kinds: Option[Array[String]],
  nDistinct: Option[String],
  dependencies: Option[String],
  mostCommonVals: Option[Array[String]],
  mostCommonValNulls: Option[Array[Boolean]],
  mostCommonFreqs: Option[Array[Double]],
  mostCommonBaseFreqs: Option[Array[Double]]
)

object PgStatsExtViewRow {
  implicit val decoder: Decoder[PgStatsExtViewRow] =
    (c: HCursor) =>
      for {
        schemaname <- c.downField("schemaname").as[Option[String]]
        tablename <- c.downField("tablename").as[Option[String]]
        statisticsSchemaname <- c.downField("statistics_schemaname").as[Option[String]]
        statisticsName <- c.downField("statistics_name").as[Option[String]]
        statisticsOwner <- c.downField("statistics_owner").as[Option[String]]
        attnames <- c.downField("attnames").as[Option[Array[String]]]
        exprs <- c.downField("exprs").as[Option[Array[String]]]
        kinds <- c.downField("kinds").as[Option[Array[String]]]
        nDistinct <- c.downField("n_distinct").as[Option[String]]
        dependencies <- c.downField("dependencies").as[Option[String]]
        mostCommonVals <- c.downField("most_common_vals").as[Option[Array[String]]]
        mostCommonValNulls <- c.downField("most_common_val_nulls").as[Option[Array[Boolean]]]
        mostCommonFreqs <- c.downField("most_common_freqs").as[Option[Array[Double]]]
        mostCommonBaseFreqs <- c.downField("most_common_base_freqs").as[Option[Array[Double]]]
      } yield PgStatsExtViewRow(schemaname, tablename, statisticsSchemaname, statisticsName, statisticsOwner, attnames, exprs, kinds, nDistinct, dependencies, mostCommonVals, mostCommonValNulls, mostCommonFreqs, mostCommonBaseFreqs)
  implicit val encoder: Encoder[PgStatsExtViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "schemaname" := row.schemaname,
        "tablename" := row.tablename,
        "statistics_schemaname" := row.statisticsSchemaname,
        "statistics_name" := row.statisticsName,
        "statistics_owner" := row.statisticsOwner,
        "attnames" := row.attnames,
        "exprs" := row.exprs,
        "kinds" := row.kinds,
        "n_distinct" := row.nDistinct,
        "dependencies" := row.dependencies,
        "most_common_vals" := row.mostCommonVals,
        "most_common_val_nulls" := row.mostCommonValNulls,
        "most_common_freqs" := row.mostCommonFreqs,
        "most_common_base_freqs" := row.mostCommonBaseFreqs
      )}
  implicit val read: Read[PgStatsExtViewRow] =
    new Read[PgStatsExtViewRow](
      gets = List(
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable),
        (Get[Array[Boolean]], Nullability.Nullable),
        (Get[Array[Double]], Nullability.Nullable),
        (Get[Array[Double]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgStatsExtViewRow(
        schemaname = Get[String].unsafeGetNullable(rs, i + 0),
        tablename = Get[String].unsafeGetNullable(rs, i + 1),
        statisticsSchemaname = Get[String].unsafeGetNullable(rs, i + 2),
        statisticsName = Get[String].unsafeGetNullable(rs, i + 3),
        statisticsOwner = Get[String].unsafeGetNullable(rs, i + 4),
        attnames = Get[Array[String]].unsafeGetNullable(rs, i + 5),
        exprs = Get[Array[String]].unsafeGetNullable(rs, i + 6),
        kinds = Get[Array[String]].unsafeGetNullable(rs, i + 7),
        nDistinct = Get[String].unsafeGetNullable(rs, i + 8),
        dependencies = Get[String].unsafeGetNullable(rs, i + 9),
        mostCommonVals = Get[Array[String]].unsafeGetNullable(rs, i + 10),
        mostCommonValNulls = Get[Array[Boolean]].unsafeGetNullable(rs, i + 11),
        mostCommonFreqs = Get[Array[Double]].unsafeGetNullable(rs, i + 12),
        mostCommonBaseFreqs = Get[Array[Double]].unsafeGetNullable(rs, i + 13)
      )
    )
  

}
