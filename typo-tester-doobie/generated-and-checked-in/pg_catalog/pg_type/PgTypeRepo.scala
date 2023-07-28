/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_type

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgTypeRepo {
  def delete(oid: PgTypeId): ConnectionIO[Boolean]
  def insert(unsaved: PgTypeRow): ConnectionIO[PgTypeRow]
  def selectAll: Stream[ConnectionIO, PgTypeRow]
  def selectById(oid: PgTypeId): ConnectionIO[Option[PgTypeRow]]
  def selectByIds(oids: Array[PgTypeId]): Stream[ConnectionIO, PgTypeRow]
  def update(row: PgTypeRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgTypeRow): ConnectionIO[PgTypeRow]
}
