/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package shipmethod

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.IdField

trait ShipmethodFields[Row] {
  val shipmethodid: IdField[ShipmethodId, Row]
  val name: Field[Name, Row]
  val shipbase: Field[BigDecimal, Row]
  val shiprate: Field[BigDecimal, Row]
  val rowguid: Field[UUID, Row]
  val modifieddate: Field[TypoLocalDateTime, Row]
}
object ShipmethodFields extends ShipmethodStructure[ShipmethodRow](None, identity, (_, x) => x)

