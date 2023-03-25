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

object PgAmprocRepoImpl extends PgAmprocRepo {
  override def selectAll(implicit c: Connection): List[PgAmprocRow] = {
    SQL"""select oid, amprocfamily, amproclefttype, amprocrighttype, amprocnum, amproc from pg_catalog.pg_amproc""".as(PgAmprocRow.rowParser("").*)
  }
  override def selectById(oid: PgAmprocId)(implicit c: Connection): Option[PgAmprocRow] = {
    SQL"""select oid, amprocfamily, amproclefttype, amprocrighttype, amprocnum, amproc from pg_catalog.pg_amproc where oid = $oid""".as(PgAmprocRow.rowParser("").singleOpt)
  }
  override def selectByIds(oids: List[PgAmprocId])(implicit c: Connection): List[PgAmprocRow] = {
    SQL"""select oid, amprocfamily, amproclefttype, amprocrighttype, amprocnum, amproc from pg_catalog.pg_amproc where oid in $oids""".as(PgAmprocRow.rowParser("").*)
  }
  override def selectByFieldValues(fieldValues: List[PgAmprocFieldValue[_]])(implicit c: Connection): List[PgAmprocRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgAmprocFieldValue.oid(value) => NamedParameter("oid", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocfamily(value) => NamedParameter("amprocfamily", ParameterValue.from(value))
          case PgAmprocFieldValue.amproclefttype(value) => NamedParameter("amproclefttype", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocrighttype(value) => NamedParameter("amprocrighttype", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocnum(value) => NamedParameter("amprocnum", ParameterValue.from(value))
          case PgAmprocFieldValue.amproc(value) => NamedParameter("amproc", ParameterValue.from(value))
        }
        val q = s"""select * from pg_catalog.pg_amproc where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        SQL(q)
          .on(namedParams: _*)
          .as(PgAmprocRow.rowParser("").*)
    }

  }
  override def updateFieldValues(oid: PgAmprocId, fieldValues: List[PgAmprocFieldValue[_]])(implicit c: Connection): Int = {
    fieldValues match {
      case Nil => 0
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case PgAmprocFieldValue.oid(value) => NamedParameter("oid", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocfamily(value) => NamedParameter("amprocfamily", ParameterValue.from(value))
          case PgAmprocFieldValue.amproclefttype(value) => NamedParameter("amproclefttype", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocrighttype(value) => NamedParameter("amprocrighttype", ParameterValue.from(value))
          case PgAmprocFieldValue.amprocnum(value) => NamedParameter("amprocnum", ParameterValue.from(value))
          case PgAmprocFieldValue.amproc(value) => NamedParameter("amproc", ParameterValue.from(value))
        }
        val q = s"""update pg_catalog.pg_amproc
          set ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(", ")}
          where oid = $oid"""
        SQL(q)
          .on(namedParams: _*)
          .executeUpdate()
    }

  }
  override def insert(oid: PgAmprocId, unsaved: PgAmprocRowUnsaved)(implicit c: Connection): Boolean = {
    val namedParameters = List(
      Some(NamedParameter("amprocfamily", ParameterValue.from(unsaved.amprocfamily))),
      Some(NamedParameter("amproclefttype", ParameterValue.from(unsaved.amproclefttype))),
      Some(NamedParameter("amprocrighttype", ParameterValue.from(unsaved.amprocrighttype))),
      Some(NamedParameter("amprocnum", ParameterValue.from(unsaved.amprocnum))),
      Some(NamedParameter("amproc", ParameterValue.from(unsaved.amproc)))
    ).flatten

    SQL"""insert into pg_catalog.pg_amproc(oid, ${namedParameters.map(_.name).mkString(", ")})
      values (${oid}, ${namedParameters.map(np => s"{${np.name}}").mkString(", ")})
      """
      .on(namedParameters :_*)
      .execute()

  }
  override def delete(oid: PgAmprocId)(implicit c: Connection): Boolean = {
    SQL"""delete from pg_catalog.pg_amproc where oid = $oid""".executeUpdate() > 0
  }
  override def selectByUniqueAmprocfamilyAmproclefttypeAmprocrighttypeAmprocnum(amprocfamily: Long, amproclefttype: Long, amprocrighttype: Long, amprocnum: Int)(implicit c: Connection): Option[PgAmprocRow] = {
    ???
  }
}
