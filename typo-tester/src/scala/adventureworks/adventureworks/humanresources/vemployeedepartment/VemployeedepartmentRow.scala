/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package vemployeedepartment

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import anorm.RowParser
import anorm.Success
import java.time.LocalDate
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class VemployeedepartmentRow(
  /** Points to [[person.person.PersonRow.businessentityid]] */
  businessentityid: Option[BusinessentityId] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"businessentityid","ordinal_position":1,"is_nullable":"YES","data_type":"integer","numeric_precision":32,"numeric_precision_radix":2,"numeric_scale":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"int4","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.title]] */
  title: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"title","ordinal_position":2,"is_nullable":"YES","data_type":"character varying","character_maximum_length":8,"character_octet_length":32,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.firstname]] */
  firstname: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"firstname","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.middlename]] */
  middlename: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"middlename","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.lastname]] */
  lastname: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"lastname","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[person.person.PersonRow.suffix]] */
  suffix: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"suffix","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_maximum_length":10,"character_octet_length":40,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[employee.EmployeeRow.jobtitle]] */
  jobtitle: Option[String] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"jobtitle","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  department: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"department","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[department.DepartmentRow.groupname]] */
  groupname: Option[Name] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"groupname","ordinal_position":9,"is_nullable":"YES","data_type":"character varying","character_maximum_length":50,"character_octet_length":200,"domain_catalog":"Adventureworks","domain_schema":"public","domain_name":"Name","udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[employeedepartmenthistory.EmployeedepartmenthistoryRow.startdate]] */
  startdate: Option[LocalDate] /* {"table_catalog":"Adventureworks","table_schema":"humanresources","table_name":"vemployeedepartment","column_name":"startdate","ordinal_position":10,"is_nullable":"YES","data_type":"date","datetime_precision":0,"udt_catalog":"Adventureworks","udt_schema":"pg_catalog","udt_name":"date","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object VemployeedepartmentRow {
  def rowParser(prefix: String): RowParser[VemployeedepartmentRow] = { row =>
    Success(
      VemployeedepartmentRow(
        businessentityid = row[Option[BusinessentityId]](prefix + "businessentityid"),
        title = row[Option[String]](prefix + "title"),
        firstname = row[Option[Name]](prefix + "firstname"),
        middlename = row[Option[Name]](prefix + "middlename"),
        lastname = row[Option[Name]](prefix + "lastname"),
        suffix = row[Option[String]](prefix + "suffix"),
        jobtitle = row[Option[String]](prefix + "jobtitle"),
        department = row[Option[Name]](prefix + "department"),
        groupname = row[Option[Name]](prefix + "groupname"),
        startdate = row[Option[LocalDate]](prefix + "startdate")
      )
    )
  }

  implicit val oFormat: OFormat[VemployeedepartmentRow] = new OFormat[VemployeedepartmentRow]{
    override def writes(o: VemployeedepartmentRow): JsObject =
      Json.obj(
        "businessentityid" -> o.businessentityid,
        "title" -> o.title,
        "firstname" -> o.firstname,
        "middlename" -> o.middlename,
        "lastname" -> o.lastname,
        "suffix" -> o.suffix,
        "jobtitle" -> o.jobtitle,
        "department" -> o.department,
        "groupname" -> o.groupname,
        "startdate" -> o.startdate
      )
  
    override def reads(json: JsValue): JsResult[VemployeedepartmentRow] = {
      JsResult.fromTry(
        Try(
          VemployeedepartmentRow(
            businessentityid = json.\("businessentityid").toOption.map(_.as[BusinessentityId]),
            title = json.\("title").toOption.map(_.as[String]),
            firstname = json.\("firstname").toOption.map(_.as[Name]),
            middlename = json.\("middlename").toOption.map(_.as[Name]),
            lastname = json.\("lastname").toOption.map(_.as[Name]),
            suffix = json.\("suffix").toOption.map(_.as[String]),
            jobtitle = json.\("jobtitle").toOption.map(_.as[String]),
            department = json.\("department").toOption.map(_.as[Name]),
            groupname = json.\("groupname").toOption.map(_.as[Name]),
            startdate = json.\("startdate").toOption.map(_.as[LocalDate])
          )
        )
      )
    }
  }
}
