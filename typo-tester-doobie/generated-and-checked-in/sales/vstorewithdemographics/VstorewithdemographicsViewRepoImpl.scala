/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package vstorewithdemographics

import adventureworks.TypoMoney
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.Name
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import doobie.util.fragments
import fs2.Stream
import java.sql.ResultSet

object VstorewithdemographicsViewRepoImpl extends VstorewithdemographicsViewRepo {
  override def selectAll: Stream[ConnectionIO, VstorewithdemographicsViewRow] = {
    sql"""select businessentityid, "name", AnnualSales, AnnualRevenue, BankName, BusinessType, YearOpened, Specialty, SquareFeet, Brands, Internet, NumberEmployees from sales.vstorewithdemographics""".query[VstorewithdemographicsViewRow].stream
  }
  override def selectByFieldValues(fieldValues: List[VstorewithdemographicsViewFieldOrIdValue[_]]): Stream[ConnectionIO, VstorewithdemographicsViewRow] = {
    val where = fragments.whereAnd(
      fieldValues.map {
        case VstorewithdemographicsViewFieldValue.businessentityid(value) => fr"businessentityid = $value"
        case VstorewithdemographicsViewFieldValue.name(value) => fr""""name" = $value"""
        case VstorewithdemographicsViewFieldValue.AnnualSales(value) => fr"AnnualSales = $value"
        case VstorewithdemographicsViewFieldValue.AnnualRevenue(value) => fr"AnnualRevenue = $value"
        case VstorewithdemographicsViewFieldValue.BankName(value) => fr"BankName = $value"
        case VstorewithdemographicsViewFieldValue.BusinessType(value) => fr"BusinessType = $value"
        case VstorewithdemographicsViewFieldValue.YearOpened(value) => fr"YearOpened = $value"
        case VstorewithdemographicsViewFieldValue.Specialty(value) => fr"Specialty = $value"
        case VstorewithdemographicsViewFieldValue.SquareFeet(value) => fr"SquareFeet = $value"
        case VstorewithdemographicsViewFieldValue.Brands(value) => fr"Brands = $value"
        case VstorewithdemographicsViewFieldValue.Internet(value) => fr"Internet = $value"
        case VstorewithdemographicsViewFieldValue.NumberEmployees(value) => fr"NumberEmployees = $value"
      } :_*
    )
    sql"select * from sales.vstorewithdemographics $where".query[VstorewithdemographicsViewRow].stream
  
  }
  implicit val read: Read[VstorewithdemographicsViewRow] =
    new Read[VstorewithdemographicsViewRow](
      gets = List(
        (Get[BusinessentityId], Nullability.Nullable),
        (Get[Name], Nullability.Nullable),
        (Get[TypoMoney], Nullability.Nullable),
        (Get[TypoMoney], Nullability.Nullable),
        (Get[/* max 50 chars */ String], Nullability.Nullable),
        (Get[/* max 5 chars */ String], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[/* max 50 chars */ String], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[/* max 30 chars */ String], Nullability.Nullable),
        (Get[/* max 30 chars */ String], Nullability.Nullable),
        (Get[Int], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => VstorewithdemographicsViewRow(
        businessentityid = Get[BusinessentityId].unsafeGetNullable(rs, i + 0),
        name = Get[Name].unsafeGetNullable(rs, i + 1),
        AnnualSales = Get[TypoMoney].unsafeGetNullable(rs, i + 2),
        AnnualRevenue = Get[TypoMoney].unsafeGetNullable(rs, i + 3),
        BankName = Get[/* max 50 chars */ String].unsafeGetNullable(rs, i + 4),
        BusinessType = Get[/* max 5 chars */ String].unsafeGetNullable(rs, i + 5),
        YearOpened = Get[Int].unsafeGetNullable(rs, i + 6),
        Specialty = Get[/* max 50 chars */ String].unsafeGetNullable(rs, i + 7),
        SquareFeet = Get[Int].unsafeGetNullable(rs, i + 8),
        Brands = Get[/* max 30 chars */ String].unsafeGetNullable(rs, i + 9),
        Internet = Get[/* max 30 chars */ String].unsafeGetNullable(rs, i + 10),
        NumberEmployees = Get[Int].unsafeGetNullable(rs, i + 11)
      )
    )
  

}
