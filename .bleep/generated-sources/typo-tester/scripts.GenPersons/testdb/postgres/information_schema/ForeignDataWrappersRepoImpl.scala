/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package postgres
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SQL
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ForeignDataWrappersRepoImpl extends ForeignDataWrappersRepo {
  override def selectAll(implicit c: Connection): List[ForeignDataWrappersRow] = {
    SQL"""select foreign_data_wrapper_catalog, foreign_data_wrapper_name, authorization_identifier, library_name, foreign_data_wrapper_language from information_schema.foreign_data_wrappers""".as(ForeignDataWrappersRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ForeignDataWrappersFieldValue[_]])(implicit c: Connection): List[ForeignDataWrappersRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ForeignDataWrappersFieldValue.foreignDataWrapperCatalog(value) => NamedParameter("foreign_data_wrapper_catalog", ParameterValue.from(value))
          case ForeignDataWrappersFieldValue.foreignDataWrapperName(value) => NamedParameter("foreign_data_wrapper_name", ParameterValue.from(value))
          case ForeignDataWrappersFieldValue.authorizationIdentifier(value) => NamedParameter("authorization_identifier", ParameterValue.from(value))
          case ForeignDataWrappersFieldValue.libraryName(value) => NamedParameter("library_name", ParameterValue.from(value))
          case ForeignDataWrappersFieldValue.foreignDataWrapperLanguage(value) => NamedParameter("foreign_data_wrapper_language", ParameterValue.from(value))
        }
        val q = s"""select * from information_schema.foreign_data_wrappers where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        SQL(q)
          .on(namedParams: _*)
          .as(ForeignDataWrappersRow.rowParser.*)
    }

  }
}
