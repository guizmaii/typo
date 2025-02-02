/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package triggered_update_columns

import typo.dsl.SqlExpr.OptField

trait TriggeredUpdateColumnsViewFields[Row] {
  val triggerCatalog: OptField[String, Row]
  val triggerSchema: OptField[String, Row]
  val triggerName: OptField[String, Row]
  val eventObjectCatalog: OptField[String, Row]
  val eventObjectSchema: OptField[String, Row]
  val eventObjectTable: OptField[String, Row]
  val eventObjectColumn: OptField[String, Row]
}
object TriggeredUpdateColumnsViewFields extends TriggeredUpdateColumnsViewStructure[TriggeredUpdateColumnsViewRow](None, identity, (_, x) => x)

