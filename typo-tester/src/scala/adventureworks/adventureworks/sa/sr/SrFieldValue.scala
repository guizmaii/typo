/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package sr

import adventureworks.public.Name
import adventureworks.sales.salesreason.SalesreasonId
import java.time.LocalDateTime

sealed abstract class SrFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class SrFieldValue[T](name: String, value: T) extends SrFieldOrIdValue(name, value)

object SrFieldValue {
  case class id(override val value: Option[Int]) extends SrFieldValue("id", value)
  case class salesreasonid(override val value: Option[SalesreasonId]) extends SrFieldValue("salesreasonid", value)
  case class name(override val value: Option[Name]) extends SrFieldValue("name", value)
  case class reasontype(override val value: Option[Name]) extends SrFieldValue("reasontype", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends SrFieldValue("modifieddate", value)
}
