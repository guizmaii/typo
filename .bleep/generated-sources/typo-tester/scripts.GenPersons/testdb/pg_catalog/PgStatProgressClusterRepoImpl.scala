package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgStatProgressClusterRepoImpl extends PgStatProgressClusterRepo {
  override def selectAll(implicit c: Connection): List[PgStatProgressClusterRow] = {
    SQL"""select pid, datid, datname, relid, command, phase, cluster_index_relid, heap_tuples_scanned, heap_tuples_written, heap_blks_total, heap_blks_scanned, index_rebuild_count from pg_catalog.pg_stat_progress_cluster""".as(PgStatProgressClusterRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgStatProgressClusterFieldValue[_]])(implicit c: Connection): List[PgStatProgressClusterRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgStatProgressClusterFieldValue.pid(value) => NamedParameter("pid", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.datid(value) => NamedParameter("datid", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.datname(value) => NamedParameter("datname", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.relid(value) => NamedParameter("relid", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.command(value) => NamedParameter("command", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.phase(value) => NamedParameter("phase", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.clusterIndexRelid(value) => NamedParameter("cluster_index_relid", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.heapTuplesScanned(value) => NamedParameter("heap_tuples_scanned", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.heapTuplesWritten(value) => NamedParameter("heap_tuples_written", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.heapBlksTotal(value) => NamedParameter("heap_blks_total", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.heapBlksScanned(value) => NamedParameter("heap_blks_scanned", ParameterValue.from(value))
          case PgStatProgressClusterFieldValue.indexRebuildCount(value) => NamedParameter("index_rebuild_count", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_stat_progress_cluster where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgStatProgressClusterRow.rowParser.*)
    }

  }
}
