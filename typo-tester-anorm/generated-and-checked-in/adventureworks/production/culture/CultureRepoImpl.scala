/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package culture

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SQL
import anorm.SimpleSql
import anorm.SqlStringInterpolation
import java.sql.Connection
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object CultureRepoImpl extends CultureRepo {
  override def delete(cultureid: CultureId)(implicit c: Connection): Boolean = {
    SQL"""delete from production.culture where "cultureid" = ${ParameterValue(cultureid, null, CultureId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[CultureFields, CultureRow] = {
    DeleteBuilder("production.culture", CultureFields)
  }
  override def insert(unsaved: CultureRow)(implicit c: Connection): CultureRow = {
    SQL"""insert into production.culture("cultureid", "name", "modifieddate")
          values (${ParameterValue(unsaved.cultureid, null, CultureId.toStatement)}::bpchar, ${ParameterValue(unsaved.name, null, Name.toStatement)}::varchar, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning "cultureid", "name", "modifieddate"::text
       """
      .executeInsert(CultureRow.rowParser(1).single)
    
  }
  override def insert(unsaved: CultureRowUnsaved)(implicit c: Connection): CultureRow = {
    val namedParameters = List(
      Some((NamedParameter("cultureid", ParameterValue(unsaved.cultureid, null, CultureId.toStatement)), "::bpchar")),
      Some((NamedParameter("name", ParameterValue(unsaved.name, null, Name.toStatement)), "::varchar")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.culture default values
            returning "cultureid", "name", "modifieddate"::text
         """
        .executeInsert(CultureRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.culture(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning "cultureid", "name", "modifieddate"::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(CultureRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[CultureFields, CultureRow] = {
    SelectBuilderSql("production.culture", CultureFields, CultureRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[CultureRow] = {
    SQL"""select "cultureid", "name", "modifieddate"::text
          from production.culture
       """.as(CultureRow.rowParser(1).*)
  }
  override def selectById(cultureid: CultureId)(implicit c: Connection): Option[CultureRow] = {
    SQL"""select "cultureid", "name", "modifieddate"::text
          from production.culture
          where "cultureid" = ${ParameterValue(cultureid, null, CultureId.toStatement)}
       """.as(CultureRow.rowParser(1).singleOpt)
  }
  override def selectByIds(cultureids: Array[CultureId])(implicit c: Connection): List[CultureRow] = {
    SQL"""select "cultureid", "name", "modifieddate"::text
          from production.culture
          where "cultureid" = ANY(${cultureids})
       """.as(CultureRow.rowParser(1).*)
    
  }
  override def update(row: CultureRow)(implicit c: Connection): Boolean = {
    val cultureid = row.cultureid
    SQL"""update production.culture
          set "name" = ${ParameterValue(row.name, null, Name.toStatement)}::varchar,
              "modifieddate" = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where "cultureid" = ${ParameterValue(cultureid, null, CultureId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[CultureFields, CultureRow] = {
    UpdateBuilder("production.culture", CultureFields, CultureRow.rowParser)
  }
  override def upsert(unsaved: CultureRow)(implicit c: Connection): CultureRow = {
    SQL"""insert into production.culture("cultureid", "name", "modifieddate")
          values (
            ${ParameterValue(unsaved.cultureid, null, CultureId.toStatement)}::bpchar,
            ${ParameterValue(unsaved.name, null, Name.toStatement)}::varchar,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict ("cultureid")
          do update set
            "name" = EXCLUDED."name",
            "modifieddate" = EXCLUDED."modifieddate"
          returning "cultureid", "name", "modifieddate"::text
       """
      .executeInsert(CultureRow.rowParser(1).single)
    
  }
}
