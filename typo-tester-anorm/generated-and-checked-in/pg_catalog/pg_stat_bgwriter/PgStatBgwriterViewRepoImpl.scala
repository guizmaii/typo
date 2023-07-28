/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_bgwriter

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgStatBgwriterViewRepoImpl extends PgStatBgwriterViewRepo {
  override def selectAll(implicit c: Connection): List[PgStatBgwriterViewRow] = {
    SQL"""select checkpoints_timed, checkpoints_req, checkpoint_write_time, checkpoint_sync_time, buffers_checkpoint, buffers_clean, maxwritten_clean, buffers_backend, buffers_backend_fsync, buffers_alloc, stats_reset
          from pg_catalog.pg_stat_bgwriter
       """.as(PgStatBgwriterViewRow.rowParser(1).*)
  }
}
