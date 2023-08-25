/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package contacttype

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class ContacttypeRow(
  /** Primary key for ContactType records. */
  contacttypeid: ContacttypeId,
  /** Contact type description. */
  name: Name,
  modifieddate: TypoLocalDateTime
)

object ContacttypeRow {
  implicit lazy val decoder: Decoder[ContacttypeRow] = Decoder.forProduct3[ContacttypeRow, ContacttypeId, Name, TypoLocalDateTime]("contacttypeid", "name", "modifieddate")(ContacttypeRow.apply)(ContacttypeId.decoder, Name.decoder, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[ContacttypeRow] = Encoder.forProduct3[ContacttypeRow, ContacttypeId, Name, TypoLocalDateTime]("contacttypeid", "name", "modifieddate")(x => (x.contacttypeid, x.name, x.modifieddate))(ContacttypeId.encoder, Name.encoder, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[ContacttypeRow] = new Read[ContacttypeRow](
    gets = List(
      (ContacttypeId.get, Nullability.NoNulls),
      (Name.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ContacttypeRow(
      contacttypeid = ContacttypeId.get.unsafeGetNonNullable(rs, i + 0),
      name = Name.get.unsafeGetNonNullable(rs, i + 1),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 2)
    )
  )
}
