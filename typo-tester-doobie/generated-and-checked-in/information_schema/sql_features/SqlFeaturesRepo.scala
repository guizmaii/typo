/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sql_features

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait SqlFeaturesRepo {
  def insert(unsaved: SqlFeaturesRow): ConnectionIO[SqlFeaturesRow]
  def selectAll: Stream[ConnectionIO, SqlFeaturesRow]
}
