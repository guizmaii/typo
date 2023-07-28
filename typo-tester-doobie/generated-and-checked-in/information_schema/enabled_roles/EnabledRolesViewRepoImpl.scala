/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package enabled_roles

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object EnabledRolesViewRepoImpl extends EnabledRolesViewRepo {
  override def selectAll: Stream[ConnectionIO, EnabledRolesViewRow] = {
    sql"select role_name from information_schema.enabled_roles".query[EnabledRolesViewRow].stream
  }
}
