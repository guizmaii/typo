/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package at

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.addresstype.AddresstypeId
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class AtViewRow(
  id: Option[Int],
  /** Points to [[person.addresstype.AddresstypeRow.addresstypeid]] */
  addresstypeid: Option[AddresstypeId],
  /** Points to [[person.addresstype.AddresstypeRow.name]] */
  name: Option[Name],
  /** Points to [[person.addresstype.AddresstypeRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[person.addresstype.AddresstypeRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object AtViewRow {
  implicit lazy val decoder: Decoder[AtViewRow] = Decoder.forProduct5[AtViewRow, Option[Int], Option[AddresstypeId], Option[Name], Option[UUID], Option[TypoLocalDateTime]]("id", "addresstypeid", "name", "rowguid", "modifieddate")(AtViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(AddresstypeId.decoder), Decoder.decodeOption(Name.decoder), Decoder.decodeOption(Decoder.decodeUUID), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[AtViewRow] = Encoder.forProduct5[AtViewRow, Option[Int], Option[AddresstypeId], Option[Name], Option[UUID], Option[TypoLocalDateTime]]("id", "addresstypeid", "name", "rowguid", "modifieddate")(x => (x.id, x.addresstypeid, x.name, x.rowguid, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(AddresstypeId.encoder), Encoder.encodeOption(Name.encoder), Encoder.encodeOption(Encoder.encodeUUID), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[AtViewRow] = new Read[AtViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (AddresstypeId.get, Nullability.Nullable),
      (Name.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => AtViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      addresstypeid = AddresstypeId.get.unsafeGetNullable(rs, i + 1),
      name = Name.get.unsafeGetNullable(rs, i + 2),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 3),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 4)
    )
  )
}
