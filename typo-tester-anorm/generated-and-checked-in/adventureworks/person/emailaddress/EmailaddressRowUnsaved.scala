/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package emailaddress

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `person.emailaddress` which has not been persisted yet */
case class EmailaddressRowUnsaved(
  /** Primary key. Person associated with this email address.  Foreign key to Person.BusinessEntityID
      Points to [[person.PersonRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** E-mail address for the person. */
  emailaddress: Option[/* max 50 chars */ String],
  /** Default: nextval('person.emailaddress_emailaddressid_seq'::regclass)
      Primary key. ID of this email address. */
  emailaddressid: Defaulted[Int] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(emailaddressidDefault: => Int, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): EmailaddressRow =
    EmailaddressRow(
      businessentityid = businessentityid,
      emailaddress = emailaddress,
      emailaddressid = emailaddressid match {
                         case Defaulted.UseDefault => emailaddressidDefault
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
object EmailaddressRowUnsaved {
  implicit lazy val reads: Reads[EmailaddressRowUnsaved] = Reads[EmailaddressRowUnsaved](json => JsResult.fromTry(
      Try(
        EmailaddressRowUnsaved(
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          emailaddress = json.\("emailaddress").toOption.map(_.as(Reads.StringReads)),
          emailaddressid = json.\("emailaddressid").as(Defaulted.reads(Reads.IntReads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[EmailaddressRowUnsaved] = OWrites[EmailaddressRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "emailaddress" -> Writes.OptionWrites(Writes.StringWrites).writes(o.emailaddress),
      "emailaddressid" -> Defaulted.writes(Writes.IntWrites).writes(o.emailaddressid),
      "rowguid" -> Defaulted.writes(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
