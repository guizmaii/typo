/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_servers

import java.sql.Connection

trait ForeignServersViewRepo {
  def selectAll(implicit c: Connection): List[ForeignServersViewRow]
}
