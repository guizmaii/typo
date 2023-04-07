/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package crc

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object CrcRepoImpl extends CrcRepo {
  override def selectAll(implicit c: Connection): List[CrcRow] = {
    SQL"""select countryregioncode, currencycode, modifieddate from sa.crc""".as(CrcRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[CrcFieldOrIdValue[_]])(implicit c: Connection): List[CrcRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case CrcFieldValue.countryregioncode(value) => NamedParameter("countryregioncode", ParameterValue.from(value))
          case CrcFieldValue.currencycode(value) => NamedParameter("currencycode", ParameterValue.from(value))
          case CrcFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sa.crc where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(CrcRow.rowParser("").*)
    }
  
  }
}
