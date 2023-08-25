/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_database

import adventureworks.customtypes.TypoAclItem
import adventureworks.customtypes.TypoXid
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.meta.Meta
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgDatabaseRepoImpl extends PgDatabaseRepo {
  override def delete(oid: PgDatabaseId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_database where oid = ${fromWrite(oid)(Write.fromPut(PgDatabaseId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[PgDatabaseFields, PgDatabaseRow] = {
    DeleteBuilder("pg_catalog.pg_database", PgDatabaseFields)
  }
  override def insert(unsaved: PgDatabaseRow): ConnectionIO[PgDatabaseRow] = {
    sql"""insert into pg_catalog.pg_database(oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl)
          values (${fromWrite(unsaved.oid)(Write.fromPut(PgDatabaseId.put))}::oid, ${fromWrite(unsaved.datname)(Write.fromPut(Meta.StringMeta.put))}::name, ${fromWrite(unsaved.datdba)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.encoding)(Write.fromPut(Meta.IntMeta.put))}::int4, ${fromWrite(unsaved.datcollate)(Write.fromPut(Meta.StringMeta.put))}::name, ${fromWrite(unsaved.datctype)(Write.fromPut(Meta.StringMeta.put))}::name, ${fromWrite(unsaved.datistemplate)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.datallowconn)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.datconnlimit)(Write.fromPut(Meta.IntMeta.put))}::int4, ${fromWrite(unsaved.datlastsysoid)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.datfrozenxid)(Write.fromPut(TypoXid.put))}::xid, ${fromWrite(unsaved.datminmxid)(Write.fromPut(TypoXid.put))}::xid, ${fromWrite(unsaved.dattablespace)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.datacl)(Write.fromPutOption(TypoAclItem.arrayPut))}::_aclitem)
          returning oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl
       """.query(PgDatabaseRow.read).unique
  }
  override def select: SelectBuilder[PgDatabaseFields, PgDatabaseRow] = {
    SelectBuilderSql("pg_catalog.pg_database", PgDatabaseFields, PgDatabaseRow.read)
  }
  override def selectAll: Stream[ConnectionIO, PgDatabaseRow] = {
    sql"""select oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl from pg_catalog.pg_database""".query(PgDatabaseRow.read).stream
  }
  override def selectById(oid: PgDatabaseId): ConnectionIO[Option[PgDatabaseRow]] = {
    sql"""select oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl from pg_catalog.pg_database where oid = ${fromWrite(oid)(Write.fromPut(PgDatabaseId.put))}""".query(PgDatabaseRow.read).option
  }
  override def selectByIds(oids: Array[PgDatabaseId]): Stream[ConnectionIO, PgDatabaseRow] = {
    sql"""select oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl from pg_catalog.pg_database where oid = ANY(${oids})""".query(PgDatabaseRow.read).stream
  }
  override def selectByUnique(datname: String): ConnectionIO[Option[PgDatabaseRow]] = {
    sql"""select datname
          from pg_catalog.pg_database
          where datname = ${fromWrite(datname)(Write.fromPut(Meta.StringMeta.put))}
       """.query(PgDatabaseRow.read).option
  }
  override def update(row: PgDatabaseRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_database
          set datname = ${fromWrite(row.datname)(Write.fromPut(Meta.StringMeta.put))}::name,
              datdba = ${fromWrite(row.datdba)(Write.fromPut(Meta.LongMeta.put))}::oid,
              "encoding" = ${fromWrite(row.encoding)(Write.fromPut(Meta.IntMeta.put))}::int4,
              datcollate = ${fromWrite(row.datcollate)(Write.fromPut(Meta.StringMeta.put))}::name,
              datctype = ${fromWrite(row.datctype)(Write.fromPut(Meta.StringMeta.put))}::name,
              datistemplate = ${fromWrite(row.datistemplate)(Write.fromPut(Meta.BooleanMeta.put))},
              datallowconn = ${fromWrite(row.datallowconn)(Write.fromPut(Meta.BooleanMeta.put))},
              datconnlimit = ${fromWrite(row.datconnlimit)(Write.fromPut(Meta.IntMeta.put))}::int4,
              datlastsysoid = ${fromWrite(row.datlastsysoid)(Write.fromPut(Meta.LongMeta.put))}::oid,
              datfrozenxid = ${fromWrite(row.datfrozenxid)(Write.fromPut(TypoXid.put))}::xid,
              datminmxid = ${fromWrite(row.datminmxid)(Write.fromPut(TypoXid.put))}::xid,
              dattablespace = ${fromWrite(row.dattablespace)(Write.fromPut(Meta.LongMeta.put))}::oid,
              datacl = ${fromWrite(row.datacl)(Write.fromPutOption(TypoAclItem.arrayPut))}::_aclitem
          where oid = ${fromWrite(oid)(Write.fromPut(PgDatabaseId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[PgDatabaseFields, PgDatabaseRow] = {
    UpdateBuilder("pg_catalog.pg_database", PgDatabaseFields, PgDatabaseRow.read)
  }
  override def upsert(unsaved: PgDatabaseRow): ConnectionIO[PgDatabaseRow] = {
    sql"""insert into pg_catalog.pg_database(oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl)
          values (
            ${fromWrite(unsaved.oid)(Write.fromPut(PgDatabaseId.put))}::oid,
            ${fromWrite(unsaved.datname)(Write.fromPut(Meta.StringMeta.put))}::name,
            ${fromWrite(unsaved.datdba)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.encoding)(Write.fromPut(Meta.IntMeta.put))}::int4,
            ${fromWrite(unsaved.datcollate)(Write.fromPut(Meta.StringMeta.put))}::name,
            ${fromWrite(unsaved.datctype)(Write.fromPut(Meta.StringMeta.put))}::name,
            ${fromWrite(unsaved.datistemplate)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.datallowconn)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.datconnlimit)(Write.fromPut(Meta.IntMeta.put))}::int4,
            ${fromWrite(unsaved.datlastsysoid)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.datfrozenxid)(Write.fromPut(TypoXid.put))}::xid,
            ${fromWrite(unsaved.datminmxid)(Write.fromPut(TypoXid.put))}::xid,
            ${fromWrite(unsaved.dattablespace)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.datacl)(Write.fromPutOption(TypoAclItem.arrayPut))}::_aclitem
          )
          on conflict (oid)
          do update set
            datname = EXCLUDED.datname,
            datdba = EXCLUDED.datdba,
            "encoding" = EXCLUDED."encoding",
            datcollate = EXCLUDED.datcollate,
            datctype = EXCLUDED.datctype,
            datistemplate = EXCLUDED.datistemplate,
            datallowconn = EXCLUDED.datallowconn,
            datconnlimit = EXCLUDED.datconnlimit,
            datlastsysoid = EXCLUDED.datlastsysoid,
            datfrozenxid = EXCLUDED.datfrozenxid,
            datminmxid = EXCLUDED.datminmxid,
            dattablespace = EXCLUDED.dattablespace,
            datacl = EXCLUDED.datacl
          returning oid, datname, datdba, "encoding", datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl
       """.query(PgDatabaseRow.read).unique
  }
}
