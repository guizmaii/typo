/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sop

import adventureworks.production.product.ProductId
import adventureworks.sales.specialoffer.SpecialofferId
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait SopViewFields[Row] {
  val id: OptField[Int, Row]
  val specialofferid: OptField[SpecialofferId, Row]
  val productid: OptField[ProductId, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object SopViewFields extends SopViewStructure[SopViewRow](None, identity, (_, x) => x)

