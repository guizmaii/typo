/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import adventureworks.public.Flag
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlParser
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object SalesorderheaderRepoImpl extends SalesorderheaderRepo {
  override def delete(salesorderid: SalesorderheaderId)(implicit c: Connection): Boolean = {
    SQL"""delete from sales.salesorderheader where salesorderid = $salesorderid""".executeUpdate() > 0
  }
  override def insert(unsaved: SalesorderheaderRowUnsaved)(implicit c: Connection): SalesorderheaderId = {
    val namedParameters = List(
      unsaved.revisionnumber match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("revisionnumber", ParameterValue.from[Int](value)))
      },
      unsaved.orderdate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("orderdate", ParameterValue.from[LocalDateTime](value)))
      },
      Some(NamedParameter("duedate", ParameterValue.from(unsaved.duedate))),
      Some(NamedParameter("shipdate", ParameterValue.from(unsaved.shipdate))),
      unsaved.status match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("status", ParameterValue.from[Int](value)))
      },
      unsaved.onlineorderflag match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("onlineorderflag", ParameterValue.from[Flag](value)))
      },
      Some(NamedParameter("purchaseordernumber", ParameterValue.from(unsaved.purchaseordernumber))),
      Some(NamedParameter("accountnumber", ParameterValue.from(unsaved.accountnumber))),
      Some(NamedParameter("customerid", ParameterValue.from(unsaved.customerid))),
      Some(NamedParameter("salespersonid", ParameterValue.from(unsaved.salespersonid))),
      Some(NamedParameter("territoryid", ParameterValue.from(unsaved.territoryid))),
      Some(NamedParameter("billtoaddressid", ParameterValue.from(unsaved.billtoaddressid))),
      Some(NamedParameter("shiptoaddressid", ParameterValue.from(unsaved.shiptoaddressid))),
      Some(NamedParameter("shipmethodid", ParameterValue.from(unsaved.shipmethodid))),
      Some(NamedParameter("creditcardid", ParameterValue.from(unsaved.creditcardid))),
      Some(NamedParameter("creditcardapprovalcode", ParameterValue.from(unsaved.creditcardapprovalcode))),
      Some(NamedParameter("currencyrateid", ParameterValue.from(unsaved.currencyrateid))),
      unsaved.subtotal match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("subtotal", ParameterValue.from[BigDecimal](value)))
      },
      unsaved.taxamt match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("taxamt", ParameterValue.from[BigDecimal](value)))
      },
      unsaved.freight match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("freight", ParameterValue.from[BigDecimal](value)))
      },
      Some(NamedParameter("totaldue", ParameterValue.from(unsaved.totaldue))),
      Some(NamedParameter("comment", ParameterValue.from(unsaved.comment))),
      unsaved.rowguid match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into sales.salesorderheader(${namedParameters.map(_.name).mkString(", ")})
          values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
          returning salesorderid
    """
      .on(namedParameters :_*)
      .executeInsert(SqlParser.get[SalesorderheaderId]("salesorderid").single)
  
  }
  override def selectAll(implicit c: Connection): List[SalesorderheaderRow] = {
    SQL"""select salesorderid, revisionnumber, orderdate, duedate, shipdate, status, onlineorderflag, purchaseordernumber, accountnumber, customerid, salespersonid, territoryid, billtoaddressid, shiptoaddressid, shipmethodid, creditcardid, creditcardapprovalcode, currencyrateid, subtotal, taxamt, freight, totaldue, comment, rowguid, modifieddate from sales.salesorderheader""".as(SalesorderheaderRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[SalesorderheaderFieldOrIdValue[_]])(implicit c: Connection): List[SalesorderheaderRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesorderheaderFieldValue.salesorderid(value) => NamedParameter("salesorderid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.revisionnumber(value) => NamedParameter("revisionnumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.orderdate(value) => NamedParameter("orderdate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.duedate(value) => NamedParameter("duedate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shipdate(value) => NamedParameter("shipdate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.status(value) => NamedParameter("status", ParameterValue.from(value))
          case SalesorderheaderFieldValue.onlineorderflag(value) => NamedParameter("onlineorderflag", ParameterValue.from(value))
          case SalesorderheaderFieldValue.purchaseordernumber(value) => NamedParameter("purchaseordernumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.accountnumber(value) => NamedParameter("accountnumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.customerid(value) => NamedParameter("customerid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.salespersonid(value) => NamedParameter("salespersonid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.billtoaddressid(value) => NamedParameter("billtoaddressid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shiptoaddressid(value) => NamedParameter("shiptoaddressid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shipmethodid(value) => NamedParameter("shipmethodid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.creditcardid(value) => NamedParameter("creditcardid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.creditcardapprovalcode(value) => NamedParameter("creditcardapprovalcode", ParameterValue.from(value))
          case SalesorderheaderFieldValue.currencyrateid(value) => NamedParameter("currencyrateid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.subtotal(value) => NamedParameter("subtotal", ParameterValue.from(value))
          case SalesorderheaderFieldValue.taxamt(value) => NamedParameter("taxamt", ParameterValue.from(value))
          case SalesorderheaderFieldValue.freight(value) => NamedParameter("freight", ParameterValue.from(value))
          case SalesorderheaderFieldValue.totaldue(value) => NamedParameter("totaldue", ParameterValue.from(value))
          case SalesorderheaderFieldValue.comment(value) => NamedParameter("comment", ParameterValue.from(value))
          case SalesorderheaderFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sales.salesorderheader where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(SalesorderheaderRow.rowParser("").*)
    }
  
  }
  override def selectById(salesorderid: SalesorderheaderId)(implicit c: Connection): Option[SalesorderheaderRow] = {
    SQL"""select salesorderid, revisionnumber, orderdate, duedate, shipdate, status, onlineorderflag, purchaseordernumber, accountnumber, customerid, salespersonid, territoryid, billtoaddressid, shiptoaddressid, shipmethodid, creditcardid, creditcardapprovalcode, currencyrateid, subtotal, taxamt, freight, totaldue, comment, rowguid, modifieddate from sales.salesorderheader where salesorderid = $salesorderid""".as(SalesorderheaderRow.rowParser("").singleOpt)
  }
  override def selectByIds(salesorderids: List[SalesorderheaderId])(implicit c: Connection): List[SalesorderheaderRow] = {
    SQL"""select salesorderid, revisionnumber, orderdate, duedate, shipdate, status, onlineorderflag, purchaseordernumber, accountnumber, customerid, salespersonid, territoryid, billtoaddressid, shiptoaddressid, shipmethodid, creditcardid, creditcardapprovalcode, currencyrateid, subtotal, taxamt, freight, totaldue, comment, rowguid, modifieddate from sales.salesorderheader where salesorderid in $salesorderids""".as(SalesorderheaderRow.rowParser("").*)
  }
  override def update(salesorderid: SalesorderheaderId, row: SalesorderheaderRow)(implicit c: Connection): Boolean = {
    SQL"""update sales.salesorderheader
          set revisionnumber = ${row.revisionnumber},
              orderdate = ${row.orderdate},
              duedate = ${row.duedate},
              shipdate = ${row.shipdate},
              status = ${row.status},
              onlineorderflag = ${row.onlineorderflag},
              purchaseordernumber = ${row.purchaseordernumber},
              accountnumber = ${row.accountnumber},
              customerid = ${row.customerid},
              salespersonid = ${row.salespersonid},
              territoryid = ${row.territoryid},
              billtoaddressid = ${row.billtoaddressid},
              shiptoaddressid = ${row.shiptoaddressid},
              shipmethodid = ${row.shipmethodid},
              creditcardid = ${row.creditcardid},
              creditcardapprovalcode = ${row.creditcardapprovalcode},
              currencyrateid = ${row.currencyrateid},
              subtotal = ${row.subtotal},
              taxamt = ${row.taxamt},
              freight = ${row.freight},
              totaldue = ${row.totaldue},
              comment = ${row.comment},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where salesorderid = $salesorderid""".executeUpdate() > 0
  }
  override def updateFieldValues(salesorderid: SalesorderheaderId, fieldValues: List[SalesorderheaderFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesorderheaderFieldValue.revisionnumber(value) => NamedParameter("revisionnumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.orderdate(value) => NamedParameter("orderdate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.duedate(value) => NamedParameter("duedate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shipdate(value) => NamedParameter("shipdate", ParameterValue.from(value))
          case SalesorderheaderFieldValue.status(value) => NamedParameter("status", ParameterValue.from(value))
          case SalesorderheaderFieldValue.onlineorderflag(value) => NamedParameter("onlineorderflag", ParameterValue.from(value))
          case SalesorderheaderFieldValue.purchaseordernumber(value) => NamedParameter("purchaseordernumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.accountnumber(value) => NamedParameter("accountnumber", ParameterValue.from(value))
          case SalesorderheaderFieldValue.customerid(value) => NamedParameter("customerid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.salespersonid(value) => NamedParameter("salespersonid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.billtoaddressid(value) => NamedParameter("billtoaddressid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shiptoaddressid(value) => NamedParameter("shiptoaddressid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.shipmethodid(value) => NamedParameter("shipmethodid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.creditcardid(value) => NamedParameter("creditcardid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.creditcardapprovalcode(value) => NamedParameter("creditcardapprovalcode", ParameterValue.from(value))
          case SalesorderheaderFieldValue.currencyrateid(value) => NamedParameter("currencyrateid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.subtotal(value) => NamedParameter("subtotal", ParameterValue.from(value))
          case SalesorderheaderFieldValue.taxamt(value) => NamedParameter("taxamt", ParameterValue.from(value))
          case SalesorderheaderFieldValue.freight(value) => NamedParameter("freight", ParameterValue.from(value))
          case SalesorderheaderFieldValue.totaldue(value) => NamedParameter("totaldue", ParameterValue.from(value))
          case SalesorderheaderFieldValue.comment(value) => NamedParameter("comment", ParameterValue.from(value))
          case SalesorderheaderFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesorderheaderFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.salesorderheader
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where salesorderid = $salesorderid"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
