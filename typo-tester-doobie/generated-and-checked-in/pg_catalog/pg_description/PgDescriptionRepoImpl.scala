/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_description

import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import fs2.Stream

object PgDescriptionRepoImpl extends PgDescriptionRepo {
  override def delete(compositeId: PgDescriptionId): ConnectionIO[Boolean] = {
    sql"delete from pg_catalog.pg_description where objoid = ${compositeId.objoid} AND classoid = ${compositeId.classoid} AND objsubid = ${compositeId.objsubid}".update.run.map(_ > 0)
  }
  override def insert(unsaved: PgDescriptionRow): ConnectionIO[PgDescriptionRow] = {
    sql"""insert into pg_catalog.pg_description(objoid, classoid, objsubid, description)
          values (${unsaved.objoid}::oid, ${unsaved.classoid}::oid, ${unsaved.objsubid}::int4, ${unsaved.description})
          returning objoid, classoid, objsubid, description
       """.query[PgDescriptionRow].unique
  }
  override def selectAll: Stream[ConnectionIO, PgDescriptionRow] = {
    sql"select objoid, classoid, objsubid, description from pg_catalog.pg_description".query[PgDescriptionRow].stream
  }
  override def selectById(compositeId: PgDescriptionId): ConnectionIO[Option[PgDescriptionRow]] = {
    sql"select objoid, classoid, objsubid, description from pg_catalog.pg_description where objoid = ${compositeId.objoid} AND classoid = ${compositeId.classoid} AND objsubid = ${compositeId.objsubid}".query[PgDescriptionRow].option
  }
  override def update(row: PgDescriptionRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update pg_catalog.pg_description
          set description = ${row.description}
          where objoid = ${compositeId.objoid} AND classoid = ${compositeId.classoid} AND objsubid = ${compositeId.objsubid}
       """
      .update
      .run
      .map(_ > 0)
  }
  override def upsert(unsaved: PgDescriptionRow): ConnectionIO[PgDescriptionRow] = {
    sql"""insert into pg_catalog.pg_description(objoid, classoid, objsubid, description)
          values (
            ${unsaved.objoid}::oid,
            ${unsaved.classoid}::oid,
            ${unsaved.objsubid}::int4,
            ${unsaved.description}
          )
          on conflict (objoid, classoid, objsubid)
          do update set
            description = EXCLUDED.description
          returning objoid, classoid, objsubid, description
       """.query[PgDescriptionRow].unique
  }
}
