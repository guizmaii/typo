/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_replication_origin_status

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgReplicationOriginStatusViewRow(
  localId: Option[/* oid */ Long],
  externalId: Option[String],
  remoteLsn: Option[/* pg_lsn */ Long],
  localLsn: Option[/* pg_lsn */ Long]
)

object PgReplicationOriginStatusViewRow {
  implicit val decoder: Decoder[PgReplicationOriginStatusViewRow] =
    (c: HCursor) =>
      for {
        localId <- c.downField("local_id").as[Option[/* oid */ Long]]
        externalId <- c.downField("external_id").as[Option[String]]
        remoteLsn <- c.downField("remote_lsn").as[Option[/* pg_lsn */ Long]]
        localLsn <- c.downField("local_lsn").as[Option[/* pg_lsn */ Long]]
      } yield PgReplicationOriginStatusViewRow(localId, externalId, remoteLsn, localLsn)
  implicit val encoder: Encoder[PgReplicationOriginStatusViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "local_id" := row.localId,
        "external_id" := row.externalId,
        "remote_lsn" := row.remoteLsn,
        "local_lsn" := row.localLsn
      )}
  implicit val read: Read[PgReplicationOriginStatusViewRow] =
    new Read[PgReplicationOriginStatusViewRow](
      gets = List(
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[/* pg_lsn */ Long], Nullability.Nullable),
        (Get[/* pg_lsn */ Long], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgReplicationOriginStatusViewRow(
        localId = Get[/* oid */ Long].unsafeGetNullable(rs, i + 0),
        externalId = Get[String].unsafeGetNullable(rs, i + 1),
        remoteLsn = Get[/* pg_lsn */ Long].unsafeGetNullable(rs, i + 2),
        localLsn = Get[/* pg_lsn */ Long].unsafeGetNullable(rs, i + 3)
      )
    )
  

}
