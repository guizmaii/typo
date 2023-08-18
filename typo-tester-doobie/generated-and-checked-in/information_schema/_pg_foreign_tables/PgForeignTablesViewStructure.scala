/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package `_pg_foreign_tables`

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgForeignTablesViewStructure[Row](val prefix: Option[String], val extract: Row => PgForeignTablesViewRow, val merge: (Row, PgForeignTablesViewRow) => Row)
  extends Relation[PgForeignTablesViewFields, PgForeignTablesViewRow, Row]
    with PgForeignTablesViewFields[Row] { outer =>

  override val foreignTableCatalog = new OptField[SqlIdentifier, Row](prefix, "foreign_table_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignTableCatalog, (row, value) => merge(row, extract(row).copy(foreignTableCatalog = value)))
  override val foreignTableSchema = new OptField[SqlIdentifier, Row](prefix, "foreign_table_schema", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignTableSchema, (row, value) => merge(row, extract(row).copy(foreignTableSchema = value)))
  override val foreignTableName = new OptField[SqlIdentifier, Row](prefix, "foreign_table_name", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignTableName, (row, value) => merge(row, extract(row).copy(foreignTableName = value)))
  override val ftoptions = new OptField[Array[String], Row](prefix, "ftoptions", None, Some("_text"))(x => extract(x).ftoptions, (row, value) => merge(row, extract(row).copy(ftoptions = value)))
  override val foreignServerCatalog = new OptField[SqlIdentifier, Row](prefix, "foreign_server_catalog", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignServerCatalog, (row, value) => merge(row, extract(row).copy(foreignServerCatalog = value)))
  override val foreignServerName = new OptField[SqlIdentifier, Row](prefix, "foreign_server_name", None, Some("information_schema.sql_identifier"))(x => extract(x).foreignServerName, (row, value) => merge(row, extract(row).copy(foreignServerName = value)))
  override val authorizationIdentifier = new OptField[SqlIdentifier, Row](prefix, "authorization_identifier", None, Some("information_schema.sql_identifier"))(x => extract(x).authorizationIdentifier, (row, value) => merge(row, extract(row).copy(authorizationIdentifier = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](foreignTableCatalog, foreignTableSchema, foreignTableName, ftoptions, foreignServerCatalog, foreignServerName, authorizationIdentifier)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgForeignTablesViewRow, merge: (NewRow, PgForeignTablesViewRow) => NewRow): PgForeignTablesViewStructure[NewRow] =
    new PgForeignTablesViewStructure(prefix, extract, merge)
}
