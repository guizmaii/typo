/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_user_mapping

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `pg_catalog.pg_user_mapping` */
case class PgUserMappingId(value: /* oid */ Long) extends AnyVal
object PgUserMappingId {
  implicit val ordering: Ordering[PgUserMappingId] = Ordering.by(_.value)
  implicit val format: Format[PgUserMappingId] = implicitly[Format[/* oid */ Long]].bimap(PgUserMappingId.apply, _.value)
  implicit val toStatement: ToStatement[PgUserMappingId] = implicitly[ToStatement[/* oid */ Long]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[PgUserMappingId]] = implicitly[ToStatement[Array[/* oid */ Long]]].contramap(_.map(_.value))
  implicit val column: Column[PgUserMappingId] = implicitly[Column[/* oid */ Long]].map(PgUserMappingId.apply)
  implicit val parameterMetadata: ParameterMetaData[PgUserMappingId] = new ParameterMetaData[PgUserMappingId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* oid */ Long]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* oid */ Long]].jdbcType
  }

}
