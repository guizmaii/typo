/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package vproductmodelinstructions

import adventureworks.TypoXml
import adventureworks.production.productmodel.ProductmodelId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class VproductmodelinstructionsViewFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VproductmodelinstructionsViewFieldValue[T](name: String, value: T) extends VproductmodelinstructionsViewFieldOrIdValue(name, value)

object VproductmodelinstructionsViewFieldValue {
  case class productmodelid(override val value: Option[ProductmodelId]) extends VproductmodelinstructionsViewFieldValue("productmodelid", value)
  case class name(override val value: Option[Name]) extends VproductmodelinstructionsViewFieldValue("name", value)
  case class instructions(override val value: Option[TypoXml]) extends VproductmodelinstructionsViewFieldValue("instructions", value)
  case class LocationID(override val value: Option[Int]) extends VproductmodelinstructionsViewFieldValue("LocationID", value)
  case class SetupHours(override val value: Option[BigDecimal]) extends VproductmodelinstructionsViewFieldValue("SetupHours", value)
  case class MachineHours(override val value: Option[BigDecimal]) extends VproductmodelinstructionsViewFieldValue("MachineHours", value)
  case class LaborHours(override val value: Option[BigDecimal]) extends VproductmodelinstructionsViewFieldValue("LaborHours", value)
  case class LotSize(override val value: Option[Int]) extends VproductmodelinstructionsViewFieldValue("LotSize", value)
  case class Step(override val value: Option[/* max 1024 chars */ String]) extends VproductmodelinstructionsViewFieldValue("Step", value)
  case class rowguid(override val value: Option[UUID]) extends VproductmodelinstructionsViewFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends VproductmodelinstructionsViewFieldValue("modifieddate", value)
}
