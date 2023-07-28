/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_database

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgStatDatabaseViewRepoImpl extends PgStatDatabaseViewRepo {
  override def selectAll(implicit c: Connection): List[PgStatDatabaseViewRow] = {
    SQL"""select datid, datname, numbackends, xact_commit, xact_rollback, blks_read, blks_hit, tup_returned, tup_fetched, tup_inserted, tup_updated, tup_deleted, conflicts, temp_files, temp_bytes, deadlocks, checksum_failures, checksum_last_failure, blk_read_time, blk_write_time, session_time, active_time, idle_in_transaction_time, sessions, sessions_abandoned, sessions_fatal, sessions_killed, stats_reset
          from pg_catalog.pg_stat_database
       """.as(PgStatDatabaseViewRow.rowParser(1).*)
  }
}
