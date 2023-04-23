/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import adventureworks.Defaulted
import adventureworks.production.product.ProductId
import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object PurchaseorderdetailRepoImpl extends PurchaseorderdetailRepo {
  override def delete(compositeId: PurchaseorderdetailId)(implicit c: Connection): Boolean = {
    SQL"delete from purchasing.purchaseorderdetail where purchaseorderid = ${compositeId.purchaseorderid} AND purchaseorderdetailid = ${compositeId.purchaseorderdetailid}".executeUpdate() > 0
  }
  override def insert(compositeId: PurchaseorderdetailId, unsaved: PurchaseorderdetailRowUnsaved)(implicit c: Connection): PurchaseorderdetailRow = {
    val namedParameters = List(
      Some((NamedParameter("duedate", ParameterValue.from(unsaved.duedate)), "::timestamp")),
      Some((NamedParameter("orderqty", ParameterValue.from(unsaved.orderqty)), "::int2")),
      Some((NamedParameter("productid", ParameterValue.from(unsaved.productid)), "::int4")),
      Some((NamedParameter("unitprice", ParameterValue.from(unsaved.unitprice)), "::numeric")),
      Some((NamedParameter("receivedqty", ParameterValue.from(unsaved.receivedqty)), "::numeric")),
      Some((NamedParameter("rejectedqty", ParameterValue.from(unsaved.rejectedqty)), "::numeric")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val q = s"""insert into purchasing.purchaseorderdetail(purchaseorderid, purchaseorderdetailid, ${namedParameters.map(x => "\"" + x._1.name + "\"").mkString(", ")})
                values ({purchaseorderid}::int4, {purchaseorderdetailid}::int4, ${namedParameters.map{case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                returning purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate
             """
    // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
    import anorm._
    SQL(q)
      .on(namedParameters.map(_._1) :_*)
      .on(NamedParameter("purchaseorderid", ParameterValue.from(compositeId.purchaseorderid)), NamedParameter("purchaseorderdetailid", ParameterValue.from(compositeId.purchaseorderdetailid)))
      .executeInsert(rowParser.single)
  
  }
  override def selectAll(implicit c: Connection): List[PurchaseorderdetailRow] = {
    SQL"""select purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate
          from purchasing.purchaseorderdetail
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PurchaseorderdetailFieldOrIdValue[_]])(implicit c: Connection): List[PurchaseorderdetailRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PurchaseorderdetailFieldValue.purchaseorderid(value) => NamedParameter("purchaseorderid", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.purchaseorderdetailid(value) => NamedParameter("purchaseorderdetailid", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.duedate(value) => NamedParameter("duedate", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.orderqty(value) => NamedParameter("orderqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.unitprice(value) => NamedParameter("unitprice", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.receivedqty(value) => NamedParameter("receivedqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.rejectedqty(value) => NamedParameter("rejectedqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate
                    from purchasing.purchaseorderdetail
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: PurchaseorderdetailId)(implicit c: Connection): Option[PurchaseorderdetailRow] = {
    SQL"""select purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate
          from purchasing.purchaseorderdetail
          where purchaseorderid = ${compositeId.purchaseorderid} AND purchaseorderdetailid = ${compositeId.purchaseorderdetailid}
       """.as(rowParser.singleOpt)
  }
  override def update(row: PurchaseorderdetailRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update purchasing.purchaseorderdetail
          set duedate = ${row.duedate}::timestamp,
              orderqty = ${row.orderqty}::int2,
              productid = ${row.productid}::int4,
              unitprice = ${row.unitprice}::numeric,
              receivedqty = ${row.receivedqty}::numeric,
              rejectedqty = ${row.rejectedqty}::numeric,
              modifieddate = ${row.modifieddate}::timestamp
          where purchaseorderid = ${compositeId.purchaseorderid} AND purchaseorderdetailid = ${compositeId.purchaseorderdetailid}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: PurchaseorderdetailId, fieldValues: List[PurchaseorderdetailFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PurchaseorderdetailFieldValue.duedate(value) => NamedParameter("duedate", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.orderqty(value) => NamedParameter("orderqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.unitprice(value) => NamedParameter("unitprice", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.receivedqty(value) => NamedParameter("receivedqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.rejectedqty(value) => NamedParameter("rejectedqty", ParameterValue.from(value))
          case PurchaseorderdetailFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update purchasing.purchaseorderdetail
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where purchaseorderid = {purchaseorderid} AND purchaseorderdetailid = {purchaseorderdetailid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("purchaseorderid", ParameterValue.from(compositeId.purchaseorderid)), NamedParameter("purchaseorderdetailid", ParameterValue.from(compositeId.purchaseorderdetailid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[PurchaseorderdetailRow] =
    RowParser[PurchaseorderdetailRow] { row =>
      Success(
        PurchaseorderdetailRow(
          purchaseorderid = row[PurchaseorderheaderId]("purchaseorderid"),
          purchaseorderdetailid = row[Int]("purchaseorderdetailid"),
          duedate = row[LocalDateTime]("duedate"),
          orderqty = row[Int]("orderqty"),
          productid = row[ProductId]("productid"),
          unitprice = row[BigDecimal]("unitprice"),
          receivedqty = row[BigDecimal]("receivedqty"),
          rejectedqty = row[BigDecimal]("rejectedqty"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
