package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ViewRoutineUsageRepoImpl extends ViewRoutineUsageRepo {
  override def selectAll(implicit c: Connection): List[ViewRoutineUsageRow] = {
    SQL"""select table_catalog, table_schema, table_name, specific_catalog, specific_schema, specific_name from information_schema.view_routine_usage""".as(ViewRoutineUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ViewRoutineUsageFieldValue[_]])(implicit c: Connection): List[ViewRoutineUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ViewRoutineUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case ViewRoutineUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case ViewRoutineUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case ViewRoutineUsageFieldValue.specificCatalog(value) => NamedParameter("specific_catalog", ParameterValue.from(value))
          case ViewRoutineUsageFieldValue.specificSchema(value) => NamedParameter("specific_schema", ParameterValue.from(value))
          case ViewRoutineUsageFieldValue.specificName(value) => NamedParameter("specific_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.view_routine_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ViewRoutineUsageRow.rowParser.*)
    }

  }
}
