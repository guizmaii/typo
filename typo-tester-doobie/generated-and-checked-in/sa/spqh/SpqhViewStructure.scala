/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package spqh

import adventureworks.person.businessentity.BusinessentityId
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SpqhViewStructure[Row](val prefix: Option[String], val extract: Row => SpqhViewRow, val merge: (Row, SpqhViewRow) => Row)
  extends Relation[SpqhViewFields, SpqhViewRow, Row]
    with SpqhViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val quotadate = new OptField[TypoLocalDateTime, Row](prefix, "quotadate", Some("text"), Some("timestamp"))(x => extract(x).quotadate, (row, value) => merge(row, extract(row).copy(quotadate = value)))
  override val salesquota = new OptField[BigDecimal, Row](prefix, "salesquota", None, Some("numeric"))(x => extract(x).salesquota, (row, value) => merge(row, extract(row).copy(salesquota = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, businessentityid, quotadate, salesquota, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SpqhViewRow, merge: (NewRow, SpqhViewRow) => NewRow): SpqhViewStructure[NewRow] =
    new SpqhViewStructure(prefix, extract, merge)
}
