/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package tables

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

case class TablesViewRow(
  tableCatalog: Option[SqlIdentifier],
  tableSchema: Option[SqlIdentifier],
  tableName: Option[SqlIdentifier],
  tableType: Option[CharacterData],
  selfReferencingColumnName: Option[SqlIdentifier],
  referenceGeneration: Option[CharacterData],
  userDefinedTypeCatalog: Option[SqlIdentifier],
  userDefinedTypeSchema: Option[SqlIdentifier],
  userDefinedTypeName: Option[SqlIdentifier],
  isInsertableInto: Option[YesOrNo],
  isTyped: Option[YesOrNo],
  commitAction: Option[CharacterData]
)

object TablesViewRow {
  implicit val decoder: Decoder[TablesViewRow] =
    (c: HCursor) =>
      for {
        tableCatalog <- c.downField("table_catalog").as[Option[SqlIdentifier]]
        tableSchema <- c.downField("table_schema").as[Option[SqlIdentifier]]
        tableName <- c.downField("table_name").as[Option[SqlIdentifier]]
        tableType <- c.downField("table_type").as[Option[CharacterData]]
        selfReferencingColumnName <- c.downField("self_referencing_column_name").as[Option[SqlIdentifier]]
        referenceGeneration <- c.downField("reference_generation").as[Option[CharacterData]]
        userDefinedTypeCatalog <- c.downField("user_defined_type_catalog").as[Option[SqlIdentifier]]
        userDefinedTypeSchema <- c.downField("user_defined_type_schema").as[Option[SqlIdentifier]]
        userDefinedTypeName <- c.downField("user_defined_type_name").as[Option[SqlIdentifier]]
        isInsertableInto <- c.downField("is_insertable_into").as[Option[YesOrNo]]
        isTyped <- c.downField("is_typed").as[Option[YesOrNo]]
        commitAction <- c.downField("commit_action").as[Option[CharacterData]]
      } yield TablesViewRow(tableCatalog, tableSchema, tableName, tableType, selfReferencingColumnName, referenceGeneration, userDefinedTypeCatalog, userDefinedTypeSchema, userDefinedTypeName, isInsertableInto, isTyped, commitAction)
  implicit val encoder: Encoder[TablesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "table_catalog" := row.tableCatalog,
        "table_schema" := row.tableSchema,
        "table_name" := row.tableName,
        "table_type" := row.tableType,
        "self_referencing_column_name" := row.selfReferencingColumnName,
        "reference_generation" := row.referenceGeneration,
        "user_defined_type_catalog" := row.userDefinedTypeCatalog,
        "user_defined_type_schema" := row.userDefinedTypeSchema,
        "user_defined_type_name" := row.userDefinedTypeName,
        "is_insertable_into" := row.isInsertableInto,
        "is_typed" := row.isTyped,
        "commit_action" := row.commitAction
      )}
  implicit val read: Read[TablesViewRow] =
    new Read[TablesViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[YesOrNo], Nullability.Nullable),
        (Get[YesOrNo], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => TablesViewRow(
        tableCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0),
        tableSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 1),
        tableName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 2),
        tableType = Get[CharacterData].unsafeGetNullable(rs, i + 3),
        selfReferencingColumnName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 4),
        referenceGeneration = Get[CharacterData].unsafeGetNullable(rs, i + 5),
        userDefinedTypeCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 6),
        userDefinedTypeSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 7),
        userDefinedTypeName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 8),
        isInsertableInto = Get[YesOrNo].unsafeGetNullable(rs, i + 9),
        isTyped = Get[YesOrNo].unsafeGetNullable(rs, i + 10),
        commitAction = Get[CharacterData].unsafeGetNullable(rs, i + 11)
      )
    )
  

}
