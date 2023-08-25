/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package sr

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.scrapreason.ScrapreasonId
import adventureworks.public.Name
import typo.dsl.SqlExpr.OptField

trait SrViewFields[Row] {
  val id: OptField[Int, Row]
  val scrapreasonid: OptField[ScrapreasonId, Row]
  val name: OptField[Name, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object SrViewFields extends SrViewStructure[SrViewRow](None, identity, (_, x) => x)

