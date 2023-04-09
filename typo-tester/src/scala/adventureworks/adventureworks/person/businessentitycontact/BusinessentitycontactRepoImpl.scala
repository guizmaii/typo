/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentitycontact

import adventureworks.Defaulted.Provided
import adventureworks.Defaulted.UseDefault
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.contacttype.ContacttypeId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object BusinessentitycontactRepoImpl extends BusinessentitycontactRepo {
  override def delete(compositeId: BusinessentitycontactId)(implicit c: Connection): Boolean = {
    SQL"""delete from person.businessentitycontact where businessentityid = ${compositeId.businessentityid}, personid = ${compositeId.personid}, contacttypeid = ${compositeId.contacttypeid}""".executeUpdate() > 0
  }
  override def insert(compositeId: BusinessentitycontactId, unsaved: BusinessentitycontactRowUnsaved)(implicit c: Connection): Boolean = {
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
    
    SQL"""insert into person.businessentitycontact(businessentityid, personid, contacttypeid, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.businessentityid}, ${compositeId.personid}, ${compositeId.contacttypeid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
    """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[BusinessentitycontactRow] = {
    SQL"""select businessentityid, personid, contacttypeid, rowguid, modifieddate from person.businessentitycontact""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[BusinessentitycontactFieldOrIdValue[_]])(implicit c: Connection): List[BusinessentitycontactRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentitycontactFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case BusinessentitycontactFieldValue.personid(value) => NamedParameter("personid", ParameterValue.from(value))
          case BusinessentitycontactFieldValue.contacttypeid(value) => NamedParameter("contacttypeid", ParameterValue.from(value))
          case BusinessentitycontactFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentitycontactFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from person.businessentitycontact where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: BusinessentitycontactId)(implicit c: Connection): Option[BusinessentitycontactRow] = {
    SQL"""select businessentityid, personid, contacttypeid, rowguid, modifieddate from person.businessentitycontact where businessentityid = ${compositeId.businessentityid}, personid = ${compositeId.personid}, contacttypeid = ${compositeId.contacttypeid}""".as(rowParser.singleOpt)
  }
  override def update(compositeId: BusinessentitycontactId, row: BusinessentitycontactRow)(implicit c: Connection): Boolean = {
    SQL"""update person.businessentitycontact
          set rowguid = ${row.rowguid},
              modifieddate = ${row.modifieddate}
          where businessentityid = ${compositeId.businessentityid}, personid = ${compositeId.personid}, contacttypeid = ${compositeId.contacttypeid}""".executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: BusinessentitycontactId, fieldValues: List[BusinessentitycontactFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case BusinessentitycontactFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case BusinessentitycontactFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update person.businessentitycontact
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = ${compositeId.businessentityid}, personid = ${compositeId.personid}, contacttypeid = ${compositeId.contacttypeid}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[BusinessentitycontactRow] =
    RowParser[BusinessentitycontactRow] { row =>
      Success(
        BusinessentitycontactRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          personid = row[BusinessentityId]("personid"),
          contacttypeid = row[ContacttypeId]("contacttypeid"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[BusinessentitycontactId] =
    RowParser[BusinessentitycontactId] { row =>
      Success(
        BusinessentitycontactId(
          businessentityid = row[BusinessentityId]("businessentityid"),
          personid = row[BusinessentityId]("personid"),
          contacttypeid = row[ContacttypeId]("contacttypeid")
        )
      )
    }
}
