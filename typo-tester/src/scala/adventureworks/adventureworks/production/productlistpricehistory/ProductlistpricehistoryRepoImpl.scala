/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productlistpricehistory

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime

object ProductlistpricehistoryRepoImpl extends ProductlistpricehistoryRepo {
  override def delete(compositeId: ProductlistpricehistoryId)(implicit c: Connection): Boolean = {
    SQL"""delete from production.productlistpricehistory where productid = ${compositeId.productid}, startdate = ${compositeId.startdate}""".executeUpdate() > 0
  }
  override def insert(compositeId: ProductlistpricehistoryId, unsaved: ProductlistpricehistoryRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("enddate", ParameterValue.from(unsaved.enddate))),
      Some(NamedParameter("listprice", ParameterValue.from(unsaved.listprice))),
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into production.productlistpricehistory(productid, startdate, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.productid}, ${compositeId.startdate}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[ProductlistpricehistoryRow] = {
    SQL"""select productid, startdate, enddate, listprice, modifieddate from production.productlistpricehistory""".as(ProductlistpricehistoryRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[ProductlistpricehistoryFieldOrIdValue[_]])(implicit c: Connection): List[ProductlistpricehistoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductlistpricehistoryFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.startdate(value) => NamedParameter("startdate", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.listprice(value) => NamedParameter("listprice", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from production.productlistpricehistory where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(ProductlistpricehistoryRow.rowParser("").*)
    }
  
  }
  override def selectById(compositeId: ProductlistpricehistoryId)(implicit c: Connection): Option[ProductlistpricehistoryRow] = {
    SQL"""select productid, startdate, enddate, listprice, modifieddate from production.productlistpricehistory where productid = ${compositeId.productid}, startdate = ${compositeId.startdate}""".as(ProductlistpricehistoryRow.rowParser("").singleOpt)
  }
  override def update(compositeId: ProductlistpricehistoryId, row: ProductlistpricehistoryRow)(implicit c: Connection): Boolean = {
    SQL"""update production.productlistpricehistory
          set enddate = ${row.enddate},
              listprice = ${row.listprice},
              modifieddate = ${row.modifieddate}
          where productid = ${compositeId.productid}, startdate = ${compositeId.startdate}""".executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: ProductlistpricehistoryId, fieldValues: List[ProductlistpricehistoryFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductlistpricehistoryFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.listprice(value) => NamedParameter("listprice", ParameterValue.from(value))
          case ProductlistpricehistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.productlistpricehistory
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where productid = ${compositeId.productid}, startdate = ${compositeId.startdate}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
