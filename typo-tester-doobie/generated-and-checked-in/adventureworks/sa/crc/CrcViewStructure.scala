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
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class CrcViewStructure[Row](val prefix: Option[String], val extract: Row => CrcViewRow, val merge: (Row, CrcViewRow) => Row)
  extends Relation[CrcViewFields, CrcViewRow, Row]
    with CrcViewFields[Row] { outer =>

  override val countryregioncode = new OptField[CountryregionId, Row](prefix, "countryregioncode", None, None)(x => extract(x).countryregioncode, (row, value) => merge(row, extract(row).copy(countryregioncode = value)))
  override val currencycode = new OptField[CurrencyId, Row](prefix, "currencycode", None, Some("bpchar"))(x => extract(x).currencycode, (row, value) => merge(row, extract(row).copy(currencycode = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](countryregioncode, currencycode, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => CrcViewRow, merge: (NewRow, CrcViewRow) => NewRow): CrcViewStructure[NewRow] =
    new CrcViewStructure(prefix, extract, merge)
}
