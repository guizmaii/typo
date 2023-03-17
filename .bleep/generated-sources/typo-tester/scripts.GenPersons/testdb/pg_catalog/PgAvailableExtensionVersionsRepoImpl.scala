package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgAvailableExtensionVersionsRepoImpl extends PgAvailableExtensionVersionsRepo {
  override def selectAll(implicit c: Connection): List[PgAvailableExtensionVersionsRow] = {
    SQL"""select name, version, installed, superuser, trusted, relocatable, schema, requires, comment from pg_catalog.pg_available_extension_versions""".as(PgAvailableExtensionVersionsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgAvailableExtensionVersionsFieldValue[_]])(implicit c: Connection): List[PgAvailableExtensionVersionsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgAvailableExtensionVersionsFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.version(value) => NamedParameter("version", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.installed(value) => NamedParameter("installed", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.superuser(value) => NamedParameter("superuser", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.trusted(value) => NamedParameter("trusted", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.relocatable(value) => NamedParameter("relocatable", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.schema(value) => NamedParameter("schema", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.requires(value) => NamedParameter("requires", ParameterValue.from(value))
          case PgAvailableExtensionVersionsFieldValue.comment(value) => NamedParameter("comment", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_available_extension_versions where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgAvailableExtensionVersionsRow.rowParser.*)
    }

  }
}
