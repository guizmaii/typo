/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productdocument

import adventureworks.Defaulted
import adventureworks.production.document.DocumentId
import adventureworks.production.product.ProductId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object ProductdocumentRepoImpl extends ProductdocumentRepo {
  override def delete(compositeId: ProductdocumentId)(implicit c: Connection): Boolean = {
    SQL"delete from production.productdocument where productid = ${compositeId.productid} AND documentnode = ${compositeId.documentnode}".executeUpdate() > 0
  }
  override def insert(unsaved: ProductdocumentRow)(implicit c: Connection): ProductdocumentRow = {
    SQL"""insert into production.productdocument(productid, modifieddate, documentnode)
          values (${unsaved.productid}::int4, ${unsaved.modifieddate}::timestamp, ${unsaved.documentnode})
          returning productid, modifieddate, documentnode
       """
      .executeInsert(rowParser.single)
  
  }
  override def insert(unsaved: ProductdocumentRowUnsaved)(implicit c: Connection): ProductdocumentRow = {
    val namedParameters = List(
      Some((NamedParameter("productid", ParameterValue.from(unsaved.productid)), "::int4")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      },
      unsaved.documentnode match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("documentnode", ParameterValue.from[DocumentId](value)), ""))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productdocument default values
            returning productid, modifieddate, documentnode
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into production.productdocument(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning productid, modifieddate, documentnode
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[ProductdocumentRow] = {
    SQL"""select productid, modifieddate, documentnode
          from production.productdocument
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[ProductdocumentFieldOrIdValue[_]])(implicit c: Connection): List[ProductdocumentRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductdocumentFieldValue.productid(value) => NamedParameter("productid", ParameterValue.from(value))
          case ProductdocumentFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
          case ProductdocumentFieldValue.documentnode(value) => NamedParameter("documentnode", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select productid, modifieddate, documentnode
                    from production.productdocument
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(compositeId: ProductdocumentId)(implicit c: Connection): Option[ProductdocumentRow] = {
    SQL"""select productid, modifieddate, documentnode
          from production.productdocument
          where productid = ${compositeId.productid} AND documentnode = ${compositeId.documentnode}
       """.as(rowParser.singleOpt)
  }
  override def update(row: ProductdocumentRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update production.productdocument
          set modifieddate = ${row.modifieddate}::timestamp
          where productid = ${compositeId.productid} AND documentnode = ${compositeId.documentnode}
       """.executeUpdate() > 0
  }
  override def updateFieldValues(compositeId: ProductdocumentId, fieldValues: List[ProductdocumentFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case ProductdocumentFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update production.productdocument
                    set ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where productid = {productid} AND documentnode = {documentnode}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("productid", ParameterValue.from(compositeId.productid)), NamedParameter("documentnode", ParameterValue.from(compositeId.documentnode)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[ProductdocumentRow] =
    RowParser[ProductdocumentRow] { row =>
      Success(
        ProductdocumentRow(
          productid = row[ProductId]("productid"),
          modifieddate = row[LocalDateTime]("modifieddate"),
          documentnode = row[DocumentId]("documentnode")
        )
      )
    }
}
