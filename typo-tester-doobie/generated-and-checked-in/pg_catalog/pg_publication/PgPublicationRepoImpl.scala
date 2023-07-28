/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_publication

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgPublicationRepoImpl extends PgPublicationRepo {
  override def delete(oid: PgPublicationId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_publication where oid = $oid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgPublicationRow): ConnectionIO[PgPublicationRow] = {
    sql"""insert into pg_catalog.pg_publication(oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot)
          values (${unsaved.oid}::oid, ${unsaved.pubname}::name, ${unsaved.pubowner}::oid, ${unsaved.puballtables}, ${unsaved.pubinsert}, ${unsaved.pubupdate}, ${unsaved.pubdelete}, ${unsaved.pubtruncate}, ${unsaved.pubviaroot})
          returning oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot
       """.query[PgPublicationRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgPublicationRow] = {
    sql"select oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot from pg_catalog.pg_publication".query[PgPublicationRow].stream
  }
  override def selectById(oid: PgPublicationId): ConnectionIO[Option[PgPublicationRow]] = {
    sql"select oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot from pg_catalog.pg_publication where oid = $oid".query[PgPublicationRow].option
  }
  override def selectByIds(oids: Array[PgPublicationId]): Stream[ConnectionIO, PgPublicationRow] = {
    sql"select oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot from pg_catalog.pg_publication where oid = ANY($oids)".query[PgPublicationRow].stream
  }
  override def update(row: PgPublicationRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_publication
          set pubname = ${row.pubname}::name,
              pubowner = ${row.pubowner}::oid,
              puballtables = ${row.puballtables},
              pubinsert = ${row.pubinsert},
              pubupdate = ${row.pubupdate},
              pubdelete = ${row.pubdelete},
              pubtruncate = ${row.pubtruncate},
              pubviaroot = ${row.pubviaroot}
          where oid = $oid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgPublicationRow): ConnectionIO[PgPublicationRow] = {
    sql"""insert into pg_catalog.pg_publication(oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.pubname}::name,
            ${unsaved.pubowner}::oid,
            ${unsaved.puballtables},
            ${unsaved.pubinsert},
            ${unsaved.pubupdate},
            ${unsaved.pubdelete},
            ${unsaved.pubtruncate},
            ${unsaved.pubviaroot}
          )
          on conflict (oid)
          do update set
            pubname = EXCLUDED.pubname,
            pubowner = EXCLUDED.pubowner,
            puballtables = EXCLUDED.puballtables,
            pubinsert = EXCLUDED.pubinsert,
            pubupdate = EXCLUDED.pubupdate,
            pubdelete = EXCLUDED.pubdelete,
            pubtruncate = EXCLUDED.pubtruncate,
            pubviaroot = EXCLUDED.pubviaroot
          returning oid, pubname, pubowner, puballtables, pubinsert, pubupdate, pubdelete, pubtruncate, pubviaroot
       """.query[PgPublicationRow].unique
  }
}
