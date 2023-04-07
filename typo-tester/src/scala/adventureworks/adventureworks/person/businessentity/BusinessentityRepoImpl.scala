/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentity

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object BusinessentityRepoImpl extends BusinessentityRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"""delete from person.businessentity where businessentityid = $businessentityid""".executeUpdate() > 0
  }
  override def insert(unsaved: BusinessentityRowUnsaved)(implicit c: Connection): BusinessentityId = {
    val namedParameters = List(
      unsaved.rowguid match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("rowguid", ParameterValue.from[UUID](value)))
      },
      unsaved.modifieddate match {
        case UseDefault => None
        case Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into person.businessentity(${namedParameters.map(_.name).mkString(", ")})
          values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
          returning businessentityid
    """
      .on(namedParameters :_*)
      .executeInsert(BusinessentityId.rowParser("").single)
  
  }
  override def selectAll(implicit c: Connection): List[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate from person.businessentity""".as(BusinessentityRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[BusinessentityFieldOrIdValue[_]])(implicit c: Connection): List[BusinessentityRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentityFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case BusinessentityFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentityFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from person.businessentity where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(BusinessentityRow.rowParser("").*)
    }
  
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate from person.businessentity where businessentityid = $businessentityid""".as(BusinessentityRow.rowParser("").singleOpt)
  }
  override def selectByIds(businessentityids: List[BusinessentityId])(implicit c: Connection): List[BusinessentityRow] = {
    SQL"""select businessentityid, rowguid, modifieddate from person.businessentity where businessentityid in $businessentityids""".as(BusinessentityRow.rowParser("").*)
  }
  override def update(businessentityid: BusinessentityId, row: BusinessentityRow)(implicit c: Connection): Boolean = {
    SQL"""update person.businessentity
          set rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where businessentityid = $businessentityid""".executeUpdate() > 0
  }
  override def updateFieldValues(businessentityid: BusinessentityId, fieldValues: List[BusinessentityFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentityFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentityFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update person.businessentity
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = $businessentityid"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
}
