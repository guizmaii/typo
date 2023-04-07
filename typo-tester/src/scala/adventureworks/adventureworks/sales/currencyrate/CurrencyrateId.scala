/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currencyrate

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Format

/** Type for the primary key of table `sales.currencyrate` */
case class CurrencyrateId(value: Int) extends AnyVal
object CurrencyrateId {
  implicit val ordering: Ordering[CurrencyrateId] = Ordering.by(_.value)
  implicit val format: Format[CurrencyrateId] = implicitly[Format[Int]].bimap(CurrencyrateId.apply, _.value)
  implicit val toStatement: ToStatement[CurrencyrateId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[CurrencyrateId] = implicitly[Column[Int]].map(CurrencyrateId.apply)
  implicit val parameterMetadata: ParameterMetaData[CurrencyrateId] = new ParameterMetaData[CurrencyrateId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
