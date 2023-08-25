/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package bom

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.billofmaterials.BillofmaterialsId
import adventureworks.production.product.ProductId
import adventureworks.production.unitmeasure.UnitmeasureId
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class BomViewStructure[Row](val prefix: Option[String], val extract: Row => BomViewRow, val merge: (Row, BomViewRow) => Row)
  extends Relation[BomViewFields, BomViewRow, Row]
    with BomViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val billofmaterialsid = new OptField[BillofmaterialsId, Row](prefix, "billofmaterialsid", None, Some("int4"))(x => extract(x).billofmaterialsid, (row, value) => merge(row, extract(row).copy(billofmaterialsid = value)))
  override val productassemblyid = new OptField[ProductId, Row](prefix, "productassemblyid", None, Some("int4"))(x => extract(x).productassemblyid, (row, value) => merge(row, extract(row).copy(productassemblyid = value)))
  override val componentid = new OptField[ProductId, Row](prefix, "componentid", None, Some("int4"))(x => extract(x).componentid, (row, value) => merge(row, extract(row).copy(componentid = value)))
  override val startdate = new OptField[TypoLocalDateTime, Row](prefix, "startdate", Some("text"), Some("timestamp"))(x => extract(x).startdate, (row, value) => merge(row, extract(row).copy(startdate = value)))
  override val enddate = new OptField[TypoLocalDateTime, Row](prefix, "enddate", Some("text"), Some("timestamp"))(x => extract(x).enddate, (row, value) => merge(row, extract(row).copy(enddate = value)))
  override val unitmeasurecode = new OptField[UnitmeasureId, Row](prefix, "unitmeasurecode", None, Some("bpchar"))(x => extract(x).unitmeasurecode, (row, value) => merge(row, extract(row).copy(unitmeasurecode = value)))
  override val bomlevel = new OptField[Int, Row](prefix, "bomlevel", None, Some("int2"))(x => extract(x).bomlevel, (row, value) => merge(row, extract(row).copy(bomlevel = value)))
  override val perassemblyqty = new OptField[BigDecimal, Row](prefix, "perassemblyqty", None, Some("numeric"))(x => extract(x).perassemblyqty, (row, value) => merge(row, extract(row).copy(perassemblyqty = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, billofmaterialsid, productassemblyid, componentid, startdate, enddate, unitmeasurecode, bomlevel, perassemblyqty, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => BomViewRow, merge: (NewRow, BomViewRow) => NewRow): BomViewStructure[NewRow] =
    new BomViewStructure(prefix, extract, merge)
}
