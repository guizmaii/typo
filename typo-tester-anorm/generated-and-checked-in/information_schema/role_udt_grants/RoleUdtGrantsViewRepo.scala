/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package role_udt_grants

import java.sql.Connection

trait RoleUdtGrantsViewRepo {
  def selectAll(implicit c: Connection): List[RoleUdtGrantsViewRow]
}
