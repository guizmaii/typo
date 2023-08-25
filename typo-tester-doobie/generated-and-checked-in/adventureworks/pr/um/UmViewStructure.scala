/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package um

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.unitmeasure.UnitmeasureId
import adventureworks.public.Name
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class UmViewStructure[Row](val prefix: Option[String], val extract: Row => UmViewRow, val merge: (Row, UmViewRow) => Row)
  extends Relation[UmViewFields, UmViewRow, Row]
    with UmViewFields[Row] { outer =>

  override val id = new OptField[/* bpchar, max 3 chars */ String, Row](prefix, "id", None, Some("bpchar"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val unitmeasurecode = new OptField[UnitmeasureId, Row](prefix, "unitmeasurecode", None, Some("bpchar"))(x => extract(x).unitmeasurecode, (row, value) => merge(row, extract(row).copy(unitmeasurecode = value)))
  override val name = new OptField[Name, Row](prefix, "name", None, Some(""""public"."Name""""))(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, unitmeasurecode, name, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => UmViewRow, merge: (NewRow, UmViewRow) => NewRow): UmViewStructure[NewRow] =
    new UmViewStructure(prefix, extract, merge)
}
