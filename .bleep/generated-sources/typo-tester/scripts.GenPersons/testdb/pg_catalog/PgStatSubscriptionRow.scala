package testdb.pg_catalog

import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatSubscriptionRow(
  /** Points to [[testdb.pg_catalog.PgSubscriptionRow.oid]] */
  subid: Long,
  /** Points to [[testdb.pg_catalog.PgSubscriptionRow.subname]] */
  subname: String,
  pid: /* unknown nullability */ Option[Int],
  relid: /* unknown nullability */ Option[Long],
  receivedLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  lastMsgSendTime: /* unknown nullability */ Option[LocalDateTime],
  lastMsgReceiptTime: /* unknown nullability */ Option[LocalDateTime],
  latestEndLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  latestEndTime: /* unknown nullability */ Option[LocalDateTime]
)

object PgStatSubscriptionRow {
  implicit val rowParser: RowParser[PgStatSubscriptionRow] = { row =>
    Success(
      PgStatSubscriptionRow(
        subid = row[Long]("subid"),
        subname = row[String]("subname"),
        pid = row[/* unknown nullability */ Option[Int]]("pid"),
        relid = row[/* unknown nullability */ Option[Long]]("relid"),
        receivedLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("received_lsn"),
        lastMsgSendTime = row[/* unknown nullability */ Option[LocalDateTime]]("last_msg_send_time"),
        lastMsgReceiptTime = row[/* unknown nullability */ Option[LocalDateTime]]("last_msg_receipt_time"),
        latestEndLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("latest_end_lsn"),
        latestEndTime = row[/* unknown nullability */ Option[LocalDateTime]]("latest_end_time")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatSubscriptionRow] = new OFormat[PgStatSubscriptionRow]{
    override def writes(o: PgStatSubscriptionRow): JsObject =
      Json.obj(
        "subid" -> o.subid,
      "subname" -> o.subname,
      "pid" -> o.pid,
      "relid" -> o.relid,
      "received_lsn" -> o.receivedLsn,
      "last_msg_send_time" -> o.lastMsgSendTime,
      "last_msg_receipt_time" -> o.lastMsgReceiptTime,
      "latest_end_lsn" -> o.latestEndLsn,
      "latest_end_time" -> o.latestEndTime
      )

    override def reads(json: JsValue): JsResult[PgStatSubscriptionRow] = {
      JsResult.fromTry(
        Try(
          PgStatSubscriptionRow(
            subid = json.\("subid").as[Long],
            subname = json.\("subname").as[String],
            pid = json.\("pid").toOption.map(_.as[Int]),
            relid = json.\("relid").toOption.map(_.as[Long]),
            receivedLsn = json.\("received_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            lastMsgSendTime = json.\("last_msg_send_time").toOption.map(_.as[LocalDateTime]),
            lastMsgReceiptTime = json.\("last_msg_receipt_time").toOption.map(_.as[LocalDateTime]),
            latestEndLsn = json.\("latest_end_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            latestEndTime = json.\("latest_end_time").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
