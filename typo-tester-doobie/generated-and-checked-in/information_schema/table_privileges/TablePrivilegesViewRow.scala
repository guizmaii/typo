/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package table_privileges

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class TablePrivilegesViewRow(
  grantor: Option[SqlIdentifier],
  grantee: Option[SqlIdentifier],
  tableCatalog: Option[SqlIdentifier],
  tableSchema: Option[SqlIdentifier],
  tableName: Option[SqlIdentifier],
  privilegeType: Option[CharacterData],
  isGrantable: Option[YesOrNo],
  withHierarchy: Option[YesOrNo]
)

object TablePrivilegesViewRow {
  implicit lazy val decoder: Decoder[TablePrivilegesViewRow] = Decoder.forProduct8[TablePrivilegesViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[CharacterData], Option[YesOrNo], Option[YesOrNo]]("grantor", "grantee", "table_catalog", "table_schema", "table_name", "privilege_type", "is_grantable", "with_hierarchy")(TablePrivilegesViewRow.apply)(Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(CharacterData.decoder), Decoder.decodeOption(YesOrNo.decoder), Decoder.decodeOption(YesOrNo.decoder))
  implicit lazy val encoder: Encoder[TablePrivilegesViewRow] = Encoder.forProduct8[TablePrivilegesViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[CharacterData], Option[YesOrNo], Option[YesOrNo]]("grantor", "grantee", "table_catalog", "table_schema", "table_name", "privilege_type", "is_grantable", "with_hierarchy")(x => (x.grantor, x.grantee, x.tableCatalog, x.tableSchema, x.tableName, x.privilegeType, x.isGrantable, x.withHierarchy))(Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(CharacterData.encoder), Encoder.encodeOption(YesOrNo.encoder), Encoder.encodeOption(YesOrNo.encoder))
  implicit lazy val read: Read[TablePrivilegesViewRow] = new Read[TablePrivilegesViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => TablePrivilegesViewRow(
      grantor = SqlIdentifier.get.unsafeGetNullable(rs, i + 0),
      grantee = SqlIdentifier.get.unsafeGetNullable(rs, i + 1),
      tableCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 2),
      tableSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 3),
      tableName = SqlIdentifier.get.unsafeGetNullable(rs, i + 4),
      privilegeType = CharacterData.get.unsafeGetNullable(rs, i + 5),
      isGrantable = YesOrNo.get.unsafeGetNullable(rs, i + 6),
      withHierarchy = YesOrNo.get.unsafeGetNullable(rs, i + 7)
    )
  )
}
