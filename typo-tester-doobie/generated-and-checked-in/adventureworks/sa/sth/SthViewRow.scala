/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sth

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class SthViewRow(
  id: Option[Int],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.startdate]] */
  startdate: Option[TypoLocalDateTime],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.enddate]] */
  enddate: Option[TypoLocalDateTime],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[sales.salesterritoryhistory.SalesterritoryhistoryRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SthViewRow {
  implicit lazy val decoder: Decoder[SthViewRow] = Decoder.forProduct7[SthViewRow, Option[Int], Option[BusinessentityId], Option[SalesterritoryId], Option[TypoLocalDateTime], Option[TypoLocalDateTime], Option[UUID], Option[TypoLocalDateTime]]("id", "businessentityid", "territoryid", "startdate", "enddate", "rowguid", "modifieddate")(SthViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(BusinessentityId.decoder), Decoder.decodeOption(SalesterritoryId.decoder), Decoder.decodeOption(TypoLocalDateTime.decoder), Decoder.decodeOption(TypoLocalDateTime.decoder), Decoder.decodeOption(Decoder.decodeUUID), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SthViewRow] = Encoder.forProduct7[SthViewRow, Option[Int], Option[BusinessentityId], Option[SalesterritoryId], Option[TypoLocalDateTime], Option[TypoLocalDateTime], Option[UUID], Option[TypoLocalDateTime]]("id", "businessentityid", "territoryid", "startdate", "enddate", "rowguid", "modifieddate")(x => (x.id, x.businessentityid, x.territoryid, x.startdate, x.enddate, x.rowguid, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(BusinessentityId.encoder), Encoder.encodeOption(SalesterritoryId.encoder), Encoder.encodeOption(TypoLocalDateTime.encoder), Encoder.encodeOption(TypoLocalDateTime.encoder), Encoder.encodeOption(Encoder.encodeUUID), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[SthViewRow] = new Read[SthViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (BusinessentityId.get, Nullability.Nullable),
      (SalesterritoryId.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SthViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      businessentityid = BusinessentityId.get.unsafeGetNullable(rs, i + 1),
      territoryid = SalesterritoryId.get.unsafeGetNullable(rs, i + 2),
      startdate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 3),
      enddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 4),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 5),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 6)
    )
  )
}
