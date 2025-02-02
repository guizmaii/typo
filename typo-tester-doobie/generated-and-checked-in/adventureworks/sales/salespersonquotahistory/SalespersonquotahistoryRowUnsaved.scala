/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salespersonquotahistory

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoUUID
import adventureworks.person.businessentity.BusinessentityId
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `sales.salespersonquotahistory` which has not been persisted yet */
case class SalespersonquotahistoryRowUnsaved(
  /** Sales person identification number. Foreign key to SalesPerson.BusinessEntityID.
      Points to [[salesperson.SalespersonRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Sales quota date. */
  quotadate: TypoLocalDateTime,
  /** Sales quota amount.
      Constraint CK_SalesPersonQuotaHistory_SalesQuota affecting columns "salesquota":  ((salesquota > 0.00)) */
  salesquota: BigDecimal,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[TypoUUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(rowguidDefault: => TypoUUID, modifieddateDefault: => TypoLocalDateTime): SalespersonquotahistoryRow =
    SalespersonquotahistoryRow(
      businessentityid = businessentityid,
      quotadate = quotadate,
      salesquota = salesquota,
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
object SalespersonquotahistoryRowUnsaved {
  implicit lazy val decoder: Decoder[SalespersonquotahistoryRowUnsaved] = Decoder.forProduct5[SalespersonquotahistoryRowUnsaved, BusinessentityId, TypoLocalDateTime, BigDecimal, Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("businessentityid", "quotadate", "salesquota", "rowguid", "modifieddate")(SalespersonquotahistoryRowUnsaved.apply)(BusinessentityId.decoder, TypoLocalDateTime.decoder, Decoder.decodeBigDecimal, Defaulted.decoder(TypoUUID.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[SalespersonquotahistoryRowUnsaved] = Encoder.forProduct5[SalespersonquotahistoryRowUnsaved, BusinessentityId, TypoLocalDateTime, BigDecimal, Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("businessentityid", "quotadate", "salesquota", "rowguid", "modifieddate")(x => (x.businessentityid, x.quotadate, x.salesquota, x.rowguid, x.modifieddate))(BusinessentityId.encoder, TypoLocalDateTime.encoder, Encoder.encodeBigDecimal, Defaulted.encoder(TypoUUID.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
