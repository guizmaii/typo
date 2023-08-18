/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package enabled_roles

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class EnabledRolesViewRow(
  roleName: Option[SqlIdentifier]
)

object EnabledRolesViewRow {
  implicit lazy val decoder: Decoder[EnabledRolesViewRow] = Decoder.forProduct1[EnabledRolesViewRow, Option[SqlIdentifier]]("role_name")(EnabledRolesViewRow.apply)(Decoder.decodeOption(SqlIdentifier.decoder))
  implicit lazy val encoder: Encoder[EnabledRolesViewRow] = Encoder.forProduct1[EnabledRolesViewRow, Option[SqlIdentifier]]("role_name")(x => (x.roleName))(Encoder.encodeOption(SqlIdentifier.encoder))
  implicit lazy val read: Read[EnabledRolesViewRow] = new Read[EnabledRolesViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => EnabledRolesViewRow(
      roleName = SqlIdentifier.get.unsafeGetNullable(rs, i + 0)
    )
  )
}
