/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_index

import adventureworks.TypoInt2Vector
import adventureworks.TypoOidVector
import adventureworks.TypoPgNodeTree
import doobie.Get
import doobie.Read
import doobie.enumerated.Nullability
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.sql.ResultSet

case class PgIndexRow(
  indexrelid: PgIndexId,
  indrelid: /* oid */ Long,
  indnatts: Int,
  indnkeyatts: Int,
  indisunique: Boolean,
  indisprimary: Boolean,
  indisexclusion: Boolean,
  indimmediate: Boolean,
  indisclustered: Boolean,
  indisvalid: Boolean,
  indcheckxmin: Boolean,
  indisready: Boolean,
  indislive: Boolean,
  indisreplident: Boolean,
  indkey: TypoInt2Vector,
  indcollation: TypoOidVector,
  indclass: TypoOidVector,
  indoption: TypoInt2Vector,
  indexprs: Option[TypoPgNodeTree],
  indpred: Option[TypoPgNodeTree]
)

object PgIndexRow {
  implicit val decoder: Decoder[PgIndexRow] =
    (c: HCursor) =>
      for {
        indexrelid <- c.downField("indexrelid").as[PgIndexId]
        indrelid <- c.downField("indrelid").as[/* oid */ Long]
        indnatts <- c.downField("indnatts").as[Int]
        indnkeyatts <- c.downField("indnkeyatts").as[Int]
        indisunique <- c.downField("indisunique").as[Boolean]
        indisprimary <- c.downField("indisprimary").as[Boolean]
        indisexclusion <- c.downField("indisexclusion").as[Boolean]
        indimmediate <- c.downField("indimmediate").as[Boolean]
        indisclustered <- c.downField("indisclustered").as[Boolean]
        indisvalid <- c.downField("indisvalid").as[Boolean]
        indcheckxmin <- c.downField("indcheckxmin").as[Boolean]
        indisready <- c.downField("indisready").as[Boolean]
        indislive <- c.downField("indislive").as[Boolean]
        indisreplident <- c.downField("indisreplident").as[Boolean]
        indkey <- c.downField("indkey").as[TypoInt2Vector]
        indcollation <- c.downField("indcollation").as[TypoOidVector]
        indclass <- c.downField("indclass").as[TypoOidVector]
        indoption <- c.downField("indoption").as[TypoInt2Vector]
        indexprs <- c.downField("indexprs").as[Option[TypoPgNodeTree]]
        indpred <- c.downField("indpred").as[Option[TypoPgNodeTree]]
      } yield PgIndexRow(indexrelid, indrelid, indnatts, indnkeyatts, indisunique, indisprimary, indisexclusion, indimmediate, indisclustered, indisvalid, indcheckxmin, indisready, indislive, indisreplident, indkey, indcollation, indclass, indoption, indexprs, indpred)
  implicit val encoder: Encoder[PgIndexRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "indexrelid" := row.indexrelid,
        "indrelid" := row.indrelid,
        "indnatts" := row.indnatts,
        "indnkeyatts" := row.indnkeyatts,
        "indisunique" := row.indisunique,
        "indisprimary" := row.indisprimary,
        "indisexclusion" := row.indisexclusion,
        "indimmediate" := row.indimmediate,
        "indisclustered" := row.indisclustered,
        "indisvalid" := row.indisvalid,
        "indcheckxmin" := row.indcheckxmin,
        "indisready" := row.indisready,
        "indislive" := row.indislive,
        "indisreplident" := row.indisreplident,
        "indkey" := row.indkey,
        "indcollation" := row.indcollation,
        "indclass" := row.indclass,
        "indoption" := row.indoption,
        "indexprs" := row.indexprs,
        "indpred" := row.indpred
      )}
  implicit val read: Read[PgIndexRow] =
    new Read[PgIndexRow](
      gets = List(
        (Get[PgIndexId], Nullability.NoNulls),
        (Get[/* oid */ Long], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Int], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[Boolean], Nullability.NoNulls),
        (Get[TypoInt2Vector], Nullability.NoNulls),
        (Get[TypoOidVector], Nullability.NoNulls),
        (Get[TypoOidVector], Nullability.NoNulls),
        (Get[TypoInt2Vector], Nullability.NoNulls),
        (Get[TypoPgNodeTree], Nullability.Nullable),
        (Get[TypoPgNodeTree], Nullability.Nullable)
      ),
      unsafeGet = (rs: ResultSet, i: Int) => PgIndexRow(
        indexrelid = Get[PgIndexId].unsafeGetNonNullable(rs, i + 0),
        indrelid = Get[/* oid */ Long].unsafeGetNonNullable(rs, i + 1),
        indnatts = Get[Int].unsafeGetNonNullable(rs, i + 2),
        indnkeyatts = Get[Int].unsafeGetNonNullable(rs, i + 3),
        indisunique = Get[Boolean].unsafeGetNonNullable(rs, i + 4),
        indisprimary = Get[Boolean].unsafeGetNonNullable(rs, i + 5),
        indisexclusion = Get[Boolean].unsafeGetNonNullable(rs, i + 6),
        indimmediate = Get[Boolean].unsafeGetNonNullable(rs, i + 7),
        indisclustered = Get[Boolean].unsafeGetNonNullable(rs, i + 8),
        indisvalid = Get[Boolean].unsafeGetNonNullable(rs, i + 9),
        indcheckxmin = Get[Boolean].unsafeGetNonNullable(rs, i + 10),
        indisready = Get[Boolean].unsafeGetNonNullable(rs, i + 11),
        indislive = Get[Boolean].unsafeGetNonNullable(rs, i + 12),
        indisreplident = Get[Boolean].unsafeGetNonNullable(rs, i + 13),
        indkey = Get[TypoInt2Vector].unsafeGetNonNullable(rs, i + 14),
        indcollation = Get[TypoOidVector].unsafeGetNonNullable(rs, i + 15),
        indclass = Get[TypoOidVector].unsafeGetNonNullable(rs, i + 16),
        indoption = Get[TypoInt2Vector].unsafeGetNonNullable(rs, i + 17),
        indexprs = Get[TypoPgNodeTree].unsafeGetNullable(rs, i + 18),
        indpred = Get[TypoPgNodeTree].unsafeGetNullable(rs, i + 19)
      )
    )
  

}
