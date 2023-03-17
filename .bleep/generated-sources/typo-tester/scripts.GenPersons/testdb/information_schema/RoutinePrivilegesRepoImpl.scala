package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait RoutinePrivilegesRepoImpl extends RoutinePrivilegesRepo {
  override def selectAll(implicit c: Connection): List[RoutinePrivilegesRow] = {
    SQL"""select grantor, grantee, specific_catalog, specific_schema, specific_name, routine_catalog, routine_schema, routine_name, privilege_type, is_grantable from information_schema.routine_privileges""".as(RoutinePrivilegesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[RoutinePrivilegesFieldValue[_]])(implicit c: Connection): List[RoutinePrivilegesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case RoutinePrivilegesFieldValue.grantor(value) => NamedParameter("grantor", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.grantee(value) => NamedParameter("grantee", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.specificCatalog(value) => NamedParameter("specific_catalog", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.specificSchema(value) => NamedParameter("specific_schema", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.specificName(value) => NamedParameter("specific_name", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.routineCatalog(value) => NamedParameter("routine_catalog", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.routineSchema(value) => NamedParameter("routine_schema", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.routineName(value) => NamedParameter("routine_name", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.privilegeType(value) => NamedParameter("privilege_type", ParameterValue.from(value))
          case RoutinePrivilegesFieldValue.isGrantable(value) => NamedParameter("is_grantable", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.routine_privileges where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(RoutinePrivilegesRow.rowParser.*)
    }

  }
}
