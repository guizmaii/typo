/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_dict

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgTsDictRepoImpl extends PgTsDictRepo {
  override def delete(oid: PgTsDictId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_ts_dict where oid = $oid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgTsDictRow): ConnectionIO[PgTsDictRow] = {
    sql"""insert into pg_catalog.pg_ts_dict(oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption)
          values (${unsaved.oid}::oid, ${unsaved.dictname}::name, ${unsaved.dictnamespace}::oid, ${unsaved.dictowner}::oid, ${unsaved.dicttemplate}::oid, ${unsaved.dictinitoption})
          returning oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption
       """.query[PgTsDictRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgTsDictRow] = {
    sql"select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict".query[PgTsDictRow].stream
  }
  override def selectById(oid: PgTsDictId): ConnectionIO[Option[PgTsDictRow]] = {
    sql"select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict where oid = $oid".query[PgTsDictRow].option
  }
  override def selectByIds(oids: Array[PgTsDictId]): Stream[ConnectionIO, PgTsDictRow] = {
    sql"select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict where oid = ANY($oids)".query[PgTsDictRow].stream
  }
  override def update(row: PgTsDictRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_ts_dict
          set dictname = ${row.dictname}::name,
              dictnamespace = ${row.dictnamespace}::oid,
              dictowner = ${row.dictowner}::oid,
              dicttemplate = ${row.dicttemplate}::oid,
              dictinitoption = ${row.dictinitoption}
          where oid = $oid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgTsDictRow): ConnectionIO[PgTsDictRow] = {
    sql"""insert into pg_catalog.pg_ts_dict(oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.dictname}::name,
            ${unsaved.dictnamespace}::oid,
            ${unsaved.dictowner}::oid,
            ${unsaved.dicttemplate}::oid,
            ${unsaved.dictinitoption}
          )
          on conflict (oid)
          do update set
            dictname = EXCLUDED.dictname,
            dictnamespace = EXCLUDED.dictnamespace,
            dictowner = EXCLUDED.dictowner,
            dicttemplate = EXCLUDED.dicttemplate,
            dictinitoption = EXCLUDED.dictinitoption
          returning oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption
       """.query[PgTsDictRow].unique
  }
}
