/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_am

import adventureworks.customtypes.TypoRegproc
import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgAmRepoImpl extends PgAmRepo {
  override def delete(oid: PgAmId)(implicit c: Connection): Boolean = {
    SQL"delete from pg_catalog.pg_am where oid = ${ParameterValue(oid, null, PgAmId.toStatement)}".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PgAmFields, PgAmRow] = {
    DeleteBuilder("pg_catalog.pg_am", PgAmFields)
  }
  override def insert(unsaved: PgAmRow)(implicit c: Connection): PgAmRow = {
    SQL"""insert into pg_catalog.pg_am(oid, amname, amhandler, amtype)
          values (${ParameterValue(unsaved.oid, null, PgAmId.toStatement)}::oid, ${ParameterValue(unsaved.amname, null, ToStatement.stringToStatement)}::name, ${ParameterValue(unsaved.amhandler, null, TypoRegproc.toStatement)}::regproc, ${ParameterValue(unsaved.amtype, null, ToStatement.stringToStatement)}::char)
          returning oid, amname, amhandler, amtype
       """
      .executeInsert(PgAmRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgAmFields, PgAmRow] = {
    SelectBuilderSql("pg_catalog.pg_am", PgAmFields, PgAmRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgAmRow] = {
    SQL"""select oid, amname, amhandler, amtype
          from pg_catalog.pg_am
       """.as(PgAmRow.rowParser(1).*)
  }
  override def selectById(oid: PgAmId)(implicit c: Connection): Option[PgAmRow] = {
    SQL"""select oid, amname, amhandler, amtype
          from pg_catalog.pg_am
          where oid = ${ParameterValue(oid, null, PgAmId.toStatement)}
       """.as(PgAmRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgAmId])(implicit c: Connection): List[PgAmRow] = {
    SQL"""select oid, amname, amhandler, amtype
          from pg_catalog.pg_am
          where oid = ANY(${oids})
       """.as(PgAmRow.rowParser(1).*)
    
  }
  override def selectByUnique(amname: String)(implicit c: Connection): Option[PgAmRow] = {
    SQL"""select amname
          from pg_catalog.pg_am
          where amname = ${ParameterValue(amname, null, ToStatement.stringToStatement)}
       """.as(PgAmRow.rowParser(1).singleOpt)
    
  }
  override def update(row: PgAmRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_am
          set amname = ${ParameterValue(row.amname, null, ToStatement.stringToStatement)}::name,
              amhandler = ${ParameterValue(row.amhandler, null, TypoRegproc.toStatement)}::regproc,
              amtype = ${ParameterValue(row.amtype, null, ToStatement.stringToStatement)}::char
          where oid = ${ParameterValue(oid, null, PgAmId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PgAmFields, PgAmRow] = {
    UpdateBuilder("pg_catalog.pg_am", PgAmFields, PgAmRow.rowParser)
  }
  override def upsert(unsaved: PgAmRow)(implicit c: Connection): PgAmRow = {
    SQL"""insert into pg_catalog.pg_am(oid, amname, amhandler, amtype)
          values (
            ${ParameterValue(unsaved.oid, null, PgAmId.toStatement)}::oid,
            ${ParameterValue(unsaved.amname, null, ToStatement.stringToStatement)}::name,
            ${ParameterValue(unsaved.amhandler, null, TypoRegproc.toStatement)}::regproc,
            ${ParameterValue(unsaved.amtype, null, ToStatement.stringToStatement)}::char
          )
          on conflict (oid)
          do update set
            amname = EXCLUDED.amname,
            amhandler = EXCLUDED.amhandler,
            amtype = EXCLUDED.amtype
          returning oid, amname, amhandler, amtype
       """
      .executeInsert(PgAmRow.rowParser(1).single)
    
  }
}
