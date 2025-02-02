/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package public
package users

import adventureworks.customtypes.TypoInstant
import adventureworks.customtypes.TypoUnknownCitext
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField

trait UsersFields[Row] {
  val userId: IdField[UsersId, Row]
  val name: Field[String, Row]
  val lastName: OptField[String, Row]
  val email: Field[TypoUnknownCitext, Row]
  val password: Field[String, Row]
  val createdAt: Field[TypoInstant, Row]
  val verifiedOn: OptField[TypoInstant, Row]
}
object UsersFields extends UsersStructure[UsersRow](None, identity, (_, x) => x)

