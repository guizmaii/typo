/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pch

import adventureworks.production.product.ProductId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object PchRepoImpl extends PchRepo {
  override def selectAll(implicit c: Connection): List[PchRow] = {
    SQL"""select id, productid, startdate, enddate, standardcost, modifieddate
          from pr.pch
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PchFieldOrIdValue[_]])(implicit c: Connection): List[PchRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PchFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case PchFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case PchFieldValue.startdate(value) => NamedParameter("startdate", ParameterValue.from(value))
          case PchFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
          case PchFieldValue.standardcost(value) => NamedParameter("standardcost", ParameterValue.from(value))
          case PchFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from pr.pch
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[PchRow] =
    RowParser[PchRow] { row =>
      Success(
        PchRow(
          id = row[Option[Int]]("id"),
          productid = row[Option[ProductId]]("productid"),
          startdate = row[Option[LocalDateTime]]("startdate"),
          enddate = row[Option[LocalDateTime]]("enddate"),
          standardcost = row[Option[BigDecimal]]("standardcost"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
