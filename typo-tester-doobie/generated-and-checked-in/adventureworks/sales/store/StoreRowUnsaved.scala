/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package store

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder
import java.util.UUID

/** This class corresponds to a row in table `sales.store` which has not been persisted yet */
case class StoreRowUnsaved(
  /** Primary key. Foreign key to Customer.BusinessEntityID.
      Points to [[person.businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Name of the store. */
  name: Name,
  /** ID of the sales person assigned to the customer. Foreign key to SalesPerson.BusinessEntityID.
      Points to [[salesperson.SalespersonRow.businessentityid]] */
  salespersonid: Option[BusinessentityId],
  /** Demographic informationg about the store such as the number of employees, annual sales and store type. */
  demographics: Option[TypoXml],
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): StoreRow =
    StoreRow(
      businessentityid = businessentityid,
      name = name,
      salespersonid = salespersonid,
      demographics = demographics,
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object StoreRowUnsaved {
  implicit lazy val decoder: Decoder[StoreRowUnsaved] = Decoder.forProduct6[StoreRowUnsaved, BusinessentityId, Name, Option[BusinessentityId], Option[TypoXml], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("businessentityid", "name", "salespersonid", "demographics", "rowguid", "modifieddate")(StoreRowUnsaved.apply)(BusinessentityId.decoder, Name.decoder, Decoder.decodeOption(BusinessentityId.decoder), Decoder.decodeOption(TypoXml.decoder), Defaulted.decoder(Decoder.decodeUUID), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[StoreRowUnsaved] = Encoder.forProduct6[StoreRowUnsaved, BusinessentityId, Name, Option[BusinessentityId], Option[TypoXml], Defaulted[UUID], Defaulted[TypoLocalDateTime]]("businessentityid", "name", "salespersonid", "demographics", "rowguid", "modifieddate")(x => (x.businessentityid, x.name, x.salespersonid, x.demographics, x.rowguid, x.modifieddate))(BusinessentityId.encoder, Name.encoder, Encoder.encodeOption(BusinessentityId.encoder), Encoder.encodeOption(TypoXml.encoder), Defaulted.encoder(Encoder.encodeUUID), Defaulted.encoder(TypoLocalDateTime.encoder))
}
