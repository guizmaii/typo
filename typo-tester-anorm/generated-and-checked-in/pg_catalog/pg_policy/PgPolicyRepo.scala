/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_policy

import java.sql.Connection

trait PgPolicyRepo {
  def delete(oid: PgPolicyId)(implicit c: Connection): Boolean
  def insert(unsaved: PgPolicyRow)(implicit c: Connection): PgPolicyRow
  def selectAll(implicit c: Connection): List[PgPolicyRow]
  def selectById(oid: PgPolicyId)(implicit c: Connection): Option[PgPolicyRow]
  def selectByIds(oids: Array[PgPolicyId])(implicit c: Connection): List[PgPolicyRow]
  def update(row: PgPolicyRow)(implicit c: Connection): Boolean
  def upsert(unsaved: PgPolicyRow)(implicit c: Connection): PgPolicyRow
}
