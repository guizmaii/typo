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
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `sales.salesreason` */
case class SalesreasonId(value: Int) extends AnyVal
object SalesreasonId {
  implicit lazy val arrayColumn: Column[Array[SalesreasonId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[SalesreasonId]] = adventureworks.IntArrayToStatement.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[SalesreasonId, Int] = Bijection[SalesreasonId, Int](_.value)(SalesreasonId.apply)
  implicit lazy val column: Column[SalesreasonId] = Column.columnToInt.map(SalesreasonId.apply)
  implicit lazy val ordering: Ordering[SalesreasonId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[SalesreasonId] = new ParameterMetaData[SalesreasonId] {
    override def sqlType: String = ParameterMetaData.IntParameterMetaData.sqlType
    override def jdbcType: Int = ParameterMetaData.IntParameterMetaData.jdbcType
  }
  implicit lazy val reads: Reads[SalesreasonId] = Reads.IntReads.map(SalesreasonId.apply)
  implicit lazy val toStatement: ToStatement[SalesreasonId] = ToStatement.intToStatement.contramap(_.value)
  implicit lazy val writes: Writes[SalesreasonId] = Writes.IntWrites.contramap(_.value)
}
