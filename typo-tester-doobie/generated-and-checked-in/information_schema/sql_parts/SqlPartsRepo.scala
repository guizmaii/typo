/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sql_parts

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait SqlPartsRepo {
  def insert(unsaved: SqlPartsRow): ConnectionIO[SqlPartsRow]
  def selectAll: Stream[ConnectionIO, SqlPartsRow]
}
