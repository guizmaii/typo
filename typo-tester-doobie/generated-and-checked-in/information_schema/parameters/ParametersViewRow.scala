/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package parameters

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.DecodingFailure
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import scala.util.Try

case class ParametersViewRow(
  specificCatalog: Option[SqlIdentifier],
  specificSchema: Option[SqlIdentifier],
  specificName: Option[SqlIdentifier],
  ordinalPosition: Option[CardinalNumber],
  parameterMode: Option[CharacterData],
  isResult: Option[YesOrNo],
  asLocator: Option[YesOrNo],
  parameterName: Option[SqlIdentifier],
  dataType: Option[CharacterData],
  characterMaximumLength: Option[CardinalNumber],
  characterOctetLength: Option[CardinalNumber],
  characterSetCatalog: Option[SqlIdentifier],
  characterSetSchema: Option[SqlIdentifier],
  characterSetName: Option[SqlIdentifier],
  collationCatalog: Option[SqlIdentifier],
  collationSchema: Option[SqlIdentifier],
  collationName: Option[SqlIdentifier],
  numericPrecision: Option[CardinalNumber],
  numericPrecisionRadix: Option[CardinalNumber],
  numericScale: Option[CardinalNumber],
  datetimePrecision: Option[CardinalNumber],
  intervalType: Option[CharacterData],
  intervalPrecision: Option[CardinalNumber],
  udtCatalog: Option[SqlIdentifier],
  udtSchema: Option[SqlIdentifier],
  udtName: Option[SqlIdentifier],
  scopeCatalog: Option[SqlIdentifier],
  scopeSchema: Option[SqlIdentifier],
  scopeName: Option[SqlIdentifier],
  maximumCardinality: Option[CardinalNumber],
  dtdIdentifier: Option[SqlIdentifier],
  parameterDefault: Option[CharacterData]
)

object ParametersViewRow {
  implicit lazy val decoder: Decoder[ParametersViewRow] = Decoder.instanceTry[ParametersViewRow]((c: HCursor) =>
    Try {
      def orThrow[R](either: Either[DecodingFailure, R]): R = either match {
        case Left(err) => throw err
        case Right(r)  => r
      }
      ParametersViewRow(
        specificCatalog = orThrow(c.get("specific_catalog")(Decoder.decodeOption(SqlIdentifier.decoder))),
        specificSchema = orThrow(c.get("specific_schema")(Decoder.decodeOption(SqlIdentifier.decoder))),
        specificName = orThrow(c.get("specific_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        ordinalPosition = orThrow(c.get("ordinal_position")(Decoder.decodeOption(CardinalNumber.decoder))),
        parameterMode = orThrow(c.get("parameter_mode")(Decoder.decodeOption(CharacterData.decoder))),
        isResult = orThrow(c.get("is_result")(Decoder.decodeOption(YesOrNo.decoder))),
        asLocator = orThrow(c.get("as_locator")(Decoder.decodeOption(YesOrNo.decoder))),
        parameterName = orThrow(c.get("parameter_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        dataType = orThrow(c.get("data_type")(Decoder.decodeOption(CharacterData.decoder))),
        characterMaximumLength = orThrow(c.get("character_maximum_length")(Decoder.decodeOption(CardinalNumber.decoder))),
        characterOctetLength = orThrow(c.get("character_octet_length")(Decoder.decodeOption(CardinalNumber.decoder))),
        characterSetCatalog = orThrow(c.get("character_set_catalog")(Decoder.decodeOption(SqlIdentifier.decoder))),
        characterSetSchema = orThrow(c.get("character_set_schema")(Decoder.decodeOption(SqlIdentifier.decoder))),
        characterSetName = orThrow(c.get("character_set_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        collationCatalog = orThrow(c.get("collation_catalog")(Decoder.decodeOption(SqlIdentifier.decoder))),
        collationSchema = orThrow(c.get("collation_schema")(Decoder.decodeOption(SqlIdentifier.decoder))),
        collationName = orThrow(c.get("collation_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        numericPrecision = orThrow(c.get("numeric_precision")(Decoder.decodeOption(CardinalNumber.decoder))),
        numericPrecisionRadix = orThrow(c.get("numeric_precision_radix")(Decoder.decodeOption(CardinalNumber.decoder))),
        numericScale = orThrow(c.get("numeric_scale")(Decoder.decodeOption(CardinalNumber.decoder))),
        datetimePrecision = orThrow(c.get("datetime_precision")(Decoder.decodeOption(CardinalNumber.decoder))),
        intervalType = orThrow(c.get("interval_type")(Decoder.decodeOption(CharacterData.decoder))),
        intervalPrecision = orThrow(c.get("interval_precision")(Decoder.decodeOption(CardinalNumber.decoder))),
        udtCatalog = orThrow(c.get("udt_catalog")(Decoder.decodeOption(SqlIdentifier.decoder))),
        udtSchema = orThrow(c.get("udt_schema")(Decoder.decodeOption(SqlIdentifier.decoder))),
        udtName = orThrow(c.get("udt_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        scopeCatalog = orThrow(c.get("scope_catalog")(Decoder.decodeOption(SqlIdentifier.decoder))),
        scopeSchema = orThrow(c.get("scope_schema")(Decoder.decodeOption(SqlIdentifier.decoder))),
        scopeName = orThrow(c.get("scope_name")(Decoder.decodeOption(SqlIdentifier.decoder))),
        maximumCardinality = orThrow(c.get("maximum_cardinality")(Decoder.decodeOption(CardinalNumber.decoder))),
        dtdIdentifier = orThrow(c.get("dtd_identifier")(Decoder.decodeOption(SqlIdentifier.decoder))),
        parameterDefault = orThrow(c.get("parameter_default")(Decoder.decodeOption(CharacterData.decoder)))
      )
    }
  )
  implicit lazy val encoder: Encoder[ParametersViewRow] = Encoder[ParametersViewRow](row =>
    Json.obj(
      "specific_catalog" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.specificCatalog),
      "specific_schema" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.specificSchema),
      "specific_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.specificName),
      "ordinal_position" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.ordinalPosition),
      "parameter_mode" -> Encoder.encodeOption(CharacterData.encoder).apply(row.parameterMode),
      "is_result" -> Encoder.encodeOption(YesOrNo.encoder).apply(row.isResult),
      "as_locator" -> Encoder.encodeOption(YesOrNo.encoder).apply(row.asLocator),
      "parameter_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.parameterName),
      "data_type" -> Encoder.encodeOption(CharacterData.encoder).apply(row.dataType),
      "character_maximum_length" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.characterMaximumLength),
      "character_octet_length" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.characterOctetLength),
      "character_set_catalog" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.characterSetCatalog),
      "character_set_schema" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.characterSetSchema),
      "character_set_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.characterSetName),
      "collation_catalog" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.collationCatalog),
      "collation_schema" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.collationSchema),
      "collation_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.collationName),
      "numeric_precision" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.numericPrecision),
      "numeric_precision_radix" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.numericPrecisionRadix),
      "numeric_scale" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.numericScale),
      "datetime_precision" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.datetimePrecision),
      "interval_type" -> Encoder.encodeOption(CharacterData.encoder).apply(row.intervalType),
      "interval_precision" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.intervalPrecision),
      "udt_catalog" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.udtCatalog),
      "udt_schema" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.udtSchema),
      "udt_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.udtName),
      "scope_catalog" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.scopeCatalog),
      "scope_schema" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.scopeSchema),
      "scope_name" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.scopeName),
      "maximum_cardinality" -> Encoder.encodeOption(CardinalNumber.encoder).apply(row.maximumCardinality),
      "dtd_identifier" -> Encoder.encodeOption(SqlIdentifier.encoder).apply(row.dtdIdentifier),
      "parameter_default" -> Encoder.encodeOption(CharacterData.encoder).apply(row.parameterDefault)
    )
  )
  implicit lazy val read: Read[ParametersViewRow] = new Read[ParametersViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CardinalNumber.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (CharacterData.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => ParametersViewRow(
      specificCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 0),
      specificSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 1),
      specificName = SqlIdentifier.get.unsafeGetNullable(rs, i + 2),
      ordinalPosition = CardinalNumber.get.unsafeGetNullable(rs, i + 3),
      parameterMode = CharacterData.get.unsafeGetNullable(rs, i + 4),
      isResult = YesOrNo.get.unsafeGetNullable(rs, i + 5),
      asLocator = YesOrNo.get.unsafeGetNullable(rs, i + 6),
      parameterName = SqlIdentifier.get.unsafeGetNullable(rs, i + 7),
      dataType = CharacterData.get.unsafeGetNullable(rs, i + 8),
      characterMaximumLength = CardinalNumber.get.unsafeGetNullable(rs, i + 9),
      characterOctetLength = CardinalNumber.get.unsafeGetNullable(rs, i + 10),
      characterSetCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 11),
      characterSetSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 12),
      characterSetName = SqlIdentifier.get.unsafeGetNullable(rs, i + 13),
      collationCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 14),
      collationSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 15),
      collationName = SqlIdentifier.get.unsafeGetNullable(rs, i + 16),
      numericPrecision = CardinalNumber.get.unsafeGetNullable(rs, i + 17),
      numericPrecisionRadix = CardinalNumber.get.unsafeGetNullable(rs, i + 18),
      numericScale = CardinalNumber.get.unsafeGetNullable(rs, i + 19),
      datetimePrecision = CardinalNumber.get.unsafeGetNullable(rs, i + 20),
      intervalType = CharacterData.get.unsafeGetNullable(rs, i + 21),
      intervalPrecision = CardinalNumber.get.unsafeGetNullable(rs, i + 22),
      udtCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 23),
      udtSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 24),
      udtName = SqlIdentifier.get.unsafeGetNullable(rs, i + 25),
      scopeCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 26),
      scopeSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 27),
      scopeName = SqlIdentifier.get.unsafeGetNullable(rs, i + 28),
      maximumCardinality = CardinalNumber.get.unsafeGetNullable(rs, i + 29),
      dtdIdentifier = SqlIdentifier.get.unsafeGetNullable(rs, i + 30),
      parameterDefault = CharacterData.get.unsafeGetNullable(rs, i + 31)
    )
  )
}
