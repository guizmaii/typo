/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package user_defined_types

import java.sql.Connection

trait UserDefinedTypesViewRepo {
  def selectAll(implicit c: Connection): List[UserDefinedTypesViewRow]
}
