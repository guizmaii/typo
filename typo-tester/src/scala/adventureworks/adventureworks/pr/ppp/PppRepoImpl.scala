/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package ppp

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object PppRepoImpl extends PppRepo {
  override def selectAll(implicit c: Connection): List[PppRow] = {
    SQL"""select productid, productphotoid, primary, modifieddate from pr.ppp""".as(PppRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[PppFieldOrIdValue[_]])(implicit c: Connection): List[PppRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PppFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case PppFieldValue.productphotoid(value) => NamedParameter("productphotoid", ParameterValue.from(value))
          case PppFieldValue.primary(value) => NamedParameter("primary", ParameterValue.from(value))
          case PppFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pr.ppp where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(PppRow.rowParser("").*)
    }
  
  }
}
