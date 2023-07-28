/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_statio_all_sequences

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgStatioAllSequencesViewRow(
  relid: Option[/* oid */ Long],
  schemaname: Option[String],
  relname: Option[String],
  blksRead: Option[Long],
  blksHit: Option[Long]
)

object PgStatioAllSequencesViewRow {
  implicit val decoder: Decoder[PgStatioAllSequencesViewRow] =
    (c: HCursor) =>
      for {
        relid <- c.downField("relid").as[Option[/* oid */ Long]]
        schemaname <- c.downField("schemaname").as[Option[String]]
        relname <- c.downField("relname").as[Option[String]]
        blksRead <- c.downField("blks_read").as[Option[Long]]
        blksHit <- c.downField("blks_hit").as[Option[Long]]
      } yield PgStatioAllSequencesViewRow(relid, schemaname, relname, blksRead, blksHit)
  implicit val encoder: Encoder[PgStatioAllSequencesViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "relid" := row.relid,
        "schemaname" := row.schemaname,
        "relname" := row.relname,
        "blks_read" := row.blksRead,
        "blks_hit" := row.blksHit
      )}
  implicit val read: Read[PgStatioAllSequencesViewRow] =
    new Read[PgStatioAllSequencesViewRow](
      gets = List(
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[Long], Nullability.Nullable),
        (Get[Long], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgStatioAllSequencesViewRow(
        relid = Get[/* oid */ Long].unsafeGetNullable(rs, i + 0),
        schemaname = Get[String].unsafeGetNullable(rs, i + 1),
        relname = Get[String].unsafeGetNullable(rs, i + 2),
        blksRead = Get[Long].unsafeGetNullable(rs, i + 3),
        blksHit = Get[Long].unsafeGetNullable(rs, i + 4)
      )
    )
  

}
