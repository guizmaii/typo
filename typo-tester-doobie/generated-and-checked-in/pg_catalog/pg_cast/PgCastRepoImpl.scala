/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_cast

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgCastRepoImpl extends PgCastRepo {
  override def delete(oid: PgCastId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_cast where oid = $oid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgCastRow): ConnectionIO[PgCastRow] = {
    sql"""insert into pg_catalog.pg_cast(oid, castsource, casttarget, castfunc, castcontext, castmethod)
          values (${unsaved.oid}::oid, ${unsaved.castsource}::oid, ${unsaved.casttarget}::oid, ${unsaved.castfunc}::oid, ${unsaved.castcontext}::char, ${unsaved.castmethod}::char)
          returning oid, castsource, casttarget, castfunc, castcontext, castmethod
       """.query[PgCastRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgCastRow] = {
    sql"select oid, castsource, casttarget, castfunc, castcontext, castmethod from pg_catalog.pg_cast".query[PgCastRow].stream
  }
  override def selectById(oid: PgCastId): ConnectionIO[Option[PgCastRow]] = {
    sql"select oid, castsource, casttarget, castfunc, castcontext, castmethod from pg_catalog.pg_cast where oid = $oid".query[PgCastRow].option
  }
  override def selectByIds(oids: Array[PgCastId]): Stream[ConnectionIO, PgCastRow] = {
    sql"select oid, castsource, casttarget, castfunc, castcontext, castmethod from pg_catalog.pg_cast where oid = ANY($oids)".query[PgCastRow].stream
  }
  override def update(row: PgCastRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_cast
          set castsource = ${row.castsource}::oid,
              casttarget = ${row.casttarget}::oid,
              castfunc = ${row.castfunc}::oid,
              castcontext = ${row.castcontext}::char,
              castmethod = ${row.castmethod}::char
          where oid = $oid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgCastRow): ConnectionIO[PgCastRow] = {
    sql"""insert into pg_catalog.pg_cast(oid, castsource, casttarget, castfunc, castcontext, castmethod)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.castsource}::oid,
            ${unsaved.casttarget}::oid,
            ${unsaved.castfunc}::oid,
            ${unsaved.castcontext}::char,
            ${unsaved.castmethod}::char
          )
          on conflict (oid)
          do update set
            castsource = EXCLUDED.castsource,
            casttarget = EXCLUDED.casttarget,
            castfunc = EXCLUDED.castfunc,
            castcontext = EXCLUDED.castcontext,
            castmethod = EXCLUDED.castmethod
          returning oid, castsource, casttarget, castfunc, castcontext, castmethod
       """.query[PgCastRow].unique
  }
}
