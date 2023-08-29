/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog
package pg_namespace

import anorm.ParameterValue
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.generated.customtypes.TypoAclItem

object PgNamespaceRepoImpl extends PgNamespaceRepo {
  override def delete(oid: PgNamespaceId)(implicit c: Connection): Boolean = {
    SQL"""delete from pg_catalog.pg_namespace where "oid" = ${ParameterValue(oid, null, PgNamespaceId.toStatement)}""".executeUpdate() > 0
  }
  override def insert(unsaved: PgNamespaceRow)(implicit c: Connection): PgNamespaceRow = {
    SQL"""insert into pg_catalog.pg_namespace("oid", "nspname", "nspowner", "nspacl")
          values (${ParameterValue(unsaved.oid, null, PgNamespaceId.toStatement)}::oid, ${ParameterValue(unsaved.nspname, null, ToStatement.stringToStatement)}::name, ${ParameterValue(unsaved.nspowner, null, ToStatement.longToStatement)}::oid, ${ParameterValue(unsaved.nspacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, typo.generated.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem)
          returning "oid", "nspname", "nspowner", "nspacl"
       """
      .executeInsert(PgNamespaceRow.rowParser(1).single)
    
  }
  override def selectAll(implicit c: Connection): List[PgNamespaceRow] = {
    SQL"""select "oid", "nspname", "nspowner", "nspacl"
          from pg_catalog.pg_namespace
       """.as(PgNamespaceRow.rowParser(1).*)
  }
  override def selectById(oid: PgNamespaceId)(implicit c: Connection): Option[PgNamespaceRow] = {
    SQL"""select "oid", "nspname", "nspowner", "nspacl"
          from pg_catalog.pg_namespace
          where "oid" = ${ParameterValue(oid, null, PgNamespaceId.toStatement)}
       """.as(PgNamespaceRow.rowParser(1).singleOpt)
  }
  override def selectByIds(oids: Array[PgNamespaceId])(implicit c: Connection): List[PgNamespaceRow] = {
    SQL"""select "oid", "nspname", "nspowner", "nspacl"
          from pg_catalog.pg_namespace
          where "oid" = ANY(${oids})
       """.as(PgNamespaceRow.rowParser(1).*)
    
  }
  override def selectByUnique(nspname: String)(implicit c: Connection): Option[PgNamespaceRow] = {
    SQL"""select "nspname"
          from pg_catalog.pg_namespace
          where "nspname" = ${ParameterValue(nspname, null, ToStatement.stringToStatement)}
       """.as(PgNamespaceRow.rowParser(1).singleOpt)
    
  }
  override def update(row: PgNamespaceRow)(implicit c: Connection): Boolean = {
    val oid = row.oid
    SQL"""update pg_catalog.pg_namespace
          set "nspname" = ${ParameterValue(row.nspname, null, ToStatement.stringToStatement)}::name,
              "nspowner" = ${ParameterValue(row.nspowner, null, ToStatement.longToStatement)}::oid,
              "nspacl" = ${ParameterValue(row.nspacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, typo.generated.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem
          where "oid" = ${ParameterValue(oid, null, PgNamespaceId.toStatement)}
       """.executeUpdate() > 0
  }
  override def upsert(unsaved: PgNamespaceRow)(implicit c: Connection): PgNamespaceRow = {
    SQL"""insert into pg_catalog.pg_namespace("oid", "nspname", "nspowner", "nspacl")
          values (
            ${ParameterValue(unsaved.oid, null, PgNamespaceId.toStatement)}::oid,
            ${ParameterValue(unsaved.nspname, null, ToStatement.stringToStatement)}::name,
            ${ParameterValue(unsaved.nspowner, null, ToStatement.longToStatement)}::oid,
            ${ParameterValue(unsaved.nspacl, null, ToStatement.optionToStatement(TypoAclItem.arrayToStatement, typo.generated.arrayParameterMetaData(TypoAclItem.parameterMetadata)))}::_aclitem
          )
          on conflict ("oid")
          do update set
            "nspname" = EXCLUDED."nspname",
            "nspowner" = EXCLUDED."nspowner",
            "nspacl" = EXCLUDED."nspacl"
          returning "oid", "nspname", "nspowner", "nspacl"
       """
      .executeInsert(PgNamespaceRow.rowParser(1).single)
    
  }
}
