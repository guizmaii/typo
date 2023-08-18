/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_activity

import typo.dsl.SqlExpr.FieldLikeNoHkt
import typo.dsl.SqlExpr.OptField
import typo.dsl.Structure.Relation

class PgStatActivityViewStructure[Row](val prefix: Option[String], val extract: Row => PgStatActivityViewRow, val merge: (Row, PgStatActivityViewRow) => Row)
  extends Relation[PgStatActivityViewFields, PgStatActivityViewRow, Row]
    with PgStatActivityViewFields[Row] { outer =>

  override val datid = new OptField[/* oid */ Long, Row](prefix, "datid", None, Some("oid"))(x => extract(x).datid, (row, value) => merge(row, extract(row).copy(datid = value)))
  override val datname = new OptField[String, Row](prefix, "datname", None, Some("name"))(x => extract(x).datname, (row, value) => merge(row, extract(row).copy(datname = value)))
  override val pid = new OptField[Int, Row](prefix, "pid", None, Some("int4"))(x => extract(x).pid, (row, value) => merge(row, extract(row).copy(pid = value)))
  override val leaderPid = new OptField[Int, Row](prefix, "leader_pid", None, Some("int4"))(x => extract(x).leaderPid, (row, value) => merge(row, extract(row).copy(leaderPid = value)))
  override val usesysid = new OptField[/* oid */ Long, Row](prefix, "usesysid", None, Some("oid"))(x => extract(x).usesysid, (row, value) => merge(row, extract(row).copy(usesysid = value)))
  override val usename = new OptField[String, Row](prefix, "usename", None, Some("name"))(x => extract(x).usename, (row, value) => merge(row, extract(row).copy(usename = value)))
  override val applicationName = new OptField[String, Row](prefix, "application_name", None, None)(x => extract(x).applicationName, (row, value) => merge(row, extract(row).copy(applicationName = value)))
  override val clientAddr = new OptField[TypoInet, Row](prefix, "client_addr", None, Some("inet"))(x => extract(x).clientAddr, (row, value) => merge(row, extract(row).copy(clientAddr = value)))
  override val clientHostname = new OptField[String, Row](prefix, "client_hostname", None, None)(x => extract(x).clientHostname, (row, value) => merge(row, extract(row).copy(clientHostname = value)))
  override val clientPort = new OptField[Int, Row](prefix, "client_port", None, Some("int4"))(x => extract(x).clientPort, (row, value) => merge(row, extract(row).copy(clientPort = value)))
  override val backendStart = new OptField[TypoOffsetDateTime, Row](prefix, "backend_start", Some("text"), Some("timestamptz"))(x => extract(x).backendStart, (row, value) => merge(row, extract(row).copy(backendStart = value)))
  override val xactStart = new OptField[TypoOffsetDateTime, Row](prefix, "xact_start", Some("text"), Some("timestamptz"))(x => extract(x).xactStart, (row, value) => merge(row, extract(row).copy(xactStart = value)))
  override val queryStart = new OptField[TypoOffsetDateTime, Row](prefix, "query_start", Some("text"), Some("timestamptz"))(x => extract(x).queryStart, (row, value) => merge(row, extract(row).copy(queryStart = value)))
  override val stateChange = new OptField[TypoOffsetDateTime, Row](prefix, "state_change", Some("text"), Some("timestamptz"))(x => extract(x).stateChange, (row, value) => merge(row, extract(row).copy(stateChange = value)))
  override val waitEventType = new OptField[String, Row](prefix, "wait_event_type", None, None)(x => extract(x).waitEventType, (row, value) => merge(row, extract(row).copy(waitEventType = value)))
  override val waitEvent = new OptField[String, Row](prefix, "wait_event", None, None)(x => extract(x).waitEvent, (row, value) => merge(row, extract(row).copy(waitEvent = value)))
  override val state = new OptField[String, Row](prefix, "state", None, None)(x => extract(x).state, (row, value) => merge(row, extract(row).copy(state = value)))
  override val backendXid = new OptField[TypoXid, Row](prefix, "backend_xid", None, Some("xid"))(x => extract(x).backendXid, (row, value) => merge(row, extract(row).copy(backendXid = value)))
  override val backendXmin = new OptField[TypoXid, Row](prefix, "backend_xmin", None, Some("xid"))(x => extract(x).backendXmin, (row, value) => merge(row, extract(row).copy(backendXmin = value)))
  override val queryId = new OptField[Long, Row](prefix, "query_id", None, Some("int8"))(x => extract(x).queryId, (row, value) => merge(row, extract(row).copy(queryId = value)))
  override val query = new OptField[String, Row](prefix, "query", None, None)(x => extract(x).query, (row, value) => merge(row, extract(row).copy(query = value)))
  override val backendType = new OptField[String, Row](prefix, "backend_type", None, None)(x => extract(x).backendType, (row, value) => merge(row, extract(row).copy(backendType = value)))

  override val columns: List[FieldLikeNoHkt[?, Row]] =
    List[FieldLikeNoHkt[?, Row]](datid, datname, pid, leaderPid, usesysid, usename, applicationName, clientAddr, clientHostname, clientPort, backendStart, xactStart, queryStart, stateChange, waitEventType, waitEvent, state, backendXid, backendXmin, queryId, query, backendType)

  override def copy[NewRow](prefix: Option[String], extract: NewRow => PgStatActivityViewRow, merge: (NewRow, PgStatActivityViewRow) => NewRow): PgStatActivityViewStructure[NewRow] =
    new PgStatActivityViewStructure(prefix, extract, merge)
}
