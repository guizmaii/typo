/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package purchaseorderdetail

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
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
    SQL"""delete from purchasing.purchaseorderdetail where purchaseorderid = ${compositeId.purchaseorderid}, purchaseorderdetailid = ${compositeId.purchaseorderdetailid}""".executeUpdate() > 0
  }
  override def insert(compositeId: PurchaseorderdetailId, unsaved: PurchaseorderdetailRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("duedate", ParameterValue.from(unsaved.duedate))),
      Some(NamedParameter("orderqty", ParameterValue.from(unsaved.orderqty))),
      Some(NamedParameter("productid", ParameterValue.from(unsaved.productid))),
      Some(NamedParameter("unitprice", ParameterValue.from(unsaved.unitprice))),
      Some(NamedParameter("receivedqty", ParameterValue.from(unsaved.receivedqty))),
      Some(NamedParameter("rejectedqty", ParameterValue.from(unsaved.rejectedqty))),
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into purchasing.purchaseorderdetail(purchaseorderid, purchaseorderdetailid, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.purchaseorderid}, ${compositeId.purchaseorderdetailid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[PurchaseorderdetailRow] = {
    SQL"""select purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate from purchasing.purchaseorderdetail""".as(rowParser.*)
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
        val q = s"""select * from purchasing.purchaseorderdetail where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: PurchaseorderdetailId)(implicit c: Connection): Option[PurchaseorderdetailRow] = {
    SQL"""select purchaseorderid, purchaseorderdetailid, duedate, orderqty, productid, unitprice, receivedqty, rejectedqty, modifieddate from purchasing.purchaseorderdetail where purchaseorderid = ${compositeId.purchaseorderid}, purchaseorderdetailid = ${compositeId.purchaseorderdetailid}""".as(rowParser.singleOpt)
  }
  override def update(compositeId: PurchaseorderdetailId, row: PurchaseorderdetailRow)(implicit c: Connection): Boolean = {
    SQL"""update purchasing.purchaseorderdetail
          set duedate = ${row.duedate},
              orderqty = ${row.orderqty},
              productid = ${row.productid},
              unitprice = ${row.unitprice},
              receivedqty = ${row.receivedqty},
              rejectedqty = ${row.rejectedqty},
              modifieddate = ${row.modifieddate}
          where purchaseorderid = ${compositeId.purchaseorderid}, purchaseorderdetailid = ${compositeId.purchaseorderdetailid}""".executeUpdate() > 0
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
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where purchaseorderid = ${compositeId.purchaseorderid}, purchaseorderdetailid = ${compositeId.purchaseorderdetailid}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
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
  val idRowParser: RowParser[PurchaseorderdetailId] =
    RowParser[PurchaseorderdetailId] { row =>
      Success(
        PurchaseorderdetailId(
          purchaseorderid = row[PurchaseorderheaderId]("purchaseorderid"),
          purchaseorderdetailid = row[Int]("purchaseorderdetailid")
        )
      )
    }
}
