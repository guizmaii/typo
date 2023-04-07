/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesreason

import adventureworks.Defaulted
import adventureworks.public.NameDomain
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `sales.salesreason` which has not been persisted yet */
case class SalesreasonRowUnsaved(
  name: NameDomain,
  reasontype: NameDomain,
  modifieddate: Defaulted[LocalDateTime]
)
object SalesreasonRowUnsaved {
  implicit val oFormat: OFormat[SalesreasonRowUnsaved] = new OFormat[SalesreasonRowUnsaved]{
    override def writes(o: SalesreasonRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "reasontype" -> o.reasontype,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SalesreasonRowUnsaved] = {
      JsResult.fromTry(
        Try(
          SalesreasonRowUnsaved(
            name = json.\("name").as[NameDomain],
            reasontype = json.\("reasontype").as[NameDomain],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
