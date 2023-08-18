/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package e

import adventureworks.person.businessentity.BusinessentityId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class EViewRow(
  id: Option[Int],
  /** Points to [[person.emailaddress.EmailaddressRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[person.emailaddress.EmailaddressRow.emailaddressid]] */
  emailaddressid: Option[Int],
  /** Points to [[person.emailaddress.EmailaddressRow.emailaddress]] */
  emailaddress: Option[/* max 50 chars */ String],
  /** Points to [[person.emailaddress.EmailaddressRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[person.emailaddress.EmailaddressRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object EViewRow {
  implicit lazy val decoder: Decoder[EViewRow] = Decoder.forProduct6[EViewRow, Option[Int], Option[BusinessentityId], Option[Int], Option[/* max 50 chars */ String], Option[UUID], Option[TypoLocalDateTime]]("id", "businessentityid", "emailaddressid", "emailaddress", "rowguid", "modifieddate")(EViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(BusinessentityId.decoder), Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeUUID), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[EViewRow] = Encoder.forProduct6[EViewRow, Option[Int], Option[BusinessentityId], Option[Int], Option[/* max 50 chars */ String], Option[UUID], Option[TypoLocalDateTime]]("id", "businessentityid", "emailaddressid", "emailaddress", "rowguid", "modifieddate")(x => (x.id, x.businessentityid, x.emailaddressid, x.emailaddress, x.rowguid, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(BusinessentityId.encoder), Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeUUID), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[EViewRow] = new Read[EViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (BusinessentityId.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => EViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      businessentityid = BusinessentityId.get.unsafeGetNullable(rs, i + 1),
      emailaddressid = Meta.IntMeta.get.unsafeGetNullable(rs, i + 2),
      emailaddress = Meta.StringMeta.get.unsafeGetNullable(rs, i + 3),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 4),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 5)
    )
  )
}
