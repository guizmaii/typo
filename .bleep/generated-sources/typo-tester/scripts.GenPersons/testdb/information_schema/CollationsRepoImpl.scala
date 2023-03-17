package testdb
package information_schema

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait CollationsRepoImpl extends CollationsRepo {
  override def selectAll(implicit c: Connection): List[CollationsRow] = {
    SQL"""select collation_catalog, collation_schema, collation_name, pad_attribute from information_schema.collations""".as(CollationsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[CollationsFieldValue[_]])(implicit c: Connection): List[CollationsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CollationsFieldValue.collationCatalog(value) => NamedParameter("collation_catalog", ParameterValue.from(value))
          case CollationsFieldValue.collationSchema(value) => NamedParameter("collation_schema", ParameterValue.from(value))
          case CollationsFieldValue.collationName(value) => NamedParameter("collation_name", ParameterValue.from(value))
          case CollationsFieldValue.padAttribute(value) => NamedParameter("pad_attribute", ParameterValue.from(value))
        }
        SQL"""select * from information_schema.collations where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(CollationsRow.rowParser.*)
    }

  }
}
