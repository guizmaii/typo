/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package e

import adventureworks.person.businessentity.BusinessentityId
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import doobie.free.connection.ConnectionIO
import doobie.syntax.string.toSqlInterpolator
import doobie.util.fragments
import fs2.Stream
import java.sql.ResultSet
import java.time.LocalDateTime
import java.util.UUID

object EViewRepoImpl extends EViewRepo {
  override def selectAll: Stream[ConnectionIO, EViewRow] = {
    sql"""select "id", businessentityid, emailaddressid, emailaddress, rowguid, modifieddate from pe.e""".query[EViewRow].stream
  }
  override def selectByFieldValues(fieldValues: List[EViewFieldOrIdValue[_]]): Stream[ConnectionIO, EViewRow] = {
    val where = fragments.whereAnd(
      fieldValues.map {
        case EViewFieldValue.id(value) => fr""""id" = $value"""
        case EViewFieldValue.businessentityid(value) => fr"businessentityid = $value"
        case EViewFieldValue.emailaddressid(value) => fr"emailaddressid = $value"
        case EViewFieldValue.emailaddress(value) => fr"emailaddress = $value"
        case EViewFieldValue.rowguid(value) => fr"rowguid = $value"
        case EViewFieldValue.modifieddate(value) => fr"modifieddate = $value"
      } :_*
    )
    sql"select * from pe.e $where".query[EViewRow].stream
  
  }
  implicit val read: Read[EViewRow] =
    new Read[EViewRow](
      gets = List(
        (Get[Int], Nullability.Nullable),
        (Get[BusinessentityId], Nullability.Nullable),
        (Get[Int], Nullability.Nullable),
        (Get[/* max 50 chars */ String], Nullability.Nullable),
        (Get[UUID], Nullability.Nullable),
        (Get[LocalDateTime], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => EViewRow(
        id = Get[Int].unsafeGetNullable(rs, i + 0),
        businessentityid = Get[BusinessentityId].unsafeGetNullable(rs, i + 1),
        emailaddressid = Get[Int].unsafeGetNullable(rs, i + 2),
        emailaddress = Get[/* max 50 chars */ String].unsafeGetNullable(rs, i + 3),
        rowguid = Get[UUID].unsafeGetNullable(rs, i + 4),
        modifieddate = Get[LocalDateTime].unsafeGetNullable(rs, i + 5)
      )
    )
  

}
