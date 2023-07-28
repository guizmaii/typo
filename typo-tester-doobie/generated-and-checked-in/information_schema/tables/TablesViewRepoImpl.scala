/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package tables

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object TablesViewRepoImpl extends TablesViewRepo {
  override def selectAll: Stream[ConnectionIO, TablesViewRow] = {
    sql"""select table_catalog, table_schema, "table_name", table_type, self_referencing_column_name, reference_generation, "user_defined_type_catalog", "user_defined_type_schema", "user_defined_type_name", is_insertable_into, is_typed, commit_action from information_schema."tables"""".query[TablesViewRow].stream
  }
}
