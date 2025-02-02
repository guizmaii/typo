/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_shseclabel

import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PgShseclabelRepoImpl extends PgShseclabelRepo {
  override def delete(compositeId: PgShseclabelId)(implicit c: Connection): Boolean = {
    SQL"""delete from pg_catalog.pg_shseclabel where "objoid" = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND "classoid" = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND "provider" = ${ParameterValue(compositeId.provider, null, ToStatement.stringToStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PgShseclabelFields, PgShseclabelRow] = {
    DeleteBuilder("pg_catalog.pg_shseclabel", PgShseclabelFields)
  }
  override def insert(unsaved: PgShseclabelRow)(implicit c: Connection): PgShseclabelRow = {
    SQL"""insert into pg_catalog.pg_shseclabel("objoid", "classoid", "provider", "label")
          values (${ParameterValue(unsaved.objoid, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.classoid, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.provider, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.label, null, ToStatement.stringToStatement)})
          returning "objoid", "classoid", "provider", "label"
       """
      .executeInsert(PgShseclabelRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[PgShseclabelFields, PgShseclabelRow] = {
    SelectBuilderSql("pg_catalog.pg_shseclabel", PgShseclabelFields, PgShseclabelRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PgShseclabelRow] = {
    SQL"""select "objoid", "classoid", "provider", "label"
          from pg_catalog.pg_shseclabel
       """.as(PgShseclabelRow.rowParser(1).*)
  }
  override def selectById(compositeId: PgShseclabelId)(implicit c: Connection): Option[PgShseclabelRow] = {
    SQL"""select "objoid", "classoid", "provider", "label"
          from pg_catalog.pg_shseclabel
          where "objoid" = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND "classoid" = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND "provider" = ${ParameterValue(compositeId.provider, null, ToStatement.stringToStatement)}
       """.as(PgShseclabelRow.rowParser(1).singleOpt)
  }
  override def update(row: PgShseclabelRow)(implicit c: Connection): Boolean = {
    val compositeId = row.compositeId
    SQL"""update pg_catalog.pg_shseclabel
          set "label" = ${ParameterValue(row.label, null, ToStatement.stringToStatement)}
          where "objoid" = ${ParameterValue(compositeId.objoid, null, ToStatement.longToStatement)} AND "classoid" = ${ParameterValue(compositeId.classoid, null, ToStatement.longToStatement)} AND "provider" = ${ParameterValue(compositeId.provider, null, ToStatement.stringToStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PgShseclabelFields, PgShseclabelRow] = {
    UpdateBuilder("pg_catalog.pg_shseclabel", PgShseclabelFields, PgShseclabelRow.rowParser)
  }
  override def upsert(unsaved: PgShseclabelRow)(implicit c: Connection): PgShseclabelRow = {
    SQL"""insert into pg_catalog.pg_shseclabel("objoid", "classoid", "provider", "label")
          values (
            ${ParameterValue(unsaved.objoid, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.classoid, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.provider, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.label, null, ToStatement.stringToStatement)}
          )
          on conflict ("objoid", "classoid", "provider")
          do update set
            "label" = EXCLUDED."label"
          returning "objoid", "classoid", "provider", "label"
       """
      .executeInsert(PgShseclabelRow.rowParser(1).single)
    
  }
}
