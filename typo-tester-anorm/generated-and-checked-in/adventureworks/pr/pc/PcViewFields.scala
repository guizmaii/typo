/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pc

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.productcategory.ProductcategoryId
import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.OptField

trait PcViewFields[Row] {
  val id: OptField[Int, Row]
  val productcategoryid: OptField[ProductcategoryId, Row]
  val name: OptField[Name, Row]
  val rowguid: OptField[UUID, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object PcViewFields extends PcViewStructure[PcViewRow](None, identity, (_, x) => x)

