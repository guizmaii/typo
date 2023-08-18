/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodelillustration

import adventureworks.production.illustration.IllustrationId
import adventureworks.production.productmodel.ProductmodelId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.productmodelillustration` which has not been persisted yet */
case class ProductmodelillustrationRowUnsaved(
  /** Primary key. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: ProductmodelId,
  /** Primary key. Foreign key to Illustration.IllustrationID.
      Points to [[illustration.IllustrationRow.illustrationid]] */
  illustrationid: IllustrationId,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): ProductmodelillustrationRow =
    ProductmodelillustrationRow(
      productmodelid = productmodelid,
      illustrationid = illustrationid,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductmodelillustrationRowUnsaved {
  implicit lazy val reads: Reads[ProductmodelillustrationRowUnsaved] = Reads[ProductmodelillustrationRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductmodelillustrationRowUnsaved(
          productmodelid = json.\("productmodelid").as(ProductmodelId.reads),
          illustrationid = json.\("illustrationid").as(IllustrationId.reads),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductmodelillustrationRowUnsaved] = OWrites[ProductmodelillustrationRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "productmodelid" -> ProductmodelId.writes.writes(o.productmodelid),
      "illustrationid" -> IllustrationId.writes.writes(o.illustrationid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
