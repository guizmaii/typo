package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgStatUserTablesRepoImpl extends PgStatUserTablesRepo {
  override def selectAll(implicit c: Connection): List[PgStatUserTablesRow] = {
    SQL"""select relid, schemaname, relname, seq_scan, seq_tup_read, idx_scan, idx_tup_fetch, n_tup_ins, n_tup_upd, n_tup_del, n_tup_hot_upd, n_live_tup, n_dead_tup, n_mod_since_analyze, n_ins_since_vacuum, last_vacuum, last_autovacuum, last_analyze, last_autoanalyze, vacuum_count, autovacuum_count, analyze_count, autoanalyze_count from pg_catalog.pg_stat_user_tables""".as(PgStatUserTablesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgStatUserTablesFieldValue[_]])(implicit c: Connection): List[PgStatUserTablesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgStatUserTablesFieldValue.relid(value) => NamedParameter("relid", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.schemaname(value) => NamedParameter("schemaname", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.relname(value) => NamedParameter("relname", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.seqScan(value) => NamedParameter("seq_scan", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.seqTupRead(value) => NamedParameter("seq_tup_read", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.idxScan(value) => NamedParameter("idx_scan", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.idxTupFetch(value) => NamedParameter("idx_tup_fetch", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nTupIns(value) => NamedParameter("n_tup_ins", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nTupUpd(value) => NamedParameter("n_tup_upd", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nTupDel(value) => NamedParameter("n_tup_del", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nTupHotUpd(value) => NamedParameter("n_tup_hot_upd", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nLiveTup(value) => NamedParameter("n_live_tup", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nDeadTup(value) => NamedParameter("n_dead_tup", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nModSinceAnalyze(value) => NamedParameter("n_mod_since_analyze", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.nInsSinceVacuum(value) => NamedParameter("n_ins_since_vacuum", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.lastVacuum(value) => NamedParameter("last_vacuum", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.lastAutovacuum(value) => NamedParameter("last_autovacuum", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.lastAnalyze(value) => NamedParameter("last_analyze", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.lastAutoanalyze(value) => NamedParameter("last_autoanalyze", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.vacuumCount(value) => NamedParameter("vacuum_count", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.autovacuumCount(value) => NamedParameter("autovacuum_count", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.analyzeCount(value) => NamedParameter("analyze_count", ParameterValue.from(value))
          case PgStatUserTablesFieldValue.autoanalyzeCount(value) => NamedParameter("autoanalyze_count", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_stat_user_tables where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgStatUserTablesRow.rowParser.*)
    }

  }
}
