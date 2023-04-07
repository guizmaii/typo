/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package employeedepartmenthistory

import adventureworks.Defaulted
import java.time.LocalDate
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `humanresources.employeedepartmenthistory` which has not been persisted yet */
case class EmployeedepartmenthistoryRowUnsaved(
  enddate: Option[LocalDate],
  modifieddate: Defaulted[LocalDateTime]
)
object EmployeedepartmenthistoryRowUnsaved {
  implicit val oFormat: OFormat[EmployeedepartmenthistoryRowUnsaved] = new OFormat[EmployeedepartmenthistoryRowUnsaved]{
    override def writes(o: EmployeedepartmenthistoryRowUnsaved): JsObject =
      Json.obj(
        "enddate" -> o.enddate,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[EmployeedepartmenthistoryRowUnsaved] = {
      JsResult.fromTry(
        Try(
          EmployeedepartmenthistoryRowUnsaved(
            enddate = json.\("enddate").toOption.map(_.as[LocalDate]),
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
