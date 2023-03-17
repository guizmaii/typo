package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait ForeignDataWrapperOptionsRepoImpl extends ForeignDataWrapperOptionsRepo {
  override def selectAll(implicit c: Connection): List[ForeignDataWrapperOptionsRow] = {
    SQL"""select foreign_data_wrapper_catalog, foreign_data_wrapper_name, option_name, option_value from information_schema.foreign_data_wrapper_options""".as(ForeignDataWrapperOptionsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ForeignDataWrapperOptionsFieldValue[_]])(implicit c: Connection): List[ForeignDataWrapperOptionsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ForeignDataWrapperOptionsFieldValue.foreignDataWrapperCatalog(value) => NamedParameter("foreign_data_wrapper_catalog", ParameterValue.from(value))
          case ForeignDataWrapperOptionsFieldValue.foreignDataWrapperName(value) => NamedParameter("foreign_data_wrapper_name", ParameterValue.from(value))
          case ForeignDataWrapperOptionsFieldValue.optionName(value) => NamedParameter("option_name", ParameterValue.from(value))
          case ForeignDataWrapperOptionsFieldValue.optionValue(value) => NamedParameter("option_value", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.foreign_data_wrapper_options where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(ForeignDataWrapperOptionsRow.rowParser.*)
    }

  }
}
