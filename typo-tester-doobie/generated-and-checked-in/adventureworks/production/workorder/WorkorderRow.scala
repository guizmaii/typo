/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package workorder

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.scrapreason.ScrapreasonId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class WorkorderRow(
  /** Primary key for WorkOrder records. */
  workorderid: WorkorderId,
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
  modifieddate: TypoLocalDateTime
)

object WorkorderRow {
  implicit lazy val decoder: Decoder[WorkorderRow] = Decoder.forProduct9[WorkorderRow, WorkorderId, ProductId, Int, Int, TypoLocalDateTime, Option[TypoLocalDateTime], TypoLocalDateTime, Option[ScrapreasonId], TypoLocalDateTime]("workorderid", "productid", "orderqty", "scrappedqty", "startdate", "enddate", "duedate", "scrapreasonid", "modifieddate")(WorkorderRow.apply)(WorkorderId.decoder, ProductId.decoder, Decoder.decodeInt, Decoder.decodeInt, TypoLocalDateTime.decoder, Decoder.decodeOption(TypoLocalDateTime.decoder), TypoLocalDateTime.decoder, Decoder.decodeOption(ScrapreasonId.decoder), TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[WorkorderRow] = Encoder.forProduct9[WorkorderRow, WorkorderId, ProductId, Int, Int, TypoLocalDateTime, Option[TypoLocalDateTime], TypoLocalDateTime, Option[ScrapreasonId], TypoLocalDateTime]("workorderid", "productid", "orderqty", "scrappedqty", "startdate", "enddate", "duedate", "scrapreasonid", "modifieddate")(x => (x.workorderid, x.productid, x.orderqty, x.scrappedqty, x.startdate, x.enddate, x.duedate, x.scrapreasonid, x.modifieddate))(WorkorderId.encoder, ProductId.encoder, Encoder.encodeInt, Encoder.encodeInt, TypoLocalDateTime.encoder, Encoder.encodeOption(TypoLocalDateTime.encoder), TypoLocalDateTime.encoder, Encoder.encodeOption(ScrapreasonId.encoder), TypoLocalDateTime.encoder)
  implicit lazy val read: Read[WorkorderRow] = new Read[WorkorderRow](
    gets = List(
      (WorkorderId.get, Nullability.NoNulls),
      (ProductId.get, Nullability.NoNulls),
      (Meta.IntMeta.get, Nullability.NoNulls),
      (Meta.IntMeta.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.NoNulls),
      (ScrapreasonId.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => WorkorderRow(
      workorderid = WorkorderId.get.unsafeGetNonNullable(rs, i + 0),
      productid = ProductId.get.unsafeGetNonNullable(rs, i + 1),
      orderqty = Meta.IntMeta.get.unsafeGetNonNullable(rs, i + 2),
      scrappedqty = Meta.IntMeta.get.unsafeGetNonNullable(rs, i + 3),
      startdate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 4),
      enddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 5),
      duedate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 6),
      scrapreasonid = ScrapreasonId.get.unsafeGetNullable(rs, i + 7),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 8)
    )
  )
}
