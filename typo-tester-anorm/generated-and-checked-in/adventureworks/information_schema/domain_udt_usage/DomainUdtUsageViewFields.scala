/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package domain_udt_usage

import typo.dsl.SqlExpr.OptField

trait DomainUdtUsageViewFields[Row] {
  val udtCatalog: OptField[String, Row]
  val udtSchema: OptField[String, Row]
  val udtName: OptField[String, Row]
  val domainCatalog: OptField[String, Row]
  val domainSchema: OptField[String, Row]
  val domainName: OptField[String, Row]
}
object DomainUdtUsageViewFields extends DomainUdtUsageViewStructure[DomainUdtUsageViewRow](None, identity, (_, x) => x)

