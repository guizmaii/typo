/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package column_options

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class ColumnOptionsViewStructure[Row](val prefix: Option[String], val extract: Row => ColumnOptionsViewRow, val merge: (Row, ColumnOptionsViewRow) => Row)
  extends Relation[ColumnOptionsViewFields, ColumnOptionsViewRow, Row]
    with ColumnOptionsViewFields[Row] { outer =>

  override val tableCatalog = new OptField[String, Row](prefix, "table_catalog", None, None)(x => extract(x).tableCatalog, (row, value) => merge(row, extract(row).copy(tableCatalog = value)))
  override val tableSchema = new OptField[String, Row](prefix, "table_schema", None, None)(x => extract(x).tableSchema, (row, value) => merge(row, extract(row).copy(tableSchema = value)))
  override val tableName = new OptField[String, Row](prefix, "table_name", None, None)(x => extract(x).tableName, (row, value) => merge(row, extract(row).copy(tableName = value)))
  override val columnName = new OptField[String, Row](prefix, "column_name", None, None)(x => extract(x).columnName, (row, value) => merge(row, extract(row).copy(columnName = value)))
  override val optionName = new OptField[String, Row](prefix, "option_name", None, None)(x => extract(x).optionName, (row, value) => merge(row, extract(row).copy(optionName = value)))
  override val optionValue = new OptField[String, Row](prefix, "option_value", None, None)(x => extract(x).optionValue, (row, value) => merge(row, extract(row).copy(optionValue = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](tableCatalog, tableSchema, tableName, columnName, optionName, optionValue)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => ColumnOptionsViewRow, merge: (NewRow, ColumnOptionsViewRow) => NewRow): ColumnOptionsViewStructure[NewRow] =
    new ColumnOptionsViewStructure(prefix, extract, merge)
}
