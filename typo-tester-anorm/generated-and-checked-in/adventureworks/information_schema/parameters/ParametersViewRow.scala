/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package parameters

import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class ParametersViewRow(
  specificCatalog: /* nullability unknown */ Option[String],
  specificSchema: /* nullability unknown */ Option[String],
  specificName: /* nullability unknown */ Option[String],
  ordinalPosition: /* nullability unknown */ Option[Int],
  parameterMode: /* nullability unknown */ Option[String],
  isResult: /* nullability unknown */ Option[/* max 3 chars */ String],
  asLocator: /* nullability unknown */ Option[/* max 3 chars */ String],
  parameterName: /* nullability unknown */ Option[String],
  dataType: /* nullability unknown */ Option[String],
  characterMaximumLength: /* nullability unknown */ Option[Int],
  characterOctetLength: /* nullability unknown */ Option[Int],
  characterSetCatalog: /* nullability unknown */ Option[String],
  characterSetSchema: /* nullability unknown */ Option[String],
  characterSetName: /* nullability unknown */ Option[String],
  collationCatalog: /* nullability unknown */ Option[String],
  collationSchema: /* nullability unknown */ Option[String],
  collationName: /* nullability unknown */ Option[String],
  numericPrecision: /* nullability unknown */ Option[Int],
  numericPrecisionRadix: /* nullability unknown */ Option[Int],
  numericScale: /* nullability unknown */ Option[Int],
  datetimePrecision: /* nullability unknown */ Option[Int],
  intervalType: /* nullability unknown */ Option[String],
  intervalPrecision: /* nullability unknown */ Option[Int],
  udtCatalog: /* nullability unknown */ Option[String],
  udtSchema: /* nullability unknown */ Option[String],
  udtName: /* nullability unknown */ Option[String],
  scopeCatalog: /* nullability unknown */ Option[String],
  scopeSchema: /* nullability unknown */ Option[String],
  scopeName: /* nullability unknown */ Option[String],
  maximumCardinality: /* nullability unknown */ Option[Int],
  dtdIdentifier: /* nullability unknown */ Option[String],
  parameterDefault: /* nullability unknown */ Option[String]
)

object ParametersViewRow {
  implicit lazy val reads: Reads[ParametersViewRow] = Reads[ParametersViewRow](json => JsResult.fromTry(
      Try(
        ParametersViewRow(
          specificCatalog = json.\("specific_catalog").toOption.map(_.as(Reads.StringReads)),
          specificSchema = json.\("specific_schema").toOption.map(_.as(Reads.StringReads)),
          specificName = json.\("specific_name").toOption.map(_.as(Reads.StringReads)),
          ordinalPosition = json.\("ordinal_position").toOption.map(_.as(Reads.IntReads)),
          parameterMode = json.\("parameter_mode").toOption.map(_.as(Reads.StringReads)),
          isResult = json.\("is_result").toOption.map(_.as(Reads.StringReads)),
          asLocator = json.\("as_locator").toOption.map(_.as(Reads.StringReads)),
          parameterName = json.\("parameter_name").toOption.map(_.as(Reads.StringReads)),
          dataType = json.\("data_type").toOption.map(_.as(Reads.StringReads)),
          characterMaximumLength = json.\("character_maximum_length").toOption.map(_.as(Reads.IntReads)),
          characterOctetLength = json.\("character_octet_length").toOption.map(_.as(Reads.IntReads)),
          characterSetCatalog = json.\("character_set_catalog").toOption.map(_.as(Reads.StringReads)),
          characterSetSchema = json.\("character_set_schema").toOption.map(_.as(Reads.StringReads)),
          characterSetName = json.\("character_set_name").toOption.map(_.as(Reads.StringReads)),
          collationCatalog = json.\("collation_catalog").toOption.map(_.as(Reads.StringReads)),
          collationSchema = json.\("collation_schema").toOption.map(_.as(Reads.StringReads)),
          collationName = json.\("collation_name").toOption.map(_.as(Reads.StringReads)),
          numericPrecision = json.\("numeric_precision").toOption.map(_.as(Reads.IntReads)),
          numericPrecisionRadix = json.\("numeric_precision_radix").toOption.map(_.as(Reads.IntReads)),
          numericScale = json.\("numeric_scale").toOption.map(_.as(Reads.IntReads)),
          datetimePrecision = json.\("datetime_precision").toOption.map(_.as(Reads.IntReads)),
          intervalType = json.\("interval_type").toOption.map(_.as(Reads.StringReads)),
          intervalPrecision = json.\("interval_precision").toOption.map(_.as(Reads.IntReads)),
          udtCatalog = json.\("udt_catalog").toOption.map(_.as(Reads.StringReads)),
          udtSchema = json.\("udt_schema").toOption.map(_.as(Reads.StringReads)),
          udtName = json.\("udt_name").toOption.map(_.as(Reads.StringReads)),
          scopeCatalog = json.\("scope_catalog").toOption.map(_.as(Reads.StringReads)),
          scopeSchema = json.\("scope_schema").toOption.map(_.as(Reads.StringReads)),
          scopeName = json.\("scope_name").toOption.map(_.as(Reads.StringReads)),
          maximumCardinality = json.\("maximum_cardinality").toOption.map(_.as(Reads.IntReads)),
          dtdIdentifier = json.\("dtd_identifier").toOption.map(_.as(Reads.StringReads)),
          parameterDefault = json.\("parameter_default").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[ParametersViewRow] = RowParser[ParametersViewRow] { row =>
    Success(
      ParametersViewRow(
        specificCatalog = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        specificSchema = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        specificName = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        ordinalPosition = row(idx + 3)(Column.columnToOption(Column.columnToInt)),
        parameterMode = row(idx + 4)(Column.columnToOption(Column.columnToString)),
        isResult = row(idx + 5)(Column.columnToOption(Column.columnToString)),
        asLocator = row(idx + 6)(Column.columnToOption(Column.columnToString)),
        parameterName = row(idx + 7)(Column.columnToOption(Column.columnToString)),
        dataType = row(idx + 8)(Column.columnToOption(Column.columnToString)),
        characterMaximumLength = row(idx + 9)(Column.columnToOption(Column.columnToInt)),
        characterOctetLength = row(idx + 10)(Column.columnToOption(Column.columnToInt)),
        characterSetCatalog = row(idx + 11)(Column.columnToOption(Column.columnToString)),
        characterSetSchema = row(idx + 12)(Column.columnToOption(Column.columnToString)),
        characterSetName = row(idx + 13)(Column.columnToOption(Column.columnToString)),
        collationCatalog = row(idx + 14)(Column.columnToOption(Column.columnToString)),
        collationSchema = row(idx + 15)(Column.columnToOption(Column.columnToString)),
        collationName = row(idx + 16)(Column.columnToOption(Column.columnToString)),
        numericPrecision = row(idx + 17)(Column.columnToOption(Column.columnToInt)),
        numericPrecisionRadix = row(idx + 18)(Column.columnToOption(Column.columnToInt)),
        numericScale = row(idx + 19)(Column.columnToOption(Column.columnToInt)),
        datetimePrecision = row(idx + 20)(Column.columnToOption(Column.columnToInt)),
        intervalType = row(idx + 21)(Column.columnToOption(Column.columnToString)),
        intervalPrecision = row(idx + 22)(Column.columnToOption(Column.columnToInt)),
        udtCatalog = row(idx + 23)(Column.columnToOption(Column.columnToString)),
        udtSchema = row(idx + 24)(Column.columnToOption(Column.columnToString)),
        udtName = row(idx + 25)(Column.columnToOption(Column.columnToString)),
        scopeCatalog = row(idx + 26)(Column.columnToOption(Column.columnToString)),
        scopeSchema = row(idx + 27)(Column.columnToOption(Column.columnToString)),
        scopeName = row(idx + 28)(Column.columnToOption(Column.columnToString)),
        maximumCardinality = row(idx + 29)(Column.columnToOption(Column.columnToInt)),
        dtdIdentifier = row(idx + 30)(Column.columnToOption(Column.columnToString)),
        parameterDefault = row(idx + 31)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[ParametersViewRow] = OWrites[ParametersViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "specific_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificCatalog),
      "specific_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificSchema),
      "specific_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificName),
      "ordinal_position" -> Writes.OptionWrites(Writes.IntWrites).writes(o.ordinalPosition),
      "parameter_mode" -> Writes.OptionWrites(Writes.StringWrites).writes(o.parameterMode),
      "is_result" -> Writes.OptionWrites(Writes.StringWrites).writes(o.isResult),
      "as_locator" -> Writes.OptionWrites(Writes.StringWrites).writes(o.asLocator),
      "parameter_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.parameterName),
      "data_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.dataType),
      "character_maximum_length" -> Writes.OptionWrites(Writes.IntWrites).writes(o.characterMaximumLength),
      "character_octet_length" -> Writes.OptionWrites(Writes.IntWrites).writes(o.characterOctetLength),
      "character_set_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.characterSetCatalog),
      "character_set_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.characterSetSchema),
      "character_set_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.characterSetName),
      "collation_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.collationCatalog),
      "collation_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.collationSchema),
      "collation_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.collationName),
      "numeric_precision" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericPrecision),
      "numeric_precision_radix" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericPrecisionRadix),
      "numeric_scale" -> Writes.OptionWrites(Writes.IntWrites).writes(o.numericScale),
      "datetime_precision" -> Writes.OptionWrites(Writes.IntWrites).writes(o.datetimePrecision),
      "interval_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.intervalType),
      "interval_precision" -> Writes.OptionWrites(Writes.IntWrites).writes(o.intervalPrecision),
      "udt_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.udtCatalog),
      "udt_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.udtSchema),
      "udt_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.udtName),
      "scope_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.scopeCatalog),
      "scope_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.scopeSchema),
      "scope_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.scopeName),
      "maximum_cardinality" -> Writes.OptionWrites(Writes.IntWrites).writes(o.maximumCardinality),
      "dtd_identifier" -> Writes.OptionWrites(Writes.StringWrites).writes(o.dtdIdentifier),
      "parameter_default" -> Writes.OptionWrites(Writes.StringWrites).writes(o.parameterDefault)
    ))
  )
}
