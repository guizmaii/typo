/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pp

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.phonenumbertype.PhonenumbertypeId
import adventureworks.public.Phone
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.Structure.Relation

class PpViewStructure[Row](val prefix: Option[String], val extract: Row => PpViewRow, val merge: (Row, PpViewRow) => Row)
  extends Relation[PpViewFields, PpViewRow, Row]
    with PpViewFields[Row] { outer =>

  override val id = new Field[BusinessentityId, Row](prefix, "id", None, None)(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val businessentityid = new Field[BusinessentityId, Row](prefix, "businessentityid", None, None)(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val phonenumber = new Field[Phone, Row](prefix, "phonenumber", None, None)(x => extract(x).phonenumber, (row, value) => merge(row, extract(row).copy(phonenumber = value)))
  override val phonenumbertypeid = new Field[PhonenumbertypeId, Row](prefix, "phonenumbertypeid", None, None)(x => extract(x).phonenumbertypeid, (row, value) => merge(row, extract(row).copy(phonenumbertypeid = value)))
  override val modifieddate = new Field[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), None)(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, businessentityid, phonenumber, phonenumbertypeid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PpViewRow, merge: (NewRow, PpViewRow) => NewRow): PpViewStructure[NewRow] =
    new PpViewStructure(prefix, extract, merge)
}
