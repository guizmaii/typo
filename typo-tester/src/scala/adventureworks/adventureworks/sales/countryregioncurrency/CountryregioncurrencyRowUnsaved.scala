/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package countryregioncurrency

import adventureworks.Defaulted
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `sales.countryregioncurrency` which has not been persisted yet */
case class CountryregioncurrencyRowUnsaved(
  modifieddate: Defaulted[LocalDateTime]
)
object CountryregioncurrencyRowUnsaved {
  implicit val oFormat: OFormat[CountryregioncurrencyRowUnsaved] = new OFormat[CountryregioncurrencyRowUnsaved]{
    override def writes(o: CountryregioncurrencyRowUnsaved): JsObject =
      Json.obj(
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[CountryregioncurrencyRowUnsaved] = {
      JsResult.fromTry(
        Try(
          CountryregioncurrencyRowUnsaved(
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
