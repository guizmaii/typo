/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sql_implementation_info

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class SqlImplementationInfoRow(
  implementationInfoId: Option[CharacterData],
  implementationInfoName: Option[CharacterData],
  integerValue: Option[CardinalNumber],
  characterValue: Option[CharacterData],
  comments: Option[CharacterData]
)

object SqlImplementationInfoRow {
  implicit lazy val decoder: Decoder[SqlImplementationInfoRow] = Decoder.forProduct5[SqlImplementationInfoRow, Option[CharacterData], Option[CharacterData], Option[CardinalNumber], Option[CharacterData], Option[CharacterData]]("implementation_info_id", "implementation_info_name", "integer_value", "character_value", "comments")(SqlImplementationInfoRow.apply)(Decoder.decodeOption(CharacterData.decoder), Decoder.decodeOption(CharacterData.decoder), Decoder.decodeOption(CardinalNumber.decoder), Decoder.decodeOption(CharacterData.decoder), Decoder.decodeOption(CharacterData.decoder))
  implicit lazy val encoder: Encoder[SqlImplementationInfoRow] = Encoder.forProduct5[SqlImplementationInfoRow, Option[CharacterData], Option[CharacterData], Option[CardinalNumber], Option[CharacterData], Option[CharacterData]]("implementation_info_id", "implementation_info_name", "integer_value", "character_value", "comments")(x => (x.implementationInfoId, x.implementationInfoName, x.integerValue, x.characterValue, x.comments))(Encoder.encodeOption(CharacterData.encoder), Encoder.encodeOption(CharacterData.encoder), Encoder.encodeOption(CardinalNumber.encoder), Encoder.encodeOption(CharacterData.encoder), Encoder.encodeOption(CharacterData.encoder))
  implicit lazy val read: Read[SqlImplementationInfoRow] = new Read[SqlImplementationInfoRow](
    gets = List(
      (CharacterData.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SqlImplementationInfoRow(
      implementationInfoId = CharacterData.get.unsafeGetNullable(rs, i + 0),
      implementationInfoName = CharacterData.get.unsafeGetNullable(rs, i + 1),
      integerValue = CardinalNumber.get.unsafeGetNullable(rs, i + 2),
      characterValue = CharacterData.get.unsafeGetNullable(rs, i + 3),
      comments = CharacterData.get.unsafeGetNullable(rs, i + 4)
    )
  )
}
