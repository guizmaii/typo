/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheadersalesreason

import adventureworks.Defaulted
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class SalesorderheadersalesreasonRowUnsaved(
  modifieddate: Defaulted[LocalDateTime]
)
object SalesorderheadersalesreasonRowUnsaved {
  implicit val oFormat: OFormat[SalesorderheadersalesreasonRowUnsaved] = new OFormat[SalesorderheadersalesreasonRowUnsaved]{
    override def writes(o: SalesorderheadersalesreasonRowUnsaved): JsObject =
      Json.obj(
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SalesorderheadersalesreasonRowUnsaved] = {
      JsResult.fromTry(
        Try(
          SalesorderheadersalesreasonRowUnsaved(
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
