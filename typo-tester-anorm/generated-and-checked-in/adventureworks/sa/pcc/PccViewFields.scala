/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package pcc

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.userdefined.CustomCreditcardId
import typo.dsl.SqlExpr.Field

trait PccViewFields[Row] {
  val id: Field[BusinessentityId, Row]
  val businessentityid: Field[BusinessentityId, Row]
  val creditcardid: Field[/* user-picked */ CustomCreditcardId, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object PccViewFields extends PccViewStructure[PccViewRow](None, identity, (_, x) => x)

