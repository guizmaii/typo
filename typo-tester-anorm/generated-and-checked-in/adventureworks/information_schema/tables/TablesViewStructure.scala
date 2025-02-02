/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package tables

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class TablesViewStructure[Row](val prefix: Option[String], val extract: Row => TablesViewRow, val merge: (Row, TablesViewRow) => Row)
  extends Relation[TablesViewFields, TablesViewRow, Row]
    with TablesViewFields[Row] { outer =>

  override val tableCatalog = new OptField[String, Row](prefix, "table_catalog", None, None)(x => extract(x).tableCatalog, (row, value) => merge(row, extract(row).copy(tableCatalog = value)))
  override val tableSchema = new OptField[String, Row](prefix, "table_schema", None, None)(x => extract(x).tableSchema, (row, value) => merge(row, extract(row).copy(tableSchema = value)))
  override val tableName = new OptField[String, Row](prefix, "table_name", None, None)(x => extract(x).tableName, (row, value) => merge(row, extract(row).copy(tableName = value)))
  override val tableType = new OptField[String, Row](prefix, "table_type", None, None)(x => extract(x).tableType, (row, value) => merge(row, extract(row).copy(tableType = value)))
  override val selfReferencingColumnName = new OptField[String, Row](prefix, "self_referencing_column_name", None, None)(x => extract(x).selfReferencingColumnName, (row, value) => merge(row, extract(row).copy(selfReferencingColumnName = value)))
  override val referenceGeneration = new OptField[String, Row](prefix, "reference_generation", None, None)(x => extract(x).referenceGeneration, (row, value) => merge(row, extract(row).copy(referenceGeneration = value)))
  override val userDefinedTypeCatalog = new OptField[String, Row](prefix, "user_defined_type_catalog", None, None)(x => extract(x).userDefinedTypeCatalog, (row, value) => merge(row, extract(row).copy(userDefinedTypeCatalog = value)))
  override val userDefinedTypeSchema = new OptField[String, Row](prefix, "user_defined_type_schema", None, None)(x => extract(x).userDefinedTypeSchema, (row, value) => merge(row, extract(row).copy(userDefinedTypeSchema = value)))
  override val userDefinedTypeName = new OptField[String, Row](prefix, "user_defined_type_name", None, None)(x => extract(x).userDefinedTypeName, (row, value) => merge(row, extract(row).copy(userDefinedTypeName = value)))
  override val isInsertableInto = new OptField[/* max 3 chars */ String, Row](prefix, "is_insertable_into", None, None)(x => extract(x).isInsertableInto, (row, value) => merge(row, extract(row).copy(isInsertableInto = value)))
  override val isTyped = new OptField[/* max 3 chars */ String, Row](prefix, "is_typed", None, None)(x => extract(x).isTyped, (row, value) => merge(row, extract(row).copy(isTyped = value)))
  override val commitAction = new OptField[String, Row](prefix, "commit_action", None, None)(x => extract(x).commitAction, (row, value) => merge(row, extract(row).copy(commitAction = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](tableCatalog, tableSchema, tableName, tableType, selfReferencingColumnName, referenceGeneration, userDefinedTypeCatalog, userDefinedTypeSchema, userDefinedTypeName, isInsertableInto, isTyped, commitAction)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => TablesViewRow, merge: (NewRow, TablesViewRow) => NewRow): TablesViewStructure[NewRow] =
    new TablesViewStructure(prefix, extract, merge)
}
