/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package personphone

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.phonenumbertype.PhonenumbertypeId
import adventureworks.public.Phone
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `person.personphone` which has not been persisted yet */
case class PersonphoneRowUnsaved(
  /** Business entity identification number. Foreign key to Person.BusinessEntityID.
      Points to [[person.PersonRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Telephone number identification number. */
  phonenumber: Phone,
  /** Kind of phone number. Foreign key to PhoneNumberType.PhoneNumberTypeID.
      Points to [[phonenumbertype.PhonenumbertypeRow.phonenumbertypeid]] */
  phonenumbertypeid: PhonenumbertypeId,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): PersonphoneRow =
    PersonphoneRow(
      businessentityid = businessentityid,
      phonenumber = phonenumber,
      phonenumbertypeid = phonenumbertypeid,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object PersonphoneRowUnsaved {
  implicit lazy val reads: Reads[PersonphoneRowUnsaved] = Reads[PersonphoneRowUnsaved](json => JsResult.fromTry(
      Try(
        PersonphoneRowUnsaved(
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          phonenumber = json.\("phonenumber").as(Phone.reads),
          phonenumbertypeid = json.\("phonenumbertypeid").as(PhonenumbertypeId.reads),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[PersonphoneRowUnsaved] = OWrites[PersonphoneRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "phonenumber" -> Phone.writes.writes(o.phonenumber),
      "phonenumbertypeid" -> PhonenumbertypeId.writes.writes(o.phonenumbertypeid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
