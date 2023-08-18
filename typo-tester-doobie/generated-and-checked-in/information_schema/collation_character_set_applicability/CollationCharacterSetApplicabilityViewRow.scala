/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package collation_character_set_applicability

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class CollationCharacterSetApplicabilityViewRow(
  collationCatalog: Option[SqlIdentifier],
  collationSchema: Option[SqlIdentifier],
  collationName: Option[SqlIdentifier],
  characterSetCatalog: Option[SqlIdentifier],
  characterSetSchema: Option[SqlIdentifier],
  characterSetName: Option[SqlIdentifier]
)

object CollationCharacterSetApplicabilityViewRow {
  implicit lazy val decoder: Decoder[CollationCharacterSetApplicabilityViewRow] = Decoder.forProduct6[CollationCharacterSetApplicabilityViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier]]("collation_catalog", "collation_schema", "collation_name", "character_set_catalog", "character_set_schema", "character_set_name")(CollationCharacterSetApplicabilityViewRow.apply)(Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder))
  implicit lazy val encoder: Encoder[CollationCharacterSetApplicabilityViewRow] = Encoder.forProduct6[CollationCharacterSetApplicabilityViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier]]("collation_catalog", "collation_schema", "collation_name", "character_set_catalog", "character_set_schema", "character_set_name")(x => (x.collationCatalog, x.collationSchema, x.collationName, x.characterSetCatalog, x.characterSetSchema, x.characterSetName))(Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder))
  implicit lazy val read: Read[CollationCharacterSetApplicabilityViewRow] = new Read[CollationCharacterSetApplicabilityViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => CollationCharacterSetApplicabilityViewRow(
      collationCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 0),
      collationSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 1),
      collationName = SqlIdentifier.get.unsafeGetNullable(rs, i + 2),
      characterSetCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 3),
      characterSetSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 4),
      characterSetName = SqlIdentifier.get.unsafeGetNullable(rs, i + 5)
    )
  )
}
