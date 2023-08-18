/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package addresstype

import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField

trait AddresstypeFields[Row] {
  val addresstypeid: IdField[AddresstypeId, Row]
  val name: Field[Name, Row]
  val rowguid: Field[UUID, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object AddresstypeFields extends AddresstypeStructure[AddresstypeRow](None, identity, (_, x) => x)

