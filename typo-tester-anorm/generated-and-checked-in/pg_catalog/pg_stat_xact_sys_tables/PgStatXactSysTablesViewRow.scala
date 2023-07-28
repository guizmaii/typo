/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_xact_sys_tables

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatXactSysTablesViewRow(
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.relid]] */
  relid: Option[/* oid */ Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.schemaname]] */
  schemaname: Option[String],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.relname]] */
  relname: Option[String],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.seqScan]] */
  seqScan: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.seqTupRead]] */
  seqTupRead: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.idxScan]] */
  idxScan: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.idxTupFetch]] */
  idxTupFetch: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.nTupIns]] */
  nTupIns: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.nTupUpd]] */
  nTupUpd: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.nTupDel]] */
  nTupDel: Option[Long],
  /** Points to [[pg_stat_xact_all_tables.PgStatXactAllTablesViewRow.nTupHotUpd]] */
  nTupHotUpd: Option[Long]
)

object PgStatXactSysTablesViewRow {
  def rowParser(idx: Int): RowParser[PgStatXactSysTablesViewRow] =
    RowParser[PgStatXactSysTablesViewRow] { row =>
      Success(
        PgStatXactSysTablesViewRow(
          relid = row[Option[/* oid */ Long]](idx + 0),
          schemaname = row[Option[String]](idx + 1),
          relname = row[Option[String]](idx + 2),
          seqScan = row[Option[Long]](idx + 3),
          seqTupRead = row[Option[Long]](idx + 4),
          idxScan = row[Option[Long]](idx + 5),
          idxTupFetch = row[Option[Long]](idx + 6),
          nTupIns = row[Option[Long]](idx + 7),
          nTupUpd = row[Option[Long]](idx + 8),
          nTupDel = row[Option[Long]](idx + 9),
          nTupHotUpd = row[Option[Long]](idx + 10)
        )
      )
    }
  implicit val oFormat: OFormat[PgStatXactSysTablesViewRow] = new OFormat[PgStatXactSysTablesViewRow]{
    override def writes(o: PgStatXactSysTablesViewRow): JsObject =
      Json.obj(
        "relid" -> o.relid,
        "schemaname" -> o.schemaname,
        "relname" -> o.relname,
        "seq_scan" -> o.seqScan,
        "seq_tup_read" -> o.seqTupRead,
        "idx_scan" -> o.idxScan,
        "idx_tup_fetch" -> o.idxTupFetch,
        "n_tup_ins" -> o.nTupIns,
        "n_tup_upd" -> o.nTupUpd,
        "n_tup_del" -> o.nTupDel,
        "n_tup_hot_upd" -> o.nTupHotUpd
      )
  
    override def reads(json: JsValue): JsResult[PgStatXactSysTablesViewRow] = {
      JsResult.fromTry(
        Try(
          PgStatXactSysTablesViewRow(
            relid = json.\("relid").toOption.map(_.as[/* oid */ Long]),
            schemaname = json.\("schemaname").toOption.map(_.as[String]),
            relname = json.\("relname").toOption.map(_.as[String]),
            seqScan = json.\("seq_scan").toOption.map(_.as[Long]),
            seqTupRead = json.\("seq_tup_read").toOption.map(_.as[Long]),
            idxScan = json.\("idx_scan").toOption.map(_.as[Long]),
            idxTupFetch = json.\("idx_tup_fetch").toOption.map(_.as[Long]),
            nTupIns = json.\("n_tup_ins").toOption.map(_.as[Long]),
            nTupUpd = json.\("n_tup_upd").toOption.map(_.as[Long]),
            nTupDel = json.\("n_tup_del").toOption.map(_.as[Long]),
            nTupHotUpd = json.\("n_tup_hot_upd").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
