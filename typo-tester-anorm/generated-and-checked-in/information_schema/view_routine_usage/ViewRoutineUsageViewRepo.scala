/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package view_routine_usage

import java.sql.Connection

trait ViewRoutineUsageViewRepo {
  def selectAll(implicit c: Connection): List[ViewRoutineUsageViewRow]
}
