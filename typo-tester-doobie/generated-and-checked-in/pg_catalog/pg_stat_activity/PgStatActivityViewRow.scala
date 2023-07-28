/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_activity

import adventureworks.TypoInet
import adventureworks.TypoXid
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import java.time.OffsetDateTime

case class PgStatActivityViewRow(
  datid: Option[/* oid */ Long],
  datname: Option[String],
  pid: Option[Int],
  leaderPid: Option[Int],
  usesysid: Option[/* oid */ Long],
  usename: Option[String],
  applicationName: Option[String],
  clientAddr: Option[TypoInet],
  clientHostname: Option[String],
  clientPort: Option[Int],
  backendStart: Option[OffsetDateTime],
  xactStart: Option[OffsetDateTime],
  queryStart: Option[OffsetDateTime],
  stateChange: Option[OffsetDateTime],
  waitEventType: Option[String],
  waitEvent: Option[String],
  state: Option[String],
  backendXid: Option[TypoXid],
  backendXmin: Option[TypoXid],
  queryId: Option[Long],
  query: Option[String],
  backendType: Option[String]
)

object PgStatActivityViewRow {
  implicit val decoder: Decoder[PgStatActivityViewRow] =
    (c: HCursor) =>
      for {
        datid <- c.downField("datid").as[Option[/* oid */ Long]]
        datname <- c.downField("datname").as[Option[String]]
        pid <- c.downField("pid").as[Option[Int]]
        leaderPid <- c.downField("leader_pid").as[Option[Int]]
        usesysid <- c.downField("usesysid").as[Option[/* oid */ Long]]
        usename <- c.downField("usename").as[Option[String]]
        applicationName <- c.downField("application_name").as[Option[String]]
        clientAddr <- c.downField("client_addr").as[Option[TypoInet]]
        clientHostname <- c.downField("client_hostname").as[Option[String]]
        clientPort <- c.downField("client_port").as[Option[Int]]
        backendStart <- c.downField("backend_start").as[Option[OffsetDateTime]]
        xactStart <- c.downField("xact_start").as[Option[OffsetDateTime]]
        queryStart <- c.downField("query_start").as[Option[OffsetDateTime]]
        stateChange <- c.downField("state_change").as[Option[OffsetDateTime]]
        waitEventType <- c.downField("wait_event_type").as[Option[String]]
        waitEvent <- c.downField("wait_event").as[Option[String]]
        state <- c.downField("state").as[Option[String]]
        backendXid <- c.downField("backend_xid").as[Option[TypoXid]]
        backendXmin <- c.downField("backend_xmin").as[Option[TypoXid]]
        queryId <- c.downField("query_id").as[Option[Long]]
        query <- c.downField("query").as[Option[String]]
        backendType <- c.downField("backend_type").as[Option[String]]
      } yield PgStatActivityViewRow(datid, datname, pid, leaderPid, usesysid, usename, applicationName, clientAddr, clientHostname, clientPort, backendStart, xactStart, queryStart, stateChange, waitEventType, waitEvent, state, backendXid, backendXmin, queryId, query, backendType)
  implicit val encoder: Encoder[PgStatActivityViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "datid" := row.datid,
        "datname" := row.datname,
        "pid" := row.pid,
        "leader_pid" := row.leaderPid,
        "usesysid" := row.usesysid,
        "usename" := row.usename,
        "application_name" := row.applicationName,
        "client_addr" := row.clientAddr,
        "client_hostname" := row.clientHostname,
        "client_port" := row.clientPort,
        "backend_start" := row.backendStart,
        "xact_start" := row.xactStart,
        "query_start" := row.queryStart,
        "state_change" := row.stateChange,
        "wait_event_type" := row.waitEventType,
        "wait_event" := row.waitEvent,
        "state" := row.state,
        "backend_xid" := row.backendXid,
        "backend_xmin" := row.backendXmin,
        "query_id" := row.queryId,
        "query" := row.query,
        "backend_type" := row.backendType
      )}
  implicit val read: Read[PgStatActivityViewRow] =
    new Read[PgStatActivityViewRow](
      gets = List(
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[TypoInet], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[TypoXid], Nullability.Nullable),
        (Get[TypoXid], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgStatActivityViewRow(
        datid = Get[/* oid */ Long].unsafeGetNullable(rs, i + 0),
        datname = Get[String].unsafeGetNullable(rs, i + 1),
        pid = Get[Int].unsafeGetNullable(rs, i + 2),
        leaderPid = Get[Int].unsafeGetNullable(rs, i + 3),
        usesysid = Get[/* oid */ Long].unsafeGetNullable(rs, i + 4),
        usename = Get[String].unsafeGetNullable(rs, i + 5),
        applicationName = Get[String].unsafeGetNullable(rs, i + 6),
        clientAddr = Get[TypoInet].unsafeGetNullable(rs, i + 7),
        clientHostname = Get[String].unsafeGetNullable(rs, i + 8),
        clientPort = Get[Int].unsafeGetNullable(rs, i + 9),
        backendStart = Get[OffsetDateTime].unsafeGetNullable(rs, i + 10),
        xactStart = Get[OffsetDateTime].unsafeGetNullable(rs, i + 11),
        queryStart = Get[OffsetDateTime].unsafeGetNullable(rs, i + 12),
        stateChange = Get[OffsetDateTime].unsafeGetNullable(rs, i + 13),
        waitEventType = Get[String].unsafeGetNullable(rs, i + 14),
        waitEvent = Get[String].unsafeGetNullable(rs, i + 15),
        state = Get[String].unsafeGetNullable(rs, i + 16),
        backendXid = Get[TypoXid].unsafeGetNullable(rs, i + 17),
        backendXmin = Get[TypoXid].unsafeGetNullable(rs, i + 18),
        queryId = Get[Long].unsafeGetNullable(rs, i + 19),
        query = Get[String].unsafeGetNullable(rs, i + 20),
        backendType = Get[String].unsafeGetNullable(rs, i + 21)
      )
    )
  

}
