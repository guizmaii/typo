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
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Flag
import anorm.NamedParameter
import anorm.ParameterMetaData
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object EmployeeRepoImpl extends EmployeeRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"delete from humanresources.employee where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[EmployeeFields, EmployeeRow] = {
    DeleteBuilder("humanresources.employee", EmployeeFields)
  }
  override def insert(unsaved: EmployeeRow)(implicit c: Connection): EmployeeRow = {
    SQL"""insert into humanresources.employee(businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode)
          values (${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4, ${ParameterValue(unsaved.nationalidnumber, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.loginid, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.jobtitle, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.birthdate, null, TypoLocalDate.toStatement)}::date, ${ParameterValue(unsaved.maritalstatus, null, ToStatement.stringToStatement)}::bpchar, ${ParameterValue(unsaved.gender, null, ToStatement.stringToStatement)}::bpchar, ${ParameterValue(unsaved.hiredate, null, TypoLocalDate.toStatement)}::date, ${ParameterValue(unsaved.salariedflag, null, Flag.toStatement)}::"public"."Flag", ${ParameterValue(unsaved.vacationhours, null, ToStatement.intToStatement)}::int2, ${ParameterValue(unsaved.sickleavehours, null, ToStatement.intToStatement)}::int2, ${ParameterValue(unsaved.currentflag, null, Flag.toStatement)}::"public"."Flag", ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp, ${ParameterValue(unsaved.organizationnode, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))})
          returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
       """
      .executeInsert(EmployeeRow.rowParser(1).single)
    
  }
  override def insert(unsaved: EmployeeRowUnsaved)(implicit c: Connection): EmployeeRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)), "::int4")),
      Some((NamedParameter("nationalidnumber", ParameterValue(unsaved.nationalidnumber, null, ToStatement.stringToStatement)), "")),
      Some((NamedParameter("loginid", ParameterValue(unsaved.loginid, null, ToStatement.stringToStatement)), "")),
      Some((NamedParameter("jobtitle", ParameterValue(unsaved.jobtitle, null, ToStatement.stringToStatement)), "")),
      Some((NamedParameter("birthdate", ParameterValue(unsaved.birthdate, null, TypoLocalDate.toStatement)), "::date")),
      Some((NamedParameter("maritalstatus", ParameterValue(unsaved.maritalstatus, null, ToStatement.stringToStatement)), "::bpchar")),
      Some((NamedParameter("gender", ParameterValue(unsaved.gender, null, ToStatement.stringToStatement)), "::bpchar")),
      Some((NamedParameter("hiredate", ParameterValue(unsaved.hiredate, null, TypoLocalDate.toStatement)), "::date")),
      unsaved.salariedflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("salariedflag", ParameterValue(value, null, Flag.toStatement)), """::"public"."Flag""""))
      },
      unsaved.vacationhours match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("vacationhours", ParameterValue(value, null, ToStatement.intToStatement)), "::int2"))
      },
      unsaved.sickleavehours match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("sickleavehours", ParameterValue(value, null, ToStatement.intToStatement)), "::int2"))
      },
      unsaved.currentflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("currentflag", ParameterValue(value, null, Flag.toStatement)), """::"public"."Flag""""))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue(value, null, ToStatement.uuidToStatement)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      },
      unsaved.organizationnode match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("organizationnode", ParameterValue(value, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))), ""))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into humanresources.employee default values
            returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
         """
        .executeInsert(EmployeeRow.rowParser(1).single)
    } else {
      val q = s"""insert into humanresources.employee(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(EmployeeRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[EmployeeFields, EmployeeRow] = {
    SelectBuilderSql("humanresources.employee", EmployeeFields, EmployeeRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[EmployeeRow] = {
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
          from humanresources.employee
       """.as(EmployeeRow.rowParser(1).*)
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[EmployeeRow] = {
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
          from humanresources.employee
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.as(EmployeeRow.rowParser(1).singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[EmployeeRow] = {
    SQL"""select businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
          from humanresources.employee
          where businessentityid = ANY(${businessentityids})
       """.as(EmployeeRow.rowParser(1).*)
    
  }
  override def update(row: EmployeeRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update humanresources.employee
          set nationalidnumber = ${ParameterValue(row.nationalidnumber, null, ToStatement.stringToStatement)},
              loginid = ${ParameterValue(row.loginid, null, ToStatement.stringToStatement)},
              jobtitle = ${ParameterValue(row.jobtitle, null, ToStatement.stringToStatement)},
              birthdate = ${ParameterValue(row.birthdate, null, TypoLocalDate.toStatement)}::date,
              maritalstatus = ${ParameterValue(row.maritalstatus, null, ToStatement.stringToStatement)}::bpchar,
              gender = ${ParameterValue(row.gender, null, ToStatement.stringToStatement)}::bpchar,
              hiredate = ${ParameterValue(row.hiredate, null, TypoLocalDate.toStatement)}::date,
              salariedflag = ${ParameterValue(row.salariedflag, null, Flag.toStatement)}::"public"."Flag",
              vacationhours = ${ParameterValue(row.vacationhours, null, ToStatement.intToStatement)}::int2,
              sickleavehours = ${ParameterValue(row.sickleavehours, null, ToStatement.intToStatement)}::int2,
              currentflag = ${ParameterValue(row.currentflag, null, Flag.toStatement)}::"public"."Flag",
              rowguid = ${ParameterValue(row.rowguid, null, ToStatement.uuidToStatement)}::uuid,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp,
              organizationnode = ${ParameterValue(row.organizationnode, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[EmployeeFields, EmployeeRow] = {
    UpdateBuilder("humanresources.employee", EmployeeFields, EmployeeRow.rowParser)
  }
  override def upsert(unsaved: EmployeeRow)(implicit c: Connection): EmployeeRow = {
    SQL"""insert into humanresources.employee(businessentityid, nationalidnumber, loginid, jobtitle, birthdate, maritalstatus, gender, hiredate, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate, organizationnode)
          values (
            ${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4,
            ${ParameterValue(unsaved.nationalidnumber, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.loginid, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.jobtitle, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.birthdate, null, TypoLocalDate.toStatement)}::date,
            ${ParameterValue(unsaved.maritalstatus, null, ToStatement.stringToStatement)}::bpchar,
            ${ParameterValue(unsaved.gender, null, ToStatement.stringToStatement)}::bpchar,
            ${ParameterValue(unsaved.hiredate, null, TypoLocalDate.toStatement)}::date,
            ${ParameterValue(unsaved.salariedflag, null, Flag.toStatement)}::"public"."Flag",
            ${ParameterValue(unsaved.vacationhours, null, ToStatement.intToStatement)}::int2,
            ${ParameterValue(unsaved.sickleavehours, null, ToStatement.intToStatement)}::int2,
            ${ParameterValue(unsaved.currentflag, null, Flag.toStatement)}::"public"."Flag",
            ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp,
            ${ParameterValue(unsaved.organizationnode, null, ToStatement.optionToStatement(ToStatement.stringToStatement, ParameterMetaData.StringParameterMetaData))}
          )
          on conflict (businessentityid)
          do update set
            nationalidnumber = EXCLUDED.nationalidnumber,
            loginid = EXCLUDED.loginid,
            jobtitle = EXCLUDED.jobtitle,
            birthdate = EXCLUDED.birthdate,
            maritalstatus = EXCLUDED.maritalstatus,
            gender = EXCLUDED.gender,
            hiredate = EXCLUDED.hiredate,
            salariedflag = EXCLUDED.salariedflag,
            vacationhours = EXCLUDED.vacationhours,
            sickleavehours = EXCLUDED.sickleavehours,
            currentflag = EXCLUDED.currentflag,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate,
            organizationnode = EXCLUDED.organizationnode
          returning businessentityid, nationalidnumber, loginid, jobtitle, birthdate::text, maritalstatus, gender, hiredate::text, salariedflag, vacationhours, sickleavehours, currentflag, rowguid, modifieddate::text, organizationnode
       """
      .executeInsert(EmployeeRow.rowParser(1).single)
    
  }
}
