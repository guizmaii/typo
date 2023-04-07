/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package information_schema

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Domain `information_schema.sql_identifier`
  * No constraint
  */
case class SqlIdentifierDomain(value: String) extends AnyVal
object SqlIdentifierDomain {
  implicit def ordering(implicit ev: Ordering[String]): Ordering[SqlIdentifierDomain] = Ordering.by(_.value)
  implicit val format: Format[SqlIdentifierDomain] = implicitly[Format[String]].bimap(SqlIdentifierDomain.apply, _.value)
  implicit val toStatement: ToStatement[SqlIdentifierDomain] = implicitly[ToStatement[String]].contramap(_.value)
  implicit val column: Column[SqlIdentifierDomain] = implicitly[Column[String]].map(SqlIdentifierDomain.apply)
  implicit val parameterMetadata: ParameterMetaData[SqlIdentifierDomain] = new ParameterMetaData[SqlIdentifierDomain] {
    override def sqlType: String = implicitly[ParameterMetaData[String]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[String]].jdbcType
  }

}
