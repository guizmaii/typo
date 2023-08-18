/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productreview

import adventureworks.production.product.ProductId
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

object ProductreviewRepoImpl extends ProductreviewRepo {
  override def delete(productreviewid: ProductreviewId): ConnectionIO[Boolean] = {
    sql"delete from production.productreview where productreviewid = ${fromWrite(productreviewid)(Write.fromPut(ProductreviewId.put))}".update.run.map(_ > 0)
  }
  override def delete: DeleteBuilder[ProductreviewFields, ProductreviewRow] = {
    DeleteBuilder("production.productreview", ProductreviewFields)
  }
  override def insert(unsaved: ProductreviewRow): ConnectionIO[ProductreviewRow] = {
    sql"""insert into production.productreview(productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate)
          values (${fromWrite(unsaved.productreviewid)(Write.fromPut(ProductreviewId.put))}::int4, ${fromWrite(unsaved.productid)(Write.fromPut(ProductId.put))}::int4, ${fromWrite(unsaved.reviewername)(Write.fromPut(Name.put))}::"public"."Name", ${fromWrite(unsaved.reviewdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp, ${fromWrite(unsaved.emailaddress)(Write.fromPut(Meta.StringMeta.put))}, ${fromWrite(unsaved.rating)(Write.fromPut(Meta.IntMeta.put))}::int4, ${fromWrite(unsaved.comments)(Write.fromPutOption(Meta.StringMeta.put))}, ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp)
          returning productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text
       """.query(ProductreviewRow.read).unique
  }
  override def insert(unsaved: ProductreviewRowUnsaved): ConnectionIO[ProductreviewRow] = {
    val fs = List(
      Some((Fragment.const(s"productid"), fr"${fromWrite(unsaved.productid)(Write.fromPut(ProductId.put))}::int4")),
      Some((Fragment.const(s"reviewername"), fr"""${fromWrite(unsaved.reviewername)(Write.fromPut(Name.put))}::"public"."Name"""")),
      Some((Fragment.const(s"emailaddress"), fr"${fromWrite(unsaved.emailaddress)(Write.fromPut(Meta.StringMeta.put))}")),
      Some((Fragment.const(s"rating"), fr"${fromWrite(unsaved.rating)(Write.fromPut(Meta.IntMeta.put))}::int4")),
      Some((Fragment.const(s""""comments""""), fr"${fromWrite(unsaved.comments)(Write.fromPutOption(Meta.StringMeta.put))}")),
      unsaved.productreviewid match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"productreviewid"), fr"${fromWrite(value: ProductreviewId)(Write.fromPut(ProductreviewId.put))}::int4"))
      },
      unsaved.reviewdate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"reviewdate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      },
      unsaved.modifieddate match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"modifieddate"), fr"${fromWrite(value: TypoLocalDateTime)(Write.fromPut(TypoLocalDateTime.put))}::timestamp"))
      }
    ).flatten
    
    val q = if (fs.isEmpty) {
      sql"""insert into production.productreview default values
            returning productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into production.productreview(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text
         """
    }
    q.query(ProductreviewRow.read).unique
    
  }
  override def select: SelectBuilder[ProductreviewFields, ProductreviewRow] = {
    SelectBuilderSql("production.productreview", ProductreviewFields, ProductreviewRow.read)
  }
  override def selectAll: Stream[ConnectionIO, ProductreviewRow] = {
    sql"""select productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text from production.productreview""".query(ProductreviewRow.read).stream
  }
  override def selectById(productreviewid: ProductreviewId): ConnectionIO[Option[ProductreviewRow]] = {
    sql"""select productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text from production.productreview where productreviewid = ${fromWrite(productreviewid)(Write.fromPut(ProductreviewId.put))}""".query(ProductreviewRow.read).option
  }
  override def selectByIds(productreviewids: Array[ProductreviewId]): Stream[ConnectionIO, ProductreviewRow] = {
    sql"""select productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text from production.productreview where productreviewid = ANY(${fromWrite(productreviewids)(Write.fromPut(ProductreviewId.arrayPut))})""".query(ProductreviewRow.read).stream
  }
  override def update(row: ProductreviewRow): ConnectionIO[Boolean] = {
    val productreviewid = row.productreviewid
    sql"""update production.productreview
          set productid = ${fromWrite(row.productid)(Write.fromPut(ProductId.put))}::int4,
              reviewername = ${fromWrite(row.reviewername)(Write.fromPut(Name.put))}::"public"."Name",
              reviewdate = ${fromWrite(row.reviewdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp,
              emailaddress = ${fromWrite(row.emailaddress)(Write.fromPut(Meta.StringMeta.put))},
              rating = ${fromWrite(row.rating)(Write.fromPut(Meta.IntMeta.put))}::int4,
              "comments" = ${fromWrite(row.comments)(Write.fromPutOption(Meta.StringMeta.put))},
              modifieddate = ${fromWrite(row.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          where productreviewid = ${fromWrite(productreviewid)(Write.fromPut(ProductreviewId.put))}"""
      .update
      .run
      .map(_ > 0)
  }
  override def update: UpdateBuilder[ProductreviewFields, ProductreviewRow] = {
    UpdateBuilder("production.productreview", ProductreviewFields, ProductreviewRow.read)
  }
  override def upsert(unsaved: ProductreviewRow): ConnectionIO[ProductreviewRow] = {
    sql"""insert into production.productreview(productreviewid, productid, reviewername, reviewdate, emailaddress, rating, "comments", modifieddate)
          values (
            ${fromWrite(unsaved.productreviewid)(Write.fromPut(ProductreviewId.put))}::int4,
            ${fromWrite(unsaved.productid)(Write.fromPut(ProductId.put))}::int4,
            ${fromWrite(unsaved.reviewername)(Write.fromPut(Name.put))}::"public"."Name",
            ${fromWrite(unsaved.reviewdate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp,
            ${fromWrite(unsaved.emailaddress)(Write.fromPut(Meta.StringMeta.put))},
            ${fromWrite(unsaved.rating)(Write.fromPut(Meta.IntMeta.put))}::int4,
            ${fromWrite(unsaved.comments)(Write.fromPutOption(Meta.StringMeta.put))},
            ${fromWrite(unsaved.modifieddate)(Write.fromPut(TypoLocalDateTime.put))}::timestamp
          )
          on conflict (productreviewid)
          do update set
            productid = EXCLUDED.productid,
            reviewername = EXCLUDED.reviewername,
            reviewdate = EXCLUDED.reviewdate,
            emailaddress = EXCLUDED.emailaddress,
            rating = EXCLUDED.rating,
            "comments" = EXCLUDED."comments",
            modifieddate = EXCLUDED.modifieddate
          returning productreviewid, productid, reviewername, reviewdate::text, emailaddress, rating, "comments", modifieddate::text
       """.query(ProductreviewRow.read).unique
  }
}
