/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_depend

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgDependRepo {
  def insert(unsaved: PgDependRow): ConnectionIO[PgDependRow]
  def selectAll: Stream[ConnectionIO, PgDependRow]
}
