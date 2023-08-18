/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sequences

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SequencesViewStructure[Row](val prefix: Option[String], val extract: Row => SequencesViewRow, val merge: (Row, SequencesViewRow) => Row)
  extends Relation[SequencesViewFields, SequencesViewRow, Row]
    with SequencesViewFields[Row] { outer =>

  override val sequenceCatalog = new OptField[SqlIdentifier, Row](prefix, "sequence_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).sequenceCatalog, (row, value) => merge(row, extract(row).copy(sequenceCatalog = value)))
  override val sequenceSchema = new OptField[SqlIdentifier, Row](prefix, "sequence_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).sequenceSchema, (row, value) => merge(row, extract(row).copy(sequenceSchema = value)))
  override val sequenceName = new OptField[SqlIdentifier, Row](prefix, "sequence_name", None, Some("information_schema.sql_identifier"))(x => extract(x).sequenceName, (row, value) => merge(row, extract(row).copy(sequenceName = value)))
  override val dataType = new OptField[CharacterData, Row](prefix, "data_type", None, Some("information_schema.character_data"))(x => extract(x).dataType, (row, value) => merge(row, extract(row).copy(dataType = value)))
  override val numericPrecision = new OptField[CardinalNumber, Row](prefix, "numeric_precision", None, Some("information_schema.cardinal_number"))(x => extract(x).numericPrecision, (row, value) => merge(row, extract(row).copy(numericPrecision = value)))
  override val numericPrecisionRadix = new OptField[CardinalNumber, Row](prefix, "numeric_precision_radix", None, Some("information_schema.cardinal_number"))(x => extract(x).numericPrecisionRadix, (row, value) => merge(row, extract(row).copy(numericPrecisionRadix = value)))
  override val numericScale = new OptField[CardinalNumber, Row](prefix, "numeric_scale", None, Some("information_schema.cardinal_number"))(x => extract(x).numericScale, (row, value) => merge(row, extract(row).copy(numericScale = value)))
  override val startValue = new OptField[CharacterData, Row](prefix, "start_value", None, Some("information_schema.character_data"))(x => extract(x).startValue, (row, value) => merge(row, extract(row).copy(startValue = value)))
  override val minimumValue = new OptField[CharacterData, Row](prefix, "minimum_value", None, Some("information_schema.character_data"))(x => extract(x).minimumValue, (row, value) => merge(row, extract(row).copy(minimumValue = value)))
  override val maximumValue = new OptField[CharacterData, Row](prefix, "maximum_value", None, Some("information_schema.character_data"))(x => extract(x).maximumValue, (row, value) => merge(row, extract(row).copy(maximumValue = value)))
  override val increment = new OptField[CharacterData, Row](prefix, "increment", None, Some("information_schema.character_data"))(x => extract(x).increment, (row, value) => merge(row, extract(row).copy(increment = value)))
  override val cycleOption = new OptField[YesOrNo, Row](prefix, "cycle_option", None, Some("information_schema.yes_or_no"))(x => extract(x).cycleOption, (row, value) => merge(row, extract(row).copy(cycleOption = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](sequenceCatalog, sequenceSchema, sequenceName, dataType, numericPrecision, numericPrecisionRadix, numericScale, startValue, minimumValue, maximumValue, increment, cycleOption)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SequencesViewRow, merge: (NewRow, SequencesViewRow) => NewRow): SequencesViewStructure[NewRow] =
    new SequencesViewStructure(prefix, extract, merge)
}
