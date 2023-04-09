/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package a

import adventureworks.person.address.AddressId
import adventureworks.person.stateprovince.StateprovinceId
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection
import java.time.LocalDateTime
import java.util.UUID

object ARepoImpl extends ARepo {
  override def selectAll(implicit c: Connection): List[ARow] = {
    SQL"""select id, addressid, addressline1, addressline2, city, stateprovinceid, postalcode, spatiallocation, rowguid, modifieddate from pe.a""".as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[AFieldOrIdValue[_]])(implicit c: Connection): List[ARow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case AFieldValue.id(value) => NamedParameter("id", ParameterValue.from(value))
          case AFieldValue.addressid(value) => NamedParameter("addressid", ParameterValue.from(value))
          case AFieldValue.addressline1(value) => NamedParameter("addressline1", ParameterValue.from(value))
          case AFieldValue.addressline2(value) => NamedParameter("addressline2", ParameterValue.from(value))
          case AFieldValue.city(value) => NamedParameter("city", ParameterValue.from(value))
          case AFieldValue.stateprovinceid(value) => NamedParameter("stateprovinceid", ParameterValue.from(value))
          case AFieldValue.postalcode(value) => NamedParameter("postalcode", ParameterValue.from(value))
          case AFieldValue.spatiallocation(value) => NamedParameter("spatiallocation", ParameterValue.from(value))
          case AFieldValue.rowguid(value) => NamedParameter("rowguid", ParameterValue.from(value))
          case AFieldValue.modifieddate(value) => NamedParameter("modifieddate", ParameterValue.from(value))
        }
        val q = s"""select * from pe.a where ${namedParams.map(x => s"${x.name} = {${x.name}}").mkString(" AND ")}"""
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[ARow] =
    RowParser[ARow] { row =>
      Success(
        ARow(
          id = row[Option[Int]]("id"),
          addressid = row[Option[AddressId]]("addressid"),
          addressline1 = row[Option[String]]("addressline1"),
          addressline2 = row[Option[String]]("addressline2"),
          city = row[Option[String]]("city"),
          stateprovinceid = row[Option[StateprovinceId]]("stateprovinceid"),
          postalcode = row[Option[String]]("postalcode"),
          spatiallocation = row[Option[Byte]]("spatiallocation"),
          rowguid = row[Option[UUID]]("rowguid"),
          modifieddate = row[Option[LocalDateTime]]("modifieddate")
        )
      )
    }
}
