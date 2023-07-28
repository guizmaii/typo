/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_replication_origin

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgReplicationOriginRow(
  roident: PgReplicationOriginId,
  roname: String
)

object PgReplicationOriginRow {
  def rowParser(idx: Int): RowParser[PgReplicationOriginRow] =
    RowParser[PgReplicationOriginRow] { row =>
      Success(
        PgReplicationOriginRow(
          roident = row[PgReplicationOriginId](idx + 0),
          roname = row[String](idx + 1)
        )
      )
    }
  implicit val oFormat: OFormat[PgReplicationOriginRow] = new OFormat[PgReplicationOriginRow]{
    override def writes(o: PgReplicationOriginRow): JsObject =
      Json.obj(
        "roident" -> o.roident,
        "roname" -> o.roname
      )
  
    override def reads(json: JsValue): JsResult[PgReplicationOriginRow] = {
      JsResult.fromTry(
        Try(
          PgReplicationOriginRow(
            roident = json.\("roident").as[PgReplicationOriginId],
            roname = json.\("roname").as[String]
          )
        )
      )
    }
  }
}
