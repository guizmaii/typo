/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productdescription

import io.circe.Decoder
import io.circe.Encoder
import java.util.UUID

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
  implicit lazy val decoder: Decoder[ProductdescriptionRowUnsaved] = Decoder.forProduct4[ProductdescriptionRowUnsaved, /* max 400 chars */ String, Defaulted[ProductdescriptionId], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("description", "productdescriptionid", "rowguid", "modifieddate")(ProductdescriptionRowUnsaved.apply)(Decoder.decodeString, Defaulted.decoder(ProductdescriptionId.decoder), Defaulted.decoder(Decoder.decodeUUID), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[ProductdescriptionRowUnsaved] = Encoder.forProduct4[ProductdescriptionRowUnsaved, /* max 400 chars */ String, Defaulted[ProductdescriptionId], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("description", "productdescriptionid", "rowguid", "modifieddate")(x => (x.description, x.productdescriptionid, x.rowguid, x.modifieddate))(Encoder.encodeString, Defaulted.encoder(ProductdescriptionId.encoder), Defaulted.encoder(Encoder.encodeUUID), Defaulted.encoder(TypoLocalDateTime.encoder))
}
