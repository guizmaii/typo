/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_authid

import adventureworks.customtypes.TypoOffsetDateTime
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgAuthidRow(
  oid: PgAuthidId,
  rolname: String,
  rolsuper: Boolean,
  rolinherit: Boolean,
  rolcreaterole: Boolean,
  rolcreatedb: Boolean,
  rolcanlogin: Boolean,
  rolreplication: Boolean,
  rolbypassrls: Boolean,
  rolconnlimit: Int,
  rolpassword: Option[String],
  rolvaliduntil: Option[TypoOffsetDateTime]
)

object PgAuthidRow {
  implicit lazy val decoder: Decoder[PgAuthidRow] = Decoder.forProduct12[PgAuthidRow, PgAuthidId, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Int, Option[String], Option[TypoOffsetDateTime]]("oid", "rolname", "rolsuper", "rolinherit", "rolcreaterole", "rolcreatedb", "rolcanlogin", "rolreplication", "rolbypassrls", "rolconnlimit", "rolpassword", "rolvaliduntil")(PgAuthidRow.apply)(PgAuthidId.decoder, Decoder.decodeString, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeBoolean, Decoder.decodeInt, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(TypoOffsetDateTime.decoder))
  implicit lazy val encoder: Encoder[PgAuthidRow] = Encoder.forProduct12[PgAuthidRow, PgAuthidId, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Int, Option[String], Option[TypoOffsetDateTime]]("oid", "rolname", "rolsuper", "rolinherit", "rolcreaterole", "rolcreatedb", "rolcanlogin", "rolreplication", "rolbypassrls", "rolconnlimit", "rolpassword", "rolvaliduntil")(x => (x.oid, x.rolname, x.rolsuper, x.rolinherit, x.rolcreaterole, x.rolcreatedb, x.rolcanlogin, x.rolreplication, x.rolbypassrls, x.rolconnlimit, x.rolpassword, x.rolvaliduntil))(PgAuthidId.encoder, Encoder.encodeString, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeBoolean, Encoder.encodeInt, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(TypoOffsetDateTime.encoder))
  implicit lazy val read: Read[PgAuthidRow] = new Read[PgAuthidRow](
    gets = List(
      (PgAuthidId.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.BooleanMeta.get, Nullability.NoNulls),
      (Meta.IntMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (TypoOffsetDateTime.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgAuthidRow(
      oid = PgAuthidId.get.unsafeGetNonNullable(rs, i + 0),
      rolname = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 1),
      rolsuper = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 2),
      rolinherit = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 3),
      rolcreaterole = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 4),
      rolcreatedb = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 5),
      rolcanlogin = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 6),
      rolreplication = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 7),
      rolbypassrls = Meta.BooleanMeta.get.unsafeGetNonNullable(rs, i + 8),
      rolconnlimit = Meta.IntMeta.get.unsafeGetNonNullable(rs, i + 9),
      rolpassword = Meta.StringMeta.get.unsafeGetNullable(rs, i + 10),
      rolvaliduntil = TypoOffsetDateTime.get.unsafeGetNullable(rs, i + 11)
    )
  )
}
