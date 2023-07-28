/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_user_mappings

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgUserMappingsViewRepoImpl extends PgUserMappingsViewRepo {
  override def selectAll: Stream[ConnectionIO, PgUserMappingsViewRow] = {
    sql"select umid, srvid, srvname, umuser, usename, umoptions from pg_catalog.pg_user_mappings".query[PgUserMappingsViewRow].stream
  }
}
