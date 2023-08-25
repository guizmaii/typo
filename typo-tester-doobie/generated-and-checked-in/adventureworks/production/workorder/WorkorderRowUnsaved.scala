/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package workorder

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.scrapreason.ScrapreasonId
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `production.workorder` which has not been persisted yet */
case class WorkorderRowUnsaved(
  /** Product identification number. Foreign key to Product.ProductID.
      Points to [[product.ProductRow.productid]] */
  productid: ProductId,
  /** Product quantity to build. */
  orderqty: Int,
  /** Quantity that failed inspection. */
  scrappedqty: Int,
  /** Work order start date. */
  startdate: TypoLocalDateTime,
  /** Work order end date. */
  enddate: Option[TypoLocalDateTime],
  /** Work order due date. */
  duedate: TypoLocalDateTime,
  /** Reason for inspection failure.
      Points to [[scrapreason.ScrapreasonRow.scrapreasonid]] */
  scrapreasonid: Option[ScrapreasonId],
  /** Default: nextval('production.workorder_workorderid_seq'::regclass)
      Primary key for WorkOrder records. */
  workorderid: Defaulted[WorkorderId] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(workorderidDefault: => WorkorderId, modifieddateDefault: => TypoLocalDateTime): WorkorderRow =
    WorkorderRow(
      productid = productid,
      orderqty = orderqty,
      scrappedqty = scrappedqty,
      startdate = startdate,
      enddate = enddate,
      duedate = duedate,
      scrapreasonid = scrapreasonid,
      workorderid = workorderid match {
                      case Defaulted.UseDefault => workorderidDefault
                      case Defaulted.Provided(value) => value
                    },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object WorkorderRowUnsaved {
  implicit lazy val decoder: Decoder[WorkorderRowUnsaved] = Decoder.forProduct9[WorkorderRowUnsaved, ProductId, Int, Int, TypoLocalDateTime, Option[TypoLocalDateTime], TypoLocalDateTime, Option[ScrapreasonId], Defaulted[WorkorderId], Defaulted[TypoLocalDateTime]]("productid", "orderqty", "scrappedqty", "startdate", "enddate", "duedate", "scrapreasonid", "workorderid", "modifieddate")(WorkorderRowUnsaved.apply)(ProductId.decoder, Decoder.decodeInt, Decoder.decodeInt, TypoLocalDateTime.decoder, Decoder.decodeOption(TypoLocalDateTime.decoder), TypoLocalDateTime.decoder, Decoder.decodeOption(ScrapreasonId.decoder), Defaulted.decoder(WorkorderId.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[WorkorderRowUnsaved] = Encoder.forProduct9[WorkorderRowUnsaved, ProductId, Int, Int, TypoLocalDateTime, Option[TypoLocalDateTime], TypoLocalDateTime, Option[ScrapreasonId], Defaulted[WorkorderId], Defaulted[TypoLocalDateTime]]("productid", "orderqty", "scrappedqty", "startdate", "enddate", "duedate", "scrapreasonid", "workorderid", "modifieddate")(x => (x.productid, x.orderqty, x.scrappedqty, x.startdate, x.enddate, x.duedate, x.scrapreasonid, x.workorderid, x.modifieddate))(ProductId.encoder, Encoder.encodeInt, Encoder.encodeInt, TypoLocalDateTime.encoder, Encoder.encodeOption(TypoLocalDateTime.encoder), TypoLocalDateTime.encoder, Encoder.encodeOption(ScrapreasonId.encoder), Defaulted.encoder(WorkorderId.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
