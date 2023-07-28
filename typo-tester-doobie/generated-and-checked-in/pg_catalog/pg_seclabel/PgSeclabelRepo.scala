/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_seclabel

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgSeclabelRepo {
  def delete(compositeId: PgSeclabelId): ConnectionIO[Boolean]
  def insert(unsaved: PgSeclabelRow): ConnectionIO[PgSeclabelRow]
  def selectAll: Stream[ConnectionIO, PgSeclabelRow]
  def selectById(compositeId: PgSeclabelId): ConnectionIO[Option[PgSeclabelRow]]
  def update(row: PgSeclabelRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgSeclabelRow): ConnectionIO[PgSeclabelRow]
}
