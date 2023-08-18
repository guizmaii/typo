/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package a

import adventureworks.person.address.AddressId
import adventureworks.person.stateprovince.StateprovinceId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class AViewRow(
  id: Option[Int],
  /** Points to [[person.address.AddressRow.addressid]] */
  addressid: Option[AddressId],
  /** Points to [[person.address.AddressRow.addressline1]] */
  addressline1: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.addressline2]] */
  addressline2: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.city]] */
  city: Option[/* max 30 chars */ String],
  /** Points to [[person.address.AddressRow.stateprovinceid]] */
  stateprovinceid: Option[StateprovinceId],
  /** Points to [[person.address.AddressRow.postalcode]] */
  postalcode: Option[/* max 15 chars */ String],
  /** Points to [[person.address.AddressRow.spatiallocation]] */
  spatiallocation: Option[Byte],
  /** Points to [[person.address.AddressRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[person.address.AddressRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object AViewRow {
  implicit lazy val decoder: Decoder[AViewRow] = Decoder.forProduct10[AViewRow, Option[Int], Option[AddressId], Option[/* max 60 chars */ String], Option[/* max 60 chars */ String], Option[/* max 30 chars */ String], Option[StateprovinceId], Option[/* max 15 chars */ String], Option[Byte], Option[UUID], Option[TypoLocalDateTime]]("id", "addressid", "addressline1", "addressline2", "city", "stateprovinceid", "postalcode", "spatiallocation", "rowguid", "modifieddate")(AViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(AddressId.decoder), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(StateprovinceId.decoder), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeByte), Decoder.decodeOption(Decoder.decodeUUID), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[AViewRow] = Encoder.forProduct10[AViewRow, Option[Int], Option[AddressId], Option[/* max 60 chars */ String], Option[/* max 60 chars */ String], Option[/* max 30 chars */ String], Option[StateprovinceId], Option[/* max 15 chars */ String], Option[Byte], Option[UUID], Option[TypoLocalDateTime]]("id", "addressid", "addressline1", "addressline2", "city", "stateprovinceid", "postalcode", "spatiallocation", "rowguid", "modifieddate")(x => (x.id, x.addressid, x.addressline1, x.addressline2, x.city, x.stateprovinceid, x.postalcode, x.spatiallocation, x.rowguid, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(AddressId.encoder), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(StateprovinceId.encoder), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeByte), Encoder.encodeOption(Encoder.encodeUUID), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[AViewRow] = new Read[AViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (AddressId.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (StateprovinceId.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.ByteMeta.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => AViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      addressid = AddressId.get.unsafeGetNullable(rs, i + 1),
      addressline1 = Meta.StringMeta.get.unsafeGetNullable(rs, i + 2),
      addressline2 = Meta.StringMeta.get.unsafeGetNullable(rs, i + 3),
      city = Meta.StringMeta.get.unsafeGetNullable(rs, i + 4),
      stateprovinceid = StateprovinceId.get.unsafeGetNullable(rs, i + 5),
      postalcode = Meta.StringMeta.get.unsafeGetNullable(rs, i + 6),
      spatiallocation = Meta.ByteMeta.get.unsafeGetNullable(rs, i + 7),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 8),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 9)
    )
  )
}
