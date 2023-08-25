/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package purchasing
package vendor

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.public.AccountNumber
import adventureworks.public.Flag
import adventureworks.public.Name
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.fragment.Fragment
import doobie.util.meta.Meta
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object VendorRepoImpl extends VendorRepo {
  override def delete(businessentityid: BusinessentityId): ConnectionIO[Boolean] = {
    sql"delete from purchasing.vendor where businessentityid = ${fromWrite(businessentityid)(Write.fromPut(BusinessentityId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[VendorFields, VendorRow] = {
    DeleteBuilder("purchasing.vendor", VendorFields)
  }
  override def insert(unsaved: VendorRow): ConnectionIO[VendorRow] = {
    sql"""insert into purchasing.vendor(businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate)
          values (${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4, ${fromWrite(unsaved.accountnumber)(Write.fromPut(AccountNumber.put))}::"public".AccountNumber, ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.creditrating)(Write.fromPut(Meta.IntMeta.put))}::int2, ${fromWrite(unsaved.preferredvendorstatus)(Write.fromPut(Flag.put))}::"public"."Flag", ${fromWrite(unsaved.activeflag)(Write.fromPut(Flag.put))}::"public"."Flag", ${fromWrite(unsaved.purchasingwebserviceurl)(Write.fromPutOption(Meta.StringMeta.put))}, ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text
       """.query(VendorRow.read).unique
  }
  override def insert(unsaved: VendorRowUnsaved): ConnectionIO[VendorRow] = {
    val fs = List(
      Some((Fragment.const(s"businessentityid"), fr"${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4")),
      Some((Fragment.const(s"accountnumber"), fr"""${fromWrite(unsaved.accountnumber)(Write.fromPut(AccountNumber.put))}::"public".AccountNumber""")),
      Some((Fragment.const(s""""name""""), fr"""${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name"""")),
      Some((Fragment.const(s"creditrating"), fr"${fromWrite(unsaved.creditrating)(Write.fromPut(Meta.IntMeta.put))}::int2")),
      Some((Fragment.const(s"purchasingwebserviceurl"), fr"${fromWrite(unsaved.purchasingwebserviceurl)(Write.fromPutOption(Meta.StringMeta.put))}")),
      unsaved.preferredvendorstatus match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"preferredvendorstatus"), fr"""${fromWrite(value: Flag)(Write.fromPut(Flag.put))}::"public"."Flag""""))
      },
      unsaved.activeflag match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"activeflag"), fr"""${fromWrite(value: Flag)(Write.fromPut(Flag.put))}::"public"."Flag""""))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into purchasing.vendor default values
            returning businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into purchasing.vendor(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text
         """
    }
    q.query(VendorRow.read).unique
    
  }
  override def select: SelectBuilder[VendorFields, VendorRow] = {
    SelectBuilderSql("purchasing.vendor", VendorFields, VendorRow.read)
  }
  override def selectAll: Stream[ConnectionIO, VendorRow] = {
    sql"""select businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text from purchasing.vendor""".query(VendorRow.read).stream
  }
  override def selectById(businessentityid: BusinessentityId): ConnectionIO[Option[VendorRow]] = {
    sql"""select businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text from purchasing.vendor where businessentityid = ${fromWrite(businessentityid)(Write.fromPut(BusinessentityId.put))}""".query(VendorRow.read).option
  }
  override def selectByIds(businessentityids: Array[BusinessentityId]): Stream[ConnectionIO, VendorRow] = {
    sql"""select businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text from purchasing.vendor where businessentityid = ANY(${businessentityids})""".query(VendorRow.read).stream
  }
  override def update(row: VendorRow): ConnectionIO[Boolean] = {
    val businessentityid = row.businessentityid
    sql"""update purchasing.vendor
          set accountnumber = ${fromWrite(row.accountnumber)(Write.fromPut(AccountNumber.put))}::"public".AccountNumber,
              "name" = ${fromWrite(row.name)(Write.fromPut(Name.put))}::"public"."Name",
              creditrating = ${fromWrite(row.creditrating)(Write.fromPut(Meta.IntMeta.put))}::int2,
              preferredvendorstatus = ${fromWrite(row.preferredvendorstatus)(Write.fromPut(Flag.put))}::"public"."Flag",
              activeflag = ${fromWrite(row.activeflag)(Write.fromPut(Flag.put))}::"public"."Flag",
              purchasingwebserviceurl = ${fromWrite(row.purchasingwebserviceurl)(Write.fromPutOption(Meta.StringMeta.put))},
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where businessentityid = ${fromWrite(businessentityid)(Write.fromPut(BusinessentityId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[VendorFields, VendorRow] = {
    UpdateBuilder("purchasing.vendor", VendorFields, VendorRow.read)
  }
  override def upsert(unsaved: VendorRow): ConnectionIO[VendorRow] = {
    sql"""insert into purchasing.vendor(businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate)
          values (
            ${fromWrite(unsaved.businessentityid)(Write.fromPut(BusinessentityId.put))}::int4,
            ${fromWrite(unsaved.accountnumber)(Write.fromPut(AccountNumber.put))}::"public".AccountNumber,
            ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.creditrating)(Write.fromPut(Meta.IntMeta.put))}::int2,
            ${fromWrite(unsaved.preferredvendorstatus)(Write.fromPut(Flag.put))}::"public"."Flag",
            ${fromWrite(unsaved.activeflag)(Write.fromPut(Flag.put))}::"public"."Flag",
            ${fromWrite(unsaved.purchasingwebserviceurl)(Write.fromPutOption(Meta.StringMeta.put))},
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (businessentityid)
          do update set
            accountnumber = EXCLUDED.accountnumber,
            "name" = EXCLUDED."name",
            creditrating = EXCLUDED.creditrating,
            preferredvendorstatus = EXCLUDED.preferredvendorstatus,
            activeflag = EXCLUDED.activeflag,
            purchasingwebserviceurl = EXCLUDED.purchasingwebserviceurl,
            modifieddate = EXCLUDED.modifieddate
          returning businessentityid, accountnumber, "name", creditrating, preferredvendorstatus, activeflag, purchasingwebserviceurl, modifieddate::text
       """.query(VendorRow.read).unique
  }
}
