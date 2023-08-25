/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package scrapreason

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder

/** This class corresponds to a row in table `production.scrapreason` which has not been persisted yet */
case class ScrapreasonRowUnsaved(
  /** Failure description. */
  name: Name,
  /** Default: nextval('production.scrapreason_scrapreasonid_seq'::regclass)
      Primary key for ScrapReason records. */
  scrapreasonid: Defaulted[ScrapreasonId] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(scrapreasonidDefault: => ScrapreasonId, modifieddateDefault: => TypoLocalDateTime): ScrapreasonRow =
    ScrapreasonRow(
      name = name,
      scrapreasonid = scrapreasonid match {
                        case Defaulted.UseDefault => scrapreasonidDefault
                        case Defaulted.Provided(value) => value
                      },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ScrapreasonRowUnsaved {
  implicit lazy val decoder: Decoder[ScrapreasonRowUnsaved] = Decoder.forProduct3[ScrapreasonRowUnsaved, Name, Defaulted[ScrapreasonId], Defaulted[TypoLocalDateTime]]("name", "scrapreasonid", "modifieddate")(ScrapreasonRowUnsaved.apply)(Name.decoder, Defaulted.decoder(ScrapreasonId.decoder), Defaulted.decoder(TypoLocalDateTime.decoder))
  implicit lazy val encoder: Encoder[ScrapreasonRowUnsaved] = Encoder.forProduct3[ScrapreasonRowUnsaved, Name, Defaulted[ScrapreasonId], Defaulted[TypoLocalDateTime]]("name", "scrapreasonid", "modifieddate")(x => (x.name, x.scrapreasonid, x.modifieddate))(Name.encoder, Defaulted.encoder(ScrapreasonId.encoder), Defaulted.encoder(TypoLocalDateTime.encoder))
}
