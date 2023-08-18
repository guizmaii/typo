/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sop

import adventureworks.production.product.ProductId
import adventureworks.sales.specialoffer.SpecialofferId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class SopViewRow(
  id: Option[Int],
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.specialofferid]] */
  specialofferid: Option[SpecialofferId],
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SopViewRow {
  implicit lazy val decoder: Decoder[SopViewRow] = Decoder.forProduct5[SopViewRow, Option[Int], Option[SpecialofferId], Option[ProductId], Option[UUID], Option[TypoLocalDateTime]]("id", "specialofferid", "productid", "rowguid", "modifieddate")(SopViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(SpecialofferId.decoder), Decoder.decodeOption(ProductId.decoder), Decoder.decodeOption(Decoder.decodeUUID), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SopViewRow] = Encoder.forProduct5[SopViewRow, Option[Int], Option[SpecialofferId], Option[ProductId], Option[UUID], Option[TypoLocalDateTime]]("id", "specialofferid", "productid", "rowguid", "modifieddate")(x => (x.id, x.specialofferid, x.productid, x.rowguid, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(SpecialofferId.encoder), Encoder.encodeOption(ProductId.encoder), Encoder.encodeOption(Encoder.encodeUUID), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[SopViewRow] = new Read[SopViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (SpecialofferId.get, Nullability.Nullable),
      (ProductId.get, Nullability.Nullable),
      (adventureworks.UUIDMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SopViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      specialofferid = SpecialofferId.get.unsafeGetNullable(rs, i + 1),
      productid = ProductId.get.unsafeGetNullable(rs, i + 2),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNullable(rs, i + 3),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 4)
    )
  )
}
