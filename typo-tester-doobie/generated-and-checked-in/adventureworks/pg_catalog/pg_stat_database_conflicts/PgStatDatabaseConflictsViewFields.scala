/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_database_conflicts

import adventureworks.pg_catalog.pg_database.PgDatabaseId
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.OptField

trait PgStatDatabaseConflictsViewFields[Row] {
  val datid: Field[PgDatabaseId, Row]
  val datname: Field[String, Row]
  val conflTablespace: OptField[Long, Row]
  val conflLock: OptField[Long, Row]
  val conflSnapshot: OptField[Long, Row]
  val conflBufferpin: OptField[Long, Row]
  val conflDeadlock: OptField[Long, Row]
}
object PgStatDatabaseConflictsViewFields extends PgStatDatabaseConflictsViewStructure[PgStatDatabaseConflictsViewRow](None, identity, (_, x) => x)

