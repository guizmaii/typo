/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package emailaddress

import adventureworks.person.businessentity.BusinessentityId
import io.circe.Decoder
import io.circe.Encoder
import java.util.UUID

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
  implicit lazy val decoder: Decoder[EmailaddressRowUnsaved] = Decoder.forProduct5[EmailaddressRowUnsaved, BusinessentityId, Option[/* max 50 chars */ String], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("businessentityid", "emailaddress", "emailaddressid", "rowguid", "modifieddate")(EmailaddressRowUnsaved.apply)(BusinessentityId.decoder, Decoder.decodeOption(Decoder.decodeString), Defaulted.decoder(Decoder.decodeInt), Defaulted.decoder(Decoder.decodeUUID), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[EmailaddressRowUnsaved] = Encoder.forProduct5[EmailaddressRowUnsaved, BusinessentityId, Option[/* max 50 chars */ String], Defaulted[Int], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("businessentityid", "emailaddress", "emailaddressid", "rowguid", "modifieddate")(x => (x.businessentityid, x.emailaddress, x.emailaddressid, x.rowguid, x.modifieddate))(BusinessentityId.encoder, Encoder.encodeOption(Encoder.encodeString), Defaulted.encoder(Encoder.encodeInt), Defaulted.encoder(Encoder.encodeUUID), Defaulted.encoder(TypoLocalDateTime.encoder))
}
