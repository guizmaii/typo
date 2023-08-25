/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package crc

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.countryregion.CountryregionId
import adventureworks.sales.currency.CurrencyId
import typo.dsl.SqlExpr.OptField

trait CrcViewFields[Row] {
  val countryregioncode: OptField[CountryregionId, Row]
  val currencycode: OptField[CurrencyId, Row]
  val modifieddate: OptField[TypoLocalDateTime, Row]
}
object CrcViewFields extends CrcViewStructure[CrcViewRow](None, identity, (_, x) => x)

