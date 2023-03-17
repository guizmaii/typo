package testdb
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class RoleUsageGrantsRow(
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.grantor]] */
  grantor: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.grantee]] */
  grantee: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.objectCatalog]] */
  objectCatalog: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.objectSchema]] */
  objectSchema: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.objectName]] */
  objectName: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.objectType]] */
  objectType: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.privilegeType]] */
  privilegeType: Option[String],
  /** Points to [[testdb.information_schema.UsagePrivilegesRow.isGrantable]] */
  isGrantable: Option[String]
)

object RoleUsageGrantsRow {
  implicit val rowParser: RowParser[RoleUsageGrantsRow] = { row =>
    Success(
      RoleUsageGrantsRow(
        grantor = row[Option[String]]("grantor"),
        grantee = row[Option[String]]("grantee"),
        objectCatalog = row[Option[String]]("object_catalog"),
        objectSchema = row[Option[String]]("object_schema"),
        objectName = row[Option[String]]("object_name"),
        objectType = row[Option[String]]("object_type"),
        privilegeType = row[Option[String]]("privilege_type"),
        isGrantable = row[Option[String]]("is_grantable")
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
