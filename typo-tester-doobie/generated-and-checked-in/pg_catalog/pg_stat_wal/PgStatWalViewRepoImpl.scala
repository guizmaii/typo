/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_wal

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgStatWalViewRepoImpl extends PgStatWalViewRepo {
  override def selectAll: Stream[ConnectionIO, PgStatWalViewRow] = {
    sql"select wal_records, wal_fpi, wal_bytes, wal_buffers_full, wal_write, wal_sync, wal_write_time, wal_sync_time, stats_reset from pg_catalog.pg_stat_wal".query[PgStatWalViewRow].stream
  }
}
