/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vemployeedepartment

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class VemployeedepartmentViewStructure[Row](val prefix: Option[String], val extract: Row => VemployeedepartmentViewRow, val merge: (Row, VemployeedepartmentViewRow) => Row)
  extends Relation[VemployeedepartmentViewFields, VemployeedepartmentViewRow, Row]
    with VemployeedepartmentViewFields[Row] { outer =>

  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val title = new OptField[/* max 8 chars */ String, Row](prefix, "title", None, None)(x => extract(x).title, (row, value) => merge(row, extract(row).copy(title = value)))
  override val firstname = new OptField[Name, Row](prefix, "firstname", None, Some(""""public"."Name""""))(x => extract(x).firstname, (row, value) => merge(row, extract(row).copy(firstname = value)))
  override val middlename = new OptField[Name, Row](prefix, "middlename", None, Some(""""public"."Name""""))(x => extract(x).middlename, (row, value) => merge(row, extract(row).copy(middlename = value)))
  override val lastname = new OptField[Name, Row](prefix, "lastname", None, Some(""""public"."Name""""))(x => extract(x).lastname, (row, value) => merge(row, extract(row).copy(lastname = value)))
  override val suffix = new OptField[/* max 10 chars */ String, Row](prefix, "suffix", None, None)(x => extract(x).suffix, (row, value) => merge(row, extract(row).copy(suffix = value)))
  override val jobtitle = new OptField[/* max 50 chars */ String, Row](prefix, "jobtitle", None, None)(x => extract(x).jobtitle, (row, value) => merge(row, extract(row).copy(jobtitle = value)))
  override val department = new OptField[Name, Row](prefix, "department", None, Some(""""public"."Name""""))(x => extract(x).department, (row, value) => merge(row, extract(row).copy(department = value)))
  override val groupname = new OptField[Name, Row](prefix, "groupname", None, Some(""""public"."Name""""))(x => extract(x).groupname, (row, value) => merge(row, extract(row).copy(groupname = value)))
  override val startdate = new OptField[TypoLocalDate, Row](prefix, "startdate", Some("text"), Some("date"))(x => extract(x).startdate, (row, value) => merge(row, extract(row).copy(startdate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](businessentityid, title, firstname, middlename, lastname, suffix, jobtitle, department, groupname, startdate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => VemployeedepartmentViewRow, merge: (NewRow, VemployeedepartmentViewRow) => NewRow): VemployeedepartmentViewStructure[NewRow] =
    new VemployeedepartmentViewStructure(prefix, extract, merge)
}
