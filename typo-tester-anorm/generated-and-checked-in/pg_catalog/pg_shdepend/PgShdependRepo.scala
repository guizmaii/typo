/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_shdepend

import java.sql.Connection

trait PgShdependRepo {
  def insert(unsaved: PgShdependRow)(implicit c: Connection): PgShdependRow
  def selectAll(implicit c: Connection): List[PgShdependRow]
}
