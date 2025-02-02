/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package shipmethod

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoUUID
import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `purchasing.shipmethod` which has not been persisted yet */
case class ShipmethodRowUnsaved(
  /** Shipping company name. */
  name: Name,
  /** Default: nextval('purchasing.shipmethod_shipmethodid_seq'::regclass)
      Primary key for ShipMethod records. */
  shipmethodid: Defaulted[ShipmethodId] = Defaulted.UseDefault,
  /** Default: 0.00
      Minimum shipping charge.
      Constraint CK_ShipMethod_ShipBase affecting columns "shipbase":  ((shipbase > 0.00)) */
  shipbase: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Shipping charge per pound.
      Constraint CK_ShipMethod_ShipRate affecting columns "shiprate":  ((shiprate > 0.00)) */
  shiprate: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[TypoUUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(shipmethodidDefault: => ShipmethodId, shipbaseDefault: => BigDecimal, shiprateDefault: => BigDecimal, rowguidDefault: => TypoUUID, modifieddateDefault: => TypoLocalDateTime): ShipmethodRow =
    ShipmethodRow(
      name = name,
      shipmethodid = shipmethodid match {
                       case Defaulted.UseDefault => shipmethodidDefault
                       case Defaulted.Provided(value) => value
                     },
      shipbase = shipbase match {
                   case Defaulted.UseDefault => shipbaseDefault
                   case Defaulted.Provided(value) => value
                 },
      shiprate = shiprate match {
                   case Defaulted.UseDefault => shiprateDefault
                   case Defaulted.Provided(value) => value
                 },
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
object ShipmethodRowUnsaved {
  implicit lazy val decoder: Decoder[ShipmethodRowUnsaved] = Decoder.forProduct6[ShipmethodRowUnsaved, Name, Defaulted[ShipmethodId], Defaulted[BigDecimal], Defaulted[BigDecimal], Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("name", "shipmethodid", "shipbase", "shiprate", "rowguid", "modifieddate")(ShipmethodRowUnsaved.apply)(Name.decoder, Defaulted.decoder(ShipmethodId.decoder), Defaulted.decoder(Decoder.decodeBigDecimal), Defaulted.decoder(Decoder.decodeBigDecimal), Defaulted.decoder(TypoUUID.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[ShipmethodRowUnsaved] = Encoder.forProduct6[ShipmethodRowUnsaved, Name, Defaulted[ShipmethodId], Defaulted[BigDecimal], Defaulted[BigDecimal], Defaulted[TypoUUID], Defaulted[TypoLocalDateTime]]("name", "shipmethodid", "shipbase", "shiprate", "rowguid", "modifieddate")(x => (x.name, x.shipmethodid, x.shipbase, x.shiprate, x.rowguid, x.modifieddate))(Name.encoder, Defaulted.encoder(ShipmethodId.encoder), Defaulted.encoder(Encoder.encodeBigDecimal), Defaulted.encoder(Encoder.encodeBigDecimal), Defaulted.encoder(TypoUUID.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
