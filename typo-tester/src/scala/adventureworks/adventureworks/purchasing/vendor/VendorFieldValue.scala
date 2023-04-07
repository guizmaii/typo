/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vendor

import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime

sealed abstract class VendorFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VendorFieldValue[T](name: String, value: T) extends VendorFieldOrIdValue(name, value)

object VendorFieldValue {
  case class businessentityid(override val value: BusinessentityId) extends VendorFieldOrIdValue("businessentityid", value)
  case class accountnumber(override val value: String) extends VendorFieldValue("accountnumber", value)
  case class name(override val value: String) extends VendorFieldValue("name", value)
  case class creditrating(override val value: Int) extends VendorFieldValue("creditrating", value)
  case class preferredvendorstatus(override val value: Boolean) extends VendorFieldValue("preferredvendorstatus", value)
  case class activeflag(override val value: Boolean) extends VendorFieldValue("activeflag", value)
  case class purchasingwebserviceurl(override val value: Option[String]) extends VendorFieldValue("purchasingwebserviceurl", value)
  case class modifieddate(override val value: LocalDateTime) extends VendorFieldValue("modifieddate", value)
}
