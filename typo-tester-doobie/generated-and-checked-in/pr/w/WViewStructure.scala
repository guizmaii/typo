/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package w

import adventureworks.production.product.ProductId
import adventureworks.production.scrapreason.ScrapreasonId
import adventureworks.production.workorder.WorkorderId
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class WViewStructure[Row](val prefix: Option[String], val extract: Row => WViewRow, val merge: (Row, WViewRow) => Row)
  extends Relation[WViewFields, WViewRow, Row]
    with WViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val workorderid = new OptField[WorkorderId, Row](prefix, "workorderid", None, Some("int4"))(x => extract(x).workorderid, (row, value) => merge(row, extract(row).copy(workorderid = value)))
  override val productid = new OptField[ProductId, Row](prefix, "productid", None, Some("int4"))(x => extract(x).productid, (row, value) => merge(row, extract(row).copy(productid = value)))
  override val orderqty = new OptField[Int, Row](prefix, "orderqty", None, Some("int4"))(x => extract(x).orderqty, (row, value) => merge(row, extract(row).copy(orderqty = value)))
  override val scrappedqty = new OptField[Int, Row](prefix, "scrappedqty", None, Some("int2"))(x => extract(x).scrappedqty, (row, value) => merge(row, extract(row).copy(scrappedqty = value)))
  override val startdate = new OptField[TypoLocalDateTime, Row](prefix, "startdate", Some("text"), Some("timestamp"))(x => extract(x).startdate, (row, value) => merge(row, extract(row).copy(startdate = value)))
  override val enddate = new OptField[TypoLocalDateTime, Row](prefix, "enddate", Some("text"), Some("timestamp"))(x => extract(x).enddate, (row, value) => merge(row, extract(row).copy(enddate = value)))
  override val duedate = new OptField[TypoLocalDateTime, Row](prefix, "duedate", Some("text"), Some("timestamp"))(x => extract(x).duedate, (row, value) => merge(row, extract(row).copy(duedate = value)))
  override val scrapreasonid = new OptField[ScrapreasonId, Row](prefix, "scrapreasonid", None, Some("int2"))(x => extract(x).scrapreasonid, (row, value) => merge(row, extract(row).copy(scrapreasonid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, workorderid, productid, orderqty, scrappedqty, startdate, enddate, duedate, scrapreasonid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => WViewRow, merge: (NewRow, WViewRow) => NewRow): WViewStructure[NewRow] =
    new WViewStructure(prefix, extract, merge)
}
