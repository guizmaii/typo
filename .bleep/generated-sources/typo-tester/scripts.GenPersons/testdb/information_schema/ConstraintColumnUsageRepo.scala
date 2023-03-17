package testdb
package information_schema

import java.sql.Connection

trait ConstraintColumnUsageRepo {
  def selectAll(implicit c: Connection): List[ConstraintColumnUsageRow]
  def selectByFieldValues(fieldValues: List[ConstraintColumnUsageFieldValue[_]])(implicit c: Connection): List[ConstraintColumnUsageRow]
}
