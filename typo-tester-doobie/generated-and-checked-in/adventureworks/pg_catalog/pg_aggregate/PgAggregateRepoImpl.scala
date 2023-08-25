/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_aggregate

import adventureworks.customtypes.TypoRegproc
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

object PgAggregateRepoImpl extends PgAggregateRepo {
  override def delete(aggfnoid: PgAggregateId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_aggregate where aggfnoid = ${fromWrite(aggfnoid)(Write.fromPut(PgAggregateId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[PgAggregateFields, PgAggregateRow] = {
    DeleteBuilder("pg_catalog.pg_aggregate", PgAggregateFields)
  }
  override def insert(unsaved: PgAggregateRow): ConnectionIO[PgAggregateRow] = {
    sql"""insert into pg_catalog.pg_aggregate(aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval)
          values (${fromWrite(unsaved.aggfnoid)(Write.fromPut(PgAggregateId.put))}::regproc, ${fromWrite(unsaved.aggkind)(Write.fromPut(Meta.StringMeta.put))}::char, ${fromWrite(unsaved.aggnumdirectargs)(Write.fromPut(Meta.IntMeta.put))}::int2, ${fromWrite(unsaved.aggtransfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggcombinefn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggserialfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggdeserialfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggmtransfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggminvtransfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggmfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc, ${fromWrite(unsaved.aggfinalextra)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.aggmfinalextra)(Write.fromPut(Meta.BooleanMeta.put))}, ${fromWrite(unsaved.aggfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char, ${fromWrite(unsaved.aggmfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char, ${fromWrite(unsaved.aggsortop)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.aggtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.aggtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4, ${fromWrite(unsaved.aggmtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid, ${fromWrite(unsaved.aggmtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4, ${fromWrite(unsaved.agginitval)(Write.fromPutOption(Meta.StringMeta.put))}, ${fromWrite(unsaved.aggminitval)(Write.fromPutOption(Meta.StringMeta.put))})
          returning aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval
       """.query(PgAggregateRow.read).unique
  }
  override def select: SelectBuilder[PgAggregateFields, PgAggregateRow] = {
    SelectBuilderSql("pg_catalog.pg_aggregate", PgAggregateFields, PgAggregateRow.read)
  }
  override def selectAll: Stream[ConnectionIO, PgAggregateRow] = {
    sql"select aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval from pg_catalog.pg_aggregate".query(PgAggregateRow.read).stream
  }
  override def selectById(aggfnoid: PgAggregateId): ConnectionIO[Option[PgAggregateRow]] = {
    sql"select aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval from pg_catalog.pg_aggregate where aggfnoid = ${fromWrite(aggfnoid)(Write.fromPut(PgAggregateId.put))}".query(PgAggregateRow.read).option
  }
  override def selectByIds(aggfnoids: Array[PgAggregateId]): Stream[ConnectionIO, PgAggregateRow] = {
    sql"select aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval from pg_catalog.pg_aggregate where aggfnoid = ANY(${aggfnoids})".query(PgAggregateRow.read).stream
  }
  override def update(row: PgAggregateRow): ConnectionIO[Boolean] = {
    val aggfnoid = row.aggfnoid
    sql"""update pg_catalog.pg_aggregate
          set aggkind = ${fromWrite(row.aggkind)(Write.fromPut(Meta.StringMeta.put))}::char,
              aggnumdirectargs = ${fromWrite(row.aggnumdirectargs)(Write.fromPut(Meta.IntMeta.put))}::int2,
              aggtransfn = ${fromWrite(row.aggtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggfinalfn = ${fromWrite(row.aggfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggcombinefn = ${fromWrite(row.aggcombinefn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggserialfn = ${fromWrite(row.aggserialfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggdeserialfn = ${fromWrite(row.aggdeserialfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggmtransfn = ${fromWrite(row.aggmtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggminvtransfn = ${fromWrite(row.aggminvtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggmfinalfn = ${fromWrite(row.aggmfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc,
              aggfinalextra = ${fromWrite(row.aggfinalextra)(Write.fromPut(Meta.BooleanMeta.put))},
              aggmfinalextra = ${fromWrite(row.aggmfinalextra)(Write.fromPut(Meta.BooleanMeta.put))},
              aggfinalmodify = ${fromWrite(row.aggfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char,
              aggmfinalmodify = ${fromWrite(row.aggmfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char,
              aggsortop = ${fromWrite(row.aggsortop)(Write.fromPut(Meta.LongMeta.put))}::oid,
              aggtranstype = ${fromWrite(row.aggtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid,
              aggtransspace = ${fromWrite(row.aggtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4,
              aggmtranstype = ${fromWrite(row.aggmtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid,
              aggmtransspace = ${fromWrite(row.aggmtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4,
              agginitval = ${fromWrite(row.agginitval)(Write.fromPutOption(Meta.StringMeta.put))},
              aggminitval = ${fromWrite(row.aggminitval)(Write.fromPutOption(Meta.StringMeta.put))}
          where aggfnoid = ${fromWrite(aggfnoid)(Write.fromPut(PgAggregateId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[PgAggregateFields, PgAggregateRow] = {
    UpdateBuilder("pg_catalog.pg_aggregate", PgAggregateFields, PgAggregateRow.read)
  }
  override def upsert(unsaved: PgAggregateRow): ConnectionIO[PgAggregateRow] = {
    sql"""insert into pg_catalog.pg_aggregate(aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval)
          values (
            ${fromWrite(unsaved.aggfnoid)(Write.fromPut(PgAggregateId.put))}::regproc,
            ${fromWrite(unsaved.aggkind)(Write.fromPut(Meta.StringMeta.put))}::char,
            ${fromWrite(unsaved.aggnumdirectargs)(Write.fromPut(Meta.IntMeta.put))}::int2,
            ${fromWrite(unsaved.aggtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggcombinefn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggserialfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggdeserialfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggmtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggminvtransfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggmfinalfn)(Write.fromPut(TypoRegproc.put))}::regproc,
            ${fromWrite(unsaved.aggfinalextra)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.aggmfinalextra)(Write.fromPut(Meta.BooleanMeta.put))},
            ${fromWrite(unsaved.aggfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char,
            ${fromWrite(unsaved.aggmfinalmodify)(Write.fromPut(Meta.StringMeta.put))}::char,
            ${fromWrite(unsaved.aggsortop)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.aggtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.aggtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4,
            ${fromWrite(unsaved.aggmtranstype)(Write.fromPut(Meta.LongMeta.put))}::oid,
            ${fromWrite(unsaved.aggmtransspace)(Write.fromPut(Meta.IntMeta.put))}::int4,
            ${fromWrite(unsaved.agginitval)(Write.fromPutOption(Meta.StringMeta.put))},
            ${fromWrite(unsaved.aggminitval)(Write.fromPutOption(Meta.StringMeta.put))}
          )
          on conflict (aggfnoid)
          do update set
            aggkind = EXCLUDED.aggkind,
            aggnumdirectargs = EXCLUDED.aggnumdirectargs,
            aggtransfn = EXCLUDED.aggtransfn,
            aggfinalfn = EXCLUDED.aggfinalfn,
            aggcombinefn = EXCLUDED.aggcombinefn,
            aggserialfn = EXCLUDED.aggserialfn,
            aggdeserialfn = EXCLUDED.aggdeserialfn,
            aggmtransfn = EXCLUDED.aggmtransfn,
            aggminvtransfn = EXCLUDED.aggminvtransfn,
            aggmfinalfn = EXCLUDED.aggmfinalfn,
            aggfinalextra = EXCLUDED.aggfinalextra,
            aggmfinalextra = EXCLUDED.aggmfinalextra,
            aggfinalmodify = EXCLUDED.aggfinalmodify,
            aggmfinalmodify = EXCLUDED.aggmfinalmodify,
            aggsortop = EXCLUDED.aggsortop,
            aggtranstype = EXCLUDED.aggtranstype,
            aggtransspace = EXCLUDED.aggtransspace,
            aggmtranstype = EXCLUDED.aggmtranstype,
            aggmtransspace = EXCLUDED.aggmtransspace,
            agginitval = EXCLUDED.agginitval,
            aggminitval = EXCLUDED.aggminitval
          returning aggfnoid, aggkind, aggnumdirectargs, aggtransfn, aggfinalfn, aggcombinefn, aggserialfn, aggdeserialfn, aggmtransfn, aggminvtransfn, aggmfinalfn, aggfinalextra, aggmfinalextra, aggfinalmodify, aggmfinalmodify, aggsortop, aggtranstype, aggtransspace, aggmtranstype, aggmtransspace, agginitval, aggminitval
       """.query(PgAggregateRow.read).unique
  }
}
