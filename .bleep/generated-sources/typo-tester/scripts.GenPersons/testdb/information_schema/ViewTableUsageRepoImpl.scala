package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ViewTableUsageRepoImpl extends ViewTableUsageRepo {
  override def selectAll(implicit c: Connection): List[ViewTableUsageRow] = {
    SQL"""select view_catalog, view_schema, view_name, table_catalog, table_schema, table_name from information_schema.view_table_usage""".as(ViewTableUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ViewTableUsageFieldValue[_]])(implicit c: Connection): List[ViewTableUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ViewTableUsageFieldValue.viewCatalog(value) => NamedParameter("view_catalog", ParameterValue.from(value))
          case ViewTableUsageFieldValue.viewSchema(value) => NamedParameter("view_schema", ParameterValue.from(value))
          case ViewTableUsageFieldValue.viewName(value) => NamedParameter("view_name", ParameterValue.from(value))
          case ViewTableUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case ViewTableUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case ViewTableUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.view_table_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ViewTableUsageRow.rowParser.*)
    }

  }
}
