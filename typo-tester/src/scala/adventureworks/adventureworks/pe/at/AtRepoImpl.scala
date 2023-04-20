/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package at

import adventureworks.person.addresstype.AddresstypeId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object AtRepoImpl extends AtRepo {
  override def selectAll(implicit c: Connection): List[AtRow] = {
    SQL"""select id, addresstypeid, name, rowguid, modifieddate
          from pe.at
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[AtFieldOrIdValue[_]])(implicit c: Connection): List[AtRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case AtFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case AtFieldValue.addresstypeid(value) => NamedParameter("addresstypeid", ParameterValue.from(value))
          case AtFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case AtFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case AtFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select *
                    from pe.at
                    where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[AtRow] =
    RowParser[AtRow] { row =>
      Success(
        AtRow(
          id = row[Option[Int]]("id"),
          addresstypeid = row[Option[AddresstypeId]]("addresstypeid"),
          name = row[Option[Name]]("name"),
          rowguid = row[Option[UUID]]("rowguid"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
