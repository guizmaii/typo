/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_xact_all_tables

import doobie.free.connection.ConnectionIO
import fs2.Stream
import typo.dsl.SelectBuilder

trait PgStatXactAllTablesViewRepo {
  def select: SelectBuilder[PgStatXactAllTablesViewFields, PgStatXactAllTablesViewRow]
  def selectAll: Stream[ConnectionIO, PgStatXactAllTablesViewRow]
}
