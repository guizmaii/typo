/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package pv

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.production.product.ProductId
import adventureworks.production.unitmeasure.UnitmeasureId
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PvViewStructure[Row](val prefix: Option[String], val extract: Row => PvViewRow, val merge: (Row, PvViewRow) => Row)
  extends Relation[PvViewFields, PvViewRow, Row]
    with PvViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val productid = new OptField[ProductId, Row](prefix, "productid", None, Some("int4"))(x => extract(x).productid, (row, value) => merge(row, extract(row).copy(productid = value)))
  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val averageleadtime = new OptField[Int, Row](prefix, "averageleadtime", None, Some("int4"))(x => extract(x).averageleadtime, (row, value) => merge(row, extract(row).copy(averageleadtime = value)))
  override val standardprice = new OptField[BigDecimal, Row](prefix, "standardprice", None, Some("numeric"))(x => extract(x).standardprice, (row, value) => merge(row, extract(row).copy(standardprice = value)))
  override val lastreceiptcost = new OptField[BigDecimal, Row](prefix, "lastreceiptcost", None, Some("numeric"))(x => extract(x).lastreceiptcost, (row, value) => merge(row, extract(row).copy(lastreceiptcost = value)))
  override val lastreceiptdate = new OptField[TypoLocalDateTime, Row](prefix, "lastreceiptdate", Some("text"), Some("timestamp"))(x => extract(x).lastreceiptdate, (row, value) => merge(row, extract(row).copy(lastreceiptdate = value)))
  override val minorderqty = new OptField[Int, Row](prefix, "minorderqty", None, Some("int4"))(x => extract(x).minorderqty, (row, value) => merge(row, extract(row).copy(minorderqty = value)))
  override val maxorderqty = new OptField[Int, Row](prefix, "maxorderqty", None, Some("int4"))(x => extract(x).maxorderqty, (row, value) => merge(row, extract(row).copy(maxorderqty = value)))
  override val onorderqty = new OptField[Int, Row](prefix, "onorderqty", None, Some("int4"))(x => extract(x).onorderqty, (row, value) => merge(row, extract(row).copy(onorderqty = value)))
  override val unitmeasurecode = new OptField[UnitmeasureId, Row](prefix, "unitmeasurecode", None, Some("bpchar"))(x => extract(x).unitmeasurecode, (row, value) => merge(row, extract(row).copy(unitmeasurecode = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, productid, businessentityid, averageleadtime, standardprice, lastreceiptcost, lastreceiptdate, minorderqty, maxorderqty, onorderqty, unitmeasurecode, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PvViewRow, merge: (NewRow, PvViewRow) => NewRow): PvViewStructure[NewRow] =
    new PvViewStructure(prefix, extract, merge)
}
