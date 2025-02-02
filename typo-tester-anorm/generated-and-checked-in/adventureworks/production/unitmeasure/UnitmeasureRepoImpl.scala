/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

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

object UnitmeasureRepoImpl extends UnitmeasureRepo {
  override def delete(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Boolean = {
    SQL"""delete from production.unitmeasure where "unitmeasurecode" = ${ParameterValue(unitmeasurecode, null, UnitmeasureId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[UnitmeasureFields, UnitmeasureRow] = {
    DeleteBuilder("production.unitmeasure", UnitmeasureFields)
  }
  override def insert(unsaved: UnitmeasureRow)(implicit c: Connection): UnitmeasureRow = {
    SQL"""insert into production.unitmeasure("unitmeasurecode", "name", "modifieddate")
          values (${ParameterValue(unsaved.unitmeasurecode, null, UnitmeasureId.toStatement)}::bpchar, ${ParameterValue(unsaved.name, null, Name.toStatement)}::varchar, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning "unitmeasurecode", "name", "modifieddate"::text
       """
      .executeInsert(UnitmeasureRow.rowParser(1).single)
    
  }
  override def insert(unsaved: UnitmeasureRowUnsaved)(implicit c: Connection): UnitmeasureRow = {
    val namedParameters = List(
      Some((NamedParameter("unitmeasurecode", ParameterValue(unsaved.unitmeasurecode, null, UnitmeasureId.toStatement)), "::bpchar")),
      Some((NamedParameter("name", ParameterValue(unsaved.name, null, Name.toStatement)), "::varchar")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production.unitmeasure default values
            returning "unitmeasurecode", "name", "modifieddate"::text
         """
        .executeInsert(UnitmeasureRow.rowParser(1).single)
    } else {
      val q = s"""insert into production.unitmeasure(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning "unitmeasurecode", "name", "modifieddate"::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(UnitmeasureRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[UnitmeasureFields, UnitmeasureRow] = {
    SelectBuilderSql("production.unitmeasure", UnitmeasureFields, UnitmeasureRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[UnitmeasureRow] = {
    SQL"""select "unitmeasurecode", "name", "modifieddate"::text
          from production.unitmeasure
       """.as(UnitmeasureRow.rowParser(1).*)
  }
  override def selectById(unitmeasurecode: UnitmeasureId)(implicit c: Connection): Option[UnitmeasureRow] = {
    SQL"""select "unitmeasurecode", "name", "modifieddate"::text
          from production.unitmeasure
          where "unitmeasurecode" = ${ParameterValue(unitmeasurecode, null, UnitmeasureId.toStatement)}
       """.as(UnitmeasureRow.rowParser(1).singleOpt)
  }
  override def selectByIds(unitmeasurecodes: Array[UnitmeasureId])(implicit c: Connection): List[UnitmeasureRow] = {
    SQL"""select "unitmeasurecode", "name", "modifieddate"::text
          from production.unitmeasure
          where "unitmeasurecode" = ANY(${unitmeasurecodes})
       """.as(UnitmeasureRow.rowParser(1).*)
    
  }
  override def update(row: UnitmeasureRow)(implicit c: Connection): Boolean = {
    val unitmeasurecode = row.unitmeasurecode
    SQL"""update production.unitmeasure
          set "name" = ${ParameterValue(row.name, null, Name.toStatement)}::varchar,
              "modifieddate" = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where "unitmeasurecode" = ${ParameterValue(unitmeasurecode, null, UnitmeasureId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[UnitmeasureFields, UnitmeasureRow] = {
    UpdateBuilder("production.unitmeasure", UnitmeasureFields, UnitmeasureRow.rowParser)
  }
  override def upsert(unsaved: UnitmeasureRow)(implicit c: Connection): UnitmeasureRow = {
    SQL"""insert into production.unitmeasure("unitmeasurecode", "name", "modifieddate")
          values (
            ${ParameterValue(unsaved.unitmeasurecode, null, UnitmeasureId.toStatement)}::bpchar,
            ${ParameterValue(unsaved.name, null, Name.toStatement)}::varchar,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict ("unitmeasurecode")
          do update set
            "name" = EXCLUDED."name",
            "modifieddate" = EXCLUDED."modifieddate"
          returning "unitmeasurecode", "name", "modifieddate"::text
       """
      .executeInsert(UnitmeasureRow.rowParser(1).single)
    
  }
}
