/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodelproductdescriptionculture

import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.productmodelproductdescriptionculture` which has not been persisted yet */
case class ProductmodelproductdescriptioncultureRowUnsaved(
  /** Primary key. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: ProductmodelId,
  /** Primary key. Foreign key to ProductDescription.ProductDescriptionID.
      Points to [[productdescription.ProductdescriptionRow.productdescriptionid]] */
  productdescriptionid: ProductdescriptionId,
  /** Culture identification number. Foreign key to Culture.CultureID.
      Points to [[culture.CultureRow.cultureid]] */
  cultureid: CultureId,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): ProductmodelproductdescriptioncultureRow =
    ProductmodelproductdescriptioncultureRow(
      productmodelid = productmodelid,
      productdescriptionid = productdescriptionid,
      cultureid = cultureid,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductmodelproductdescriptioncultureRowUnsaved {
  implicit lazy val reads: Reads[ProductmodelproductdescriptioncultureRowUnsaved] = Reads[ProductmodelproductdescriptioncultureRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductmodelproductdescriptioncultureRowUnsaved(
          productmodelid = json.\("productmodelid").as(ProductmodelId.reads),
          productdescriptionid = json.\("productdescriptionid").as(ProductdescriptionId.reads),
          cultureid = json.\("cultureid").as(CultureId.reads),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductmodelproductdescriptioncultureRowUnsaved] = OWrites[ProductmodelproductdescriptioncultureRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "productmodelid" -> ProductmodelId.writes.writes(o.productmodelid),
      "productdescriptionid" -> ProductdescriptionId.writes.writes(o.productdescriptionid),
      "cultureid" -> CultureId.writes.writes(o.cultureid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
