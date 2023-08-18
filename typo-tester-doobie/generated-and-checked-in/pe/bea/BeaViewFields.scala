/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package bea

import adventureworks.person.address.AddressId
import adventureworks.person.addresstype.AddresstypeId
import adventureworks.person.businessentity.BusinessentityId
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait BeaViewFields[Row] {
  val id: OptField[Int, Row]
  val businessentityid: OptField[BusinessentityId, Row]
  val addressid: OptField[AddressId, Row]
  val addresstypeid: OptField[AddresstypeId, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object BeaViewFields extends BeaViewStructure[BeaViewRow](None, identity, (_, x) => x)

