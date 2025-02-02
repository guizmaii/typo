/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package specialofferproduct

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoUUID
import adventureworks.production.product.ProductId
import adventureworks.sales.specialoffer.SpecialofferId
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `sales.specialofferproduct` which has not been persisted yet */
case class SpecialofferproductRowUnsaved(
  /** Primary key for SpecialOfferProduct records.
      Points to [[specialoffer.SpecialofferRow.specialofferid]] */
  specialofferid: SpecialofferId,
  /** Product identification number. Foreign key to Product.ProductID.
      Points to [[production.product.ProductRow.productid]] */
  productid: ProductId,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[TypoUUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(rowguidDefault: => TypoUUID, modifieddateDefault: => TypoLocalDateTime): SpecialofferproductRow =
    SpecialofferproductRow(
      specialofferid = specialofferid,
      productid = productid,
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
object SpecialofferproductRowUnsaved {
  implicit lazy val decoder: Decoder[SpecialofferproductRowUnsaved] = Decoder.forProduct4[SpecialofferproductRowUnsaved, SpecialofferId, ProductId, Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("specialofferid", "productid", "rowguid", "modifieddate")(SpecialofferproductRowUnsaved.apply)(SpecialofferId.decoder, ProductId.decoder, Defaulted.decoder(TypoUUID.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SpecialofferproductRowUnsaved] = Encoder.forProduct4[SpecialofferproductRowUnsaved, SpecialofferId, ProductId, Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("specialofferid", "productid", "rowguid", "modifieddate")(x => (x.specialofferid, x.productid, x.rowguid, x.modifieddate))(SpecialofferId.encoder, ProductId.encoder, Defaulted.encoder(TypoUUID.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
