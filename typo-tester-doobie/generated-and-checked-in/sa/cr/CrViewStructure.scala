/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package cr

import adventureworks.sales.currency.CurrencyId
import adventureworks.sales.currencyrate.CurrencyrateId
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class CrViewStructure[Row](val prefix: Option[String], val extract: Row => CrViewRow, val merge: (Row, CrViewRow) => Row)
  extends Relation[CrViewFields, CrViewRow, Row]
    with CrViewFields[Row] { outer =>

  override val currencyrateid = new OptField[CurrencyrateId, Row](prefix, "currencyrateid", None, Some("int4"))(x => extract(x).currencyrateid, (row, value) => merge(row, extract(row).copy(currencyrateid = value)))
  override val currencyratedate = new OptField[TypoLocalDateTime, Row](prefix, "currencyratedate", Some("text"), Some("timestamp"))(x => extract(x).currencyratedate, (row, value) => merge(row, extract(row).copy(currencyratedate = value)))
  override val fromcurrencycode = new OptField[CurrencyId, Row](prefix, "fromcurrencycode", None, Some("bpchar"))(x => extract(x).fromcurrencycode, (row, value) => merge(row, extract(row).copy(fromcurrencycode = value)))
  override val tocurrencycode = new OptField[CurrencyId, Row](prefix, "tocurrencycode", None, Some("bpchar"))(x => extract(x).tocurrencycode, (row, value) => merge(row, extract(row).copy(tocurrencycode = value)))
  override val averagerate = new OptField[BigDecimal, Row](prefix, "averagerate", None, Some("numeric"))(x => extract(x).averagerate, (row, value) => merge(row, extract(row).copy(averagerate = value)))
  override val endofdayrate = new OptField[BigDecimal, Row](prefix, "endofdayrate", None, Some("numeric"))(x => extract(x).endofdayrate, (row, value) => merge(row, extract(row).copy(endofdayrate = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](currencyrateid, currencyratedate, fromcurrencycode, tocurrencycode, averagerate, endofdayrate, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => CrViewRow, merge: (NewRow, CrViewRow) => NewRow): CrViewStructure[NewRow] =
    new CrViewStructure(prefix, extract, merge)
}
