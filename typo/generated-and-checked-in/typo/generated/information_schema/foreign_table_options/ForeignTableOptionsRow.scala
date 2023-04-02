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
package foreign_table_options

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class ForeignTableOptionsRow(
  /** Points to [[`_pg_foreign_tables`.PgForeignTablesRow.foreignTableCatalog]] */
  foreignTableCatalog: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"foreign_table_options","column_name":"foreign_table_catalog","ordinal_position":1,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"1","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[`_pg_foreign_tables`.PgForeignTablesRow.foreignTableSchema]] */
  foreignTableSchema: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"foreign_table_options","column_name":"foreign_table_schema","ordinal_position":2,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"2","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  /** Points to [[`_pg_foreign_tables`.PgForeignTablesRow.foreignTableName]] */
  foreignTableName: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"foreign_table_options","column_name":"foreign_table_name","ordinal_position":3,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"3","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  optionName: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"foreign_table_options","column_name":"option_name","ordinal_position":4,"is_nullable":"YES","data_type":"name","collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"sql_identifier","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"name","dtd_identifier":"4","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */,
  optionValue: Option[String] /* {"table_catalog":"postgres","table_schema":"information_schema","table_name":"foreign_table_options","column_name":"option_value","ordinal_position":5,"is_nullable":"YES","data_type":"character varying","character_octet_length":1073741824,"collation_catalog":"postgres","collation_schema":"pg_catalog","collation_name":"C","domain_catalog":"postgres","domain_schema":"information_schema","domain_name":"character_data","udt_catalog":"postgres","udt_schema":"pg_catalog","udt_name":"varchar","dtd_identifier":"5","is_self_referencing":"NO","is_identity":"NO","identity_cycle":"NO","is_generated":"NEVER","is_updatable":"NO"} */
)

object ForeignTableOptionsRow {
  def rowParser(prefix: String): RowParser[ForeignTableOptionsRow] = { row =>
    Success(
      ForeignTableOptionsRow(
        foreignTableCatalog = row[Option[String]](prefix + "foreign_table_catalog"),
        foreignTableSchema = row[Option[String]](prefix + "foreign_table_schema"),
        foreignTableName = row[Option[String]](prefix + "foreign_table_name"),
        optionName = row[Option[String]](prefix + "option_name"),
        optionValue = row[Option[String]](prefix + "option_value")
      )
    )
  }

  implicit val oFormat: OFormat[ForeignTableOptionsRow] = new OFormat[ForeignTableOptionsRow]{
    override def writes(o: ForeignTableOptionsRow): JsObject =
      Json.obj(
        "foreign_table_catalog" -> o.foreignTableCatalog,
      "foreign_table_schema" -> o.foreignTableSchema,
      "foreign_table_name" -> o.foreignTableName,
      "option_name" -> o.optionName,
      "option_value" -> o.optionValue
      )

    override def reads(json: JsValue): JsResult[ForeignTableOptionsRow] = {
      JsResult.fromTry(
        Try(
          ForeignTableOptionsRow(
            foreignTableCatalog = json.\("foreign_table_catalog").toOption.map(_.as[String]),
            foreignTableSchema = json.\("foreign_table_schema").toOption.map(_.as[String]),
            foreignTableName = json.\("foreign_table_name").toOption.map(_.as[String]),
            optionName = json.\("option_name").toOption.map(_.as[String]),
            optionValue = json.\("option_value").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
