/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_language

import adventureworks.TypoAclItem
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgLanguageRow(
  oid: PgLanguageId,
  lanname: String,
  lanowner: /* oid */ Long,
  lanispl: Boolean,
  lanpltrusted: Boolean,
  lanplcallfoid: /* oid */ Long,
  laninline: /* oid */ Long,
  lanvalidator: /* oid */ Long,
  lanacl: Option[Array[TypoAclItem]]
)

object PgLanguageRow {
  implicit val decoder: Decoder[PgLanguageRow] =
    (c: HCursor) =>
      for {
        oid <- c.downField("oid").as[PgLanguageId]
        lanname <- c.downField("lanname").as[String]
        lanowner <- c.downField("lanowner").as[/* oid */ Long]
        lanispl <- c.downField("lanispl").as[Boolean]
        lanpltrusted <- c.downField("lanpltrusted").as[Boolean]
        lanplcallfoid <- c.downField("lanplcallfoid").as[/* oid */ Long]
        laninline <- c.downField("laninline").as[/* oid */ Long]
        lanvalidator <- c.downField("lanvalidator").as[/* oid */ Long]
        lanacl <- c.downField("lanacl").as[Option[Array[TypoAclItem]]]
      } yield PgLanguageRow(oid, lanname, lanowner, lanispl, lanpltrusted, lanplcallfoid, laninline, lanvalidator, lanacl)
  implicit val encoder: Encoder[PgLanguageRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "oid" := row.oid,
        "lanname" := row.lanname,
        "lanowner" := row.lanowner,
        "lanispl" := row.lanispl,
        "lanpltrusted" := row.lanpltrusted,
        "lanplcallfoid" := row.lanplcallfoid,
        "laninline" := row.laninline,
        "lanvalidator" := row.lanvalidator,
        "lanacl" := row.lanacl
      )}
  implicit val read: Read[PgLanguageRow] =
    new Read[PgLanguageRow](
      gets = List(
        (Get[PgLanguageId], Nullability.NoNulls),
        (Get[String], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Array[TypoAclItem]], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgLanguageRow(
        oid = Get[PgLanguageId].unsafeGetNonNullable(rs, i + 0),
        lanname = Get[String].unsafeGetNonNullable(rs, i + 1),
        lanowner = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 2),
        lanispl = Get[Boolean].unsafeGetNonNullable(rs, i + 3),
        lanpltrusted = Get[Boolean].unsafeGetNonNullable(rs, i + 4),
        lanplcallfoid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 5),
        laninline = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 6),
        lanvalidator = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 7),
        lanacl = Get[Array[TypoAclItem]].unsafeGetNullable(rs, i + 8)
      )
    )
  

}
