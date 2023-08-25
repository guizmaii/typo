/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sp

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SpViewStructure[Row](val prefix: Option[String], val extract: Row => SpViewRow, val merge: (Row, SpViewRow) => Row)
  extends Relation[SpViewFields, SpViewRow, Row]
    with SpViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val territoryid = new OptField[SalesterritoryId, Row](prefix, "territoryid", None, Some("int4"))(x => extract(x).territoryid, (row, value) => merge(row, extract(row).copy(territoryid = value)))
  override val salesquota = new OptField[BigDecimal, Row](prefix, "salesquota", None, Some("numeric"))(x => extract(x).salesquota, (row, value) => merge(row, extract(row).copy(salesquota = value)))
  override val bonus = new OptField[BigDecimal, Row](prefix, "bonus", None, Some("numeric"))(x => extract(x).bonus, (row, value) => merge(row, extract(row).copy(bonus = value)))
  override val commissionpct = new OptField[BigDecimal, Row](prefix, "commissionpct", None, Some("numeric"))(x => extract(x).commissionpct, (row, value) => merge(row, extract(row).copy(commissionpct = value)))
  override val salesytd = new OptField[BigDecimal, Row](prefix, "salesytd", None, Some("numeric"))(x => extract(x).salesytd, (row, value) => merge(row, extract(row).copy(salesytd = value)))
  override val saleslastyear = new OptField[BigDecimal, Row](prefix, "saleslastyear", None, Some("numeric"))(x => extract(x).saleslastyear, (row, value) => merge(row, extract(row).copy(saleslastyear = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, businessentityid, territoryid, salesquota, bonus, commissionpct, salesytd, saleslastyear, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SpViewRow, merge: (NewRow, SpViewRow) => NewRow): SpViewStructure[NewRow] =
    new SpViewStructure(prefix, extract, merge)
}
