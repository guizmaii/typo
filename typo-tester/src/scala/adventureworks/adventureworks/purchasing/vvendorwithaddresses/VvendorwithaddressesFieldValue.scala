/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vvendorwithaddresses

import adventureworks.person.businessentity.BusinessentityId

sealed abstract class VvendorwithaddressesFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VvendorwithaddressesFieldValue[T](name: String, value: T) extends VvendorwithaddressesFieldOrIdValue(name, value)

object VvendorwithaddressesFieldValue {
  case class businessentityid(override val value: Option[BusinessentityId]) extends VvendorwithaddressesFieldValue("businessentityid", value)
  case class name(override val value: Option[String]) extends VvendorwithaddressesFieldValue("name", value)
  case class addresstype(override val value: Option[String]) extends VvendorwithaddressesFieldValue("addresstype", value)
  case class addressline1(override val value: Option[String]) extends VvendorwithaddressesFieldValue("addressline1", value)
  case class addressline2(override val value: Option[String]) extends VvendorwithaddressesFieldValue("addressline2", value)
  case class city(override val value: Option[String]) extends VvendorwithaddressesFieldValue("city", value)
  case class stateprovincename(override val value: Option[String]) extends VvendorwithaddressesFieldValue("stateprovincename", value)
  case class postalcode(override val value: Option[String]) extends VvendorwithaddressesFieldValue("postalcode", value)
  case class countryregionname(override val value: Option[String]) extends VvendorwithaddressesFieldValue("countryregionname", value)
}
