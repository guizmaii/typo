/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package st

import adventureworks.person.countryregion.CountryregionId
import adventureworks.public.Name
import adventureworks.sales.salesterritory.SalesterritoryId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object StViewRepoImpl extends StViewRepo {
  override def selectAll(implicit c: Connection): List[StViewRow] = {
    SQL"""select "id", territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
          from sa.st
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[StViewFieldOrIdValue[_]])(implicit c: Connection): List[StViewRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case StViewFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case StViewFieldValue.territoryid(value) => NamedParameter("territoryid", ParameterValue.from(value))
          case StViewFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case StViewFieldValue.countryregioncode(value) => NamedParameter("countryregioncode", ParameterValue.from(value))
          case StViewFieldValue.group(value) => NamedParameter("group", ParameterValue.from(value))
          case StViewFieldValue.salesytd(value) => NamedParameter("salesytd", ParameterValue.from(value))
          case StViewFieldValue.saleslastyear(value) => NamedParameter("saleslastyear", ParameterValue.from(value))
          case StViewFieldValue.costytd(value) => NamedParameter("costytd", ParameterValue.from(value))
          case StViewFieldValue.costlastyear(value) => NamedParameter("costlastyear", ParameterValue.from(value))
          case StViewFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case StViewFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select "id", territoryid, "name", countryregioncode, "group", salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate
                    from sa.st
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[StViewRow] =
    RowParser[StViewRow] { row =>
      Success(
        StViewRow(
          id = row[Option[Int]]("id"),
          territoryid = row[Option[SalesterritoryId]]("territoryid"),
          name = row[Option[Name]]("name"),
          countryregioncode = row[Option[CountryregionId]]("countryregioncode"),
          group = row[Option[/* max 50 chars */ String]]("group"),
          salesytd = row[Option[BigDecimal]]("salesytd"),
          saleslastyear = row[Option[BigDecimal]]("saleslastyear"),
          costytd = row[Option[BigDecimal]]("costytd"),
          costlastyear = row[Option[BigDecimal]]("costlastyear"),
          rowguid = row[Option[UUID]]("rowguid"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
