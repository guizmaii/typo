/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package c

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.customer.CustomerId
import adventureworks.sales.salesterritory.SalesterritoryId
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class CViewStructure[Row](val prefix: Option[String], val extract: Row => CViewRow, val merge: (Row, CViewRow) => Row)
  extends Relation[CViewFields, CViewRow, Row]
    with CViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val customerid = new OptField[CustomerId, Row](prefix, "customerid", None, Some("int4"))(x => extract(x).customerid, (row, value) => merge(row, extract(row).copy(customerid = value)))
  override val personid = new OptField[BusinessentityId, Row](prefix, "personid", None, Some("int4"))(x => extract(x).personid, (row, value) => merge(row, extract(row).copy(personid = value)))
  override val storeid = new OptField[BusinessentityId, Row](prefix, "storeid", None, Some("int4"))(x => extract(x).storeid, (row, value) => merge(row, extract(row).copy(storeid = value)))
  override val territoryid = new OptField[SalesterritoryId, Row](prefix, "territoryid", None, Some("int4"))(x => extract(x).territoryid, (row, value) => merge(row, extract(row).copy(territoryid = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, customerid, personid, storeid, territoryid, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => CViewRow, merge: (NewRow, CViewRow) => NewRow): CViewStructure[NewRow] =
    new CViewStructure(prefix, extract, merge)
}
