/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_all_indexes

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatioAllIndexesViewRow(
  relid: Option[/* oid */ Long],
  indexrelid: Option[/* oid */ Long],
  schemaname: Option[String],
  relname: Option[String],
  indexrelname: Option[String],
  idxBlksRead: Option[Long],
  idxBlksHit: Option[Long]
)

object PgStatioAllIndexesViewRow {
  def rowParser(idx: Int): RowParser[PgStatioAllIndexesViewRow] =
    RowParser[PgStatioAllIndexesViewRow] { row =>
      Success(
        PgStatioAllIndexesViewRow(
          relid = row[Option[/* oid */ Long]](idx + 0),
          indexrelid = row[Option[/* oid */ Long]](idx + 1),
          schemaname = row[Option[String]](idx + 2),
          relname = row[Option[String]](idx + 3),
          indexrelname = row[Option[String]](idx + 4),
          idxBlksRead = row[Option[Long]](idx + 5),
          idxBlksHit = row[Option[Long]](idx + 6)
        )
      )
    }
  implicit val oFormat: OFormat[PgStatioAllIndexesViewRow] = new OFormat[PgStatioAllIndexesViewRow]{
    override def writes(o: PgStatioAllIndexesViewRow): JsObject =
      Json.obj(
        "relid" -> o.relid,
        "indexrelid" -> o.indexrelid,
        "schemaname" -> o.schemaname,
        "relname" -> o.relname,
        "indexrelname" -> o.indexrelname,
        "idx_blks_read" -> o.idxBlksRead,
        "idx_blks_hit" -> o.idxBlksHit
      )
  
    override def reads(json: JsValue): JsResult[PgStatioAllIndexesViewRow] = {
      JsResult.fromTry(
        Try(
          PgStatioAllIndexesViewRow(
            relid = json.\("relid").toOption.map(_.as[/* oid */ Long]),
            indexrelid = json.\("indexrelid").toOption.map(_.as[/* oid */ Long]),
            schemaname = json.\("schemaname").toOption.map(_.as[String]),
            relname = json.\("relname").toOption.map(_.as[String]),
            indexrelname = json.\("indexrelname").toOption.map(_.as[String]),
            idxBlksRead = json.\("idx_blks_read").toOption.map(_.as[Long]),
            idxBlksHit = json.\("idx_blks_hit").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
