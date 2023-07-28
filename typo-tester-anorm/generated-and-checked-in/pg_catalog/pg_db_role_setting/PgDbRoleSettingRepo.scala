/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_db_role_setting

import java.sql.Connection

trait PgDbRoleSettingRepo {
  def delete(compositeId: PgDbRoleSettingId)(implicit c: Connection): Boolean
  def insert(unsaved: PgDbRoleSettingRow)(implicit c: Connection): PgDbRoleSettingRow
  def selectAll(implicit c: Connection): List[PgDbRoleSettingRow]
  def selectById(compositeId: PgDbRoleSettingId)(implicit c: Connection): Option[PgDbRoleSettingRow]
  def update(row: PgDbRoleSettingRow)(implicit c: Connection): Boolean
  def upsert(unsaved: PgDbRoleSettingRow)(implicit c: Connection): PgDbRoleSettingRow
}
