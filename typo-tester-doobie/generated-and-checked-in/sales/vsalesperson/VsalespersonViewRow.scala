/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vsalesperson

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import adventureworks.public.Phone
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

case class VsalespersonViewRow(
  /** Points to [[person.person.PersonRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[person.person.PersonRow.title]] */
  title: Option[/* max 8 chars */ String],
  /** Points to [[person.person.PersonRow.firstname]] */
  firstname: Option[Name],
  /** Points to [[person.person.PersonRow.middlename]] */
  middlename: Option[Name],
  /** Points to [[person.person.PersonRow.lastname]] */
  lastname: Option[Name],
  /** Points to [[person.person.PersonRow.suffix]] */
  suffix: Option[/* max 10 chars */ String],
  /** Points to [[humanresources.employee.EmployeeRow.jobtitle]] */
  jobtitle: Option[/* max 50 chars */ String],
  /** Points to [[person.personphone.PersonphoneRow.phonenumber]] */
  phonenumber: Option[Phone],
  phonenumbertype: Option[Name],
  /** Points to [[person.emailaddress.EmailaddressRow.emailaddress]] */
  emailaddress: Option[/* max 50 chars */ String],
  /** Points to [[person.person.PersonRow.emailpromotion]] */
  emailpromotion: Option[Int],
  /** Points to [[person.address.AddressRow.addressline1]] */
  addressline1: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.addressline2]] */
  addressline2: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.city]] */
  city: Option[/* max 30 chars */ String],
  stateprovincename: Option[Name],
  /** Points to [[person.address.AddressRow.postalcode]] */
  postalcode: Option[/* max 15 chars */ String],
  countryregionname: Option[Name],
  territoryname: Option[Name],
  territorygroup: Option[/* max 50 chars */ String],
  /** Points to [[salesperson.SalespersonRow.salesquota]] */
  salesquota: Option[BigDecimal],
  /** Points to [[salesperson.SalespersonRow.salesytd]] */
  salesytd: Option[BigDecimal],
  /** Points to [[salesperson.SalespersonRow.saleslastyear]] */
  saleslastyear: Option[BigDecimal]
)

object VsalespersonViewRow {
  implicit val decoder: Decoder[VsalespersonViewRow] =
    (c: HCursor) =>
      for {
        businessentityid <- c.downField("businessentityid").as[Option[BusinessentityId]]
        title <- c.downField("title").as[Option[/* max 8 chars */ String]]
        firstname <- c.downField("firstname").as[Option[Name]]
        middlename <- c.downField("middlename").as[Option[Name]]
        lastname <- c.downField("lastname").as[Option[Name]]
        suffix <- c.downField("suffix").as[Option[/* max 10 chars */ String]]
        jobtitle <- c.downField("jobtitle").as[Option[/* max 50 chars */ String]]
        phonenumber <- c.downField("phonenumber").as[Option[Phone]]
        phonenumbertype <- c.downField("phonenumbertype").as[Option[Name]]
        emailaddress <- c.downField("emailaddress").as[Option[/* max 50 chars */ String]]
        emailpromotion <- c.downField("emailpromotion").as[Option[Int]]
        addressline1 <- c.downField("addressline1").as[Option[/* max 60 chars */ String]]
        addressline2 <- c.downField("addressline2").as[Option[/* max 60 chars */ String]]
        city <- c.downField("city").as[Option[/* max 30 chars */ String]]
        stateprovincename <- c.downField("stateprovincename").as[Option[Name]]
        postalcode <- c.downField("postalcode").as[Option[/* max 15 chars */ String]]
        countryregionname <- c.downField("countryregionname").as[Option[Name]]
        territoryname <- c.downField("territoryname").as[Option[Name]]
        territorygroup <- c.downField("territorygroup").as[Option[/* max 50 chars */ String]]
        salesquota <- c.downField("salesquota").as[Option[BigDecimal]]
        salesytd <- c.downField("salesytd").as[Option[BigDecimal]]
        saleslastyear <- c.downField("saleslastyear").as[Option[BigDecimal]]
      } yield VsalespersonViewRow(businessentityid, title, firstname, middlename, lastname, suffix, jobtitle, phonenumber, phonenumbertype, emailaddress, emailpromotion, addressline1, addressline2, city, stateprovincename, postalcode, countryregionname, territoryname, territorygroup, salesquota, salesytd, saleslastyear)
  implicit val encoder: Encoder[VsalespersonViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "businessentityid" := row.businessentityid,
        "title" := row.title,
        "firstname" := row.firstname,
        "middlename" := row.middlename,
        "lastname" := row.lastname,
        "suffix" := row.suffix,
        "jobtitle" := row.jobtitle,
        "phonenumber" := row.phonenumber,
        "phonenumbertype" := row.phonenumbertype,
        "emailaddress" := row.emailaddress,
        "emailpromotion" := row.emailpromotion,
        "addressline1" := row.addressline1,
        "addressline2" := row.addressline2,
        "city" := row.city,
        "stateprovincename" := row.stateprovincename,
        "postalcode" := row.postalcode,
        "countryregionname" := row.countryregionname,
        "territoryname" := row.territoryname,
        "territorygroup" := row.territorygroup,
        "salesquota" := row.salesquota,
        "salesytd" := row.salesytd,
        "saleslastyear" := row.saleslastyear
      )}
}
