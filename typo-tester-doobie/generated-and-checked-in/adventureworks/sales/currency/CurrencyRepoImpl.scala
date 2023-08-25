/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package currency

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import doobie.free.connection.ConnectionIO
import doobie.syntax.SqlInterpolator.SingleFragment.fromWrite
import doobie.syntax.string.toSqlInterpolator
import doobie.util.Write
import doobie.util.fragment.Fragment
import fs2.Stream
import typo.dsl.DeleteBuilder
import typo.dsl.SelectBuilder
import typo.dsl.SelectBuilderSql
import typo.dsl.UpdateBuilder

object CurrencyRepoImpl extends CurrencyRepo {
  override def delete(currencycode: CurrencyId): ConnectionIO[Boolean] = {
    sql"delete from sales.currency where currencycode = ${fromWrite(currencycode)(Write.fromPut(CurrencyId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[CurrencyFields, CurrencyRow] = {
    DeleteBuilder("sales.currency", CurrencyFields)
  }
  override def insert(unsaved: CurrencyRow): ConnectionIO[CurrencyRow] = {
    sql"""insert into sales.currency(currencycode, "name", modifieddate)
          values (${fromWrite(unsaved.currencycode)(Write.fromPut(CurrencyId.put))}::bpchar, ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning currencycode, "name", modifieddate::text
       """.query(CurrencyRow.read).unique
  }
  override def insert(unsaved: CurrencyRowUnsaved): ConnectionIO[CurrencyRow] = {
    val fs = List(
      Some((Fragment.const(s"currencycode"), fr"${fromWrite(unsaved.currencycode)(Write.fromPut(CurrencyId.put))}::bpchar")),
      Some((Fragment.const(s""""name""""), fr"""${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name"""")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into sales.currency default values
            returning currencycode, "name", modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into sales.currency(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning currencycode, "name", modifieddate::text
         """
    }
    q.query(CurrencyRow.read).unique
    
  }
  override def select: SelectBuilder[CurrencyFields, CurrencyRow] = {
    SelectBuilderSql("sales.currency", CurrencyFields, CurrencyRow.read)
  }
  override def selectAll: Stream[ConnectionIO, CurrencyRow] = {
    sql"""select currencycode, "name", modifieddate::text from sales.currency""".query(CurrencyRow.read).stream
  }
  override def selectById(currencycode: CurrencyId): ConnectionIO[Option[CurrencyRow]] = {
    sql"""select currencycode, "name", modifieddate::text from sales.currency where currencycode = ${fromWrite(currencycode)(Write.fromPut(CurrencyId.put))}""".query(CurrencyRow.read).option
  }
  override def selectByIds(currencycodes: Array[CurrencyId]): Stream[ConnectionIO, CurrencyRow] = {
    sql"""select currencycode, "name", modifieddate::text from sales.currency where currencycode = ANY(${currencycodes})""".query(CurrencyRow.read).stream
  }
  override def update(row: CurrencyRow): ConnectionIO[Boolean] = {
    val currencycode = row.currencycode
    sql"""update sales.currency
          set "name" = ${fromWrite(row.name)(Write.fromPut(Name.put))}::"public"."Name",
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where currencycode = ${fromWrite(currencycode)(Write.fromPut(CurrencyId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[CurrencyFields, CurrencyRow] = {
    UpdateBuilder("sales.currency", CurrencyFields, CurrencyRow.read)
  }
  override def upsert(unsaved: CurrencyRow): ConnectionIO[CurrencyRow] = {
    sql"""insert into sales.currency(currencycode, "name", modifieddate)
          values (
            ${fromWrite(unsaved.currencycode)(Write.fromPut(CurrencyId.put))}::bpchar,
            ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (currencycode)
          do update set
            "name" = EXCLUDED."name",
            modifieddate = EXCLUDED.modifieddate
          returning currencycode, "name", modifieddate::text
       """.query(CurrencyRow.read).unique
  }
}
