/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_bgwriter

import adventureworks.customtypes.TypoInstant
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgStatBgwriterViewStructure[Row](val prefix: Option[String], val extract: Row => PgStatBgwriterViewRow, val merge: (Row, PgStatBgwriterViewRow) => Row)
  extends Relation[PgStatBgwriterViewFields, PgStatBgwriterViewRow, Row]
    with PgStatBgwriterViewFields[Row] { outer =>

  override val checkpointsTimed = new OptField[Long, Row](prefix, "checkpoints_timed", None, None)(x => extract(x).checkpointsTimed, (row, value) => merge(row, extract(row).copy(checkpointsTimed = value)))
  override val checkpointsReq = new OptField[Long, Row](prefix, "checkpoints_req", None, None)(x => extract(x).checkpointsReq, (row, value) => merge(row, extract(row).copy(checkpointsReq = value)))
  override val checkpointWriteTime = new OptField[Double, Row](prefix, "checkpoint_write_time", None, None)(x => extract(x).checkpointWriteTime, (row, value) => merge(row, extract(row).copy(checkpointWriteTime = value)))
  override val checkpointSyncTime = new OptField[Double, Row](prefix, "checkpoint_sync_time", None, None)(x => extract(x).checkpointSyncTime, (row, value) => merge(row, extract(row).copy(checkpointSyncTime = value)))
  override val buffersCheckpoint = new OptField[Long, Row](prefix, "buffers_checkpoint", None, None)(x => extract(x).buffersCheckpoint, (row, value) => merge(row, extract(row).copy(buffersCheckpoint = value)))
  override val buffersClean = new OptField[Long, Row](prefix, "buffers_clean", None, None)(x => extract(x).buffersClean, (row, value) => merge(row, extract(row).copy(buffersClean = value)))
  override val maxwrittenClean = new OptField[Long, Row](prefix, "maxwritten_clean", None, None)(x => extract(x).maxwrittenClean, (row, value) => merge(row, extract(row).copy(maxwrittenClean = value)))
  override val buffersBackend = new OptField[Long, Row](prefix, "buffers_backend", None, None)(x => extract(x).buffersBackend, (row, value) => merge(row, extract(row).copy(buffersBackend = value)))
  override val buffersBackendFsync = new OptField[Long, Row](prefix, "buffers_backend_fsync", None, None)(x => extract(x).buffersBackendFsync, (row, value) => merge(row, extract(row).copy(buffersBackendFsync = value)))
  override val buffersAlloc = new OptField[Long, Row](prefix, "buffers_alloc", None, None)(x => extract(x).buffersAlloc, (row, value) => merge(row, extract(row).copy(buffersAlloc = value)))
  override val statsReset = new OptField[TypoInstant, Row](prefix, "stats_reset", Some("text"), None)(x => extract(x).statsReset, (row, value) => merge(row, extract(row).copy(statsReset = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](checkpointsTimed, checkpointsReq, checkpointWriteTime, checkpointSyncTime, buffersCheckpoint, buffersClean, maxwrittenClean, buffersBackend, buffersBackendFsync, buffersAlloc, statsReset)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgStatBgwriterViewRow, merge: (NewRow, PgStatBgwriterViewRow) => NewRow): PgStatBgwriterViewStructure[NewRow] =
    new PgStatBgwriterViewStructure(prefix, extract, merge)
}
