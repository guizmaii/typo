/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package personcreditcard

import adventureworks.Defaulted
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PersoncreditcardRowUnsaved(
  modifieddate: Defaulted[LocalDateTime]
)
object PersoncreditcardRowUnsaved {
  implicit val oFormat: OFormat[PersoncreditcardRowUnsaved] = new OFormat[PersoncreditcardRowUnsaved]{
    override def writes(o: PersoncreditcardRowUnsaved): JsObject =
      Json.obj(
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[PersoncreditcardRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PersoncreditcardRowUnsaved(
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
