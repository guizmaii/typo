/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_data_wrapper

import adventureworks.customtypes.TypoAclItem
import anorm.ParameterMetaData
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgForeignDataWrapperRepoImpl extends PgForeignDataWrapperRepo {
  override def delete(oid: PgForeignDataWrapperId)(implicit c: Connection): Boolean = {
    SQL"delete from pg_catalog.pg_foreign_data_wrapper where oid = ${ParameterValue(oid, null, PgForeignDataWrapperId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PgForeignDataWrapperFields, PgForeignDataWrapperRow] = {
    DeleteBuilder("pg_catalog.pg_foreign_data_wrapper", PgForeignDataWrapperFields)
  }
  override def insert(unsaved: PgForeignDataWrapperRow)(implicit c: Connection): PgForeignDataWrapperRow = {
    SQL"""insert into pg_catalog.pg_foreign_data_wrapper(oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions)
          values (${ParameterValue(unsaved.oid, null, PgForeignDataWrapperId.toStatement)}::oid, ${ParameterValue(unsaved.fdwname, null, ToStatement.stringToStatement)}::name, ${ParameterValue(unsaved.fdwowner, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.fdwhandler, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.fdwvalidator, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.fdwacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem, ${ParameterValue(unsaved.fdwoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text)
          returning oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions
       """
      .executeInsert(PgForeignDataWrapperRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgForeignDataWrapperFields, PgForeignDataWrapperRow] = {
    SelectBuilderSql("pg_catalog.pg_foreign_data_wrapper", PgForeignDataWrapperFields, PgForeignDataWrapperRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgForeignDataWrapperRow] = {
    SQL"""select oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions
          from pg_catalog.pg_foreign_data_wrapper
       """.as(PgForeignDataWrapperRow.rowParser(1).*)
  }
  override def selectById(oid: PgForeignDataWrapperId)(implicit c: Connection): Option[PgForeignDataWrapperRow] = {
    SQL"""select oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions
          from pg_catalog.pg_foreign_data_wrapper
          where oid = ${ParameterValue(oid, null, PgForeignDataWrapperId.toStatement)}
       """.as(PgForeignDataWrapperRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgForeignDataWrapperId])(implicit c: Connection): List[PgForeignDataWrapperRow] = {
    SQL"""select oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions
          from pg_catalog.pg_foreign_data_wrapper
          where oid = ANY(${oids})
       """.as(PgForeignDataWrapperRow.rowParser(1).*)
    
  }
  override def selectByUnique(fdwname: String)(implicit c: Connection): Option[PgForeignDataWrapperRow] = {
    SQL"""select fdwname
          from pg_catalog.pg_foreign_data_wrapper
          where fdwname = ${ParameterValue(fdwname, null, ToStatement.stringToStatement)}
       """.as(PgForeignDataWrapperRow.rowParser(1).singleOpt)
    
  }
  override def update(row: PgForeignDataWrapperRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_foreign_data_wrapper
          set fdwname = ${ParameterValue(row.fdwname, null, ToStatement.stringToStatement)}::name,
              fdwowner = ${ParameterValue(row.fdwowner, null, ToStatement.longToStatement)}::oid,
              fdwhandler = ${ParameterValue(row.fdwhandler, null, ToStatement.longToStatement)}::oid,
              fdwvalidator = ${ParameterValue(row.fdwvalidator, null, ToStatement.longToStatement)}::oid,
              fdwacl = ${ParameterValue(row.fdwacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem,
              fdwoptions = ${ParameterValue(row.fdwoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text
          where oid = ${ParameterValue(oid, null, PgForeignDataWrapperId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PgForeignDataWrapperFields, PgForeignDataWrapperRow] = {
    UpdateBuilder("pg_catalog.pg_foreign_data_wrapper", PgForeignDataWrapperFields, PgForeignDataWrapperRow.rowParser)
  }
  override def upsert(unsaved: PgForeignDataWrapperRow)(implicit c: Connection): PgForeignDataWrapperRow = {
    SQL"""insert into pg_catalog.pg_foreign_data_wrapper(oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions)
          values (
            ${ParameterValue(unsaved.oid, null, PgForeignDataWrapperId.toStatement)}::oid,
            ${ParameterValue(unsaved.fdwname, null, ToStatement.stringToStatement)}::name,
            ${ParameterValue(unsaved.fdwowner, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.fdwhandler, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.fdwvalidator, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.fdwacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem,
            ${ParameterValue(unsaved.fdwoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text
          )
          on conflict (oid)
          do update set
            fdwname = EXCLUDED.fdwname,
            fdwowner = EXCLUDED.fdwowner,
            fdwhandler = EXCLUDED.fdwhandler,
            fdwvalidator = EXCLUDED.fdwvalidator,
            fdwacl = EXCLUDED.fdwacl,
            fdwoptions = EXCLUDED.fdwoptions
          returning oid, fdwname, fdwowner, fdwhandler, fdwvalidator, fdwacl, fdwoptions
       """
      .executeInsert(PgForeignDataWrapperRow.rowParser(1).single)
    
  }
}
