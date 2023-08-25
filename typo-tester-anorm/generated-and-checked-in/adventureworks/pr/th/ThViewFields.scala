/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package th

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.transactionhistory.TransactionhistoryId
import typo.dsl.SqlExpr.OptField

trait ThViewFields[Row] {
  val id: OptField[Int, Row]
  val transactionid: OptField[TransactionhistoryId, Row]
  val productid: OptField[ProductId, Row]
  val referenceorderid: OptField[Int, Row]
  val referenceorderlineid: OptField[Int, Row]
  val transactiondate: OptField[TypoLocalDateTime, Row]
  val transactiontype: OptField[/* bpchar, max 1 chars */ String, Row]
  val quantity: OptField[Int, Row]
  val actualcost: OptField[BigDecimal, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object ThViewFields extends ThViewStructure[ThViewRow](None, identity, (_, x) => x)

