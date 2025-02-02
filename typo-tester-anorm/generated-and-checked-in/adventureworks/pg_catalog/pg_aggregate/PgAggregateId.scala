/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_aggregate

import adventureworks.customtypes.TypoRegproc
import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `pg_catalog.pg_aggregate` */
case class PgAggregateId(value: TypoRegproc) extends AnyVal
object PgAggregateId {
  implicit lazy val arrayColumn: Column[Array[PgAggregateId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[PgAggregateId]] = TypoRegproc.arrayToStatement.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[PgAggregateId, TypoRegproc] = Bijection[PgAggregateId, TypoRegproc](_.value)(PgAggregateId.apply)
  implicit lazy val column: Column[PgAggregateId] = TypoRegproc.column.map(PgAggregateId.apply)
  implicit def ordering(implicit O0: Ordering[TypoRegproc]): Ordering[PgAggregateId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[PgAggregateId] = new ParameterMetaData[PgAggregateId] {
    override def sqlType: String = TypoRegproc.parameterMetadata.sqlType
    override def jdbcType: Int = TypoRegproc.parameterMetadata.jdbcType
  }
  implicit lazy val reads: Reads[PgAggregateId] = TypoRegproc.reads.map(PgAggregateId.apply)
  implicit lazy val toStatement: ToStatement[PgAggregateId] = TypoRegproc.toStatement.contramap(_.value)
  implicit lazy val writes: Writes[PgAggregateId] = TypoRegproc.writes.contramap(_.value)
}
