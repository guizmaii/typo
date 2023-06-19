/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.NameStyle
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PersonRow(
  /** Primary key for Person records.
      Points to [[businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Primary type of person: SC = Store Contact, IN = Individual (retail) customer, SP = Sales person, EM = Employee (non-sales), VC = Vendor contact, GC = General contact */
  persontype: /* bpchar */ String,
  /** 0 = The data in FirstName and LastName are stored in western style (first name, last name) order.  1 = Eastern style (last name, first name) order. */
  namestyle: NameStyle,
  /** A courtesy title. For example, Mr. or Ms. */
  title: Option[/* max 8 chars */ String],
  /** First name of the person. */
  firstname: Name,
  /** Middle name or middle initial of the person. */
  middlename: Option[Name],
  /** Last name of the person. */
  lastname: Name,
  /** Surname suffix. For example, Sr. or Jr. */
  suffix: Option[/* max 10 chars */ String],
  /** 0 = Contact does not wish to receive e-mail promotions, 1 = Contact does wish to receive e-mail promotions from AdventureWorks, 2 = Contact does wish to receive e-mail promotions from AdventureWorks and selected partners. */
  emailpromotion: Int,
  /** Additional contact information about the person stored in xml format. */
  additionalcontactinfo: Option[TypoXml],
  /** Personal information such as hobbies, and income collected from online shoppers. Used for sales analysis. */
  demographics: Option[TypoXml],
  rowguid: UUID,
  modifieddate: LocalDateTime
)

object PersonRow {
  implicit val oFormat: OFormat[PersonRow] = new OFormat[PersonRow]{
    override def writes(o: PersonRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "persontype" -> o.persontype,
        "namestyle" -> o.namestyle,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "emailpromotion" -> o.emailpromotion,
        "additionalcontactinfo" -> o.additionalcontactinfo,
        "demographics" -> o.demographics,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PersonRow] = {
      JsResult.fromTry(
        Try(
          PersonRow(
            businessentityid = json.\("businessentityid").as[BusinessentityId],
            persontype = json.\("persontype").as[/* bpchar */ String],
            namestyle = json.\("namestyle").as[NameStyle],
            title = json.\("title").toOption.map(_.as[/* max 8 chars */ String]),
            firstname = json.\("firstname").as[Name],
            middlename = json.\("middlename").toOption.map(_.as[Name]),
            lastname = json.\("lastname").as[Name],
            suffix = json.\("suffix").toOption.map(_.as[/* max 10 chars */ String]),
            emailpromotion = json.\("emailpromotion").as[Int],
            additionalcontactinfo = json.\("additionalcontactinfo").toOption.map(_.as[TypoXml]),
            demographics = json.\("demographics").toOption.map(_.as[TypoXml]),
            rowguid = json.\("rowguid").as[UUID],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
