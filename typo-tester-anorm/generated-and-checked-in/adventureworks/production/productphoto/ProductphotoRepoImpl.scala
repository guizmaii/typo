/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productphoto

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoBytea
import adventureworks.customtypes.TypoLocalDateTime
import anorm.NamedParameter
import anorm.ParameterMetaData
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

object ProductphotoRepoImpl extends ProductphotoRepo {
  override def delete(productphotoid: ProductphotoId)(implicit c: Connection): Boolean = {
    SQL"""delete from production.productphoto where "productphotoid" = ${ParameterValue(productphotoid, null, ProductphotoId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[ProductphotoFields, ProductphotoRow] = {
    DeleteBuilder("production.productphoto", ProductphotoFields)
  }
  override def insert(unsaved: ProductphotoRow)(implicit c: Connection): ProductphotoRow = {
    SQL"""insert into production.productphoto("productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate")
          values (${ParameterValue(unsaved.productphotoid, null, ProductphotoId.toStatement)}::int4, ${ParameterValue(unsaved.thumbnailphoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea, ${ParameterValue(unsaved.thumbnailphotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}, ${ParameterValue(unsaved.largephoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea, ${ParameterValue(unsaved.largephotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
       """
      .executeInsert(ProductphotoRow.rowParser(1).single)
    
  }
  override def insert(unsaved: ProductphotoRowUnsaved)(implicit c: Connection): ProductphotoRow = {
    val namedParameters = List(
      Some((NamedParameter("thumbnailphoto", ParameterValue(unsaved.thumbnailphoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))), "::bytea")),
      Some((NamedParameter("thumbnailphotofilename", ParameterValue(unsaved.thumbnailphotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))), "")),
      Some((NamedParameter("largephoto", ParameterValue(unsaved.largephoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))), "::bytea")),
      Some((NamedParameter("largephotofilename", ParameterValue(unsaved.largephotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))), "")),
      unsaved.productphotoid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("productphotoid", ParameterValue(value, null, ProductphotoId.toStatement)), "::int4"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.productphoto default values
            returning "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
         """
        .executeInsert(ProductphotoRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.productphoto(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(ProductphotoRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[ProductphotoFields, ProductphotoRow] = {
    SelectBuilderSql("production.productphoto", ProductphotoFields, ProductphotoRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[ProductphotoRow] = {
    SQL"""select "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
          from production.productphoto
       """.as(ProductphotoRow.rowParser(1).*)
  }
  override def selectById(productphotoid: ProductphotoId)(implicit c: Connection): Option[ProductphotoRow] = {
    SQL"""select "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
          from production.productphoto
          where "productphotoid" = ${ParameterValue(productphotoid, null, ProductphotoId.toStatement)}
       """.as(ProductphotoRow.rowParser(1).singleOpt)
  }
  override def selectByIds(productphotoids: Array[ProductphotoId])(implicit c: Connection): List[ProductphotoRow] = {
    SQL"""select "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
          from production.productphoto
          where "productphotoid" = ANY(${productphotoids})
       """.as(ProductphotoRow.rowParser(1).*)
    
  }
  override def update(row: ProductphotoRow)(implicit c: Connection): Boolean = {
    val productphotoid = row.productphotoid
    SQL"""update production.productphoto
          set "thumbnailphoto" = ${ParameterValue(row.thumbnailphoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea,
              "thumbnailphotofilename" = ${ParameterValue(row.thumbnailphotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
              "largephoto" = ${ParameterValue(row.largephoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea,
              "largephotofilename" = ${ParameterValue(row.largephotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
              "modifieddate" = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where "productphotoid" = ${ParameterValue(productphotoid, null, ProductphotoId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[ProductphotoFields, ProductphotoRow] = {
    UpdateBuilder("production.productphoto", ProductphotoFields, ProductphotoRow.rowParser)
  }
  override def upsert(unsaved: ProductphotoRow)(implicit c: Connection): ProductphotoRow = {
    SQL"""insert into production.productphoto("productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate")
          values (
            ${ParameterValue(unsaved.productphotoid, null, ProductphotoId.toStatement)}::int4,
            ${ParameterValue(unsaved.thumbnailphoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea,
            ${ParameterValue(unsaved.thumbnailphotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
            ${ParameterValue(unsaved.largephoto, null, ToStatement.optionToStatement(TypoBytea.toStatement, TypoBytea.parameterMetadata))}::bytea,
            ${ParameterValue(unsaved.largephotofilename, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict ("productphotoid")
          do update set
            "thumbnailphoto" = EXCLUDED."thumbnailphoto",
            "thumbnailphotofilename" = EXCLUDED."thumbnailphotofilename",
            "largephoto" = EXCLUDED."largephoto",
            "largephotofilename" = EXCLUDED."largephotofilename",
            "modifieddate" = EXCLUDED."modifieddate"
          returning "productphotoid", "thumbnailphoto", "thumbnailphotofilename", "largephoto", "largephotofilename", "modifieddate"::text
       """
      .executeInsert(ProductphotoRow.rowParser(1).single)
    
  }
}
