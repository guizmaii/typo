/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package view_column_usage

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object ViewColumnUsageViewRepoImpl extends ViewColumnUsageViewRepo {
  override def selectAll: Stream[ConnectionIO, ViewColumnUsageViewRow] = {
    sql"""select view_catalog, view_schema, view_name, table_catalog, table_schema, "table_name", "column_name" from information_schema.view_column_usage""".query[ViewColumnUsageViewRow].stream
  }
}
