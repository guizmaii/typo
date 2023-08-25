/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package shift

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoLocalTime
import adventureworks.public.Name
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

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
  implicit lazy val reads: Reads[ShiftRowUnsaved] = Reads[ShiftRowUnsaved](json => JsResult.fromTry(
      Try(
        ShiftRowUnsaved(
          name = json.\("name").as(Name.reads),
          starttime = json.\("starttime").as(TypoLocalTime.reads),
          endtime = json.\("endtime").as(TypoLocalTime.reads),
          shiftid = json.\("shiftid").as(Defaulted.reads(ShiftId.reads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ShiftRowUnsaved] = OWrites[ShiftRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "name" -> Name.writes.writes(o.name),
      "starttime" -> TypoLocalTime.writes.writes(o.starttime),
      "endtime" -> TypoLocalTime.writes.writes(o.endtime),
      "shiftid" -> Defaulted.writes(ShiftId.writes).writes(o.shiftid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
