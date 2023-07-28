/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_all_sequences

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatioAllSequencesViewRow(
  relid: Option[/* oid */ Long],
  schemaname: Option[String],
  relname: Option[String],
  blksRead: Option[Long],
  blksHit: Option[Long]
)

object PgStatioAllSequencesViewRow {
  def rowParser(idx: Int): RowParser[PgStatioAllSequencesViewRow] =
    RowParser[PgStatioAllSequencesViewRow] { row =>
      Success(
        PgStatioAllSequencesViewRow(
          relid = row[Option[/* oid */ Long]](idx + 0),
          schemaname = row[Option[String]](idx + 1),
          relname = row[Option[String]](idx + 2),
          blksRead = row[Option[Long]](idx + 3),
          blksHit = row[Option[Long]](idx + 4)
        )
      )
    }
  implicit val oFormat: OFormat[PgStatioAllSequencesViewRow] = new OFormat[PgStatioAllSequencesViewRow]{
    override def writes(o: PgStatioAllSequencesViewRow): JsObject =
      Json.obj(
        "relid" -> o.relid,
        "schemaname" -> o.schemaname,
        "relname" -> o.relname,
        "blks_read" -> o.blksRead,
        "blks_hit" -> o.blksHit
      )
  
    override def reads(json: JsValue): JsResult[PgStatioAllSequencesViewRow] = {
      JsResult.fromTry(
        Try(
          PgStatioAllSequencesViewRow(
            relid = json.\("relid").toOption.map(_.as[/* oid */ Long]),
            schemaname = json.\("schemaname").toOption.map(_.as[String]),
            relname = json.\("relname").toOption.map(_.as[String]),
            blksRead = json.\("blks_read").toOption.map(_.as[Long]),
            blksHit = json.\("blks_hit").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
