/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package column_domain_usage

import typo.dsl.SqlExpr.OptField

trait ColumnDomainUsageViewFields[Row] {
  val domainCatalog: OptField[SqlIdentifier, Row]
  val domainSchema: OptField[SqlIdentifier, Row]
  val domainName: OptField[SqlIdentifier, Row]
  val tableCatalog: OptField[SqlIdentifier, Row]
  val tableSchema: OptField[SqlIdentifier, Row]
  val tableName: OptField[SqlIdentifier, Row]
  val columnName: OptField[SqlIdentifier, Row]
}
object ColumnDomainUsageViewFields extends ColumnDomainUsageViewStructure[ColumnDomainUsageViewRow](None, identity, (_, x) => x)

