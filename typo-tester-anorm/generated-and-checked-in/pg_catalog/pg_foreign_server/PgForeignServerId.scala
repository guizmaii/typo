/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_server

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `pg_catalog.pg_foreign_server` */
case class PgForeignServerId(value: /* oid */ Long) extends AnyVal
object PgForeignServerId {
  implicit lazy val arrayColumn: Column[Array[PgForeignServerId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[PgForeignServerId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[PgForeignServerId, /* oid */ Long] = Bijection[PgForeignServerId, /* oid */ Long](_.value)(PgForeignServerId.apply)
  implicit lazy val column: Column[PgForeignServerId] = implicitly[Column[/* oid */ Long]].map(PgForeignServerId.apply)
  implicit lazy val ordering: Ordering[PgForeignServerId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[PgForeignServerId] = new ParameterMetaData[PgForeignServerId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }
  implicit lazy val reads: Reads[PgForeignServerId] = Reads.LongReads.map(PgForeignServerId.apply)
  implicit lazy val toStatement: ToStatement[PgForeignServerId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit lazy val writes: Writes[PgForeignServerId] = Writes.LongWrites.contramap(_.value)
}
