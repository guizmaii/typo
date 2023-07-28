/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_enum

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `pg_catalog.pg_enum` */
case class PgEnumId(value: /* oid */ Long) extends AnyVal
object PgEnumId {
  implicit val ordering: Ordering[PgEnumId] = Ordering.by(_.value)
  implicit val format: Format[PgEnumId] = implicitly[Format[/* oid */ Long]].bimap(PgEnumId.apply, _.value)
  implicit val toStatement: ToStatement[PgEnumId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[PgEnumId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit val column: Column[PgEnumId] = implicitly[Column[/* oid */ Long]].map(PgEnumId.apply)
  implicit val parameterMetadata: ParameterMetaData[PgEnumId] = new ParameterMetaData[PgEnumId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }

}
