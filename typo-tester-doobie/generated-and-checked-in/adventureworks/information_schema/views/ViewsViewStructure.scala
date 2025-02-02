/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package views

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class ViewsViewStructure[Row](val prefix: Option[String], val extract: Row => ViewsViewRow, val merge: (Row, ViewsViewRow) => Row)
  extends Relation[ViewsViewFields, ViewsViewRow, Row]
    with ViewsViewFields[Row] { outer =>

  override val tableCatalog = new OptField[String, Row](prefix, "table_catalog", None, None)(x => extract(x).tableCatalog, (row, value) => merge(row, extract(row).copy(tableCatalog = value)))
  override val tableSchema = new OptField[String, Row](prefix, "table_schema", None, None)(x => extract(x).tableSchema, (row, value) => merge(row, extract(row).copy(tableSchema = value)))
  override val tableName = new OptField[String, Row](prefix, "table_name", None, None)(x => extract(x).tableName, (row, value) => merge(row, extract(row).copy(tableName = value)))
  override val viewDefinition = new OptField[String, Row](prefix, "view_definition", None, None)(x => extract(x).viewDefinition, (row, value) => merge(row, extract(row).copy(viewDefinition = value)))
  override val checkOption = new OptField[String, Row](prefix, "check_option", None, None)(x => extract(x).checkOption, (row, value) => merge(row, extract(row).copy(checkOption = value)))
  override val isUpdatable = new OptField[/* max 3 chars */ String, Row](prefix, "is_updatable", None, None)(x => extract(x).isUpdatable, (row, value) => merge(row, extract(row).copy(isUpdatable = value)))
  override val isInsertableInto = new OptField[/* max 3 chars */ String, Row](prefix, "is_insertable_into", None, None)(x => extract(x).isInsertableInto, (row, value) => merge(row, extract(row).copy(isInsertableInto = value)))
  override val isTriggerUpdatable = new OptField[/* max 3 chars */ String, Row](prefix, "is_trigger_updatable", None, None)(x => extract(x).isTriggerUpdatable, (row, value) => merge(row, extract(row).copy(isTriggerUpdatable = value)))
  override val isTriggerDeletable = new OptField[/* max 3 chars */ String, Row](prefix, "is_trigger_deletable", None, None)(x => extract(x).isTriggerDeletable, (row, value) => merge(row, extract(row).copy(isTriggerDeletable = value)))
  override val isTriggerInsertableInto = new OptField[/* max 3 chars */ String, Row](prefix, "is_trigger_insertable_into", None, None)(x => extract(x).isTriggerInsertableInto, (row, value) => merge(row, extract(row).copy(isTriggerInsertableInto = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](tableCatalog, tableSchema, tableName, viewDefinition, checkOption, isUpdatable, isInsertableInto, isTriggerUpdatable, isTriggerDeletable, isTriggerInsertableInto)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => ViewsViewRow, merge: (NewRow, ViewsViewRow) => NewRow): ViewsViewStructure[NewRow] =
    new ViewsViewStructure(prefix, extract, merge)
}
