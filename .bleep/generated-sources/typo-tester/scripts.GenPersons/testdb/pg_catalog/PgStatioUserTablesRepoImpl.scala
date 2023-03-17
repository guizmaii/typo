package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgStatioUserTablesRepoImpl extends PgStatioUserTablesRepo {
  override def selectAll(implicit c: Connection): List[PgStatioUserTablesRow] = {
    SQL"""select relid, schemaname, relname, heap_blks_read, heap_blks_hit, idx_blks_read, idx_blks_hit, toast_blks_read, toast_blks_hit, tidx_blks_read, tidx_blks_hit from pg_catalog.pg_statio_user_tables""".as(PgStatioUserTablesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgStatioUserTablesFieldValue[_]])(implicit c: Connection): List[PgStatioUserTablesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgStatioUserTablesFieldValue.relid(value) => NamedParameter("relid", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.schemaname(value) => NamedParameter("schemaname", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.relname(value) => NamedParameter("relname", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.heapBlksRead(value) => NamedParameter("heap_blks_read", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.heapBlksHit(value) => NamedParameter("heap_blks_hit", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.idxBlksRead(value) => NamedParameter("idx_blks_read", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.idxBlksHit(value) => NamedParameter("idx_blks_hit", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.toastBlksRead(value) => NamedParameter("toast_blks_read", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.toastBlksHit(value) => NamedParameter("toast_blks_hit", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.tidxBlksRead(value) => NamedParameter("tidx_blks_read", ParameterValue.from(value))
          case PgStatioUserTablesFieldValue.tidxBlksHit(value) => NamedParameter("tidx_blks_hit", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_statio_user_tables where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgStatioUserTablesRow.rowParser.*)
    }

  }
}
