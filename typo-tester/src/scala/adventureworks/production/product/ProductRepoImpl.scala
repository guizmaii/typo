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
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime
import java.util.UUID

object ProductRepoImpl extends ProductRepo {
  override def delete(productid: ProductId)(implicit c: Connection): Boolean = {
    SQL"delete from production.product where productid = $productid".executeUpdate() > 0
  }
  override def insert(unsaved: ProductRow)(implicit c: Connection): ProductRow = {
    SQL"""insert into production.product(productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate)
          values (${unsaved.productid}::int4, ${unsaved.name}::"public"."Name", ${unsaved.productnumber}, ${unsaved.makeflag}::"public"."Flag", ${unsaved.finishedgoodsflag}::"public"."Flag", ${unsaved.color}, ${unsaved.safetystocklevel}::int2, ${unsaved.reorderpoint}::int2, ${unsaved.standardcost}::numeric, ${unsaved.listprice}::numeric, ${unsaved.size}, ${unsaved.sizeunitmeasurecode}::bpchar, ${unsaved.weightunitmeasurecode}::bpchar, ${unsaved.weight}::numeric, ${unsaved.daystomanufacture}::int4, ${unsaved.productline}::bpchar, ${unsaved.`class`}::bpchar, ${unsaved.style}::bpchar, ${unsaved.productsubcategoryid}::int4, ${unsaved.productmodelid}::int4, ${unsaved.sellstartdate}::timestamp, ${unsaved.sellenddate}::timestamp, ${unsaved.discontinueddate}::timestamp, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
       """
      .executeInsert(rowParser.single)
  
  }
  override def insert(unsaved: ProductRowUnsaved)(implicit c: Connection): ProductRow = {
    val namedParameters = List(
      Some((NamedParameter("name", ParameterValue.from(unsaved.name)), """::"public"."Name"""")),
      Some((NamedParameter("productnumber", ParameterValue.from(unsaved.productnumber)), "")),
      Some((NamedParameter("color", ParameterValue.from(unsaved.color)), "")),
      Some((NamedParameter("safetystocklevel", ParameterValue.from(unsaved.safetystocklevel)), "::int2")),
      Some((NamedParameter("reorderpoint", ParameterValue.from(unsaved.reorderpoint)), "::int2")),
      Some((NamedParameter("standardcost", ParameterValue.from(unsaved.standardcost)), "::numeric")),
      Some((NamedParameter("listprice", ParameterValue.from(unsaved.listprice)), "::numeric")),
      Some((NamedParameter("size", ParameterValue.from(unsaved.size)), "")),
      Some((NamedParameter("sizeunitmeasurecode", ParameterValue.from(unsaved.sizeunitmeasurecode)), "::bpchar")),
      Some((NamedParameter("weightunitmeasurecode", ParameterValue.from(unsaved.weightunitmeasurecode)), "::bpchar")),
      Some((NamedParameter("weight", ParameterValue.from(unsaved.weight)), "::numeric")),
      Some((NamedParameter("daystomanufacture", ParameterValue.from(unsaved.daystomanufacture)), "::int4")),
      Some((NamedParameter("productline", ParameterValue.from(unsaved.productline)), "::bpchar")),
      Some((NamedParameter("class", ParameterValue.from(unsaved.`class`)), "::bpchar")),
      Some((NamedParameter("style", ParameterValue.from(unsaved.style)), "::bpchar")),
      Some((NamedParameter("productsubcategoryid", ParameterValue.from(unsaved.productsubcategoryid)), "::int4")),
      Some((NamedParameter("productmodelid", ParameterValue.from(unsaved.productmodelid)), "::int4")),
      Some((NamedParameter("sellstartdate", ParameterValue.from(unsaved.sellstartdate)), "::timestamp")),
      Some((NamedParameter("sellenddate", ParameterValue.from(unsaved.sellenddate)), "::timestamp")),
      Some((NamedParameter("discontinueddate", ParameterValue.from(unsaved.discontinueddate)), "::timestamp")),
      unsaved.productid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("productid", ParameterValue.from[ProductId](value)), "::int4"))
      },
      unsaved.makeflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("makeflag", ParameterValue.from[Flag](value)), """::"public"."Flag""""))
      },
      unsaved.finishedgoodsflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("finishedgoodsflag", ParameterValue.from[Flag](value)), """::"public"."Flag""""))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.product default values
            returning productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into production.product(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[ProductRow] = {
    SQL"""select productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
          from production.product
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ProductFieldOrIdValue[_]])(implicit c: Connection): List[ProductRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ProductFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case ProductFieldValue.productnumber(value) => NamedParameter("productnumber", ParameterValue.from(value))
          case ProductFieldValue.makeflag(value) => NamedParameter("makeflag", ParameterValue.from(value))
          case ProductFieldValue.finishedgoodsflag(value) => NamedParameter("finishedgoodsflag", ParameterValue.from(value))
          case ProductFieldValue.color(value) => NamedParameter("color", ParameterValue.from(value))
          case ProductFieldValue.safetystocklevel(value) => NamedParameter("safetystocklevel", ParameterValue.from(value))
          case ProductFieldValue.reorderpoint(value) => NamedParameter("reorderpoint", ParameterValue.from(value))
          case ProductFieldValue.standardcost(value) => NamedParameter("standardcost", ParameterValue.from(value))
          case ProductFieldValue.listprice(value) => NamedParameter("listprice", ParameterValue.from(value))
          case ProductFieldValue.size(value) => NamedParameter("size", ParameterValue.from(value))
          case ProductFieldValue.sizeunitmeasurecode(value) => NamedParameter("sizeunitmeasurecode", ParameterValue.from(value))
          case ProductFieldValue.weightunitmeasurecode(value) => NamedParameter("weightunitmeasurecode", ParameterValue.from(value))
          case ProductFieldValue.weight(value) => NamedParameter("weight", ParameterValue.from(value))
          case ProductFieldValue.daystomanufacture(value) => NamedParameter("daystomanufacture", ParameterValue.from(value))
          case ProductFieldValue.productline(value) => NamedParameter("productline", ParameterValue.from(value))
          case ProductFieldValue.`class`(value) => NamedParameter("class", ParameterValue.from(value))
          case ProductFieldValue.style(value) => NamedParameter("style", ParameterValue.from(value))
          case ProductFieldValue.productsubcategoryid(value) => NamedParameter("productsubcategoryid", ParameterValue.from(value))
          case ProductFieldValue.productmodelid(value) => NamedParameter("productmodelid", ParameterValue.from(value))
          case ProductFieldValue.sellstartdate(value) => NamedParameter("sellstartdate", ParameterValue.from(value))
          case ProductFieldValue.sellenddate(value) => NamedParameter("sellenddate", ParameterValue.from(value))
          case ProductFieldValue.discontinueddate(value) => NamedParameter("discontinueddate", ParameterValue.from(value))
          case ProductFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case ProductFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
                    from production.product
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(productid: ProductId)(implicit c: Connection): Option[ProductRow] = {
    SQL"""select productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
          from production.product
          where productid = $productid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(productids: Array[ProductId])(implicit c: Connection): List[ProductRow] = {
    implicit val toStatement: ToStatement[Array[ProductId]] =
      (s: PreparedStatement, index: Int, v: Array[ProductId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select productid, "name", productnumber, makeflag, finishedgoodsflag, color, safetystocklevel, reorderpoint, standardcost, listprice, "size", sizeunitmeasurecode, weightunitmeasurecode, weight, daystomanufacture, productline, "class", "style", productsubcategoryid, productmodelid, sellstartdate, sellenddate, discontinueddate, rowguid, modifieddate
          from production.product
          where productid = ANY($productids)
       """.as(rowParser.*)
  
  }
  override def update(row: ProductRow)(implicit c: Connection): Boolean = {
    val productid = row.productid
    SQL"""update production.product
          set "name" = ${row.name}::"public"."Name",
              productnumber = ${row.productnumber},
              makeflag = ${row.makeflag}::"public"."Flag",
              finishedgoodsflag = ${row.finishedgoodsflag}::"public"."Flag",
              color = ${row.color},
              safetystocklevel = ${row.safetystocklevel}::int2,
              reorderpoint = ${row.reorderpoint}::int2,
              standardcost = ${row.standardcost}::numeric,
              listprice = ${row.listprice}::numeric,
              "size" = ${row.size},
              sizeunitmeasurecode = ${row.sizeunitmeasurecode}::bpchar,
              weightunitmeasurecode = ${row.weightunitmeasurecode}::bpchar,
              weight = ${row.weight}::numeric,
              daystomanufacture = ${row.daystomanufacture}::int4,
              productline = ${row.productline}::bpchar,
              "class" = ${row.`class`}::bpchar,
              "style" = ${row.style}::bpchar,
              productsubcategoryid = ${row.productsubcategoryid}::int4,
              productmodelid = ${row.productmodelid}::int4,
              sellstartdate = ${row.sellstartdate}::timestamp,
              sellenddate = ${row.sellenddate}::timestamp,
              discontinueddate = ${row.discontinueddate}::timestamp,
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where productid = $productid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(productid: ProductId, fieldValues: List[ProductFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case ProductFieldValue.productnumber(value) => NamedParameter("productnumber", ParameterValue.from(value))
          case ProductFieldValue.makeflag(value) => NamedParameter("makeflag", ParameterValue.from(value))
          case ProductFieldValue.finishedgoodsflag(value) => NamedParameter("finishedgoodsflag", ParameterValue.from(value))
          case ProductFieldValue.color(value) => NamedParameter("color", ParameterValue.from(value))
          case ProductFieldValue.safetystocklevel(value) => NamedParameter("safetystocklevel", ParameterValue.from(value))
          case ProductFieldValue.reorderpoint(value) => NamedParameter("reorderpoint", ParameterValue.from(value))
          case ProductFieldValue.standardcost(value) => NamedParameter("standardcost", ParameterValue.from(value))
          case ProductFieldValue.listprice(value) => NamedParameter("listprice", ParameterValue.from(value))
          case ProductFieldValue.size(value) => NamedParameter("size", ParameterValue.from(value))
          case ProductFieldValue.sizeunitmeasurecode(value) => NamedParameter("sizeunitmeasurecode", ParameterValue.from(value))
          case ProductFieldValue.weightunitmeasurecode(value) => NamedParameter("weightunitmeasurecode", ParameterValue.from(value))
          case ProductFieldValue.weight(value) => NamedParameter("weight", ParameterValue.from(value))
          case ProductFieldValue.daystomanufacture(value) => NamedParameter("daystomanufacture", ParameterValue.from(value))
          case ProductFieldValue.productline(value) => NamedParameter("productline", ParameterValue.from(value))
          case ProductFieldValue.`class`(value) => NamedParameter("class", ParameterValue.from(value))
          case ProductFieldValue.style(value) => NamedParameter("style", ParameterValue.from(value))
          case ProductFieldValue.productsubcategoryid(value) => NamedParameter("productsubcategoryid", ParameterValue.from(value))
          case ProductFieldValue.productmodelid(value) => NamedParameter("productmodelid", ParameterValue.from(value))
          case ProductFieldValue.sellstartdate(value) => NamedParameter("sellstartdate", ParameterValue.from(value))
          case ProductFieldValue.sellenddate(value) => NamedParameter("sellenddate", ParameterValue.from(value))
          case ProductFieldValue.discontinueddate(value) => NamedParameter("discontinueddate", ParameterValue.from(value))
          case ProductFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case ProductFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update production.product
                    set ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where productid = {productid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("productid", ParameterValue.from(productid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[ProductRow] =
    RowParser[ProductRow] { row =>
      Success(
        ProductRow(
          productid = row[ProductId]("productid"),
          name = row[Name]("name"),
          productnumber = row[String]("productnumber"),
          makeflag = row[Flag]("makeflag"),
          finishedgoodsflag = row[Flag]("finishedgoodsflag"),
          color = row[Option[String]]("color"),
          safetystocklevel = row[Int]("safetystocklevel"),
          reorderpoint = row[Int]("reorderpoint"),
          standardcost = row[BigDecimal]("standardcost"),
          listprice = row[BigDecimal]("listprice"),
          size = row[Option[String]]("size"),
          sizeunitmeasurecode = row[Option[UnitmeasureId]]("sizeunitmeasurecode"),
          weightunitmeasurecode = row[Option[UnitmeasureId]]("weightunitmeasurecode"),
          weight = row[Option[BigDecimal]]("weight"),
          daystomanufacture = row[Int]("daystomanufacture"),
          productline = row[Option[/* bpchar */ String]]("productline"),
          `class` = row[Option[/* bpchar */ String]]("class"),
          style = row[Option[/* bpchar */ String]]("style"),
          productsubcategoryid = row[Option[ProductsubcategoryId]]("productsubcategoryid"),
          productmodelid = row[Option[ProductmodelId]]("productmodelid"),
          sellstartdate = row[LocalDateTime]("sellstartdate"),
          sellenddate = row[Option[LocalDateTime]]("sellenddate"),
          discontinueddate = row[Option[LocalDateTime]]("discontinueddate"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
