/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_sequences

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgSequencesViewRepoImpl extends PgSequencesViewRepo {
  override def selectAll(implicit c: Connection): List[PgSequencesViewRow] = {
    SQL"""select schemaname, sequencename, sequenceowner, data_type, start_value, min_value, max_value, increment_by, "cycle", cache_size, "last_value"
          from pg_catalog.pg_sequences
       """.as(PgSequencesViewRow.rowParser(1).*)
  }
}
