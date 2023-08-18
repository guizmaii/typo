/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_all_tables

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgStatAllTablesViewStructure[Row](val prefix: Option[String], val extract: Row => PgStatAllTablesViewRow, val merge: (Row, PgStatAllTablesViewRow) => Row)
  extends Relation[PgStatAllTablesViewFields, PgStatAllTablesViewRow, Row]
    with PgStatAllTablesViewFields[Row] { outer =>

  override val relid = new OptField[/* oid */ Long, Row](prefix, "relid", None, Some("oid"))(x => extract(x).relid, (row, value) => merge(row, extract(row).copy(relid = value)))
  override val schemaname = new OptField[String, Row](prefix, "schemaname", None, Some("name"))(x => extract(x).schemaname, (row, value) => merge(row, extract(row).copy(schemaname = value)))
  override val relname = new OptField[String, Row](prefix, "relname", None, Some("name"))(x => extract(x).relname, (row, value) => merge(row, extract(row).copy(relname = value)))
  override val seqScan = new OptField[Long, Row](prefix, "seq_scan", None, Some("int8"))(x => extract(x).seqScan, (row, value) => merge(row, extract(row).copy(seqScan = value)))
  override val seqTupRead = new OptField[Long, Row](prefix, "seq_tup_read", None, Some("int8"))(x => extract(x).seqTupRead, (row, value) => merge(row, extract(row).copy(seqTupRead = value)))
  override val idxScan = new OptField[Long, Row](prefix, "idx_scan", None, Some("int8"))(x => extract(x).idxScan, (row, value) => merge(row, extract(row).copy(idxScan = value)))
  override val idxTupFetch = new OptField[Long, Row](prefix, "idx_tup_fetch", None, Some("int8"))(x => extract(x).idxTupFetch, (row, value) => merge(row, extract(row).copy(idxTupFetch = value)))
  override val nTupIns = new OptField[Long, Row](prefix, "n_tup_ins", None, Some("int8"))(x => extract(x).nTupIns, (row, value) => merge(row, extract(row).copy(nTupIns = value)))
  override val nTupUpd = new OptField[Long, Row](prefix, "n_tup_upd", None, Some("int8"))(x => extract(x).nTupUpd, (row, value) => merge(row, extract(row).copy(nTupUpd = value)))
  override val nTupDel = new OptField[Long, Row](prefix, "n_tup_del", None, Some("int8"))(x => extract(x).nTupDel, (row, value) => merge(row, extract(row).copy(nTupDel = value)))
  override val nTupHotUpd = new OptField[Long, Row](prefix, "n_tup_hot_upd", None, Some("int8"))(x => extract(x).nTupHotUpd, (row, value) => merge(row, extract(row).copy(nTupHotUpd = value)))
  override val nLiveTup = new OptField[Long, Row](prefix, "n_live_tup", None, Some("int8"))(x => extract(x).nLiveTup, (row, value) => merge(row, extract(row).copy(nLiveTup = value)))
  override val nDeadTup = new OptField[Long, Row](prefix, "n_dead_tup", None, Some("int8"))(x => extract(x).nDeadTup, (row, value) => merge(row, extract(row).copy(nDeadTup = value)))
  override val nModSinceAnalyze = new OptField[Long, Row](prefix, "n_mod_since_analyze", None, Some("int8"))(x => extract(x).nModSinceAnalyze, (row, value) => merge(row, extract(row).copy(nModSinceAnalyze = value)))
  override val nInsSinceVacuum = new OptField[Long, Row](prefix, "n_ins_since_vacuum", None, Some("int8"))(x => extract(x).nInsSinceVacuum, (row, value) => merge(row, extract(row).copy(nInsSinceVacuum = value)))
  override val lastVacuum = new OptField[TypoOffsetDateTime, Row](prefix, "last_vacuum", Some("text"), Some("timestamptz"))(x => extract(x).lastVacuum, (row, value) => merge(row, extract(row).copy(lastVacuum = value)))
  override val lastAutovacuum = new OptField[TypoOffsetDateTime, Row](prefix, "last_autovacuum", Some("text"), Some("timestamptz"))(x => extract(x).lastAutovacuum, (row, value) => merge(row, extract(row).copy(lastAutovacuum = value)))
  override val lastAnalyze = new OptField[TypoOffsetDateTime, Row](prefix, "last_analyze", Some("text"), Some("timestamptz"))(x => extract(x).lastAnalyze, (row, value) => merge(row, extract(row).copy(lastAnalyze = value)))
  override val lastAutoanalyze = new OptField[TypoOffsetDateTime, Row](prefix, "last_autoanalyze", Some("text"), Some("timestamptz"))(x => extract(x).lastAutoanalyze, (row, value) => merge(row, extract(row).copy(lastAutoanalyze = value)))
  override val vacuumCount = new OptField[Long, Row](prefix, "vacuum_count", None, Some("int8"))(x => extract(x).vacuumCount, (row, value) => merge(row, extract(row).copy(vacuumCount = value)))
  override val autovacuumCount = new OptField[Long, Row](prefix, "autovacuum_count", None, Some("int8"))(x => extract(x).autovacuumCount, (row, value) => merge(row, extract(row).copy(autovacuumCount = value)))
  override val analyzeCount = new OptField[Long, Row](prefix, "analyze_count", None, Some("int8"))(x => extract(x).analyzeCount, (row, value) => merge(row, extract(row).copy(analyzeCount = value)))
  override val autoanalyzeCount = new OptField[Long, Row](prefix, "autoanalyze_count", None, Some("int8"))(x => extract(x).autoanalyzeCount, (row, value) => merge(row, extract(row).copy(autoanalyzeCount = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](relid, schemaname, relname, seqScan, seqTupRead, idxScan, idxTupFetch, nTupIns, nTupUpd, nTupDel, nTupHotUpd, nLiveTup, nDeadTup, nModSinceAnalyze, nInsSinceVacuum, lastVacuum, lastAutovacuum, lastAnalyze, lastAutoanalyze, vacuumCount, autovacuumCount, analyzeCount, autoanalyzeCount)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgStatAllTablesViewRow, merge: (NewRow, PgStatAllTablesViewRow) => NewRow): PgStatAllTablesViewStructure[NewRow] =
    new PgStatAllTablesViewStructure(prefix, extract, merge)
}
