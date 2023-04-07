/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package pnt

import adventureworks.person.phonenumbertype.PhonenumbertypeId
import java.time.LocalDateTime

sealed abstract class PntFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class PntFieldValue[T](name: String, value: T) extends PntFieldOrIdValue(name, value)

object PntFieldValue {
  case class id(override val value: Option[Int]) extends PntFieldValue("id", value)
  case class phonenumbertypeid(override val value: Option[PhonenumbertypeId]) extends PntFieldValue("phonenumbertypeid", value)
  case class name(override val value: Option[String]) extends PntFieldValue("name", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends PntFieldValue("modifieddate", value)
}
