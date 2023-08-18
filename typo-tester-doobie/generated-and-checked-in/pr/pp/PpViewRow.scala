/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pp

import adventureworks.production.productphoto.ProductphotoId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PpViewRow(
  id: Option[Int],
  /** Points to [[production.productphoto.ProductphotoRow.productphotoid]] */
  productphotoid: Option[ProductphotoId],
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphoto]] */
  thumbnailphoto: Option[Byte],
  /** Points to [[production.productphoto.ProductphotoRow.thumbnailphotofilename]] */
  thumbnailphotofilename: Option[/* max 50 chars */ String],
  /** Points to [[production.productphoto.ProductphotoRow.largephoto]] */
  largephoto: Option[Byte],
  /** Points to [[production.productphoto.ProductphotoRow.largephotofilename]] */
  largephotofilename: Option[/* max 50 chars */ String],
  /** Points to [[production.productphoto.ProductphotoRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object PpViewRow {
  implicit lazy val decoder: Decoder[PpViewRow] = Decoder.forProduct7[PpViewRow, Option[Int], Option[ProductphotoId], Option[Byte], Option[/* max 50 chars */ String], Option[Byte], Option[/* max 50 chars */ String], Option[TypoLocalDateTime]]("id", "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate")(PpViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(ProductphotoId.decoder), Decoder.decodeOption(Decoder.decodeByte), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeByte), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[PpViewRow] = Encoder.forProduct7[PpViewRow, Option[Int], Option[ProductphotoId], Option[Byte], Option[/* max 50 chars */ String], Option[Byte], Option[/* max 50 chars */ String], Option[TypoLocalDateTime]]("id", "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate")(x => (x.id, x.productphotoid, x.thumbnailphoto, x.thumbnailphotofilename, x.largephoto, x.largephotofilename, x.modifieddate))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(ProductphotoId.encoder), Encoder.encodeOption(Encoder.encodeByte), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeByte), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(TypoLocalDateTime.encoder))
  implicit lazy val read: Read[PpViewRow] = new Read[PpViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (ProductphotoId.get, Nullability.Nullable),
      (Meta.ByteMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.ByteMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PpViewRow(
      id = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      productphotoid = ProductphotoId.get.unsafeGetNullable(rs, i + 1),
      thumbnailphoto = Meta.ByteMeta.get.unsafeGetNullable(rs, i + 2),
      thumbnailphotofilename = Meta.StringMeta.get.unsafeGetNullable(rs, i + 3),
      largephoto = Meta.ByteMeta.get.unsafeGetNullable(rs, i + 4),
      largephotofilename = Meta.StringMeta.get.unsafeGetNullable(rs, i + 5),
      modifieddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 6)
    )
  )
}
