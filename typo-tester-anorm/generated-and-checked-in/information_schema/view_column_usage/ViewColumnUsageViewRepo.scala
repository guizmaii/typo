/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package view_column_usage

import java.sql.Connection

trait ViewColumnUsageViewRepo {
  def selectAll(implicit c: Connection): List[ViewColumnUsageViewRow]
}
