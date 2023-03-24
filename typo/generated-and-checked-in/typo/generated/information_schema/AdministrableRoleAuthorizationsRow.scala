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

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class AdministrableRoleAuthorizationsRow(
  /** Points to [[ApplicableRolesRow.grantee]] */
  grantee: Option[String] /* {"baseColumnName":"grantee","baseRelationName":"information_schema.applicable_roles","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"grantee","columnName":"grantee","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"applicable_roles"} */,
  /** Points to [[ApplicableRolesRow.roleName]] */
  roleName: Option[String] /* {"baseColumnName":"role_name","baseRelationName":"information_schema.applicable_roles","columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"role_name","columnName":"role_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0,"tableName":"applicable_roles"} */,
  /** Points to [[ApplicableRolesRow.isGrantable]] */
  isGrantable: Option[String] /* {"baseColumnName":"is_grantable","baseRelationName":"information_schema.applicable_roles","columnClassName":"java.lang.String","columnDisplaySize":3,"columnLabel":"is_grantable","columnName":"is_grantable","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"Nullable","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":3,"scale":0,"tableName":"applicable_roles"} */
)

object AdministrableRoleAuthorizationsRow {
  implicit val rowParser: RowParser[AdministrableRoleAuthorizationsRow] = { row =>
    Success(
      AdministrableRoleAuthorizationsRow(
        grantee = row[Option[String]]("grantee"),
        roleName = row[Option[String]]("role_name"),
        isGrantable = row[Option[String]]("is_grantable")
      )
    )
  }

  implicit val oFormat: OFormat[AdministrableRoleAuthorizationsRow] = new OFormat[AdministrableRoleAuthorizationsRow]{
    override def writes(o: AdministrableRoleAuthorizationsRow): JsObject =
      Json.obj(
        "grantee" -> o.grantee,
      "role_name" -> o.roleName,
      "is_grantable" -> o.isGrantable
      )

    override def reads(json: JsValue): JsResult[AdministrableRoleAuthorizationsRow] = {
      JsResult.fromTry(
        Try(
          AdministrableRoleAuthorizationsRow(
            grantee = json.\("grantee").toOption.map(_.as[String]),
            roleName = json.\("role_name").toOption.map(_.as[String]),
            isGrantable = json.\("is_grantable").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
