/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_tablespace

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgTablespaceRepoImpl extends PgTablespaceRepo {
  override def delete(oid: PgTablespaceId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_tablespace where oid = $oid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgTablespaceRow): ConnectionIO[PgTablespaceRow] = {
    sql"""insert into pg_catalog.pg_tablespace(oid, spcname, spcowner, spcacl, spcoptions)
          values (${unsaved.oid}::oid, ${unsaved.spcname}::name, ${unsaved.spcowner}::oid, ${unsaved.spcacl}::_aclitem, ${unsaved.spcoptions}::_text)
          returning oid, spcname, spcowner, spcacl, spcoptions
       """.query[PgTablespaceRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgTablespaceRow] = {
    sql"select oid, spcname, spcowner, spcacl, spcoptions from pg_catalog.pg_tablespace".query[PgTablespaceRow].stream
  }
  override def selectById(oid: PgTablespaceId): ConnectionIO[Option[PgTablespaceRow]] = {
    sql"select oid, spcname, spcowner, spcacl, spcoptions from pg_catalog.pg_tablespace where oid = $oid".query[PgTablespaceRow].option
  }
  override def selectByIds(oids: Array[PgTablespaceId]): Stream[ConnectionIO, PgTablespaceRow] = {
    sql"select oid, spcname, spcowner, spcacl, spcoptions from pg_catalog.pg_tablespace where oid = ANY($oids)".query[PgTablespaceRow].stream
  }
  override def update(row: PgTablespaceRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_tablespace
          set spcname = ${row.spcname}::name,
              spcowner = ${row.spcowner}::oid,
              spcacl = ${row.spcacl}::_aclitem,
              spcoptions = ${row.spcoptions}::_text
          where oid = $oid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgTablespaceRow): ConnectionIO[PgTablespaceRow] = {
    sql"""insert into pg_catalog.pg_tablespace(oid, spcname, spcowner, spcacl, spcoptions)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.spcname}::name,
            ${unsaved.spcowner}::oid,
            ${unsaved.spcacl}::_aclitem,
            ${unsaved.spcoptions}::_text
          )
          on conflict (oid)
          do update set
            spcname = EXCLUDED.spcname,
            spcowner = EXCLUDED.spcowner,
            spcacl = EXCLUDED.spcacl,
            spcoptions = EXCLUDED.spcoptions
          returning oid, spcname, spcowner, spcacl, spcoptions
       """.query[PgTablespaceRow].unique
  }
}
