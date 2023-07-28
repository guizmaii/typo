/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_dict

import doobie.free.connection.ConnectionIO
import fs2.Stream

trait PgTsDictRepo {
  def delete(oid: PgTsDictId): ConnectionIO[Boolean]
  def insert(unsaved: PgTsDictRow): ConnectionIO[PgTsDictRow]
  def selectAll: Stream[ConnectionIO, PgTsDictRow]
  def selectById(oid: PgTsDictId): ConnectionIO[Option[PgTsDictRow]]
  def selectByIds(oids: Array[PgTsDictId]): Stream[ConnectionIO, PgTsDictRow]
  def update(row: PgTsDictRow): ConnectionIO[Boolean]
  def upsert(unsaved: PgTsDictRow): ConnectionIO[PgTsDictRow]
}
