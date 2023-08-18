/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package culture

import adventureworks.public.Name
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.culture` which has not been persisted yet */
case class CultureRowUnsaved(
  /** Primary key for Culture records. */
  cultureid: CultureId,
  /** Culture description. */
  name: Name,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(modifieddateDefault: => TypoLocalDateTime): CultureRow =
    CultureRow(
      cultureid = cultureid,
      name = name,
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object CultureRowUnsaved {
  implicit lazy val reads: Reads[CultureRowUnsaved] = Reads[CultureRowUnsaved](json => JsResult.fromTry(
      Try(
        CultureRowUnsaved(
          cultureid = json.\("cultureid").as(CultureId.reads),
          name = json.\("name").as(Name.reads),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[CultureRowUnsaved] = OWrites[CultureRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "cultureid" -> CultureId.writes.writes(o.cultureid),
      "name" -> Name.writes.writes(o.name),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
