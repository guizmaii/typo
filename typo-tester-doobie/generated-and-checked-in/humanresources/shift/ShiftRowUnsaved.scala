/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package shift

import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `humanresources.shift` which has not been persisted yet */
case class ShiftRowUnsaved(
  /** Shift description. */
  name: Name,
  /** Shift start time. */
  starttime: TypoLocalTime,
  /** Shift end time. */
  endtime: TypoLocalTime,
  /** Default: nextval('humanresources.shift_shiftid_seq'::regclass)
      Primary key for Shift records. */
  shiftid: Defaulted[ShiftId] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(shiftidDefault: => ShiftId, modifieddateDefault: => TypoLocalDateTime): ShiftRow =
    ShiftRow(
      name = name,
      starttime = starttime,
      endtime = endtime,
      shiftid = shiftid match {
                  case Defaulted.UseDefault => shiftidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ShiftRowUnsaved {
  implicit lazy val decoder: Decoder[ShiftRowUnsaved] = Decoder.forProduct5[ShiftRowUnsaved, Name, TypoLocalTime, TypoLocalTime, Defaulted[ShiftId], Defaulted[TypoLocalDateTime]]("name", "starttime", "endtime", "shiftid", "modifieddate")(ShiftRowUnsaved.apply)(Name.decoder, TypoLocalTime.decoder, TypoLocalTime.decoder, Defaulted.decoder(ShiftId.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[ShiftRowUnsaved] = Encoder.forProduct5[ShiftRowUnsaved, Name, TypoLocalTime, TypoLocalTime, Defaulted[ShiftId], Defaulted[TypoLocalDateTime]]("name", "starttime", "endtime", "shiftid", "modifieddate")(x => (x.name, x.starttime, x.endtime, x.shiftid, x.modifieddate))(Name.encoder, TypoLocalTime.encoder, TypoLocalTime.encoder, Defaulted.encoder(ShiftId.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
