/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package specialofferproduct

import adventureworks.production.product.ProductId
import adventureworks.sales.specialoffer.SpecialofferId
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

/** Type for the composite primary key of table `sales.specialofferproduct` */
case class SpecialofferproductId(specialofferid: SpecialofferId, productid: ProductId)
object SpecialofferproductId {
  implicit val ordering: Ordering[SpecialofferproductId] = Ordering.by(x => (x.specialofferid, x.productid))
  implicit val decoder: Decoder[SpecialofferproductId] =
    (c: HCursor) =>
      for {
        specialofferid <- c.downField("specialofferid").as[SpecialofferId]
        productid <- c.downField("productid").as[ProductId]
      } yield SpecialofferproductId(specialofferid, productid)
  implicit val encoder: Encoder[SpecialofferproductId] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "specialofferid" := row.specialofferid,
        "productid" := row.productid
      )}
}
