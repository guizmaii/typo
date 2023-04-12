/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package product

import adventureworks.Defaulted
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import adventureworks.production.unitmeasure.UnitmeasureId
import adventureworks.public.Flag
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

/** This class corresponds to a row in table `production.product` which has not been persisted yet */
case class ProductRowUnsaved(
  /** Name of the product.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"name","ordinal_position":2,"is_nullable":"NO","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  name: Name,
  /** Unique product identification number.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"productnumber","ordinal_position":3,"is_nullable":"NO","data_type":"character varying","character_maximum_length":25,"character_octet_length":100,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productnumber: String,
  /** Default: true
      0 = Product is purchased, 1 = Product is manufactured in-house.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"makeflag","ordinal_position":4,"column_default":"true","is_nullable":"NO","data_type":"boolean","domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Flag","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  makeflag: Defaulted[Flag],
  /** Default: true
      0 = Product is not a salable item. 1 = Product is salable.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"finishedgoodsflag","ordinal_position":5,"column_default":"true","is_nullable":"NO","data_type":"boolean","domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Flag","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bool","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  finishedgoodsflag: Defaulted[Flag],
  /** Product color.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"color","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":15,"character_octet_length":60,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  color: Option[String],
  /** Minimum inventory quantity.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"safetystocklevel","ordinal_position":7,"is_nullable":"NO","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  safetystocklevel: Int,
  /** Inventory level that triggers a purchase order or work order.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"reorderpoint","ordinal_position":8,"is_nullable":"NO","data_type":"smallint","numeric_precision":16,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int2","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  reorderpoint: Int,
  /** Standard cost of the product.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"standardcost","ordinal_position":9,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  standardcost: BigDecimal,
  /** Selling price.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"listprice","ordinal_position":10,"is_nullable":"NO","data_type":"numeric","numeric_precision_radix":10,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  listprice: BigDecimal,
  /** Product size.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"size","ordinal_position":11,"is_nullable":"YES","data_type":"character varying","character_maximum_length":5,"character_octet_length":20,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  size: Option[String],
  /** Unit of measure for Size column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]]
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"sizeunitmeasurecode","ordinal_position":12,"is_nullable":"YES","data_type":"character","character_maximum_length":3,"character_octet_length":12,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  sizeunitmeasurecode: Option[UnitmeasureId],
  /** Unit of measure for Weight column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]]
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"weightunitmeasurecode","ordinal_position":13,"is_nullable":"YES","data_type":"character","character_maximum_length":3,"character_octet_length":12,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"13","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  weightunitmeasurecode: Option[UnitmeasureId],
  /** Product weight.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"weight","ordinal_position":14,"is_nullable":"YES","data_type":"numeric","numeric_precision":8,"numeric_precision_radix":10,"numeric_scale":2,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"numeric","dtd_identifier":"14","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  weight: Option[BigDecimal],
  /** Number of days required to manufacture the product.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"daystomanufacture","ordinal_position":15,"is_nullable":"NO","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"15","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  daystomanufacture: Int,
  /** R = Road, M = Mountain, T = Touring, S = Standard
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"productline","ordinal_position":16,"is_nullable":"YES","data_type":"character","character_maximum_length":2,"character_octet_length":8,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"16","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productline: Option[/* bpchar */ String],
  /** H = High, M = Medium, L = Low
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"class","ordinal_position":17,"is_nullable":"YES","data_type":"character","character_maximum_length":2,"character_octet_length":8,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"17","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  `class`: Option[/* bpchar */ String],
  /** W = Womens, M = Mens, U = Universal
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"style","ordinal_position":18,"is_nullable":"YES","data_type":"character","character_maximum_length":2,"character_octet_length":8,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"bpchar","dtd_identifier":"18","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  style: Option[/* bpchar */ String],
  /** Product is a member of this product subcategory. Foreign key to ProductSubCategory.ProductSubCategoryID.
      Points to [[productsubcategory.ProductsubcategoryRow.productsubcategoryid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"productsubcategoryid","ordinal_position":19,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"19","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productsubcategoryid: Option[ProductsubcategoryId],
  /** Product is a member of this product model. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]]
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"productmodelid","ordinal_position":20,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"20","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  productmodelid: Option[ProductmodelId],
  /** Date the product was available for sale.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"sellstartdate","ordinal_position":21,"is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"21","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  sellstartdate: LocalDateTime,
  /** Date the product was no longer available for sale.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"sellenddate","ordinal_position":22,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"22","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  sellenddate: Option[LocalDateTime],
  /** Date the product was discontinued.
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"discontinueddate","ordinal_position":23,"is_nullable":"YES","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"23","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  discontinueddate: Option[LocalDateTime],
  /** Default: uuid_generate_v1()
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"rowguid","ordinal_position":24,"column_default":"uuid_generate_v1()","is_nullable":"NO","data_type":"uuid","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"uuid","dtd_identifier":"24","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  rowguid: Defaulted[UUID],
  /** Default: now()
      debug: {"table_catalog":"Adventureworks","table_schema":"production","table_name":"product","column_name":"modifieddate","ordinal_position":25,"column_default":"now()","is_nullable":"NO","data_type":"timestamp without time zone","datetime_precision":6,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"timestamp","dtd_identifier":"25","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
  modifieddate: Defaulted[LocalDateTime]
) {
  def unsafeToRow(productid: ProductId): ProductRow =
    ProductRow(
      productid = productid,
      name = name,
      productnumber = productnumber,
      makeflag = makeflag match {
                   case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                   case Defaulted.Provided(value) => value
                 },
      finishedgoodsflag = finishedgoodsflag match {
                            case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                            case Defaulted.Provided(value) => value
                          },
      color = color,
      safetystocklevel = safetystocklevel,
      reorderpoint = reorderpoint,
      standardcost = standardcost,
      listprice = listprice,
      size = size,
      sizeunitmeasurecode = sizeunitmeasurecode,
      weightunitmeasurecode = weightunitmeasurecode,
      weight = weight,
      daystomanufacture = daystomanufacture,
      productline = productline,
      `class` = `class`,
      style = style,
      productsubcategoryid = productsubcategoryid,
      productmodelid = productmodelid,
      sellstartdate = sellstartdate,
      sellenddate = sellenddate,
      discontinueddate = discontinueddate,
      rowguid = rowguid match {
                  case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => sys.error("cannot produce row when you depend on a value which is defaulted in database")
                       case Defaulted.Provided(value) => value
                     }
    )
}
object ProductRowUnsaved {
  implicit val oFormat: OFormat[ProductRowUnsaved] = new OFormat[ProductRowUnsaved]{
    override def writes(o: ProductRowUnsaved): JsObject =
      Json.obj(
        "name" -> o.name,
        "productnumber" -> o.productnumber,
        "makeflag" -> o.makeflag,
        "finishedgoodsflag" -> o.finishedgoodsflag,
        "color" -> o.color,
        "safetystocklevel" -> o.safetystocklevel,
        "reorderpoint" -> o.reorderpoint,
        "standardcost" -> o.standardcost,
        "listprice" -> o.listprice,
        "size" -> o.size,
        "sizeunitmeasurecode" -> o.sizeunitmeasurecode,
        "weightunitmeasurecode" -> o.weightunitmeasurecode,
        "weight" -> o.weight,
        "daystomanufacture" -> o.daystomanufacture,
        "productline" -> o.productline,
        "class" -> o.`class`,
        "style" -> o.style,
        "productsubcategoryid" -> o.productsubcategoryid,
        "productmodelid" -> o.productmodelid,
        "sellstartdate" -> o.sellstartdate,
        "sellenddate" -> o.sellenddate,
        "discontinueddate" -> o.discontinueddate,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductRowUnsaved(
            name = json.\("name").as[Name],
            productnumber = json.\("productnumber").as[String],
            makeflag = json.\("makeflag").as[Defaulted[Flag]],
            finishedgoodsflag = json.\("finishedgoodsflag").as[Defaulted[Flag]],
            color = json.\("color").toOption.map(_.as[String]),
            safetystocklevel = json.\("safetystocklevel").as[Int],
            reorderpoint = json.\("reorderpoint").as[Int],
            standardcost = json.\("standardcost").as[BigDecimal],
            listprice = json.\("listprice").as[BigDecimal],
            size = json.\("size").toOption.map(_.as[String]),
            sizeunitmeasurecode = json.\("sizeunitmeasurecode").toOption.map(_.as[UnitmeasureId]),
            weightunitmeasurecode = json.\("weightunitmeasurecode").toOption.map(_.as[UnitmeasureId]),
            weight = json.\("weight").toOption.map(_.as[BigDecimal]),
            daystomanufacture = json.\("daystomanufacture").as[Int],
            productline = json.\("productline").toOption.map(_.as[/* bpchar */ String]),
            `class` = json.\("class").toOption.map(_.as[/* bpchar */ String]),
            style = json.\("style").toOption.map(_.as[/* bpchar */ String]),
            productsubcategoryid = json.\("productsubcategoryid").toOption.map(_.as[ProductsubcategoryId]),
            productmodelid = json.\("productmodelid").toOption.map(_.as[ProductmodelId]),
            sellstartdate = json.\("sellstartdate").as[LocalDateTime],
            sellenddate = json.\("sellenddate").toOption.map(_.as[LocalDateTime]),
            discontinueddate = json.\("discontinueddate").toOption.map(_.as[LocalDateTime]),
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
