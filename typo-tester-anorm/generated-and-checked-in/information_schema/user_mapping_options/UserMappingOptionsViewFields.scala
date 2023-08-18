/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package user_mapping_options

import typo.dsl.SqlExpr.OptField

trait UserMappingOptionsViewFields[Row] {
  val authorizationIdentifier: OptField[SqlIdentifier, Row]
  val foreignServerCatalog: OptField[SqlIdentifier, Row]
  val foreignServerName: OptField[SqlIdentifier, Row]
  val optionName: OptField[SqlIdentifier, Row]
  val optionValue: OptField[CharacterData, Row]
}
object UserMappingOptionsViewFields extends UserMappingOptionsViewStructure[UserMappingOptionsViewRow](None, identity, (_, x) => x)

