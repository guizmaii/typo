/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodelproductdescriptionculture

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class ProductmodelproductdescriptioncultureRow(
  /** Primary key. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: ProductmodelId,
  /** Primary key. Foreign key to ProductDescription.ProductDescriptionID.
      Points to [[productdescription.ProductdescriptionRow.productdescriptionid]] */
  productdescriptionid: ProductdescriptionId,
  /** Culture identification number. Foreign key to Culture.CultureID.
      Points to [[culture.CultureRow.cultureid]] */
  cultureid: CultureId,
  modifieddate: TypoLocalDateTime
){
   val compositeId: ProductmodelproductdescriptioncultureId = ProductmodelproductdescriptioncultureId(productmodelid, productdescriptionid, cultureid)
 }

object ProductmodelproductdescriptioncultureRow {
  implicit lazy val decoder: Decoder[ProductmodelproductdescriptioncultureRow] = Decoder.forProduct4[ProductmodelproductdescriptioncultureRow, ProductmodelId, ProductdescriptionId, CultureId, TypoLocalDateTime]("productmodelid", "productdescriptionid", "cultureid", "modifieddate")(ProductmodelproductdescriptioncultureRow.apply)(ProductmodelId.decoder, ProductdescriptionId.decoder, CultureId.decoder, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[ProductmodelproductdescriptioncultureRow] = Encoder.forProduct4[ProductmodelproductdescriptioncultureRow, ProductmodelId, ProductdescriptionId, CultureId, TypoLocalDateTime]("productmodelid", "productdescriptionid", "cultureid", "modifieddate")(x => (x.productmodelid, x.productdescriptionid, x.cultureid, x.modifieddate))(ProductmodelId.encoder, ProductdescriptionId.encoder, CultureId.encoder, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[ProductmodelproductdescriptioncultureRow] = new Read[ProductmodelproductdescriptioncultureRow](
    gets = List(
      (ProductmodelId.get, Nullability.NoNulls),
      (ProductdescriptionId.get, Nullability.NoNulls),
      (CultureId.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ProductmodelproductdescriptioncultureRow(
      productmodelid = ProductmodelId.get.unsafeGetNonNullable(rs, i + 0),
      productdescriptionid = ProductdescriptionId.get.unsafeGetNonNullable(rs, i + 1),
      cultureid = CultureId.get.unsafeGetNonNullable(rs, i + 2),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 3)
    )
  )
}
