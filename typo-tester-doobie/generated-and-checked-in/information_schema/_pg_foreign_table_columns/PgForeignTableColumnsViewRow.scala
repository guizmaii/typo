/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package `_pg_foreign_table_columns`

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgForeignTableColumnsViewRow(
  nspname: Option[String],
  relname: Option[String],
  attname: Option[String],
  attfdwoptions: Option[Array[String]]
)

object PgForeignTableColumnsViewRow {
  implicit val decoder: Decoder[PgForeignTableColumnsViewRow] =
    (c: HCursor) =>
      for {
        nspname <- c.downField("nspname").as[Option[String]]
        relname <- c.downField("relname").as[Option[String]]
        attname <- c.downField("attname").as[Option[String]]
        attfdwoptions <- c.downField("attfdwoptions").as[Option[Array[String]]]
      } yield PgForeignTableColumnsViewRow(nspname, relname, attname, attfdwoptions)
  implicit val encoder: Encoder[PgForeignTableColumnsViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "nspname" := row.nspname,
        "relname" := row.relname,
        "attname" := row.attname,
        "attfdwoptions" := row.attfdwoptions
      )}
  implicit val read: Read[PgForeignTableColumnsViewRow] =
    new Read[PgForeignTableColumnsViewRow](
      gets = List(
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgForeignTableColumnsViewRow(
        nspname = Get[String].unsafeGetNullable(rs, i + 0),
        relname = Get[String].unsafeGetNullable(rs, i + 1),
        attname = Get[String].unsafeGetNullable(rs, i + 2),
        attfdwoptions = Get[Array[String]].unsafeGetNullable(rs, i + 3)
      )
    )
  

}
