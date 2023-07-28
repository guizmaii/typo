/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_event_trigger

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgEventTriggerRow(
  oid: PgEventTriggerId,
  evtname: String,
  evtevent: String,
  evtowner: /* oid */ Long,
  evtfoid: /* oid */ Long,
  evtenabled: String,
  evttags: Option[Array[String]]
)

object PgEventTriggerRow {
  implicit val decoder: Decoder[PgEventTriggerRow] =
    (c: HCursor) =>
      for {
        oid <- c.downField("oid").as[PgEventTriggerId]
        evtname <- c.downField("evtname").as[String]
        evtevent <- c.downField("evtevent").as[String]
        evtowner <- c.downField("evtowner").as[/* oid */ Long]
        evtfoid <- c.downField("evtfoid").as[/* oid */ Long]
        evtenabled <- c.downField("evtenabled").as[String]
        evttags <- c.downField("evttags").as[Option[Array[String]]]
      } yield PgEventTriggerRow(oid, evtname, evtevent, evtowner, evtfoid, evtenabled, evttags)
  implicit val encoder: Encoder[PgEventTriggerRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "oid" := row.oid,
        "evtname" := row.evtname,
        "evtevent" := row.evtevent,
        "evtowner" := row.evtowner,
        "evtfoid" := row.evtfoid,
        "evtenabled" := row.evtenabled,
        "evttags" := row.evttags
      )}
  implicit val read: Read[PgEventTriggerRow] =
    new Read[PgEventTriggerRow](
      gets = List(
        (Get[PgEventTriggerId], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[Array[String]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgEventTriggerRow(
        oid = Get[PgEventTriggerId].unsafeGetNonNullable(rs, i + 0),
        evtname = Get[String].unsafeGetNonNullable(rs, i + 1),
        evtevent = Get[String].unsafeGetNonNullable(rs, i + 2),
        evtowner = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 3),
        evtfoid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 4),
        evtenabled = Get[String].unsafeGetNonNullable(rs, i + 5),
        evttags = Get[Array[String]].unsafeGetNullable(rs, i + 6)
      )
    )
  

}
