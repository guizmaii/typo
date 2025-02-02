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
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Domain `public.OrderNumber`
  * No constraint
  */
case class OrderNumber(value: String) extends AnyVal
object OrderNumber {
  implicit lazy val arrayColumn: Column[Array[OrderNumber]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[OrderNumber]] = ToStatement.arrayToParameter(ParameterMetaData.StringParameterMetaData).contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[OrderNumber, String] = Bijection[OrderNumber, String](_.value)(OrderNumber.apply)
  implicit lazy val column: Column[OrderNumber] = Column.columnToString.map(OrderNumber.apply)
  implicit lazy val ordering: Ordering[OrderNumber] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[OrderNumber] = new ParameterMetaData[OrderNumber] {
    override def sqlType: String = ParameterMetaData.StringParameterMetaData.sqlType
    override def jdbcType: Int = ParameterMetaData.StringParameterMetaData.jdbcType
  }
  implicit lazy val reads: Reads[OrderNumber] = Reads.StringReads.map(OrderNumber.apply)
  implicit lazy val toStatement: ToStatement[OrderNumber] = ToStatement.stringToStatement.contramap(_.value)
  implicit lazy val writes: Writes[OrderNumber] = Writes.StringWrites.contramap(_.value)
}