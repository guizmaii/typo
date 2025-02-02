/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package transactionhistory

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `production.transactionhistory` */
case class TransactionhistoryId(value: Int) extends AnyVal
object TransactionhistoryId {
  implicit lazy val arrayColumn: Column[Array[TransactionhistoryId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[TransactionhistoryId]] = adventureworks.IntArrayToStatement.contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[TransactionhistoryId, Int] = Bijection[TransactionhistoryId, Int](_.value)(TransactionhistoryId.apply)
  implicit lazy val column: Column[TransactionhistoryId] = Column.columnToInt.map(TransactionhistoryId.apply)
  implicit lazy val ordering: Ordering[TransactionhistoryId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[TransactionhistoryId] = new ParameterMetaData[TransactionhistoryId] {
    override def sqlType: String = ParameterMetaData.IntParameterMetaData.sqlType
    override def jdbcType: Int = ParameterMetaData.IntParameterMetaData.jdbcType
  }
  implicit lazy val reads: Reads[TransactionhistoryId] = Reads.IntReads.map(TransactionhistoryId.apply)
  implicit lazy val toStatement: ToStatement[TransactionhistoryId] = ToStatement.intToStatement.contramap(_.value)
  implicit lazy val writes: Writes[TransactionhistoryId] = Writes.IntWrites.contramap(_.value)
}
