/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_server

import adventureworks.customtypes.TypoAclItem
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class PgForeignServerRow(
  oid: PgForeignServerId,
  srvname: String,
  srvowner: /* oid */ Long,
  srvfdw: /* oid */ Long,
  srvtype: Option[String],
  srvversion: Option[String],
  srvacl: Option[Array[TypoAclItem]],
  srvoptions: Option[Array[String]]
)

object PgForeignServerRow {
  implicit lazy val decoder: Decoder[PgForeignServerRow] = Decoder.forProduct8[PgForeignServerRow, PgForeignServerId, String, /* oid */ Long, /* oid */ Long, Option[String], Option[String], Option[Array[TypoAclItem]], Option[Array[String]]]("oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions")(PgForeignServerRow.apply)(PgForeignServerId.decoder, Decoder.decodeString, Decoder.decodeLong, Decoder.decodeLong, Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeString), Decoder.decodeOption(Decoder.decodeArray[TypoAclItem](TypoAclItem.decoder, implicitly)), Decoder.decodeOption(Decoder.decodeArray[String](Decoder.decodeString, implicitly)))
  implicit lazy val encoder: Encoder[PgForeignServerRow] = Encoder.forProduct8[PgForeignServerRow, PgForeignServerId, String, /* oid */ Long, /* oid */ Long, Option[String], Option[String], Option[Array[TypoAclItem]], Option[Array[String]]]("oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions")(x => (x.oid, x.srvname, x.srvowner, x.srvfdw, x.srvtype, x.srvversion, x.srvacl, x.srvoptions))(PgForeignServerId.encoder, Encoder.encodeString, Encoder.encodeLong, Encoder.encodeLong, Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeString), Encoder.encodeOption(Encoder.encodeIterable[TypoAclItem, Array](TypoAclItem.encoder, implicitly)), Encoder.encodeOption(Encoder.encodeIterable[String, Array](Encoder.encodeString, implicitly)))
  implicit lazy val read: Read[PgForeignServerRow] = new Read[PgForeignServerRow](
    gets = List(
      (PgForeignServerId.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.NoNulls),
      (Meta.LongMeta.get, Nullability.NoNulls),
      (Meta.LongMeta.get, Nullability.NoNulls),
      (Meta.StringMeta.get, Nullability.Nullable),
      (Meta.StringMeta.get, Nullability.Nullable),
      (TypoAclItem.arrayGet, Nullability.Nullable),
      (adventureworks.StringArrayMeta.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => PgForeignServerRow(
      oid = PgForeignServerId.get.unsafeGetNonNullable(rs, i + 0),
      srvname = Meta.StringMeta.get.unsafeGetNonNullable(rs, i + 1),
      srvowner = Meta.LongMeta.get.unsafeGetNonNullable(rs, i + 2),
      srvfdw = Meta.LongMeta.get.unsafeGetNonNullable(rs, i + 3),
      srvtype = Meta.StringMeta.get.unsafeGetNullable(rs, i + 4),
      srvversion = Meta.StringMeta.get.unsafeGetNullable(rs, i + 5),
      srvacl = TypoAclItem.arrayGet.unsafeGetNullable(rs, i + 6),
      srvoptions = adventureworks.StringArrayMeta.get.unsafeGetNullable(rs, i + 7)
    )
  )
}
