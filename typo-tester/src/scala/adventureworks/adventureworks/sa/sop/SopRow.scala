/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sop

import adventureworks.production.product.ProductId
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

case class SopRow(
  id: Option[Int] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"sop","column_name":"id","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.specialofferid]] */
  specialofferid: Option[SpecialofferId] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"sop","column_name":"specialofferid","ordinal_position":2,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.productid]] */
  productid: Option[ProductId] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"sop","column_name":"productid","ordinal_position":3,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.rowguid]] */
  rowguid: Option[UUID] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"sop","column_name":"rowguid","ordinal_position":4,"is_nullable":"YES","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  /** Points to [[sales.specialofferproduct.SpecialofferproductRow.modifieddate]] */
  modifieddate: Option[LocalDateTime] /* {"table_catalog":"Adventureworks","table_schema":"sa","table_name":"sop","column_name":"modifieddate","ordinal_position":5,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object SopRow {
  def rowParser(prefix: String): RowParser[SopRow] = { row =>
    Success(
      SopRow(
        id = row[Option[Int]](prefix + "id"),
        specialofferid = row[Option[SpecialofferId]](prefix + "specialofferid"),
        productid = row[Option[ProductId]](prefix + "productid"),
        rowguid = row[Option[UUID]](prefix + "rowguid"),
        modifieddate = row[Option[LocalDateTime]](prefix + "modifieddate")
      )
    )
  }

  implicit val oFormat: OFormat[SopRow] = new OFormat[SopRow]{
    override def writes(o: SopRow): JsObject =
      Json.obj(
        "id" -> o.id,
        "specialofferid" -> o.specialofferid,
        "productid" -> o.productid,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[SopRow] = {
      JsResult.fromTry(
        Try(
          SopRow(
            id = json.\("id").toOption.map(_.as[Int]),
            specialofferid = json.\("specialofferid").toOption.map(_.as[SpecialofferId]),
            productid = json.\("productid").toOption.map(_.as[ProductId]),
            rowguid = json.\("rowguid").toOption.map(_.as[UUID]),
            modifieddate = json.\("modifieddate").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
