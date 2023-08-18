/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_data_wrapper_options

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class ForeignDataWrapperOptionsViewStructure[Row](val prefix: Option[String], val extract: Row => ForeignDataWrapperOptionsViewRow, val merge: (Row, ForeignDataWrapperOptionsViewRow) => Row)
  extends Relation[ForeignDataWrapperOptionsViewFields, ForeignDataWrapperOptionsViewRow, Row]
    with ForeignDataWrapperOptionsViewFields[Row] { outer =>

  override val foreignDataWrapperCatalog = new OptField[SqlIdentifier, Row](prefix, "foreign_data_wrapper_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignDataWrapperCatalog, (row, value) => merge(row, extract(row).copy(foreignDataWrapperCatalog = value)))
  override val foreignDataWrapperName = new OptField[SqlIdentifier, Row](prefix, "foreign_data_wrapper_name", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignDataWrapperName, (row, value) => merge(row, extract(row).copy(foreignDataWrapperName = value)))
  override val optionName = new OptField[SqlIdentifier, Row](prefix, "option_name", None, Some("information_schema.sql_identifier"))(x => extract(x).optionName, (row, value) => merge(row, extract(row).copy(optionName = value)))
  override val optionValue = new OptField[CharacterData, Row](prefix, "option_value", None, Some("information_schema.character_data"))(x => extract(x).optionValue, (row, value) => merge(row, extract(row).copy(optionValue = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](foreignDataWrapperCatalog, foreignDataWrapperName, optionName, optionValue)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => ForeignDataWrapperOptionsViewRow, merge: (NewRow, ForeignDataWrapperOptionsViewRow) => NewRow): ForeignDataWrapperOptionsViewStructure[NewRow] =
    new ForeignDataWrapperOptionsViewStructure(prefix, extract, merge)
}
