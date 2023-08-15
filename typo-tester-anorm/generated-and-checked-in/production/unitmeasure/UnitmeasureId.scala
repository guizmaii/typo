/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

import anorm.Column
import anorm.ParameterMetaData
import anorm.ToStatement
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import typo.dsl.Bijection

/** Type for the primary key of table `production.unitmeasure` */
case class UnitmeasureId(value: /* bpchar, max 3 chars */ String) extends AnyVal
object UnitmeasureId {
  implicit lazy val arrayColumn: Column[Array[UnitmeasureId]] = Column.columnToArray(column, implicitly)
  implicit lazy val arrayToStatement: ToStatement[Array[UnitmeasureId]] = implicitly[ToStatement[Array[/* bpchar, max 3 chars */ String]]].contramap(_.map(_.value))
  implicit lazy val bijection: Bijection[UnitmeasureId, /* bpchar, max 3 chars */ String] = Bijection[UnitmeasureId, /* bpchar, max 3 chars */ String](_.value)(UnitmeasureId.apply)
  implicit lazy val column: Column[UnitmeasureId] = implicitly[Column[/* bpchar, max 3 chars */ String]].map(UnitmeasureId.apply)
  implicit lazy val ordering: Ordering[UnitmeasureId] = Ordering.by(_.value)
  implicit lazy val parameterMetadata: ParameterMetaData[UnitmeasureId] = new ParameterMetaData[UnitmeasureId] {
    override def sqlType: String = implicitly[ParameterMetaData[/* bpchar, max 3 chars */ String]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[/* bpchar, max 3 chars */ String]].jdbcType
  }
  implicit lazy val reads: Reads[UnitmeasureId] = Reads.StringReads.map(UnitmeasureId.apply)
  implicit lazy val toStatement: ToStatement[UnitmeasureId] = implicitly[ToStatement[/* bpchar, max 3 chars */ String]].contramap(_.value)
  implicit lazy val writes: Writes[UnitmeasureId] = Writes.StringWrites.contramap(_.value)
}
