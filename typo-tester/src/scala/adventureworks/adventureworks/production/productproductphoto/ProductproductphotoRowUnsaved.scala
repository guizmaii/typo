/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productproductphoto

import adventureworks.Defaulted
import adventureworks.public.FlagDomain
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `production.productproductphoto` which has not been persisted yet */
case class ProductproductphotoRowUnsaved(
  primary: Defaulted[FlagDomain],
  modifieddate: Defaulted[LocalDateTime]
)
object ProductproductphotoRowUnsaved {
  implicit val oFormat: OFormat[ProductproductphotoRowUnsaved] = new OFormat[ProductproductphotoRowUnsaved]{
    override def writes(o: ProductproductphotoRowUnsaved): JsObject =
      Json.obj(
        "primary" -> o.primary,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductproductphotoRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductproductphotoRowUnsaved(
            primary = json.\("primary").as[Defaulted[FlagDomain]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
