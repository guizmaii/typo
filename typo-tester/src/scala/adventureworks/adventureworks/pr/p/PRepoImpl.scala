/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package p

import adventureworks.production.product.ProductId
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import adventureworks.production.unitmeasure.UnitmeasureId
import adventureworks.public.Flag
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object PRepoImpl extends PRepo {
  override def selectAll(implicit c: Connection): List[PRow] = {
    SQL"""select id, productid, name, productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, size, sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, class, style, productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate from pr.p""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PFieldOrIdValue[_]])(implicit c: Connection): List[PRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case PFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case PFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case PFieldValue.productnumber(value) => NamedParameter("productnumber", ParameterValue.from(value))
          case PFieldValue.makeflag(value) => NamedParameter("makeflag", ParameterValue.from(value))
          case PFieldValue.finishedgoodsflag(value) => NamedParameter("finishedgoodsflag", ParameterValue.from(value))
          case PFieldValue.color(value) => NamedParameter("color", ParameterValue.from(value))
          case PFieldValue.safetystocklevel(value) => NamedParameter("safetystocklevel", ParameterValue.from(value))
          case PFieldValue.reorderpoint(value) => NamedParameter("reorderpoint", ParameterValue.from(value))
          case PFieldValue.standardcost(value) => NamedParameter("standardcost", ParameterValue.from(value))
          case PFieldValue.listprice(value) => NamedParameter("listprice", ParameterValue.from(value))
          case PFieldValue.size(value) => NamedParameter("size", ParameterValue.from(value))
          case PFieldValue.sizeunitmeasurecode(value) => NamedParameter("sizeunitmeasurecode", ParameterValue.from(value))
          case PFieldValue.weightunitmeasurecode(value) => NamedParameter("weightunitmeasurecode", ParameterValue.from(value))
          case PFieldValue.weight(value) => NamedParameter("weight", ParameterValue.from(value))
          case PFieldValue.daystomanufacture(value) => NamedParameter("daystomanufacture", ParameterValue.from(value))
          case PFieldValue.productline(value) => NamedParameter("productline", ParameterValue.from(value))
          case PFieldValue.`class`(value) => NamedParameter("class", ParameterValue.from(value))
          case PFieldValue.style(value) => NamedParameter("style", ParameterValue.from(value))
          case PFieldValue.productsubcategoryid(value) => NamedParameter("productsubcategoryid", ParameterValue.from(value))
          case PFieldValue.productmodelid(value) => NamedParameter("productmodelid", ParameterValue.from(value))
          case PFieldValue.sellstartdate(value) => NamedParameter("sellstartdate", ParameterValue.from(value))
          case PFieldValue.sellenddate(value) => NamedParameter("sellenddate", ParameterValue.from(value))
          case PFieldValue.discontinueddate(value) => NamedParameter("discontinueddate", ParameterValue.from(value))
          case PFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case PFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pr.p where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[PRow] =
    RowParser[PRow] { row =>
      Success(
        PRow(
          id = row[Option[Int]]("id"),
          productid = row[Option[ProductId]]("productid"),
          name = row[Option[Name]]("name"),
          productnumber = row[Option[String]]("productnumber"),
          makeflag = row[Flag]("makeflag"),
          finishedgoodsflag = row[Flag]("finishedgoodsflag"),
          color = row[Option[String]]("color"),
          safetystocklevel = row[Option[Int]]("safetystocklevel"),
          reorderpoint = row[Option[Int]]("reorderpoint"),
          standardcost = row[Option[BigDecimal]]("standardcost"),
          listprice = row[Option[BigDecimal]]("listprice"),
          size = row[Option[String]]("size"),
          sizeunitmeasurecode = row[Option[UnitmeasureId]]("sizeunitmeasurecode"),
          weightunitmeasurecode = row[Option[UnitmeasureId]]("weightunitmeasurecode"),
          weight = row[Option[BigDecimal]]("weight"),
          daystomanufacture = row[Option[Int]]("daystomanufacture"),
          productline = row[Option[/* bpchar */ String]]("productline"),
          `class` = row[Option[/* bpchar */ String]]("class"),
          style = row[Option[/* bpchar */ String]]("style"),
          productsubcategoryid = row[Option[ProductsubcategoryId]]("productsubcategoryid"),
          productmodelid = row[Option[ProductmodelId]]("productmodelid"),
          sellstartdate = row[Option[LocalDateTime]]("sellstartdate"),
          sellenddate = row[Option[LocalDateTime]]("sellenddate"),
          discontinueddate = row[Option[LocalDateTime]]("discontinueddate"),
          rowguid = row[Option[UUID]]("rowguid"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
