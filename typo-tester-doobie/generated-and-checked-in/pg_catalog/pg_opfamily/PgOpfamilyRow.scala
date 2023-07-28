/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_opfamily

import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgOpfamilyRow(
  oid: PgOpfamilyId,
  opfmethod: /* oid */ Long,
  opfname: String,
  opfnamespace: /* oid */ Long,
  opfowner: /* oid */ Long
)

object PgOpfamilyRow {
  implicit val decoder: Decoder[PgOpfamilyRow] =
    (c: HCursor) =>
      for {
        oid <- c.downField("oid").as[PgOpfamilyId]
        opfmethod <- c.downField("opfmethod").as[/* oid */ Long]
        opfname <- c.downField("opfname").as[String]
        opfnamespace <- c.downField("opfnamespace").as[/* oid */ Long]
        opfowner <- c.downField("opfowner").as[/* oid */ Long]
      } yield PgOpfamilyRow(oid, opfmethod, opfname, opfnamespace, opfowner)
  implicit val encoder: Encoder[PgOpfamilyRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "oid" := row.oid,
        "opfmethod" := row.opfmethod,
        "opfname" := row.opfname,
        "opfnamespace" := row.opfnamespace,
        "opfowner" := row.opfowner
      )}
  implicit val read: Read[PgOpfamilyRow] =
    new Read[PgOpfamilyRow](
      gets = List(
        (Get[PgOpfamilyId], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgOpfamilyRow(
        oid = Get[PgOpfamilyId].unsafeGetNonNullable(rs, i + 0),
        opfmethod = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 1),
        opfname = Get[String].unsafeGetNonNullable(rs, i + 2),
        opfnamespace = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 3),
        opfowner = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 4)
      )
    )
  

}
