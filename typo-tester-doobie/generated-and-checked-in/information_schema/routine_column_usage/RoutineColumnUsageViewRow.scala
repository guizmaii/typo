/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package routine_column_usage

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class RoutineColumnUsageViewRow(
  specificCatalog: Option[SqlIdentifier],
  specificSchema: Option[SqlIdentifier],
  specificName: Option[SqlIdentifier],
  routineCatalog: Option[SqlIdentifier],
  routineSchema: Option[SqlIdentifier],
  routineName: Option[SqlIdentifier],
  tableCatalog: Option[SqlIdentifier],
  tableSchema: Option[SqlIdentifier],
  tableName: Option[SqlIdentifier],
  columnName: Option[SqlIdentifier]
)

object RoutineColumnUsageViewRow {
  implicit lazy val decoder: Decoder[RoutineColumnUsageViewRow] = Decoder.forProduct10[RoutineColumnUsageViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier]]("specific_catalog", "specific_schema", "specific_name", "routine_catalog", "routine_schema", "routine_name", "table_catalog", "table_schema", "table_name", "column_name")(RoutineColumnUsageViewRow.apply)(Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder))
  implicit lazy val encoder: Encoder[RoutineColumnUsageViewRow] = Encoder.forProduct10[RoutineColumnUsageViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier]]("specific_catalog", "specific_schema", "specific_name", "routine_catalog", "routine_schema", "routine_name", "table_catalog", "table_schema", "table_name", "column_name")(x => (x.specificCatalog, x.specificSchema, x.specificName, x.routineCatalog, x.routineSchema, x.routineName, x.tableCatalog, x.tableSchema, x.tableName, x.columnName))(Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder))
  implicit lazy val read: Read[RoutineColumnUsageViewRow] = new Read[RoutineColumnUsageViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => RoutineColumnUsageViewRow(
      specificCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 0),
      specificSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 1),
      specificName = SqlIdentifier.get.unsafeGetNullable(rs, i + 2),
      routineCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 3),
      routineSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 4),
      routineName = SqlIdentifier.get.unsafeGetNullable(rs, i + 5),
      tableCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 6),
      tableSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 7),
      tableName = SqlIdentifier.get.unsafeGetNullable(rs, i + 8),
      columnName = SqlIdentifier.get.unsafeGetNullable(rs, i + 9)
    )
  )
}
