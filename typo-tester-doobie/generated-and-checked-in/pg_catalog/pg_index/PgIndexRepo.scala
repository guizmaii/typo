/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_index

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgIndexRepo {
  def delete(indexrelid: PgIndexId): ConnectionIO[Boolean]
  def insert(unsaved: PgIndexRow): ConnectionIO[PgIndexRow]
  def selectAll: Stream[ConnectionIO, PgIndexRow]
  def selectById(indexrelid: PgIndexId): ConnectionIO[Option[PgIndexRow]]
  def selectByIds(indexrelids: Array[PgIndexId]): Stream[ConnectionIO, PgIndexRow]
  def update(row: PgIndexRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgIndexRow): ConnectionIO[PgIndexRow]
}
