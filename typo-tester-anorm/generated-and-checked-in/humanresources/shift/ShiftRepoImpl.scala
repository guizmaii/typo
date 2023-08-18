/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package shift

import adventureworks.Defaulted
import adventureworks.TypoLocalDateTime
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

object ShiftRepoImpl extends ShiftRepo {
  override def delete(shiftid: ShiftId)(implicit c: Connection): Boolean = {
    SQL"delete from humanresources.shift where shiftid = $shiftid".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[ShiftFields, ShiftRow] = {
    DeleteBuilder("humanresources.shift", ShiftFields)
  }
  override def insert(unsaved: ShiftRow)(implicit c: Connection): ShiftRow = {
    SQL"""insert into humanresources.shift(shiftid, "name", starttime, endtime, modifieddate)
          values (${unsaved.shiftid}::int4, ${unsaved.name}::"public"."Name", ${unsaved.starttime}::time, ${unsaved.endtime}::time, ${unsaved.modifieddate}::timestamp)
          returning shiftid, "name", starttime::text, endtime::text, modifieddate::text
       """
      .executeInsert(ShiftRow.rowParser(1).single)
    
  }
  override def insert(unsaved: ShiftRowUnsaved)(implicit c: Connection): ShiftRow = {
    val namedParameters = List(
      Some((NamedParameter("name", ParameterValue.from(unsaved.name)), """::"public"."Name"""")),
      Some((NamedParameter("starttime", ParameterValue.from(unsaved.starttime)), "::time")),
      Some((NamedParameter("endtime", ParameterValue.from(unsaved.endtime)), "::time")),
      unsaved.shiftid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("shiftid", ParameterValue.from[ShiftId](value)), "::int4"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue.from[TypoLocalDateTime](value)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into humanresources.shift default values
            returning shiftid, "name", starttime::text, endtime::text, modifieddate::text
         """
        .executeInsert(ShiftRow.rowParser(1).single)
    } else {
      val q = s"""insert into humanresources.shift(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning shiftid, "name", starttime::text, endtime::text, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(ShiftRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[ShiftFields, ShiftRow] = {
    SelectBuilderSql("humanresources.shift", ShiftFields, ShiftRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[ShiftRow] = {
    SQL"""select shiftid, "name", starttime::text, endtime::text, modifieddate::text
          from humanresources.shift
       """.as(ShiftRow.rowParser(1).*)
  }
  override def selectById(shiftid: ShiftId)(implicit c: Connection): Option[ShiftRow] = {
    SQL"""select shiftid, "name", starttime::text, endtime::text, modifieddate::text
          from humanresources.shift
          where shiftid = $shiftid
       """.as(ShiftRow.rowParser(1).singleOpt)
  }
  override def selectByIds(shiftids: Array[ShiftId])(implicit c: Connection): List[ShiftRow] = {
    SQL"""select shiftid, "name", starttime::text, endtime::text, modifieddate::text
          from humanresources.shift
          where shiftid = ANY($shiftids)
       """.as(ShiftRow.rowParser(1).*)
    
  }
  override def update(row: ShiftRow)(implicit c: Connection): Boolean = {
    val shiftid = row.shiftid
    SQL"""update humanresources.shift
          set "name" = ${row.name}::"public"."Name",
              starttime = ${row.starttime}::time,
              endtime = ${row.endtime}::time,
              modifieddate = ${row.modifieddate}::timestamp
          where shiftid = $shiftid
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[ShiftFields, ShiftRow] = {
    UpdateBuilder("humanresources.shift", ShiftFields, ShiftRow.rowParser)
  }
  override def upsert(unsaved: ShiftRow)(implicit c: Connection): ShiftRow = {
    SQL"""insert into humanresources.shift(shiftid, "name", starttime, endtime, modifieddate)
          values (
            ${unsaved.shiftid}::int4,
            ${unsaved.name}::"public"."Name",
            ${unsaved.starttime}::time,
            ${unsaved.endtime}::time,
            ${unsaved.modifieddate}::timestamp
          )
          on conflict (shiftid)
          do update set
            "name" = EXCLUDED."name",
            starttime = EXCLUDED.starttime,
            endtime = EXCLUDED.endtime,
            modifieddate = EXCLUDED.modifieddate
          returning shiftid, "name", starttime::text, endtime::text, modifieddate::text
       """
      .executeInsert(ShiftRow.rowParser(1).single)
    
  }
}
