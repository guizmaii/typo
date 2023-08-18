/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_archiver

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgStatArchiverViewStructure[Row](val prefix: Option[String], val extract: Row => PgStatArchiverViewRow, val merge: (Row, PgStatArchiverViewRow) => Row)
  extends Relation[PgStatArchiverViewFields, PgStatArchiverViewRow, Row]
    with PgStatArchiverViewFields[Row] { outer =>

  override val archivedCount = new OptField[Long, Row](prefix, "archived_count", None, Some("int8"))(x => extract(x).archivedCount, (row, value) => merge(row, extract(row).copy(archivedCount = value)))
  override val lastArchivedWal = new OptField[String, Row](prefix, "last_archived_wal", None, None)(x => extract(x).lastArchivedWal, (row, value) => merge(row, extract(row).copy(lastArchivedWal = value)))
  override val lastArchivedTime = new OptField[TypoOffsetDateTime, Row](prefix, "last_archived_time", Some("text"), Some("timestamptz"))(x => extract(x).lastArchivedTime, (row, value) => merge(row, extract(row).copy(lastArchivedTime = value)))
  override val failedCount = new OptField[Long, Row](prefix, "failed_count", None, Some("int8"))(x => extract(x).failedCount, (row, value) => merge(row, extract(row).copy(failedCount = value)))
  override val lastFailedWal = new OptField[String, Row](prefix, "last_failed_wal", None, None)(x => extract(x).lastFailedWal, (row, value) => merge(row, extract(row).copy(lastFailedWal = value)))
  override val lastFailedTime = new OptField[TypoOffsetDateTime, Row](prefix, "last_failed_time", Some("text"), Some("timestamptz"))(x => extract(x).lastFailedTime, (row, value) => merge(row, extract(row).copy(lastFailedTime = value)))
  override val statsReset = new OptField[TypoOffsetDateTime, Row](prefix, "stats_reset", Some("text"), Some("timestamptz"))(x => extract(x).statsReset, (row, value) => merge(row, extract(row).copy(statsReset = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](archivedCount, lastArchivedWal, lastArchivedTime, failedCount, lastFailedWal, lastFailedTime, statsReset)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgStatArchiverViewRow, merge: (NewRow, PgStatArchiverViewRow) => NewRow): PgStatArchiverViewStructure[NewRow] =
    new PgStatArchiverViewStructure(prefix, extract, merge)
}
