/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pi

import adventureworks.production.location.LocationId
import adventureworks.production.product.ProductId
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

case class PiViewRow(
  id: Option[Int],
  /** Points to [[production.productinventory.ProductinventoryRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[production.productinventory.ProductinventoryRow.locationid]] */
  locationid: Option[LocationId],
  /** Points to [[production.productinventory.ProductinventoryRow.shelf]] */
  shelf: Option[/* max 10 chars */ String],
  /** Points to [[production.productinventory.ProductinventoryRow.bin]] */
  bin: Option[Int],
  /** Points to [[production.productinventory.ProductinventoryRow.quantity]] */
  quantity: Option[Int],
  /** Points to [[production.productinventory.ProductinventoryRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[production.productinventory.ProductinventoryRow.modifieddate]] */
  modifieddate: Option[LocalDateTime]
)

object PiViewRow {
  implicit val decoder: Decoder[PiViewRow] =
    (c: HCursor) =>
      for {
        id <- c.downField("id").as[Option[Int]]
        productid <- c.downField("productid").as[Option[ProductId]]
        locationid <- c.downField("locationid").as[Option[LocationId]]
        shelf <- c.downField("shelf").as[Option[/* max 10 chars */ String]]
        bin <- c.downField("bin").as[Option[Int]]
        quantity <- c.downField("quantity").as[Option[Int]]
        rowguid <- c.downField("rowguid").as[Option[UUID]]
        modifieddate <- c.downField("modifieddate").as[Option[LocalDateTime]]
      } yield PiViewRow(id, productid, locationid, shelf, bin, quantity, rowguid, modifieddate)
  implicit val encoder: Encoder[PiViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "id" := row.id,
        "productid" := row.productid,
        "locationid" := row.locationid,
        "shelf" := row.shelf,
        "bin" := row.bin,
        "quantity" := row.quantity,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate
      )}
}
