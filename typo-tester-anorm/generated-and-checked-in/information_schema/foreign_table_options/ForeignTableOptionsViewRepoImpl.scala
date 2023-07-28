/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_table_options

import anorm.SqlStringInterpolation
import java.sql.Connection

object ForeignTableOptionsViewRepoImpl extends ForeignTableOptionsViewRepo {
  override def selectAll(implicit c: Connection): List[ForeignTableOptionsViewRow] = {
    SQL"""select foreign_table_catalog, foreign_table_schema, foreign_table_name, option_name, option_value
          from information_schema.foreign_table_options
       """.as(ForeignTableOptionsViewRow.rowParser(1).*)
  }
}
