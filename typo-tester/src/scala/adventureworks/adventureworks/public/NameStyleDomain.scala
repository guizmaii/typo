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

/** Domain `public.NameStyle`
  * No constraint
  */
case class NameStyleDomain(value: Boolean) extends AnyVal
object NameStyleDomain {
  implicit def ordering(implicit ev: Ordering[Boolean]): Ordering[NameStyleDomain] = Ordering.by(_.value)
  implicit val format: Format[NameStyleDomain] = implicitly[Format[Boolean]].bimap(NameStyleDomain.apply, _.value)
  implicit val toStatement: ToStatement[NameStyleDomain] = implicitly[ToStatement[Boolean]].contramap(_.value)
  implicit val column: Column[NameStyleDomain] = implicitly[Column[Boolean]].map(NameStyleDomain.apply)
  implicit val parameterMetadata: ParameterMetaData[NameStyleDomain] = new ParameterMetaData[NameStyleDomain] {
    override def sqlType: String = implicitly[ParameterMetaData[Boolean]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Boolean]].jdbcType
  }

}
