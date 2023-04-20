/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package l

import adventureworks.production.location.LocationId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime

object LRepoImpl extends LRepo {
  override def selectAll(implicit c: Connection): List[LRow] = {
    SQL"""select id, locationid, name, costrate, availability, modifieddate
          from pr.l
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[LFieldOrIdValue[_]])(implicit c: Connection): List[LRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case LFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case LFieldValue.locationid(value) => NamedParameter("locationid", ParameterValue.from(value))
          case LFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case LFieldValue.costrate(value) => NamedParameter("costrate", ParameterValue.from(value))
          case LFieldValue.availability(value) => NamedParameter("availability", ParameterValue.from(value))
          case LFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from pr.l
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[LRow] =
    RowParser[LRow] { row =>
      Success(
        LRow(
          id = row[Option[Int]]("id"),
          locationid = row[Option[LocationId]]("locationid"),
          name = row[Option[Name]]("name"),
          costrate = row[Option[BigDecimal]]("costrate"),
          availability = row[Option[BigDecimal]]("availability"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
