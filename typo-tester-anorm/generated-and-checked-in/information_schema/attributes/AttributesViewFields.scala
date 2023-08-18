/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package attributes

import typo.dsl.SqlExpr.OptField

trait AttributesViewFields[Row] {
  val udtCatalog: OptField[SqlIdentifier, Row]
  val udtSchema: OptField[SqlIdentifier, Row]
  val udtName: OptField[SqlIdentifier, Row]
  val attributeName: OptField[SqlIdentifier, Row]
  val ordinalPosition: OptField[CardinalNumber, Row]
  val attributeDefault: OptField[CharacterData, Row]
  val isNullable: OptField[YesOrNo, Row]
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
  val attributeUdtCatalog: OptField[SqlIdentifier, Row]
  val attributeUdtSchema: OptField[SqlIdentifier, Row]
  val attributeUdtName: OptField[SqlIdentifier, Row]
  val scopeCatalog: OptField[SqlIdentifier, Row]
  val scopeSchema: OptField[SqlIdentifier, Row]
  val scopeName: OptField[SqlIdentifier, Row]
  val maximumCardinality: OptField[CardinalNumber, Row]
  val dtdIdentifier: OptField[SqlIdentifier, Row]
  val isDerivedReferenceAttribute: OptField[YesOrNo, Row]
}
object AttributesViewFields extends AttributesViewStructure[AttributesViewRow](None, identity, (_, x) => x)

