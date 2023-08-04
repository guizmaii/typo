/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package contacttype

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `person.contacttype` */
case class ContacttypeId(value: Int) extends AnyVal
object ContacttypeId {
  implicit lazy val arrayColumn: Column[Array[ContacttypeId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[ContacttypeId]] = implicitly[ToStatement[Array[Int]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[ContacttypeId, Int] = Bijection[ContacttypeId, Int](_.value)(ContacttypeId.apply)
  implicit lazy val column: Column[ContacttypeId] = implicitly[Column[Int]].map(ContacttypeId.apply)
  implicit lazy val ordering: Ordering[ContacttypeId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[ContacttypeId] = new ParameterMetaData[ContacttypeId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }
  implicit lazy val reads: Reads[ContacttypeId] = Reads.IntReads.map(ContacttypeId.apply)
  implicit lazy val toStatement: ToStatement[ContacttypeId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit lazy val writes: Writes[ContacttypeId] = Writes.IntWrites.contramap(_.value)
}
