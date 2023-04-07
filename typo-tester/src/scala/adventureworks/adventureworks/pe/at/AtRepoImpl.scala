/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package at

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object AtRepoImpl extends AtRepo {
  override def selectAll(implicit c: Connection): List[AtRow] = {
    SQL"""select id, addresstypeid, name, rowguid, modifieddate from pe.at""".as(AtRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[AtFieldOrIdValue[_]])(implicit c: Connection): List[AtRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case AtFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case AtFieldValue.addresstypeid(value) => NamedParameter("addresstypeid", ParameterValue.from(value))
          case AtFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case AtFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case AtFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pe.at where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(AtRow.rowParser("").*)
    }
  
  }
}
