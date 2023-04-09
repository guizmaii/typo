/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package hr
package jc

import adventureworks.humanresources.jobcandidate.JobcandidateId
import adventureworks.person.businessentity.BusinessentityId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object JcRepoImpl extends JcRepo {
  override def selectAll(implicit c: Connection): List[JcRow] = {
    SQL"""select id, jobcandidateid, businessentityid, resume, modifieddate from hr.jc""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[JcFieldOrIdValue[_]])(implicit c: Connection): List[JcRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case JcFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case JcFieldValue.jobcandidateid(value) => NamedParameter("jobcandidateid", ParameterValue.from(value))
          case JcFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case JcFieldValue.resume(value) => NamedParameter("resume", ParameterValue.from(value))
          case JcFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from hr.jc where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[JcRow] =
    RowParser[JcRow] { row =>
      Success(
        JcRow(
          id = row[Option[Int]]("id"),
          jobcandidateid = row[Option[JobcandidateId]]("jobcandidateid"),
          businessentityid = row[Option[BusinessentityId]]("businessentityid"),
          resume = row[Option[/* xml */ String]]("resume"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
