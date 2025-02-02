/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_server_options

import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class ForeignServerOptionsViewRow(
  /** Points to [[`_pg_foreign_servers`.PgForeignServersViewRow.foreignServerCatalog]] */
  foreignServerCatalog: Option[/* nullability unknown */ String],
  /** Points to [[`_pg_foreign_servers`.PgForeignServersViewRow.foreignServerName]] */
  foreignServerName: Option[/* nullability unknown */ String],
  optionName: /* nullability unknown */ Option[String],
  optionValue: /* nullability unknown */ Option[String]
)

object ForeignServerOptionsViewRow {
  implicit lazy val decoder: Decoder[ForeignServerOptionsViewRow] = Decoder.forProduct4[ForeignServerOptionsViewRow, Option[/* nullability unknown */ String], Option[/* nullability unknown */ String], /* nullability unknown */ Option[String], /* nullability unknown */ Option[String]]("foreign_server_catalog", "foreign_server_name", "option_name", "option_value")(ForeignServerOptionsViewRow.apply)(Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString))
  implicit lazy val encoder: Encoder[ForeignServerOptionsViewRow] = Encoder.forProduct4[ForeignServerOptionsViewRow, Option[/* nullability unknown */ String], Option[/* nullability unknown */ String], /* nullability unknown */ Option[String], /* nullability unknown */ Option[String]]("foreign_server_catalog", "foreign_server_name", "option_name", "option_value")(x => (x.foreignServerCatalog, x.foreignServerName, x.optionName, x.optionValue))(Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString))
  implicit lazy val read: Read[ForeignServerOptionsViewRow] = new Read[ForeignServerOptionsViewRow](
    gets = List(
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ForeignServerOptionsViewRow(
      foreignServerCatalog = Meta.StringMeta.get.unsafeGetNullable(rs, i + 0),
      foreignServerName = Meta.StringMeta.get.unsafeGetNullable(rs, i + 1),
      optionName = Meta.StringMeta.get.unsafeGetNullable(rs, i + 2),
      optionValue = Meta.StringMeta.get.unsafeGetNullable(rs, i + 3)
    )
  )
}
