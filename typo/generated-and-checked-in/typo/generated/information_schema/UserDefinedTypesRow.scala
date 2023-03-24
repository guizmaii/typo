/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class UserDefinedTypesRow(
  userDefinedTypeCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"user_defined_type_catalog","columnName":"user_defined_type_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  userDefinedTypeSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"user_defined_type_schema","columnName":"user_defined_type_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  userDefinedTypeName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"user_defined_type_name","columnName":"user_defined_type_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  userDefinedTypeCategory: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"user_defined_type_category","columnName":"user_defined_type_category","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  isInstantiable: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":3,"columnLabel":"is_instantiable","columnName":"is_instantiable","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":3,"scale":0} */,
  isFinal: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":3,"columnLabel":"is_final","columnName":"is_final","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":3,"scale":0} */,
  orderingForm: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ordering_form","columnName":"ordering_form","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  orderingCategory: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ordering_category","columnName":"ordering_category","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  orderingRoutineCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ordering_routine_catalog","columnName":"ordering_routine_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  orderingRoutineSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ordering_routine_schema","columnName":"ordering_routine_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  orderingRoutineName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ordering_routine_name","columnName":"ordering_routine_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  referenceType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"reference_type","columnName":"reference_type","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  dataType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"data_type","columnName":"data_type","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  characterMaximumLength: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"character_maximum_length","columnName":"character_maximum_length","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  characterOctetLength: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"character_octet_length","columnName":"character_octet_length","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  characterSetCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"character_set_catalog","columnName":"character_set_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  characterSetSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"character_set_schema","columnName":"character_set_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  characterSetName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"character_set_name","columnName":"character_set_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  collationCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"collation_catalog","columnName":"collation_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  collationSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"collation_schema","columnName":"collation_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  collationName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"collation_name","columnName":"collation_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  numericPrecision: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_precision","columnName":"numeric_precision","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  numericPrecisionRadix: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_precision_radix","columnName":"numeric_precision_radix","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  numericScale: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_scale","columnName":"numeric_scale","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  datetimePrecision: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"datetime_precision","columnName":"datetime_precision","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  intervalType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"interval_type","columnName":"interval_type","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  intervalPrecision: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"interval_precision","columnName":"interval_precision","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  sourceDtdIdentifier: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"source_dtd_identifier","columnName":"source_dtd_identifier","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  refDtdIdentifier: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"ref_dtd_identifier","columnName":"ref_dtd_identifier","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object UserDefinedTypesRow {
  implicit val rowParser: RowParser[UserDefinedTypesRow] = { row =>
    Success(
      UserDefinedTypesRow(
        userDefinedTypeCatalog = row[/* unknown nullability */ Option[String]]("user_defined_type_catalog"),
        userDefinedTypeSchema = row[/* unknown nullability */ Option[String]]("user_defined_type_schema"),
        userDefinedTypeName = row[/* unknown nullability */ Option[String]]("user_defined_type_name"),
        userDefinedTypeCategory = row[/* unknown nullability */ Option[String]]("user_defined_type_category"),
        isInstantiable = row[/* unknown nullability */ Option[String]]("is_instantiable"),
        isFinal = row[/* unknown nullability */ Option[String]]("is_final"),
        orderingForm = row[/* unknown nullability */ Option[String]]("ordering_form"),
        orderingCategory = row[/* unknown nullability */ Option[String]]("ordering_category"),
        orderingRoutineCatalog = row[/* unknown nullability */ Option[String]]("ordering_routine_catalog"),
        orderingRoutineSchema = row[/* unknown nullability */ Option[String]]("ordering_routine_schema"),
        orderingRoutineName = row[/* unknown nullability */ Option[String]]("ordering_routine_name"),
        referenceType = row[/* unknown nullability */ Option[String]]("reference_type"),
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
        sourceDtdIdentifier = row[/* unknown nullability */ Option[String]]("source_dtd_identifier"),
        refDtdIdentifier = row[/* unknown nullability */ Option[String]]("ref_dtd_identifier")
      )
    )
  }

  implicit val oFormat: OFormat[UserDefinedTypesRow] = new OFormat[UserDefinedTypesRow]{
    override def writes(o: UserDefinedTypesRow): JsObject =
      Json.obj(
        "user_defined_type_catalog" -> o.userDefinedTypeCatalog,
      "user_defined_type_schema" -> o.userDefinedTypeSchema,
      "user_defined_type_name" -> o.userDefinedTypeName,
      "user_defined_type_category" -> o.userDefinedTypeCategory,
      "is_instantiable" -> o.isInstantiable,
      "is_final" -> o.isFinal,
      "ordering_form" -> o.orderingForm,
      "ordering_category" -> o.orderingCategory,
      "ordering_routine_catalog" -> o.orderingRoutineCatalog,
      "ordering_routine_schema" -> o.orderingRoutineSchema,
      "ordering_routine_name" -> o.orderingRoutineName,
      "reference_type" -> o.referenceType,
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
      "source_dtd_identifier" -> o.sourceDtdIdentifier,
      "ref_dtd_identifier" -> o.refDtdIdentifier
      )

    override def reads(json: JsValue): JsResult[UserDefinedTypesRow] = {
      JsResult.fromTry(
        Try(
          UserDefinedTypesRow(
            userDefinedTypeCatalog = json.\("user_defined_type_catalog").toOption.map(_.as[String]),
            userDefinedTypeSchema = json.\("user_defined_type_schema").toOption.map(_.as[String]),
            userDefinedTypeName = json.\("user_defined_type_name").toOption.map(_.as[String]),
            userDefinedTypeCategory = json.\("user_defined_type_category").toOption.map(_.as[String]),
            isInstantiable = json.\("is_instantiable").toOption.map(_.as[String]),
            isFinal = json.\("is_final").toOption.map(_.as[String]),
            orderingForm = json.\("ordering_form").toOption.map(_.as[String]),
            orderingCategory = json.\("ordering_category").toOption.map(_.as[String]),
            orderingRoutineCatalog = json.\("ordering_routine_catalog").toOption.map(_.as[String]),
            orderingRoutineSchema = json.\("ordering_routine_schema").toOption.map(_.as[String]),
            orderingRoutineName = json.\("ordering_routine_name").toOption.map(_.as[String]),
            referenceType = json.\("reference_type").toOption.map(_.as[String]),
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
            sourceDtdIdentifier = json.\("source_dtd_identifier").toOption.map(_.as[String]),
            refDtdIdentifier = json.\("ref_dtd_identifier").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
