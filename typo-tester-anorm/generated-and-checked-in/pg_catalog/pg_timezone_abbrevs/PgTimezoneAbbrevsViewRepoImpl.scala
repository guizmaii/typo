/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_timezone_abbrevs

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgTimezoneAbbrevsViewRepoImpl extends PgTimezoneAbbrevsViewRepo {
  override def selectAll(implicit c: Connection): List[PgTimezoneAbbrevsViewRow] = {
    SQL"""select abbrev, utc_offset, is_dst
          from pg_catalog.pg_timezone_abbrevs
       """.as(PgTimezoneAbbrevsViewRow.rowParser(1).*)
  }
}
