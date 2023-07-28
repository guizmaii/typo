/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_publication_rel

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgPublicationRelRepoMock(map: scala.collection.mutable.Map[PgPublicationRelId, PgPublicationRelRow] = scala.collection.mutable.Map.empty) extends PgPublicationRelRepo {
  override def delete(oid: PgPublicationRelId): ConnectionIO[Boolean] = {
    delay(map.remove(oid).isDefined)
  }
  override def insert(unsaved: PgPublicationRelRow): ConnectionIO[PgPublicationRelRow] = {
    delay {
      if (map.contains(unsaved.oid))
        sys.error(s"id ${unsaved.oid} already exists")
      else
        map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgPublicationRelRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(oid: PgPublicationRelId): ConnectionIO[Option[PgPublicationRelRow]] = {
    delay(map.get(oid))
  }
  override def selectByIds(oids: Array[PgPublicationRelId]): Stream[ConnectionIO, PgPublicationRelRow] = {
    Stream.emits(oids.flatMap(map.get).toList)
  }
  override def update(row: PgPublicationRelRow): ConnectionIO[Boolean] = {
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
  override def upsert(unsaved: PgPublicationRelRow): ConnectionIO[PgPublicationRelRow] = {
    delay {
      map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
}
