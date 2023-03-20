/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package postgres
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SQL
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgReplicationSlotsRepoImpl extends PgReplicationSlotsRepo {
  override def selectAll(implicit c: Connection): List[PgReplicationSlotsRow] = {
    SQL"""select slot_name, plugin, slot_type, datoid, database, temporary, active, active_pid, xmin, catalog_xmin, restart_lsn, confirmed_flush_lsn, wal_status, safe_wal_size, two_phase from pg_catalog.pg_replication_slots""".as(PgReplicationSlotsRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgReplicationSlotsFieldValue[_]])(implicit c: Connection): List[PgReplicationSlotsRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgReplicationSlotsFieldValue.slotName(value) => NamedParameter("slot_name", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.plugin(value) => NamedParameter("plugin", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.slotType(value) => NamedParameter("slot_type", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.datoid(value) => NamedParameter("datoid", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.database(value) => NamedParameter("database", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.temporary(value) => NamedParameter("temporary", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.active(value) => NamedParameter("active", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.activePid(value) => NamedParameter("active_pid", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.xmin(value) => NamedParameter("xmin", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.catalogXmin(value) => NamedParameter("catalog_xmin", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.restartLsn(value) => NamedParameter("restart_lsn", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.confirmedFlushLsn(value) => NamedParameter("confirmed_flush_lsn", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.walStatus(value) => NamedParameter("wal_status", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.safeWalSize(value) => NamedParameter("safe_wal_size", ParameterValue.from(value))
          case PgReplicationSlotsFieldValue.twoPhase(value) => NamedParameter("two_phase", ParameterValue.from(value))
        }
        val q = s"""select * from pg_catalog.pg_replication_slots where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        SQL(q)
          .on(namedParams: _*)
          .as(PgReplicationSlotsRow.rowParser.*)
    }

  }
}
