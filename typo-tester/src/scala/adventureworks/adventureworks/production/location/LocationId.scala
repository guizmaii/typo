/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package location

import anorm.Column
import anorm.ParameterMetaData
import anorm.RowParser
import anorm.SqlParser
import anorm.ToStatement
import play.api.libs.json.Format

case class LocationId(value: Int) extends AnyVal
object LocationId {
  implicit val ordering: Ordering[LocationId] = Ordering.by(_.value)
  implicit val format: Format[LocationId] = implicitly[Format[Int]].bimap(LocationId.apply, _.value)
  implicit val toStatement: ToStatement[LocationId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[LocationId] = implicitly[Column[Int]].map(LocationId.apply)
  def rowParser(prefix: String): RowParser[LocationId] = SqlParser.get[LocationId](prefix + "locationid")
  implicit val parameterMetadata: ParameterMetaData[LocationId] = new ParameterMetaData[LocationId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
