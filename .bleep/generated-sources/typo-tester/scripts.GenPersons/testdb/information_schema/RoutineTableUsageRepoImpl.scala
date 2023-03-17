package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait RoutineTableUsageRepoImpl extends RoutineTableUsageRepo {
  override def selectAll(implicit c: Connection): List[RoutineTableUsageRow] = {
    SQL"""select specific_catalog, specific_schema, specific_name, routine_catalog, routine_schema, routine_name, table_catalog, table_schema, table_name from information_schema.routine_table_usage""".as(RoutineTableUsageRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[RoutineTableUsageFieldValue[_]])(implicit c: Connection): List[RoutineTableUsageRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case RoutineTableUsageFieldValue.specificCatalog(value) => NamedParameter("specific_catalog", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.specificSchema(value) => NamedParameter("specific_schema", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.specificName(value) => NamedParameter("specific_name", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.routineCatalog(value) => NamedParameter("routine_catalog", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.routineSchema(value) => NamedParameter("routine_schema", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.routineName(value) => NamedParameter("routine_name", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case RoutineTableUsageFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.routine_table_usage where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(RoutineTableUsageRow.rowParser.*)
    }

  }
}
