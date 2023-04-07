/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package ppp

import adventureworks.production.product.ProductId
import adventureworks.production.productphoto.ProductphotoId
import adventureworks.public.Flag
import java.time.LocalDateTime

sealed abstract class PppFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class PppFieldValue[T](name: String, value: T) extends PppFieldOrIdValue(name, value)

object PppFieldValue {
  case class productid(override val value: Option[ProductId]) extends PppFieldValue("productid", value)
  case class productphotoid(override val value: Option[ProductphotoId]) extends PppFieldValue("productphotoid", value)
  case class primary(override val value: Flag) extends PppFieldValue("primary", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends PppFieldValue("modifieddate", value)
}
