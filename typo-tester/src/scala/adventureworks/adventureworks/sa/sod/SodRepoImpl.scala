/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sod

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

object SodRepoImpl extends SodRepo {
  override def selectAll(implicit c: Connection): List[SodRow] = {
    SQL"""select id, salesorderid, salesorderdetailid, carriertrackingnumber, orderqty, productid, specialofferid, unitprice, unitpricediscount, rowguid, modifieddate from sa.sod""".as(SodRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[SodFieldOrIdValue[_]])(implicit c: Connection): List[SodRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SodFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case SodFieldValue.salesorderid(value) => NamedParameter("salesorderid", ParameterValue.from(value))
          case SodFieldValue.salesorderdetailid(value) => NamedParameter("salesorderdetailid", ParameterValue.from(value))
          case SodFieldValue.carriertrackingnumber(value) => NamedParameter("carriertrackingnumber", ParameterValue.from(value))
          case SodFieldValue.orderqty(value) => NamedParameter("orderqty", ParameterValue.from(value))
          case SodFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case SodFieldValue.specialofferid(value) => NamedParameter("specialofferid", ParameterValue.from(value))
          case SodFieldValue.unitprice(value) => NamedParameter("unitprice", ParameterValue.from(value))
          case SodFieldValue.unitpricediscount(value) => NamedParameter("unitpricediscount", ParameterValue.from(value))
          case SodFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SodFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sa.sod where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(SodRow.rowParser("").*)
    }
  
  }
}
