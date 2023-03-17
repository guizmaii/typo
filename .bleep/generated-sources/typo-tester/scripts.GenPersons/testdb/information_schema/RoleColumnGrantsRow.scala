package testdb.information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class RoleColumnGrantsRow(
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.grantor]] */
  grantor: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.grantee]] */
  grantee: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.tableCatalog]] */
  tableCatalog: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.tableSchema]] */
  tableSchema: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.tableName]] */
  tableName: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.columnName]] */
  columnName: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.privilegeType]] */
  privilegeType: Option[String],
  /** Points to [[testdb.information_schema.ColumnPrivilegesRow.isGrantable]] */
  isGrantable: Option[String]
)

object RoleColumnGrantsRow {
  implicit val rowParser: RowParser[RoleColumnGrantsRow] = { row =>
    Success(
      RoleColumnGrantsRow(
        grantor = row[Option[String]]("grantor"),
        grantee = row[Option[String]]("grantee"),
        tableCatalog = row[Option[String]]("table_catalog"),
        tableSchema = row[Option[String]]("table_schema"),
        tableName = row[Option[String]]("table_name"),
        columnName = row[Option[String]]("column_name"),
        privilegeType = row[Option[String]]("privilege_type"),
        isGrantable = row[Option[String]]("is_grantable")
      )
    )
  }

  implicit val oFormat: OFormat[RoleColumnGrantsRow] = new OFormat[RoleColumnGrantsRow]{
    override def writes(o: RoleColumnGrantsRow): JsObject =
      Json.obj(
        "grantor" -> o.grantor,
      "grantee" -> o.grantee,
      "table_catalog" -> o.tableCatalog,
      "table_schema" -> o.tableSchema,
      "table_name" -> o.tableName,
      "column_name" -> o.columnName,
      "privilege_type" -> o.privilegeType,
      "is_grantable" -> o.isGrantable
      )

    override def reads(json: JsValue): JsResult[RoleColumnGrantsRow] = {
      JsResult.fromTry(
        Try(
          RoleColumnGrantsRow(
            grantor = json.\("grantor").toOption.map(_.as[String]),
            grantee = json.\("grantee").toOption.map(_.as[String]),
            tableCatalog = json.\("table_catalog").toOption.map(_.as[String]),
            tableSchema = json.\("table_schema").toOption.map(_.as[String]),
            tableName = json.\("table_name").toOption.map(_.as[String]),
            columnName = json.\("column_name").toOption.map(_.as[String]),
            privilegeType = json.\("privilege_type").toOption.map(_.as[String]),
            isGrantable = json.\("is_grantable").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
