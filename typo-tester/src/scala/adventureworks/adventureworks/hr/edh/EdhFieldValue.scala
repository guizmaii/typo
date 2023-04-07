/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package edh

import adventureworks.humanresources.department.DepartmentId
import adventureworks.humanresources.shift.ShiftId
import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDate
import java.time.LocalDateTime

sealed abstract class EdhFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class EdhFieldValue[T](name: String, value: T) extends EdhFieldOrIdValue(name, value)

object EdhFieldValue {
  case class id(override val value: Option[Int]) extends EdhFieldValue("id", value)
  case class businessentityid(override val value: Option[BusinessentityId]) extends EdhFieldValue("businessentityid", value)
  case class departmentid(override val value: Option[DepartmentId]) extends EdhFieldValue("departmentid", value)
  case class shiftid(override val value: Option[ShiftId]) extends EdhFieldValue("shiftid", value)
  case class startdate(override val value: Option[LocalDate]) extends EdhFieldValue("startdate", value)
  case class enddate(override val value: Option[LocalDate]) extends EdhFieldValue("enddate", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends EdhFieldValue("modifieddate", value)
}
