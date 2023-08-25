/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package pod

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.purchasing.purchaseorderheader.PurchaseorderheaderId
import typo.dsl.SqlExpr.OptField

trait PodViewFields[Row] {
  val id: OptField[Int, Row]
  val purchaseorderid: OptField[PurchaseorderheaderId, Row]
  val purchaseorderdetailid: OptField[Int, Row]
  val duedate: OptField[TypoLocalDateTime, Row]
  val orderqty: OptField[Int, Row]
  val productid: OptField[ProductId, Row]
  val unitprice: OptField[BigDecimal, Row]
  val receivedqty: OptField[BigDecimal, Row]
  val rejectedqty: OptField[BigDecimal, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object PodViewFields extends PodViewStructure[PodViewRow](None, identity, (_, x) => x)

