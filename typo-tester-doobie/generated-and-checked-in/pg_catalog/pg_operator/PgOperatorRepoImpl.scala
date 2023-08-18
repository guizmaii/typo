/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_operator

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

object PgOperatorRepoImpl extends PgOperatorRepo {
  override def delete(oid: PgOperatorId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_operator where oid = ${fromWrite(oid)(Write.fromPut(PgOperatorId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[PgOperatorFields, PgOperatorRow] = {
    DeleteBuilder("pg_catalog.pg_operator", PgOperatorFields)
  }
  override def insert(unsaved: PgOperatorRow): ConnectionIO[PgOperatorRow] = {
    sql"""insert into pg_catalog.pg_operator(oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin)
          values (${fromWrite(unsaved.oid)(Write.fromPut(PgOperatorId.put))}::oid, ${fromWrite(unsaved.oprname)(Write.fromPut(Meta.StringMeta.put))}::name, ${fromWrite(unsaved.oprnamespace)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprowner)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprkind)(Write.fromPut(Meta.StringMeta.put))}::char, ${fromWrite(unsaved.oprcanmerge)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.oprcanhash)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.oprleft)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprright)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprresult)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprcom)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprnegate)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.oprcode)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.oprrest)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.oprjoin)(Write.fromPut(TypoRegproc.put))}::regproc)
          returning oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin
       """.query(PgOperatorRow.read).unique
  }
  override def select: SelectBuilder[PgOperatorFields, PgOperatorRow] = {
    SelectBuilderSql("pg_catalog.pg_operator", PgOperatorFields, PgOperatorRow.read)
  }
  override def selectAll: Stream[ConnectionIO, PgOperatorRow] = {
    sql"select oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin from pg_catalog.pg_operator".query(PgOperatorRow.read).stream
  }
  override def selectById(oid: PgOperatorId): ConnectionIO[Option[PgOperatorRow]] = {
    sql"select oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin from pg_catalog.pg_operator where oid = ${fromWrite(oid)(Write.fromPut(PgOperatorId.put))}".query(PgOperatorRow.read).option
  }
  override def selectByIds(oids: Array[PgOperatorId]): Stream[ConnectionIO, PgOperatorRow] = {
    sql"select oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin from pg_catalog.pg_operator where oid = ANY(${fromWrite(oids)(Write.fromPut(PgOperatorId.arrayPut))})".query(PgOperatorRow.read).stream
  }
  override def update(row: PgOperatorRow): ConnectionIO[Boolean] = {
    val oid = row.oid
    sql"""update pg_catalog.pg_operator
          set oprname = ${fromWrite(row.oprname)(Write.fromPut(Meta.StringMeta.put))}::name,
              oprnamespace = ${fromWrite(row.oprnamespace)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprowner = ${fromWrite(row.oprowner)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprkind = ${fromWrite(row.oprkind)(Write.fromPut(Meta.StringMeta.put))}::char,
              oprcanmerge = ${fromWrite(row.oprcanmerge)(Write.fromPut(Meta.BooleanMeta.put))},
              oprcanhash = ${fromWrite(row.oprcanhash)(Write.fromPut(Meta.BooleanMeta.put))},
              oprleft = ${fromWrite(row.oprleft)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprright = ${fromWrite(row.oprright)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprresult = ${fromWrite(row.oprresult)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprcom = ${fromWrite(row.oprcom)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprnegate = ${fromWrite(row.oprnegate)(Write.fromPut(Meta.LongMeta.put))}::oid,
              oprcode = ${fromWrite(row.oprcode)(Write.fromPut(TypoRegproc.put))}::regproc,
              oprrest = ${fromWrite(row.oprrest)(Write.fromPut(TypoRegproc.put))}::regproc,
              oprjoin = ${fromWrite(row.oprjoin)(Write.fromPut(TypoRegproc.put))}::regproc
          where oid = ${fromWrite(oid)(Write.fromPut(PgOperatorId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[PgOperatorFields, PgOperatorRow] = {
    UpdateBuilder("pg_catalog.pg_operator", PgOperatorFields, PgOperatorRow.read)
  }
  override def upsert(unsaved: PgOperatorRow): ConnectionIO[PgOperatorRow] = {
    sql"""insert into pg_catalog.pg_operator(oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin)
          values (
            ${fromWrite(unsaved.oid)(Write.fromPut(PgOperatorId.put))}::oid,
            ${fromWrite(unsaved.oprname)(Write.fromPut(Meta.StringMeta.put))}::name,
            ${fromWrite(unsaved.oprnamespace)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprowner)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprkind)(Write.fromPut(Meta.StringMeta.put))}::char,
            ${fromWrite(unsaved.oprcanmerge)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.oprcanhash)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.oprleft)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprright)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprresult)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprcom)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprnegate)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.oprcode)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.oprrest)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.oprjoin)(Write.fromPut(TypoRegproc.put))}::regproc
          )
          on conflict (oid)
          do update set
            oprname = EXCLUDED.oprname,
            oprnamespace = EXCLUDED.oprnamespace,
            oprowner = EXCLUDED.oprowner,
            oprkind = EXCLUDED.oprkind,
            oprcanmerge = EXCLUDED.oprcanmerge,
            oprcanhash = EXCLUDED.oprcanhash,
            oprleft = EXCLUDED.oprleft,
            oprright = EXCLUDED.oprright,
            oprresult = EXCLUDED.oprresult,
            oprcom = EXCLUDED.oprcom,
            oprnegate = EXCLUDED.oprnegate,
            oprcode = EXCLUDED.oprcode,
            oprrest = EXCLUDED.oprrest,
            oprjoin = EXCLUDED.oprjoin
          returning oid, oprname, oprnamespace, oprowner, oprkind, oprcanmerge, oprcanhash, oprleft, oprright, oprresult, oprcom, oprnegate, oprcode, oprrest, oprjoin
       """.query(PgOperatorRow.read).unique
  }
}
