/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productreview

import adventureworks.Defaulted
import adventureworks.production.product.ProductId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToSql
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDateTime

object ProductreviewRepoImpl extends ProductreviewRepo {
  override def delete(productreviewid: ProductreviewId)(implicit c: Connection): Boolean = {
    SQL"delete from production.productreview where productreviewid = $productreviewid".executeUpdate() > 0
  }
  override def insert(unsaved: ProductreviewRowUnsaved)(implicit c: Connection): ProductreviewRow = {
    val namedParameters = List(
      Some(NamedParameter("productid", ParameterValue.from(unsaved.productid))),
      Some(NamedParameter("reviewername", ParameterValue.from(unsaved.reviewername))),
      unsaved.reviewdate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("reviewdate", ParameterValue.from[LocalDateTime](value)))
      },
      Some(NamedParameter("emailaddress", ParameterValue.from(unsaved.emailaddress))),
      Some(NamedParameter("rating", ParameterValue.from(unsaved.rating))),
      Some(NamedParameter("comments", ParameterValue.from(unsaved.comments))),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some(NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)))
      }
    ).flatten
    
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productreview default values
            returning productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into production.productreview(${namedParameters.map(x => "\"" + x.name + "\"").mkString(", ")})
                  values (${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
                  returning productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[ProductreviewRow] = {
    SQL"""select productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
          from production.productreview
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ProductreviewFieldOrIdValue[_]])(implicit c: Connection): List[ProductreviewRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductreviewFieldValue.productreviewid(value) => NamedParameter("productreviewid", ParameterValue.from(value))
          case ProductreviewFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ProductreviewFieldValue.reviewername(value) => NamedParameter("reviewername", ParameterValue.from(value))
          case ProductreviewFieldValue.reviewdate(value) => NamedParameter("reviewdate", ParameterValue.from(value))
          case ProductreviewFieldValue.emailaddress(value) => NamedParameter("emailaddress", ParameterValue.from(value))
          case ProductreviewFieldValue.rating(value) => NamedParameter("rating", ParameterValue.from(value))
          case ProductreviewFieldValue.comments(value) => NamedParameter("comments", ParameterValue.from(value))
          case ProductreviewFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
                    from production.productreview
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(productreviewid: ProductreviewId)(implicit c: Connection): Option[ProductreviewRow] = {
    SQL"""select productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
          from production.productreview
          where productreviewid = $productreviewid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(productreviewids: Array[ProductreviewId])(implicit c: Connection): List[ProductreviewRow] = {
    implicit val arrayToSql: ToSql[Array[ProductreviewId]] = _ => ("?", 1) // fix wrong instance from anorm
    implicit val toStatement: ToStatement[Array[ProductreviewId]] =
      (s: PreparedStatement, index: Int, v: Array[ProductreviewId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate
          from production.productreview
          where productreviewid = ANY($productreviewids)
       """.as(rowParser.*)
  
  }
  override def update(row: ProductreviewRow)(implicit c: Connection): Boolean = {
    val productreviewid = row.productreviewid
    SQL"""update production.productreview
          set productid = ${row.productid},
              reviewername = ${row.reviewername},
              reviewdate = ${row.reviewdate},
              emailaddress = ${row.emailaddress},
              rating = ${row.rating},
              "comments" = ${row.comments},
              modifieddate = ${row.modifieddate}
          where productreviewid = $productreviewid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(productreviewid: ProductreviewId, fieldValues: List[ProductreviewFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductreviewFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ProductreviewFieldValue.reviewername(value) => NamedParameter("reviewername", ParameterValue.from(value))
          case ProductreviewFieldValue.reviewdate(value) => NamedParameter("reviewdate", ParameterValue.from(value))
          case ProductreviewFieldValue.emailaddress(value) => NamedParameter("emailaddress", ParameterValue.from(value))
          case ProductreviewFieldValue.rating(value) => NamedParameter("rating", ParameterValue.from(value))
          case ProductreviewFieldValue.comments(value) => NamedParameter("comments", ParameterValue.from(value))
          case ProductreviewFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""update production.productreview
                    set ${namedParams.map(x => s"\"${x.name}\" = {${x.name}}").mkString(", ")}
                    where productreviewid = {productreviewid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("productreviewid", ParameterValue.from(productreviewid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[ProductreviewRow] =
    RowParser[ProductreviewRow] { row =>
      Success(
        ProductreviewRow(
          productreviewid = row[ProductreviewId]("productreviewid"),
          productid = row[ProductId]("productid"),
          reviewername = row[Name]("reviewername"),
          reviewdate = row[LocalDateTime]("reviewdate"),
          emailaddress = row[String]("emailaddress"),
          rating = row[Int]("rating"),
          comments = row[Option[String]]("comments"),
          modifieddate = row[LocalDateTime]("modifieddate")
        )
      )
    }
}
