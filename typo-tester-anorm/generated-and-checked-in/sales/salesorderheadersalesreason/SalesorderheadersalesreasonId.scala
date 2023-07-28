/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheadersalesreason

import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.salesreason.SalesreasonId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** Type for the composite primary key of table `sales.salesorderheadersalesreason` */
case class SalesorderheadersalesreasonId(salesorderid: SalesorderheaderId, salesreasonid: SalesreasonId)
object SalesorderheadersalesreasonId {
  implicit val ordering: Ordering[SalesorderheadersalesreasonId] = Ordering.by(x => (x.salesorderid, x.salesreasonid))
  implicit val oFormat: OFormat[SalesorderheadersalesreasonId] = new OFormat[SalesorderheadersalesreasonId]{
    override def writes(o: SalesorderheadersalesreasonId): JsObject =
      Json.obj(
        "salesorderid" -> o.salesorderid,
        "salesreasonid" -> o.salesreasonid
      )
  
    override def reads(json: JsValue): JsResult[SalesorderheadersalesreasonId] = {
      JsResult.fromTry(
        Try(
          SalesorderheadersalesreasonId(
            salesorderid = json.\("salesorderid").as[SalesorderheaderId],
            salesreasonid = json.\("salesreasonid").as[SalesreasonId]
          )
        )
      )
    }
  }
}
