/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package role_column_grants

import java.sql.Connection

trait RoleColumnGrantsViewRepo {
  def selectAll(implicit c: Connection): List[RoleColumnGrantsViewRow]
}
