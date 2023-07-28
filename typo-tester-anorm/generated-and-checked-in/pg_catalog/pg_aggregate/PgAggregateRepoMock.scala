/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_aggregate

import java.sql.Connection

class PgAggregateRepoMock(map: scala.collection.mutable.Map[PgAggregateId, PgAggregateRow] = scala.collection.mutable.Map.empty) extends PgAggregateRepo {
  override def delete(aggfnoid: PgAggregateId)(implicit c: Connection): Boolean = {
    map.remove(aggfnoid).isDefined
  }
  override def insert(unsaved: PgAggregateRow)(implicit c: Connection): PgAggregateRow = {
    if (map.contains(unsaved.aggfnoid))
      sys.error(s"id ${unsaved.aggfnoid} already exists")
    else
      map.put(unsaved.aggfnoid, unsaved)
    unsaved
  }
  override def selectAll(implicit c: Connection): List[PgAggregateRow] = {
    map.values.toList
  }
  override def selectById(aggfnoid: PgAggregateId)(implicit c: Connection): Option[PgAggregateRow] = {
    map.get(aggfnoid)
  }
  override def selectByIds(aggfnoids: Array[PgAggregateId])(implicit c: Connection): List[PgAggregateRow] = {
    aggfnoids.flatMap(map.get).toList
  }
  override def update(row: PgAggregateRow)(implicit c: Connection): Boolean = {
    map.get(row.aggfnoid) match {
      case Some(`row`) => false
      case Some(_) =>
        map.put(row.aggfnoid, row)
        true
      case None => false
    }
  }
  override def upsert(unsaved: PgAggregateRow)(implicit c: Connection): PgAggregateRow = {
    map.put(unsaved.aggfnoid, unsaved)
    unsaved
  }
}
