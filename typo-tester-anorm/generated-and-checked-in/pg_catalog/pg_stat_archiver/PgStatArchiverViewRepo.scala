/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_archiver

import java.sql.Connection

trait PgStatArchiverViewRepo {
  def selectAll(implicit c: Connection): List[PgStatArchiverViewRow]
}
