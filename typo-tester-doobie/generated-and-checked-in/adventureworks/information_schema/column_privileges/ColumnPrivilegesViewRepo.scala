/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package column_privileges

import doobie.free.connection.ConnectionIO
import fs2.Stream
import typo.dsl.SelectBuilder

trait ColumnPrivilegesViewRepo {
  def select: SelectBuilder[ColumnPrivilegesViewFields, ColumnPrivilegesViewRow]
  def selectAll: Stream[ConnectionIO, ColumnPrivilegesViewRow]
}
