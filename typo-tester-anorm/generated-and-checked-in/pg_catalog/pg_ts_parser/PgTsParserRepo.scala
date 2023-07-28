/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_parser

import java.sql.Connection

trait PgTsParserRepo {
  def delete(oid: PgTsParserId)(implicit c: Connection): Boolean
  def insert(unsaved: PgTsParserRow)(implicit c: Connection): PgTsParserRow
  def selectAll(implicit c: Connection): List[PgTsParserRow]
  def selectById(oid: PgTsParserId)(implicit c: Connection): Option[PgTsParserRow]
  def selectByIds(oids: Array[PgTsParserId])(implicit c: Connection): List[PgTsParserRow]
  def update(row: PgTsParserRow)(implicit c: Connection): Boolean
  def upsert(unsaved: PgTsParserRow)(implicit c: Connection): PgTsParserRow
}
