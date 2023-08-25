/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesreason

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField

trait SalesreasonFields[Row] {
  val salesreasonid: IdField[SalesreasonId, Row]
  val name: Field[Name, Row]
  val reasontype: Field[Name, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object SalesreasonFields extends SalesreasonStructure[SalesreasonRow](None, identity, (_, x) => x)

