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

case class RoutinePrivilegesRow(
  grantor: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"grantor","columnName":"grantor","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  grantee: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"grantee","columnName":"grantee","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  specificCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"specific_catalog","columnName":"specific_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  specificSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"specific_schema","columnName":"specific_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  specificName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"specific_name","columnName":"specific_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  routineCatalog: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"routine_catalog","columnName":"routine_catalog","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  routineSchema: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"routine_schema","columnName":"routine_schema","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  routineName: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"routine_name","columnName":"routine_name","columnType":"VarChar","columnTypeName":"name","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  privilegeType: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":2147483647,"columnLabel":"privilege_type","columnName":"privilege_type","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":2147483647,"scale":0} */,
  isGrantable: /* unknown nullability */ Option[String] /* {"columnClassName":"java.lang.String","columnDisplaySize":3,"columnLabel":"is_grantable","columnName":"is_grantable","columnType":"VarChar","columnTypeName":"varchar","format":0,"isAutoIncrement":false,"isCaseSensitive":true,"isCurrency":false,"isDefinitelyWritable":false,"isNullable":"NullableUnknown","isReadOnly":false,"isSearchable":true,"isSigned":false,"isWritable":true,"precision":3,"scale":0} */
)

object RoutinePrivilegesRow {
  implicit val rowParser: RowParser[RoutinePrivilegesRow] = { row =>
    Success(
      RoutinePrivilegesRow(
        grantor = row[/* unknown nullability */ Option[String]]("grantor"),
        grantee = row[/* unknown nullability */ Option[String]]("grantee"),
        specificCatalog = row[/* unknown nullability */ Option[String]]("specific_catalog"),
        specificSchema = row[/* unknown nullability */ Option[String]]("specific_schema"),
        specificName = row[/* unknown nullability */ Option[String]]("specific_name"),
        routineCatalog = row[/* unknown nullability */ Option[String]]("routine_catalog"),
        routineSchema = row[/* unknown nullability */ Option[String]]("routine_schema"),
        routineName = row[/* unknown nullability */ Option[String]]("routine_name"),
        privilegeType = row[/* unknown nullability */ Option[String]]("privilege_type"),
        isGrantable = row[/* unknown nullability */ Option[String]]("is_grantable")
      )
    )
  }

  implicit val oFormat: OFormat[RoutinePrivilegesRow] = new OFormat[RoutinePrivilegesRow]{
    override def writes(o: RoutinePrivilegesRow): JsObject =
      Json.obj(
        "grantor" -> o.grantor,
      "grantee" -> o.grantee,
      "specific_catalog" -> o.specificCatalog,
      "specific_schema" -> o.specificSchema,
      "specific_name" -> o.specificName,
      "routine_catalog" -> o.routineCatalog,
      "routine_schema" -> o.routineSchema,
      "routine_name" -> o.routineName,
      "privilege_type" -> o.privilegeType,
      "is_grantable" -> o.isGrantable
      )

    override def reads(json: JsValue): JsResult[RoutinePrivilegesRow] = {
      JsResult.fromTry(
        Try(
          RoutinePrivilegesRow(
            grantor = json.\("grantor").toOption.map(_.as[String]),
            grantee = json.\("grantee").toOption.map(_.as[String]),
            specificCatalog = json.\("specific_catalog").toOption.map(_.as[String]),
            specificSchema = json.\("specific_schema").toOption.map(_.as[String]),
            specificName = json.\("specific_name").toOption.map(_.as[String]),
            routineCatalog = json.\("routine_catalog").toOption.map(_.as[String]),
            routineSchema = json.\("routine_schema").toOption.map(_.as[String]),
            routineName = json.\("routine_name").toOption.map(_.as[String]),
            privilegeType = json.\("privilege_type").toOption.map(_.as[String]),
            isGrantable = json.\("is_grantable").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
