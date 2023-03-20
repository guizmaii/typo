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

trait PgTsDictRepoImpl extends PgTsDictRepo {
  override def selectAll(implicit c: Connection): List[PgTsDictRow] = {
    SQL"""select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict""".as(PgTsDictRow.rowParser.*)
  }
  override def selectById(oid: PgTsDictId)(implicit c: Connection): Option[PgTsDictRow] = {
    SQL"""select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict where oid = $oid""".as(PgTsDictRow.rowParser.singleOpt)
  }
  override def selectByIds(oids: List[PgTsDictId])(implicit c: Connection): List[PgTsDictRow] = {
    SQL"""select oid, dictname, dictnamespace, dictowner, dicttemplate, dictinitoption from pg_catalog.pg_ts_dict where oid in $oids""".as(PgTsDictRow.rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[PgTsDictFieldValue[_]])(implicit c: Connection): List[PgTsDictRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgTsDictFieldValue.oid(value) => NamedParameter("oid", ParameterValue.from(value))
          case PgTsDictFieldValue.dictname(value) => NamedParameter("dictname", ParameterValue.from(value))
          case PgTsDictFieldValue.dictnamespace(value) => NamedParameter("dictnamespace", ParameterValue.from(value))
          case PgTsDictFieldValue.dictowner(value) => NamedParameter("dictowner", ParameterValue.from(value))
          case PgTsDictFieldValue.dicttemplate(value) => NamedParameter("dicttemplate", ParameterValue.from(value))
          case PgTsDictFieldValue.dictinitoption(value) => NamedParameter("dictinitoption", ParameterValue.from(value))
        }
        val q = s"""select * from pg_catalog.pg_ts_dict where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        SQL(q)
          .on(namedParams: _*)
          .as(PgTsDictRow.rowParser.*)
    }

  }
  override def updateFieldValues(oid: PgTsDictId, fieldValues: List[PgTsDictFieldValue[_]])(implicit c: Connection): Int = {
    fieldValues match {
      case Nil => 0
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgTsDictFieldValue.oid(value) => NamedParameter("oid", ParameterValue.from(value))
          case PgTsDictFieldValue.dictname(value) => NamedParameter("dictname", ParameterValue.from(value))
          case PgTsDictFieldValue.dictnamespace(value) => NamedParameter("dictnamespace", ParameterValue.from(value))
          case PgTsDictFieldValue.dictowner(value) => NamedParameter("dictowner", ParameterValue.from(value))
          case PgTsDictFieldValue.dicttemplate(value) => NamedParameter("dicttemplate", ParameterValue.from(value))
          case PgTsDictFieldValue.dictinitoption(value) => NamedParameter("dictinitoption", ParameterValue.from(value))
        }
        val q = s"""update pg_catalog.pg_ts_dict
          set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
          where oid = $oid"""
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate()
    }

  }
  override def insert(oid: PgTsDictId, unsaved: PgTsDictRowUnsaved)(implicit c: Connection): Unit = {
    val namedParameters = List(
      Some(NamedParameter("dictname", ParameterValue.from(unsaved.dictname))),
      Some(NamedParameter("dictnamespace", ParameterValue.from(unsaved.dictnamespace))),
      Some(NamedParameter("dictowner", ParameterValue.from(unsaved.dictowner))),
      Some(NamedParameter("dicttemplate", ParameterValue.from(unsaved.dicttemplate))),
      Some(NamedParameter("dictinitoption", ParameterValue.from(unsaved.dictinitoption)))
    ).flatten

    SQL"""insert into pg_catalog.pg_ts_dict(oid, ${namedParameters.map(_.name).mkString(", ")})
      values (${oid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
      """
      .on(namedParameters :_*)
      .execute()

  }
  override def delete(oid: PgTsDictId)(implicit c: Connection): Boolean = {
    SQL"""delete from pg_catalog.pg_ts_dict where oid = $oid""".executeUpdate() > 0
  }
  override def selectByUnique(dictname: String, dictnamespace: Long)(implicit c: Connection): Option[PgTsDictRow] = {
    ???
  }
}
