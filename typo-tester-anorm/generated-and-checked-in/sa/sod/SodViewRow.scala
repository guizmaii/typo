/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sod

import adventureworks.production.product.ProductId
import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.specialoffer.SpecialofferId
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class SodViewRow(
  id: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.salesorderid]] */
  salesorderid: Option[SalesorderheaderId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.salesorderdetailid]] */
  salesorderdetailid: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.carriertrackingnumber]] */
  carriertrackingnumber: Option[/* max 25 chars */ String],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.orderqty]] */
  orderqty: Option[Int],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.productid]] */
  productid: Option[ProductId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.specialofferid]] */
  specialofferid: Option[SpecialofferId],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.unitprice]] */
  unitprice: Option[BigDecimal],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.unitpricediscount]] */
  unitpricediscount: Option[BigDecimal],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[sales.salesorderdetail.SalesorderdetailRow.modifieddate]] */
  modifieddate: Option[LocalDateTime]
)

object SodViewRow {
  implicit val oFormat: OFormat[SodViewRow] = new OFormat[SodViewRow]{
    override def writes(o: SodViewRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "salesorderid" -> o.salesorderid,
        "salesorderdetailid" -> o.salesorderdetailid,
        "carriertrackingnumber" -> o.carriertrackingnumber,
        "orderqty" -> o.orderqty,
        "productid" -> o.productid,
        "specialofferid" -> o.specialofferid,
        "unitprice" -> o.unitprice,
        "unitpricediscount" -> o.unitpricediscount,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SodViewRow] = {
      JsResult.fromTry(
        Try(
          SodViewRow(
            id = json.\("id").toOption.map(_.as[Int]),
            salesorderid = json.\("salesorderid").toOption.map(_.as[SalesorderheaderId]),
            salesorderdetailid = json.\("salesorderdetailid").toOption.map(_.as[Int]),
            carriertrackingnumber = json.\("carriertrackingnumber").toOption.map(_.as[/* max 25 chars */ String]),
            orderqty = json.\("orderqty").toOption.map(_.as[Int]),
            productid = json.\("productid").toOption.map(_.as[ProductId]),
            specialofferid = json.\("specialofferid").toOption.map(_.as[SpecialofferId]),
            unitprice = json.\("unitprice").toOption.map(_.as[BigDecimal]),
            unitpricediscount = json.\("unitpricediscount").toOption.map(_.as[BigDecimal]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
