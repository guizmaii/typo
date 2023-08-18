/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productlistpricehistory

import adventureworks.production.product.ProductId
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `production.productlistpricehistory` which has not been persisted yet */
case class ProductlistpricehistoryRowUnsaved(
  /** Product identification number. Foreign key to Product.ProductID
      Points to [[product.ProductRow.productid]] */
  productid: ProductId,
  /** List price start date. */
  startdate: TypoLocalDateTime,
  /** List price end date */
  enddate: Option[TypoLocalDateTime],
  /** Product list price. */
  listprice: BigDecimal,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): ProductlistpricehistoryRow =
    ProductlistpricehistoryRow(
      productid = productid,
      startdate = startdate,
      enddate = enddate,
      listprice = listprice,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductlistpricehistoryRowUnsaved {
  implicit lazy val decoder: Decoder[ProductlistpricehistoryRowUnsaved] = Decoder.forProduct5[ProductlistpricehistoryRowUnsaved, ProductId, TypoLocalDateTime, Option[TypoLocalDateTime], BigDecimal, Defaulted[TypoLocalDateTime]]("productid", "startdate", "enddate", "listprice", "modifieddate")(ProductlistpricehistoryRowUnsaved.apply)(ProductId.decoder, TypoLocalDateTime.decoder, Decoder.decodeOption(TypoLocalDateTime.decoder), Decoder.decodeBigDecimal, Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[ProductlistpricehistoryRowUnsaved] = Encoder.forProduct5[ProductlistpricehistoryRowUnsaved, ProductId, TypoLocalDateTime, Option[TypoLocalDateTime], BigDecimal, Defaulted[TypoLocalDateTime]]("productid", "startdate", "enddate", "listprice", "modifieddate")(x => (x.productid, x.startdate, x.enddate, x.listprice, x.modifieddate))(ProductId.encoder, TypoLocalDateTime.encoder, Encoder.encodeOption(TypoLocalDateTime.encoder), Encoder.encodeBigDecimal, Defaulted.encoder(TypoLocalDateTime.encoder))
}
