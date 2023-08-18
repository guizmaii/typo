/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pp

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.phonenumbertype.PhonenumbertypeId
import adventureworks.public.Phone
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PpViewStructure[Row](val prefix: Option[String], val extract: Row => PpViewRow, val merge: (Row, PpViewRow) => Row)
  extends Relation[PpViewFields, PpViewRow, Row]
    with PpViewFields[Row] { outer =>

  override val id = new OptField[Int, Row](prefix, "id", None, Some("int4"))(x => extract(x).id, (row, value) => merge(row, extract(row).copy(id = value)))
  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val phonenumber = new OptField[Phone, Row](prefix, "phonenumber", None, Some(""""public".Phone"""))(x => extract(x).phonenumber, (row, value) => merge(row, extract(row).copy(phonenumber = value)))
  override val phonenumbertypeid = new OptField[PhonenumbertypeId, Row](prefix, "phonenumbertypeid", None, Some("int4"))(x => extract(x).phonenumbertypeid, (row, value) => merge(row, extract(row).copy(phonenumbertypeid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](id, businessentityid, phonenumber, phonenumbertypeid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PpViewRow, merge: (NewRow, PpViewRow) => NewRow): PpViewStructure[NewRow] =
    new PpViewStructure(prefix, extract, merge)
}
