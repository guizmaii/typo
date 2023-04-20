/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package vadditionalcontactinfo

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object VadditionalcontactinfoRepoImpl extends VadditionalcontactinfoRepo {
  override def selectAll(implicit c: Connection): List[VadditionalcontactinfoRow] = {
    SQL"""select businessentityid, firstname, middlename, lastname, telephonenumber, telephonespecialinstructions, street, city, stateprovince, postalcode, countryregion, homeaddressspecialinstructions, emailaddress, emailspecialinstructions, emailtelephonenumber, rowguid, modifieddate
          from person.vadditionalcontactinfo
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[VadditionalcontactinfoFieldOrIdValue[_]])(implicit c: Connection): List[VadditionalcontactinfoRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case VadditionalcontactinfoFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.firstname(value) => NamedParameter("firstname", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.middlename(value) => NamedParameter("middlename", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.lastname(value) => NamedParameter("lastname", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.telephonenumber(value) => NamedParameter("telephonenumber", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.telephonespecialinstructions(value) => NamedParameter("telephonespecialinstructions", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.street(value) => NamedParameter("street", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.city(value) => NamedParameter("city", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.stateprovince(value) => NamedParameter("stateprovince", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.postalcode(value) => NamedParameter("postalcode", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.countryregion(value) => NamedParameter("countryregion", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.homeaddressspecialinstructions(value) => NamedParameter("homeaddressspecialinstructions", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.emailaddress(value) => NamedParameter("emailaddress", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.emailspecialinstructions(value) => NamedParameter("emailspecialinstructions", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.emailtelephonenumber(value) => NamedParameter("emailtelephonenumber", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case VadditionalcontactinfoFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from person.vadditionalcontactinfo
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[VadditionalcontactinfoRow] =
    RowParser[VadditionalcontactinfoRow] { row =>
      Success(
        VadditionalcontactinfoRow(
          businessentityid = row[Option[BusinessentityId]]("businessentityid"),
          firstname = row[Option[Name]]("firstname"),
          middlename = row[Option[Name]]("middlename"),
          lastname = row[Option[Name]]("lastname"),
          telephonenumber = row[Option[/* xml */ String]]("telephonenumber"),
          telephonespecialinstructions = row[Option[String]]("telephonespecialinstructions"),
          street = row[Option[/* xml */ String]]("street"),
          city = row[Option[/* xml */ String]]("city"),
          stateprovince = row[Option[/* xml */ String]]("stateprovince"),
          postalcode = row[Option[/* xml */ String]]("postalcode"),
          countryregion = row[Option[/* xml */ String]]("countryregion"),
          homeaddressspecialinstructions = row[Option[/* xml */ String]]("homeaddressspecialinstructions"),
          emailaddress = row[Option[/* xml */ String]]("emailaddress"),
          emailspecialinstructions = row[Option[String]]("emailspecialinstructions"),
          emailtelephonenumber = row[Option[/* xml */ String]]("emailtelephonenumber"),
          rowguid = row[Option[UUID]]("rowguid"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
