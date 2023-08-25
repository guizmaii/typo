/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package sm

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import adventureworks.purchasing.shipmethod.ShipmethodId
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class SmViewStructure[Row](val prefix: Option[String], val extract: Row => SmViewRow, val merge: (Row, SmViewRow) => Row)
  extends Relation[SmViewFields, SmViewRow, Row]
    with SmViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val shipmethodid = new OptField[ShipmethodId, Row](prefix, "shipmethodid", None, Some("int4"))(x => extract(x).shipmethodid, (row, value) => merge(row, extract(row).copy(shipmethodid = value)))
  override val name = new OptField[Name, Row](prefix, "name", None, Some(""""public"."Name""""))(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val shipbase = new OptField[BigDecimal, Row](prefix, "shipbase", None, Some("numeric"))(x => extract(x).shipbase, (row, value) => merge(row, extract(row).copy(shipbase = value)))
  override val shiprate = new OptField[BigDecimal, Row](prefix, "shiprate", None, Some("numeric"))(x => extract(x).shiprate, (row, value) => merge(row, extract(row).copy(shiprate = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, shipmethodid, name, shipbase, shiprate, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => SmViewRow, merge: (NewRow, SmViewRow) => NewRow): SmViewStructure[NewRow] =
    new SmViewStructure(prefix, extract, merge)
}
