/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_constraint

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgConstraintRepoImpl extends PgConstraintRepo {
  override def delete(oid: PgConstraintId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_constraint where oid = $oid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgConstraintRow): ConnectionIO[PgConstraintRow] = {
    sql"""insert into pg_catalog.pg_constraint(oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin)
          values (${unsaved.oid}::oid, ${unsaved.conname}::name, ${unsaved.connamespace}::oid, ${unsaved.contype}::char, ${unsaved.condeferrable}, ${unsaved.condeferred}, ${unsaved.convalidated}, ${unsaved.conrelid}::oid, ${unsaved.contypid}::oid, ${unsaved.conindid}::oid, ${unsaved.conparentid}::oid, ${unsaved.confrelid}::oid, ${unsaved.confupdtype}::char, ${unsaved.confdeltype}::char, ${unsaved.confmatchtype}::char, ${unsaved.conislocal}, ${unsaved.coninhcount}::int4, ${unsaved.connoinherit}, ${unsaved.conkey}::_int2, ${unsaved.confkey}::_int2, ${unsaved.conpfeqop}::_oid, ${unsaved.conppeqop}::_oid, ${unsaved.conffeqop}::_oid, ${unsaved.conexclop}::_oid, ${unsaved.conbin}::pg_node_tree)
          returning oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin
       """.query[PgConstraintRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgConstraintRow] = {
    sql"select oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin from pg_catalog.pg_constraint".query[PgConstraintRow].stream
  }
  override def selectById(oid: PgConstraintId): ConnectionIO[Option[PgConstraintRow]] = {
    sql"select oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin from pg_catalog.pg_constraint where oid = $oid".query[PgConstraintRow].option
  }
  override def selectByIds(oids: Array[PgConstraintId]): Stream[ConnectionIO, PgConstraintRow] = {
    sql"select oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin from pg_catalog.pg_constraint where oid = ANY($oids)".query[PgConstraintRow].stream
  }
  override def update(row: PgConstraintRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_constraint
          set conname = ${row.conname}::name,
              connamespace = ${row.connamespace}::oid,
              contype = ${row.contype}::char,
              condeferrable = ${row.condeferrable},
              condeferred = ${row.condeferred},
              convalidated = ${row.convalidated},
              conrelid = ${row.conrelid}::oid,
              contypid = ${row.contypid}::oid,
              conindid = ${row.conindid}::oid,
              conparentid = ${row.conparentid}::oid,
              confrelid = ${row.confrelid}::oid,
              confupdtype = ${row.confupdtype}::char,
              confdeltype = ${row.confdeltype}::char,
              confmatchtype = ${row.confmatchtype}::char,
              conislocal = ${row.conislocal},
              coninhcount = ${row.coninhcount}::int4,
              connoinherit = ${row.connoinherit},
              conkey = ${row.conkey}::_int2,
              confkey = ${row.confkey}::_int2,
              conpfeqop = ${row.conpfeqop}::_oid,
              conppeqop = ${row.conppeqop}::_oid,
              conffeqop = ${row.conffeqop}::_oid,
              conexclop = ${row.conexclop}::_oid,
              conbin = ${row.conbin}::pg_node_tree
          where oid = $oid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgConstraintRow): ConnectionIO[PgConstraintRow] = {
    sql"""insert into pg_catalog.pg_constraint(oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.conname}::name,
            ${unsaved.connamespace}::oid,
            ${unsaved.contype}::char,
            ${unsaved.condeferrable},
            ${unsaved.condeferred},
            ${unsaved.convalidated},
            ${unsaved.conrelid}::oid,
            ${unsaved.contypid}::oid,
            ${unsaved.conindid}::oid,
            ${unsaved.conparentid}::oid,
            ${unsaved.confrelid}::oid,
            ${unsaved.confupdtype}::char,
            ${unsaved.confdeltype}::char,
            ${unsaved.confmatchtype}::char,
            ${unsaved.conislocal},
            ${unsaved.coninhcount}::int4,
            ${unsaved.connoinherit},
            ${unsaved.conkey}::_int2,
            ${unsaved.confkey}::_int2,
            ${unsaved.conpfeqop}::_oid,
            ${unsaved.conppeqop}::_oid,
            ${unsaved.conffeqop}::_oid,
            ${unsaved.conexclop}::_oid,
            ${unsaved.conbin}::pg_node_tree
          )
          on conflict (oid)
          do update set
            conname = EXCLUDED.conname,
            connamespace = EXCLUDED.connamespace,
            contype = EXCLUDED.contype,
            condeferrable = EXCLUDED.condeferrable,
            condeferred = EXCLUDED.condeferred,
            convalidated = EXCLUDED.convalidated,
            conrelid = EXCLUDED.conrelid,
            contypid = EXCLUDED.contypid,
            conindid = EXCLUDED.conindid,
            conparentid = EXCLUDED.conparentid,
            confrelid = EXCLUDED.confrelid,
            confupdtype = EXCLUDED.confupdtype,
            confdeltype = EXCLUDED.confdeltype,
            confmatchtype = EXCLUDED.confmatchtype,
            conislocal = EXCLUDED.conislocal,
            coninhcount = EXCLUDED.coninhcount,
            connoinherit = EXCLUDED.connoinherit,
            conkey = EXCLUDED.conkey,
            confkey = EXCLUDED.confkey,
            conpfeqop = EXCLUDED.conpfeqop,
            conppeqop = EXCLUDED.conppeqop,
            conffeqop = EXCLUDED.conffeqop,
            conexclop = EXCLUDED.conexclop,
            conbin = EXCLUDED.conbin
          returning oid, conname, connamespace, contype, condeferrable, condeferred, convalidated, conrelid, contypid, conindid, conparentid, confrelid, confupdtype, confdeltype, confmatchtype, conislocal, coninhcount, connoinherit, conkey, confkey, conpfeqop, conppeqop, conffeqop, conexclop, conbin
       """.query[PgConstraintRow].unique
  }
}
