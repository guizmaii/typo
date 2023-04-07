/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package personphone

import adventureworks.Defaulted
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `person.personphone` which has not been persisted yet */
case class PersonphoneRowUnsaved(
  modifieddate: Defaulted[LocalDateTime]
)
object PersonphoneRowUnsaved {
  implicit val oFormat: OFormat[PersonphoneRowUnsaved] = new OFormat[PersonphoneRowUnsaved]{
    override def writes(o: PersonphoneRowUnsaved): JsObject =
      Json.obj(
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PersonphoneRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PersonphoneRowUnsaved(
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
