/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_am

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `pg_catalog.pg_am` */
case class PgAmId(value: /* oid */ Long) extends AnyVal
object PgAmId {
  implicit lazy val arrayColumn: Column[Array[PgAmId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[PgAmId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[PgAmId, /* oid */ Long] = Bijection[PgAmId, /* oid */ Long](_.value)(PgAmId.apply)
  implicit lazy val column: Column[PgAmId] = implicitly[Column[/* oid */ Long]].map(PgAmId.apply)
  implicit lazy val ordering: Ordering[PgAmId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[PgAmId] = new ParameterMetaData[PgAmId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }
  implicit lazy val reads: Reads[PgAmId] = Reads.LongReads.map(PgAmId.apply)
  implicit lazy val toStatement: ToStatement[PgAmId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit lazy val writes: Writes[PgAmId] = Writes.LongWrites.contramap(_.value)
}
