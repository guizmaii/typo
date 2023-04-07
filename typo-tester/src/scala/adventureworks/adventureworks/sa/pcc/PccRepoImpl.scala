/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package pcc

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object PccRepoImpl extends PccRepo {
  override def selectAll(implicit c: Connection): List[PccRow] = {
    SQL"""select id, businessentityid, creditcardid, modifieddate from sa.pcc""".as(PccRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[PccFieldOrIdValue[_]])(implicit c: Connection): List[PccRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PccFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case PccFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case PccFieldValue.creditcardid(value) => NamedParameter("creditcardid", ParameterValue.from(value))
          case PccFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sa.pcc where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(PccRow.rowParser("").*)
    }
  
  }
}
