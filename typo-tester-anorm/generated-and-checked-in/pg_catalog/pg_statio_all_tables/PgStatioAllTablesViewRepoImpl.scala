/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_all_tables

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgStatioAllTablesViewRepoImpl extends PgStatioAllTablesViewRepo {
  override def selectAll(implicit c: Connection): List[PgStatioAllTablesViewRow] = {
    SQL"""select relid, schemaname, relname, heap_blks_read, heap_blks_hit, idx_blks_read, idx_blks_hit, toast_blks_read, toast_blks_hit, tidx_blks_read, tidx_blks_hit
          from pg_catalog.pg_statio_all_tables
       """.as(PgStatioAllTablesViewRow.rowParser(1).*)
  }
}
