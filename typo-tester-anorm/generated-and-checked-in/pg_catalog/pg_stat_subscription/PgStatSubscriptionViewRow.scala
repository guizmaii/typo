/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_subscription

import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class PgStatSubscriptionViewRow(
  subid: Option[/* oid */ Long],
  subname: Option[String],
  pid: Option[Int],
  relid: Option[/* oid */ Long],
  receivedLsn: Option[/* pg_lsn */ Long],
  lastMsgSendTime: Option[TypoOffsetDateTime],
  lastMsgReceiptTime: Option[TypoOffsetDateTime],
  latestEndLsn: Option[/* pg_lsn */ Long],
  latestEndTime: Option[TypoOffsetDateTime]
)

object PgStatSubscriptionViewRow {
  implicit lazy val reads: Reads[PgStatSubscriptionViewRow] = Reads[PgStatSubscriptionViewRow](json => JsResult.fromTry(
      Try(
        PgStatSubscriptionViewRow(
          subid = json.\("subid").toOption.map(_.as(Reads.LongReads)),
          subname = json.\("subname").toOption.map(_.as(Reads.StringReads)),
          pid = json.\("pid").toOption.map(_.as(Reads.IntReads)),
          relid = json.\("relid").toOption.map(_.as(Reads.LongReads)),
          receivedLsn = json.\("received_lsn").toOption.map(_.as(Reads.LongReads)),
          lastMsgSendTime = json.\("last_msg_send_time").toOption.map(_.as(TypoOffsetDateTime.reads)),
          lastMsgReceiptTime = json.\("last_msg_receipt_time").toOption.map(_.as(TypoOffsetDateTime.reads)),
          latestEndLsn = json.\("latest_end_lsn").toOption.map(_.as(Reads.LongReads)),
          latestEndTime = json.\("latest_end_time").toOption.map(_.as(TypoOffsetDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PgStatSubscriptionViewRow] = RowParser[PgStatSubscriptionViewRow] { row =>
    Success(
      PgStatSubscriptionViewRow(
        subid = row(idx + 0)(Column.columnToOption(Column.columnToLong)),
        subname = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        pid = row(idx + 2)(Column.columnToOption(Column.columnToInt)),
        relid = row(idx + 3)(Column.columnToOption(Column.columnToLong)),
        receivedLsn = row(idx + 4)(Column.columnToOption(Column.columnToLong)),
        lastMsgSendTime = row(idx + 5)(Column.columnToOption(TypoOffsetDateTime.column)),
        lastMsgReceiptTime = row(idx + 6)(Column.columnToOption(TypoOffsetDateTime.column)),
        latestEndLsn = row(idx + 7)(Column.columnToOption(Column.columnToLong)),
        latestEndTime = row(idx + 8)(Column.columnToOption(TypoOffsetDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[PgStatSubscriptionViewRow] = OWrites[PgStatSubscriptionViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "subid" -> Writes.OptionWrites(Writes.LongWrites).writes(o.subid),
      "subname" -> Writes.OptionWrites(Writes.StringWrites).writes(o.subname),
      "pid" -> Writes.OptionWrites(Writes.IntWrites).writes(o.pid),
      "relid" -> Writes.OptionWrites(Writes.LongWrites).writes(o.relid),
      "received_lsn" -> Writes.OptionWrites(Writes.LongWrites).writes(o.receivedLsn),
      "last_msg_send_time" -> Writes.OptionWrites(TypoOffsetDateTime.writes).writes(o.lastMsgSendTime),
      "last_msg_receipt_time" -> Writes.OptionWrites(TypoOffsetDateTime.writes).writes(o.lastMsgReceiptTime),
      "latest_end_lsn" -> Writes.OptionWrites(Writes.LongWrites).writes(o.latestEndLsn),
      "latest_end_time" -> Writes.OptionWrites(TypoOffsetDateTime.writes).writes(o.latestEndTime)
    ))
  )
}
