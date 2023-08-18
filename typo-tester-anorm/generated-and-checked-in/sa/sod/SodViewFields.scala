/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sod

import adventureworks.production.product.ProductId
import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.specialoffer.SpecialofferId
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait SodViewFields[Row] {
  val id: OptField[Int, Row]
  val salesorderid: OptField[SalesorderheaderId, Row]
  val salesorderdetailid: OptField[Int, Row]
  val carriertrackingnumber: OptField[/* max 25 chars */ String, Row]
  val orderqty: OptField[Int, Row]
  val productid: OptField[ProductId, Row]
  val specialofferid: OptField[SpecialofferId, Row]
  val unitprice: OptField[BigDecimal, Row]
  val unitpricediscount: OptField[BigDecimal, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object SodViewFields extends SodViewStructure[SodViewRow](None, identity, (_, x) => x)

