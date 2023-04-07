/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vjobcandidateemployment

import adventureworks.humanresources.jobcandidate.JobcandidateId
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VjobcandidateemploymentRow(
  /** Points to [[jobcandidate.JobcandidateRow.jobcandidateid]] */
  jobcandidateid: Option[JobcandidateId] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"jobcandidateid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.StartDate`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.StartDate","ordinal_position":2,"is_nullable":"YES","data_type":"date","datetime_precision":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"date","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.EndDate`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.EndDate","ordinal_position":3,"is_nullable":"YES","data_type":"date","datetime_precision":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"date","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.OrgName`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.OrgName","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":100,"character_octet_length":400,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.JobTitle`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.JobTitle","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":100,"character_octet_length":400,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.Responsibility`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.Responsibility","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.FunctionCategory`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.FunctionCategory","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.IndustryCategory`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.IndustryCategory","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.Loc.CountryRegion`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.Loc.CountryRegion","ordinal_position":9,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.Loc.State`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.Loc.State","ordinal_position":10,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  `Emp.Loc.City`: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vjobcandidateemployment","column_name":"Emp.Loc.City","ordinal_position":11,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object VjobcandidateemploymentRow {
  def rowParser(prefix: String): RowParser[VjobcandidateemploymentRow] = { row =>
    Success(
      VjobcandidateemploymentRow(
        jobcandidateid = row[Option[JobcandidateId]](prefix + "jobcandidateid"),
        `Emp.StartDate` = row[Option[String]](prefix + "Emp.StartDate"),
        `Emp.EndDate` = row[Option[String]](prefix + "Emp.EndDate"),
        `Emp.OrgName` = row[Option[String]](prefix + "Emp.OrgName"),
        `Emp.JobTitle` = row[Option[String]](prefix + "Emp.JobTitle"),
        `Emp.Responsibility` = row[Option[String]](prefix + "Emp.Responsibility"),
        `Emp.FunctionCategory` = row[Option[String]](prefix + "Emp.FunctionCategory"),
        `Emp.IndustryCategory` = row[Option[String]](prefix + "Emp.IndustryCategory"),
        `Emp.Loc.CountryRegion` = row[Option[String]](prefix + "Emp.Loc.CountryRegion"),
        `Emp.Loc.State` = row[Option[String]](prefix + "Emp.Loc.State"),
        `Emp.Loc.City` = row[Option[String]](prefix + "Emp.Loc.City")
      )
    )
  }

  implicit val oFormat: OFormat[VjobcandidateemploymentRow] = new OFormat[VjobcandidateemploymentRow]{
    override def writes(o: VjobcandidateemploymentRow): JsObject =
      Json.obj(
        "jobcandidateid" -> o.jobcandidateid,
        "Emp.StartDate" -> o.`Emp.StartDate`,
        "Emp.EndDate" -> o.`Emp.EndDate`,
        "Emp.OrgName" -> o.`Emp.OrgName`,
        "Emp.JobTitle" -> o.`Emp.JobTitle`,
        "Emp.Responsibility" -> o.`Emp.Responsibility`,
        "Emp.FunctionCategory" -> o.`Emp.FunctionCategory`,
        "Emp.IndustryCategory" -> o.`Emp.IndustryCategory`,
        "Emp.Loc.CountryRegion" -> o.`Emp.Loc.CountryRegion`,
        "Emp.Loc.State" -> o.`Emp.Loc.State`,
        "Emp.Loc.City" -> o.`Emp.Loc.City`
      )
  
    override def reads(json: JsValue): JsResult[VjobcandidateemploymentRow] = {
      JsResult.fromTry(
        Try(
          VjobcandidateemploymentRow(
            jobcandidateid = json.\("jobcandidateid").toOption.map(_.as[JobcandidateId]),
            `Emp.StartDate` = json.\("Emp.StartDate").toOption.map(_.as[String]),
            `Emp.EndDate` = json.\("Emp.EndDate").toOption.map(_.as[String]),
            `Emp.OrgName` = json.\("Emp.OrgName").toOption.map(_.as[String]),
            `Emp.JobTitle` = json.\("Emp.JobTitle").toOption.map(_.as[String]),
            `Emp.Responsibility` = json.\("Emp.Responsibility").toOption.map(_.as[String]),
            `Emp.FunctionCategory` = json.\("Emp.FunctionCategory").toOption.map(_.as[String]),
            `Emp.IndustryCategory` = json.\("Emp.IndustryCategory").toOption.map(_.as[String]),
            `Emp.Loc.CountryRegion` = json.\("Emp.Loc.CountryRegion").toOption.map(_.as[String]),
            `Emp.Loc.State` = json.\("Emp.Loc.State").toOption.map(_.as[String]),
            `Emp.Loc.City` = json.\("Emp.Loc.City").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
