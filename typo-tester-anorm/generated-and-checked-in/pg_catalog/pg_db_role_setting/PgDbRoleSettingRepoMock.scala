/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_db_role_setting

import java.sql.Connection

class PgDbRoleSettingRepoMock(map: scala.collection.mutable.Map[PgDbRoleSettingId, PgDbRoleSettingRow] = scala.collection.mutable.Map.empty) extends PgDbRoleSettingRepo {
  override def delete(compositeId: PgDbRoleSettingId)(implicit c: Connection): Boolean = {
    map.remove(compositeId).isDefined
  }
  override def insert(unsaved: PgDbRoleSettingRow)(implicit c: Connection): PgDbRoleSettingRow = {
    if (map.contains(unsaved.compositeId))
      sys.error(s"id ${unsaved.compositeId} already exists")
    else
      map.put(unsaved.compositeId, unsaved)
    unsaved
  }
  override def selectAll(implicit c: Connection): List[PgDbRoleSettingRow] = {
    map.values.toList
  }
  override def selectById(compositeId: PgDbRoleSettingId)(implicit c: Connection): Option[PgDbRoleSettingRow] = {
    map.get(compositeId)
  }
  override def update(row: PgDbRoleSettingRow)(implicit c: Connection): Boolean = {
    map.get(row.compositeId) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.compositeId, row)
        true
      case None => false
    }
  }
  override def upsert(unsaved: PgDbRoleSettingRow)(implicit c: Connection): PgDbRoleSettingRow = {
    map.put(unsaved.compositeId, unsaved)
    unsaved
  }
}
