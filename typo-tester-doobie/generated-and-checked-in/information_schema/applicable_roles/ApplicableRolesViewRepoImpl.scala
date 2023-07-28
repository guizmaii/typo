/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package applicable_roles

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object ApplicableRolesViewRepoImpl extends ApplicableRolesViewRepo {
  override def selectAll: Stream[ConnectionIO, ApplicableRolesViewRow] = {
    sql"select grantee, role_name, is_grantable from information_schema.applicable_roles".query[ApplicableRolesViewRow].stream
  }
}
