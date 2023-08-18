/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productdescription

import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.productdescription` which has not been persisted yet */
case class ProductdescriptionRowUnsaved(
  /** Description of the product. */
  description: /* max 400 chars */ String,
  /** Default: nextval('production.productdescription_productdescriptionid_seq'::regclass)
      Primary key for ProductDescription records. */
  productdescriptionid: Defaulted[ProductdescriptionId] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(productdescriptionidDefault: => ProductdescriptionId, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): ProductdescriptionRow =
    ProductdescriptionRow(
      description = description,
      productdescriptionid = productdescriptionid match {
                               case Defaulted.UseDefault => productdescriptionidDefault
                               case Defaulted.Provided(value) => value
                             },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductdescriptionRowUnsaved {
  implicit lazy val reads: Reads[ProductdescriptionRowUnsaved] = Reads[ProductdescriptionRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductdescriptionRowUnsaved(
          description = json.\("description").as(Reads.StringReads),
          productdescriptionid = json.\("productdescriptionid").as(Defaulted.reads(ProductdescriptionId.reads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductdescriptionRowUnsaved] = OWrites[ProductdescriptionRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "description" -> Writes.StringWrites.writes(o.description),
      "productdescriptionid" -> Defaulted.writes(ProductdescriptionId.writes).writes(o.productdescriptionid),
      "rowguid" -> Defaulted.writes(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
