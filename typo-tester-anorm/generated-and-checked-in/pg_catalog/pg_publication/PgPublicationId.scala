/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_publication

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `pg_catalog.pg_publication` */
case class PgPublicationId(value: /* oid */ Long) extends AnyVal
object PgPublicationId {
  implicit val ordering: Ordering[PgPublicationId] = Ordering.by(_.value)
  implicit val format: Format[PgPublicationId] = implicitly[Format[/* oid */ Long]].bimap(PgPublicationId.apply, _.value)
  implicit val toStatement: ToStatement[PgPublicationId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[PgPublicationId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit val column: Column[PgPublicationId] = implicitly[Column[/* oid */ Long]].map(PgPublicationId.apply)
  implicit val parameterMetadata: ParameterMetaData[PgPublicationId] = new ParameterMetaData[PgPublicationId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }

}
