/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package c

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.culture.CultureId
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class CViewRow(
  id: Option[/* bpchar, max 6 chars */ String],
  /** Points to [[production.culture.CultureRow.cultureid]] */
  cultureid: Option[CultureId],
  /** Points to [[production.culture.CultureRow.name]] */
  name: Option[Name],
  /** Points to [[production.culture.CultureRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object CViewRow {
  implicit lazy val decoder: Decoder[CViewRow] = Decoder.forProduct4[CViewRow, Option[/* bpchar, max 6 chars */ String], Option[CultureId], Option[Name], Option[TypoLocalDateTime]]("id", "cultureid", "name", "modifieddate")(CViewRow.apply)(Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(CultureId.decoder), Decoder.decodeOption(Name.decoder), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[CViewRow] = Encoder.forProduct4[CViewRow, Option[/* bpchar, max 6 chars */ String], Option[CultureId], Option[Name], Option[TypoLocalDateTime]]("id", "cultureid", "name", "modifieddate")(x => (x.id, x.cultureid, x.name, x.modifieddate))(Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(CultureId.encoder), Encoder.encodeOption(Name.encoder), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[CViewRow] = new Read[CViewRow](
    gets = List(
      (Meta.StringMeta.get, Nullability.Nullable),
      (CultureId.get, Nullability.Nullable),
      (Name.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => CViewRow(
      id = Meta.StringMeta.get.unsafeGetNullable(rs, i + 0),
      cultureid = CultureId.get.unsafeGetNullable(rs, i + 1),
      name = Name.get.unsafeGetNullable(rs, i + 2),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 3)
    )
  )
}
