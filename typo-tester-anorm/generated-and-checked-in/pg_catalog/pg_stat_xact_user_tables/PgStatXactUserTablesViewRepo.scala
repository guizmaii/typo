/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_xact_user_tables

import java.sql.Connection

trait PgStatXactUserTablesViewRepo {
  def selectAll(implicit c: Connection): List[PgStatXactUserTablesViewRow]
}
