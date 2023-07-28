/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_trigger

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgTriggerRepoMock(map: scala.collection.mutable.Map[PgTriggerId, PgTriggerRow] = scala.collection.mutable.Map.empty) extends PgTriggerRepo {
  override def delete(oid: PgTriggerId): ConnectionIO[Boolean] = {
    delay(map.remove(oid).isDefined)
  }
  override def insert(unsaved: PgTriggerRow): ConnectionIO[PgTriggerRow] = {
    delay {
      if (map.contains(unsaved.oid))
        sys.error(s"id ${unsaved.oid} already exists")
      else
        map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgTriggerRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(oid: PgTriggerId): ConnectionIO[Option[PgTriggerRow]] = {
    delay(map.get(oid))
  }
  override def selectByIds(oids: Array[PgTriggerId]): Stream[ConnectionIO, PgTriggerRow] = {
    Stream.emits(oids.flatMap(map.get).toList)
  }
  override def update(row: PgTriggerRow): ConnectionIO[Boolean] = {
    delay {
      map.get(row.oid) match {
        case Some(`row`) => false
        case Some(_) =>
          map.put(row.oid, row)
          true
        case None => false
      }
    }
  }
  override def upsert(unsaved: PgTriggerRow): ConnectionIO[PgTriggerRow] = {
    delay {
      map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
}
