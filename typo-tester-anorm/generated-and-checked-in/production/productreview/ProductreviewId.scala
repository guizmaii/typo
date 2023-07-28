/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productreview

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `production.productreview` */
case class ProductreviewId(value: Int) extends AnyVal
object ProductreviewId {
  implicit val ordering: Ordering[ProductreviewId] = Ordering.by(_.value)
  implicit val format: Format[ProductreviewId] = implicitly[Format[Int]].bimap(ProductreviewId.apply, _.value)
  implicit val toStatement: ToStatement[ProductreviewId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[ProductreviewId]] = implicitly[ToStatement[Array[Int]]].contramap(_.map(_.value))
  implicit val column: Column[ProductreviewId] = implicitly[Column[Int]].map(ProductreviewId.apply)
  implicit val parameterMetadata: ParameterMetaData[ProductreviewId] = new ParameterMetaData[ProductreviewId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
