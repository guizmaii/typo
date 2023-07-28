/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_partitioned_table

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgPartitionedTableRepoImpl extends PgPartitionedTableRepo {
  override def delete(partrelid: PgPartitionedTableId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_partitioned_table where partrelid = $partrelid".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgPartitionedTableRow): ConnectionIO[PgPartitionedTableRow] = {
    sql"""insert into pg_catalog.pg_partitioned_table(partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs)
          values (${unsaved.partrelid}::oid, ${unsaved.partstrat}::char, ${unsaved.partnatts}::int2, ${unsaved.partdefid}::oid, ${unsaved.partattrs}::int2vector, ${unsaved.partclass}::oidvector, ${unsaved.partcollation}::oidvector, ${unsaved.partexprs}::pg_node_tree)
          returning partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs
       """.query[PgPartitionedTableRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgPartitionedTableRow] = {
    sql"select partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs from pg_catalog.pg_partitioned_table".query[PgPartitionedTableRow].stream
  }
  override def selectById(partrelid: PgPartitionedTableId): ConnectionIO[Option[PgPartitionedTableRow]] = {
    sql"select partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs from pg_catalog.pg_partitioned_table where partrelid = $partrelid".query[PgPartitionedTableRow].option
  }
  override def selectByIds(partrelids: Array[PgPartitionedTableId]): Stream[ConnectionIO, PgPartitionedTableRow] = {
    sql"select partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs from pg_catalog.pg_partitioned_table where partrelid = ANY($partrelids)".query[PgPartitionedTableRow].stream
  }
  override def update(row: PgPartitionedTableRow): ConnectionIO[Boolean] = {
    val partrelid = row.partrelid
    sql"""update pg_catalog.pg_partitioned_table
          set partstrat = ${row.partstrat}::char,
              partnatts = ${row.partnatts}::int2,
              partdefid = ${row.partdefid}::oid,
              partattrs = ${row.partattrs}::int2vector,
              partclass = ${row.partclass}::oidvector,
              partcollation = ${row.partcollation}::oidvector,
              partexprs = ${row.partexprs}::pg_node_tree
          where partrelid = $partrelid
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgPartitionedTableRow): ConnectionIO[PgPartitionedTableRow] = {
    sql"""insert into pg_catalog.pg_partitioned_table(partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs)
          values (
            ${unsaved.partrelid}::oid,
            ${unsaved.partstrat}::char,
            ${unsaved.partnatts}::int2,
            ${unsaved.partdefid}::oid,
            ${unsaved.partattrs}::int2vector,
            ${unsaved.partclass}::oidvector,
            ${unsaved.partcollation}::oidvector,
            ${unsaved.partexprs}::pg_node_tree
          )
          on conflict (partrelid)
          do update set
            partstrat = EXCLUDED.partstrat,
            partnatts = EXCLUDED.partnatts,
            partdefid = EXCLUDED.partdefid,
            partattrs = EXCLUDED.partattrs,
            partclass = EXCLUDED.partclass,
            partcollation = EXCLUDED.partcollation,
            partexprs = EXCLUDED.partexprs
          returning partrelid, partstrat, partnatts, partdefid, partattrs, partclass, partcollation, partexprs
       """.query[PgPartitionedTableRow].unique
  }
}
