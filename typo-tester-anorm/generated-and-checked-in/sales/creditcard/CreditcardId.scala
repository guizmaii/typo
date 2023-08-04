/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package creditcard

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `sales.creditcard` */
case class CreditcardId(value: Int) extends AnyVal
object CreditcardId {
  implicit lazy val arrayColumn: Column[Array[CreditcardId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[CreditcardId]] = implicitly[ToStatement[Array[Int]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[CreditcardId, Int] = Bijection[CreditcardId, Int](_.value)(CreditcardId.apply)
  implicit lazy val column: Column[CreditcardId] = implicitly[Column[Int]].map(CreditcardId.apply)
  implicit lazy val ordering: Ordering[CreditcardId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[CreditcardId] = new ParameterMetaData[CreditcardId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }
  implicit lazy val reads: Reads[CreditcardId] = Reads.IntReads.map(CreditcardId.apply)
  implicit lazy val toStatement: ToStatement[CreditcardId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit lazy val writes: Writes[CreditcardId] = Writes.IntWrites.contramap(_.value)
}
