/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package foreign_data_wrapper_options

import java.sql.Connection

trait ForeignDataWrapperOptionsViewRepo {
  def selectAll(implicit c: Connection): List[ForeignDataWrapperOptionsViewRow]
}
