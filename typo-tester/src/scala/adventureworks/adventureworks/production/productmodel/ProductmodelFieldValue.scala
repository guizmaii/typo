/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productmodel

import java.time.LocalDateTime
import java.util.UUID

sealed abstract class ProductmodelFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class ProductmodelFieldValue[T](name: String, value: T) extends ProductmodelFieldOrIdValue(name, value)

object ProductmodelFieldValue {
  case class productmodelid(override val value: ProductmodelId) extends ProductmodelFieldOrIdValue("productmodelid", value)
  case class name(override val value: String) extends ProductmodelFieldValue("name", value)
  case class catalogdescription(override val value: Option[/* xml */ String]) extends ProductmodelFieldValue("catalogdescription", value)
  case class instructions(override val value: Option[/* xml */ String]) extends ProductmodelFieldValue("instructions", value)
  case class rowguid(override val value: UUID) extends ProductmodelFieldValue("rowguid", value)
  case class modifieddate(override val value: LocalDateTime) extends ProductmodelFieldValue("modifieddate", value)
}
