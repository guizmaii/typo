/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package collations

import java.sql.Connection

trait CollationsViewRepo {
  def selectAll(implicit c: Connection): List[CollationsViewRow]
}
