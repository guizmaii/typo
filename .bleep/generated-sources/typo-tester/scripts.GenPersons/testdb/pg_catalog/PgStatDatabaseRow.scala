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

case class PgStatDatabaseRow(
  datid: /* unknown nullability */ Option[Long],
  datname: /* unknown nullability */ Option[String],
  numbackends: /* unknown nullability */ Option[Int],
  xactCommit: /* unknown nullability */ Option[Long],
  xactRollback: /* unknown nullability */ Option[Long],
  blksRead: /* unknown nullability */ Option[Long],
  blksHit: /* unknown nullability */ Option[Long],
  tupReturned: /* unknown nullability */ Option[Long],
  tupFetched: /* unknown nullability */ Option[Long],
  tupInserted: /* unknown nullability */ Option[Long],
  tupUpdated: /* unknown nullability */ Option[Long],
  tupDeleted: /* unknown nullability */ Option[Long],
  conflicts: /* unknown nullability */ Option[Long],
  tempFiles: /* unknown nullability */ Option[Long],
  tempBytes: /* unknown nullability */ Option[Long],
  deadlocks: /* unknown nullability */ Option[Long],
  checksumFailures: /* unknown nullability */ Option[Long],
  checksumLastFailure: /* unknown nullability */ Option[LocalDateTime],
  blkReadTime: /* unknown nullability */ Option[Double],
  blkWriteTime: /* unknown nullability */ Option[Double],
  sessionTime: /* unknown nullability */ Option[Double],
  activeTime: /* unknown nullability */ Option[Double],
  idleInTransactionTime: /* unknown nullability */ Option[Double],
  sessions: /* unknown nullability */ Option[Long],
  sessionsAbandoned: /* unknown nullability */ Option[Long],
  sessionsFatal: /* unknown nullability */ Option[Long],
  sessionsKilled: /* unknown nullability */ Option[Long],
  statsReset: /* unknown nullability */ Option[LocalDateTime]
)

object PgStatDatabaseRow {
  implicit val rowParser: RowParser[PgStatDatabaseRow] = { row =>
    Success(
      PgStatDatabaseRow(
        datid = row[/* unknown nullability */ Option[Long]]("datid"),
        datname = row[/* unknown nullability */ Option[String]]("datname"),
        numbackends = row[/* unknown nullability */ Option[Int]]("numbackends"),
        xactCommit = row[/* unknown nullability */ Option[Long]]("xact_commit"),
        xactRollback = row[/* unknown nullability */ Option[Long]]("xact_rollback"),
        blksRead = row[/* unknown nullability */ Option[Long]]("blks_read"),
        blksHit = row[/* unknown nullability */ Option[Long]]("blks_hit"),
        tupReturned = row[/* unknown nullability */ Option[Long]]("tup_returned"),
        tupFetched = row[/* unknown nullability */ Option[Long]]("tup_fetched"),
        tupInserted = row[/* unknown nullability */ Option[Long]]("tup_inserted"),
        tupUpdated = row[/* unknown nullability */ Option[Long]]("tup_updated"),
        tupDeleted = row[/* unknown nullability */ Option[Long]]("tup_deleted"),
        conflicts = row[/* unknown nullability */ Option[Long]]("conflicts"),
        tempFiles = row[/* unknown nullability */ Option[Long]]("temp_files"),
        tempBytes = row[/* unknown nullability */ Option[Long]]("temp_bytes"),
        deadlocks = row[/* unknown nullability */ Option[Long]]("deadlocks"),
        checksumFailures = row[/* unknown nullability */ Option[Long]]("checksum_failures"),
        checksumLastFailure = row[/* unknown nullability */ Option[LocalDateTime]]("checksum_last_failure"),
        blkReadTime = row[/* unknown nullability */ Option[Double]]("blk_read_time"),
        blkWriteTime = row[/* unknown nullability */ Option[Double]]("blk_write_time"),
        sessionTime = row[/* unknown nullability */ Option[Double]]("session_time"),
        activeTime = row[/* unknown nullability */ Option[Double]]("active_time"),
        idleInTransactionTime = row[/* unknown nullability */ Option[Double]]("idle_in_transaction_time"),
        sessions = row[/* unknown nullability */ Option[Long]]("sessions"),
        sessionsAbandoned = row[/* unknown nullability */ Option[Long]]("sessions_abandoned"),
        sessionsFatal = row[/* unknown nullability */ Option[Long]]("sessions_fatal"),
        sessionsKilled = row[/* unknown nullability */ Option[Long]]("sessions_killed"),
        statsReset = row[/* unknown nullability */ Option[LocalDateTime]]("stats_reset")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatDatabaseRow] = new OFormat[PgStatDatabaseRow]{
    override def writes(o: PgStatDatabaseRow): JsObject =
      Json.obj(
        "datid" -> o.datid,
      "datname" -> o.datname,
      "numbackends" -> o.numbackends,
      "xact_commit" -> o.xactCommit,
      "xact_rollback" -> o.xactRollback,
      "blks_read" -> o.blksRead,
      "blks_hit" -> o.blksHit,
      "tup_returned" -> o.tupReturned,
      "tup_fetched" -> o.tupFetched,
      "tup_inserted" -> o.tupInserted,
      "tup_updated" -> o.tupUpdated,
      "tup_deleted" -> o.tupDeleted,
      "conflicts" -> o.conflicts,
      "temp_files" -> o.tempFiles,
      "temp_bytes" -> o.tempBytes,
      "deadlocks" -> o.deadlocks,
      "checksum_failures" -> o.checksumFailures,
      "checksum_last_failure" -> o.checksumLastFailure,
      "blk_read_time" -> o.blkReadTime,
      "blk_write_time" -> o.blkWriteTime,
      "session_time" -> o.sessionTime,
      "active_time" -> o.activeTime,
      "idle_in_transaction_time" -> o.idleInTransactionTime,
      "sessions" -> o.sessions,
      "sessions_abandoned" -> o.sessionsAbandoned,
      "sessions_fatal" -> o.sessionsFatal,
      "sessions_killed" -> o.sessionsKilled,
      "stats_reset" -> o.statsReset
      )

    override def reads(json: JsValue): JsResult[PgStatDatabaseRow] = {
      JsResult.fromTry(
        Try(
          PgStatDatabaseRow(
            datid = json.\("datid").toOption.map(_.as[Long]),
            datname = json.\("datname").toOption.map(_.as[String]),
            numbackends = json.\("numbackends").toOption.map(_.as[Int]),
            xactCommit = json.\("xact_commit").toOption.map(_.as[Long]),
            xactRollback = json.\("xact_rollback").toOption.map(_.as[Long]),
            blksRead = json.\("blks_read").toOption.map(_.as[Long]),
            blksHit = json.\("blks_hit").toOption.map(_.as[Long]),
            tupReturned = json.\("tup_returned").toOption.map(_.as[Long]),
            tupFetched = json.\("tup_fetched").toOption.map(_.as[Long]),
            tupInserted = json.\("tup_inserted").toOption.map(_.as[Long]),
            tupUpdated = json.\("tup_updated").toOption.map(_.as[Long]),
            tupDeleted = json.\("tup_deleted").toOption.map(_.as[Long]),
            conflicts = json.\("conflicts").toOption.map(_.as[Long]),
            tempFiles = json.\("temp_files").toOption.map(_.as[Long]),
            tempBytes = json.\("temp_bytes").toOption.map(_.as[Long]),
            deadlocks = json.\("deadlocks").toOption.map(_.as[Long]),
            checksumFailures = json.\("checksum_failures").toOption.map(_.as[Long]),
            checksumLastFailure = json.\("checksum_last_failure").toOption.map(_.as[LocalDateTime]),
            blkReadTime = json.\("blk_read_time").toOption.map(_.as[Double]),
            blkWriteTime = json.\("blk_write_time").toOption.map(_.as[Double]),
            sessionTime = json.\("session_time").toOption.map(_.as[Double]),
            activeTime = json.\("active_time").toOption.map(_.as[Double]),
            idleInTransactionTime = json.\("idle_in_transaction_time").toOption.map(_.as[Double]),
            sessions = json.\("sessions").toOption.map(_.as[Long]),
            sessionsAbandoned = json.\("sessions_abandoned").toOption.map(_.as[Long]),
            sessionsFatal = json.\("sessions_fatal").toOption.map(_.as[Long]),
            sessionsKilled = json.\("sessions_killed").toOption.map(_.as[Long]),
            statsReset = json.\("stats_reset").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
