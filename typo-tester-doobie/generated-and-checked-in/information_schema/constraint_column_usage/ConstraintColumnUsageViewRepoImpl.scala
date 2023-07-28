/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package constraint_column_usage

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object ConstraintColumnUsageViewRepoImpl extends ConstraintColumnUsageViewRepo {
  override def selectAll: Stream[ConnectionIO, ConstraintColumnUsageViewRow] = {
    sql"""select table_catalog, table_schema, "table_name", "column_name", "constraint_catalog", "constraint_schema", "constraint_name" from information_schema.constraint_column_usage""".query[ConstraintColumnUsageViewRow].stream
  }
}
