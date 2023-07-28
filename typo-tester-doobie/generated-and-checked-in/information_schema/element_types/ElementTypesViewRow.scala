/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package element_types

import adventureworks.information_schema.CardinalNumber
import adventureworks.information_schema.CharacterData
import adventureworks.information_schema.SqlIdentifier
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class ElementTypesViewRow(
  objectCatalog: Option[SqlIdentifier],
  /** Points to [[data_type_privileges.DataTypePrivilegesViewRow.objectSchema]] */
  objectSchema: Option[SqlIdentifier],
  /** Points to [[data_type_privileges.DataTypePrivilegesViewRow.objectName]] */
  objectName: Option[SqlIdentifier],
  /** Points to [[data_type_privileges.DataTypePrivilegesViewRow.objectType]] */
  objectType: Option[CharacterData],
  collectionTypeIdentifier: Option[SqlIdentifier],
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
  domainDefault: Option[CharacterData],
  udtCatalog: Option[SqlIdentifier],
  udtSchema: Option[SqlIdentifier],
  udtName: Option[SqlIdentifier],
  scopeCatalog: Option[SqlIdentifier],
  scopeSchema: Option[SqlIdentifier],
  scopeName: Option[SqlIdentifier],
  maximumCardinality: Option[CardinalNumber],
  /** Points to [[data_type_privileges.DataTypePrivilegesViewRow.dtdIdentifier]] */
  dtdIdentifier: Option[SqlIdentifier]
)

object ElementTypesViewRow {
  implicit val decoder: Decoder[ElementTypesViewRow] =
    (c: HCursor) =>
      for {
        objectCatalog <- c.downField("object_catalog").as[Option[SqlIdentifier]]
        objectSchema <- c.downField("object_schema").as[Option[SqlIdentifier]]
        objectName <- c.downField("object_name").as[Option[SqlIdentifier]]
        objectType <- c.downField("object_type").as[Option[CharacterData]]
        collectionTypeIdentifier <- c.downField("collection_type_identifier").as[Option[SqlIdentifier]]
        dataType <- c.downField("data_type").as[Option[CharacterData]]
        characterMaximumLength <- c.downField("character_maximum_length").as[Option[CardinalNumber]]
        characterOctetLength <- c.downField("character_octet_length").as[Option[CardinalNumber]]
        characterSetCatalog <- c.downField("character_set_catalog").as[Option[SqlIdentifier]]
        characterSetSchema <- c.downField("character_set_schema").as[Option[SqlIdentifier]]
        characterSetName <- c.downField("character_set_name").as[Option[SqlIdentifier]]
        collationCatalog <- c.downField("collation_catalog").as[Option[SqlIdentifier]]
        collationSchema <- c.downField("collation_schema").as[Option[SqlIdentifier]]
        collationName <- c.downField("collation_name").as[Option[SqlIdentifier]]
        numericPrecision <- c.downField("numeric_precision").as[Option[CardinalNumber]]
        numericPrecisionRadix <- c.downField("numeric_precision_radix").as[Option[CardinalNumber]]
        numericScale <- c.downField("numeric_scale").as[Option[CardinalNumber]]
        datetimePrecision <- c.downField("datetime_precision").as[Option[CardinalNumber]]
        intervalType <- c.downField("interval_type").as[Option[CharacterData]]
        intervalPrecision <- c.downField("interval_precision").as[Option[CardinalNumber]]
        domainDefault <- c.downField("domain_default").as[Option[CharacterData]]
        udtCatalog <- c.downField("udt_catalog").as[Option[SqlIdentifier]]
        udtSchema <- c.downField("udt_schema").as[Option[SqlIdentifier]]
        udtName <- c.downField("udt_name").as[Option[SqlIdentifier]]
        scopeCatalog <- c.downField("scope_catalog").as[Option[SqlIdentifier]]
        scopeSchema <- c.downField("scope_schema").as[Option[SqlIdentifier]]
        scopeName <- c.downField("scope_name").as[Option[SqlIdentifier]]
        maximumCardinality <- c.downField("maximum_cardinality").as[Option[CardinalNumber]]
        dtdIdentifier <- c.downField("dtd_identifier").as[Option[SqlIdentifier]]
      } yield ElementTypesViewRow(objectCatalog, objectSchema, objectName, objectType, collectionTypeIdentifier, dataType, characterMaximumLength, characterOctetLength, characterSetCatalog, characterSetSchema, characterSetName, collationCatalog, collationSchema, collationName, numericPrecision, numericPrecisionRadix, numericScale, datetimePrecision, intervalType, intervalPrecision, domainDefault, udtCatalog, udtSchema, udtName, scopeCatalog, scopeSchema, scopeName, maximumCardinality, dtdIdentifier)
  implicit val encoder: Encoder[ElementTypesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "object_catalog" := row.objectCatalog,
        "object_schema" := row.objectSchema,
        "object_name" := row.objectName,
        "object_type" := row.objectType,
        "collection_type_identifier" := row.collectionTypeIdentifier,
        "data_type" := row.dataType,
        "character_maximum_length" := row.characterMaximumLength,
        "character_octet_length" := row.characterOctetLength,
        "character_set_catalog" := row.characterSetCatalog,
        "character_set_schema" := row.characterSetSchema,
        "character_set_name" := row.characterSetName,
        "collation_catalog" := row.collationCatalog,
        "collation_schema" := row.collationSchema,
        "collation_name" := row.collationName,
        "numeric_precision" := row.numericPrecision,
        "numeric_precision_radix" := row.numericPrecisionRadix,
        "numeric_scale" := row.numericScale,
        "datetime_precision" := row.datetimePrecision,
        "interval_type" := row.intervalType,
        "interval_precision" := row.intervalPrecision,
        "domain_default" := row.domainDefault,
        "udt_catalog" := row.udtCatalog,
        "udt_schema" := row.udtSchema,
        "udt_name" := row.udtName,
        "scope_catalog" := row.scopeCatalog,
        "scope_schema" := row.scopeSchema,
        "scope_name" := row.scopeName,
        "maximum_cardinality" := row.maximumCardinality,
        "dtd_identifier" := row.dtdIdentifier
      )}
  implicit val read: Read[ElementTypesViewRow] =
    new Read[ElementTypesViewRow](
      gets = List(
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[CharacterData], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable),
        (Get[CardinalNumber], Nullability.Nullable),
        (Get[SqlIdentifier], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => ElementTypesViewRow(
        objectCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 0),
        objectSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 1),
        objectName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 2),
        objectType = Get[CharacterData].unsafeGetNullable(rs, i + 3),
        collectionTypeIdentifier = Get[SqlIdentifier].unsafeGetNullable(rs, i + 4),
        dataType = Get[CharacterData].unsafeGetNullable(rs, i + 5),
        characterMaximumLength = Get[CardinalNumber].unsafeGetNullable(rs, i + 6),
        characterOctetLength = Get[CardinalNumber].unsafeGetNullable(rs, i + 7),
        characterSetCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 8),
        characterSetSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 9),
        characterSetName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 10),
        collationCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 11),
        collationSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 12),
        collationName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 13),
        numericPrecision = Get[CardinalNumber].unsafeGetNullable(rs, i + 14),
        numericPrecisionRadix = Get[CardinalNumber].unsafeGetNullable(rs, i + 15),
        numericScale = Get[CardinalNumber].unsafeGetNullable(rs, i + 16),
        datetimePrecision = Get[CardinalNumber].unsafeGetNullable(rs, i + 17),
        intervalType = Get[CharacterData].unsafeGetNullable(rs, i + 18),
        intervalPrecision = Get[CardinalNumber].unsafeGetNullable(rs, i + 19),
        domainDefault = Get[CharacterData].unsafeGetNullable(rs, i + 20),
        udtCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 21),
        udtSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 22),
        udtName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 23),
        scopeCatalog = Get[SqlIdentifier].unsafeGetNullable(rs, i + 24),
        scopeSchema = Get[SqlIdentifier].unsafeGetNullable(rs, i + 25),
        scopeName = Get[SqlIdentifier].unsafeGetNullable(rs, i + 26),
        maximumCardinality = Get[CardinalNumber].unsafeGetNullable(rs, i + 27),
        dtdIdentifier = Get[SqlIdentifier].unsafeGetNullable(rs, i + 28)
      )
    )
  

}
