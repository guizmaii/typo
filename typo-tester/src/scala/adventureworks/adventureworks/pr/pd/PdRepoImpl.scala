/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pd

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object PdRepoImpl extends PdRepo {
  override def selectAll(implicit c: Connection): List[PdRow] = {
    SQL"""select id, productdescriptionid, description, rowguid, modifieddate from pr.pd""".as(PdRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[PdFieldOrIdValue[_]])(implicit c: Connection): List[PdRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PdFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case PdFieldValue.productdescriptionid(value) => NamedParameter("productdescriptionid", ParameterValue.from(value))
          case PdFieldValue.description(value) => NamedParameter("description", ParameterValue.from(value))
          case PdFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case PdFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pr.pd where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(PdRow.rowParser("").*)
    }
  
  }
}
