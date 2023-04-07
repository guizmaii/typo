/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package employee

import adventureworks.person.businessentity.BusinessentityId
import java.time.LocalDateTime
import java.util.UUID

sealed abstract class EmployeeFieldOrIdValue[T](val name: String, val value: T)
sealed abstract class EmployeeFieldValue[T](name: String, value: T) extends EmployeeFieldOrIdValue(name, value)

object EmployeeFieldValue {
  case class businessentityid(override val value: BusinessentityId) extends EmployeeFieldOrIdValue("businessentityid", value)
  case class nationalidnumber(override val value: String) extends EmployeeFieldValue("nationalidnumber", value)
  case class loginid(override val value: String) extends EmployeeFieldValue("loginid", value)
  case class jobtitle(override val value: String) extends EmployeeFieldValue("jobtitle", value)
  case class birthdate(override val value: String) extends EmployeeFieldValue("birthdate", value)
  case class maritalstatus(override val value: String) extends EmployeeFieldValue("maritalstatus", value)
  case class gender(override val value: String) extends EmployeeFieldValue("gender", value)
  case class hiredate(override val value: String) extends EmployeeFieldValue("hiredate", value)
  case class salariedflag(override val value: Boolean) extends EmployeeFieldValue("salariedflag", value)
  case class vacationhours(override val value: Int) extends EmployeeFieldValue("vacationhours", value)
  case class sickleavehours(override val value: Int) extends EmployeeFieldValue("sickleavehours", value)
  case class currentflag(override val value: Boolean) extends EmployeeFieldValue("currentflag", value)
  case class rowguid(override val value: UUID) extends EmployeeFieldValue("rowguid", value)
  case class modifieddate(override val value: LocalDateTime) extends EmployeeFieldValue("modifieddate", value)
  case class organizationnode(override val value: Option[String]) extends EmployeeFieldValue("organizationnode", value)
}
