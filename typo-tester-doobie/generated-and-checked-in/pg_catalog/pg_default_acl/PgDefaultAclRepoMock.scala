/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_default_acl

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgDefaultAclRepoMock(map: scala.collection.mutable.Map[PgDefaultAclId, PgDefaultAclRow] = scala.collection.mutable.Map.empty) extends PgDefaultAclRepo {
  override def delete(oid: PgDefaultAclId): ConnectionIO[Boolean] = {
    delay(map.remove(oid).isDefined)
  }
  override def insert(unsaved: PgDefaultAclRow): ConnectionIO[PgDefaultAclRow] = {
    delay {
      if (map.contains(unsaved.oid))
        sys.error(s"id ${unsaved.oid} already exists")
      else
        map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgDefaultAclRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(oid: PgDefaultAclId): ConnectionIO[Option[PgDefaultAclRow]] = {
    delay(map.get(oid))
  }
  override def selectByIds(oids: Array[PgDefaultAclId]): Stream[ConnectionIO, PgDefaultAclRow] = {
    Stream.emits(oids.flatMap(map.get).toList)
  }
  override def update(row: PgDefaultAclRow): ConnectionIO[Boolean] = {
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
  override def upsert(unsaved: PgDefaultAclRow): ConnectionIO[PgDefaultAclRow] = {
    delay {
      map.put(unsaved.oid, unsaved)
      unsaved
    }
  }
}
