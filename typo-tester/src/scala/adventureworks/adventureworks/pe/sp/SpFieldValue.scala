/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package sp

import adventureworks.person.countryregion.CountryregionId
import adventureworks.person.stateprovince.StateprovinceId
import adventureworks.sales.salesterritory.SalesterritoryId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class SpFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class SpFieldValue[T](name: String, value: T) extends SpFieldOrIdValue(name, value)

object SpFieldValue {
  case class id(override val value: Option[Int]) extends SpFieldValue("id", value)
  case class stateprovinceid(override val value: Option[StateprovinceId]) extends SpFieldValue("stateprovinceid", value)
  case class stateprovincecode(override val value: Option[String]) extends SpFieldValue("stateprovincecode", value)
  case class countryregioncode(override val value: Option[CountryregionId]) extends SpFieldValue("countryregioncode", value)
  case class isonlystateprovinceflag(override val value: Boolean) extends SpFieldValue("isonlystateprovinceflag", value)
  case class name(override val value: Option[String]) extends SpFieldValue("name", value)
  case class territoryid(override val value: Option[SalesterritoryId]) extends SpFieldValue("territoryid", value)
  case class rowguid(override val value: Option[UUID]) extends SpFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends SpFieldValue("modifieddate", value)
}
