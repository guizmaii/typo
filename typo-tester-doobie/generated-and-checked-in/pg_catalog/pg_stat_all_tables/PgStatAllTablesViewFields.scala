/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_all_tables

import typo.dsl.SqlExpr.OptField

trait PgStatAllTablesViewFields[Row] {
  val relid: OptField[/* oid */ Long, Row]
  val schemaname: OptField[String, Row]
  val relname: OptField[String, Row]
  val seqScan: OptField[Long, Row]
  val seqTupRead: OptField[Long, Row]
  val idxScan: OptField[Long, Row]
  val idxTupFetch: OptField[Long, Row]
  val nTupIns: OptField[Long, Row]
  val nTupUpd: OptField[Long, Row]
  val nTupDel: OptField[Long, Row]
  val nTupHotUpd: OptField[Long, Row]
  val nLiveTup: OptField[Long, Row]
  val nDeadTup: OptField[Long, Row]
  val nModSinceAnalyze: OptField[Long, Row]
  val nInsSinceVacuum: OptField[Long, Row]
  val lastVacuum: OptField[TypoOffsetDateTime, Row]
  val lastAutovacuum: OptField[TypoOffsetDateTime, Row]
  val lastAnalyze: OptField[TypoOffsetDateTime, Row]
  val lastAutoanalyze: OptField[TypoOffsetDateTime, Row]
  val vacuumCount: OptField[Long, Row]
  val autovacuumCount: OptField[Long, Row]
  val analyzeCount: OptField[Long, Row]
  val autoanalyzeCount: OptField[Long, Row]
}
object PgStatAllTablesViewFields extends PgStatAllTablesViewStructure[PgStatAllTablesViewRow](None, identity, (_, x) => x)

