/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productphoto

import anorm.Column
import anorm.ParameterMetaData
import anorm.RowParser
import anorm.SqlParser
import anorm.ToStatement
import play.api.libs.json.Format

case class ProductphotoId(value: Int) extends AnyVal
object ProductphotoId {
  implicit val ordering: Ordering[ProductphotoId] = Ordering.by(_.value)
  implicit val format: Format[ProductphotoId] = implicitly[Format[Int]].bimap(ProductphotoId.apply, _.value)
  implicit val toStatement: ToStatement[ProductphotoId] = implicitly[ToStatement[Int]].contramap(_.value)
  implicit val column: Column[ProductphotoId] = implicitly[Column[Int]].map(ProductphotoId.apply)
  def rowParser(prefix: String): RowParser[ProductphotoId] = SqlParser.get[ProductphotoId](prefix + "productphotoid")
  implicit val parameterMetadata: ParameterMetaData[ProductphotoId] = new ParameterMetaData[ProductphotoId] {
    override def sqlType: String = implicitly[ParameterMetaData[Int]].sqlType
    override def jdbcType: Int = implicitly[ParameterMetaData[Int]].jdbcType
  }

}
