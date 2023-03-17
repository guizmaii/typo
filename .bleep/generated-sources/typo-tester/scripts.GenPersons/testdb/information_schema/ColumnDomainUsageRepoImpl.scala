package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ColumnDomainUsageRepoImpl extends ColumnDomainUsageRepo {
  override def selectAll(implicit c: Connection): List[ColumnDomainUsageRow] = {
    SQL"""select domain_catalog, domain_schema, domain_name, table_catalog, table_schema, table_name, column_name from information_schema.column_domain_usage""".as(ColumnDomainUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ColumnDomainUsageFieldValue[_]])(implicit c: Connection): List[ColumnDomainUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ColumnDomainUsageFieldValue.domainCatalog(value) => NamedParameter("domain_catalog", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.domainSchema(value) => NamedParameter("domain_schema", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.domainName(value) => NamedParameter("domain_name", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case ColumnDomainUsageFieldValue.columnName(value) => NamedParameter("column_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.column_domain_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ColumnDomainUsageRow.rowParser.*)
    }

  }
}
