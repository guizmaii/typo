/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_wal_receiver

import adventureworks.customtypes.TypoOffsetDateTime
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgStatWalReceiverViewRow(
  pid: Option[Int],
  status: Option[String],
  receiveStartLsn: Option[/* pg_lsn */ Long],
  receiveStartTli: Option[Int],
  writtenLsn: Option[/* pg_lsn */ Long],
  flushedLsn: Option[/* pg_lsn */ Long],
  receivedTli: Option[Int],
  lastMsgSendTime: Option[TypoOffsetDateTime],
  lastMsgReceiptTime: Option[TypoOffsetDateTime],
  latestEndLsn: Option[/* pg_lsn */ Long],
  latestEndTime: Option[TypoOffsetDateTime],
  slotName: Option[String],
  senderHost: Option[String],
  senderPort: Option[Int],
  conninfo: Option[String]
)

object PgStatWalReceiverViewRow {
  implicit lazy val decoder: Decoder[PgStatWalReceiverViewRow] = Decoder.forProduct15[PgStatWalReceiverViewRow, Option[Int], Option[String], Option[/* pg_lsn */ Long], Option[Int], Option[/* pg_lsn */ Long], Option[/* pg_lsn */ Long], Option[Int], Option[TypoOffsetDateTime], Option[TypoOffsetDateTime], Option[/* pg_lsn */ Long], Option[TypoOffsetDateTime], Option[String], Option[String], Option[Int], Option[String]]("pid", "status", "receive_start_lsn", "receive_start_tli", "written_lsn", "flushed_lsn", "received_tli", "last_msg_send_time", "last_msg_receipt_time", "latest_end_lsn", "latest_end_time", "slot_name", "sender_host", "sender_port", "conninfo")(PgStatWalReceiverViewRow.apply)(Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(TypoOffsetDateTime.decoder), Decoder.decodeOption(TypoOffsetDateTime.decoder), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(TypoOffsetDateTime.decoder), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeInt), Decoder.decodeOption(Decoder.decodeString))
  implicit lazy val encoder: Encoder[PgStatWalReceiverViewRow] = Encoder.forProduct15[PgStatWalReceiverViewRow, Option[Int], Option[String], Option[/* pg_lsn */ Long], Option[Int], Option[/* pg_lsn */ Long], Option[/* pg_lsn */ Long], Option[Int], Option[TypoOffsetDateTime], Option[TypoOffsetDateTime], Option[/* pg_lsn */ Long], Option[TypoOffsetDateTime], Option[String], Option[String], Option[Int], Option[String]]("pid", "status", "receive_start_lsn", "receive_start_tli", "written_lsn", "flushed_lsn", "received_tli", "last_msg_send_time", "last_msg_receipt_time", "latest_end_lsn", "latest_end_time", "slot_name", "sender_host", "sender_port", "conninfo")(x => (x.pid, x.status, x.receiveStartLsn, x.receiveStartTli, x.writtenLsn, x.flushedLsn, x.receivedTli, x.lastMsgSendTime, x.lastMsgReceiptTime, x.latestEndLsn, x.latestEndTime, x.slotName, x.senderHost, x.senderPort, x.conninfo))(Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(TypoOffsetDateTime.encoder), Encoder.encodeOption(TypoOffsetDateTime.encoder), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(TypoOffsetDateTime.encoder), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeInt), Encoder.encodeOption(Encoder.encodeString))
  implicit lazy val read: Read[PgStatWalReceiverViewRow] = new Read[PgStatWalReceiverViewRow](
    gets = List(
      (Meta.IntMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (TypoOffsetDateTime.get, Nullability.Nullable),
      (TypoOffsetDateTime.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (TypoOffsetDateTime.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.IntMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgStatWalReceiverViewRow(
      pid = Meta.IntMeta.get.unsafeGetNullable(rs, i + 0),
      status = Meta.StringMeta.get.unsafeGetNullable(rs, i + 1),
      receiveStartLsn = Meta.LongMeta.get.unsafeGetNullable(rs, i + 2),
      receiveStartTli = Meta.IntMeta.get.unsafeGetNullable(rs, i + 3),
      writtenLsn = Meta.LongMeta.get.unsafeGetNullable(rs, i + 4),
      flushedLsn = Meta.LongMeta.get.unsafeGetNullable(rs, i + 5),
      receivedTli = Meta.IntMeta.get.unsafeGetNullable(rs, i + 6),
      lastMsgSendTime = TypoOffsetDateTime.get.unsafeGetNullable(rs, i + 7),
      lastMsgReceiptTime = TypoOffsetDateTime.get.unsafeGetNullable(rs, i + 8),
      latestEndLsn = Meta.LongMeta.get.unsafeGetNullable(rs, i + 9),
      latestEndTime = TypoOffsetDateTime.get.unsafeGetNullable(rs, i + 10),
      slotName = Meta.StringMeta.get.unsafeGetNullable(rs, i + 11),
      senderHost = Meta.StringMeta.get.unsafeGetNullable(rs, i + 12),
      senderPort = Meta.IntMeta.get.unsafeGetNullable(rs, i + 13),
      conninfo = Meta.StringMeta.get.unsafeGetNullable(rs, i + 14)
    )
  )
}
