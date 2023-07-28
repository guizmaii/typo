/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_subscription_rel

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgSubscriptionRelRow(
  srsubid: /* oid */ Long,
  srrelid: /* oid */ Long,
  srsubstate: String,
  srsublsn: Option[/* pg_lsn */ Long]
){
   val compositeId: PgSubscriptionRelId = PgSubscriptionRelId(srrelid, srsubid)
 }

object PgSubscriptionRelRow {
  implicit val decoder: Decoder[PgSubscriptionRelRow] =
    (c: HCursor) =>
      for {
        srsubid <- c.downField("srsubid").as[/* oid */ Long]
        srrelid <- c.downField("srrelid").as[/* oid */ Long]
        srsubstate <- c.downField("srsubstate").as[String]
        srsublsn <- c.downField("srsublsn").as[Option[/* pg_lsn */ Long]]
      } yield PgSubscriptionRelRow(srsubid, srrelid, srsubstate, srsublsn)
  implicit val encoder: Encoder[PgSubscriptionRelRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "srsubid" := row.srsubid,
        "srrelid" := row.srrelid,
        "srsubstate" := row.srsubstate,
        "srsublsn" := row.srsublsn
      )}
  implicit val read: Read[PgSubscriptionRelRow] =
    new Read[PgSubscriptionRelRow](
      gets = List(
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* pg_lsn */ Long], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgSubscriptionRelRow(
        srsubid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 0),
        srrelid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 1),
        srsubstate = Get[String].unsafeGetNonNullable(rs, i + 2),
        srsublsn = Get[/* pg_lsn */ Long].unsafeGetNullable(rs, i + 3)
      )
    )
  

}
