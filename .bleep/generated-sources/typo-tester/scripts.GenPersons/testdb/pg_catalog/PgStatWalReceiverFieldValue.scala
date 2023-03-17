package testdb
package pg_catalog

import java.time.LocalDateTime

sealed abstract class PgStatWalReceiverFieldValue[T](val name: String, val value: T)

object PgStatWalReceiverFieldValue {
  case class pid(override val value: /* unknown nullability */ Option[Int]) extends PgStatWalReceiverFieldValue("pid", value)
  case class status(override val value: /* unknown nullability */ Option[String]) extends PgStatWalReceiverFieldValue("status", value)
  case class receiveStartLsn(override val value: /* unknown nullability */ Option[/* pg_lsn */ String]) extends PgStatWalReceiverFieldValue("receive_start_lsn", value)
  case class receiveStartTli(override val value: /* unknown nullability */ Option[Int]) extends PgStatWalReceiverFieldValue("receive_start_tli", value)
  case class writtenLsn(override val value: /* unknown nullability */ Option[/* pg_lsn */ String]) extends PgStatWalReceiverFieldValue("written_lsn", value)
  case class flushedLsn(override val value: /* unknown nullability */ Option[/* pg_lsn */ String]) extends PgStatWalReceiverFieldValue("flushed_lsn", value)
  case class receivedTli(override val value: /* unknown nullability */ Option[Int]) extends PgStatWalReceiverFieldValue("received_tli", value)
  case class lastMsgSendTime(override val value: /* unknown nullability */ Option[LocalDateTime]) extends PgStatWalReceiverFieldValue("last_msg_send_time", value)
  case class lastMsgReceiptTime(override val value: /* unknown nullability */ Option[LocalDateTime]) extends PgStatWalReceiverFieldValue("last_msg_receipt_time", value)
  case class latestEndLsn(override val value: /* unknown nullability */ Option[/* pg_lsn */ String]) extends PgStatWalReceiverFieldValue("latest_end_lsn", value)
  case class latestEndTime(override val value: /* unknown nullability */ Option[LocalDateTime]) extends PgStatWalReceiverFieldValue("latest_end_time", value)
  case class slotName(override val value: /* unknown nullability */ Option[String]) extends PgStatWalReceiverFieldValue("slot_name", value)
  case class senderHost(override val value: /* unknown nullability */ Option[String]) extends PgStatWalReceiverFieldValue("sender_host", value)
  case class senderPort(override val value: /* unknown nullability */ Option[Int]) extends PgStatWalReceiverFieldValue("sender_port", value)
  case class conninfo(override val value: /* unknown nullability */ Option[String]) extends PgStatWalReceiverFieldValue("conninfo", value)
}
