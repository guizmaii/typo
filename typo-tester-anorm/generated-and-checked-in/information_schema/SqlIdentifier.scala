/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Domain `information_schema.sql_identifier`
  * No constraint
  */
case class SqlIdentifier(value: String) extends AnyVal
object SqlIdentifier {
  implicit def ordering(implicit ev: Ordering[String]): Ordering[SqlIdentifier] = Ordering.by(_.value)
  implicit val format: Format[SqlIdentifier] = implicitly[Format[String]].bimap(SqlIdentifier.apply, _.value)
  implicit val toStatement: ToStatement[SqlIdentifier] = implicitly[ToStatement[String]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[SqlIdentifier]] = implicitly[ToStatement[Array[String]]].contramap(_.map(_.value))
  implicit val column: Column[SqlIdentifier] = implicitly[Column[String]].map(SqlIdentifier.apply)
  implicit val parameterMetadata: ParameterMetaData[SqlIdentifier] = new ParameterMetaData[SqlIdentifier] {
    override def sqlType: String = implicitly[ParameterMetaData[String]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[String]].jdbcType
  }

}
