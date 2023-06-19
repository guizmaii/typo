/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.Defaulted
import adventureworks.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.NameStyle
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

/** This class corresponds to a row in table `person.person` which has not been persisted yet */
case class PersonRowUnsaved(
  /** Primary key for Person records.
      Points to [[businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Primary type of person: SC = Store Contact, IN = Individual (retail) customer, SP = Sales person, EM = Employee (non-sales), VC = Vendor contact, GC = General contact */
  persontype: /* bpchar */ String,
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
  /** Additional contact information about the person stored in xml format. */
  additionalcontactinfo: Option[TypoXml],
  /** Personal information such as hobbies, and income collected from online shoppers. Used for sales analysis. */
  demographics: Option[TypoXml],
  /** Default: false
      0 = The data in FirstName and LastName are stored in western style (first name, last name) order.  1 = Eastern style (last name, first name) order. */
  namestyle: Defaulted[NameStyle] = Defaulted.UseDefault,
  /** Default: 0
      0 = Contact does not wish to receive e-mail promotions, 1 = Contact does wish to receive e-mail promotions from AdventureWorks, 2 = Contact does wish to receive e-mail promotions from AdventureWorks and selected partners. */
  emailpromotion: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[LocalDateTime] = Defaulted.UseDefault
) {
  def toRow(namestyleDefault: => NameStyle, emailpromotionDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => LocalDateTime): PersonRow =
    PersonRow(
      businessentityid = businessentityid,
      persontype = persontype,
      title = title,
      firstname = firstname,
      middlename = middlename,
      lastname = lastname,
      suffix = suffix,
      additionalcontactinfo = additionalcontactinfo,
      demographics = demographics,
      namestyle = namestyle match {
                    case Defaulted.UseDefault => namestyleDefault
                    case Defaulted.Provided(value) => value
                  },
      emailpromotion = emailpromotion match {
                         case Defaulted.UseDefault => emailpromotionDefault
                         case Defaulted.Provided(value) => value
                       },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object PersonRowUnsaved {
  implicit val decoder: Decoder[PersonRowUnsaved] =
    (c: HCursor) =>
      for {
        businessentityid <- c.downField("businessentityid").as[BusinessentityId]
        persontype <- c.downField("persontype").as[/* bpchar */ String]
        title <- c.downField("title").as[Option[/* max 8 chars */ String]]
        firstname <- c.downField("firstname").as[Name]
        middlename <- c.downField("middlename").as[Option[Name]]
        lastname <- c.downField("lastname").as[Name]
        suffix <- c.downField("suffix").as[Option[/* max 10 chars */ String]]
        additionalcontactinfo <- c.downField("additionalcontactinfo").as[Option[TypoXml]]
        demographics <- c.downField("demographics").as[Option[TypoXml]]
        namestyle <- c.downField("namestyle").as[Defaulted[NameStyle]]
        emailpromotion <- c.downField("emailpromotion").as[Defaulted[Int]]
        rowguid <- c.downField("rowguid").as[Defaulted[UUID]]
        modifieddate <- c.downField("modifieddate").as[Defaulted[LocalDateTime]]
      } yield PersonRowUnsaved(businessentityid, persontype, title, firstname, middlename, lastname, suffix, additionalcontactinfo, demographics, namestyle, emailpromotion, rowguid, modifieddate)
  implicit val encoder: Encoder[PersonRowUnsaved] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "businessentityid" := row.businessentityid,
        "persontype" := row.persontype,
        "title" := row.title,
        "firstname" := row.firstname,
        "middlename" := row.middlename,
        "lastname" := row.lastname,
        "suffix" := row.suffix,
        "additionalcontactinfo" := row.additionalcontactinfo,
        "demographics" := row.demographics,
        "namestyle" := row.namestyle,
        "emailpromotion" := row.emailpromotion,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate
      )}
}
