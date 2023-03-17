package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgForeignTablesRepoImpl extends PgForeignTablesRepo {
  override def selectAll(implicit c: Connection): List[PgForeignTablesRow] = {
    SQL"""select foreign_table_catalog, foreign_table_schema, foreign_table_name, ftoptions, foreign_server_catalog, foreign_server_name, authorization_identifier from information_schema._pg_foreign_tables""".as(PgForeignTablesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgForeignTablesFieldValue[_]])(implicit c: Connection): List[PgForeignTablesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgForeignTablesFieldValue.foreignTableCatalog(value) => NamedParameter("foreign_table_catalog", ParameterValue.from(value))
          case PgForeignTablesFieldValue.foreignTableSchema(value) => NamedParameter("foreign_table_schema", ParameterValue.from(value))
          case PgForeignTablesFieldValue.foreignTableName(value) => NamedParameter("foreign_table_name", ParameterValue.from(value))
          case PgForeignTablesFieldValue.ftoptions(value) => NamedParameter("ftoptions", ParameterValue.from(value))
          case PgForeignTablesFieldValue.foreignServerCatalog(value) => NamedParameter("foreign_server_catalog", ParameterValue.from(value))
          case PgForeignTablesFieldValue.foreignServerName(value) => NamedParameter("foreign_server_name", ParameterValue.from(value))
          case PgForeignTablesFieldValue.authorizationIdentifier(value) => NamedParameter("authorization_identifier", ParameterValue.from(value))
        }
        SQL"""select * from information_schema._pg_foreign_tables where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgForeignTablesRow.rowParser.*)
    }

  }
}
