/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package address

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.stateprovince.StateprovinceId
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField

trait AddressFields[Row] {
  val addressid: IdField[AddressId, Row]
  val addressline1: Field[/* max 60 chars */ String, Row]
  val addressline2: OptField[/* max 60 chars */ String, Row]
  val city: Field[/* max 30 chars */ String, Row]
  val stateprovinceid: Field[StateprovinceId, Row]
  val postalcode: Field[/* max 15 chars */ String, Row]
  val spatiallocation: OptField[Array[Byte], Row]
  val rowguid: Field[UUID, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object AddressFields extends AddressStructure[AddressRow](None, identity, (_, x) => x)

