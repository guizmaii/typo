/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_available_extensions

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgAvailableExtensionsViewRepoImpl extends PgAvailableExtensionsViewRepo {
  override def selectAll: Stream[ConnectionIO, PgAvailableExtensionsViewRow] = {
    sql"""select "name", default_version, installed_version, "comment" from pg_catalog.pg_available_extensions""".query[PgAvailableExtensionsViewRow].stream
  }
}
