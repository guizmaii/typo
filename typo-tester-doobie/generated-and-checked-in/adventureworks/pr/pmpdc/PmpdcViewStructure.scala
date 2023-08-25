/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pmpdc

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PmpdcViewStructure[Row](val prefix: Option[String], val extract: Row => PmpdcViewRow, val merge: (Row, PmpdcViewRow) => Row)
  extends Relation[PmpdcViewFields, PmpdcViewRow, Row]
    with PmpdcViewFields[Row] { outer =>

  override val productmodelid = new OptField[ProductmodelId, Row](prefix, "productmodelid", None, Some("int4"))(x => extract(x).productmodelid, (row, value) => merge(row, extract(row).copy(productmodelid = value)))
  override val productdescriptionid = new OptField[ProductdescriptionId, Row](prefix, "productdescriptionid", None, Some("int4"))(x => extract(x).productdescriptionid, (row, value) => merge(row, extract(row).copy(productdescriptionid = value)))
  override val cultureid = new OptField[CultureId, Row](prefix, "cultureid", None, Some("bpchar"))(x => extract(x).cultureid, (row, value) => merge(row, extract(row).copy(cultureid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](productmodelid, productdescriptionid, cultureid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PmpdcViewRow, merge: (NewRow, PmpdcViewRow) => NewRow): PmpdcViewStructure[NewRow] =
    new PmpdcViewStructure(prefix, extract, merge)
}
