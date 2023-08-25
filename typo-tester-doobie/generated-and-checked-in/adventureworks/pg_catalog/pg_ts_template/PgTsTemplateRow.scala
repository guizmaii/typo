/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_template

import adventureworks.customtypes.TypoRegproc
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgTsTemplateRow(
  oid: PgTsTemplateId,
  tmplname: String,
  tmplnamespace: /* oid */ Long,
  tmplinit: TypoRegproc,
  tmpllexize: TypoRegproc
)

object PgTsTemplateRow {
  implicit lazy val decoder: Decoder[PgTsTemplateRow] = Decoder.forProduct5[PgTsTemplateRow, PgTsTemplateId, String, /* oid */ Long, TypoRegproc, TypoRegproc]("oid", "tmplname", "tmplnamespace", "tmplinit", "tmpllexize")(PgTsTemplateRow.apply)(PgTsTemplateId.decoder, Decoder.decodeString, Decoder.decodeLong, TypoRegproc.decoder, TypoRegproc.decoder)
  implicit lazy val encoder: Encoder[PgTsTemplateRow] = Encoder.forProduct5[PgTsTemplateRow, PgTsTemplateId, String, /* oid */ Long, TypoRegproc, TypoRegproc]("oid", "tmplname", "tmplnamespace", "tmplinit", "tmpllexize")(x => (x.oid, x.tmplname, x.tmplnamespace, x.tmplinit, x.tmpllexize))(PgTsTemplateId.encoder, Encoder.encodeString, Encoder.encodeLong, TypoRegproc.encoder, TypoRegproc.encoder)
  implicit lazy val read: Read[PgTsTemplateRow] = new Read[PgTsTemplateRow](
    gets = List(
      (PgTsTemplateId.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Meta.LongMeta.get, Nullability.NoNulls),
      (TypoRegproc.get, Nullability.NoNulls),
      (TypoRegproc.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgTsTemplateRow(
      oid = PgTsTemplateId.get.unsafeGetNonNullable(rs, i + 0),
      tmplname = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 1),
      tmplnamespace = Meta.LongMeta.get.unsafeGetNonNullable(rs, i + 2),
      tmplinit = TypoRegproc.get.unsafeGetNonNullable(rs, i + 3),
      tmpllexize = TypoRegproc.get.unsafeGetNonNullable(rs, i + 4)
    )
  )
}
