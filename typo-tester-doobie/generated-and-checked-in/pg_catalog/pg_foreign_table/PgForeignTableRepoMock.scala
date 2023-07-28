/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_table

import doobie.free.connection.ConnectionIO
import doobie.free.connection.delay
import fs2.Stream

class PgForeignTableRepoMock(map: scala.collection.mutable.Map[PgForeignTableId, PgForeignTableRow] = scala.collection.mutable.Map.empty) extends PgForeignTableRepo {
  override def delete(ftrelid: PgForeignTableId): ConnectionIO[Boolean] = {
    delay(map.remove(ftrelid).isDefined)
  }
  override def insert(unsaved: PgForeignTableRow): ConnectionIO[PgForeignTableRow] = {
    delay {
      if (map.contains(unsaved.ftrelid))
        sys.error(s"id ${unsaved.ftrelid} already exists")
      else
        map.put(unsaved.ftrelid, unsaved)
      unsaved
    }
  }
  override def selectAll: Stream[ConnectionIO, PgForeignTableRow] = {
    Stream.emits(map.values.toList)
  }
  override def selectById(ftrelid: PgForeignTableId): ConnectionIO[Option[PgForeignTableRow]] = {
    delay(map.get(ftrelid))
  }
  override def selectByIds(ftrelids: Array[PgForeignTableId]): Stream[ConnectionIO, PgForeignTableRow] = {
    Stream.emits(ftrelids.flatMap(map.get).toList)
  }
  override def update(row: PgForeignTableRow): ConnectionIO[Boolean] = {
    delay {
      map.get(row.ftrelid) match {
        case Some(`row`) => false
        case Some(_) =>
          map.put(row.ftrelid, row)
          true
        case None => false
      }
    }
  }
  override def upsert(unsaved: PgForeignTableRow): ConnectionIO[PgForeignTableRow] = {
    delay {
      map.put(unsaved.ftrelid, unsaved)
      unsaved
    }
  }
}
