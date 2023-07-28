/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_description

import java.sql.Connection

class PgDescriptionRepoMock(map: scala.collection.mutable.Map[PgDescriptionId, PgDescriptionRow] = scala.collection.mutable.Map.empty) extends PgDescriptionRepo {
  override def delete(compositeId: PgDescriptionId)(implicit c: Connection): Boolean = {
    map.remove(compositeId).isDefined
  }
  override def insert(unsaved: PgDescriptionRow)(implicit c: Connection): PgDescriptionRow = {
    if (map.contains(unsaved.compositeId))
      sys.error(s"id ${unsaved.compositeId} already exists")
    else
      map.put(unsaved.compositeId, unsaved)
    unsaved
  }
  override def selectAll(implicit c: Connection): List[PgDescriptionRow] = {
    map.values.toList
  }
  override def selectById(compositeId: PgDescriptionId)(implicit c: Connection): Option[PgDescriptionRow] = {
    map.get(compositeId)
  }
  override def update(row: PgDescriptionRow)(implicit c: Connection): Boolean = {
    map.get(row.compositeId) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.compositeId, row)
        true
      case None => false
    }
  }
  override def upsert(unsaved: PgDescriptionRow)(implicit c: Connection): PgDescriptionRow = {
    map.put(unsaved.compositeId, unsaved)
    unsaved
  }
}
