/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_authid

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `pg_catalog.pg_authid` */
case class PgAuthidId(value: /* oid */ Long) extends AnyVal
object PgAuthidId {
  implicit lazy val arrayColumn: Column[Array[PgAuthidId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[PgAuthidId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[PgAuthidId, /* oid */ Long] = Bijection[PgAuthidId, /* oid */ Long](_.value)(PgAuthidId.apply)
  implicit lazy val column: Column[PgAuthidId] = implicitly[Column[/* oid */ Long]].map(PgAuthidId.apply)
  implicit lazy val ordering: Ordering[PgAuthidId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[PgAuthidId] = new ParameterMetaData[PgAuthidId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }
  implicit lazy val reads: Reads[PgAuthidId] = Reads.LongReads.map(PgAuthidId.apply)
  implicit lazy val toStatement: ToStatement[PgAuthidId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit lazy val writes: Writes[PgAuthidId] = Writes.LongWrites.contramap(_.value)
}
