/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_subscription_rel

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgSubscriptionRelRow(
  srsubid: /* oid */ Long,
  srrelid: /* oid */ Long,
  srsubstate: String,
  srsublsn: Option[/* pg_lsn */ Long]
){
   val compositeId: PgSubscriptionRelId = PgSubscriptionRelId(srrelid, srsubid)
 }

object PgSubscriptionRelRow {
  def rowParser(idx: Int): RowParser[PgSubscriptionRelRow] =
    RowParser[PgSubscriptionRelRow] { row =>
      Success(
        PgSubscriptionRelRow(
          srsubid = row[/* oid */ Long](idx + 0),
          srrelid = row[/* oid */ Long](idx + 1),
          srsubstate = row[String](idx + 2),
          srsublsn = row[Option[/* pg_lsn */ Long]](idx + 3)
        )
      )
    }
  implicit val oFormat: OFormat[PgSubscriptionRelRow] = new OFormat[PgSubscriptionRelRow]{
    override def writes(o: PgSubscriptionRelRow): JsObject =
      Json.obj(
        "srsubid" -> o.srsubid,
        "srrelid" -> o.srrelid,
        "srsubstate" -> o.srsubstate,
        "srsublsn" -> o.srsublsn
      )
  
    override def reads(json: JsValue): JsResult[PgSubscriptionRelRow] = {
      JsResult.fromTry(
        Try(
          PgSubscriptionRelRow(
            srsubid = json.\("srsubid").as[/* oid */ Long],
            srrelid = json.\("srrelid").as[/* oid */ Long],
            srsubstate = json.\("srsubstate").as[String],
            srsublsn = json.\("srsublsn").toOption.map(_.as[/* pg_lsn */ Long])
          )
        )
      )
    }
  }
}
