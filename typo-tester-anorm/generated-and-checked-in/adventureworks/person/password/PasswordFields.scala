/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package password

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField

trait PasswordFields[Row] {
  val businessentityid: IdField[BusinessentityId, Row]
  val passwordhash: Field[/* max 128 chars */ String, Row]
  val passwordsalt: Field[/* max 10 chars */ String, Row]
  val rowguid: Field[UUID, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object PasswordFields extends PasswordStructure[PasswordRow](None, identity, (_, x) => x)

