/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package person

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.NameStyle
import adventureworks.userdefined.FirstName
import java.util.UUID
import typo.dsl.SqlExpr.Field
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.IdField
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PersonStructure[Row](val prefix: Option[String], val extract: Row => PersonRow, val merge: (Row, PersonRow) => Row)
  extends Relation[PersonFields, PersonRow, Row]
    with PersonFields[Row] { outer =>

  override val businessentityid = new IdField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val persontype = new Field[/* bpchar, max 2 chars */ String, Row](prefix, "persontype", None, Some("bpchar"))(x => extract(x).persontype, (row, value) => merge(row, extract(row).copy(persontype = value)))
  override val namestyle = new Field[NameStyle, Row](prefix, "namestyle", None, Some(""""public".NameStyle"""))(x => extract(x).namestyle, (row, value) => merge(row, extract(row).copy(namestyle = value)))
  override val title = new OptField[/* max 8 chars */ String, Row](prefix, "title", None, None)(x => extract(x).title, (row, value) => merge(row, extract(row).copy(title = value)))
  override val firstname = new Field[/* user-picked */ FirstName, Row](prefix, "firstname", None, Some(""""public"."Name""""))(x => extract(x).firstname, (row, value) => merge(row, extract(row).copy(firstname = value)))
  override val middlename = new OptField[Name, Row](prefix, "middlename", None, Some(""""public"."Name""""))(x => extract(x).middlename, (row, value) => merge(row, extract(row).copy(middlename = value)))
  override val lastname = new Field[Name, Row](prefix, "lastname", None, Some(""""public"."Name""""))(x => extract(x).lastname, (row, value) => merge(row, extract(row).copy(lastname = value)))
  override val suffix = new OptField[/* max 10 chars */ String, Row](prefix, "suffix", None, None)(x => extract(x).suffix, (row, value) => merge(row, extract(row).copy(suffix = value)))
  override val emailpromotion = new Field[Int, Row](prefix, "emailpromotion", None, Some("int4"))(x => extract(x).emailpromotion, (row, value) => merge(row, extract(row).copy(emailpromotion = value)))
  override val additionalcontactinfo = new OptField[TypoXml, Row](prefix, "additionalcontactinfo", None, Some("xml"))(x => extract(x).additionalcontactinfo, (row, value) => merge(row, extract(row).copy(additionalcontactinfo = value)))
  override val demographics = new OptField[TypoXml, Row](prefix, "demographics", None, Some("xml"))(x => extract(x).demographics, (row, value) => merge(row, extract(row).copy(demographics = value)))
  override val rowguid = new Field[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new Field[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](businessentityid, persontype, namestyle, title, firstname, middlename, lastname, suffix, emailpromotion, additionalcontactinfo, demographics, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PersonRow, merge: (NewRow, PersonRow) => NewRow): PersonStructure[NewRow] =
    new PersonStructure(prefix, extract, merge)
}
