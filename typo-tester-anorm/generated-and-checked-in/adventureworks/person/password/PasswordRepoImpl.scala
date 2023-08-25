/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package password

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import anorm.ToStatement
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object PasswordRepoImpl extends PasswordRepo {
  override def delete(businessentityid: BusinessentityId)(implicit c: Connection): Boolean = {
    SQL"""delete from person."password" where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[PasswordFields, PasswordRow] = {
    DeleteBuilder("person.password", PasswordFields)
  }
  override def insert(unsaved: PasswordRow)(implicit c: Connection): PasswordRow = {
    SQL"""insert into person."password"(businessentityid, passwordhash, passwordsalt, rowguid, modifieddate)
          values (${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4, ${ParameterValue(unsaved.passwordhash, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.passwordsalt, null, ToStatement.stringToStatement)}, ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
       """
      .executeInsert(PasswordRow.rowParser(1).single)
    
  }
  override def insert(unsaved: PasswordRowUnsaved)(implicit c: Connection): PasswordRow = {
    val namedParameters = List(
      Some((NamedParameter("businessentityid", ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)), "::int4")),
      Some((NamedParameter("passwordhash", ParameterValue(unsaved.passwordhash, null, ToStatement.stringToStatement)), "")),
      Some((NamedParameter("passwordsalt", ParameterValue(unsaved.passwordsalt, null, ToStatement.stringToStatement)), "")),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("rowguid", ParameterValue(value, null, ToStatement.uuidToStatement)), "::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into person."password" default values
            returning businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
         """
        .executeInsert(PasswordRow.rowParser(1).single)
    } else {
      val q = s"""insert into person."password"(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(PasswordRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[PasswordFields, PasswordRow] = {
    SelectBuilderSql("person.password", PasswordFields, PasswordRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[PasswordRow] = {
    SQL"""select businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
          from person."password"
       """.as(PasswordRow.rowParser(1).*)
  }
  override def selectById(businessentityid: BusinessentityId)(implicit c: Connection): Option[PasswordRow] = {
    SQL"""select businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
          from person."password"
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.as(PasswordRow.rowParser(1).singleOpt)
  }
  override def selectByIds(businessentityids: Array[BusinessentityId])(implicit c: Connection): List[PasswordRow] = {
    SQL"""select businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
          from person."password"
          where businessentityid = ANY(${businessentityids})
       """.as(PasswordRow.rowParser(1).*)
    
  }
  override def update(row: PasswordRow)(implicit c: Connection): Boolean = {
    val businessentityid = row.businessentityid
    SQL"""update person."password"
          set passwordhash = ${ParameterValue(row.passwordhash, null, ToStatement.stringToStatement)},
              passwordsalt = ${ParameterValue(row.passwordsalt, null, ToStatement.stringToStatement)},
              rowguid = ${ParameterValue(row.rowguid, null, ToStatement.uuidToStatement)}::uuid,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where businessentityid = ${ParameterValue(businessentityid, null, BusinessentityId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[PasswordFields, PasswordRow] = {
    UpdateBuilder("person.password", PasswordFields, PasswordRow.rowParser)
  }
  override def upsert(unsaved: PasswordRow)(implicit c: Connection): PasswordRow = {
    SQL"""insert into person."password"(businessentityid, passwordhash, passwordsalt, rowguid, modifieddate)
          values (
            ${ParameterValue(unsaved.businessentityid, null, BusinessentityId.toStatement)}::int4,
            ${ParameterValue(unsaved.passwordhash, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.passwordsalt, null, ToStatement.stringToStatement)},
            ${ParameterValue(unsaved.rowguid, null, ToStatement.uuidToStatement)}::uuid,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (businessentityid)
          do update set
            passwordhash = EXCLUDED.passwordhash,
            passwordsalt = EXCLUDED.passwordsalt,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, passwordhash, passwordsalt, rowguid, modifieddate::text
       """
      .executeInsert(PasswordRow.rowParser(1).single)
    
  }
}
