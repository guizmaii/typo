/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package triggered_update_columns

import doobie.free.connection.ConnectionIO
import fs2.Stream
import typo.dsl.SelectBuilder

trait TriggeredUpdateColumnsViewRepo {
  def select: SelectBuilder[TriggeredUpdateColumnsViewFields, TriggeredUpdateColumnsViewRow]
  def selectAll: Stream[ConnectionIO, TriggeredUpdateColumnsViewRow]
}
