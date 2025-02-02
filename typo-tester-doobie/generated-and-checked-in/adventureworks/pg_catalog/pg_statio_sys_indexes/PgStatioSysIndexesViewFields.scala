/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_sys_indexes

import adventureworks.pg_catalog.pg_class.PgClassId
import typo.dsl.SqlExpr.OptField

trait PgStatioSysIndexesViewFields[Row] {
  val relid: OptField[PgClassId, Row]
  val indexrelid: OptField[PgClassId, Row]
  val schemaname: OptField[String, Row]
  val relname: OptField[String, Row]
  val indexrelname: OptField[String, Row]
  val idxBlksRead: OptField[/* nullability unknown */ Long, Row]
  val idxBlksHit: OptField[/* nullability unknown */ Long, Row]
}
object PgStatioSysIndexesViewFields extends PgStatioSysIndexesViewStructure[PgStatioSysIndexesViewRow](None, identity, (_, x) => x)

