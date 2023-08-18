/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithdemographics

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import typo.dsl.SqlExpr.OptField

trait VstorewithdemographicsViewFields[Row] {
  val businessentityid: OptField[BusinessentityId, Row]
  val name: OptField[Name, Row]
  val AnnualSales: OptField[TypoMoney, Row]
  val AnnualRevenue: OptField[TypoMoney, Row]
  val BankName: OptField[/* max 50 chars */ String, Row]
  val BusinessType: OptField[/* max 5 chars */ String, Row]
  val YearOpened: OptField[Int, Row]
  val Specialty: OptField[/* max 50 chars */ String, Row]
  val SquareFeet: OptField[Int, Row]
  val Brands: OptField[/* max 30 chars */ String, Row]
  val Internet: OptField[/* max 30 chars */ String, Row]
  val NumberEmployees: OptField[Int, Row]
}
object VstorewithdemographicsViewFields extends VstorewithdemographicsViewStructure[VstorewithdemographicsViewRow](None, identity, (_, x) => x)

