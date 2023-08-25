/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package unitmeasure

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

object UnitmeasureRepoImpl extends UnitmeasureRepo {
  override def delete(unitmeasurecode: UnitmeasureId): ConnectionIO[Boolean] = {
    sql"delete from production.unitmeasure where unitmeasurecode = ${fromWrite(unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[UnitmeasureFields, UnitmeasureRow] = {
    DeleteBuilder("production.unitmeasure", UnitmeasureFields)
  }
  override def insert(unsaved: UnitmeasureRow): ConnectionIO[UnitmeasureRow] = {
    sql"""insert into production.unitmeasure(unitmeasurecode, "name", modifieddate)
          values (${fromWrite(unsaved.unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}::bpchar, ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning unitmeasurecode, "name", modifieddate::text
       """.query(UnitmeasureRow.read).unique
  }
  override def insert(unsaved: UnitmeasureRowUnsaved): ConnectionIO[UnitmeasureRow] = {
    val fs = List(
      Some((Fragment.const(s"unitmeasurecode"), fr"${fromWrite(unsaved.unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}::bpchar")),
      Some((Fragment.const(s""""name""""), fr"""${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name"""")),
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into production.unitmeasure default values
            returning unitmeasurecode, "name", modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into production.unitmeasure(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning unitmeasurecode, "name", modifieddate::text
         """
    }
    q.query(UnitmeasureRow.read).unique
    
  }
  override def select: SelectBuilder[UnitmeasureFields, UnitmeasureRow] = {
    SelectBuilderSql("production.unitmeasure", UnitmeasureFields, UnitmeasureRow.read)
  }
  override def selectAll: Stream[ConnectionIO, UnitmeasureRow] = {
    sql"""select unitmeasurecode, "name", modifieddate::text from production.unitmeasure""".query(UnitmeasureRow.read).stream
  }
  override def selectById(unitmeasurecode: UnitmeasureId): ConnectionIO[Option[UnitmeasureRow]] = {
    sql"""select unitmeasurecode, "name", modifieddate::text from production.unitmeasure where unitmeasurecode = ${fromWrite(unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}""".query(UnitmeasureRow.read).option
  }
  override def selectByIds(unitmeasurecodes: Array[UnitmeasureId]): Stream[ConnectionIO, UnitmeasureRow] = {
    sql"""select unitmeasurecode, "name", modifieddate::text from production.unitmeasure where unitmeasurecode = ANY(${unitmeasurecodes})""".query(UnitmeasureRow.read).stream
  }
  override def update(row: UnitmeasureRow): ConnectionIO[Boolean] = {
    val unitmeasurecode = row.unitmeasurecode
    sql"""update production.unitmeasure
          set "name" = ${fromWrite(row.name)(Write.fromPut(Name.put))}::"public"."Name",
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where unitmeasurecode = ${fromWrite(unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[UnitmeasureFields, UnitmeasureRow] = {
    UpdateBuilder("production.unitmeasure", UnitmeasureFields, UnitmeasureRow.read)
  }
  override def upsert(unsaved: UnitmeasureRow): ConnectionIO[UnitmeasureRow] = {
    sql"""insert into production.unitmeasure(unitmeasurecode, "name", modifieddate)
          values (
            ${fromWrite(unsaved.unitmeasurecode)(Write.fromPut(UnitmeasureId.put))}::bpchar,
            ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (unitmeasurecode)
          do update set
            "name" = EXCLUDED."name",
            modifieddate = EXCLUDED.modifieddate
          returning unitmeasurecode, "name", modifieddate::text
       """.query(UnitmeasureRow.read).unique
  }
}
