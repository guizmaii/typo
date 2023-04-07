/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package tr

import adventureworks.person.stateprovince.StateprovinceId
import adventureworks.sales.salestaxrate.SalestaxrateId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class TrFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class TrFieldValue[T](name: String, value: T) extends TrFieldOrIdValue(name, value)

object TrFieldValue {
  case class id(override val value: Option[Int]) extends TrFieldValue("id", value)
  case class salestaxrateid(override val value: Option[SalestaxrateId]) extends TrFieldValue("salestaxrateid", value)
  case class stateprovinceid(override val value: Option[StateprovinceId]) extends TrFieldValue("stateprovinceid", value)
  case class taxtype(override val value: Option[Int]) extends TrFieldValue("taxtype", value)
  case class taxrate(override val value: Option[BigDecimal]) extends TrFieldValue("taxrate", value)
  case class name(override val value: Option[String]) extends TrFieldValue("name", value)
  case class rowguid(override val value: Option[UUID]) extends TrFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends TrFieldValue("modifieddate", value)
}
