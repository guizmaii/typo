/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package domain_constraints

import doobie.enumerated.Nullability
import doobie.util.Read
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet

case class DomainConstraintsViewRow(
  constraintCatalog: Option[SqlIdentifier],
  constraintSchema: Option[SqlIdentifier],
  constraintName: Option[SqlIdentifier],
  domainCatalog: Option[SqlIdentifier],
  domainSchema: Option[SqlIdentifier],
  domainName: Option[SqlIdentifier],
  isDeferrable: Option[YesOrNo],
  initiallyDeferred: Option[YesOrNo]
)

object DomainConstraintsViewRow {
  implicit lazy val decoder: Decoder[DomainConstraintsViewRow] = Decoder.forProduct8[DomainConstraintsViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[YesOrNo], Option[YesOrNo]]("constraint_catalog", "constraint_schema", "constraint_name", "domain_catalog", "domain_schema", "domain_name", "is_deferrable", "initially_deferred")(DomainConstraintsViewRow.apply)(Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(SqlIdentifier.decoder), Decoder.decodeOption(YesOrNo.decoder), Decoder.decodeOption(YesOrNo.decoder))
  implicit lazy val encoder: Encoder[DomainConstraintsViewRow] = Encoder.forProduct8[DomainConstraintsViewRow, Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[SqlIdentifier], Option[YesOrNo], Option[YesOrNo]]("constraint_catalog", "constraint_schema", "constraint_name", "domain_catalog", "domain_schema", "domain_name", "is_deferrable", "initially_deferred")(x => (x.constraintCatalog, x.constraintSchema, x.constraintName, x.domainCatalog, x.domainSchema, x.domainName, x.isDeferrable, x.initiallyDeferred))(Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(SqlIdentifier.encoder), Encoder.encodeOption(YesOrNo.encoder), Encoder.encodeOption(YesOrNo.encoder))
  implicit lazy val read: Read[DomainConstraintsViewRow] = new Read[DomainConstraintsViewRow](
    gets = List(
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (SqlIdentifier.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable),
      (YesOrNo.get, Nullability.Nullable)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => DomainConstraintsViewRow(
      constraintCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 0),
      constraintSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 1),
      constraintName = SqlIdentifier.get.unsafeGetNullable(rs, i + 2),
      domainCatalog = SqlIdentifier.get.unsafeGetNullable(rs, i + 3),
      domainSchema = SqlIdentifier.get.unsafeGetNullable(rs, i + 4),
      domainName = SqlIdentifier.get.unsafeGetNullable(rs, i + 5),
      isDeferrable = YesOrNo.get.unsafeGetNullable(rs, i + 6),
      initiallyDeferred = YesOrNo.get.unsafeGetNullable(rs, i + 7)
    )
  )
}
