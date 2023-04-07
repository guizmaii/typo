/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesreason

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `sales.salesreason` */
case class SalesreasonId(value: Int) extends AnyVal
object SalesreasonId {
  implicit val ordering: Ordering[SalesreasonId] = Ordering.by(_.value)
  implicit val format: Format[SalesreasonId] = implicitly[Format[Int]].bimap(SalesreasonId.apply, _.value)
  implicit val toStatement: ToStatement[SalesreasonId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[SalesreasonId] = implicitly[Column[Int]].map(SalesreasonId.apply)
  implicit val parameterMetadata: ParameterMetaData[SalesreasonId] = new ParameterMetaData[SalesreasonId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
