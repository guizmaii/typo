package testdb
package pg_catalog

import anorm.NamedParameter
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import java.sql.Connection

trait PgStatUserIndexesRepoImpl extends PgStatUserIndexesRepo {
  override def selectAll(implicit c: Connection): List[PgStatUserIndexesRow] = {
    SQL"""select relid, indexrelid, schemaname, relname, indexrelname, idx_scan, idx_tup_read, idx_tup_fetch from pg_catalog.pg_stat_user_indexes""".as(PgStatUserIndexesRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgStatUserIndexesFieldValue[_]])(implicit c: Connection): List[PgStatUserIndexesRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgStatUserIndexesFieldValue.relid(value) => NamedParameter("relid", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.indexrelid(value) => NamedParameter("indexrelid", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.schemaname(value) => NamedParameter("schemaname", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.relname(value) => NamedParameter("relname", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.indexrelname(value) => NamedParameter("indexrelname", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.idxScan(value) => NamedParameter("idx_scan", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.idxTupRead(value) => NamedParameter("idx_tup_read", ParameterValue.from(value))
          case PgStatUserIndexesFieldValue.idxTupFetch(value) => NamedParameter("idx_tup_fetch", ParameterValue.from(value))
        }
        SQL"""select * from pg_catalog.pg_stat_user_indexes where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
          .on(namedParams: _*)
          .as(PgStatUserIndexesRow.rowParser.*)
    }

  }
}
