/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesorderheader

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `sales.salesorderheader` */
case class SalesorderheaderId(value: Int) extends AnyVal
object SalesorderheaderId {
  implicit val ordering: Ordering[SalesorderheaderId] = Ordering.by(_.value)
  implicit val format: Format[SalesorderheaderId] = implicitly[Format[Int]].bimap(SalesorderheaderId.apply, _.value)
  implicit val toStatement: ToStatement[SalesorderheaderId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[SalesorderheaderId] = implicitly[Column[Int]].map(SalesorderheaderId.apply)
  implicit val parameterMetadata: ParameterMetaData[SalesorderheaderId] = new ParameterMetaData[SalesorderheaderId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
