/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

import adventureworks.Defaulted
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class UnitmeasureRowUnsaved(
  name: String,
  modifieddate: Defaulted[LocalDateTime]
)
object UnitmeasureRowUnsaved {
  implicit val oFormat: OFormat[UnitmeasureRowUnsaved] = new OFormat[UnitmeasureRowUnsaved]{
    override def writes(o: UnitmeasureRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[UnitmeasureRowUnsaved] = {
      JsResult.fromTry(
        Try(
          UnitmeasureRowUnsaved(
            name = json.\("name").as[String],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
