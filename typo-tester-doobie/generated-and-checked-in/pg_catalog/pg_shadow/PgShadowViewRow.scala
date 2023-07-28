/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_shadow

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet
import java.time.OffsetDateTime

case class PgShadowViewRow(
  usename: Option[String],
  usesysid: Option[/* oid */ Long],
  usecreatedb: Option[Boolean],
  usesuper: Option[Boolean],
  userepl: Option[Boolean],
  usebypassrls: Option[Boolean],
  passwd: Option[String],
  valuntil: Option[OffsetDateTime],
  useconfig: Option[Array[String]]
)

object PgShadowViewRow {
  implicit val decoder: Decoder[PgShadowViewRow] =
    (c: HCursor) =>
      for {
        usename <- c.downField("usename").as[Option[String]]
        usesysid <- c.downField("usesysid").as[Option[/* oid */ Long]]
        usecreatedb <- c.downField("usecreatedb").as[Option[Boolean]]
        usesuper <- c.downField("usesuper").as[Option[Boolean]]
        userepl <- c.downField("userepl").as[Option[Boolean]]
        usebypassrls <- c.downField("usebypassrls").as[Option[Boolean]]
        passwd <- c.downField("passwd").as[Option[String]]
        valuntil <- c.downField("valuntil").as[Option[OffsetDateTime]]
        useconfig <- c.downField("useconfig").as[Option[Array[String]]]
      } yield PgShadowViewRow(usename, usesysid, usecreatedb, usesuper, userepl, usebypassrls, passwd, valuntil, useconfig)
  implicit val encoder: Encoder[PgShadowViewRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "usename" := row.usename,
        "usesysid" := row.usesysid,
        "usecreatedb" := row.usecreatedb,
        "usesuper" := row.usesuper,
        "userepl" := row.userepl,
        "usebypassrls" := row.usebypassrls,
        "passwd" := row.passwd,
        "valuntil" := row.valuntil,
        "useconfig" := row.useconfig
      )}
  implicit val read: Read[PgShadowViewRow] =
    new Read[PgShadowViewRow](
      gets = List(
        (Get[String], Nullability.Nullable),
        (Get[/* oid */ Long], Nullability.Nullable),
        (Get[Boolean], Nullability.Nullable),
        (Get[Boolean], Nullability.Nullable),
        (Get[Boolean], Nullability.Nullable),
        (Get[Boolean], Nullability.Nullable),
        (Get[String], Nullability.Nullable),
        (Get[OffsetDateTime], Nullability.Nullable),
        (Get[Array[String]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgShadowViewRow(
        usename = Get[String].unsafeGetNullable(rs, i + 0),
        usesysid = Get[/* oid */ Long].unsafeGetNullable(rs, i + 1),
        usecreatedb = Get[Boolean].unsafeGetNullable(rs, i + 2),
        usesuper = Get[Boolean].unsafeGetNullable(rs, i + 3),
        userepl = Get[Boolean].unsafeGetNullable(rs, i + 4),
        usebypassrls = Get[Boolean].unsafeGetNullable(rs, i + 5),
        passwd = Get[String].unsafeGetNullable(rs, i + 6),
        valuntil = Get[OffsetDateTime].unsafeGetNullable(rs, i + 7),
        useconfig = Get[Array[String]].unsafeGetNullable(rs, i + 8)
      )
    )
  

}
