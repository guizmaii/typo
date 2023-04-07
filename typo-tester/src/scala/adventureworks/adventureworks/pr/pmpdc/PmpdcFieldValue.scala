/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package pmpdc

import adventureworks.production.culture.CultureId
import adventureworks.production.productdescription.ProductdescriptionId
import adventureworks.production.productmodel.ProductmodelId
import java.time.LocalDateTime

sealed abstract class PmpdcFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class PmpdcFieldValue[T](name: String, value: T) extends PmpdcFieldOrIdValue(name, value)

object PmpdcFieldValue {
  case class productmodelid(override val value: Option[ProductmodelId]) extends PmpdcFieldValue("productmodelid", value)
  case class productdescriptionid(override val value: Option[ProductdescriptionId]) extends PmpdcFieldValue("productdescriptionid", value)
  case class cultureid(override val value: Option[CultureId]) extends PmpdcFieldValue("cultureid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends PmpdcFieldValue("modifieddate", value)
}
