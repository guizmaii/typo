/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_subscription

import anorm.SqlStringInterpolation
import java.sql.Connection

object PgSubscriptionRepoImpl extends PgSubscriptionRepo {
  override def delete(oid: PgSubscriptionId)(implicit c: Connection): Boolean = {
    SQL"delete from pg_catalog.pg_subscription where oid = $oid".executeUpdate() > 0
  }
  override def insert(unsaved: PgSubscriptionRow)(implicit c: Connection): PgSubscriptionRow = {
    SQL"""insert into pg_catalog.pg_subscription(oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications)
          values (${unsaved.oid}::oid, ${unsaved.subdbid}::oid, ${unsaved.subname}::name, ${unsaved.subowner}::oid, ${unsaved.subenabled}, ${unsaved.subbinary}, ${unsaved.substream}, ${unsaved.subconninfo}, ${unsaved.subslotname}::name, ${unsaved.subsynccommit}, ${unsaved.subpublications}::_text)
          returning oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications
       """
      .executeInsert(PgSubscriptionRow.rowParser(1).single)
  
  }
  override def selectAll(implicit c: Connection): List[PgSubscriptionRow] = {
    SQL"""select oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications
          from pg_catalog.pg_subscription
       """.as(PgSubscriptionRow.rowParser(1).*)
  }
  override def selectById(oid: PgSubscriptionId)(implicit c: Connection): Option[PgSubscriptionRow] = {
    SQL"""select oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications
          from pg_catalog.pg_subscription
          where oid = $oid
       """.as(PgSubscriptionRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgSubscriptionId])(implicit c: Connection): List[PgSubscriptionRow] = {
    SQL"""select oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications
          from pg_catalog.pg_subscription
          where oid = ANY($oids)
       """.as(PgSubscriptionRow.rowParser(1).*)
  
  }
  override def update(row: PgSubscriptionRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_subscription
          set subdbid = ${row.subdbid}::oid,
              subname = ${row.subname}::name,
              subowner = ${row.subowner}::oid,
              subenabled = ${row.subenabled},
              subbinary = ${row.subbinary},
              substream = ${row.substream},
              subconninfo = ${row.subconninfo},
              subslotname = ${row.subslotname}::name,
              subsynccommit = ${row.subsynccommit},
              subpublications = ${row.subpublications}::_text
          where oid = $oid
       """.executeUpdate() > 0
  }
  override def upsert(unsaved: PgSubscriptionRow)(implicit c: Connection): PgSubscriptionRow = {
    SQL"""insert into pg_catalog.pg_subscription(oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications)
          values (
            ${unsaved.oid}::oid,
            ${unsaved.subdbid}::oid,
            ${unsaved.subname}::name,
            ${unsaved.subowner}::oid,
            ${unsaved.subenabled},
            ${unsaved.subbinary},
            ${unsaved.substream},
            ${unsaved.subconninfo},
            ${unsaved.subslotname}::name,
            ${unsaved.subsynccommit},
            ${unsaved.subpublications}::_text
          )
          on conflict (oid)
          do update set
            subdbid = EXCLUDED.subdbid,
            subname = EXCLUDED.subname,
            subowner = EXCLUDED.subowner,
            subenabled = EXCLUDED.subenabled,
            subbinary = EXCLUDED.subbinary,
            substream = EXCLUDED.substream,
            subconninfo = EXCLUDED.subconninfo,
            subslotname = EXCLUDED.subslotname,
            subsynccommit = EXCLUDED.subsynccommit,
            subpublications = EXCLUDED.subpublications
          returning oid, subdbid, subname, subowner, subenabled, subbinary, substream, subconninfo, subslotname, subsynccommit, subpublications
       """
      .executeInsert(PgSubscriptionRow.rowParser(1).single)
  
  }
}
