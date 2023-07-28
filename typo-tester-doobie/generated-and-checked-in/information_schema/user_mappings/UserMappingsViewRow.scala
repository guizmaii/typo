/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package user_mappings

import adventureworks.information_schema.SqlIdentifier
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class UserMappingsViewRow(
  /** Points to [[`_pg_user_mappings`.PgUserMappingsViewRow.authorizationIdentifier]] */
  authorizationIdentifier: Option[SqlIdentifier],
  /** Points to [[`_pg_user_mappings`.PgUserMappingsViewRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[SqlIdentifier],
  /** Points to [[`_pg_user_mappings`.PgUserMappingsViewRow.foreignServerName]] */
  foreignServerName: Option[SqlIdentifier]
)

object UserMappingsViewRow {
  implicit val decoder: Decoder[UserMappingsViewRow] =
    (c: HCursor) =>
      for {
        authorizationIdentifier <- c.downField("authorization_identifier").as[Option[SqlIdentifier]]
        foreignServerCatalog <- c.downField("foreign_server_catalog").as[Option[SqlIdentifier]]
        foreignServerName <- c.downField("foreign_server_name").as[Option[SqlIdentifier]]
      } yield UserMappingsViewRow(authorizationIdentifier, foreignServerCatalog, foreignServerName)
  implicit val encoder: Encoder[UserMappingsViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "authorization_identifier" := row.authorizationIdentifier,
        "foreign_server_catalog" := row.foreignServerCatalog,
        "foreign_server_name" := row.foreignServerName
      )}
  implicit val read: Read[UserMappingsViewRow] =
    new Read[UserMappingsViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => UserMappingsViewRow(
        authorizationIdentifier = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0),
        foreignServerCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 1),
        foreignServerName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 2)
      )
    )
  

}
