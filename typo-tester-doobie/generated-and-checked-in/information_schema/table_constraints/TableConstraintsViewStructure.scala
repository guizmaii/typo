/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package table_constraints

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class TableConstraintsViewStructure[Row](val prefix: Option[String], val extract: Row => TableConstraintsViewRow, val merge: (Row, TableConstraintsViewRow) => Row)
  extends Relation[TableConstraintsViewFields, TableConstraintsViewRow, Row]
    with TableConstraintsViewFields[Row] { outer =>

  override val constraintCatalog = new OptField[SqlIdentifier, Row](prefix, "constraint_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).constraintCatalog, (row, value) => merge(row, extract(row).copy(constraintCatalog = value)))
  override val constraintSchema = new OptField[SqlIdentifier, Row](prefix, "constraint_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).constraintSchema, (row, value) => merge(row, extract(row).copy(constraintSchema = value)))
  override val constraintName = new OptField[SqlIdentifier, Row](prefix, "constraint_name", None, Some("information_schema.sql_identifier"))(x => extract(x).constraintName, (row, value) => merge(row, extract(row).copy(constraintName = value)))
  override val tableCatalog = new OptField[SqlIdentifier, Row](prefix, "table_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).tableCatalog, (row, value) => merge(row, extract(row).copy(tableCatalog = value)))
  override val tableSchema = new OptField[SqlIdentifier, Row](prefix, "table_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).tableSchema, (row, value) => merge(row, extract(row).copy(tableSchema = value)))
  override val tableName = new OptField[SqlIdentifier, Row](prefix, "table_name", None, Some("information_schema.sql_identifier"))(x => extract(x).tableName, (row, value) => merge(row, extract(row).copy(tableName = value)))
  override val constraintType = new OptField[CharacterData, Row](prefix, "constraint_type", None, Some("information_schema.character_data"))(x => extract(x).constraintType, (row, value) => merge(row, extract(row).copy(constraintType = value)))
  override val isDeferrable = new OptField[YesOrNo, Row](prefix, "is_deferrable", None, Some("information_schema.yes_or_no"))(x => extract(x).isDeferrable, (row, value) => merge(row, extract(row).copy(isDeferrable = value)))
  override val initiallyDeferred = new OptField[YesOrNo, Row](prefix, "initially_deferred", None, Some("information_schema.yes_or_no"))(x => extract(x).initiallyDeferred, (row, value) => merge(row, extract(row).copy(initiallyDeferred = value)))
  override val enforced = new OptField[YesOrNo, Row](prefix, "enforced", None, Some("information_schema.yes_or_no"))(x => extract(x).enforced, (row, value) => merge(row, extract(row).copy(enforced = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](constraintCatalog, constraintSchema, constraintName, tableCatalog, tableSchema, tableName, constraintType, isDeferrable, initiallyDeferred, enforced)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => TableConstraintsViewRow, merge: (NewRow, TableConstraintsViewRow) => NewRow): TableConstraintsViewStructure[NewRow] =
    new TableConstraintsViewStructure(prefix, extract, merge)
}
