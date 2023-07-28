/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_tables

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgTablesViewRepoImpl extends PgTablesViewRepo {
  override def selectAll: Stream[ConnectionIO, PgTablesViewRow] = {
    sql"""select schemaname, tablename, tableowner, "tablespace", hasindexes, hasrules, hastriggers, rowsecurity from pg_catalog.pg_tables""".query[PgTablesViewRow].stream
  }
}
