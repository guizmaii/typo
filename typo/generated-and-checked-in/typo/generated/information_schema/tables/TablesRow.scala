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
package tables

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try
import typo.generated.information_schema.CharacterData
import typo.generated.information_schema.SqlIdentifier
import typo.generated.information_schema.YesOrNo

case class TablesRow(
  tableCatalog: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"table_catalog","ordinal_position":1,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  tableSchema: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"table_schema","ordinal_position":2,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  tableName: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"table_name","ordinal_position":3,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  tableType: Option[CharacterData] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"table_type","ordinal_position":4,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  selfReferencingColumnName: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"self_referencing_column_name","ordinal_position":5,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  referenceGeneration: Option[CharacterData] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"reference_generation","ordinal_position":6,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"6","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  userDefinedTypeCatalog: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"user_defined_type_catalog","ordinal_position":7,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"7","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  userDefinedTypeSchema: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"user_defined_type_schema","ordinal_position":8,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"8","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  userDefinedTypeName: Option[SqlIdentifier] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"user_defined_type_name","ordinal_position":9,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"9","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  isInsertableInto: Option[YesOrNo] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"is_insertable_into","ordinal_position":10,"is_nullable":"YES","data_type":"character varying","character_maximum_length":3,"character_octet_length":12,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"yes_or_no","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"10","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  isTyped: Option[YesOrNo] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"is_typed","ordinal_position":11,"is_nullable":"YES","data_type":"character varying","character_maximum_length":3,"character_octet_length":12,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"yes_or_no","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"11","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  commitAction: Option[CharacterData] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"tables","column_name":"commit_action","ordinal_position":12,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"12","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object TablesRow {
  def rowParser(prefix: String): RowParser[TablesRow] = { row =>
    Success(
      TablesRow(
        tableCatalog = row[Option[SqlIdentifier]](prefix + "table_catalog"),
        tableSchema = row[Option[SqlIdentifier]](prefix + "table_schema"),
        tableName = row[Option[SqlIdentifier]](prefix + "table_name"),
        tableType = row[Option[CharacterData]](prefix + "table_type"),
        selfReferencingColumnName = row[Option[SqlIdentifier]](prefix + "self_referencing_column_name"),
        referenceGeneration = row[Option[CharacterData]](prefix + "reference_generation"),
        userDefinedTypeCatalog = row[Option[SqlIdentifier]](prefix + "user_defined_type_catalog"),
        userDefinedTypeSchema = row[Option[SqlIdentifier]](prefix + "user_defined_type_schema"),
        userDefinedTypeName = row[Option[SqlIdentifier]](prefix + "user_defined_type_name"),
        isInsertableInto = row[Option[YesOrNo]](prefix + "is_insertable_into"),
        isTyped = row[Option[YesOrNo]](prefix + "is_typed"),
        commitAction = row[Option[CharacterData]](prefix + "commit_action")
      )
    )
  }

  implicit val oFormat: OFormat[TablesRow] = new OFormat[TablesRow]{
    override def writes(o: TablesRow): JsObject =
      Json.obj(
        "table_catalog" -> o.tableCatalog,
        "table_schema" -> o.tableSchema,
        "table_name" -> o.tableName,
        "table_type" -> o.tableType,
        "self_referencing_column_name" -> o.selfReferencingColumnName,
        "reference_generation" -> o.referenceGeneration,
        "user_defined_type_catalog" -> o.userDefinedTypeCatalog,
        "user_defined_type_schema" -> o.userDefinedTypeSchema,
        "user_defined_type_name" -> o.userDefinedTypeName,
        "is_insertable_into" -> o.isInsertableInto,
        "is_typed" -> o.isTyped,
        "commit_action" -> o.commitAction
      )
  
    override def reads(json: JsValue): JsResult[TablesRow] = {
      JsResult.fromTry(
        Try(
          TablesRow(
            tableCatalog = json.\("table_catalog").toOption.map(_.as[SqlIdentifier]),
            tableSchema = json.\("table_schema").toOption.map(_.as[SqlIdentifier]),
            tableName = json.\("table_name").toOption.map(_.as[SqlIdentifier]),
            tableType = json.\("table_type").toOption.map(_.as[CharacterData]),
            selfReferencingColumnName = json.\("self_referencing_column_name").toOption.map(_.as[SqlIdentifier]),
            referenceGeneration = json.\("reference_generation").toOption.map(_.as[CharacterData]),
            userDefinedTypeCatalog = json.\("user_defined_type_catalog").toOption.map(_.as[SqlIdentifier]),
            userDefinedTypeSchema = json.\("user_defined_type_schema").toOption.map(_.as[SqlIdentifier]),
            userDefinedTypeName = json.\("user_defined_type_name").toOption.map(_.as[SqlIdentifier]),
            isInsertableInto = json.\("is_insertable_into").toOption.map(_.as[YesOrNo]),
            isTyped = json.\("is_typed").toOption.map(_.as[YesOrNo]),
            commitAction = json.\("commit_action").toOption.map(_.as[CharacterData])
          )
        )
      )
    }
  }
}
