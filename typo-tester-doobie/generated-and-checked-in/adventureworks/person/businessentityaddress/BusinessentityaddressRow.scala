/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentityaddress

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoUUID
import adventureworks.person.address.AddressId
import adventureworks.person.addresstype.AddresstypeId
import adventureworks.person.businessentity.BusinessentityId
import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class BusinessentityaddressRow(
  /** Primary key. Foreign key to BusinessEntity.BusinessEntityID.
      Points to [[businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Primary key. Foreign key to Address.AddressID.
      Points to [[address.AddressRow.addressid]] */
  addressid: AddressId,
  /** Primary key. Foreign key to AddressType.AddressTypeID.
      Points to [[addresstype.AddresstypeRow.addresstypeid]] */
  addresstypeid: AddresstypeId,
  rowguid: TypoUUID,
  modifieddate: TypoLocalDateTime
){
   val compositeId: BusinessentityaddressId = BusinessentityaddressId(businessentityid, addressid, addresstypeid)
 }

object BusinessentityaddressRow {
  implicit lazy val decoder: Decoder[BusinessentityaddressRow] = Decoder.forProduct5[BusinessentityaddressRow, BusinessentityId, AddressId, AddresstypeId, TypoUUID, TypoLocalDateTime]("businessentityid", "addressid", "addresstypeid", "rowguid", "modifieddate")(BusinessentityaddressRow.apply)(BusinessentityId.decoder, AddressId.decoder, AddresstypeId.decoder, TypoUUID.decoder, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[BusinessentityaddressRow] = Encoder.forProduct5[BusinessentityaddressRow, BusinessentityId, AddressId, AddresstypeId, TypoUUID, TypoLocalDateTime]("businessentityid", "addressid", "addresstypeid", "rowguid", "modifieddate")(x => (x.businessentityid, x.addressid, x.addresstypeid, x.rowguid, x.modifieddate))(BusinessentityId.encoder, AddressId.encoder, AddresstypeId.encoder, TypoUUID.encoder, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[BusinessentityaddressRow] = new Read[BusinessentityaddressRow](
    gets = List(
      (BusinessentityId.get, Nullability.NoNulls),
      (AddressId.get, Nullability.NoNulls),
      (AddresstypeId.get, Nullability.NoNulls),
      (TypoUUID.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => BusinessentityaddressRow(
      businessentityid = BusinessentityId.get.unsafeGetNonNullable(rs, i + 0),
      addressid = AddressId.get.unsafeGetNonNullable(rs, i + 1),
      addresstypeid = AddresstypeId.get.unsafeGetNonNullable(rs, i + 2),
      rowguid = TypoUUID.get.unsafeGetNonNullable(rs, i + 3),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 4)
    )
  )
}
