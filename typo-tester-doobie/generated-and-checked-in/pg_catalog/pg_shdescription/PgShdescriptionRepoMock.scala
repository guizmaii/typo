/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_shdescription

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgShdescriptionRepoMock(map: scala.collection.mutable.Map[PgShdescriptionId, PgShdescriptionRow] = scala.collection.mutable.Map.empty) extends PgShdescriptionRepo {
  override def delete(compositeId: PgShdescriptionId): ConnectionIO[Boolean] = {
    delay(map.remove(compositeId).isDefined)
  }
  override def insert(unsaved: PgShdescriptionRow): ConnectionIO[PgShdescriptionRow] = {
    delay {
      if (map.contains(unsaved.compositeId))
        sys.error(s"id ${unsaved.compositeId} already exists")
      else
        map.put(unsaved.compositeId, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgShdescriptionRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(compositeId: PgShdescriptionId): ConnectionIO[Option[PgShdescriptionRow]] = {
    delay(map.get(compositeId))
  }
  override def update(row: PgShdescriptionRow): ConnectionIO[Boolean] = {
    delay {
      map.get(row.compositeId) match {
        case Some(`row`) => false
        case Some(_) =>
          map.put(row.compositeId, row)
          true
        case None => false
      }
    }
  }
  override def upsert(unsaved: PgShdescriptionRow): ConnectionIO[PgShdescriptionRow] = {
    delay {
      map.put(unsaved.compositeId, unsaved)
      unsaved
    }
  }
}
