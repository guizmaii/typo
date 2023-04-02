/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package information_schema
package role_usage_grants

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class RoleUsageGrantsRow(
  /** Points to [[usage_privileges.UsagePrivilegesRow.grantor]] */
  grantor: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"grantor","ordinal_position":1,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.grantee]] */
  grantee: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"grantee","ordinal_position":2,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.objectCatalog]] */
  objectCatalog: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"object_catalog","ordinal_position":3,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.objectSchema]] */
  objectSchema: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"object_schema","ordinal_position":4,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.objectName]] */
  objectName: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"object_name","ordinal_position":5,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.objectType]] */
  objectType: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"object_type","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.privilegeType]] */
  privilegeType: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"privilege_type","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[usage_privileges.UsagePrivilegesRow.isGrantable]] */
  isGrantable: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"role_usage_grants","column_name":"is_grantable","ordinal_position":8,"is_nullable":"YES","data_type":"character varying","character_maximum_length":3,"character_octet_length":12,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"yes_or_no","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object RoleUsageGrantsRow {
  def rowParser(prefix: String): RowParser[RoleUsageGrantsRow] = { row =>
    Success(
      RoleUsageGrantsRow(
        grantor = row[Option[String]](prefix + "grantor"),
        grantee = row[Option[String]](prefix + "grantee"),
        objectCatalog = row[Option[String]](prefix + "object_catalog"),
        objectSchema = row[Option[String]](prefix + "object_schema"),
        objectName = row[Option[String]](prefix + "object_name"),
        objectType = row[Option[String]](prefix + "object_type"),
        privilegeType = row[Option[String]](prefix + "privilege_type"),
        isGrantable = row[Option[String]](prefix + "is_grantable")
      )
    )
  }

  implicit val oFormat: OFormat[RoleUsageGrantsRow] = new OFormat[RoleUsageGrantsRow]{
    override def writes(o: RoleUsageGrantsRow): JsObject =
      Json.obj(
        "grantor" -> o.grantor,
      "grantee" -> o.grantee,
      "object_catalog" -> o.objectCatalog,
      "object_schema" -> o.objectSchema,
      "object_name" -> o.objectName,
      "object_type" -> o.objectType,
      "privilege_type" -> o.privilegeType,
      "is_grantable" -> o.isGrantable
      )

    override def reads(json: JsValue): JsResult[RoleUsageGrantsRow] = {
      JsResult.fromTry(
        Try(
          RoleUsageGrantsRow(
            grantor = json.\("grantor").toOption.map(_.as[String]),
            grantee = json.\("grantee").toOption.map(_.as[String]),
            objectCatalog = json.\("object_catalog").toOption.map(_.as[String]),
            objectSchema = json.\("object_schema").toOption.map(_.as[String]),
            objectName = json.\("object_name").toOption.map(_.as[String]),
            objectType = json.\("object_type").toOption.map(_.as[String]),
            privilegeType = json.\("privilege_type").toOption.map(_.as[String]),
            isGrantable = json.\("is_grantable").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
