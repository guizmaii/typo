/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

import java.time.LocalDateTime

sealed abstract class UnitmeasureFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class UnitmeasureFieldValue[T](name: String, value: T) extends UnitmeasureFieldOrIdValue(name, value)

object UnitmeasureFieldValue {
  case class unitmeasurecode(override val value: UnitmeasureId) extends UnitmeasureFieldOrIdValue("unitmeasurecode", value)
  case class name(override val value: String) extends UnitmeasureFieldValue("name", value)
  case class modifieddate(override val value: LocalDateTime) extends UnitmeasureFieldValue("modifieddate", value)
}
