/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_transform

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgTransformRepo {
  def delete(oid: PgTransformId): ConnectionIO[Boolean]
  def insert(unsaved: PgTransformRow): ConnectionIO[PgTransformRow]
  def selectAll: Stream[ConnectionIO, PgTransformRow]
  def selectById(oid: PgTransformId): ConnectionIO[Option[PgTransformRow]]
  def selectByIds(oids: Array[PgTransformId]): Stream[ConnectionIO, PgTransformRow]
  def update(row: PgTransformRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgTransformRow): ConnectionIO[PgTransformRow]
}
