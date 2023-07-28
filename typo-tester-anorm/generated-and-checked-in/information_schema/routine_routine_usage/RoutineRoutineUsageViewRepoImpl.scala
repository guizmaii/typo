/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package routine_routine_usage

import anorm.SqlStringInterpolation
import java.sql.Connection

object RoutineRoutineUsageViewRepoImpl extends RoutineRoutineUsageViewRepo {
  override def selectAll(implicit c: Connection): List[RoutineRoutineUsageViewRow] = {
    SQL"""select specific_catalog, specific_schema, "specific_name", "routine_catalog", "routine_schema", "routine_name"
          from information_schema.routine_routine_usage
       """.as(RoutineRoutineUsageViewRow.rowParser(1).*)
  }
}
