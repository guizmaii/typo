/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package public

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Domain `public.Flag`
  * No constraint
  */
case class Flag(value: Boolean) extends AnyVal
object Flag {
  implicit def ordering(implicit ev: Ordering[Boolean]): Ordering[Flag] = Ordering.by(_.value)
  implicit val format: Format[Flag] = implicitly[Format[Boolean]].bimap(Flag.apply, _.value)
  implicit val toStatement: ToStatement[Flag] = implicitly[ToStatement[Boolean]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[Flag]] = implicitly[ToStatement[Array[Boolean]]].contramap(_.map(_.value))
  implicit val column: Column[Flag] = implicitly[Column[Boolean]].map(Flag.apply)
  implicit val parameterMetadata: ParameterMetaData[Flag] = new ParameterMetaData[Flag] {
    override def sqlType: String = implicitly[ParameterMetaData[Boolean]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Boolean]].jdbcType
  }

}
