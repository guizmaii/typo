package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ColumnColumnUsageRepoImpl extends ColumnColumnUsageRepo {
  override def selectAll(implicit c: Connection): List[ColumnColumnUsageRow] = {
    SQL"""select table_catalog, table_schema, table_name, column_name, dependent_column from information_schema.column_column_usage""".as(ColumnColumnUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ColumnColumnUsageFieldValue[_]])(implicit c: Connection): List[ColumnColumnUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ColumnColumnUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case ColumnColumnUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case ColumnColumnUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case ColumnColumnUsageFieldValue.columnName(value) => NamedParameter("column_name", ParameterValue.from(value))
          case ColumnColumnUsageFieldValue.dependentColumn(value) => NamedParameter("dependent_column", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.column_column_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ColumnColumnUsageRow.rowParser.*)
    }

  }
}
