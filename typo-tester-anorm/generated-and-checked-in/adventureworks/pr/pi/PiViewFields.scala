/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pi

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.location.LocationId
import adventureworks.production.product.ProductId
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait PiViewFields[Row] {
  val id: OptField[Int, Row]
  val productid: OptField[ProductId, Row]
  val locationid: OptField[LocationId, Row]
  val shelf: OptField[/* max 10 chars */ String, Row]
  val bin: OptField[Int, Row]
  val quantity: OptField[Int, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object PiViewFields extends PiViewStructure[PiViewRow](None, identity, (_, x) => x)

