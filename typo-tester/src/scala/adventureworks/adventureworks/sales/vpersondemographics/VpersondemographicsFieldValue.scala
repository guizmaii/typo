/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vpersondemographics

import adventureworks.person.businessentity.BusinessentityId
import org.postgresql.util.PGmoney

sealed abstract class VpersondemographicsFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VpersondemographicsFieldValue[T](name: String, value: T) extends VpersondemographicsFieldOrIdValue(name, value)

object VpersondemographicsFieldValue {
  case class businessentityid(override val value: Option[BusinessentityId]) extends VpersondemographicsFieldValue("businessentityid", value)
  case class totalpurchaseytd(override val value: Option[PGmoney]) extends VpersondemographicsFieldValue("totalpurchaseytd", value)
  case class datefirstpurchase(override val value: Option[String]) extends VpersondemographicsFieldValue("datefirstpurchase", value)
  case class birthdate(override val value: Option[String]) extends VpersondemographicsFieldValue("birthdate", value)
  case class maritalstatus(override val value: Option[String]) extends VpersondemographicsFieldValue("maritalstatus", value)
  case class yearlyincome(override val value: Option[String]) extends VpersondemographicsFieldValue("yearlyincome", value)
  case class gender(override val value: Option[String]) extends VpersondemographicsFieldValue("gender", value)
  case class totalchildren(override val value: Option[Int]) extends VpersondemographicsFieldValue("totalchildren", value)
  case class numberchildrenathome(override val value: Option[Int]) extends VpersondemographicsFieldValue("numberchildrenathome", value)
  case class education(override val value: Option[String]) extends VpersondemographicsFieldValue("education", value)
  case class occupation(override val value: Option[String]) extends VpersondemographicsFieldValue("occupation", value)
  case class homeownerflag(override val value: Option[Boolean]) extends VpersondemographicsFieldValue("homeownerflag", value)
  case class numbercarsowned(override val value: Option[Int]) extends VpersondemographicsFieldValue("numbercarsowned", value)
}
