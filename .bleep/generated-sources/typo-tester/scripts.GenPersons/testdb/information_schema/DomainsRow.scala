package testdb
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class DomainsRow(
  domainCatalog: /* unknown nullability */ Option[String],
  domainSchema: /* unknown nullability */ Option[String],
  domainName: /* unknown nullability */ Option[String],
  dataType: /* unknown nullability */ Option[String],
  characterMaximumLength: /* unknown nullability */ Option[Int],
  characterOctetLength: /* unknown nullability */ Option[Int],
  characterSetCatalog: /* unknown nullability */ Option[String],
  characterSetSchema: /* unknown nullability */ Option[String],
  characterSetName: /* unknown nullability */ Option[String],
  collationCatalog: /* unknown nullability */ Option[String],
  collationSchema: /* unknown nullability */ Option[String],
  collationName: /* unknown nullability */ Option[String],
  numericPrecision: /* unknown nullability */ Option[Int],
  numericPrecisionRadix: /* unknown nullability */ Option[Int],
  numericScale: /* unknown nullability */ Option[Int],
  datetimePrecision: /* unknown nullability */ Option[Int],
  intervalType: /* unknown nullability */ Option[String],
  intervalPrecision: /* unknown nullability */ Option[Int],
  domainDefault: /* unknown nullability */ Option[String],
  udtCatalog: /* unknown nullability */ Option[String],
  udtSchema: /* unknown nullability */ Option[String],
  udtName: /* unknown nullability */ Option[String],
  scopeCatalog: /* unknown nullability */ Option[String],
  scopeSchema: /* unknown nullability */ Option[String],
  scopeName: /* unknown nullability */ Option[String],
  maximumCardinality: /* unknown nullability */ Option[Int],
  dtdIdentifier: /* unknown nullability */ Option[String]
)

object DomainsRow {
  implicit val rowParser: RowParser[DomainsRow] = { row =>
    Success(
      DomainsRow(
        domainCatalog = row[/* unknown nullability */ Option[String]]("domain_catalog"),
        domainSchema = row[/* unknown nullability */ Option[String]]("domain_schema"),
        domainName = row[/* unknown nullability */ Option[String]]("domain_name"),
        dataType = row[/* unknown nullability */ Option[String]]("data_type"),
        characterMaximumLength = row[/* unknown nullability */ Option[Int]]("character_maximum_length"),
        characterOctetLength = row[/* unknown nullability */ Option[Int]]("character_octet_length"),
        characterSetCatalog = row[/* unknown nullability */ Option[String]]("character_set_catalog"),
        characterSetSchema = row[/* unknown nullability */ Option[String]]("character_set_schema"),
        characterSetName = row[/* unknown nullability */ Option[String]]("character_set_name"),
        collationCatalog = row[/* unknown nullability */ Option[String]]("collation_catalog"),
        collationSchema = row[/* unknown nullability */ Option[String]]("collation_schema"),
        collationName = row[/* unknown nullability */ Option[String]]("collation_name"),
        numericPrecision = row[/* unknown nullability */ Option[Int]]("numeric_precision"),
        numericPrecisionRadix = row[/* unknown nullability */ Option[Int]]("numeric_precision_radix"),
        numericScale = row[/* unknown nullability */ Option[Int]]("numeric_scale"),
        datetimePrecision = row[/* unknown nullability */ Option[Int]]("datetime_precision"),
        intervalType = row[/* unknown nullability */ Option[String]]("interval_type"),
        intervalPrecision = row[/* unknown nullability */ Option[Int]]("interval_precision"),
        domainDefault = row[/* unknown nullability */ Option[String]]("domain_default"),
        udtCatalog = row[/* unknown nullability */ Option[String]]("udt_catalog"),
        udtSchema = row[/* unknown nullability */ Option[String]]("udt_schema"),
        udtName = row[/* unknown nullability */ Option[String]]("udt_name"),
        scopeCatalog = row[/* unknown nullability */ Option[String]]("scope_catalog"),
        scopeSchema = row[/* unknown nullability */ Option[String]]("scope_schema"),
        scopeName = row[/* unknown nullability */ Option[String]]("scope_name"),
        maximumCardinality = row[/* unknown nullability */ Option[Int]]("maximum_cardinality"),
        dtdIdentifier = row[/* unknown nullability */ Option[String]]("dtd_identifier")
      )
    )
  }

  implicit val oFormat: OFormat[DomainsRow] = new OFormat[DomainsRow]{
    override def writes(o: DomainsRow): JsObject =
      Json.obj(
        "domain_catalog" -> o.domainCatalog,
      "domain_schema" -> o.domainSchema,
      "domain_name" -> o.domainName,
      "data_type" -> o.dataType,
      "character_maximum_length" -> o.characterMaximumLength,
      "character_octet_length" -> o.characterOctetLength,
      "character_set_catalog" -> o.characterSetCatalog,
      "character_set_schema" -> o.characterSetSchema,
      "character_set_name" -> o.characterSetName,
      "collation_catalog" -> o.collationCatalog,
      "collation_schema" -> o.collationSchema,
      "collation_name" -> o.collationName,
      "numeric_precision" -> o.numericPrecision,
      "numeric_precision_radix" -> o.numericPrecisionRadix,
      "numeric_scale" -> o.numericScale,
      "datetime_precision" -> o.datetimePrecision,
      "interval_type" -> o.intervalType,
      "interval_precision" -> o.intervalPrecision,
      "domain_default" -> o.domainDefault,
      "udt_catalog" -> o.udtCatalog,
      "udt_schema" -> o.udtSchema,
      "udt_name" -> o.udtName,
      "scope_catalog" -> o.scopeCatalog,
      "scope_schema" -> o.scopeSchema,
      "scope_name" -> o.scopeName,
      "maximum_cardinality" -> o.maximumCardinality,
      "dtd_identifier" -> o.dtdIdentifier
      )

    override def reads(json: JsValue): JsResult[DomainsRow] = {
      JsResult.fromTry(
        Try(
          DomainsRow(
            domainCatalog = json.\("domain_catalog").toOption.map(_.as[String]),
            domainSchema = json.\("domain_schema").toOption.map(_.as[String]),
            domainName = json.\("domain_name").toOption.map(_.as[String]),
            dataType = json.\("data_type").toOption.map(_.as[String]),
            characterMaximumLength = json.\("character_maximum_length").toOption.map(_.as[Int]),
            characterOctetLength = json.\("character_octet_length").toOption.map(_.as[Int]),
            characterSetCatalog = json.\("character_set_catalog").toOption.map(_.as[String]),
            characterSetSchema = json.\("character_set_schema").toOption.map(_.as[String]),
            characterSetName = json.\("character_set_name").toOption.map(_.as[String]),
            collationCatalog = json.\("collation_catalog").toOption.map(_.as[String]),
            collationSchema = json.\("collation_schema").toOption.map(_.as[String]),
            collationName = json.\("collation_name").toOption.map(_.as[String]),
            numericPrecision = json.\("numeric_precision").toOption.map(_.as[Int]),
            numericPrecisionRadix = json.\("numeric_precision_radix").toOption.map(_.as[Int]),
            numericScale = json.\("numeric_scale").toOption.map(_.as[Int]),
            datetimePrecision = json.\("datetime_precision").toOption.map(_.as[Int]),
            intervalType = json.\("interval_type").toOption.map(_.as[String]),
            intervalPrecision = json.\("interval_precision").toOption.map(_.as[Int]),
            domainDefault = json.\("domain_default").toOption.map(_.as[String]),
            udtCatalog = json.\("udt_catalog").toOption.map(_.as[String]),
            udtSchema = json.\("udt_schema").toOption.map(_.as[String]),
            udtName = json.\("udt_name").toOption.map(_.as[String]),
            scopeCatalog = json.\("scope_catalog").toOption.map(_.as[String]),
            scopeSchema = json.\("scope_schema").toOption.map(_.as[String]),
            scopeName = json.\("scope_name").toOption.map(_.as[String]),
            maximumCardinality = json.\("maximum_cardinality").toOption.map(_.as[Int]),
            dtdIdentifier = json.\("dtd_identifier").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
