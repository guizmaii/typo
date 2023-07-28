/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_extension

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgExtensionRepoImpl extends PgExtensionRepo {
  override def delete(oid: PgExtensionId)(implicit c: Connection): Boolean = {
    SQL"delete from pg_catalog.pg_extension where oid = $oid".executeUpdate() > 0
  }
  override def insert(unsaved: PgExtensionRow)(implicit c: Connection): PgExtensionRow = {
    SQL"""insert into pg_catalog.pg_extension(oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition)
          values (${unsaved.oid}::oid, ${unsaved.extname}::name, ${unsaved.extowner}::oid, ${unsaved.extnamespace}::oid, ${unsaved.extrelocatable}, ${unsaved.extversion}, ${unsaved.extconfig}::_oid, ${unsaved.extcondition}::_text)
          returning oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition
       """
      .executeInsert(PgExtensionRow.rowParser(1).single)
  
  }
  override def selectAll(implicit c: Connection): List[PgExtensionRow] = {
    SQL"""select oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition
          from pg_catalog.pg_extension
       """.as(PgExtensionRow.rowParser(1).*)
  }
  override def selectById(oid: PgExtensionId)(implicit c: Connection): Option[PgExtensionRow] = {
    SQL"""select oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition
          from pg_catalog.pg_extension
          where oid = $oid
       """.as(PgExtensionRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgExtensionId])(implicit c: Connection): List[PgExtensionRow] = {
    SQL"""select oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition
          from pg_catalog.pg_extension
          where oid = ANY($oids)
       """.as(PgExtensionRow.rowParser(1).*)
  
  }
  override def update(row: PgExtensionRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_extension
          set extname = ${row.extname}::name,
              extowner = ${row.extowner}::oid,
              extnamespace = ${row.extnamespace}::oid,
              extrelocatable = ${row.extrelocatable},
              extversion = ${row.extversion},
              extconfig = ${row.extconfig}::_oid,
              extcondition = ${row.extcondition}::_text
          where oid = $oid
       """.executeUpdate() > 0
  }
  override def upsert(unsaved: PgExtensionRow)(implicit c: Connection): PgExtensionRow = {
    SQL"""insert into pg_catalog.pg_extension(oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.extname}::name,
            ${unsaved.extowner}::oid,
            ${unsaved.extnamespace}::oid,
            ${unsaved.extrelocatable},
            ${unsaved.extversion},
            ${unsaved.extconfig}::_oid,
            ${unsaved.extcondition}::_text
          )
          on conflict (oid)
          do update set
            extname = EXCLUDED.extname,
            extowner = EXCLUDED.extowner,
            extnamespace = EXCLUDED.extnamespace,
            extrelocatable = EXCLUDED.extrelocatable,
            extversion = EXCLUDED.extversion,
            extconfig = EXCLUDED.extconfig,
            extcondition = EXCLUDED.extcondition
          returning oid, extname, extowner, extnamespace, extrelocatable, extversion, extconfig, extcondition
       """
      .executeInsert(PgExtensionRow.rowParser(1).single)
  
  }
}
