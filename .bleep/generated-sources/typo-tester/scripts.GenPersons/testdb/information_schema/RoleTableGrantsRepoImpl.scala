package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait RoleTableGrantsRepoImpl extends RoleTableGrantsRepo {
  override def selectAll(implicit c: Connection): List[RoleTableGrantsRow] = {
    SQL"""select grantor, grantee, table_catalog, table_schema, table_name, privilege_type, is_grantable, with_hierarchy from information_schema.role_table_grants""".as(RoleTableGrantsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[RoleTableGrantsFieldValue[_]])(implicit c: Connection): List[RoleTableGrantsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case RoleTableGrantsFieldValue.grantor(value) => NamedParameter("grantor", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.grantee(value) => NamedParameter("grantee", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.tableCatalog(value) => NamedParameter("table_catalog", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.tableSchema(value) => NamedParameter("table_schema", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.tableName(value) => NamedParameter("table_name", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.privilegeType(value) => NamedParameter("privilege_type", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.isGrantable(value) => NamedParameter("is_grantable", ParameterValue.from(value))
          case RoleTableGrantsFieldValue.withHierarchy(value) => NamedParameter("with_hierarchy", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.role_table_grants where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(RoleTableGrantsRow.rowParser.*)
    }

  }
}
