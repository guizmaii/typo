/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package a

import adventureworks.person.address.AddressId
import adventureworks.person.stateprovince.StateprovinceId
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait AViewFields[Row] {
  val id: OptField[Int, Row]
  val addressid: OptField[AddressId, Row]
  val addressline1: OptField[/* max 60 chars */ String, Row]
  val addressline2: OptField[/* max 60 chars */ String, Row]
  val city: OptField[/* max 30 chars */ String, Row]
  val stateprovinceid: OptField[StateprovinceId, Row]
  val postalcode: OptField[/* max 15 chars */ String, Row]
  val spatiallocation: OptField[Byte, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object AViewFields extends AViewStructure[AViewRow](None, identity, (_, x) => x)

