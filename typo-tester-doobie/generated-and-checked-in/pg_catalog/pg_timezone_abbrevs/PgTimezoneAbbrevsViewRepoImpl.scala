/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_timezone_abbrevs

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgTimezoneAbbrevsViewRepoImpl extends PgTimezoneAbbrevsViewRepo {
  override def selectAll: Stream[ConnectionIO, PgTimezoneAbbrevsViewRow] = {
    sql"select abbrev, utc_offset, is_dst from pg_catalog.pg_timezone_abbrevs".query[PgTimezoneAbbrevsViewRow].stream
  }
}
