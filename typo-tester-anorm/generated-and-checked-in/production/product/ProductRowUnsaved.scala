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
  /** Name of the product. */
  name: Name,
  /** Unique product identification number. */
  productnumber: /* max 25 chars */ String,
  /** Product color. */
  color: Option[/* max 15 chars */ String],
  /** Minimum inventory quantity. */
  safetystocklevel: Int,
  /** Inventory level that triggers a purchase order or work order. */
  reorderpoint: Int,
  /** Standard cost of the product. */
  standardcost: BigDecimal,
  /** Selling price. */
  listprice: BigDecimal,
  /** Product size. */
  size: Option[/* max 5 chars */ String],
  /** Unit of measure for Size column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]] */
  sizeunitmeasurecode: Option[UnitmeasureId],
  /** Unit of measure for Weight column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]] */
  weightunitmeasurecode: Option[UnitmeasureId],
  /** Product weight. */
  weight: Option[BigDecimal],
  /** Number of days required to manufacture the product. */
  daystomanufacture: Int,
  /** R = Road, M = Mountain, T = Touring, S = Standard */
  productline: Option[/* bpchar */ String],
  /** H = High, M = Medium, L = Low */
  `class`: Option[/* bpchar */ String],
  /** W = Womens, M = Mens, U = Universal */
  style: Option[/* bpchar */ String],
  /** Product is a member of this product subcategory. Foreign key to ProductSubCategory.ProductSubCategoryID.
      Points to [[productsubcategory.ProductsubcategoryRow.productsubcategoryid]] */
  productsubcategoryid: Option[ProductsubcategoryId],
  /** Product is a member of this product model. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: Option[ProductmodelId],
  /** Date the product was available for sale. */
  sellstartdate: LocalDateTime,
  /** Date the product was no longer available for sale. */
  sellenddate: Option[LocalDateTime],
  /** Date the product was discontinued. */
  discontinueddate: Option[LocalDateTime],
  /** Default: nextval('production.product_productid_seq'::regclass)
      Primary key for Product records. */
  productid: Defaulted[ProductId] = Defaulted.UseDefault,
  /** Default: true
      0 = Product is purchased, 1 = Product is manufactured in-house. */
  makeflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: true
      0 = Product is not a salable item. 1 = Product is salable. */
  finishedgoodsflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[LocalDateTime] = Defaulted.UseDefault
) {
  def toRow(productidDefault: => ProductId, makeflagDefault: => Flag, finishedgoodsflagDefault: => Flag, rowguidDefault: => UUID, modifieddateDefault: => LocalDateTime): ProductRow =
    ProductRow(
      name = name,
      productnumber = productnumber,
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
      productid = productid match {
                    case Defaulted.UseDefault => productidDefault
                    case Defaulted.Provided(value) => value
                  },
      makeflag = makeflag match {
                   case Defaulted.UseDefault => makeflagDefault
                   case Defaulted.Provided(value) => value
                 },
      finishedgoodsflag = finishedgoodsflag match {
                            case Defaulted.UseDefault => finishedgoodsflagDefault
                            case Defaulted.Provided(value) => value
                          },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
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
        "productid" -> o.productid,
        "makeflag" -> o.makeflag,
        "finishedgoodsflag" -> o.finishedgoodsflag,
        "rowguid" -> o.rowguid,
        "modifieddate" -> o.modifieddate
      )
  
    override def reads(json: JsValue): JsResult[ProductRowUnsaved] = {
      JsResult.fromTry(
        Try(
          ProductRowUnsaved(
            name = json.\("name").as[Name],
            productnumber = json.\("productnumber").as[/* max 25 chars */ String],
            color = json.\("color").toOption.map(_.as[/* max 15 chars */ String]),
            safetystocklevel = json.\("safetystocklevel").as[Int],
            reorderpoint = json.\("reorderpoint").as[Int],
            standardcost = json.\("standardcost").as[BigDecimal],
            listprice = json.\("listprice").as[BigDecimal],
            size = json.\("size").toOption.map(_.as[/* max 5 chars */ String]),
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
            productid = json.\("productid").as[Defaulted[ProductId]],
            makeflag = json.\("makeflag").as[Defaulted[Flag]],
            finishedgoodsflag = json.\("finishedgoodsflag").as[Defaulted[Flag]],
            rowguid = json.\("rowguid").as[Defaulted[UUID]],
            modifieddate = json.\("modifieddate").as[Defaulted[LocalDateTime]]
          )
        )
      )
    }
  }
}
