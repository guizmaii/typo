/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package table_privileges

import anorm.SqlStringInterpolation
import java.sql.Connection

object TablePrivilegesViewRepoImpl extends TablePrivilegesViewRepo {
  override def selectAll(implicit c: Connection): List[TablePrivilegesViewRow] = {
    SQL"""select grantor, grantee, table_catalog, table_schema, "table_name", privilege_type, is_grantable, with_hierarchy
          from information_schema.table_privileges
       """.as(TablePrivilegesViewRow.rowParser(1).*)
  }
}
