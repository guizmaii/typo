/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package product

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import adventureworks.production.unitmeasure.UnitmeasureId
import adventureworks.public.Flag
import adventureworks.public.Name
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
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
  productline: Option[/* bpchar, max 2 chars */ String],
  /** H = High, M = Medium, L = Low */
  `class`: Option[/* bpchar, max 2 chars */ String],
  /** W = Womens, M = Mens, U = Universal */
  style: Option[/* bpchar, max 2 chars */ String],
  /** Product is a member of this product subcategory. Foreign key to ProductSubCategory.ProductSubCategoryID.
      Points to [[productsubcategory.ProductsubcategoryRow.productsubcategoryid]] */
  productsubcategoryid: Option[ProductsubcategoryId],
  /** Product is a member of this product model. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: Option[ProductmodelId],
  /** Date the product was available for sale. */
  sellstartdate: TypoLocalDateTime,
  /** Date the product was no longer available for sale. */
  sellenddate: Option[TypoLocalDateTime],
  /** Date the product was discontinued. */
  discontinueddate: Option[TypoLocalDateTime],
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
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(productidDefault: => ProductId, makeflagDefault: => Flag, finishedgoodsflagDefault: => Flag, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): ProductRow =
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
  implicit lazy val reads: Reads[ProductRowUnsaved] = Reads[ProductRowUnsaved](json => JsResult.fromTry(
      Try(
        ProductRowUnsaved(
          name = json.\("name").as(Name.reads),
          productnumber = json.\("productnumber").as(Reads.StringReads),
          color = json.\("color").toOption.map(_.as(Reads.StringReads)),
          safetystocklevel = json.\("safetystocklevel").as(Reads.IntReads),
          reorderpoint = json.\("reorderpoint").as(Reads.IntReads),
          standardcost = json.\("standardcost").as(Reads.bigDecReads),
          listprice = json.\("listprice").as(Reads.bigDecReads),
          size = json.\("size").toOption.map(_.as(Reads.StringReads)),
          sizeunitmeasurecode = json.\("sizeunitmeasurecode").toOption.map(_.as(UnitmeasureId.reads)),
          weightunitmeasurecode = json.\("weightunitmeasurecode").toOption.map(_.as(UnitmeasureId.reads)),
          weight = json.\("weight").toOption.map(_.as(Reads.bigDecReads)),
          daystomanufacture = json.\("daystomanufacture").as(Reads.IntReads),
          productline = json.\("productline").toOption.map(_.as(Reads.StringReads)),
          `class` = json.\("class").toOption.map(_.as(Reads.StringReads)),
          style = json.\("style").toOption.map(_.as(Reads.StringReads)),
          productsubcategoryid = json.\("productsubcategoryid").toOption.map(_.as(ProductsubcategoryId.reads)),
          productmodelid = json.\("productmodelid").toOption.map(_.as(ProductmodelId.reads)),
          sellstartdate = json.\("sellstartdate").as(TypoLocalDateTime.reads),
          sellenddate = json.\("sellenddate").toOption.map(_.as(TypoLocalDateTime.reads)),
          discontinueddate = json.\("discontinueddate").toOption.map(_.as(TypoLocalDateTime.reads)),
          productid = json.\("productid").as(Defaulted.reads(ProductId.reads)),
          makeflag = json.\("makeflag").as(Defaulted.reads(Flag.reads)),
          finishedgoodsflag = json.\("finishedgoodsflag").as(Defaulted.reads(Flag.reads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[ProductRowUnsaved] = OWrites[ProductRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "name" -> Name.writes.writes(o.name),
      "productnumber" -> Writes.StringWrites.writes(o.productnumber),
      "color" -> Writes.OptionWrites(Writes.StringWrites).writes(o.color),
      "safetystocklevel" -> Writes.IntWrites.writes(o.safetystocklevel),
      "reorderpoint" -> Writes.IntWrites.writes(o.reorderpoint),
      "standardcost" -> Writes.BigDecimalWrites.writes(o.standardcost),
      "listprice" -> Writes.BigDecimalWrites.writes(o.listprice),
      "size" -> Writes.OptionWrites(Writes.StringWrites).writes(o.size),
      "sizeunitmeasurecode" -> Writes.OptionWrites(UnitmeasureId.writes).writes(o.sizeunitmeasurecode),
      "weightunitmeasurecode" -> Writes.OptionWrites(UnitmeasureId.writes).writes(o.weightunitmeasurecode),
      "weight" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.weight),
      "daystomanufacture" -> Writes.IntWrites.writes(o.daystomanufacture),
      "productline" -> Writes.OptionWrites(Writes.StringWrites).writes(o.productline),
      "class" -> Writes.OptionWrites(Writes.StringWrites).writes(o.`class`),
      "style" -> Writes.OptionWrites(Writes.StringWrites).writes(o.style),
      "productsubcategoryid" -> Writes.OptionWrites(ProductsubcategoryId.writes).writes(o.productsubcategoryid),
      "productmodelid" -> Writes.OptionWrites(ProductmodelId.writes).writes(o.productmodelid),
      "sellstartdate" -> TypoLocalDateTime.writes.writes(o.sellstartdate),
      "sellenddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.sellenddate),
      "discontinueddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.discontinueddate),
      "productid" -> Defaulted.writes(ProductId.writes).writes(o.productid),
      "makeflag" -> Defaulted.writes(Flag.writes).writes(o.makeflag),
      "finishedgoodsflag" -> Defaulted.writes(Flag.writes).writes(o.finishedgoodsflag),
      "rowguid" -> Defaulted.writes(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
