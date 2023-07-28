/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritory

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `sales.salesterritory` */
case class SalesterritoryId(value: Int) extends AnyVal
object SalesterritoryId {
  implicit val ordering: Ordering[SalesterritoryId] = Ordering.by(_.value)
  implicit val format: Format[SalesterritoryId] = implicitly[Format[Int]].bimap(SalesterritoryId.apply, _.value)
  implicit val toStatement: ToStatement[SalesterritoryId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val toStatementArray: ToStatement[Array[SalesterritoryId]] = implicitly[ToStatement[Array[Int]]].contramap(_.map(_.value))
  implicit val column: Column[SalesterritoryId] = implicitly[Column[Int]].map(SalesterritoryId.apply)
  implicit val parameterMetadata: ParameterMetaData[SalesterritoryId] = new ParameterMetaData[SalesterritoryId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
