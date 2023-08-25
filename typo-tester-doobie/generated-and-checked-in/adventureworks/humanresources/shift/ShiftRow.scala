/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package shift

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoLocalTime
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class ShiftRow(
  /** Primary key for Shift records. */
  shiftid: ShiftId,
  /** Shift description. */
  name: Name,
  /** Shift start time. */
  starttime: TypoLocalTime,
  /** Shift end time. */
  endtime: TypoLocalTime,
  modifieddate: TypoLocalDateTime
)

object ShiftRow {
  implicit lazy val decoder: Decoder[ShiftRow] = Decoder.forProduct5[ShiftRow, ShiftId, Name, TypoLocalTime, TypoLocalTime, TypoLocalDateTime]("shiftid", "name", "starttime", "endtime", "modifieddate")(ShiftRow.apply)(ShiftId.decoder, Name.decoder, TypoLocalTime.decoder, TypoLocalTime.decoder, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[ShiftRow] = Encoder.forProduct5[ShiftRow, ShiftId, Name, TypoLocalTime, TypoLocalTime, TypoLocalDateTime]("shiftid", "name", "starttime", "endtime", "modifieddate")(x => (x.shiftid, x.name, x.starttime, x.endtime, x.modifieddate))(ShiftId.encoder, Name.encoder, TypoLocalTime.encoder, TypoLocalTime.encoder, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[ShiftRow] = new Read[ShiftRow](
    gets = List(
      (ShiftId.get, Nullability.NoNulls),
      (Name.get, Nullability.NoNulls),
      (TypoLocalTime.get, Nullability.NoNulls),
      (TypoLocalTime.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ShiftRow(
      shiftid = ShiftId.get.unsafeGetNonNullable(rs, i + 0),
      name = Name.get.unsafeGetNonNullable(rs, i + 1),
      starttime = TypoLocalTime.get.unsafeGetNonNullable(rs, i + 2),
      endtime = TypoLocalTime.get.unsafeGetNonNullable(rs, i + 3),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 4)
    )
  )
}
