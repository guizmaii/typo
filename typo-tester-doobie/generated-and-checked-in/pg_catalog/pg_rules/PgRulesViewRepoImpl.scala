/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_rules

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgRulesViewRepoImpl extends PgRulesViewRepo {
  override def selectAll: Stream[ConnectionIO, PgRulesViewRow] = {
    sql"select schemaname, tablename, rulename, definition from pg_catalog.pg_rules".query[PgRulesViewRow].stream
  }
}
