/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package th

import adventureworks.production.product.ProductId
import adventureworks.production.transactionhistory.TransactionhistoryId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object ThRepoImpl extends ThRepo {
  override def selectAll(implicit c: Connection): List[ThRow] = {
    SQL"""select id, transactionid, productid, referenceorderid, referenceorderlineid, transactiondate, transactiontype, quantity, actualcost, modifieddate from pr.th""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ThFieldOrIdValue[_]])(implicit c: Connection): List[ThRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ThFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case ThFieldValue.transactionid(value) => NamedParameter("transactionid", ParameterValue.from(value))
          case ThFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ThFieldValue.referenceorderid(value) => NamedParameter("referenceorderid", ParameterValue.from(value))
          case ThFieldValue.referenceorderlineid(value) => NamedParameter("referenceorderlineid", ParameterValue.from(value))
          case ThFieldValue.transactiondate(value) => NamedParameter("transactiondate", ParameterValue.from(value))
          case ThFieldValue.transactiontype(value) => NamedParameter("transactiontype", ParameterValue.from(value))
          case ThFieldValue.quantity(value) => NamedParameter("quantity", ParameterValue.from(value))
          case ThFieldValue.actualcost(value) => NamedParameter("actualcost", ParameterValue.from(value))
          case ThFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pr.th where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[ThRow] =
    RowParser[ThRow] { row =>
      Success(
        ThRow(
          id = row[Option[Int]]("id"),
          transactionid = row[Option[TransactionhistoryId]]("transactionid"),
          productid = row[Option[ProductId]]("productid"),
          referenceorderid = row[Option[Int]]("referenceorderid"),
          referenceorderlineid = row[Option[Int]]("referenceorderlineid"),
          transactiondate = row[Option[LocalDateTime]]("transactiondate"),
          transactiontype = row[Option[/* bpchar */ String]]("transactiontype"),
          quantity = row[Option[Int]]("quantity"),
          actualcost = row[Option[BigDecimal]]("actualcost"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
