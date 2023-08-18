/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pm

import adventureworks.production.productmodel.ProductmodelId
import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait PmViewFields[Row] {
  val id: OptField[Int, Row]
  val productmodelid: OptField[ProductmodelId, Row]
  val name: OptField[Name, Row]
  val catalogdescription: OptField[TypoXml, Row]
  val instructions: OptField[TypoXml, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object PmViewFields extends PmViewStructure[PmViewRow](None, identity, (_, x) => x)

