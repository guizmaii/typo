/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package password

import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class PasswordFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class PasswordFieldValue[T](name: String, value: T) extends PasswordFieldOrIdValue(name, value)

object PasswordFieldValue {
  case class businessentityid(override val value: BusinessentityId) extends PasswordFieldOrIdValue("businessentityid", value)
  case class passwordhash(override val value: /* max 128 chars */ String) extends PasswordFieldValue("passwordhash", value)
  case class passwordsalt(override val value: /* max 10 chars */ String) extends PasswordFieldValue("passwordsalt", value)
  case class rowguid(override val value: UUID) extends PasswordFieldValue("rowguid", value)
  case class modifieddate(override val value: LocalDateTime) extends PasswordFieldValue("modifieddate", value)
}
