/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package pcc

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.creditcard.CreditcardId
import typo.dsl.SqlExpr.OptField

trait PccViewFields[Row] {
  val id: OptField[Int, Row]
  val businessentityid: OptField[BusinessentityId, Row]
  val creditcardid: OptField[CreditcardId, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object PccViewFields extends PccViewStructure[PccViewRow](None, identity, (_, x) => x)

