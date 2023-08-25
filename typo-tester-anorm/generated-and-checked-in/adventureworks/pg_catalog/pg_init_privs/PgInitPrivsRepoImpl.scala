/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_init_privs

import adventureworks.customtypes.TypoAclItem
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgInitPrivsRepoImpl extends PgInitPrivsRepo {
  override def delete(compositeId: PgInitPrivsId)(implicit c: Connection): Boolean = {
    SQL"delete from pg_catalog.pg_init_privs where objoid = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND classoid = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND objsubid = ${ParameterValue(compositeId.objsubid, null, ToStatement.intToStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PgInitPrivsFields, PgInitPrivsRow] = {
    DeleteBuilder("pg_catalog.pg_init_privs", PgInitPrivsFields)
  }
  override def insert(unsaved: PgInitPrivsRow)(implicit c: Connection): PgInitPrivsRow = {
    SQL"""insert into pg_catalog.pg_init_privs(objoid, classoid, objsubid, privtype, initprivs)
          values (${ParameterValue(unsaved.objoid, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.classoid, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.objsubid, null, ToStatement.intToStatement)}::int4, ${ParameterValue(unsaved.privtype, null, ToStatement.stringToStatement)}::char, ${ParameterValue(unsaved.initprivs, null, TypoAclItem.arrayToStatement)}::_aclitem)
          returning objoid, classoid, objsubid, privtype, initprivs
       """
      .executeInsert(PgInitPrivsRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgInitPrivsFields, PgInitPrivsRow] = {
    SelectBuilderSql("pg_catalog.pg_init_privs", PgInitPrivsFields, PgInitPrivsRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgInitPrivsRow] = {
    SQL"""select objoid, classoid, objsubid, privtype, initprivs
          from pg_catalog.pg_init_privs
       """.as(PgInitPrivsRow.rowParser(1).*)
  }
  override def selectById(compositeId: PgInitPrivsId)(implicit c: Connection): Option[PgInitPrivsRow] = {
    SQL"""select objoid, classoid, objsubid, privtype, initprivs
          from pg_catalog.pg_init_privs
          where objoid = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND classoid = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND objsubid = ${ParameterValue(compositeId.objsubid, null, ToStatement.intToStatement)}
       """.as(PgInitPrivsRow.rowParser(1).singleOpt)
  }
  override def update(row: PgInitPrivsRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update pg_catalog.pg_init_privs
          set privtype = ${ParameterValue(row.privtype, null, ToStatement.stringToStatement)}::char,
              initprivs = ${ParameterValue(row.initprivs, null, TypoAclItem.arrayToStatement)}::_aclitem
          where objoid = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND classoid = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND objsubid = ${ParameterValue(compositeId.objsubid, null, ToStatement.intToStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PgInitPrivsFields, PgInitPrivsRow] = {
    UpdateBuilder("pg_catalog.pg_init_privs", PgInitPrivsFields, PgInitPrivsRow.rowParser)
  }
  override def upsert(unsaved: PgInitPrivsRow)(implicit c: Connection): PgInitPrivsRow = {
    SQL"""insert into pg_catalog.pg_init_privs(objoid, classoid, objsubid, privtype, initprivs)
          values (
            ${ParameterValue(unsaved.objoid, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.classoid, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.objsubid, null, ToStatement.intToStatement)}::int4,
            ${ParameterValue(unsaved.privtype, null, ToStatement.stringToStatement)}::char,
            ${ParameterValue(unsaved.initprivs, null, TypoAclItem.arrayToStatement)}::_aclitem
          )
          on conflict (objoid, classoid, objsubid)
          do update set
            privtype = EXCLUDED.privtype,
            initprivs = EXCLUDED.initprivs
          returning objoid, classoid, objsubid, privtype, initprivs
       """
      .executeInsert(PgInitPrivsRow.rowParser(1).single)
    
  }
}
