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

case class SqlFeaturesRow(
  featureId: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"feature_id","ordinal_position":1,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  featureName: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"feature_name","ordinal_position":2,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  subFeatureId: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"sub_feature_id","ordinal_position":3,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  subFeatureName: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"sub_feature_name","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  isSupported: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"is_supported","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_maximum_length":3,"character_octet_length":12,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"yes_or_no","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  isVerifiedBy: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"is_verified_by","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */,
  comments: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"sql_features","column_name":"comments","ordinal_position":7,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"YES"} */
)

object SqlFeaturesRow {
  implicit val rowParser: RowParser[SqlFeaturesRow] = { row =>
    Success(
      SqlFeaturesRow(
        featureId = row[Option[String]]("feature_id"),
        featureName = row[Option[String]]("feature_name"),
        subFeatureId = row[Option[String]]("sub_feature_id"),
        subFeatureName = row[Option[String]]("sub_feature_name"),
        isSupported = row[Option[String]]("is_supported"),
        isVerifiedBy = row[Option[String]]("is_verified_by"),
        comments = row[Option[String]]("comments")
      )
    )
  }

  implicit val oFormat: OFormat[SqlFeaturesRow] = new OFormat[SqlFeaturesRow]{
    override def writes(o: SqlFeaturesRow): JsObject =
      Json.obj(
        "feature_id" -> o.featureId,
      "feature_name" -> o.featureName,
      "sub_feature_id" -> o.subFeatureId,
      "sub_feature_name" -> o.subFeatureName,
      "is_supported" -> o.isSupported,
      "is_verified_by" -> o.isVerifiedBy,
      "comments" -> o.comments
      )

    override def reads(json: JsValue): JsResult[SqlFeaturesRow] = {
      JsResult.fromTry(
        Try(
          SqlFeaturesRow(
            featureId = json.\("feature_id").toOption.map(_.as[String]),
            featureName = json.\("feature_name").toOption.map(_.as[String]),
            subFeatureId = json.\("sub_feature_id").toOption.map(_.as[String]),
            subFeatureName = json.\("sub_feature_name").toOption.map(_.as[String]),
            isSupported = json.\("is_supported").toOption.map(_.as[String]),
            isVerifiedBy = json.\("is_verified_by").toOption.map(_.as[String]),
            comments = json.\("comments").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
