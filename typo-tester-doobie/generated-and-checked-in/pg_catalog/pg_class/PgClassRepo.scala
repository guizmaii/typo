/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_class

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgClassRepo {
  def delete(oid: PgClassId): ConnectionIO[Boolean]
  def insert(unsaved: PgClassRow): ConnectionIO[PgClassRow]
  def selectAll: Stream[ConnectionIO, PgClassRow]
  def selectById(oid: PgClassId): ConnectionIO[Option[PgClassRow]]
  def selectByIds(oids: Array[PgClassId]): Stream[ConnectionIO, PgClassRow]
  def update(row: PgClassRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgClassRow): ConnectionIO[PgClassRow]
}
