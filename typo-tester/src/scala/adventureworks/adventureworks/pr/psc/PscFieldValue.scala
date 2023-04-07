/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package psc

import adventureworks.production.productcategory.ProductcategoryId
import adventureworks.production.productsubcategory.ProductsubcategoryId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class PscFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class PscFieldValue[T](name: String, value: T) extends PscFieldOrIdValue(name, value)

object PscFieldValue {
  case class id(override val value: Option[Int]) extends PscFieldValue("id", value)
  case class productsubcategoryid(override val value: Option[ProductsubcategoryId]) extends PscFieldValue("productsubcategoryid", value)
  case class productcategoryid(override val value: Option[ProductcategoryId]) extends PscFieldValue("productcategoryid", value)
  case class name(override val value: Option[String]) extends PscFieldValue("name", value)
  case class rowguid(override val value: Option[UUID]) extends PscFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends PscFieldValue("modifieddate", value)
}
