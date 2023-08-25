/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package illustration

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `production.illustration` which has not been persisted yet */
case class IllustrationRowUnsaved(
  /** Illustrations used in manufacturing instructions. Stored as XML. */
  diagram: Option[TypoXml],
  /** Default: nextval('production.illustration_illustrationid_seq'::regclass)
      Primary key for Illustration records. */
  illustrationid: Defaulted[IllustrationId] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(illustrationidDefault: => IllustrationId, modifieddateDefault: => TypoLocalDateTime): IllustrationRow =
    IllustrationRow(
      diagram = diagram,
      illustrationid = illustrationid match {
                         case Defaulted.UseDefault => illustrationidDefault
                         case Defaulted.Provided(value) => value
                       },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object IllustrationRowUnsaved {
  implicit lazy val reads: Reads[IllustrationRowUnsaved] = Reads[IllustrationRowUnsaved](json => JsResult.fromTry(
      Try(
        IllustrationRowUnsaved(
          diagram = json.\("diagram").toOption.map(_.as(TypoXml.reads)),
          illustrationid = json.\("illustrationid").as(Defaulted.reads(IllustrationId.reads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[IllustrationRowUnsaved] = OWrites[IllustrationRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "diagram" -> Writes.OptionWrites(TypoXml.writes).writes(o.diagram),
      "illustrationid" -> Defaulted.writes(IllustrationId.writes).writes(o.illustrationid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
