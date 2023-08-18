/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package s

import adventureworks.humanresources.shift.ShiftId
import adventureworks.public.Name
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SViewStructure[Row](val prefix: Option[String], val extract: Row => SViewRow, val merge: (Row, SViewRow) => Row)
  extends Relation[SViewFields, SViewRow, Row]
    with SViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val shiftid = new OptField[ShiftId, Row](prefix, "shiftid", None, Some("int4"))(x => extract(x).shiftid, (row, value) => merge(row, extract(row).copy(shiftid = value)))
  override val name = new OptField[Name, Row](prefix, "name", None, Some(""""public"."Name""""))(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val starttime = new OptField[TypoLocalTime, Row](prefix, "starttime", Some("text"), Some("time"))(x => extract(x).starttime, (row, value) => merge(row, extract(row).copy(starttime = value)))
  override val endtime = new OptField[TypoLocalTime, Row](prefix, "endtime", Some("text"), Some("time"))(x => extract(x).endtime, (row, value) => merge(row, extract(row).copy(endtime = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, shiftid, name, starttime, endtime, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SViewRow, merge: (NewRow, SViewRow) => NewRow): SViewStructure[NewRow] =
    new SViewStructure(prefix, extract, merge)
}
