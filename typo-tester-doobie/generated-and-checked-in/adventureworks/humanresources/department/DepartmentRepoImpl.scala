/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package humanresources
package department

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

object DepartmentRepoImpl extends DepartmentRepo {
  override def delete(departmentid: DepartmentId): ConnectionIO[Boolean] = {
    sql"delete from humanresources.department where departmentid = ${fromWrite(departmentid)(Write.fromPut(DepartmentId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[DepartmentFields, DepartmentRow] = {
    DeleteBuilder("humanresources.department", DepartmentFields)
  }
  override def insert(unsaved: DepartmentRow): ConnectionIO[DepartmentRow] = {
    sql"""insert into humanresources.department(departmentid, "name", groupname, modifieddate)
          values (${fromWrite(unsaved.departmentid)(Write.fromPut(DepartmentId.put))}::int4, ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.groupname)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning departmentid, "name", groupname, modifieddate::text
       """.query(DepartmentRow.read).unique
  }
  override def insert(unsaved: DepartmentRowUnsaved): ConnectionIO[DepartmentRow] = {
    val fs = List(
      Some((Fragment.const(s""""name""""), fr"""${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name"""")),
      Some((Fragment.const(s"groupname"), fr"""${fromWrite(unsaved.groupname)(Write.fromPut(Name.put))}::"public"."Name"""")),
      unsaved.departmentid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"departmentid"), fr"${fromWrite(value: DepartmentId)(Write.fromPut(DepartmentId.put))}::int4"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into humanresources.department default values
            returning departmentid, "name", groupname, modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into humanresources.department(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning departmentid, "name", groupname, modifieddate::text
         """
    }
    q.query(DepartmentRow.read).unique
    
  }
  override def select: SelectBuilder[DepartmentFields, DepartmentRow] = {
    SelectBuilderSql("humanresources.department", DepartmentFields, DepartmentRow.read)
  }
  override def selectAll: Stream[ConnectionIO, DepartmentRow] = {
    sql"""select departmentid, "name", groupname, modifieddate::text from humanresources.department""".query(DepartmentRow.read).stream
  }
  override def selectById(departmentid: DepartmentId): ConnectionIO[Option[DepartmentRow]] = {
    sql"""select departmentid, "name", groupname, modifieddate::text from humanresources.department where departmentid = ${fromWrite(departmentid)(Write.fromPut(DepartmentId.put))}""".query(DepartmentRow.read).option
  }
  override def selectByIds(departmentids: Array[DepartmentId]): Stream[ConnectionIO, DepartmentRow] = {
    sql"""select departmentid, "name", groupname, modifieddate::text from humanresources.department where departmentid = ANY(${departmentids})""".query(DepartmentRow.read).stream
  }
  override def update(row: DepartmentRow): ConnectionIO[Boolean] = {
    val departmentid = row.departmentid
    sql"""update humanresources.department
          set "name" = ${fromWrite(row.name)(Write.fromPut(Name.put))}::"public"."Name",
              groupname = ${fromWrite(row.groupname)(Write.fromPut(Name.put))}::"public"."Name",
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where departmentid = ${fromWrite(departmentid)(Write.fromPut(DepartmentId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[DepartmentFields, DepartmentRow] = {
    UpdateBuilder("humanresources.department", DepartmentFields, DepartmentRow.read)
  }
  override def upsert(unsaved: DepartmentRow): ConnectionIO[DepartmentRow] = {
    sql"""insert into humanresources.department(departmentid, "name", groupname, modifieddate)
          values (
            ${fromWrite(unsaved.departmentid)(Write.fromPut(DepartmentId.put))}::int4,
            ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.groupname)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (departmentid)
          do update set
            "name" = EXCLUDED."name",
            groupname = EXCLUDED.groupname,
            modifieddate = EXCLUDED.modifieddate
          returning departmentid, "name", groupname, modifieddate::text
       """.query(DepartmentRow.read).unique
  }
}
