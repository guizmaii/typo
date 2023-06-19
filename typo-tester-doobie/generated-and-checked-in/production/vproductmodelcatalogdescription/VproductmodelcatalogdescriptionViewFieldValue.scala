/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package vproductmodelcatalogdescription

import adventureworks.production.productmodel.ProductmodelId
import adventureworks.public.Name
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class VproductmodelcatalogdescriptionViewFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VproductmodelcatalogdescriptionViewFieldValue[T](name: String, value: T) extends VproductmodelcatalogdescriptionViewFieldOrIdValue(name, value)

object VproductmodelcatalogdescriptionViewFieldValue {
  case class productmodelid(override val value: Option[ProductmodelId]) extends VproductmodelcatalogdescriptionViewFieldValue("productmodelid", value)
  case class name(override val value: Option[Name]) extends VproductmodelcatalogdescriptionViewFieldValue("name", value)
  case class Summary(override val value: Option[String]) extends VproductmodelcatalogdescriptionViewFieldValue("Summary", value)
  case class manufacturer(override val value: Option[String]) extends VproductmodelcatalogdescriptionViewFieldValue("manufacturer", value)
  case class copyright(override val value: Option[/* max 30 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("copyright", value)
  case class producturl(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("producturl", value)
  case class warrantyperiod(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("warrantyperiod", value)
  case class warrantydescription(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("warrantydescription", value)
  case class noofyears(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("noofyears", value)
  case class maintenancedescription(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("maintenancedescription", value)
  case class wheel(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("wheel", value)
  case class saddle(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("saddle", value)
  case class pedal(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("pedal", value)
  case class bikeframe(override val value: Option[String]) extends VproductmodelcatalogdescriptionViewFieldValue("bikeframe", value)
  case class crankset(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("crankset", value)
  case class pictureangle(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("pictureangle", value)
  case class picturesize(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("picturesize", value)
  case class productphotoid(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("productphotoid", value)
  case class material(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("material", value)
  case class color(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("color", value)
  case class productline(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("productline", value)
  case class style(override val value: Option[/* max 256 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("style", value)
  case class riderexperience(override val value: Option[/* max 1024 chars */ String]) extends VproductmodelcatalogdescriptionViewFieldValue("riderexperience", value)
  case class rowguid(override val value: Option[UUID]) extends VproductmodelcatalogdescriptionViewFieldValue("rowguid", value)
  case class modifieddate(override val value: Option[LocalDateTime]) extends VproductmodelcatalogdescriptionViewFieldValue("modifieddate", value)
}
