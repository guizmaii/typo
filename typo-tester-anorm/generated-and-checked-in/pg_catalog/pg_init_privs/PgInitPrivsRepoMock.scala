/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_init_privs

import java.sql.Connection

class PgInitPrivsRepoMock(map: scala.collection.mutable.Map[PgInitPrivsId, PgInitPrivsRow] = scala.collection.mutable.Map.empty) extends PgInitPrivsRepo {
  override def delete(compositeId: PgInitPrivsId)(implicit c: Connection): Boolean = {
    map.remove(compositeId).isDefined
  }
  override def insert(unsaved: PgInitPrivsRow)(implicit c: Connection): PgInitPrivsRow = {
    if (map.contains(unsaved.compositeId))
      sys.error(s"id ${unsaved.compositeId} already exists")
    else
      map.put(unsaved.compositeId, unsaved)
    unsaved
  }
  override def selectAll(implicit c: Connection): List[PgInitPrivsRow] = {
    map.values.toList
  }
  override def selectById(compositeId: PgInitPrivsId)(implicit c: Connection): Option[PgInitPrivsRow] = {
    map.get(compositeId)
  }
  override def update(row: PgInitPrivsRow)(implicit c: Connection): Boolean = {
    map.get(row.compositeId) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.compositeId, row)
        true
      case None => false
    }
  }
  override def upsert(unsaved: PgInitPrivsRow)(implicit c: Connection): PgInitPrivsRow = {
    map.put(unsaved.compositeId, unsaved)
    unsaved
  }
}
