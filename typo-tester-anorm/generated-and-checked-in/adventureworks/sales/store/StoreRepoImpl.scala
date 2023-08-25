/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package store

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoXml
import adventureworks.person.businessentity.BusinessentityId
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

object StoreRepoImpl extends StoreRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from sales.store where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[StoreFields, StoreRow] = {
    DeleteBuilder("sales.store", StoreFields)
  }
  override def insert(unsaved: StoreRow)(implicit c: Connection): StoreRow = {
    SQL"""insert into sales.store(businessentityid, "name", salespersonid, demographics, rowguid, modifieddate)
          values (${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4, ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name", ${ParameterValue(unsaved.salespersonid, null, ToStatement.optionToStatement(BusinessentityId.toStatement, BusinessentityId.parameterMetadata))}::int4, ${ParameterValue(unsaved.demographics, null, ToStatement.optionToStatement(TypoXml.toStatement, TypoXml.parameterMetadata))}::xml, ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
       """
      .executeInsert(StoreRow.rowParser(1).single)
    
  }
  override def insert(unsaved: StoreRowUnsaved)(implicit c: Connection): StoreRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)), "::int4")),
      Some((NamedParameter("name", ParameterValue(unsaved.name, null, Name.toStatement)), """::"public"."Name"""")),
      Some((NamedParameter("salespersonid", ParameterValue(unsaved.salespersonid, null, ToStatement.optionToStatement(BusinessentityId.toStatement, BusinessentityId.parameterMetadata))), "::int4")),
      Some((NamedParameter("demographics", ParameterValue(unsaved.demographics, null, ToStatement.optionToStatement(TypoXml.toStatement, TypoXml.parameterMetadata))), "::xml")),
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
      SQL"""insert into sales.store default values
            returning businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
         """
        .executeInsert(StoreRow.rowParser(1).single)
    } else {
      val q = s"""insert into sales.store(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(StoreRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[StoreFields, StoreRow] = {
    SelectBuilderSql("sales.store", StoreFields, StoreRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[StoreRow] = {
    SQL"""select businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
          from sales.store
       """.as(StoreRow.rowParser(1).*)
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[StoreRow] = {
    SQL"""select businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
          from sales.store
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.as(StoreRow.rowParser(1).singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[StoreRow] = {
    SQL"""select businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
          from sales.store
          where businessentityid = ANY(${businessentityids})
       """.as(StoreRow.rowParser(1).*)
    
  }
  override def update(row: StoreRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update sales.store
          set "name" = ${ParameterValue(row.name, null, Name.toStatement)}::"public"."Name",
              salespersonid = ${ParameterValue(row.salespersonid, null, ToStatement.optionToStatement(BusinessentityId.toStatement, BusinessentityId.parameterMetadata))}::int4,
              demographics = ${ParameterValue(row.demographics, null, ToStatement.optionToStatement(TypoXml.toStatement, TypoXml.parameterMetadata))}::xml,
              rowguid = ${ParameterValue(row.rowguid, null, ToStatement.uuidToStatement)}::uuid,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[StoreFields, StoreRow] = {
    UpdateBuilder("sales.store", StoreFields, StoreRow.rowParser)
  }
  override def upsert(unsaved: StoreRow)(implicit c: Connection): StoreRow = {
    SQL"""insert into sales.store(businessentityid, "name", salespersonid, demographics, rowguid, modifieddate)
          values (
            ${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4,
            ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name",
            ${ParameterValue(unsaved.salespersonid, null, ToStatement.optionToStatement(BusinessentityId.toStatement, BusinessentityId.parameterMetadata))}::int4,
            ${ParameterValue(unsaved.demographics, null, ToStatement.optionToStatement(TypoXml.toStatement, TypoXml.parameterMetadata))}::xml,
            ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (businessentityid)
          do update set
            "name" = EXCLUDED."name",
            salespersonid = EXCLUDED.salespersonid,
            demographics = EXCLUDED.demographics,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, "name", salespersonid, demographics, rowguid, modifieddate::text
       """
      .executeInsert(StoreRow.rowParser(1).single)
    
  }
}
