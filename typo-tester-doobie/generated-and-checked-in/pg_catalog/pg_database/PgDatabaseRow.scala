/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_database

import adventureworks.TypoAclItem
import adventureworks.TypoXid
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgDatabaseRow(
  oid: PgDatabaseId,
  datname: String,
  datdba: /* oid */ Long,
  encoding: Int,
  datcollate: String,
  datctype: String,
  datistemplate: Boolean,
  datallowconn: Boolean,
  datconnlimit: Int,
  datlastsysoid: /* oid */ Long,
  datfrozenxid: TypoXid,
  datminmxid: TypoXid,
  dattablespace: /* oid */ Long,
  datacl: Option[Array[TypoAclItem]]
)

object PgDatabaseRow {
  implicit val decoder: Decoder[PgDatabaseRow] =
    (c: HCursor) =>
      for {
        oid <- c.downField("oid").as[PgDatabaseId]
        datname <- c.downField("datname").as[String]
        datdba <- c.downField("datdba").as[/* oid */ Long]
        encoding <- c.downField("encoding").as[Int]
        datcollate <- c.downField("datcollate").as[String]
        datctype <- c.downField("datctype").as[String]
        datistemplate <- c.downField("datistemplate").as[Boolean]
        datallowconn <- c.downField("datallowconn").as[Boolean]
        datconnlimit <- c.downField("datconnlimit").as[Int]
        datlastsysoid <- c.downField("datlastsysoid").as[/* oid */ Long]
        datfrozenxid <- c.downField("datfrozenxid").as[TypoXid]
        datminmxid <- c.downField("datminmxid").as[TypoXid]
        dattablespace <- c.downField("dattablespace").as[/* oid */ Long]
        datacl <- c.downField("datacl").as[Option[Array[TypoAclItem]]]
      } yield PgDatabaseRow(oid, datname, datdba, encoding, datcollate, datctype, datistemplate, datallowconn, datconnlimit, datlastsysoid, datfrozenxid, datminmxid, dattablespace, datacl)
  implicit val encoder: Encoder[PgDatabaseRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "oid" := row.oid,
        "datname" := row.datname,
        "datdba" := row.datdba,
        "encoding" := row.encoding,
        "datcollate" := row.datcollate,
        "datctype" := row.datctype,
        "datistemplate" := row.datistemplate,
        "datallowconn" := row.datallowconn,
        "datconnlimit" := row.datconnlimit,
        "datlastsysoid" := row.datlastsysoid,
        "datfrozenxid" := row.datfrozenxid,
        "datminmxid" := row.datminmxid,
        "dattablespace" := row.dattablespace,
        "datacl" := row.datacl
      )}
  implicit val read: Read[PgDatabaseRow] =
    new Read[PgDatabaseRow](
      gets = List(
        (Get[PgDatabaseId], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[TypoXid], Nullability.NoNulls),
        (Get[TypoXid], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Array[TypoAclItem]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgDatabaseRow(
        oid = Get[PgDatabaseId].unsafeGetNonNullable(rs, i + 0),
        datname = Get[String].unsafeGetNonNullable(rs, i + 1),
        datdba = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 2),
        encoding = Get[Int].unsafeGetNonNullable(rs, i + 3),
        datcollate = Get[String].unsafeGetNonNullable(rs, i + 4),
        datctype = Get[String].unsafeGetNonNullable(rs, i + 5),
        datistemplate = Get[Boolean].unsafeGetNonNullable(rs, i + 6),
        datallowconn = Get[Boolean].unsafeGetNonNullable(rs, i + 7),
        datconnlimit = Get[Int].unsafeGetNonNullable(rs, i + 8),
        datlastsysoid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 9),
        datfrozenxid = Get[TypoXid].unsafeGetNonNullable(rs, i + 10),
        datminmxid = Get[TypoXid].unsafeGetNonNullable(rs, i + 11),
        dattablespace = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 12),
        datacl = Get[Array[TypoAclItem]].unsafeGetNullable(rs, i + 13)
      )
    )
  

}
