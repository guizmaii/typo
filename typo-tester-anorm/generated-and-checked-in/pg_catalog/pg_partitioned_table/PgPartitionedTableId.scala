/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_partitioned_table

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `pg_catalog.pg_partitioned_table` */
case class PgPartitionedTableId(value: /* oid */ Long) extends AnyVal
object PgPartitionedTableId {
  implicit lazy val arrayColumn: Column[Array[PgPartitionedTableId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[PgPartitionedTableId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[PgPartitionedTableId, /* oid */ Long] = Bijection[PgPartitionedTableId, /* oid */ Long](_.value)(PgPartitionedTableId.apply)
  implicit lazy val column: Column[PgPartitionedTableId] = implicitly[Column[/* oid */ Long]].map(PgPartitionedTableId.apply)
  implicit lazy val ordering: Ordering[PgPartitionedTableId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[PgPartitionedTableId] = new ParameterMetaData[PgPartitionedTableId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }
  implicit lazy val reads: Reads[PgPartitionedTableId] = Reads.LongReads.map(PgPartitionedTableId.apply)
  implicit lazy val toStatement: ToStatement[PgPartitionedTableId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit lazy val writes: Writes[PgPartitionedTableId] = Writes.LongWrites.contramap(_.value)
}
