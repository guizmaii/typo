/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package employee

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Flag
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import anorm.ToStatement
import java.lang.Integer
import java.sql.Connection
import java.sql.PreparedStatement
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

object EmployeeRepoImpl extends EmployeeRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from humanresources.employee where businessentityid = $businessentityid".executeUpdate() > 0
  }
  override def insert(unsaved: EmployeeRow)(implicit c: Connection): EmployeeRow = {
    SQL"""insert into humanresources.employee(businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode)
          values (${unsaved.businessentityid}::int4, ${unsaved.nationalidnumber}, ${unsaved.loginid}, ${unsaved.jobtitle}, ${unsaved.birthdate}::date, ${unsaved.maritalstatus}::bpchar, ${unsaved.gender}::bpchar, ${unsaved.hiredate}::date, ${unsaved.salariedflag}::"public"."Flag", ${unsaved.vacationhours}::int2, ${unsaved.sickleavehours}::int2, ${unsaved.currentflag}::"public"."Flag", ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp, ${unsaved.organizationnode})
          returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
       """
      .executeInsert(rowParser.single)
  
  }
  override def insert(unsaved: EmployeeRowUnsaved)(implicit c: Connection): EmployeeRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue.from(unsaved.businessentityid)), "::int4")),
      Some((NamedParameter("nationalidnumber", ParameterValue.from(unsaved.nationalidnumber)), "")),
      Some((NamedParameter("loginid", ParameterValue.from(unsaved.loginid)), "")),
      Some((NamedParameter("jobtitle", ParameterValue.from(unsaved.jobtitle)), "")),
      Some((NamedParameter("birthdate", ParameterValue.from(unsaved.birthdate)), "::date")),
      Some((NamedParameter("maritalstatus", ParameterValue.from(unsaved.maritalstatus)), "::bpchar")),
      Some((NamedParameter("gender", ParameterValue.from(unsaved.gender)), "::bpchar")),
      Some((NamedParameter("hiredate", ParameterValue.from(unsaved.hiredate)), "::date")),
      unsaved.salariedflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("salariedflag", ParameterValue.from[Flag](value)), """::"public"."Flag""""))
      },
      unsaved.vacationhours match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("vacationhours", ParameterValue.from[Int](value)), "::int2"))
      },
      unsaved.sickleavehours match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("sickleavehours", ParameterValue.from[Int](value)), "::int2"))
      },
      unsaved.currentflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("currentflag", ParameterValue.from[Flag](value)), """::"public"."Flag""""))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue.from[UUID](value)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[LocalDateTime](value)), "::timestamp"))
      },
      unsaved.organizationnode match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("organizationnode", ParameterValue.from[Option[String]](value)), ""))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into humanresources.employee default values
            returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
         """
        .executeInsert(rowParser.single)
    } else {
      val q = s"""insert into humanresources.employee(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
               """
      // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
      import anorm._
      SQL(q)
        .on(namedParameters.map(_._1) :_*)
        .executeInsert(rowParser.single)
    }
  
  }
  override def selectAll(implicit c: Connection): List[EmployeeRow] = {
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
          from humanresources.employee
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[EmployeeFieldOrIdValue[_]])(implicit c: Connection): List[EmployeeRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case EmployeeFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case EmployeeFieldValue.nationalidnumber(value) => NamedParameter("nationalidnumber", ParameterValue.from(value))
          case EmployeeFieldValue.loginid(value) => NamedParameter("loginid", ParameterValue.from(value))
          case EmployeeFieldValue.jobtitle(value) => NamedParameter("jobtitle", ParameterValue.from(value))
          case EmployeeFieldValue.birthdate(value) => NamedParameter("birthdate", ParameterValue.from(value))
          case EmployeeFieldValue.maritalstatus(value) => NamedParameter("maritalstatus", ParameterValue.from(value))
          case EmployeeFieldValue.gender(value) => NamedParameter("gender", ParameterValue.from(value))
          case EmployeeFieldValue.hiredate(value) => NamedParameter("hiredate", ParameterValue.from(value))
          case EmployeeFieldValue.salariedflag(value) => NamedParameter("salariedflag", ParameterValue.from(value))
          case EmployeeFieldValue.vacationhours(value) => NamedParameter("vacationhours", ParameterValue.from(value))
          case EmployeeFieldValue.sickleavehours(value) => NamedParameter("sickleavehours", ParameterValue.from(value))
          case EmployeeFieldValue.currentflag(value) => NamedParameter("currentflag", ParameterValue.from(value))
          case EmployeeFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case EmployeeFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
          case EmployeeFieldValue.organizationnode(value) => NamedParameter("organizationnode", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
                    from humanresources.employee
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[EmployeeRow] = {
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
          from humanresources.employee
          where businessentityid = $businessentityid
       """.as(rowParser.singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[EmployeeRow] = {
    implicit val toStatement: ToStatement[Array[BusinessentityId]] =
      (s: PreparedStatement, index: Int, v: Array[BusinessentityId]) =>
        s.setArray(index, s.getConnection.createArrayOf("int4", v.map(x => x.value: Integer)))
    
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode
          from humanresources.employee
          where businessentityid = ANY($businessentityids)
       """.as(rowParser.*)
  
  }
  override def update(row: EmployeeRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update humanresources.employee
          set nationalidnumber = ${row.nationalidnumber},
              loginid = ${row.loginid},
              jobtitle = ${row.jobtitle},
              birthdate = ${row.birthdate}::date,
              maritalstatus = ${row.maritalstatus}::bpchar,
              gender = ${row.gender}::bpchar,
              hiredate = ${row.hiredate}::date,
              salariedflag = ${row.salariedflag}::"public"."Flag",
              vacationhours = ${row.vacationhours}::int2,
              sickleavehours = ${row.sickleavehours}::int2,
              currentflag = ${row.currentflag}::"public"."Flag",
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp,
              organizationnode = ${row.organizationnode}
          where businessentityid = $businessentityid
       """.executeUpdate() > 0
  }
  override def updateFieldValues(businessentityid: BusinessentityId, fieldValues: List[EmployeeFieldValue[_]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case EmployeeFieldValue.nationalidnumber(value) => NamedParameter("nationalidnumber", ParameterValue.from(value))
          case EmployeeFieldValue.loginid(value) => NamedParameter("loginid", ParameterValue.from(value))
          case EmployeeFieldValue.jobtitle(value) => NamedParameter("jobtitle", ParameterValue.from(value))
          case EmployeeFieldValue.birthdate(value) => NamedParameter("birthdate", ParameterValue.from(value))
          case EmployeeFieldValue.maritalstatus(value) => NamedParameter("maritalstatus", ParameterValue.from(value))
          case EmployeeFieldValue.gender(value) => NamedParameter("gender", ParameterValue.from(value))
          case EmployeeFieldValue.hiredate(value) => NamedParameter("hiredate", ParameterValue.from(value))
          case EmployeeFieldValue.salariedflag(value) => NamedParameter("salariedflag", ParameterValue.from(value))
          case EmployeeFieldValue.vacationhours(value) => NamedParameter("vacationhours", ParameterValue.from(value))
          case EmployeeFieldValue.sickleavehours(value) => NamedParameter("sickleavehours", ParameterValue.from(value))
          case EmployeeFieldValue.currentflag(value) => NamedParameter("currentflag", ParameterValue.from(value))
          case EmployeeFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case EmployeeFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
          case EmployeeFieldValue.organizationnode(value) => NamedParameter("organizationnode", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update humanresources.employee
                    set ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where businessentityid = {businessentityid}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .on(NamedParameter("businessentityid", ParameterValue.from(businessentityid)))
          .executeUpdate() > 0
    }
  
  }
  val rowParser: RowParser[EmployeeRow] =
    RowParser[EmployeeRow] { row =>
      Success(
        EmployeeRow(
          businessentityid = row[BusinessentityId]("businessentityid"),
          nationalidnumber = row[String]("nationalidnumber"),
          loginid = row[String]("loginid"),
          jobtitle = row[String]("jobtitle"),
          birthdate = row[LocalDate]("birthdate"),
          maritalstatus = row[/* bpchar */ String]("maritalstatus"),
          gender = row[/* bpchar */ String]("gender"),
          hiredate = row[LocalDate]("hiredate"),
          salariedflag = row[Flag]("salariedflag"),
          vacationhours = row[Int]("vacationhours"),
          sickleavehours = row[Int]("sickleavehours"),
          currentflag = row[Flag]("currentflag"),
          rowguid = row[UUID]("rowguid"),
          modifieddate = row[LocalDateTime]("modifieddate"),
          organizationnode = row[Option[String]]("organizationnode")
        )
      )
    }
}
