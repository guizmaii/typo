/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_data_wrapper_options

import anorm.SqlStringInterpolation
import java.sql.Connection

object ForeignDataWrapperOptionsViewRepoImpl extends ForeignDataWrapperOptionsViewRepo {
  override def selectAll(implicit c: Connection): List[ForeignDataWrapperOptionsViewRow] = {
    SQL"""select foreign_data_wrapper_catalog, foreign_data_wrapper_name, option_name, option_value
          from information_schema.foreign_data_wrapper_options
       """.as(ForeignDataWrapperOptionsViewRow.rowParser(1).*)
  }
}
