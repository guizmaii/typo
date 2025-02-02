/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package views

import typo.dsl.SqlExpr.OptField

trait ViewsViewFields[Row] {
  val tableCatalog: OptField[String, Row]
  val tableSchema: OptField[String, Row]
  val tableName: OptField[String, Row]
  val viewDefinition: OptField[String, Row]
  val checkOption: OptField[String, Row]
  val isUpdatable: OptField[/* max 3 chars */ String, Row]
  val isInsertableInto: OptField[/* max 3 chars */ String, Row]
  val isTriggerUpdatable: OptField[/* max 3 chars */ String, Row]
  val isTriggerDeletable: OptField[/* max 3 chars */ String, Row]
  val isTriggerInsertableInto: OptField[/* max 3 chars */ String, Row]
}
object ViewsViewFields extends ViewsViewStructure[ViewsViewRow](None, identity, (_, x) => x)

