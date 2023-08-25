/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productcategory

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object ProductcategoryRepoImpl extends ProductcategoryRepo {
  override def delete(productcategoryid: ProductcategoryId)(implicit c: Connection): Boolean = {
    SQL"delete from production.productcategory where productcategoryid = ${ParameterValue(productcategoryid, null, ProductcategoryId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[ProductcategoryFields, ProductcategoryRow] = {
    DeleteBuilder("production.productcategory", ProductcategoryFields)
  }
  override def insert(unsaved: ProductcategoryRow)(implicit c: Connection): ProductcategoryRow = {
    SQL"""insert into production.productcategory(productcategoryid, "name", rowguid, modifieddate)
          values (${ParameterValue(unsaved.productcategoryid, null, ProductcategoryId.toStatement)}::int4, ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name", ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning productcategoryid, "name", rowguid, modifieddate::text
       """
      .executeInsert(ProductcategoryRow.rowParser(1).single)
    
  }
  override def insert(unsaved: ProductcategoryRowUnsaved)(implicit c: Connection): ProductcategoryRow = {
    val namedParameters = List(
      Some((NamedParameter("name", ParameterValue(unsaved.name, null, Name.toStatement)), """::"public"."Name"""")),
      unsaved.productcategoryid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("productcategoryid", ParameterValue(value, null, ProductcategoryId.toStatement)), "::int4"))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue(value, null, ToStatement.uuidToStatement)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productcategory default values
            returning productcategoryid, "name", rowguid, modifieddate::text
         """
        .executeInsert(ProductcategoryRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.productcategory(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning productcategoryid, "name", rowguid, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(ProductcategoryRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[ProductcategoryFields, ProductcategoryRow] = {
    SelectBuilderSql("production.productcategory", ProductcategoryFields, ProductcategoryRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[ProductcategoryRow] = {
    SQL"""select productcategoryid, "name", rowguid, modifieddate::text
          from production.productcategory
       """.as(ProductcategoryRow.rowParser(1).*)
  }
  override def selectById(productcategoryid: ProductcategoryId)(implicit c: Connection): Option[ProductcategoryRow] = {
    SQL"""select productcategoryid, "name", rowguid, modifieddate::text
          from production.productcategory
          where productcategoryid = ${ParameterValue(productcategoryid, null, ProductcategoryId.toStatement)}
       """.as(ProductcategoryRow.rowParser(1).singleOpt)
  }
  override def selectByIds(productcategoryids: Array[ProductcategoryId])(implicit c: Connection): List[ProductcategoryRow] = {
    SQL"""select productcategoryid, "name", rowguid, modifieddate::text
          from production.productcategory
          where productcategoryid = ANY(${productcategoryids})
       """.as(ProductcategoryRow.rowParser(1).*)
    
  }
  override def update(row: ProductcategoryRow)(implicit c: Connection): Boolean = {
    val productcategoryid = row.productcategoryid
    SQL"""update production.productcategory
          set "name" = ${ParameterValue(row.name, null, Name.toStatement)}::"public"."Name",
              rowguid = ${ParameterValue(row.rowguid, null, ToStatement.uuidToStatement)}::uuid,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where productcategoryid = ${ParameterValue(productcategoryid, null, ProductcategoryId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[ProductcategoryFields, ProductcategoryRow] = {
    UpdateBuilder("production.productcategory", ProductcategoryFields, ProductcategoryRow.rowParser)
  }
  override def upsert(unsaved: ProductcategoryRow)(implicit c: Connection): ProductcategoryRow = {
    SQL"""insert into production.productcategory(productcategoryid, "name", rowguid, modifieddate)
          values (
            ${ParameterValue(unsaved.productcategoryid, null, ProductcategoryId.toStatement)}::int4,
            ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name",
            ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (productcategoryid)
          do update set
            "name" = EXCLUDED."name",
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning productcategoryid, "name", rowguid, modifieddate::text
       """
      .executeInsert(ProductcategoryRow.rowParser(1).single)
    
  }
}
