/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package constraint_table_usage

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait ConstraintTableUsageViewRepo {
  def selectAll: Stream[ConnectionIO, ConstraintTableUsageViewRow]
}
