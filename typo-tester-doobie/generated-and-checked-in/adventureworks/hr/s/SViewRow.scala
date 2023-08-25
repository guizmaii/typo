/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package s

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoLocalTime
import adventureworks.humanresources.shift.ShiftId
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class SViewRow(
  id: Option[Int],
  /** Points to [[humanresources.shift.ShiftRow.shiftid]] */
  shiftid: Option[ShiftId],
  /** Points to [[humanresources.shift.ShiftRow.name]] */
  name: Option[Name],
  /** Points to [[humanresources.shift.ShiftRow.starttime]] */
  starttime: Option[TypoLocalTime],
  /** Points to [[humanresources.shift.ShiftRow.endtime]] */
  endtime: Option[TypoLocalTime],
  /** Points to [[humanresources.shift.ShiftRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SViewRow {
  implicit lazy val decoder: Decoder[SViewRow] = Decoder.forProduct6[SViewRow, Option[Int], Option[ShiftId], Option[Name], Option[TypoLocalTime], Option[TypoLocalTime], Option[TypoLocalDateTime]]("id", "shiftid", "name", "starttime", "endtime", "modifieddate")(SViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(ShiftId.decoder), Decoder.decodeOption(Name.decoder), Decoder.decodeOption(TypoLocalTime.decoder), Decoder.decodeOption(TypoLocalTime.decoder), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SViewRow] = Encoder.forProduct6[SViewRow, Option[Int], Option[ShiftId], Option[Name], Option[TypoLocalTime], Option[TypoLocalTime], Option[TypoLocalDateTime]]("id", "shiftid", "name", "starttime", "endtime", "modifieddate")(x => (x.id, x.shiftid, x.name, x.starttime, x.endtime, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(ShiftId.encoder), Encoder.encodeOption(Name.encoder), Encoder.encodeOption(TypoLocalTime.encoder), Encoder.encodeOption(TypoLocalTime.encoder), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[SViewRow] = new Read[SViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (ShiftId.get, Nullability.Nullable),
      (Name.get, Nullability.Nullable),
      (TypoLocalTime.get, Nullability.Nullable),
      (TypoLocalTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      shiftid = ShiftId.get.unsafeGetNullable(rs, i + 1),
      name = Name.get.unsafeGetNullable(rs, i + 2),
      starttime = TypoLocalTime.get.unsafeGetNullable(rs, i + 3),
      endtime = TypoLocalTime.get.unsafeGetNullable(rs, i + 4),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 5)
    )
  )
}
