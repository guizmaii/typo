/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vvendorwithaddresses

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import anorm.NamedParameter
import anorm.ParameterValue
import anorm.RowParser
import anorm.SqlStringInterpolation
import anorm.Success
import java.sql.Connection

object VvendorwithaddressesViewRepoImpl extends VvendorwithaddressesViewRepo {
  override def selectAll(implicit c: Connection): List[VvendorwithaddressesViewRow] = {
    SQL"""select businessentityid, "name", addresstype, addressline1, addressline2, city, stateprovincename, postalcode, countryregionname
          from purchasing.vvendorwithaddresses
       """.as(rowParser.*)
  }
  override def selectByFieldValues(fieldValues: List[VvendorwithaddressesViewFieldOrIdValue[_]])(implicit c: Connection): List[VvendorwithaddressesViewRow] = {
    fieldValues match {
      case Nil => selectAll
      case nonEmpty =>
        val namedParams = nonEmpty.map{
          case VvendorwithaddressesViewFieldValue.businessentityid(value) => NamedParameter("businessentityid", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.name(value) => NamedParameter("name", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.addresstype(value) => NamedParameter("addresstype", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.addressline1(value) => NamedParameter("addressline1", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.addressline2(value) => NamedParameter("addressline2", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.city(value) => NamedParameter("city", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.stateprovincename(value) => NamedParameter("stateprovincename", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.postalcode(value) => NamedParameter("postalcode", ParameterValue.from(value))
          case VvendorwithaddressesViewFieldValue.countryregionname(value) => NamedParameter("countryregionname", ParameterValue.from(value))
        }
        val quote = '"'.toString
        val q = s"""select businessentityid, "name", addresstype, addressline1, addressline2, city, stateprovincename, postalcode, countryregionname
                    from purchasing.vvendorwithaddresses
                    where ${namedParams.map(x => s"$quote${x.name}$quote = {${x.name}}").mkString(" AND ")}
                 """
        // this line is here to include an extension method which is only needed for scala 3. no import is emitted for `SQL` to avoid warning for scala 2
        import anorm._
        SQL(q)
          .on(namedParams: _*)
          .as(rowParser.*)
    }
  
  }
  val rowParser: RowParser[VvendorwithaddressesViewRow] =
    RowParser[VvendorwithaddressesViewRow] { row =>
      Success(
        VvendorwithaddressesViewRow(
          businessentityid = row[Option[BusinessentityId]]("businessentityid"),
          name = row[Option[Name]]("name"),
          addresstype = row[Option[Name]]("addresstype"),
          addressline1 = row[Option[/* max 60 chars */ String]]("addressline1"),
          addressline2 = row[Option[/* max 60 chars */ String]]("addressline2"),
          city = row[Option[/* max 30 chars */ String]]("city"),
          stateprovincename = row[Option[Name]]("stateprovincename"),
          postalcode = row[Option[/* max 15 chars */ String]]("postalcode"),
          countryregionname = row[Option[Name]]("countryregionname")
        )
      )
    }
}
