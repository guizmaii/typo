/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_server

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

object PgForeignServerRepoImpl extends PgForeignServerRepo {
  override def delete(oid: PgForeignServerId)(implicit c: Connection): Boolean = {
    SQL"""delete from pg_catalog.pg_foreign_server where "oid" = ${ParameterValue(oid, null, PgForeignServerId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PgForeignServerFields, PgForeignServerRow] = {
    DeleteBuilder("pg_catalog.pg_foreign_server", PgForeignServerFields)
  }
  override def insert(unsaved: PgForeignServerRow)(implicit c: Connection): PgForeignServerRow = {
    SQL"""insert into pg_catalog.pg_foreign_server("oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions")
          values (${ParameterValue(unsaved.oid, null, PgForeignServerId.toStatement)}::oid, ${ParameterValue(unsaved.srvname, null, ToStatement.stringToStatement)}::name, ${ParameterValue(unsaved.srvowner, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.srvfdw, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.srvtype, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}, ${ParameterValue(unsaved.srvversion, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}, ${ParameterValue(unsaved.srvacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem, ${ParameterValue(unsaved.srvoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text)
          returning "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions"
       """
      .executeInsert(PgForeignServerRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgForeignServerFields, PgForeignServerRow] = {
    SelectBuilderSql("pg_catalog.pg_foreign_server", PgForeignServerFields, PgForeignServerRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgForeignServerRow] = {
    SQL"""select "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions"
          from pg_catalog.pg_foreign_server
       """.as(PgForeignServerRow.rowParser(1).*)
  }
  override def selectById(oid: PgForeignServerId)(implicit c: Connection): Option[PgForeignServerRow] = {
    SQL"""select "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions"
          from pg_catalog.pg_foreign_server
          where "oid" = ${ParameterValue(oid, null, PgForeignServerId.toStatement)}
       """.as(PgForeignServerRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgForeignServerId])(implicit c: Connection): List[PgForeignServerRow] = {
    SQL"""select "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions"
          from pg_catalog.pg_foreign_server
          where "oid" = ANY(${oids})
       """.as(PgForeignServerRow.rowParser(1).*)
    
  }
  override def selectByUnique(srvname: String)(implicit c: Connection): Option[PgForeignServerRow] = {
    SQL"""select "srvname"
          from pg_catalog.pg_foreign_server
          where "srvname" = ${ParameterValue(srvname, null, ToStatement.stringToStatement)}
       """.as(PgForeignServerRow.rowParser(1).singleOpt)
    
  }
  override def update(row: PgForeignServerRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_foreign_server
          set "srvname" = ${ParameterValue(row.srvname, null, ToStatement.stringToStatement)}::name,
              "srvowner" = ${ParameterValue(row.srvowner, null, ToStatement.longToStatement)}::oid,
              "srvfdw" = ${ParameterValue(row.srvfdw, null, ToStatement.longToStatement)}::oid,
              "srvtype" = ${ParameterValue(row.srvtype, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
              "srvversion" = ${ParameterValue(row.srvversion, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
              "srvacl" = ${ParameterValue(row.srvacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem,
              "srvoptions" = ${ParameterValue(row.srvoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text
          where "oid" = ${ParameterValue(oid, null, PgForeignServerId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PgForeignServerFields, PgForeignServerRow] = {
    UpdateBuilder("pg_catalog.pg_foreign_server", PgForeignServerFields, PgForeignServerRow.rowParser)
  }
  override def upsert(unsaved: PgForeignServerRow)(implicit c: Connection): PgForeignServerRow = {
    SQL"""insert into pg_catalog.pg_foreign_server("oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions")
          values (
            ${ParameterValue(unsaved.oid, null, PgForeignServerId.toStatement)}::oid,
            ${ParameterValue(unsaved.srvname, null, ToStatement.stringToStatement)}::name,
            ${ParameterValue(unsaved.srvowner, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.srvfdw, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.srvtype, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
            ${ParameterValue(unsaved.srvversion, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))},
            ${ParameterValue(unsaved.srvacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, adventureworks.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem,
            ${ParameterValue(unsaved.srvoptions, null, ToStatement.optionToStatement(ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData), adventureworks.arrayParameterMetaData(ParameterMetaData.StringParameterMetaData)))}::_text
          )
          on conflict ("oid")
          do update set
            "srvname" = EXCLUDED."srvname",
            "srvowner" = EXCLUDED."srvowner",
            "srvfdw" = EXCLUDED."srvfdw",
            "srvtype" = EXCLUDED."srvtype",
            "srvversion" = EXCLUDED."srvversion",
            "srvacl" = EXCLUDED."srvacl",
            "srvoptions" = EXCLUDED."srvoptions"
          returning "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions"
       """
      .executeInsert(PgForeignServerRow.rowParser(1).single)
    
  }
}
