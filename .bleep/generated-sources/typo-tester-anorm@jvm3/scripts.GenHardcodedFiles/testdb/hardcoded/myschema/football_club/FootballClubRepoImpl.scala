/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package hardcoded
package myschema
package football_club

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

object FootballClubRepoImpl extends FootballClubRepo {
  override def delete(id: FootballClubId)(implicit c: Connection): Boolean = {
    SQL"""delete from myschema.football_club where "id" = $id""".executeUpdate() > 0
  }
  override def delete: DeleteBuilder[FootballClubFields, FootballClubRow] = {
    DeleteBuilder("myschema.football_club", FootballClubFields)
  }
  override def insert(unsaved: FootballClubRow)(implicit c: Connection): FootballClubRow = {
    SQL"""insert into myschema.football_club("id", "name")
          values (${unsaved.id}::int8, ${unsaved.name})
          returning "id", "name"
       """
      .executeInsert(FootballClubRow.rowParser(1).single)
    
  }
  override def select: SelectBuilder[FootballClubFields, FootballClubRow] = {
    SelectBuilderSql("myschema.football_club", FootballClubFields, FootballClubRow.rowParser)
  }
  override def selectAll(implicit c: Connection): List[FootballClubRow] = {
    SQL"""select "id", "name"
          from myschema.football_club
       """.as(FootballClubRow.rowParser(1).*)
  }
  override def selectById(id: FootballClubId)(implicit c: Connection): Option[FootballClubRow] = {
    SQL"""select "id", "name"
          from myschema.football_club
          where "id" = $id
       """.as(FootballClubRow.rowParser(1).singleOpt)
  }
  override def selectByIds(ids: Array[FootballClubId])(implicit c: Connection): List[FootballClubRow] = {
    SQL"""select "id", "name"
          from myschema.football_club
          where "id" = ANY($ids)
       """.as(FootballClubRow.rowParser(1).*)
    
  }
  override def selectByFieldValues(fieldValues: List[FootballClubFieldOrIdValue[?]])(implicit c: Connection): List[FootballClubRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParameters = nonEmpty.map{
          case FootballClubFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case FootballClubFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select "id", "name"
                    from myschema.football_club
                    where ${namedParameters.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        SimpleSql(SQL(q), namedParameters.map(_.tupled).toMap, RowParser.successful)
          .as(FootballClubRow.rowParser(1).*)
    }
    
  }
  override def update(row: FootballClubRow)(implicit c: Connection): Boolean = {
    val id = row.id
    SQL"""update myschema.football_club
          set "name" = ${row.name}
          where "id" = $id
       """.executeUpdate() > 0
  }
  override def update: UpdateBuilder[FootballClubFields, FootballClubRow] = {
    UpdateBuilder("myschema.football_club", FootballClubFields, FootballClubRow.rowParser)
  }
  override def updateFieldValues(id: FootballClubId, fieldValues: List[FootballClubFieldValue[?]])(implicit c: Connection): Boolean = {
    fieldValues match {
      case Nil => false
      case nonEmpty =>
        val namedParameters = nonEmpty.map{
          case FootballClubFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""update myschema.football_club
                    set ${namedParameters.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(", ")}
                    where "id" = {id}
                 """
        SimpleSql(SQL(q), namedParameters.map(_.tupled).toMap ++ List(("id", ParameterValue.from(id))), RowParser.successful)
          .executeUpdate() > 0
    }
    
  }
  override def upsert(unsaved: FootballClubRow)(implicit c: Connection): FootballClubRow = {
    SQL"""insert into myschema.football_club("id", "name")
          values (
            ${unsaved.id}::int8,
            ${unsaved.name}
          )
          on conflict ("id")
          do update set
            "name" = EXCLUDED."name"
          returning "id", "name"
       """
      .executeInsert(FootballClubRow.rowParser(1).single)
    
  }
}
