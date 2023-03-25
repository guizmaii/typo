/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package postgres
package pg_catalog

import java.sql.Connection

trait PgDefaultAclRepo {
  def selectAll(implicit c: Connection): List[PgDefaultAclRow]
  def selectById(oid: PgDefaultAclId)(implicit c: Connection): Option[PgDefaultAclRow]
  def selectByIds(oids: List[PgDefaultAclId])(implicit c: Connection): List[PgDefaultAclRow]
  def selectByFieldValues(fieldValues: List[PgDefaultAclFieldValue[_]])(implicit c: Connection): List[PgDefaultAclRow]
  def updateFieldValues(oid: PgDefaultAclId, fieldValues: List[PgDefaultAclFieldValue[_]])(implicit c: Connection): Int
  def insert(oid: PgDefaultAclId, unsaved: PgDefaultAclRowUnsaved)(implicit c: Connection): Boolean
  def delete(oid: PgDefaultAclId)(implicit c: Connection): Boolean
  def selectByUniqueDefaclroleDefaclnamespaceDefaclobjtype(defaclrole: Long, defaclnamespace: Long, defaclobjtype: String)(implicit c: Connection): Option[PgDefaultAclRow]
}
