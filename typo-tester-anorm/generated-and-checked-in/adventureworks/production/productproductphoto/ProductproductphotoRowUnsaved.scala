/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productproductphoto

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.productphoto.ProductphotoId
import adventureworks.public.Flag
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.productproductphoto` which has not been persisted yet */
case class ProductproductphotoRowUnsaved(
  /** Product identification number. Foreign key to Product.ProductID.
      Points to [[product.ProductRow.productid]] */
  productid: ProductId,
  /** Product photo identification number. Foreign key to ProductPhoto.ProductPhotoID.
      Points to [[productphoto.ProductphotoRow.productphotoid]] */
  productphotoid: ProductphotoId,
  /** Default: false
      0 = Photo is not the principal image. 1 = Photo is the principal image. */
  primary: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(primaryDefault: => Flag, modifieddateDefault: => TypoLocalDateTime): ProductproductphotoRow =
    ProductproductphotoRow(
      productid = productid,
      productphotoid = productphotoid,
      primary = primary match {
                  case Defaulted.UseDefault => primaryDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductproductphotoRowUnsaved {
  implicit lazy val reads: Reads[ProductproductphotoRowUnsaved] = Reads[ProductproductphotoRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductproductphotoRowUnsaved(
          productid = json.\("productid").as(ProductId.reads),
          productphotoid = json.\("productphotoid").as(ProductphotoId.reads),
          primary = json.\("primary").as(Defaulted.reads(Flag.reads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductproductphotoRowUnsaved] = OWrites[ProductproductphotoRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "productid" -> ProductId.writes.writes(o.productid),
      "productphotoid" -> ProductphotoId.writes.writes(o.productphotoid),
      "primary" -> Defaulted.writes(Flag.writes).writes(o.primary),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
