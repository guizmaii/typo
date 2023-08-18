/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package parameters

import typo.dsl.SqlExpr.OptField

trait ParametersViewFields[Row] {
  val specificCatalog: OptField[SqlIdentifier, Row]
  val specificSchema: OptField[SqlIdentifier, Row]
  val specificName: OptField[SqlIdentifier, Row]
  val ordinalPosition: OptField[CardinalNumber, Row]
  val parameterMode: OptField[CharacterData, Row]
  val isResult: OptField[YesOrNo, Row]
  val asLocator: OptField[YesOrNo, Row]
  val parameterName: OptField[SqlIdentifier, Row]
  val dataType: OptField[CharacterData, Row]
  val characterMaximumLength: OptField[CardinalNumber, Row]
  val characterOctetLength: OptField[CardinalNumber, Row]
  val characterSetCatalog: OptField[SqlIdentifier, Row]
  val characterSetSchema: OptField[SqlIdentifier, Row]
  val characterSetName: OptField[SqlIdentifier, Row]
  val collationCatalog: OptField[SqlIdentifier, Row]
  val collationSchema: OptField[SqlIdentifier, Row]
  val collationName: OptField[SqlIdentifier, Row]
  val numericPrecision: OptField[CardinalNumber, Row]
  val numericPrecisionRadix: OptField[CardinalNumber, Row]
  val numericScale: OptField[CardinalNumber, Row]
  val datetimePrecision: OptField[CardinalNumber, Row]
  val intervalType: OptField[CharacterData, Row]
  val intervalPrecision: OptField[CardinalNumber, Row]
  val udtCatalog: OptField[SqlIdentifier, Row]
  val udtSchema: OptField[SqlIdentifier, Row]
  val udtName: OptField[SqlIdentifier, Row]
  val scopeCatalog: OptField[SqlIdentifier, Row]
  val scopeSchema: OptField[SqlIdentifier, Row]
  val scopeName: OptField[SqlIdentifier, Row]
  val maximumCardinality: OptField[CardinalNumber, Row]
  val dtdIdentifier: OptField[SqlIdentifier, Row]
  val parameterDefault: OptField[CharacterData, Row]
}
object ParametersViewFields extends ParametersViewStructure[ParametersViewRow](None, identity, (_, x) => x)

