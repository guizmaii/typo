/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_hba_file_rules

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgHbaFileRulesViewRepo {
  def selectAll: Stream[ConnectionIO, PgHbaFileRulesViewRow]
}
