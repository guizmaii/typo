/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package personphone

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.phonenumbertype.PhonenumbertypeId
import adventureworks.public.Phone
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object PersonphoneRepoImpl extends PersonphoneRepo {
  override def delete(compositeId: PersonphoneId)(implicit c: Connection): Boolean = {
    SQL"delete from person.personphone where businessentityid = ${compositeId.businessentityid}, phonenumber = ${compositeId.phonenumber}, phonenumbertypeid = ${compositeId.phonenumbertypeid}".executeUpdate() > 0
  }
  override def insert(compositeId: PersonphoneId, unsaved: PersonphoneRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    SQL"""insert into person.personphone(businessentityid, phonenumber, phonenumbertypeid, ${namedParameters.map(_.name).mkString(", ")})
          values (${compositeId.businessentityid}, ${compositeId.phonenumber}, ${compositeId.phonenumbertypeid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
       """
      .on(namedParameters :_*)
      .execute()
  
  }
  override def selectAll(implicit c: Connection): List[PersonphoneRow] = {
    SQL"""select businessentityid, phonenumber, phonenumbertypeid, modifieddate
          from person.personphone
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PersonphoneFieldOrIdValue[_]])(implicit c: Connection): List[PersonphoneRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonphoneFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case PersonphoneFieldValue.phonenumber(value) => NamedParameter("phonenumber", ParameterValue.from(value))
          case PersonphoneFieldValue.phonenumbertypeid(value) => NamedParameter("phonenumbertypeid", ParameterValue.from(value))
          case PersonphoneFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from person.personphone
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: PersonphoneId)(implicit c: Connection): Option[PersonphoneRow] = {
    SQL"""select businessentityid, phonenumber, phonenumbertypeid, modifieddate
          from person.personphone
          where businessentityid = ${compositeId.businessentityid}, phonenumber = ${compositeId.phonenumber}, phonenumbertypeid = ${compositeId.phonenumbertypeid}
       """.as(rowParser.singleOpt)
  }
  override def update(row: PersonphoneRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update person.personphone
          set modifieddate = ${row.modifieddate}
          where businessentityid = ${compositeId.businessentityid}, phonenumber = ${compositeId.phonenumber}, phonenumbertypeid = ${compositeId.phonenumbertypeid}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: PersonphoneId, fieldValues: List[PersonphoneFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PersonphoneFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update person.personphone
                    set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
                    where businessentityid = ${compositeId.businessentityid}, phonenumber = ${compositeId.phonenumber}, phonenumbertypeid = ${compositeId.phonenumbertypeid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[PersonphoneRow] =
    RowParser[PersonphoneRow] { row =>
      Success(
        PersonphoneRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          phonenumber = row[Phone]("phonenumber"),
          phonenumbertypeid = row[PhonenumbertypeId]("phonenumbertypeid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
  val idRowParser: RowParser[PersonphoneId] =
    RowParser[PersonphoneId] { row =>
      Success(
        PersonphoneId(
          businessentityid = row[BusinessentityId]("businessentityid"),
          phonenumber = row[Phone]("phonenumber"),
          phonenumbertypeid = row[PhonenumbertypeId]("phonenumbertypeid")
        )
      )
    }
}
