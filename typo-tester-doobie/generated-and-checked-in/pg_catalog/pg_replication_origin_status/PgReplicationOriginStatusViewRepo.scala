/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_replication_origin_status

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgReplicationOriginStatusViewRepo {
  def selectAll: Stream[ConnectionIO, PgReplicationOriginStatusViewRow]
}
