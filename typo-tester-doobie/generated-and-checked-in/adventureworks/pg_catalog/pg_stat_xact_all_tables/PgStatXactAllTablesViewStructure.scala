/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_xact_all_tables

import adventureworks.pg_catalog.pg_class.PgClassId
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgStatXactAllTablesViewStructure[Row](val prefix: Option[String], val extract: Row => PgStatXactAllTablesViewRow, val merge: (Row, PgStatXactAllTablesViewRow) => Row)
  extends Relation[PgStatXactAllTablesViewFields, PgStatXactAllTablesViewRow, Row]
    with PgStatXactAllTablesViewFields[Row] { outer =>

  override val relid = new Field[PgClassId, Row](prefix, "relid", None, None)(x => extract(x).relid, (row, value) => merge(row, extract(row).copy(relid = value)))
  override val schemaname = new OptField[String, Row](prefix, "schemaname", None, None)(x => extract(x).schemaname, (row, value) => merge(row, extract(row).copy(schemaname = value)))
  override val relname = new Field[String, Row](prefix, "relname", None, None)(x => extract(x).relname, (row, value) => merge(row, extract(row).copy(relname = value)))
  override val seqScan = new OptField[Long, Row](prefix, "seq_scan", None, None)(x => extract(x).seqScan, (row, value) => merge(row, extract(row).copy(seqScan = value)))
  override val seqTupRead = new OptField[Long, Row](prefix, "seq_tup_read", None, None)(x => extract(x).seqTupRead, (row, value) => merge(row, extract(row).copy(seqTupRead = value)))
  override val idxScan = new OptField[Long, Row](prefix, "idx_scan", None, None)(x => extract(x).idxScan, (row, value) => merge(row, extract(row).copy(idxScan = value)))
  override val idxTupFetch = new OptField[Long, Row](prefix, "idx_tup_fetch", None, None)(x => extract(x).idxTupFetch, (row, value) => merge(row, extract(row).copy(idxTupFetch = value)))
  override val nTupIns = new OptField[Long, Row](prefix, "n_tup_ins", None, None)(x => extract(x).nTupIns, (row, value) => merge(row, extract(row).copy(nTupIns = value)))
  override val nTupUpd = new OptField[Long, Row](prefix, "n_tup_upd", None, None)(x => extract(x).nTupUpd, (row, value) => merge(row, extract(row).copy(nTupUpd = value)))
  override val nTupDel = new OptField[Long, Row](prefix, "n_tup_del", None, None)(x => extract(x).nTupDel, (row, value) => merge(row, extract(row).copy(nTupDel = value)))
  override val nTupHotUpd = new OptField[Long, Row](prefix, "n_tup_hot_upd", None, None)(x => extract(x).nTupHotUpd, (row, value) => merge(row, extract(row).copy(nTupHotUpd = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](relid, schemaname, relname, seqScan, seqTupRead, idxScan, idxTupFetch, nTupIns, nTupUpd, nTupDel, nTupHotUpd)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgStatXactAllTablesViewRow, merge: (NewRow, PgStatXactAllTablesViewRow) => NewRow): PgStatXactAllTablesViewStructure[NewRow] =
    new PgStatXactAllTablesViewStructure(prefix, extract, merge)
}
