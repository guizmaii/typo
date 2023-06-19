/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package emailaddress

import adventureworks.Defaulted
import adventureworks.person.businessentity.BusinessentityId
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import doobie.free.connection.ConnectionIO
import doobie.free.connection.pure
import doobie.syntax.string.toSqlInterpolator
import doobie.util.fragment.Fragment
import doobie.util.fragments
import fs2.Stream
import java.sql.ResultSet
import java.time.LocalDateTime
import java.util.UUID

object EmailaddressRepoImpl extends EmailaddressRepo {
  override def delete(compositeId: EmailaddressId): ConnectionIO[Boolean] = {
    sql"delete from person.emailaddress where businessentityid = ${compositeId.businessentityid} AND emailaddressid = ${compositeId.emailaddressid}".update.run.map(_ > 0)
  }
  override def insert(unsaved: EmailaddressRow): ConnectionIO[EmailaddressRow] = {
    sql"""insert into person.emailaddress(businessentityid, emailaddressid, emailaddress, rowguid, modifieddate)
          values (${unsaved.businessentityid}::int4, ${unsaved.emailaddressid}::int4, ${unsaved.emailaddress}, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning businessentityid, emailaddressid, emailaddress, rowguid, modifieddate
       """.query.unique
  }
  override def insert(unsaved: EmailaddressRowUnsaved): ConnectionIO[EmailaddressRow] = {
    val fs = List(
      Some((Fragment.const(s"businessentityid"), fr"${unsaved.businessentityid}::int4")),
      Some((Fragment.const(s"emailaddress"), fr"${unsaved.emailaddress}")),
      unsaved.emailaddressid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"emailaddressid"), fr"${value: Int}::int4"))
      },
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"rowguid"), fr"${value: UUID}::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${value: LocalDateTime}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into person.emailaddress default values
            returning businessentityid, emailaddressid, emailaddress, rowguid, modifieddate
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into person.emailaddress(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning businessentityid, emailaddressid, emailaddress, rowguid, modifieddate
         """
    }
    q.query.unique
  
  }
  override def selectAll: Stream[ConnectionIO, EmailaddressRow] = {
    sql"select businessentityid, emailaddressid, emailaddress, rowguid, modifieddate from person.emailaddress".query[EmailaddressRow].stream
  }
  override def selectByFieldValues(fieldValues: List[EmailaddressFieldOrIdValue[_]]): Stream[ConnectionIO, EmailaddressRow] = {
    val where = fragments.whereAnd(
      fieldValues.map {
        case EmailaddressFieldValue.businessentityid(value) => fr"businessentityid = $value"
        case EmailaddressFieldValue.emailaddressid(value) => fr"emailaddressid = $value"
        case EmailaddressFieldValue.emailaddress(value) => fr"emailaddress = $value"
        case EmailaddressFieldValue.rowguid(value) => fr"rowguid = $value"
        case EmailaddressFieldValue.modifieddate(value) => fr"modifieddate = $value"
      } :_*
    )
    sql"select * from person.emailaddress $where".query[EmailaddressRow].stream
  
  }
  override def selectById(compositeId: EmailaddressId): ConnectionIO[Option[EmailaddressRow]] = {
    sql"select businessentityid, emailaddressid, emailaddress, rowguid, modifieddate from person.emailaddress where businessentityid = ${compositeId.businessentityid} AND emailaddressid = ${compositeId.emailaddressid}".query[EmailaddressRow].option
  }
  override def update(row: EmailaddressRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update person.emailaddress
          set emailaddress = ${row.emailaddress},
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where businessentityid = ${compositeId.businessentityid} AND emailaddressid = ${compositeId.emailaddressid}
       """
      .update
      .run
      .map(_ > 0)
  }
  override def updateFieldValues(compositeId: EmailaddressId, fieldValues: List[EmailaddressFieldValue[_]]): ConnectionIO[Boolean] = {
    fieldValues match {
      case Nil => pure(false)
      case nonEmpty =>
        val updates = fragments.set(
          nonEmpty.map {
            case EmailaddressFieldValue.emailaddress(value) => fr"emailaddress = $value"
            case EmailaddressFieldValue.rowguid(value) => fr"rowguid = $value"
            case EmailaddressFieldValue.modifieddate(value) => fr"modifieddate = $value"
          } :_*
        )
        sql"""update person.emailaddress
              $updates
              where businessentityid = ${compositeId.businessentityid} AND emailaddressid = ${compositeId.emailaddressid}
           """.update.run.map(_ > 0)
    }
  }
  override def upsert(unsaved: EmailaddressRow): ConnectionIO[EmailaddressRow] = {
    sql"""insert into person.emailaddress(businessentityid, emailaddressid, emailaddress, rowguid, modifieddate)
          values (
            ${unsaved.businessentityid}::int4,
            ${unsaved.emailaddressid}::int4,
            ${unsaved.emailaddress},
            ${unsaved.rowguid}::uuid,
            ${unsaved.modifieddate}::timestamp
          )
          on conflict (businessentityid, emailaddressid)
          do update set
            emailaddress = EXCLUDED.emailaddress,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, emailaddressid, emailaddress, rowguid, modifieddate
       """.query.unique
  }
  implicit val read: Read[EmailaddressRow] =
    new Read[EmailaddressRow](
      gets = List(
        (Get[BusinessentityId], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[/* max 50 chars */ String], Nullability.Nullable),
        (Get[UUID], Nullability.NoNulls),
        (Get[LocalDateTime], Nullability.NoNulls)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => EmailaddressRow(
        businessentityid = Get[BusinessentityId].unsafeGetNonNullable(rs, i + 0),
        emailaddressid = Get[Int].unsafeGetNonNullable(rs, i + 1),
        emailaddress = Get[/* max 50 chars */ String].unsafeGetNullable(rs, i + 2),
        rowguid = Get[UUID].unsafeGetNonNullable(rs, i + 3),
        modifieddate = Get[LocalDateTime].unsafeGetNonNullable(rs, i + 4)
      )
    )
  

}
