/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.NameStyle
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class PersonRow(
  /** Primary key for Person records.
      Points to [[businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Primary type of person: SC = Store Contact, IN = Individual (retail) customer, SP = Sales person, EM = Employee (non-sales), VC = Vendor contact, GC = General contact */
  persontype: /* bpchar, max 2 chars */ String,
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
  modifieddate: TypoLocalDateTime
)

object PersonRow {
  implicit lazy val decoder: Decoder[PersonRow] = Decoder.forProduct13[PersonRow, BusinessentityId, /* bpchar, max 2 chars */ String, NameStyle, Option[/* max 8 chars */ String], Name, Option[Name], Name, Option[/* max 10 chars */ String], Int, Option[TypoXml], Option[TypoXml], UUID, TypoLocalDateTime]("businessentityid", "persontype", "namestyle", "title", "firstname", "middlename", "lastname", "suffix", "emailpromotion", "additionalcontactinfo", "demographics", "rowguid", "modifieddate")(PersonRow.apply)(BusinessentityId.decoder, Decoder.decodeString, NameStyle.decoder, Decoder.decodeOption(Decoder.decodeString), Name.decoder, Decoder.decodeOption(Name.decoder), Name.decoder, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeInt, Decoder.decodeOption(TypoXml.decoder), Decoder.decodeOption(TypoXml.decoder), Decoder.decodeUUID, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[PersonRow] = Encoder.forProduct13[PersonRow, BusinessentityId, /* bpchar, max 2 chars */ String, NameStyle, Option[/* max 8 chars */ String], Name, Option[Name], Name, Option[/* max 10 chars */ String], Int, Option[TypoXml], Option[TypoXml], UUID, TypoLocalDateTime]("businessentityid", "persontype", "namestyle", "title", "firstname", "middlename", "lastname", "suffix", "emailpromotion", "additionalcontactinfo", "demographics", "rowguid", "modifieddate")(x => (x.businessentityid, x.persontype, x.namestyle, x.title, x.firstname, x.middlename, x.lastname, x.suffix, x.emailpromotion, x.additionalcontactinfo, x.demographics, x.rowguid, x.modifieddate))(BusinessentityId.encoder, Encoder.encodeString, NameStyle.encoder, Encoder.encodeOption(Encoder.encodeString), Name.encoder, Encoder.encodeOption(Name.encoder), Name.encoder, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeInt, Encoder.encodeOption(TypoXml.encoder), Encoder.encodeOption(TypoXml.encoder), Encoder.encodeUUID, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[PersonRow] = new Read[PersonRow](
    gets = List(
      (BusinessentityId.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (NameStyle.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Name.get, Nullability.NoNulls),
      (Name.get, Nullability.Nullable),
      (Name.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.NoNulls),
      (TypoXml.get, Nullability.Nullable),
      (TypoXml.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PersonRow(
      businessentityid = BusinessentityId.get.unsafeGetNonNullable(rs, i + 0),
      persontype = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 1),
      namestyle = NameStyle.get.unsafeGetNonNullable(rs, i + 2),
      title = Meta.StringMeta.get.unsafeGetNullable(rs, i + 3),
      firstname = Name.get.unsafeGetNonNullable(rs, i + 4),
      middlename = Name.get.unsafeGetNullable(rs, i + 5),
      lastname = Name.get.unsafeGetNonNullable(rs, i + 6),
      suffix = Meta.StringMeta.get.unsafeGetNullable(rs, i + 7),
      emailpromotion = Meta.IntMeta.get.unsafeGetNonNullable(rs, i + 8),
      additionalcontactinfo = TypoXml.get.unsafeGetNullable(rs, i + 9),
      demographics = TypoXml.get.unsafeGetNullable(rs, i + 10),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNonNullable(rs, i + 11),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 12)
    )
  )
}
