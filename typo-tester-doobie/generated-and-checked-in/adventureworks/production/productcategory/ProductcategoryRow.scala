/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productcategory

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class ProductcategoryRow(
  /** Primary key for ProductCategory records. */
  productcategoryid: ProductcategoryId,
  /** Category description. */
  name: Name,
  rowguid: UUID,
  modifieddate: TypoLocalDateTime
)

object ProductcategoryRow {
  implicit lazy val decoder: Decoder[ProductcategoryRow] = Decoder.forProduct4[ProductcategoryRow, ProductcategoryId, Name, UUID, TypoLocalDateTime]("productcategoryid", "name", "rowguid", "modifieddate")(ProductcategoryRow.apply)(ProductcategoryId.decoder, Name.decoder, Decoder.decodeUUID, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[ProductcategoryRow] = Encoder.forProduct4[ProductcategoryRow, ProductcategoryId, Name, UUID, TypoLocalDateTime]("productcategoryid", "name", "rowguid", "modifieddate")(x => (x.productcategoryid, x.name, x.rowguid, x.modifieddate))(ProductcategoryId.encoder, Name.encoder, Encoder.encodeUUID, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[ProductcategoryRow] = new Read[ProductcategoryRow](
    gets = List(
      (ProductcategoryId.get, Nullability.NoNulls),
      (Name.get, Nullability.NoNulls),
      (adventureworks.UUIDMeta.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ProductcategoryRow(
      productcategoryid = ProductcategoryId.get.unsafeGetNonNullable(rs, i + 0),
      name = Name.get.unsafeGetNonNullable(rs, i + 1),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNonNullable(rs, i + 2),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 3)
    )
  )
}
