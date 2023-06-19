/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vvendorwithaddresses

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json

case class VvendorwithaddressesViewRow(
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[person.stateprovince.StateprovinceRow.name]] */
  name: Option[Name],
  addresstype: Option[Name],
  /** Points to [[person.address.AddressRow.addressline1]] */
  addressline1: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.addressline2]] */
  addressline2: Option[/* max 60 chars */ String],
  /** Points to [[person.address.AddressRow.city]] */
  city: Option[/* max 30 chars */ String],
  stateprovincename: Option[Name],
  /** Points to [[person.address.AddressRow.postalcode]] */
  postalcode: Option[/* max 15 chars */ String],
  countryregionname: Option[Name]
)

object VvendorwithaddressesViewRow {
  implicit val decoder: Decoder[VvendorwithaddressesViewRow] =
    (c: HCursor) =>
      for {
        businessentityid <- c.downField("businessentityid").as[Option[BusinessentityId]]
        name <- c.downField("name").as[Option[Name]]
        addresstype <- c.downField("addresstype").as[Option[Name]]
        addressline1 <- c.downField("addressline1").as[Option[/* max 60 chars */ String]]
        addressline2 <- c.downField("addressline2").as[Option[/* max 60 chars */ String]]
        city <- c.downField("city").as[Option[/* max 30 chars */ String]]
        stateprovincename <- c.downField("stateprovincename").as[Option[Name]]
        postalcode <- c.downField("postalcode").as[Option[/* max 15 chars */ String]]
        countryregionname <- c.downField("countryregionname").as[Option[Name]]
      } yield VvendorwithaddressesViewRow(businessentityid, name, addresstype, addressline1, addressline2, city, stateprovincename, postalcode, countryregionname)
  implicit val encoder: Encoder[VvendorwithaddressesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "businessentityid" := row.businessentityid,
        "name" := row.name,
        "addresstype" := row.addresstype,
        "addressline1" := row.addressline1,
        "addressline2" := row.addressline2,
        "city" := row.city,
        "stateprovincename" := row.stateprovincename,
        "postalcode" := row.postalcode,
        "countryregionname" := row.countryregionname
      )}
}
