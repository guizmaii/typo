/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_sys_tables

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import java.time.OffsetDateTime

case class PgStatSysTablesViewRow(
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.relid]] */
  relid: Option[/* oid */ Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.schemaname]] */
  schemaname: Option[String],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.relname]] */
  relname: Option[String],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.seqScan]] */
  seqScan: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.seqTupRead]] */
  seqTupRead: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.idxScan]] */
  idxScan: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.idxTupFetch]] */
  idxTupFetch: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nTupIns]] */
  nTupIns: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nTupUpd]] */
  nTupUpd: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nTupDel]] */
  nTupDel: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nTupHotUpd]] */
  nTupHotUpd: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nLiveTup]] */
  nLiveTup: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nDeadTup]] */
  nDeadTup: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nModSinceAnalyze]] */
  nModSinceAnalyze: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.nInsSinceVacuum]] */
  nInsSinceVacuum: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.lastVacuum]] */
  lastVacuum: Option[OffsetDateTime],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.lastAutovacuum]] */
  lastAutovacuum: Option[OffsetDateTime],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.lastAnalyze]] */
  lastAnalyze: Option[OffsetDateTime],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.lastAutoanalyze]] */
  lastAutoanalyze: Option[OffsetDateTime],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.vacuumCount]] */
  vacuumCount: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.autovacuumCount]] */
  autovacuumCount: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.analyzeCount]] */
  analyzeCount: Option[Long],
  /** Points to [[pg_stat_all_tables.PgStatAllTablesViewRow.autoanalyzeCount]] */
  autoanalyzeCount: Option[Long]
)

object PgStatSysTablesViewRow {
  implicit val decoder: Decoder[PgStatSysTablesViewRow] =
    (c: HCursor) =>
      for {
        relid <- c.downField("relid").as[Option[/* oid */ Long]]
        schemaname <- c.downField("schemaname").as[Option[String]]
        relname <- c.downField("relname").as[Option[String]]
        seqScan <- c.downField("seq_scan").as[Option[Long]]
        seqTupRead <- c.downField("seq_tup_read").as[Option[Long]]
        idxScan <- c.downField("idx_scan").as[Option[Long]]
        idxTupFetch <- c.downField("idx_tup_fetch").as[Option[Long]]
        nTupIns <- c.downField("n_tup_ins").as[Option[Long]]
        nTupUpd <- c.downField("n_tup_upd").as[Option[Long]]
        nTupDel <- c.downField("n_tup_del").as[Option[Long]]
        nTupHotUpd <- c.downField("n_tup_hot_upd").as[Option[Long]]
        nLiveTup <- c.downField("n_live_tup").as[Option[Long]]
        nDeadTup <- c.downField("n_dead_tup").as[Option[Long]]
        nModSinceAnalyze <- c.downField("n_mod_since_analyze").as[Option[Long]]
        nInsSinceVacuum <- c.downField("n_ins_since_vacuum").as[Option[Long]]
        lastVacuum <- c.downField("last_vacuum").as[Option[OffsetDateTime]]
        lastAutovacuum <- c.downField("last_autovacuum").as[Option[OffsetDateTime]]
        lastAnalyze <- c.downField("last_analyze").as[Option[OffsetDateTime]]
        lastAutoanalyze <- c.downField("last_autoanalyze").as[Option[OffsetDateTime]]
        vacuumCount <- c.downField("vacuum_count").as[Option[Long]]
        autovacuumCount <- c.downField("autovacuum_count").as[Option[Long]]
        analyzeCount <- c.downField("analyze_count").as[Option[Long]]
        autoanalyzeCount <- c.downField("autoanalyze_count").as[Option[Long]]
      } yield PgStatSysTablesViewRow(relid, schemaname, relname, seqScan, seqTupRead, idxScan, idxTupFetch, nTupIns, nTupUpd, nTupDel, nTupHotUpd, nLiveTup, nDeadTup, nModSinceAnalyze, nInsSinceVacuum, lastVacuum, lastAutovacuum, lastAnalyze, lastAutoanalyze, vacuumCount, autovacuumCount, analyzeCount, autoanalyzeCount)
  implicit val encoder: Encoder[PgStatSysTablesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "relid" := row.relid,
        "schemaname" := row.schemaname,
        "relname" := row.relname,
        "seq_scan" := row.seqScan,
        "seq_tup_read" := row.seqTupRead,
        "idx_scan" := row.idxScan,
        "idx_tup_fetch" := row.idxTupFetch,
        "n_tup_ins" := row.nTupIns,
        "n_tup_upd" := row.nTupUpd,
        "n_tup_del" := row.nTupDel,
        "n_tup_hot_upd" := row.nTupHotUpd,
        "n_live_tup" := row.nLiveTup,
        "n_dead_tup" := row.nDeadTup,
        "n_mod_since_analyze" := row.nModSinceAnalyze,
        "n_ins_since_vacuum" := row.nInsSinceVacuum,
        "last_vacuum" := row.lastVacuum,
        "last_autovacuum" := row.lastAutovacuum,
        "last_analyze" := row.lastAnalyze,
        "last_autoanalyze" := row.lastAutoanalyze,
        "vacuum_count" := row.vacuumCount,
        "autovacuum_count" := row.autovacuumCount,
        "analyze_count" := row.analyzeCount,
        "autoanalyze_count" := row.autoanalyzeCount
      )}
  implicit val read: Read[PgStatSysTablesViewRow] =
    new Read[PgStatSysTablesViewRow](
      gets = List(
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgStatSysTablesViewRow(
        relid = Get[/* oid */ Long].unsafeGetNullable(rs, i + 0),
        schemaname = Get[String].unsafeGetNullable(rs, i + 1),
        relname = Get[String].unsafeGetNullable(rs, i + 2),
        seqScan = Get[Long].unsafeGetNullable(rs, i + 3),
        seqTupRead = Get[Long].unsafeGetNullable(rs, i + 4),
        idxScan = Get[Long].unsafeGetNullable(rs, i + 5),
        idxTupFetch = Get[Long].unsafeGetNullable(rs, i + 6),
        nTupIns = Get[Long].unsafeGetNullable(rs, i + 7),
        nTupUpd = Get[Long].unsafeGetNullable(rs, i + 8),
        nTupDel = Get[Long].unsafeGetNullable(rs, i + 9),
        nTupHotUpd = Get[Long].unsafeGetNullable(rs, i + 10),
        nLiveTup = Get[Long].unsafeGetNullable(rs, i + 11),
        nDeadTup = Get[Long].unsafeGetNullable(rs, i + 12),
        nModSinceAnalyze = Get[Long].unsafeGetNullable(rs, i + 13),
        nInsSinceVacuum = Get[Long].unsafeGetNullable(rs, i + 14),
        lastVacuum = Get[OffsetDateTime].unsafeGetNullable(rs, i + 15),
        lastAutovacuum = Get[OffsetDateTime].unsafeGetNullable(rs, i + 16),
        lastAnalyze = Get[OffsetDateTime].unsafeGetNullable(rs, i + 17),
        lastAutoanalyze = Get[OffsetDateTime].unsafeGetNullable(rs, i + 18),
        vacuumCount = Get[Long].unsafeGetNullable(rs, i + 19),
        autovacuumCount = Get[Long].unsafeGetNullable(rs, i + 20),
        analyzeCount = Get[Long].unsafeGetNullable(rs, i + 21),
        autoanalyzeCount = Get[Long].unsafeGetNullable(rs, i + 22)
      )
    )
  

}
