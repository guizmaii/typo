/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package column_udt_usage

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class ColumnUdtUsageViewStructure[Row](val prefix: Option[String], val extract: Row => ColumnUdtUsageViewRow, val merge: (Row, ColumnUdtUsageViewRow) => Row)
  extends Relation[ColumnUdtUsageViewFields, ColumnUdtUsageViewRow, Row]
    with ColumnUdtUsageViewFields[Row] { outer =>

  override val udtCatalog = new OptField[SqlIdentifier, Row](prefix, "udt_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).udtCatalog, (row, value) => merge(row, extract(row).copy(udtCatalog = value)))
  override val udtSchema = new OptField[SqlIdentifier, Row](prefix, "udt_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).udtSchema, (row, value) => merge(row, extract(row).copy(udtSchema = value)))
  override val udtName = new OptField[SqlIdentifier, Row](prefix, "udt_name", None, Some("information_schema.sql_identifier"))(x => extract(x).udtName, (row, value) => merge(row, extract(row).copy(udtName = value)))
  override val tableCatalog = new OptField[SqlIdentifier, Row](prefix, "table_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).tableCatalog, (row, value) => merge(row, extract(row).copy(tableCatalog = value)))
  override val tableSchema = new OptField[SqlIdentifier, Row](prefix, "table_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).tableSchema, (row, value) => merge(row, extract(row).copy(tableSchema = value)))
  override val tableName = new OptField[SqlIdentifier, Row](prefix, "table_name", None, Some("information_schema.sql_identifier"))(x => extract(x).tableName, (row, value) => merge(row, extract(row).copy(tableName = value)))
  override val columnName = new OptField[SqlIdentifier, Row](prefix, "column_name", None, Some("information_schema.sql_identifier"))(x => extract(x).columnName, (row, value) => merge(row, extract(row).copy(columnName = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](udtCatalog, udtSchema, udtName, tableCatalog, tableSchema, tableName, columnName)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => ColumnUdtUsageViewRow, merge: (NewRow, ColumnUdtUsageViewRow) => NewRow): ColumnUdtUsageViewStructure[NewRow] =
    new ColumnUdtUsageViewStructure(prefix, extract, merge)
}
