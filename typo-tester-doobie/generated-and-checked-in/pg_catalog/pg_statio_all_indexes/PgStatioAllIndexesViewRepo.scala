/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_all_indexes

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgStatioAllIndexesViewRepo {
  def selectAll: Stream[ConnectionIO, PgStatioAllIndexesViewRow]
}
