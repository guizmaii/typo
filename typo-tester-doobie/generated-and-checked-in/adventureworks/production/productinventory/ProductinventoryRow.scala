/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productinventory

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoShort
import adventureworks.customtypes.TypoUUID
import adventureworks.production.location.LocationId
import adventureworks.production.product.ProductId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class ProductinventoryRow(
  /** Product identification number. Foreign key to Product.ProductID.
      Points to [[product.ProductRow.productid]] */
  productid: ProductId,
  /** Inventory location identification number. Foreign key to Location.LocationID.
      Points to [[location.LocationRow.locationid]] */
  locationid: LocationId,
  /** Storage compartment within an inventory location. */
  shelf: /* max 10 chars */ String,
  /** Storage container on a shelf in an inventory location.
      Constraint CK_ProductInventory_Bin affecting columns "bin":  (((bin >= 0) AND (bin <= 100))) */
  bin: TypoShort,
  /** Quantity of products in the inventory location. */
  quantity: TypoShort,
  rowguid: TypoUUID,
  modifieddate: TypoLocalDateTime
){
   val compositeId: ProductinventoryId = ProductinventoryId(productid, locationid)
 }

object ProductinventoryRow {
  implicit lazy val decoder: Decoder[ProductinventoryRow] = Decoder.forProduct7[ProductinventoryRow, ProductId, LocationId, /* max 10 chars */ String, TypoShort, TypoShort, TypoUUID, TypoLocalDateTime]("productid", "locationid", "shelf", "bin", "quantity", "rowguid", "modifieddate")(ProductinventoryRow.apply)(ProductId.decoder, LocationId.decoder, Decoder.decodeString, TypoShort.decoder, TypoShort.decoder, TypoUUID.decoder, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[ProductinventoryRow] = Encoder.forProduct7[ProductinventoryRow, ProductId, LocationId, /* max 10 chars */ String, TypoShort, TypoShort, TypoUUID, TypoLocalDateTime]("productid", "locationid", "shelf", "bin", "quantity", "rowguid", "modifieddate")(x => (x.productid, x.locationid, x.shelf, x.bin, x.quantity, x.rowguid, x.modifieddate))(ProductId.encoder, LocationId.encoder, Encoder.encodeString, TypoShort.encoder, TypoShort.encoder, TypoUUID.encoder, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[ProductinventoryRow] = new Read[ProductinventoryRow](
    gets = List(
      (ProductId.get, Nullability.NoNulls),
      (LocationId.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (TypoShort.get, Nullability.NoNulls),
      (TypoShort.get, Nullability.NoNulls),
      (TypoUUID.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ProductinventoryRow(
      productid = ProductId.get.unsafeGetNonNullable(rs, i + 0),
      locationid = LocationId.get.unsafeGetNonNullable(rs, i + 1),
      shelf = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 2),
      bin = TypoShort.get.unsafeGetNonNullable(rs, i + 3),
      quantity = TypoShort.get.unsafeGetNonNullable(rs, i + 4),
      rowguid = TypoUUID.get.unsafeGetNonNullable(rs, i + 5),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 6)
    )
  )
}
