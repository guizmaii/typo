/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_wal

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgStatWalViewRepo {
  def selectAll: Stream[ConnectionIO, PgStatWalViewRow]
}
