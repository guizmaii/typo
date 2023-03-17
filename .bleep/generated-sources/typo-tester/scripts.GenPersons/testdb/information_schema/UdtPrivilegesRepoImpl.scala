package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait UdtPrivilegesRepoImpl extends UdtPrivilegesRepo {
  override def selectAll(implicit c: Connection): List[UdtPrivilegesRow] = {
    SQL"""select grantor, grantee, udt_catalog, udt_schema, udt_name, privilege_type, is_grantable from information_schema.udt_privileges""".as(UdtPrivilegesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[UdtPrivilegesFieldValue[_]])(implicit c: Connection): List[UdtPrivilegesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UdtPrivilegesFieldValue.grantor(value) => NamedParameter("grantor", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.grantee(value) => NamedParameter("grantee", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.udtCatalog(value) => NamedParameter("udt_catalog", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.udtSchema(value) => NamedParameter("udt_schema", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.udtName(value) => NamedParameter("udt_name", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.privilegeType(value) => NamedParameter("privilege_type", ParameterValue.from(value))
          case UdtPrivilegesFieldValue.isGrantable(value) => NamedParameter("is_grantable", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.udt_privileges where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(UdtPrivilegesRow.rowParser.*)
    }

  }
}
