/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_server_options

import java.sql.Connection

trait ForeignServerOptionsViewRepo {
  def selectAll(implicit c: Connection): List[ForeignServerOptionsViewRow]
}
