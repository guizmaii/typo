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

case class ConstraintTableUsageRow(
  tableCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"table_catalog","columnName":"table_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  tableSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"table_schema","columnName":"table_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  tableName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"table_name","columnName":"table_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  constraintCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"constraint_catalog","columnName":"constraint_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  constraintSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"constraint_schema","columnName":"constraint_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  constraintName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"constraint_name","columnName":"constraint_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */
)

object ConstraintTableUsageRow {
  implicit val rowParser: RowParser[ConstraintTableUsageRow] = { row =>
    Success(
      ConstraintTableUsageRow(
        tableCatalog = row[/* unknown nullability */ Option[String]]("table_catalog"),
        tableSchema = row[/* unknown nullability */ Option[String]]("table_schema"),
        tableName = row[/* unknown nullability */ Option[String]]("table_name"),
        constraintCatalog = row[/* unknown nullability */ Option[String]]("constraint_catalog"),
        constraintSchema = row[/* unknown nullability */ Option[String]]("constraint_schema"),
        constraintName = row[/* unknown nullability */ Option[String]]("constraint_name")
      )
    )
  }

  implicit val oFormat: OFormat[ConstraintTableUsageRow] = new OFormat[ConstraintTableUsageRow]{
    override def writes(o: ConstraintTableUsageRow): JsObject =
      Json.obj(
        "table_catalog" -> o.tableCatalog,
      "table_schema" -> o.tableSchema,
      "table_name" -> o.tableName,
      "constraint_catalog" -> o.constraintCatalog,
      "constraint_schema" -> o.constraintSchema,
      "constraint_name" -> o.constraintName
      )

    override def reads(json: JsValue): JsResult[ConstraintTableUsageRow] = {
      JsResult.fromTry(
        Try(
          ConstraintTableUsageRow(
            tableCatalog = json.\("table_catalog").toOption.map(_.as[String]),
            tableSchema = json.\("table_schema").toOption.map(_.as[String]),
            tableName = json.\("table_name").toOption.map(_.as[String]),
            constraintCatalog = json.\("constraint_catalog").toOption.map(_.as[String]),
            constraintSchema = json.\("constraint_schema").toOption.map(_.as[String]),
            constraintName = json.\("constraint_name").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
