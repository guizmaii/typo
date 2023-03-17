package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait UserMappingOptionsRepoImpl extends UserMappingOptionsRepo {
  override def selectAll(implicit c: Connection): List[UserMappingOptionsRow] = {
    SQL"""select authorization_identifier, foreign_server_catalog, foreign_server_name, option_name, option_value from information_schema.user_mapping_options""".as(UserMappingOptionsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[UserMappingOptionsFieldValue[_]])(implicit c: Connection): List[UserMappingOptionsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case UserMappingOptionsFieldValue.authorizationIdentifier(value) => NamedParameter("authorization_identifier", ParameterValue.from(value))
          case UserMappingOptionsFieldValue.foreignServerCatalog(value) => NamedParameter("foreign_server_catalog", ParameterValue.from(value))
          case UserMappingOptionsFieldValue.foreignServerName(value) => NamedParameter("foreign_server_name", ParameterValue.from(value))
          case UserMappingOptionsFieldValue.optionName(value) => NamedParameter("option_name", ParameterValue.from(value))
          case UserMappingOptionsFieldValue.optionValue(value) => NamedParameter("option_value", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.user_mapping_options where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(UserMappingOptionsRow.rowParser.*)
    }

  }
}
