/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vsalespersonsalesbyfiscalyearsdata

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VsalespersonsalesbyfiscalyearsdataViewRow(
  /** Points to [[salesorderheader.SalesorderheaderRow.salespersonid]] */
  salespersonid: Option[BusinessentityId],
  fullname: Option[String],
  /** Points to [[humanresources.employee.EmployeeRow.jobtitle]] */
  jobtitle: Option[/* max 50 chars */ String],
  salesterritory: Option[Name],
  salestotal: Option[BigDecimal],
  fiscalyear: Option[BigDecimal]
)

object VsalespersonsalesbyfiscalyearsdataViewRow {
  implicit val oFormat: OFormat[VsalespersonsalesbyfiscalyearsdataViewRow] = new OFormat[VsalespersonsalesbyfiscalyearsdataViewRow]{
    override def writes(o: VsalespersonsalesbyfiscalyearsdataViewRow): JsObject =
      Json.obj(
        "salespersonid" -> o.salespersonid,
        "fullname" -> o.fullname,
        "jobtitle" -> o.jobtitle,
        "salesterritory" -> o.salesterritory,
        "salestotal" -> o.salestotal,
        "fiscalyear" -> o.fiscalyear
      )
  
    override def reads(json: JsValue): JsResult[VsalespersonsalesbyfiscalyearsdataViewRow] = {
      JsResult.fromTry(
        Try(
          VsalespersonsalesbyfiscalyearsdataViewRow(
            salespersonid = json.\("salespersonid").toOption.map(_.as[BusinessentityId]),
            fullname = json.\("fullname").toOption.map(_.as[String]),
            jobtitle = json.\("jobtitle").toOption.map(_.as[/* max 50 chars */ String]),
            salesterritory = json.\("salesterritory").toOption.map(_.as[Name]),
            salestotal = json.\("salestotal").toOption.map(_.as[BigDecimal]),
            fiscalyear = json.\("fiscalyear").toOption.map(_.as[BigDecimal])
          )
        )
      )
    }
  }
}
