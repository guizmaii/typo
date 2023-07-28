/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_sequence

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgSequenceRepoImpl extends PgSequenceRepo {
  override def delete(seqrelid: PgSequenceId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_sequence where seqrelid = $seqrelid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgSequenceRow): ConnectionIO[PgSequenceRow] = {
    sql"""insert into pg_catalog.pg_sequence(seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle)
          values (${unsaved.seqrelid}::oid, ${unsaved.seqtypid}::oid, ${unsaved.seqstart}::int8, ${unsaved.seqincrement}::int8, ${unsaved.seqmax}::int8, ${unsaved.seqmin}::int8, ${unsaved.seqcache}::int8, ${unsaved.seqcycle})
          returning seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle
       """.query[PgSequenceRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgSequenceRow] = {
    sql"select seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle from pg_catalog.pg_sequence".query[PgSequenceRow].stream
  }
  override def selectById(seqrelid: PgSequenceId): ConnectionIO[Option[PgSequenceRow]] = {
    sql"select seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle from pg_catalog.pg_sequence where seqrelid = $seqrelid".query[PgSequenceRow].option
  }
  override def selectByIds(seqrelids: Array[PgSequenceId]): Stream[ConnectionIO, PgSequenceRow] = {
    sql"select seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle from pg_catalog.pg_sequence where seqrelid = ANY($seqrelids)".query[PgSequenceRow].stream
  }
  override def update(row: PgSequenceRow): ConnectionIO[Boolean] = {
    val seqrelid = row.seqrelid
    sql"""update pg_catalog.pg_sequence
          set seqtypid = ${row.seqtypid}::oid,
              seqstart = ${row.seqstart}::int8,
              seqincrement = ${row.seqincrement}::int8,
              seqmax = ${row.seqmax}::int8,
              seqmin = ${row.seqmin}::int8,
              seqcache = ${row.seqcache}::int8,
              seqcycle = ${row.seqcycle}
          where seqrelid = $seqrelid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgSequenceRow): ConnectionIO[PgSequenceRow] = {
    sql"""insert into pg_catalog.pg_sequence(seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle)
          values (
            ${unsaved.seqrelid}::oid,
            ${unsaved.seqtypid}::oid,
            ${unsaved.seqstart}::int8,
            ${unsaved.seqincrement}::int8,
            ${unsaved.seqmax}::int8,
            ${unsaved.seqmin}::int8,
            ${unsaved.seqcache}::int8,
            ${unsaved.seqcycle}
          )
          on conflict (seqrelid)
          do update set
            seqtypid = EXCLUDED.seqtypid,
            seqstart = EXCLUDED.seqstart,
            seqincrement = EXCLUDED.seqincrement,
            seqmax = EXCLUDED.seqmax,
            seqmin = EXCLUDED.seqmin,
            seqcache = EXCLUDED.seqcache,
            seqcycle = EXCLUDED.seqcycle
          returning seqrelid, seqtypid, seqstart, seqincrement, seqmax, seqmin, seqcache, seqcycle
       """.query[PgSequenceRow].unique
  }
}
