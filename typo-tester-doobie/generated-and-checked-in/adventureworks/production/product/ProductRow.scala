/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package product

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoShort
import adventureworks.customtypes.TypoUUID
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import adventureworks.production.unitmeasure.UnitmeasureId
import adventureworks.public.Flag
import adventureworks.public.Name
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.DecodingFailure
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import scala.util.Try

case class ProductRow(
  /** Primary key for Product records. */
  productid: ProductId,
  /** Name of the product. */
  name: Name,
  /** Unique product identification number. */
  productnumber: /* max 25 chars */ String,
  /** 0 = Product is purchased, 1 = Product is manufactured in-house. */
  makeflag: Flag,
  /** 0 = Product is not a salable item. 1 = Product is salable. */
  finishedgoodsflag: Flag,
  /** Product color. */
  color: Option[/* max 15 chars */ String],
  /** Minimum inventory quantity.
      Constraint CK_Product_SafetyStockLevel affecting columns "safetystocklevel":  ((safetystocklevel > 0)) */
  safetystocklevel: TypoShort,
  /** Inventory level that triggers a purchase order or work order.
      Constraint CK_Product_ReorderPoint affecting columns "reorderpoint":  ((reorderpoint > 0)) */
  reorderpoint: TypoShort,
  /** Standard cost of the product.
      Constraint CK_Product_StandardCost affecting columns "standardcost":  ((standardcost >= 0.00)) */
  standardcost: BigDecimal,
  /** Selling price.
      Constraint CK_Product_ListPrice affecting columns "listprice":  ((listprice >= 0.00)) */
  listprice: BigDecimal,
  /** Product size. */
  size: Option[/* max 5 chars */ String],
  /** Unit of measure for Size column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]] */
  sizeunitmeasurecode: Option[UnitmeasureId],
  /** Unit of measure for Weight column.
      Points to [[unitmeasure.UnitmeasureRow.unitmeasurecode]] */
  weightunitmeasurecode: Option[UnitmeasureId],
  /** Product weight.
      Constraint CK_Product_Weight affecting columns "weight":  ((weight > 0.00)) */
  weight: Option[BigDecimal],
  /** Number of days required to manufacture the product.
      Constraint CK_Product_DaysToManufacture affecting columns "daystomanufacture":  ((daystomanufacture >= 0)) */
  daystomanufacture: Int,
  /** R = Road, M = Mountain, T = Touring, S = Standard
      Constraint CK_Product_ProductLine affecting columns "productline":  (((upper((productline)::text) = ANY (ARRAY['S'::text, 'T'::text, 'M'::text, 'R'::text])) OR (productline IS NULL))) */
  productline: Option[/* bpchar, max 2 chars */ String],
  /** H = High, M = Medium, L = Low
      Constraint CK_Product_Class affecting columns "class":  (((upper((class)::text) = ANY (ARRAY['L'::text, 'M'::text, 'H'::text])) OR (class IS NULL))) */
  `class`: Option[/* bpchar, max 2 chars */ String],
  /** W = Womens, M = Mens, U = Universal
      Constraint CK_Product_Style affecting columns "style":  (((upper((style)::text) = ANY (ARRAY['W'::text, 'M'::text, 'U'::text])) OR (style IS NULL))) */
  style: Option[/* bpchar, max 2 chars */ String],
  /** Product is a member of this product subcategory. Foreign key to ProductSubCategory.ProductSubCategoryID.
      Points to [[productsubcategory.ProductsubcategoryRow.productsubcategoryid]] */
  productsubcategoryid: Option[ProductsubcategoryId],
  /** Product is a member of this product model. Foreign key to ProductModel.ProductModelID.
      Points to [[productmodel.ProductmodelRow.productmodelid]] */
  productmodelid: Option[ProductmodelId],
  /** Date the product was available for sale.
      Constraint CK_Product_SellEndDate affecting columns "sellenddate", "sellstartdate":  (((sellenddate >= sellstartdate) OR (sellenddate IS NULL))) */
  sellstartdate: TypoLocalDateTime,
  /** Date the product was no longer available for sale.
      Constraint CK_Product_SellEndDate affecting columns "sellenddate", "sellstartdate":  (((sellenddate >= sellstartdate) OR (sellenddate IS NULL))) */
  sellenddate: Option[TypoLocalDateTime],
  /** Date the product was discontinued. */
  discontinueddate: Option[TypoLocalDateTime],
  rowguid: TypoUUID,
  modifieddate: TypoLocalDateTime
)

object ProductRow {
  implicit lazy val decoder: Decoder[ProductRow] = Decoder.instanceTry[ProductRow]((c: HCursor) =>
    Try {
      def orThrow[R](either: Either[DecodingFailure, R]): R = either match {
        case Left(err) => throw err
        case Right(r)  => r
      }
      ProductRow(
        productid = orThrow(c.get("productid")(ProductId.decoder)),
        name = orThrow(c.get("name")(Name.decoder)),
        productnumber = orThrow(c.get("productnumber")(Decoder.decodeString)),
        makeflag = orThrow(c.get("makeflag")(Flag.decoder)),
        finishedgoodsflag = orThrow(c.get("finishedgoodsflag")(Flag.decoder)),
        color = orThrow(c.get("color")(Decoder.decodeOption(Decoder.decodeString))),
        safetystocklevel = orThrow(c.get("safetystocklevel")(TypoShort.decoder)),
        reorderpoint = orThrow(c.get("reorderpoint")(TypoShort.decoder)),
        standardcost = orThrow(c.get("standardcost")(Decoder.decodeBigDecimal)),
        listprice = orThrow(c.get("listprice")(Decoder.decodeBigDecimal)),
        size = orThrow(c.get("size")(Decoder.decodeOption(Decoder.decodeString))),
        sizeunitmeasurecode = orThrow(c.get("sizeunitmeasurecode")(Decoder.decodeOption(UnitmeasureId.decoder))),
        weightunitmeasurecode = orThrow(c.get("weightunitmeasurecode")(Decoder.decodeOption(UnitmeasureId.decoder))),
        weight = orThrow(c.get("weight")(Decoder.decodeOption(Decoder.decodeBigDecimal))),
        daystomanufacture = orThrow(c.get("daystomanufacture")(Decoder.decodeInt)),
        productline = orThrow(c.get("productline")(Decoder.decodeOption(Decoder.decodeString))),
        `class` = orThrow(c.get("class")(Decoder.decodeOption(Decoder.decodeString))),
        style = orThrow(c.get("style")(Decoder.decodeOption(Decoder.decodeString))),
        productsubcategoryid = orThrow(c.get("productsubcategoryid")(Decoder.decodeOption(ProductsubcategoryId.decoder))),
        productmodelid = orThrow(c.get("productmodelid")(Decoder.decodeOption(ProductmodelId.decoder))),
        sellstartdate = orThrow(c.get("sellstartdate")(TypoLocalDateTime.decoder)),
        sellenddate = orThrow(c.get("sellenddate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        discontinueddate = orThrow(c.get("discontinueddate")(Decoder.decodeOption(TypoLocalDateTime.decoder))),
        rowguid = orThrow(c.get("rowguid")(TypoUUID.decoder)),
        modifieddate = orThrow(c.get("modifieddate")(TypoLocalDateTime.decoder))
      )
    }
  )
  implicit lazy val encoder: Encoder[ProductRow] = Encoder[ProductRow](row =>
    Json.obj(
      "productid" -> ProductId.encoder.apply(row.productid),
      "name" -> Name.encoder.apply(row.name),
      "productnumber" -> Encoder.encodeString.apply(row.productnumber),
      "makeflag" -> Flag.encoder.apply(row.makeflag),
      "finishedgoodsflag" -> Flag.encoder.apply(row.finishedgoodsflag),
      "color" -> Encoder.encodeOption(Encoder.encodeString).apply(row.color),
      "safetystocklevel" -> TypoShort.encoder.apply(row.safetystocklevel),
      "reorderpoint" -> TypoShort.encoder.apply(row.reorderpoint),
      "standardcost" -> Encoder.encodeBigDecimal.apply(row.standardcost),
      "listprice" -> Encoder.encodeBigDecimal.apply(row.listprice),
      "size" -> Encoder.encodeOption(Encoder.encodeString).apply(row.size),
      "sizeunitmeasurecode" -> Encoder.encodeOption(UnitmeasureId.encoder).apply(row.sizeunitmeasurecode),
      "weightunitmeasurecode" -> Encoder.encodeOption(UnitmeasureId.encoder).apply(row.weightunitmeasurecode),
      "weight" -> Encoder.encodeOption(Encoder.encodeBigDecimal).apply(row.weight),
      "daystomanufacture" -> Encoder.encodeInt.apply(row.daystomanufacture),
      "productline" -> Encoder.encodeOption(Encoder.encodeString).apply(row.productline),
      "class" -> Encoder.encodeOption(Encoder.encodeString).apply(row.`class`),
      "style" -> Encoder.encodeOption(Encoder.encodeString).apply(row.style),
      "productsubcategoryid" -> Encoder.encodeOption(ProductsubcategoryId.encoder).apply(row.productsubcategoryid),
      "productmodelid" -> Encoder.encodeOption(ProductmodelId.encoder).apply(row.productmodelid),
      "sellstartdate" -> TypoLocalDateTime.encoder.apply(row.sellstartdate),
      "sellenddate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.sellenddate),
      "discontinueddate" -> Encoder.encodeOption(TypoLocalDateTime.encoder).apply(row.discontinueddate),
      "rowguid" -> TypoUUID.encoder.apply(row.rowguid),
      "modifieddate" -> TypoLocalDateTime.encoder.apply(row.modifieddate)
    )
  )
  implicit lazy val read: Read[ProductRow] = new Read[ProductRow](
    gets = List(
      (ProductId.get, Nullability.NoNulls),
      (Name.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Flag.get, Nullability.NoNulls),
      (Flag.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (TypoShort.get, Nullability.NoNulls),
      (TypoShort.get, Nullability.NoNulls),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (UnitmeasureId.get, Nullability.Nullable),
      (UnitmeasureId.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (ProductsubcategoryId.get, Nullability.Nullable),
      (ProductmodelId.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoLocalDateTime.get, Nullability.Nullable),
      (TypoUUID.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ProductRow(
      productid = ProductId.get.unsafeGetNonNullable(rs, i + 0),
      name = Name.get.unsafeGetNonNullable(rs, i + 1),
      productnumber = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 2),
      makeflag = Flag.get.unsafeGetNonNullable(rs, i + 3),
      finishedgoodsflag = Flag.get.unsafeGetNonNullable(rs, i + 4),
      color = Meta.StringMeta.get.unsafeGetNullable(rs, i + 5),
      safetystocklevel = TypoShort.get.unsafeGetNonNullable(rs, i + 6),
      reorderpoint = TypoShort.get.unsafeGetNonNullable(rs, i + 7),
      standardcost = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 8),
      listprice = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 9),
      size = Meta.StringMeta.get.unsafeGetNullable(rs, i + 10),
      sizeunitmeasurecode = UnitmeasureId.get.unsafeGetNullable(rs, i + 11),
      weightunitmeasurecode = UnitmeasureId.get.unsafeGetNullable(rs, i + 12),
      weight = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 13),
      daystomanufacture = Meta.IntMeta.get.unsafeGetNonNullable(rs, i + 14),
      productline = Meta.StringMeta.get.unsafeGetNullable(rs, i + 15),
      `class` = Meta.StringMeta.get.unsafeGetNullable(rs, i + 16),
      style = Meta.StringMeta.get.unsafeGetNullable(rs, i + 17),
      productsubcategoryid = ProductsubcategoryId.get.unsafeGetNullable(rs, i + 18),
      productmodelid = ProductmodelId.get.unsafeGetNullable(rs, i + 19),
      sellstartdate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 20),
      sellenddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 21),
      discontinueddate = TypoLocalDateTime.get.unsafeGetNullable(rs, i + 22),
      rowguid = TypoUUID.get.unsafeGetNonNullable(rs, i + 23),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 24)
    )
  )
}
