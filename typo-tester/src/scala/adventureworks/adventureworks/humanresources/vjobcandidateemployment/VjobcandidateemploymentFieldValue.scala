/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidateemployment

import adventureworks.humanresources.jobcandidate.JobcandidateId

sealed abstract class VjobcandidateemploymentFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class VjobcandidateemploymentFieldValue[T](name: String, value: T) extends VjobcandidateemploymentFieldOrIdValue(name, value)

object VjobcandidateemploymentFieldValue {
  case class jobcandidateid(override val value: Option[JobcandidateId]) extends VjobcandidateemploymentFieldValue("jobcandidateid", value)
  case class `Emp.StartDate`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.StartDate", value)
  case class `Emp.EndDate`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.EndDate", value)
  case class `Emp.OrgName`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.OrgName", value)
  case class `Emp.JobTitle`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.JobTitle", value)
  case class `Emp.Responsibility`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.Responsibility", value)
  case class `Emp.FunctionCategory`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.FunctionCategory", value)
  case class `Emp.IndustryCategory`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.IndustryCategory", value)
  case class `Emp.Loc.CountryRegion`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.Loc.CountryRegion", value)
  case class `Emp.Loc.State`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.Loc.State", value)
  case class `Emp.Loc.City`(override val value: Option[String]) extends VjobcandidateemploymentFieldValue("Emp.Loc.City", value)
}
