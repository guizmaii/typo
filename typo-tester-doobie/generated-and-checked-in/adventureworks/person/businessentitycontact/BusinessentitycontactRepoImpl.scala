/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package person
package businessentitycontact

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.person.contacttype.ContacttypeId
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.fragment.Fragment
import fs2.Stream
import java.util.UUID
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object BusinessentitycontactRepoImpl extends BusinessentitycontactRepo {
  override def delete(compositeId: BusinessentitycontactId): ConnectionIO[Boolean] = {
    sql"delete from person.businessentitycontact where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND personid = ${fromWrite(compositeId.personid)(Write.fromPut(BusinessentityId.put))} AND contacttypeid = ${fromWrite(compositeId.contacttypeid)(Write.fromPut(ContacttypeId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[BusinessentitycontactFields, BusinessentitycontactRow] = {
    DeleteBuilder("person.businessentitycontact", BusinessentitycontactFields)
  }
  override def insert(unsaved: BusinessentitycontactRow): ConnectionIO[BusinessentitycontactRow] = {
    sql"""insert into person.businessentitycontact(businessentityid, personid, contacttypeid, rowguid, modifieddate)
          values (${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4, ${fromWrite(unsaved.personid)(Write.fromPut(BusinessentityId.put))}::int4, ${fromWrite(unsaved.contacttypeid)(Write.fromPut(ContacttypeId.put))}::int4, ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid, ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning businessentityid, personid, contacttypeid, rowguid, modifieddate::text
       """.query(BusinessentitycontactRow.read).unique
  }
  override def insert(unsaved: BusinessentitycontactRowUnsaved): ConnectionIO[BusinessentitycontactRow] = {
    val fs = List(
      Some((Fragment.const(s"businessentityid"), fr"${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4")),
      Some((Fragment.const(s"personid"), fr"${fromWrite(unsaved.personid)(Write.fromPut(BusinessentityId.put))}::int4")),
      Some((Fragment.const(s"contacttypeid"), fr"${fromWrite(unsaved.contacttypeid)(Write.fromPut(ContacttypeId.put))}::int4")),
      unsaved.rowguid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"rowguid"), fr"${fromWrite(value: UUID)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into person.businessentitycontact default values
            returning businessentityid, personid, contacttypeid, rowguid, modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into person.businessentitycontact(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning businessentityid, personid, contacttypeid, rowguid, modifieddate::text
         """
    }
    q.query(BusinessentitycontactRow.read).unique
    
  }
  override def select: SelectBuilder[BusinessentitycontactFields, BusinessentitycontactRow] = {
    SelectBuilderSql("person.businessentitycontact", BusinessentitycontactFields, BusinessentitycontactRow.read)
  }
  override def selectAll: Stream[ConnectionIO, BusinessentitycontactRow] = {
    sql"select businessentityid, personid, contacttypeid, rowguid, modifieddate::text from person.businessentitycontact".query(BusinessentitycontactRow.read).stream
  }
  override def selectById(compositeId: BusinessentitycontactId): ConnectionIO[Option[BusinessentitycontactRow]] = {
    sql"select businessentityid, personid, contacttypeid, rowguid, modifieddate::text from person.businessentitycontact where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND personid = ${fromWrite(compositeId.personid)(Write.fromPut(BusinessentityId.put))} AND contacttypeid = ${fromWrite(compositeId.contacttypeid)(Write.fromPut(ContacttypeId.put))}".query(BusinessentitycontactRow.read).option
  }
  override def update(row: BusinessentitycontactRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update person.businessentitycontact
          set rowguid = ${fromWrite(row.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where businessentityid = ${fromWrite(compositeId.businessentityid)(Write.fromPut(BusinessentityId.put))} AND personid = ${fromWrite(compositeId.personid)(Write.fromPut(BusinessentityId.put))} AND contacttypeid = ${fromWrite(compositeId.contacttypeid)(Write.fromPut(ContacttypeId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[BusinessentitycontactFields, BusinessentitycontactRow] = {
    UpdateBuilder("person.businessentitycontact", BusinessentitycontactFields, BusinessentitycontactRow.read)
  }
  override def upsert(unsaved: BusinessentitycontactRow): ConnectionIO[BusinessentitycontactRow] = {
    sql"""insert into person.businessentitycontact(businessentityid, personid, contacttypeid, rowguid, modifieddate)
          values (
            ${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4,
            ${fromWrite(unsaved.personid)(Write.fromPut(BusinessentityId.put))}::int4,
            ${fromWrite(unsaved.contacttypeid)(Write.fromPut(ContacttypeId.put))}::int4,
            ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (businessentityid, personid, contacttypeid)
          do update set
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, personid, contacttypeid, rowguid, modifieddate::text
       """.query(BusinessentitycontactRow.read).unique
  }
}
