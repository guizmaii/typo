/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package triggered_update_columns

import java.sql.Connection

trait TriggeredUpdateColumnsViewRepo {
  def selectAll(implicit c: Connection): List[TriggeredUpdateColumnsViewRow]
}
