/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_stat_slru

import adventureworks.customtypes.TypoInstant
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgStatSlruViewRow(
  name: /* nullability unknown */ Option[String],
  blksZeroed: /* nullability unknown */ Option[Long],
  blksHit: /* nullability unknown */ Option[Long],
  blksRead: /* nullability unknown */ Option[Long],
  blksWritten: /* nullability unknown */ Option[Long],
  blksExists: /* nullability unknown */ Option[Long],
  flushes: /* nullability unknown */ Option[Long],
  truncates: /* nullability unknown */ Option[Long],
  statsReset: /* nullability unknown */ Option[TypoInstant]
)

object PgStatSlruViewRow {
  implicit lazy val decoder: Decoder[PgStatSlruViewRow] = Decoder.forProduct9[PgStatSlruViewRow, /* nullability unknown */ Option[String], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[TypoInstant]]("name", "blks_zeroed", "blks_hit", "blks_read", "blks_written", "blks_exists", "flushes", "truncates", "stats_reset")(PgStatSlruViewRow.apply)(Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(Decoder.decodeLong), Decoder.decodeOption(TypoInstant.decoder))
  implicit lazy val encoder: Encoder[PgStatSlruViewRow] = Encoder.forProduct9[PgStatSlruViewRow, /* nullability unknown */ Option[String], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[Long], /* nullability unknown */ Option[TypoInstant]]("name", "blks_zeroed", "blks_hit", "blks_read", "blks_written", "blks_exists", "flushes", "truncates", "stats_reset")(x => (x.name, x.blksZeroed, x.blksHit, x.blksRead, x.blksWritten, x.blksExists, x.flushes, x.truncates, x.statsReset))(Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(Encoder.encodeLong), Encoder.encodeOption(TypoInstant.encoder))
  implicit lazy val read: Read[PgStatSlruViewRow] = new Read[PgStatSlruViewRow](
    gets = List(
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (Meta.LongMeta.get, Nullability.Nullable),
      (TypoInstant.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgStatSlruViewRow(
      name = Meta.StringMeta.get.unsafeGetNullable(rs, i + 0),
      blksZeroed = Meta.LongMeta.get.unsafeGetNullable(rs, i + 1),
      blksHit = Meta.LongMeta.get.unsafeGetNullable(rs, i + 2),
      blksRead = Meta.LongMeta.get.unsafeGetNullable(rs, i + 3),
      blksWritten = Meta.LongMeta.get.unsafeGetNullable(rs, i + 4),
      blksExists = Meta.LongMeta.get.unsafeGetNullable(rs, i + 5),
      flushes = Meta.LongMeta.get.unsafeGetNullable(rs, i + 6),
      truncates = Meta.LongMeta.get.unsafeGetNullable(rs, i + 7),
      statsReset = TypoInstant.get.unsafeGetNullable(rs, i + 8)
    )
  )
}
