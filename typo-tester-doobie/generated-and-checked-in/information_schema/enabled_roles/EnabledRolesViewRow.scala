/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package enabled_roles

import adventureworks.information_schema.SqlIdentifier
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class EnabledRolesViewRow(
  roleName: Option[SqlIdentifier]
)

object EnabledRolesViewRow {
  implicit val decoder: Decoder[EnabledRolesViewRow] =
    (c: HCursor) =>
      for {
        roleName <- c.downField("role_name").as[Option[SqlIdentifier]]
      } yield EnabledRolesViewRow(roleName)
  implicit val encoder: Encoder[EnabledRolesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "role_name" := row.roleName
      )}
  implicit val read: Read[EnabledRolesViewRow] =
    new Read[EnabledRolesViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => EnabledRolesViewRow(
        roleName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0)
      )
    )
  

}
