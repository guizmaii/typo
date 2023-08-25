/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package location

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
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

object LocationRepoImpl extends LocationRepo {
  override def delete(locationid: LocationId)(implicit c: Connection): Boolean = {
    SQL"""delete from production."location" where locationid = ${ParameterValue(locationid, null, LocationId.toStatement)}""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[LocationFields, LocationRow] = {
    DeleteBuilder("production.location", LocationFields)
  }
  override def insert(unsaved: LocationRow)(implicit c: Connection): LocationRow = {
    SQL"""insert into production."location"(locationid, "name", costrate, availability, modifieddate)
          values (${ParameterValue(unsaved.locationid, null, LocationId.toStatement)}::int4, ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name", ${ParameterValue(unsaved.costrate, null, ToStatement.scalaBigDecimalToStatement)}::numeric, ${ParameterValue(unsaved.availability, null, ToStatement.scalaBigDecimalToStatement)}::numeric, ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp)
          returning locationid, "name", costrate, availability, modifieddate::text
       """
      .executeInsert(LocationRow.rowParser(1).single)
    
  }
  override def insert(unsaved: LocationRowUnsaved)(implicit c: Connection): LocationRow = {
    val namedParameters = List(
      Some((NamedParameter("name", ParameterValue(unsaved.name, null, Name.toStatement)), """::"public"."Name"""")),
      unsaved.locationid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("locationid", ParameterValue(value, null, LocationId.toStatement)), "::int4"))
      },
      unsaved.costrate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("costrate", ParameterValue(value, null, ToStatement.scalaBigDecimalToStatement)), "::numeric"))
      },
      unsaved.availability match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("availability", ParameterValue(value, null, ToStatement.scalaBigDecimalToStatement)), "::numeric"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((NamedParameter("modifieddate", ParameterValue(value, null, TypoLocalDateTime.toStatement)), "::timestamp"))
      }
    ).flatten
    val quote = '"'.toString
    if (namedParameters.isEmpty) {
      SQL"""insert into production."location" default values
            returning locationid, "name", costrate, availability, modifieddate::text
         """
        .executeInsert(LocationRow.rowParser(1).single)
    } else {
      val q = s"""insert into production."location"(${namedParameters.map{case (x, _) => quote + x.name + quote}.mkString(", ")})
                  values (${namedParameters.map{ case (np, cast) => s"{${np.name}}$cast"}.mkString(", ")})
                  returning locationid, "name", costrate, availability, modifieddate::text
               """
      SimpleSql(SQL(q), namedParameters.map { case (np, _) => np.tupled }.toMap, RowParser.successful)
        .executeInsert(LocationRow.rowParser(1).single)
    }
    
  }
  override def select: SelectBuilder[LocationFields, LocationRow] = {
    SelectBuilderSql("production.location", LocationFields, LocationRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[LocationRow] = {
    SQL"""select locationid, "name", costrate, availability, modifieddate::text
          from production."location"
       """.as(LocationRow.rowParser(1).*)
  }
  override def selectById(locationid: LocationId)(implicit c: Connection): Option[LocationRow] = {
    SQL"""select locationid, "name", costrate, availability, modifieddate::text
          from production."location"
          where locationid = ${ParameterValue(locationid, null, LocationId.toStatement)}
       """.as(LocationRow.rowParser(1).singleOpt)
  }
  override def selectByIds(locationids: Array[LocationId])(implicit c: Connection): List[LocationRow] = {
    SQL"""select locationid, "name", costrate, availability, modifieddate::text
          from production."location"
          where locationid = ANY(${locationids})
       """.as(LocationRow.rowParser(1).*)
    
  }
  override def update(row: LocationRow)(implicit c: Connection): Boolean = {
    val locationid = row.locationid
    SQL"""update production."location"
          set "name" = ${ParameterValue(row.name, null, Name.toStatement)}::"public"."Name",
              costrate = ${ParameterValue(row.costrate, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
              availability = ${ParameterValue(row.availability, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
              modifieddate = ${ParameterValue(row.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          where locationid = ${ParameterValue(locationid, null, LocationId.toStatement)}
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[LocationFields, LocationRow] = {
    UpdateBuilder("production.location", LocationFields, LocationRow.rowParser)
  }
  override def upsert(unsaved: LocationRow)(implicit c: Connection): LocationRow = {
    SQL"""insert into production."location"(locationid, "name", costrate, availability, modifieddate)
          values (
            ${ParameterValue(unsaved.locationid, null, LocationId.toStatement)}::int4,
            ${ParameterValue(unsaved.name, null, Name.toStatement)}::"public"."Name",
            ${ParameterValue(unsaved.costrate, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
            ${ParameterValue(unsaved.availability, null, ToStatement.scalaBigDecimalToStatement)}::numeric,
            ${ParameterValue(unsaved.modifieddate, null, TypoLocalDateTime.toStatement)}::timestamp
          )
          on conflict (locationid)
          do update set
            "name" = EXCLUDED."name",
            costrate = EXCLUDED.costrate,
            availability = EXCLUDED.availability,
            modifieddate = EXCLUDED.modifieddate
          returning locationid, "name", costrate, availability, modifieddate::text
       """
      .executeInsert(LocationRow.rowParser(1).single)
    
  }
}
