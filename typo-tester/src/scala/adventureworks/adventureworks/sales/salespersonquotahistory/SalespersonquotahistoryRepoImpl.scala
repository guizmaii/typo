/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salespersonquotahistory

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object SalespersonquotahistoryRepoImpl extends SalespersonquotahistoryRepo {
  override def delete(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Boolean = {
    SQL"""delete from sales.salespersonquotahistory where businessentityid = ${compositeId.businessentityid}, quotadate = ${compositeId.quotadate}""".executeUpdate() > 0
  }
  override def insert(compositeId: SalespersonquotahistoryId, unsaved: SalespersonquotahistoryRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("salesquota", ParameterValue.from(unsaved.salesquota))),
      unsaved.rowguid match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into sales.salespersonquotahistory(businessentityid, quotadate, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.businessentityid}, ${compositeId.quotadate}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[SalespersonquotahistoryRow] = {
    SQL"""select businessentityid, quotadate, salesquota, rowguid, modifieddate from sales.salespersonquotahistory""".as(SalespersonquotahistoryRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[SalespersonquotahistoryFieldOrIdValue[_]])(implicit c: Connection): List[SalespersonquotahistoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonquotahistoryFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.quotadate(value) => NamedParameter("quotadate", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sales.salespersonquotahistory where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(SalespersonquotahistoryRow.rowParser("").*)
    }
  
  }
  override def selectById(compositeId: SalespersonquotahistoryId)(implicit c: Connection): Option[SalespersonquotahistoryRow] = {
    SQL"""select businessentityid, quotadate, salesquota, rowguid, modifieddate from sales.salespersonquotahistory where businessentityid = ${compositeId.businessentityid}, quotadate = ${compositeId.quotadate}""".as(SalespersonquotahistoryRow.rowParser("").singleOpt)
  }
  override def update(compositeId: SalespersonquotahistoryId, row: SalespersonquotahistoryRow)(implicit c: Connection): Boolean = {
    SQL"""update sales.salespersonquotahistory
          set salesquota = ${row.salesquota},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where businessentityid = ${compositeId.businessentityid}, quotadate = ${compositeId.quotadate}""".executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: SalespersonquotahistoryId, fieldValues: List[SalespersonquotahistoryFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalespersonquotahistoryFieldValue.salesquota(value) => NamedParameter("salesquota", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalespersonquotahistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.salespersonquotahistory
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = ${compositeId.businessentityid}, quotadate = ${compositeId.quotadate}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
