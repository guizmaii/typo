/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_database

import java.sql.Connection

trait PgDatabaseRepo {
  def delete(oid: PgDatabaseId)(implicit c: Connection): Boolean
  def insert(unsaved: PgDatabaseRow)(implicit c: Connection): PgDatabaseRow
  def selectAll(implicit c: Connection): List[PgDatabaseRow]
  def selectById(oid: PgDatabaseId)(implicit c: Connection): Option[PgDatabaseRow]
  def selectByIds(oids: Array[PgDatabaseId])(implicit c: Connection): List[PgDatabaseRow]
  def update(row: PgDatabaseRow)(implicit c: Connection): Boolean
  def upsert(unsaved: PgDatabaseRow)(implicit c: Connection): PgDatabaseRow
}
