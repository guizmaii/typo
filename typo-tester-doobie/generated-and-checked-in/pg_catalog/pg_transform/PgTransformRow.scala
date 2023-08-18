/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_transform

import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgTransformRow(
  oid: PgTransformId,
  trftype: /* oid */ Long,
  trflang: /* oid */ Long,
  trffromsql: TypoRegproc,
  trftosql: TypoRegproc
)

object PgTransformRow {
  implicit lazy val decoder: Decoder[PgTransformRow] = Decoder.forProduct5[PgTransformRow, PgTransformId, /* oid */ Long, /* oid */ Long, TypoRegproc, TypoRegproc]("oid", "trftype", "trflang", "trffromsql", "trftosql")(PgTransformRow.apply)(PgTransformId.decoder, Decoder.decodeLong, Decoder.decodeLong, TypoRegproc.decoder, TypoRegproc.decoder)
  implicit lazy val encoder: Encoder[PgTransformRow] = Encoder.forProduct5[PgTransformRow, PgTransformId, /* oid */ Long, /* oid */ Long, TypoRegproc, TypoRegproc]("oid", "trftype", "trflang", "trffromsql", "trftosql")(x => (x.oid, x.trftype, x.trflang, x.trffromsql, x.trftosql))(PgTransformId.encoder, Encoder.encodeLong, Encoder.encodeLong, TypoRegproc.encoder, TypoRegproc.encoder)
  implicit lazy val read: Read[PgTransformRow] = new Read[PgTransformRow](
    gets = List(
      (PgTransformId.get, Nullability.NoNulls),
      (Meta.LongMeta.get, Nullability.NoNulls),
      (Meta.LongMeta.get, Nullability.NoNulls),
      (TypoRegproc.get, Nullability.NoNulls),
      (TypoRegproc.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgTransformRow(
      oid = PgTransformId.get.unsafeGetNonNullable(rs, i + 0),
      trftype = Meta.LongMeta.get.unsafeGetNonNullable(rs, i + 1),
      trflang = Meta.LongMeta.get.unsafeGetNonNullable(rs, i + 2),
      trffromsql = TypoRegproc.get.unsafeGetNonNullable(rs, i + 3),
      trftosql = TypoRegproc.get.unsafeGetNonNullable(rs, i + 4)
    )
  )
}
