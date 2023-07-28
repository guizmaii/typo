/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package administrable_role_authorizations

import adventureworks.information_schema.SqlIdentifier
import adventureworks.information_schema.YesOrNo
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class AdministrableRoleAuthorizationsViewRow(
  /** Points to [[applicable_roles.ApplicableRolesViewRow.grantee]] */
  grantee: Option[SqlIdentifier],
  /** Points to [[applicable_roles.ApplicableRolesViewRow.roleName]] */
  roleName: Option[SqlIdentifier],
  /** Points to [[applicable_roles.ApplicableRolesViewRow.isGrantable]] */
  isGrantable: Option[YesOrNo]
)

object AdministrableRoleAuthorizationsViewRow {
  implicit val decoder: Decoder[AdministrableRoleAuthorizationsViewRow] =
    (c: HCursor) =>
      for {
        grantee <- c.downField("grantee").as[Option[SqlIdentifier]]
        roleName <- c.downField("role_name").as[Option[SqlIdentifier]]
        isGrantable <- c.downField("is_grantable").as[Option[YesOrNo]]
      } yield AdministrableRoleAuthorizationsViewRow(grantee, roleName, isGrantable)
  implicit val encoder: Encoder[AdministrableRoleAuthorizationsViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "grantee" := row.grantee,
        "role_name" := row.roleName,
        "is_grantable" := row.isGrantable
      )}
  implicit val read: Read[AdministrableRoleAuthorizationsViewRow] =
    new Read[AdministrableRoleAuthorizationsViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[YesOrNo], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => AdministrableRoleAuthorizationsViewRow(
        grantee = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0),
        roleName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 1),
        isGrantable = Get[YesOrNo].unsafeGetNullable(rs, i + 2)
      )
    )
  

}
