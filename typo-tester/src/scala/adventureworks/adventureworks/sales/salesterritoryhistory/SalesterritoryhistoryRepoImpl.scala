/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritoryhistory

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object SalesterritoryhistoryRepoImpl extends SalesterritoryhistoryRepo {
  override def delete(compositeId: SalesterritoryhistoryId)(implicit c: Connection): Boolean = {
    SQL"""delete from sales.salesterritoryhistory where businessentityid = ${compositeId.businessentityid}, startdate = ${compositeId.startdate}, territoryid = ${compositeId.territoryid}""".executeUpdate() > 0
  }
  override def insert(compositeId: SalesterritoryhistoryId, unsaved: SalesterritoryhistoryRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("enddate", ParameterValue.from(unsaved.enddate))),
      unsaved.rowguid match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into sales.salesterritoryhistory(businessentityid, startdate, territoryid, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.businessentityid}, ${compositeId.startdate}, ${compositeId.territoryid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[SalesterritoryhistoryRow] = {
    SQL"""select businessentityid, territoryid, startdate, enddate, rowguid, modifieddate from sales.salesterritoryhistory""".as(SalesterritoryhistoryRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[SalesterritoryhistoryFieldOrIdValue[_]])(implicit c: Connection): List[SalesterritoryhistoryRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesterritoryhistoryFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.startdate(value) => NamedParameter("startdate", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from sales.salesterritoryhistory where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(SalesterritoryhistoryRow.rowParser("").*)
    }
  
  }
  override def selectById(compositeId: SalesterritoryhistoryId)(implicit c: Connection): Option[SalesterritoryhistoryRow] = {
    SQL"""select businessentityid, territoryid, startdate, enddate, rowguid, modifieddate from sales.salesterritoryhistory where businessentityid = ${compositeId.businessentityid}, startdate = ${compositeId.startdate}, territoryid = ${compositeId.territoryid}""".as(SalesterritoryhistoryRow.rowParser("").singleOpt)
  }
  override def update(compositeId: SalesterritoryhistoryId, row: SalesterritoryhistoryRow)(implicit c: Connection): Boolean = {
    SQL"""update sales.salesterritoryhistory
          set enddate = ${row.enddate},
              rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where businessentityid = ${compositeId.businessentityid}, startdate = ${compositeId.startdate}, territoryid = ${compositeId.territoryid}""".executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: SalesterritoryhistoryId, fieldValues: List[SalesterritoryhistoryFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case SalesterritoryhistoryFieldValue.enddate(value) => NamedParameter("enddate", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case SalesterritoryhistoryFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update sales.salesterritoryhistory
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = ${compositeId.businessentityid}, startdate = ${compositeId.startdate}, territoryid = ${compositeId.territoryid}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
