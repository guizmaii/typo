/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_file_settings

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgFileSettingsViewRepo {
  def selectAll: Stream[ConnectionIO, PgFileSettingsViewRow]
}
