/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package user_mappings

import typo.dsl.SqlExpr.OptField

trait UserMappingsViewFields[Row] {
  val authorizationIdentifier: OptField[SqlIdentifier, Row]
  val foreignServerCatalog: OptField[SqlIdentifier, Row]
  val foreignServerName: OptField[SqlIdentifier, Row]
}
object UserMappingsViewFields extends UserMappingsViewStructure[UserMappingsViewRow](None, identity, (_, x) => x)

