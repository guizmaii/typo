/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package l

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.location.LocationId
import adventureworks.public.Name
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.Structure.Relation

class LViewStructure[Row](val prefix: Option[String], val extract: Row => LViewRow, val merge: (Row, LViewRow) => Row)
  extends Relation[LViewFields, LViewRow, Row]
    with LViewFields[Row] { outer =>

  override val id = new Field[LocationId, Row](prefix, "id", None, None)(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val locationid = new Field[LocationId, Row](prefix, "locationid", None, None)(x => extract(x).locationid, (row, value) => merge(row, extract(row).copy(locationid = value)))
  override val name = new Field[Name, Row](prefix, "name", None, None)(x => extract(x).name, (row, value) => merge(row, extract(row).copy(name = value)))
  override val costrate = new Field[BigDecimal, Row](prefix, "costrate", None, None)(x => extract(x).costrate, (row, value) => merge(row, extract(row).copy(costrate = value)))
  override val availability = new Field[BigDecimal, Row](prefix, "availability", None, None)(x => extract(x).availability, (row, value) => merge(row, extract(row).copy(availability = value)))
  override val modifieddate = new Field[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), None)(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, locationid, name, costrate, availability, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => LViewRow, merge: (NewRow, LViewRow) => NewRow): LViewStructure[NewRow] =
    new LViewStructure(prefix, extract, merge)
}
