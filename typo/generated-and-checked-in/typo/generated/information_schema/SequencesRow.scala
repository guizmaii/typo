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

case class SequencesRow(
  sequenceCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"sequence_catalog","columnName":"sequence_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  sequenceSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"sequence_schema","columnName":"sequence_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  sequenceName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"sequence_name","columnName":"sequence_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  dataType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"data_type","columnName":"data_type","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  numericPrecision: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_precision","columnName":"numeric_precision","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  numericPrecisionRadix: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_precision_radix","columnName":"numeric_precision_radix","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  numericScale: /* unknown nullability */ Option[Int] /* {"columnClassName":"java.lang.Integer","columnDisplaySize":11,"columnLabel":"numeric_scale","columnName":"numeric_scale","columnType":"Integer","columnTypeName":"int4","format":0,"isAutoIncrement":false,"isCaseSensitive":false,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":true,"isWritable":true,"precision":10,"scale":0} */,
  startValue: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"start_value","columnName":"start_value","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  minimumValue: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"minimum_value","columnName":"minimum_value","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  maximumValue: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"maximum_value","columnName":"maximum_value","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  increment: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"increment","columnName":"increment","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  cycleOption: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":3,"columnLabel":"cycle_option","columnName":"cycle_option","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":3,"scale":0} */
)

object SequencesRow {
  implicit val rowParser: RowParser[SequencesRow] = { row =>
    Success(
      SequencesRow(
        sequenceCatalog = row[/* unknown nullability */ Option[String]]("sequence_catalog"),
        sequenceSchema = row[/* unknown nullability */ Option[String]]("sequence_schema"),
        sequenceName = row[/* unknown nullability */ Option[String]]("sequence_name"),
        dataType = row[/* unknown nullability */ Option[String]]("data_type"),
        numericPrecision = row[/* unknown nullability */ Option[Int]]("numeric_precision"),
        numericPrecisionRadix = row[/* unknown nullability */ Option[Int]]("numeric_precision_radix"),
        numericScale = row[/* unknown nullability */ Option[Int]]("numeric_scale"),
        startValue = row[/* unknown nullability */ Option[String]]("start_value"),
        minimumValue = row[/* unknown nullability */ Option[String]]("minimum_value"),
        maximumValue = row[/* unknown nullability */ Option[String]]("maximum_value"),
        increment = row[/* unknown nullability */ Option[String]]("increment"),
        cycleOption = row[/* unknown nullability */ Option[String]]("cycle_option")
      )
    )
  }

  implicit val oFormat: OFormat[SequencesRow] = new OFormat[SequencesRow]{
    override def writes(o: SequencesRow): JsObject =
      Json.obj(
        "sequence_catalog" -> o.sequenceCatalog,
      "sequence_schema" -> o.sequenceSchema,
      "sequence_name" -> o.sequenceName,
      "data_type" -> o.dataType,
      "numeric_precision" -> o.numericPrecision,
      "numeric_precision_radix" -> o.numericPrecisionRadix,
      "numeric_scale" -> o.numericScale,
      "start_value" -> o.startValue,
      "minimum_value" -> o.minimumValue,
      "maximum_value" -> o.maximumValue,
      "increment" -> o.increment,
      "cycle_option" -> o.cycleOption
      )

    override def reads(json: JsValue): JsResult[SequencesRow] = {
      JsResult.fromTry(
        Try(
          SequencesRow(
            sequenceCatalog = json.\("sequence_catalog").toOption.map(_.as[String]),
            sequenceSchema = json.\("sequence_schema").toOption.map(_.as[String]),
            sequenceName = json.\("sequence_name").toOption.map(_.as[String]),
            dataType = json.\("data_type").toOption.map(_.as[String]),
            numericPrecision = json.\("numeric_precision").toOption.map(_.as[Int]),
            numericPrecisionRadix = json.\("numeric_precision_radix").toOption.map(_.as[Int]),
            numericScale = json.\("numeric_scale").toOption.map(_.as[Int]),
            startValue = json.\("start_value").toOption.map(_.as[String]),
            minimumValue = json.\("minimum_value").toOption.map(_.as[String]),
            maximumValue = json.\("maximum_value").toOption.map(_.as[String]),
            increment = json.\("increment").toOption.map(_.as[String]),
            cycleOption = json.\("cycle_option").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
