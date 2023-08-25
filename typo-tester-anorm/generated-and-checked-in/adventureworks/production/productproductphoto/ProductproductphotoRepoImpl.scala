/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productproductphoto

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.production.product.ProductId
import adventureworks.production.productphoto.ProductphotoId
import adventureworks.public.Flag
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object ProductproductphotoRepoImpl extends ProductproductphotoRepo {
  override def delete(compositeId: ProductproductphotoId)(implicit c: Connection): Boolean = {
    SQL"delete from production.productproductphoto where productid = ${ParameterValue(compositeId.productid, null, ProductId.toStatement)} AND productphotoid = ${ParameterValue(compositeId.productphotoid, null, ProductphotoId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[ProductproductphotoFields, ProductproductphotoRow] = {
    DeleteBuilder("production.productproductphoto", ProductproductphotoFields)
  }
  override def insert(unsaved: ProductproductphotoRow)(implicit c: Connection): ProductproductphotoRow = {
    SQL"""insert into production.productproductphoto(productid, productphotoid, "primary", modifieddate)
          values (${ParameterValue(unsaved.productid, null, ProductId.toStatement)}::int4, ${ParameterValue(unsaved.productphotoid, null, ProductphotoId.toStatement)}::int4, ${ParameterValue(unsaved.primary, null, Flag.toStatement)}::"public"."Flag", ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning productid, productphotoid, "primary", modifieddate::text
       """
      .executeInsert(ProductproductphotoRow.rowParser(1).single)
    
  }
  override def insert(unsaved: ProductproductphotoRowUnsaved)(implicit c: Connection): ProductproductphotoRow = {
    val namedParameters = List(
      Some((NamedParameter("productid", ParameterValue(unsaved.productid, null, ProductId.toStatement)), "::int4")),
      Some((NamedParameter("productphotoid", ParameterValue(unsaved.productphotoid, null, ProductphotoId.toStatement)), "::int4")),
      unsaved.primary match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("primary", ParameterValue(value, null, Flag.toStatement)), """::"public"."Flag""""))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productproductphoto default values
            returning productid, productphotoid, "primary", modifieddate::text
         """
        .executeInsert(ProductproductphotoRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.productproductphoto(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning productid, productphotoid, "primary", modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(ProductproductphotoRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[ProductproductphotoFields, ProductproductphotoRow] = {
    SelectBuilderSql("production.productproductphoto", ProductproductphotoFields, ProductproductphotoRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[ProductproductphotoRow] = {
    SQL"""select productid, productphotoid, "primary", modifieddate::text
          from production.productproductphoto
       """.as(ProductproductphotoRow.rowParser(1).*)
  }
  override def selectById(compositeId: ProductproductphotoId)(implicit c: Connection): Option[ProductproductphotoRow] = {
    SQL"""select productid, productphotoid, "primary", modifieddate::text
          from production.productproductphoto
          where productid = ${ParameterValue(compositeId.productid, null, ProductId.toStatement)} AND productphotoid = ${ParameterValue(compositeId.productphotoid, null, ProductphotoId.toStatement)}
       """.as(ProductproductphotoRow.rowParser(1).singleOpt)
  }
  override def update(row: ProductproductphotoRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update production.productproductphoto
          set "primary" = ${ParameterValue(row.primary, null, Flag.toStatement)}::"public"."Flag",
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where productid = ${ParameterValue(compositeId.productid, null, ProductId.toStatement)} AND productphotoid = ${ParameterValue(compositeId.productphotoid, null, ProductphotoId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[ProductproductphotoFields, ProductproductphotoRow] = {
    UpdateBuilder("production.productproductphoto", ProductproductphotoFields, ProductproductphotoRow.rowParser)
  }
  override def upsert(unsaved: ProductproductphotoRow)(implicit c: Connection): ProductproductphotoRow = {
    SQL"""insert into production.productproductphoto(productid, productphotoid, "primary", modifieddate)
          values (
            ${ParameterValue(unsaved.productid, null, ProductId.toStatement)}::int4,
            ${ParameterValue(unsaved.productphotoid, null, ProductphotoId.toStatement)}::int4,
            ${ParameterValue(unsaved.primary, null, Flag.toStatement)}::"public"."Flag",
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (productid, productphotoid)
          do update set
            "primary" = EXCLUDED."primary",
            modifieddate = EXCLUDED.modifieddate
          returning productid, productphotoid, "primary", modifieddate::text
       """
      .executeInsert(ProductproductphotoRow.rowParser(1).single)
    
  }
}
