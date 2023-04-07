/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package workorderrouting

import adventureworks.Defaulted
import adventureworks.production.location.LocationId
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class WorkorderroutingRowUnsaved(
  locationid: LocationId,
  scheduledstartdate: LocalDateTime,
  scheduledenddate: LocalDateTime,
  actualstartdate: Option[LocalDateTime],
  actualenddate: Option[LocalDateTime],
  actualresourcehrs: Option[BigDecimal],
  plannedcost: BigDecimal,
  actualcost: Option[BigDecimal],
  modifieddate: Defaulted[LocalDateTime]
)
object WorkorderroutingRowUnsaved {
  implicit val oFormat: OFormat[WorkorderroutingRowUnsaved] = new OFormat[WorkorderroutingRowUnsaved]{
    override def writes(o: WorkorderroutingRowUnsaved): JsObject =
      Json.obj(
        "locationid" -> o.locationid,
        "scheduledstartdate" -> o.scheduledstartdate,
        "scheduledenddate" -> o.scheduledenddate,
        "actualstartdate" -> o.actualstartdate,
        "actualenddate" -> o.actualenddate,
        "actualresourcehrs" -> o.actualresourcehrs,
        "plannedcost" -> o.plannedcost,
        "actualcost" -> o.actualcost,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[WorkorderroutingRowUnsaved] = {
      JsResult.fromTry(
        Try(
          WorkorderroutingRowUnsaved(
            locationid = json.\("locationid").as[LocationId],
            scheduledstartdate = json.\("scheduledstartdate").as[LocalDateTime],
            scheduledenddate = json.\("scheduledenddate").as[LocalDateTime],
            actualstartdate = json.\("actualstartdate").toOption.map(_.as[LocalDateTime]),
            actualenddate = json.\("actualenddate").toOption.map(_.as[LocalDateTime]),
            actualresourcehrs = json.\("actualresourcehrs").toOption.map(_.as[BigDecimal]),
            plannedcost = json.\("plannedcost").as[BigDecimal],
            actualcost = json.\("actualcost").toOption.map(_.as[BigDecimal]),
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
