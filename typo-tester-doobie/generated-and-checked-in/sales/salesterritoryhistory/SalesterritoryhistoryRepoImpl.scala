/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritoryhistory

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.fragment.Fragment
import fs2.Stream
import java.util.UUID
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object SalesterritoryhistoryRepoImpl extends SalesterritoryhistoryRepo {
  override def delete(compositeId: SalesterritoryhistoryId): ConnectionIO[Boolean] = {
    sql"delete from sales.salesterritoryhistory where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND startdate = ${fromWrite(compositeId.startdate)(Write.fromPut(TypoLocalDateTime.put))} AND territoryid = ${fromWrite(compositeId.territoryid)(Write.fromPut(SalesterritoryId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[SalesterritoryhistoryFields, SalesterritoryhistoryRow] = {
    DeleteBuilder("sales.salesterritoryhistory", SalesterritoryhistoryFields)
  }
  override def insert(unsaved: SalesterritoryhistoryRow): ConnectionIO[SalesterritoryhistoryRow] = {
    sql"""insert into sales.salesterritoryhistory(businessentityid, territoryid, startdate, enddate, rowguid, modifieddate)
          values (${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4, ${fromWrite(unsaved.territoryid)(Write.fromPut(SalesterritoryId.put))}::int4, ${fromWrite(unsaved.startdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp, ${fromWrite(unsaved.enddate)(Write.fromPutOption(TypoLocalDateTime.put))}::timestamp, ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid, ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text
       """.query(SalesterritoryhistoryRow.read).unique
  }
  override def insert(unsaved: SalesterritoryhistoryRowUnsaved): ConnectionIO[SalesterritoryhistoryRow] = {
    val fs = List(
      Some((Fragment.const(s"businessentityid"), fr"${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4")),
      Some((Fragment.const(s"territoryid"), fr"${fromWrite(unsaved.territoryid)(Write.fromPut(SalesterritoryId.put))}::int4")),
      Some((Fragment.const(s"startdate"), fr"${fromWrite(unsaved.startdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp")),
      Some((Fragment.const(s"enddate"), fr"${fromWrite(unsaved.enddate)(Write.fromPutOption(TypoLocalDateTime.put))}::timestamp")),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"rowguid"), fr"${fromWrite(value: UUID)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into sales.salesterritoryhistory default values
            returning businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into sales.salesterritoryhistory(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text
         """
    }
    q.query(SalesterritoryhistoryRow.read).unique
    
  }
  override def select: SelectBuilder[SalesterritoryhistoryFields, SalesterritoryhistoryRow] = {
    SelectBuilderSql("sales.salesterritoryhistory", SalesterritoryhistoryFields, SalesterritoryhistoryRow.read)
  }
  override def selectAll: Stream[ConnectionIO, SalesterritoryhistoryRow] = {
    sql"select businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text from sales.salesterritoryhistory".query(SalesterritoryhistoryRow.read).stream
  }
  override def selectById(compositeId: SalesterritoryhistoryId): ConnectionIO[Option[SalesterritoryhistoryRow]] = {
    sql"select businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text from sales.salesterritoryhistory where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND startdate = ${fromWrite(compositeId.startdate)(Write.fromPut(TypoLocalDateTime.put))} AND territoryid = ${fromWrite(compositeId.territoryid)(Write.fromPut(SalesterritoryId.put))}".query(SalesterritoryhistoryRow.read).option
  }
  override def update(row: SalesterritoryhistoryRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update sales.salesterritoryhistory
          set enddate = ${fromWrite(row.enddate)(Write.fromPutOption(TypoLocalDateTime.put))}::timestamp,
              rowguid = ${fromWrite(row.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND startdate = ${fromWrite(compositeId.startdate)(Write.fromPut(TypoLocalDateTime.put))} AND territoryid = ${fromWrite(compositeId.territoryid)(Write.fromPut(SalesterritoryId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[SalesterritoryhistoryFields, SalesterritoryhistoryRow] = {
    UpdateBuilder("sales.salesterritoryhistory", SalesterritoryhistoryFields, SalesterritoryhistoryRow.read)
  }
  override def upsert(unsaved: SalesterritoryhistoryRow): ConnectionIO[SalesterritoryhistoryRow] = {
    sql"""insert into sales.salesterritoryhistory(businessentityid, territoryid, startdate, enddate, rowguid, modifieddate)
          values (
            ${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4,
            ${fromWrite(unsaved.territoryid)(Write.fromPut(SalesterritoryId.put))}::int4,
            ${fromWrite(unsaved.startdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp,
            ${fromWrite(unsaved.enddate)(Write.fromPutOption(TypoLocalDateTime.put))}::timestamp,
            ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (businessentityid, startdate, territoryid)
          do update set
            enddate = EXCLUDED.enddate,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, territoryid, startdate::text, enddate::text, rowguid, modifieddate::text
       """.query(SalesterritoryhistoryRow.read).unique
  }
}
