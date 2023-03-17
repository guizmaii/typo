package testdb.pg_catalog

import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import org.postgresql.util.PGInterval
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatReplicationRow(
  pid: /* unknown nullability */ Option[Int],
  usesysid: /* unknown nullability */ Option[Long],
  /** Points to [[testdb.pg_catalog.PgAuthidRow.rolname]] */
  usename: String,
  applicationName: /* unknown nullability */ Option[String],
  clientAddr: /* unknown nullability */ Option[/* inet */ String],
  clientHostname: /* unknown nullability */ Option[String],
  clientPort: /* unknown nullability */ Option[Int],
  backendStart: /* unknown nullability */ Option[LocalDateTime],
  backendXmin: /* unknown nullability */ Option[/* xid */ String],
  state: /* unknown nullability */ Option[String],
  sentLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  writeLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  flushLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  replayLsn: /* unknown nullability */ Option[/* pg_lsn */ String],
  writeLag: /* unknown nullability */ Option[/* interval */ PGInterval],
  flushLag: /* unknown nullability */ Option[/* interval */ PGInterval],
  replayLag: /* unknown nullability */ Option[/* interval */ PGInterval],
  syncPriority: /* unknown nullability */ Option[Int],
  syncState: /* unknown nullability */ Option[String],
  replyTime: /* unknown nullability */ Option[LocalDateTime]
)

object PgStatReplicationRow {
  implicit val rowParser: RowParser[PgStatReplicationRow] = { row =>
    Success(
      PgStatReplicationRow(
        pid = row[/* unknown nullability */ Option[Int]]("pid"),
        usesysid = row[/* unknown nullability */ Option[Long]]("usesysid"),
        usename = row[String]("usename"),
        applicationName = row[/* unknown nullability */ Option[String]]("application_name"),
        clientAddr = row[/* unknown nullability */ Option[/* inet */ String]]("client_addr"),
        clientHostname = row[/* unknown nullability */ Option[String]]("client_hostname"),
        clientPort = row[/* unknown nullability */ Option[Int]]("client_port"),
        backendStart = row[/* unknown nullability */ Option[LocalDateTime]]("backend_start"),
        backendXmin = row[/* unknown nullability */ Option[/* xid */ String]]("backend_xmin"),
        state = row[/* unknown nullability */ Option[String]]("state"),
        sentLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("sent_lsn"),
        writeLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("write_lsn"),
        flushLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("flush_lsn"),
        replayLsn = row[/* unknown nullability */ Option[/* pg_lsn */ String]]("replay_lsn"),
        writeLag = row[/* unknown nullability */ Option[/* interval */ PGInterval]]("write_lag"),
        flushLag = row[/* unknown nullability */ Option[/* interval */ PGInterval]]("flush_lag"),
        replayLag = row[/* unknown nullability */ Option[/* interval */ PGInterval]]("replay_lag"),
        syncPriority = row[/* unknown nullability */ Option[Int]]("sync_priority"),
        syncState = row[/* unknown nullability */ Option[String]]("sync_state"),
        replyTime = row[/* unknown nullability */ Option[LocalDateTime]]("reply_time")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatReplicationRow] = new OFormat[PgStatReplicationRow]{
    override def writes(o: PgStatReplicationRow): JsObject =
      Json.obj(
        "pid" -> o.pid,
      "usesysid" -> o.usesysid,
      "usename" -> o.usename,
      "application_name" -> o.applicationName,
      "client_addr" -> o.clientAddr,
      "client_hostname" -> o.clientHostname,
      "client_port" -> o.clientPort,
      "backend_start" -> o.backendStart,
      "backend_xmin" -> o.backendXmin,
      "state" -> o.state,
      "sent_lsn" -> o.sentLsn,
      "write_lsn" -> o.writeLsn,
      "flush_lsn" -> o.flushLsn,
      "replay_lsn" -> o.replayLsn,
      "write_lag" -> o.writeLag,
      "flush_lag" -> o.flushLag,
      "replay_lag" -> o.replayLag,
      "sync_priority" -> o.syncPriority,
      "sync_state" -> o.syncState,
      "reply_time" -> o.replyTime
      )

    override def reads(json: JsValue): JsResult[PgStatReplicationRow] = {
      JsResult.fromTry(
        Try(
          PgStatReplicationRow(
            pid = json.\("pid").toOption.map(_.as[Int]),
            usesysid = json.\("usesysid").toOption.map(_.as[Long]),
            usename = json.\("usename").as[String],
            applicationName = json.\("application_name").toOption.map(_.as[String]),
            clientAddr = json.\("client_addr").toOption.map(_.as[/* inet */ String]),
            clientHostname = json.\("client_hostname").toOption.map(_.as[String]),
            clientPort = json.\("client_port").toOption.map(_.as[Int]),
            backendStart = json.\("backend_start").toOption.map(_.as[LocalDateTime]),
            backendXmin = json.\("backend_xmin").toOption.map(_.as[/* xid */ String]),
            state = json.\("state").toOption.map(_.as[String]),
            sentLsn = json.\("sent_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            writeLsn = json.\("write_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            flushLsn = json.\("flush_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            replayLsn = json.\("replay_lsn").toOption.map(_.as[/* pg_lsn */ String]),
            writeLag = json.\("write_lag").toOption.map(_.as[/* interval */ PGInterval]),
            flushLag = json.\("flush_lag").toOption.map(_.as[/* interval */ PGInterval]),
            replayLag = json.\("replay_lag").toOption.map(_.as[/* interval */ PGInterval]),
            syncPriority = json.\("sync_priority").toOption.map(_.as[Int]),
            syncState = json.\("sync_state").toOption.map(_.as[String]),
            replyTime = json.\("reply_time").toOption.map(_.as[LocalDateTime])
          )
        )
      )
    }
  }
}
