/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package vadditionalcontactinfo

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import java.util.UUID
import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class VadditionalcontactinfoViewStructure[Row](val prefix: Option[String], val extract: Row => VadditionalcontactinfoViewRow, val merge: (Row, VadditionalcontactinfoViewRow) => Row)
  extends Relation[VadditionalcontactinfoViewFields, VadditionalcontactinfoViewRow, Row]
    with VadditionalcontactinfoViewFields[Row] { outer =>

  override val businessentityid = new OptField[BusinessentityId, Row](prefix, "businessentityid", None, Some("int4"))(x => extract(x).businessentityid, (row, value) => merge(row, extract(row).copy(businessentityid = value)))
  override val firstname = new OptField[Name, Row](prefix, "firstname", None, Some(""""public"."Name""""))(x => extract(x).firstname, (row, value) => merge(row, extract(row).copy(firstname = value)))
  override val middlename = new OptField[Name, Row](prefix, "middlename", None, Some(""""public"."Name""""))(x => extract(x).middlename, (row, value) => merge(row, extract(row).copy(middlename = value)))
  override val lastname = new OptField[Name, Row](prefix, "lastname", None, Some(""""public"."Name""""))(x => extract(x).lastname, (row, value) => merge(row, extract(row).copy(lastname = value)))
  override val telephonenumber = new OptField[TypoXml, Row](prefix, "telephonenumber", None, Some("xml"))(x => extract(x).telephonenumber, (row, value) => merge(row, extract(row).copy(telephonenumber = value)))
  override val telephonespecialinstructions = new OptField[String, Row](prefix, "telephonespecialinstructions", None, None)(x => extract(x).telephonespecialinstructions, (row, value) => merge(row, extract(row).copy(telephonespecialinstructions = value)))
  override val street = new OptField[TypoXml, Row](prefix, "street", None, Some("xml"))(x => extract(x).street, (row, value) => merge(row, extract(row).copy(street = value)))
  override val city = new OptField[TypoXml, Row](prefix, "city", None, Some("xml"))(x => extract(x).city, (row, value) => merge(row, extract(row).copy(city = value)))
  override val stateprovince = new OptField[TypoXml, Row](prefix, "stateprovince", None, Some("xml"))(x => extract(x).stateprovince, (row, value) => merge(row, extract(row).copy(stateprovince = value)))
  override val postalcode = new OptField[TypoXml, Row](prefix, "postalcode", None, Some("xml"))(x => extract(x).postalcode, (row, value) => merge(row, extract(row).copy(postalcode = value)))
  override val countryregion = new OptField[TypoXml, Row](prefix, "countryregion", None, Some("xml"))(x => extract(x).countryregion, (row, value) => merge(row, extract(row).copy(countryregion = value)))
  override val homeaddressspecialinstructions = new OptField[TypoXml, Row](prefix, "homeaddressspecialinstructions", None, Some("xml"))(x => extract(x).homeaddressspecialinstructions, (row, value) => merge(row, extract(row).copy(homeaddressspecialinstructions = value)))
  override val emailaddress = new OptField[TypoXml, Row](prefix, "emailaddress", None, Some("xml"))(x => extract(x).emailaddress, (row, value) => merge(row, extract(row).copy(emailaddress = value)))
  override val emailspecialinstructions = new OptField[String, Row](prefix, "emailspecialinstructions", None, None)(x => extract(x).emailspecialinstructions, (row, value) => merge(row, extract(row).copy(emailspecialinstructions = value)))
  override val emailtelephonenumber = new OptField[TypoXml, Row](prefix, "emailtelephonenumber", None, Some("xml"))(x => extract(x).emailtelephonenumber, (row, value) => merge(row, extract(row).copy(emailtelephonenumber = value)))
  override val rowguid = new OptField[UUID, Row](prefix, "rowguid", None, Some("uuid"))(x => extract(x).rowguid, (row, value) => merge(row, extract(row).copy(rowguid = value)))
  override val modifieddate = new OptField[TypoLocalDateTime, Row](prefix, "modifieddate", Some("text"), Some("timestamp"))(x => extract(x).modifieddate, (row, value) => merge(row, extract(row).copy(modifieddate = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](businessentityid, firstname, middlename, lastname, telephonenumber, telephonespecialinstructions, street, city, stateprovince, postalcode, countryregion, homeaddressspecialinstructions, emailaddress, emailspecialinstructions, emailtelephonenumber, rowguid, modifieddate)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => VadditionalcontactinfoViewRow, merge: (NewRow, VadditionalcontactinfoViewRow) => NewRow): VadditionalcontactinfoViewStructure[NewRow] =
    new VadditionalcontactinfoViewStructure(prefix, extract, merge)
}
