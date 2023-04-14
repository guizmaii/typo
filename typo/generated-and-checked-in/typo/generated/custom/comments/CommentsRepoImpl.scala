/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package custom
package comments

import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import typo.generated.information_schema.SqlIdentifier

object CommentsRepoImpl extends CommentsRepo {
  override def apply()(implicit c: Connection): List[CommentsRow] = {
    val sql =
      SQL"""select c.table_schema,
             c.table_name,
             c.column_name,
             pgd.description
      from pg_catalog.pg_statio_all_tables as st
               inner join pg_catalog.pg_description pgd on (
          pgd.objoid = st.relid
          )
               inner join information_schema.columns c on (
                  pgd.objsubid = c.ordinal_position and
                  c.table_schema = st.schemaname and
                  c.table_name = st.relname
          )"""
    sql.as(rowParser.*)
  
  }
  val rowParser: RowParser[CommentsRow] =
    RowParser[CommentsRow] { row =>
      Success(
        CommentsRow(
          tableSchema = row[Option[SqlIdentifier]]("table_schema"),
          tableName = row[Option[SqlIdentifier]]("table_name"),
          columnName = row[Option[SqlIdentifier]]("column_name"),
          description = row[String]("description")
        )
      )
    }
}
