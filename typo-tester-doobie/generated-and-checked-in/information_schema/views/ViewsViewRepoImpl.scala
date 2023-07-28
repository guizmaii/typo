/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package views

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object ViewsViewRepoImpl extends ViewsViewRepo {
  override def selectAll: Stream[ConnectionIO, ViewsViewRow] = {
    sql"""select table_catalog, table_schema, "table_name", view_definition, check_option, is_updatable, is_insertable_into, is_trigger_updatable, is_trigger_deletable, is_trigger_insertable_into from information_schema."views"""".query[ViewsViewRow].stream
  }
}
