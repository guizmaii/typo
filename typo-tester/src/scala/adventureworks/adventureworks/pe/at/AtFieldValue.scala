/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package at

import adventureworks.person.addresstype.AddresstypeId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class AtFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class AtFieldValue[T](name: String, value: T) extends AtFieldOrIdValue(name, value)

object AtFieldValue {
  case class id(override val value: Option[Int]) extends AtFieldValue("id", value)
  case class addresstypeid(override val value: Option[AddresstypeId]) extends AtFieldValue("addresstypeid", value)
  case class name(override val value: Option[Name]) extends AtFieldValue("name", value)
  case class rowguid(override val value: Option[UUID]) extends AtFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends AtFieldValue("modifieddate", value)
}
