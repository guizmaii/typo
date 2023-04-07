/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog
package pg_collation

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `pg_catalog.pg_collation` */
case class PgCollationId(value: /* oid */ Long) extends AnyVal
object PgCollationId {
  implicit val ordering: Ordering[PgCollationId] = Ordering.by(_.value)
  implicit val format: Format[PgCollationId] = implicitly[Format[/* oid */ Long]].bimap(PgCollationId.apply, _.value)
  implicit val toStatement: ToStatement[PgCollationId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit val column: Column[PgCollationId] = implicitly[Column[/* oid */ Long]].map(PgCollationId.apply)
  implicit val parameterMetadata: ParameterMetaData[PgCollationId] = new ParameterMetaData[PgCollationId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }

}
