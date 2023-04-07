/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderdetail

import adventureworks.production.product.ProductId
import adventureworks.sales.salesorderheader.SalesorderheaderId
import adventureworks.sales.specialoffer.SpecialofferId
import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class SalesorderdetailRow(
  /** Points to [[salesorderheader.SalesorderheaderRow.salesorderid]] */
  salesorderid: SalesorderheaderId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"salesorderid","ordinal_position":1,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  salesorderdetailid: Int /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"salesorderdetailid","ordinal_position":2,"column_default":"nextval('sales.salesorderdetail_salesorderdetailid_seq'::regclass)","is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  carriertrackingnumber: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"carriertrackingnumber","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":25,"character_octet_length":100,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  orderqty: Int /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"orderqty","ordinal_position":4,"is_nullable":"NO","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[specialofferproduct.SpecialofferproductRow.productid]] */
  productid: ProductId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"productid","ordinal_position":5,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[specialofferproduct.SpecialofferproductRow.specialofferid]] */
  specialofferid: SpecialofferId /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"specialofferid","ordinal_position":6,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  unitprice: BigDecimal /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"unitprice","ordinal_position":7,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  unitpricediscount: BigDecimal /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"unitpricediscount","ordinal_position":8,"column_default":"0.0","is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  rowguid: UUID /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"rowguid","ordinal_position":10,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  modifieddate: LocalDateTime /* {"table_catalog":"Adventureworks","table_schema":"sales","table_name":"salesorderdetail","column_name":"modifieddate","ordinal_position":11,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
){
   val compositeId: SalesorderdetailId = SalesorderdetailId(salesorderid, salesorderdetailid)
 }

object SalesorderdetailRow {
  def rowParser(prefix: String): RowParser[SalesorderdetailRow] = { row =>
    Success(
      SalesorderdetailRow(
        salesorderid = row[SalesorderheaderId](prefix + "salesorderid"),
        salesorderdetailid = row[Int](prefix + "salesorderdetailid"),
        carriertrackingnumber = row[Option[String]](prefix + "carriertrackingnumber"),
        orderqty = row[Int](prefix + "orderqty"),
        productid = row[ProductId](prefix + "productid"),
        specialofferid = row[SpecialofferId](prefix + "specialofferid"),
        unitprice = row[BigDecimal](prefix + "unitprice"),
        unitpricediscount = row[BigDecimal](prefix + "unitpricediscount"),
        rowguid = row[UUID](prefix + "rowguid"),
        modifieddate = row[LocalDateTime](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[SalesorderdetailRow] = new OFormat[SalesorderdetailRow]{
    override def writes(o: SalesorderdetailRow): JsObject =
      Json.obj(
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
  
    override def reads(json: JsValue): JsResult[SalesorderdetailRow] = {
      JsResult.fromTry(
        Try(
          SalesorderdetailRow(
            salesorderid = json.\("salesorderid").as[SalesorderheaderId],
            salesorderdetailid = json.\("salesorderdetailid").as[Int],
            carriertrackingnumber = json.\("carriertrackingnumber").toOption.map(_.as[String]),
            orderqty = json.\("orderqty").as[Int],
            productid = json.\("productid").as[ProductId],
            specialofferid = json.\("specialofferid").as[SpecialofferId],
            unitprice = json.\("unitprice").as[BigDecimal],
            unitpricediscount = json.\("unitpricediscount").as[BigDecimal],
            rowguid = json.\("rowguid").as[UUID],
            modifieddate = json.\("modifieddate").as[LocalDateTime]
          )
        )
      )
    }
  }
}
