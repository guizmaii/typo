/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package postgres
package pg_catalog

import java.sql.Connection

trait PgSubscriptionRepo {
  def selectAll(implicit c: Connection): List[PgSubscriptionRow]
  def selectById(oid: PgSubscriptionId)(implicit c: Connection): Option[PgSubscriptionRow]
  def selectByIds(oids: List[PgSubscriptionId])(implicit c: Connection): List[PgSubscriptionRow]
  def selectByFieldValues(fieldValues: List[PgSubscriptionFieldValue[_]])(implicit c: Connection): List[PgSubscriptionRow]
  def updateFieldValues(oid: PgSubscriptionId, fieldValues: List[PgSubscriptionFieldValue[_]])(implicit c: Connection): Int
  def insert(oid: PgSubscriptionId, unsaved: PgSubscriptionRowUnsaved)(implicit c: Connection): Boolean
  def delete(oid: PgSubscriptionId)(implicit c: Connection): Boolean
  def selectByUniqueSubdbidSubname(subdbid: Long, subname: String)(implicit c: Connection): Option[PgSubscriptionRow]
}
