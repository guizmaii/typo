/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_attrdef

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgAttrdefRepo {
  def delete(oid: PgAttrdefId): ConnectionIO[Boolean]
  def insert(unsaved: PgAttrdefRow): ConnectionIO[PgAttrdefRow]
  def selectAll: Stream[ConnectionIO, PgAttrdefRow]
  def selectById(oid: PgAttrdefId): ConnectionIO[Option[PgAttrdefRow]]
  def selectByIds(oids: Array[PgAttrdefId]): Stream[ConnectionIO, PgAttrdefRow]
  def update(row: PgAttrdefRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgAttrdefRow): ConnectionIO[PgAttrdefRow]
}
