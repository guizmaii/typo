/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package transactionhistoryarchive

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `production.transactionhistoryarchive` */
case class TransactionhistoryarchiveId(value: Int) extends AnyVal
object TransactionhistoryarchiveId {
  implicit lazy val arrayColumn: Column[Array[TransactionhistoryarchiveId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[TransactionhistoryarchiveId]] = implicitly[ToStatement[Array[Int]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[TransactionhistoryarchiveId, Int] = Bijection[TransactionhistoryarchiveId, Int](_.value)(TransactionhistoryarchiveId.apply)
  implicit lazy val column: Column[TransactionhistoryarchiveId] = implicitly[Column[Int]].map(TransactionhistoryarchiveId.apply)
  implicit lazy val ordering: Ordering[TransactionhistoryarchiveId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[TransactionhistoryarchiveId] = new ParameterMetaData[TransactionhistoryarchiveId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }
  implicit lazy val reads: Reads[TransactionhistoryarchiveId] = Reads.IntReads.map(TransactionhistoryarchiveId.apply)
  implicit lazy val toStatement: ToStatement[TransactionhistoryarchiveId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit lazy val writes: Writes[TransactionhistoryarchiveId] = Writes.IntWrites.contramap(_.value)
}
