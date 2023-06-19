/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package production
package productinventory

import adventureworks.Defaulted
import adventureworks.production.location.LocationId
import adventureworks.production.product.ProductId
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

object ProductinventoryRepoImpl extends ProductinventoryRepo {
  override def delete(compositeId: ProductinventoryId): ConnectionIO[Boolean] = {
    sql"delete from production.productinventory where productid = ${compositeId.productid} AND locationid = ${compositeId.locationid}".update.run.map(_ > 0)
  }
  override def insert(unsaved: ProductinventoryRow): ConnectionIO[ProductinventoryRow] = {
    sql"""insert into production.productinventory(productid, locationid, shelf, bin, quantity, rowguid, modifieddate)
          values (${unsaved.productid}::int4, ${unsaved.locationid}::int2, ${unsaved.shelf}, ${unsaved.bin}::int2, ${unsaved.quantity}::int2, ${unsaved.rowguid}::uuid, ${unsaved.modifieddate}::timestamp)
          returning productid, locationid, shelf, bin, quantity, rowguid, modifieddate
       """.query.unique
  }
  override def insert(unsaved: ProductinventoryRowUnsaved): ConnectionIO[ProductinventoryRow] = {
    val fs = List(
      Some((Fragment.const(s"productid"), fr"${unsaved.productid}::int4")),
      Some((Fragment.const(s"locationid"), fr"${unsaved.locationid}::int2")),
      Some((Fragment.const(s"shelf"), fr"${unsaved.shelf}")),
      Some((Fragment.const(s"bin"), fr"${unsaved.bin}::int2")),
      unsaved.quantity match {
        case Defaulted.UseDefault => None
        case Defaulted.Provided(value) => Some((Fragment.const(s"quantity"), fr"${value: Int}::int2"))
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
      sql"""insert into production.productinventory default values
            returning productid, locationid, shelf, bin, quantity, rowguid, modifieddate
         """
    } else {
      import cats.syntax.foldable.toFoldableOps
      sql"""insert into production.productinventory(${fs.map { case (n, _) => n }.intercalate(fr", ")})
            values (${fs.map { case (_, f) => f }.intercalate(fr", ")})
            returning productid, locationid, shelf, bin, quantity, rowguid, modifieddate
         """
    }
    q.query.unique
  
  }
  override def selectAll: Stream[ConnectionIO, ProductinventoryRow] = {
    sql"select productid, locationid, shelf, bin, quantity, rowguid, modifieddate from production.productinventory".query[ProductinventoryRow].stream
  }
  override def selectByFieldValues(fieldValues: List[ProductinventoryFieldOrIdValue[_]]): Stream[ConnectionIO, ProductinventoryRow] = {
    val where = fragments.whereAnd(
      fieldValues.map {
        case ProductinventoryFieldValue.productid(value) => fr"productid = $value"
        case ProductinventoryFieldValue.locationid(value) => fr"locationid = $value"
        case ProductinventoryFieldValue.shelf(value) => fr"shelf = $value"
        case ProductinventoryFieldValue.bin(value) => fr"bin = $value"
        case ProductinventoryFieldValue.quantity(value) => fr"quantity = $value"
        case ProductinventoryFieldValue.rowguid(value) => fr"rowguid = $value"
        case ProductinventoryFieldValue.modifieddate(value) => fr"modifieddate = $value"
      } :_*
    )
    sql"select * from production.productinventory $where".query[ProductinventoryRow].stream
  
  }
  override def selectById(compositeId: ProductinventoryId): ConnectionIO[Option[ProductinventoryRow]] = {
    sql"select productid, locationid, shelf, bin, quantity, rowguid, modifieddate from production.productinventory where productid = ${compositeId.productid} AND locationid = ${compositeId.locationid}".query[ProductinventoryRow].option
  }
  override def update(row: ProductinventoryRow): ConnectionIO[Boolean] = {
    val compositeId = row.compositeId
    sql"""update production.productinventory
          set shelf = ${row.shelf},
              bin = ${row.bin}::int2,
              quantity = ${row.quantity}::int2,
              rowguid = ${row.rowguid}::uuid,
              modifieddate = ${row.modifieddate}::timestamp
          where productid = ${compositeId.productid} AND locationid = ${compositeId.locationid}
       """
      .update
      .run
      .map(_ > 0)
  }
  override def updateFieldValues(compositeId: ProductinventoryId, fieldValues: List[ProductinventoryFieldValue[_]]): ConnectionIO[Boolean] = {
    fieldValues match {
      case Nil => pure(false)
      case nonEmpty =>
        val updates = fragments.set(
          nonEmpty.map {
            case ProductinventoryFieldValue.shelf(value) => fr"shelf = $value"
            case ProductinventoryFieldValue.bin(value) => fr"bin = $value"
            case ProductinventoryFieldValue.quantity(value) => fr"quantity = $value"
            case ProductinventoryFieldValue.rowguid(value) => fr"rowguid = $value"
            case ProductinventoryFieldValue.modifieddate(value) => fr"modifieddate = $value"
          } :_*
        )
        sql"""update production.productinventory
              $updates
              where productid = ${compositeId.productid} AND locationid = ${compositeId.locationid}
           """.update.run.map(_ > 0)
    }
  }
  override def upsert(unsaved: ProductinventoryRow): ConnectionIO[ProductinventoryRow] = {
    sql"""insert into production.productinventory(productid, locationid, shelf, bin, quantity, rowguid, modifieddate)
          values (
            ${unsaved.productid}::int4,
            ${unsaved.locationid}::int2,
            ${unsaved.shelf},
            ${unsaved.bin}::int2,
            ${unsaved.quantity}::int2,
            ${unsaved.rowguid}::uuid,
            ${unsaved.modifieddate}::timestamp
          )
          on conflict (productid, locationid)
          do update set
            shelf = EXCLUDED.shelf,
            bin = EXCLUDED.bin,
            quantity = EXCLUDED.quantity,
            rowguid = EXCLUDED.rowguid,
            modifieddate = EXCLUDED.modifieddate
          returning productid, locationid, shelf, bin, quantity, rowguid, modifieddate
       """.query.unique
  }
  implicit val read: Read[ProductinventoryRow] =
    new Read[ProductinventoryRow](
      gets = List(
        (Get[ProductId], Nullability.NoNulls),
        (Get[LocationId], Nullability.NoNulls),
        (Get[/* max 10 chars */ String], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[UUID], Nullability.NoNulls),
        (Get[LocalDateTime], Nullability.NoNulls)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => ProductinventoryRow(
        productid = Get[ProductId].unsafeGetNonNullable(rs, i + 0),
        locationid = Get[LocationId].unsafeGetNonNullable(rs, i + 1),
        shelf = Get[/* max 10 chars */ String].unsafeGetNonNullable(rs, i + 2),
        bin = Get[Int].unsafeGetNonNullable(rs, i + 3),
        quantity = Get[Int].unsafeGetNonNullable(rs, i + 4),
        rowguid = Get[UUID].unsafeGetNonNullable(rs, i + 5),
        modifieddate = Get[LocalDateTime].unsafeGetNonNullable(rs, i + 6)
      )
    )
  

}
