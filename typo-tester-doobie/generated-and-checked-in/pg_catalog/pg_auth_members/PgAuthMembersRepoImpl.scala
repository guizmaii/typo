/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_auth_members

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgAuthMembersRepoImpl extends PgAuthMembersRepo {
  override def delete(compositeId: PgAuthMembersId): ConnectionIO[Boolean] = {
    sql"""delete from pg_catalog.pg_auth_members where roleid = ${compositeId.roleid} AND "member" = ${compositeId.member}""".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgAuthMembersRow): ConnectionIO[PgAuthMembersRow] = {
    sql"""insert into pg_catalog.pg_auth_members(roleid, "member", grantor, admin_option)
          values (${unsaved.roleid}::oid, ${unsaved.member}::oid, ${unsaved.grantor}::oid, ${unsaved.adminOption})
          returning roleid, "member", grantor, admin_option
       """.query[PgAuthMembersRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgAuthMembersRow] = {
    sql"""select roleid, "member", grantor, admin_option from pg_catalog.pg_auth_members""".query[PgAuthMembersRow].stream
  }
  override def selectById(compositeId: PgAuthMembersId): ConnectionIO[Option[PgAuthMembersRow]] = {
    sql"""select roleid, "member", grantor, admin_option from pg_catalog.pg_auth_members where roleid = ${compositeId.roleid} AND "member" = ${compositeId.member}""".query[PgAuthMembersRow].option
  }
  override def update(row: PgAuthMembersRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update pg_catalog.pg_auth_members
          set grantor = ${row.grantor}::oid,
              admin_option = ${row.adminOption}
          where roleid = ${compositeId.roleid} AND "member" = ${compositeId.member}
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgAuthMembersRow): ConnectionIO[PgAuthMembersRow] = {
    sql"""insert into pg_catalog.pg_auth_members(roleid, "member", grantor, admin_option)
          values (
            ${unsaved.roleid}::oid,
            ${unsaved.member}::oid,
            ${unsaved.grantor}::oid,
            ${unsaved.adminOption}
          )
          on conflict (roleid, "member")
          do update set
            grantor = EXCLUDED.grantor,
            admin_option = EXCLUDED.admin_option
          returning roleid, "member", grantor, admin_option
       """.query[PgAuthMembersRow].unique
  }
}
