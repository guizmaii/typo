/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package eph

import adventureworks.person.businessentity.BusinessentityId
import typo.dsl.SqlExpr.OptField

trait EphViewFields[Row] {
  val id: OptField[Int, Row]
  val businessentityid: OptField[BusinessentityId, Row]
  val ratechangedate: OptField[TypoLocalDateTime, Row]
  val rate: OptField[BigDecimal, Row]
  val payfrequency: OptField[Int, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object EphViewFields extends EphViewStructure[EphViewRow](None, identity, (_, x) => x)

