/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package information_schema_catalog_name

import typo.dsl.SqlExpr.OptField

trait InformationSchemaCatalogNameViewFields[Row] {
  val catalogName: OptField[SqlIdentifier, Row]
}
object InformationSchemaCatalogNameViewFields extends InformationSchemaCatalogNameViewStructure[InformationSchemaCatalogNameViewRow](None, identity, (_, x) => x)

