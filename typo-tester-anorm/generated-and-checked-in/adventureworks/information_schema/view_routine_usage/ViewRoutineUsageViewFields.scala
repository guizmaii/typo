/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package view_routine_usage

import typo.dsl.SqlExpr.OptField

trait ViewRoutineUsageViewFields[Row] {
  val tableCatalog: OptField[String, Row]
  val tableSchema: OptField[String, Row]
  val tableName: OptField[String, Row]
  val specificCatalog: OptField[String, Row]
  val specificSchema: OptField[String, Row]
  val specificName: OptField[String, Row]
}
object ViewRoutineUsageViewFields extends ViewRoutineUsageViewStructure[ViewRoutineUsageViewRow](None, identity, (_, x) => x)

