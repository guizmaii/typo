/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_shdescription

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgShdescriptionRepo {
  def delete(compositeId: PgShdescriptionId): ConnectionIO[Boolean]
  def insert(unsaved: PgShdescriptionRow): ConnectionIO[PgShdescriptionRow]
  def selectAll: Stream[ConnectionIO, PgShdescriptionRow]
  def selectById(compositeId: PgShdescriptionId): ConnectionIO[Option[PgShdescriptionRow]]
  def update(row: PgShdescriptionRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgShdescriptionRow): ConnectionIO[PgShdescriptionRow]
}
