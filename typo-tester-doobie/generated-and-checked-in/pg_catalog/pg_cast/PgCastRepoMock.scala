/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_cast

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgCastRepoMock(map: scala.collection.mutable.Map[PgCastId, PgCastRow] = scala.collection.mutable.Map.empty) extends PgCastRepo {
  override def delete(oid: PgCastId): ConnectionIO[Boolean] = {
    delay(map.remove(oid).isDefined)
  }
  override def insert(unsaved: PgCastRow): ConnectionIO[PgCastRow] = {
    delay {
      if (map.contains(unsaved.oid))
        sys.error(s"id ${unsaved.oid} already exists")
      else
        map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgCastRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(oid: PgCastId): ConnectionIO[Option[PgCastRow]] = {
    delay(map.get(oid))
  }
  override def selectByIds(oids: Array[PgCastId]): Stream[ConnectionIO, PgCastRow] = {
    Stream.emits(oids.flatMap(map.get).toList)
  }
  override def update(row: PgCastRow): ConnectionIO[Boolean] = {
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
  override def upsert(unsaved: PgCastRow): ConnectionIO[PgCastRow] = {
    delay {
      map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
}
