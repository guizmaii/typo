/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productcategory

import adventureworks.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
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

object ProductcategoryRepoImpl extends ProductcategoryRepo {
  override def delete(productcategoryid: ProductcategoryId): ConnectionIO[Boolean] = {
    sql"delete from production.productcategory where productcategoryid = ${fromWrite(productcategoryid)(Write.fromPut(ProductcategoryId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[ProductcategoryFields, ProductcategoryRow] = {
    DeleteBuilder("production.productcategory", ProductcategoryFields)
  }
  override def insert(unsaved: ProductcategoryRow): ConnectionIO[ProductcategoryRow] = {
    sql"""insert into production.productcategory(productcategoryid, "name", rowguid, modifieddate)
          values (${fromWrite(unsaved.productcategoryid)(Write.fromPut(ProductcategoryId.put))}::int4, ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid, ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning productcategoryid, "name", rowguid, modifieddate::text
       """.query(ProductcategoryRow.read).unique
  }
  override def insert(unsaved: ProductcategoryRowUnsaved): ConnectionIO[ProductcategoryRow] = {
    val fs = List(
      Some((Fragment.const(s""""name""""), fr"""${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name"""")),
      unsaved.productcategoryid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"productcategoryid"), fr"${fromWrite(value: ProductcategoryId)(Write.fromPut(ProductcategoryId.put))}::int4"))
      },
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
      sql"""insert into production.productcategory default values
            returning productcategoryid, "name", rowguid, modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into production.productcategory(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning productcategoryid, "name", rowguid, modifieddate::text
         """
    }
    q.query(ProductcategoryRow.read).unique
    
  }
  override def select: SelectBuilder[ProductcategoryFields, ProductcategoryRow] = {
    SelectBuilderSql("production.productcategory", ProductcategoryFields, ProductcategoryRow.read)
  }
  override def selectAll: Stream[ConnectionIO, ProductcategoryRow] = {
    sql"""select productcategoryid, "name", rowguid, modifieddate::text from production.productcategory""".query(ProductcategoryRow.read).stream
  }
  override def selectById(productcategoryid: ProductcategoryId): ConnectionIO[Option[ProductcategoryRow]] = {
    sql"""select productcategoryid, "name", rowguid, modifieddate::text from production.productcategory where productcategoryid = ${fromWrite(productcategoryid)(Write.fromPut(ProductcategoryId.put))}""".query(ProductcategoryRow.read).option
  }
  override def selectByIds(productcategoryids: Array[ProductcategoryId]): Stream[ConnectionIO, ProductcategoryRow] = {
    sql"""select productcategoryid, "name", rowguid, modifieddate::text from production.productcategory where productcategoryid = ANY(${productcategoryids})""".query(ProductcategoryRow.read).stream
  }
  override def update(row: ProductcategoryRow): ConnectionIO[Boolean] = {
    val productcategoryid = row.productcategoryid
    sql"""update production.productcategory
          set "name" = ${fromWrite(row.name)(Write.fromPut(Name.put))}::"public"."Name",
              rowguid = ${fromWrite(row.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where productcategoryid = ${fromWrite(productcategoryid)(Write.fromPut(ProductcategoryId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[ProductcategoryFields, ProductcategoryRow] = {
    UpdateBuilder("production.productcategory", ProductcategoryFields, ProductcategoryRow.read)
  }
  override def upsert(unsaved: ProductcategoryRow): ConnectionIO[ProductcategoryRow] = {
    sql"""insert into production.productcategory(productcategoryid, "name", rowguid, modifieddate)
          values (
            ${fromWrite(unsaved.productcategoryid)(Write.fromPut(ProductcategoryId.put))}::int4,
            ${fromWrite(unsaved.name)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.rowguid)(Write.fromPut(adventureworks.UUIDMeta.put))}::uuid,
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (productcategoryid)
          do update set
            "name" = EXCLUDED."name",
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning productcategoryid, "name", rowguid, modifieddate::text
       """.query(ProductcategoryRow.read).unique
  }
}
