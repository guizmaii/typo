/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package employee

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDate
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoShort
import adventureworks.customtypes.TypoUUID
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Flag
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `humanresources.employee` which has not been persisted yet */
case class EmployeeRowUnsaved(
  /** Primary key for Employee records.  Foreign key to BusinessEntity.BusinessEntityID.
      Points to [[person.person.PersonRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Unique national identification number such as a social security number. */
  nationalidnumber: /* max 15 chars */ String,
  /** Network login. */
  loginid: /* max 256 chars */ String,
  /** Work title such as Buyer or Sales Representative. */
  jobtitle: /* max 50 chars */ String,
  /** Date of birth.
      Constraint CK_Employee_BirthDate affecting columns "birthdate":  (((birthdate >= '1930-01-01'::date) AND (birthdate <= (now() - '18 years'::interval)))) */
  birthdate: TypoLocalDate,
  /** M = Married, S = Single
      Constraint CK_Employee_MaritalStatus affecting columns "maritalstatus":  ((upper((maritalstatus)::text) = ANY (ARRAY['M'::text, 'S'::text]))) */
  maritalstatus: /* bpchar, max 1 chars */ String,
  /** M = Male, F = Female
      Constraint CK_Employee_Gender affecting columns "gender":  ((upper((gender)::text) = ANY (ARRAY['M'::text, 'F'::text]))) */
  gender: /* bpchar, max 1 chars */ String,
  /** Employee hired on this date.
      Constraint CK_Employee_HireDate affecting columns "hiredate":  (((hiredate >= '1996-07-01'::date) AND (hiredate <= (now() + '1 day'::interval)))) */
  hiredate: TypoLocalDate,
  /** Default: true
      Job classification. 0 = Hourly, not exempt from collective bargaining. 1 = Salaried, exempt from collective bargaining. */
  salariedflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: 0
      Number of available vacation hours.
      Constraint CK_Employee_VacationHours affecting columns "vacationhours":  (((vacationhours >= '-40'::integer) AND (vacationhours <= 240))) */
  vacationhours: Defaulted[TypoShort] = Defaulted.UseDefault,
  /** Default: 0
      Number of available sick leave hours.
      Constraint CK_Employee_SickLeaveHours affecting columns "sickleavehours":  (((sickleavehours >= 0) AND (sickleavehours <= 120))) */
  sickleavehours: Defaulted[TypoShort] = Defaulted.UseDefault,
  /** Default: true
      0 = Inactive, 1 = Active */
  currentflag: Defaulted[Flag] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[TypoUUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault,
  /** Default: '/'::character varying
      Where the employee is located in corporate hierarchy. */
  organizationnode: Defaulted[Option[String]] = Defaulted.UseDefault
) {
  def toRow(salariedflagDefault: => Flag, vacationhoursDefault: => TypoShort, sickleavehoursDefault: => TypoShort, currentflagDefault: => Flag, rowguidDefault: => TypoUUID, modifieddateDefault: => TypoLocalDateTime, organizationnodeDefault: => Option[String]): EmployeeRow =
    EmployeeRow(
      businessentityid = businessentityid,
      nationalidnumber = nationalidnumber,
      loginid = loginid,
      jobtitle = jobtitle,
      birthdate = birthdate,
      maritalstatus = maritalstatus,
      gender = gender,
      hiredate = hiredate,
      salariedflag = salariedflag match {
                       case Defaulted.UseDefault => salariedflagDefault
                       case Defaulted.Provided(value) => value
                     },
      vacationhours = vacationhours match {
                        case Defaulted.UseDefault => vacationhoursDefault
                        case Defaulted.Provided(value) => value
                      },
      sickleavehours = sickleavehours match {
                         case Defaulted.UseDefault => sickleavehoursDefault
                         case Defaulted.Provided(value) => value
                       },
      currentflag = currentflag match {
                      case Defaulted.UseDefault => currentflagDefault
                      case Defaulted.Provided(value) => value
                    },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     },
      organizationnode = organizationnode match {
                           case Defaulted.UseDefault => organizationnodeDefault
                           case Defaulted.Provided(value) => value
                         }
    )
}
object EmployeeRowUnsaved {
  implicit lazy val reads: Reads[EmployeeRowUnsaved] = Reads[EmployeeRowUnsaved](json => JsResult.fromTry(
      Try(
        EmployeeRowUnsaved(
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          nationalidnumber = json.\("nationalidnumber").as(Reads.StringReads),
          loginid = json.\("loginid").as(Reads.StringReads),
          jobtitle = json.\("jobtitle").as(Reads.StringReads),
          birthdate = json.\("birthdate").as(TypoLocalDate.reads),
          maritalstatus = json.\("maritalstatus").as(Reads.StringReads),
          gender = json.\("gender").as(Reads.StringReads),
          hiredate = json.\("hiredate").as(TypoLocalDate.reads),
          salariedflag = json.\("salariedflag").as(Defaulted.reads(Flag.reads)),
          vacationhours = json.\("vacationhours").as(Defaulted.reads(TypoShort.reads)),
          sickleavehours = json.\("sickleavehours").as(Defaulted.reads(TypoShort.reads)),
          currentflag = json.\("currentflag").as(Defaulted.reads(Flag.reads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(TypoUUID.reads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads)),
          organizationnode = json.\("organizationnode").as(Defaulted.readsOpt(Reads.StringReads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[EmployeeRowUnsaved] = OWrites[EmployeeRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "nationalidnumber" -> Writes.StringWrites.writes(o.nationalidnumber),
      "loginid" -> Writes.StringWrites.writes(o.loginid),
      "jobtitle" -> Writes.StringWrites.writes(o.jobtitle),
      "birthdate" -> TypoLocalDate.writes.writes(o.birthdate),
      "maritalstatus" -> Writes.StringWrites.writes(o.maritalstatus),
      "gender" -> Writes.StringWrites.writes(o.gender),
      "hiredate" -> TypoLocalDate.writes.writes(o.hiredate),
      "salariedflag" -> Defaulted.writes(Flag.writes).writes(o.salariedflag),
      "vacationhours" -> Defaulted.writes(TypoShort.writes).writes(o.vacationhours),
      "sickleavehours" -> Defaulted.writes(TypoShort.writes).writes(o.sickleavehours),
      "currentflag" -> Defaulted.writes(Flag.writes).writes(o.currentflag),
      "rowguid" -> Defaulted.writes(TypoUUID.writes).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate),
      "organizationnode" -> Defaulted.writes(Writes.OptionWrites(Writes.StringWrites)).writes(o.organizationnode)
    ))
  )
}
