/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package routine_privileges

import adventureworks.information_schema.CharacterData
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

case class RoutinePrivilegesViewRow(
  grantor: Option[SqlIdentifier],
  grantee: Option[SqlIdentifier],
  specificCatalog: Option[SqlIdentifier],
  specificSchema: Option[SqlIdentifier],
  specificName: Option[SqlIdentifier],
  routineCatalog: Option[SqlIdentifier],
  routineSchema: Option[SqlIdentifier],
  routineName: Option[SqlIdentifier],
  privilegeType: Option[CharacterData],
  isGrantable: Option[YesOrNo]
)

object RoutinePrivilegesViewRow {
  implicit val decoder: Decoder[RoutinePrivilegesViewRow] =
    (c: HCursor) =>
      for {
        grantor <- c.downField("grantor").as[Option[SqlIdentifier]]
        grantee <- c.downField("grantee").as[Option[SqlIdentifier]]
        specificCatalog <- c.downField("specific_catalog").as[Option[SqlIdentifier]]
        specificSchema <- c.downField("specific_schema").as[Option[SqlIdentifier]]
        specificName <- c.downField("specific_name").as[Option[SqlIdentifier]]
        routineCatalog <- c.downField("routine_catalog").as[Option[SqlIdentifier]]
        routineSchema <- c.downField("routine_schema").as[Option[SqlIdentifier]]
        routineName <- c.downField("routine_name").as[Option[SqlIdentifier]]
        privilegeType <- c.downField("privilege_type").as[Option[CharacterData]]
        isGrantable <- c.downField("is_grantable").as[Option[YesOrNo]]
      } yield RoutinePrivilegesViewRow(grantor, grantee, specificCatalog, specificSchema, specificName, routineCatalog, routineSchema, routineName, privilegeType, isGrantable)
  implicit val encoder: Encoder[RoutinePrivilegesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "grantor" := row.grantor,
        "grantee" := row.grantee,
        "specific_catalog" := row.specificCatalog,
        "specific_schema" := row.specificSchema,
        "specific_name" := row.specificName,
        "routine_catalog" := row.routineCatalog,
        "routine_schema" := row.routineSchema,
        "routine_name" := row.routineName,
        "privilege_type" := row.privilegeType,
        "is_grantable" := row.isGrantable
      )}
  implicit val read: Read[RoutinePrivilegesViewRow] =
    new Read[RoutinePrivilegesViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[YesOrNo], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => RoutinePrivilegesViewRow(
        grantor = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0),
        grantee = Get[SqlIdentifier].unsafeGetNullable(rs, i + 1),
        specificCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 2),
        specificSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 3),
        specificName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 4),
        routineCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 5),
        routineSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 6),
        routineName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 7),
        privilegeType = Get[CharacterData].unsafeGetNullable(rs, i + 8),
        isGrantable = Get[YesOrNo].unsafeGetNullable(rs, i + 9)
      )
    )
  

}
