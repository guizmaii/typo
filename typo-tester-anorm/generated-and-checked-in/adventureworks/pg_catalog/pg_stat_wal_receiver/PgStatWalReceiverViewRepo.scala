/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_wal_receiver

import java.sql.Connection
import typo.dsl.SelectBuilder

trait PgStatWalReceiverViewRepo {
  def select: SelectBuilder[PgStatWalReceiverViewFields, PgStatWalReceiverViewRow]
  def selectAll(implicit c: Connection): List[PgStatWalReceiverViewRow]
}
