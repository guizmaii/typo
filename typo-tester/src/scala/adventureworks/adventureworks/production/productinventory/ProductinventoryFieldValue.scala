/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productinventory

import adventureworks.production.location.LocationId
import adventureworks.production.product.ProductId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class ProductinventoryFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class ProductinventoryFieldValue[T](name: String, value: T) extends ProductinventoryFieldOrIdValue(name, value)

object ProductinventoryFieldValue {
  case class productid(override val value: ProductId) extends ProductinventoryFieldOrIdValue("productid", value)
  case class locationid(override val value: LocationId) extends ProductinventoryFieldOrIdValue("locationid", value)
  case class shelf(override val value: String) extends ProductinventoryFieldValue("shelf", value)
  case class bin(override val value: Int) extends ProductinventoryFieldValue("bin", value)
  case class quantity(override val value: Int) extends ProductinventoryFieldValue("quantity", value)
  case class rowguid(override val value: UUID) extends ProductinventoryFieldValue("rowguid", value)
  case class modifieddate(override val value: LocalDateTime) extends ProductinventoryFieldValue("modifieddate", value)
}
