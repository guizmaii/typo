/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesperson

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import doobie.enumerated.Nullability
import doobie.util.Read
import doobie.util.meta.Meta
import io.circe.Decoder
import io.circe.Encoder
import java.sql.ResultSet
import java.util.UUID

case class SalespersonRow(
  /** Primary key for SalesPerson records. Foreign key to Employee.BusinessEntityID
      Points to [[humanresources.employee.EmployeeRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Territory currently assigned to. Foreign key to SalesTerritory.SalesTerritoryID.
      Points to [[salesterritory.SalesterritoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Projected yearly sales. */
  salesquota: Option[BigDecimal],
  /** Bonus due if quota is met. */
  bonus: BigDecimal,
  /** Commision percent received per sale. */
  commissionpct: BigDecimal,
  /** Sales total year to date. */
  salesytd: BigDecimal,
  /** Sales total of previous year. */
  saleslastyear: BigDecimal,
  rowguid: UUID,
  modifieddate: TypoLocalDateTime
)

object SalespersonRow {
  implicit lazy val decoder: Decoder[SalespersonRow] = Decoder.forProduct9[SalespersonRow, BusinessentityId, Option[SalesterritoryId], Option[BigDecimal], BigDecimal, BigDecimal, BigDecimal, BigDecimal, UUID, TypoLocalDateTime]("businessentityid", "territoryid", "salesquota", "bonus", "commissionpct", "salesytd", "saleslastyear", "rowguid", "modifieddate")(SalespersonRow.apply)(BusinessentityId.decoder, Decoder.decodeOption(SalesterritoryId.decoder), Decoder.decodeOption(Decoder.decodeBigDecimal), Decoder.decodeBigDecimal, Decoder.decodeBigDecimal, Decoder.decodeBigDecimal, Decoder.decodeBigDecimal, Decoder.decodeUUID, TypoLocalDateTime.decoder)
  implicit lazy val encoder: Encoder[SalespersonRow] = Encoder.forProduct9[SalespersonRow, BusinessentityId, Option[SalesterritoryId], Option[BigDecimal], BigDecimal, BigDecimal, BigDecimal, BigDecimal, UUID, TypoLocalDateTime]("businessentityid", "territoryid", "salesquota", "bonus", "commissionpct", "salesytd", "saleslastyear", "rowguid", "modifieddate")(x => (x.businessentityid, x.territoryid, x.salesquota, x.bonus, x.commissionpct, x.salesytd, x.saleslastyear, x.rowguid, x.modifieddate))(BusinessentityId.encoder, Encoder.encodeOption(SalesterritoryId.encoder), Encoder.encodeOption(Encoder.encodeBigDecimal), Encoder.encodeBigDecimal, Encoder.encodeBigDecimal, Encoder.encodeBigDecimal, Encoder.encodeBigDecimal, Encoder.encodeUUID, TypoLocalDateTime.encoder)
  implicit lazy val read: Read[SalespersonRow] = new Read[SalespersonRow](
    gets = List(
      (BusinessentityId.get, Nullability.NoNulls),
      (SalesterritoryId.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.Nullable),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (Meta.ScalaBigDecimalMeta.get, Nullability.NoNulls),
      (adventureworks.UUIDMeta.get, Nullability.NoNulls),
      (TypoLocalDateTime.get, Nullability.NoNulls)
    ),
    unsafeGet = (rs: ResultSet, i: Int) => SalespersonRow(
      businessentityid = BusinessentityId.get.unsafeGetNonNullable(rs, i + 0),
      territoryid = SalesterritoryId.get.unsafeGetNullable(rs, i + 1),
      salesquota = Meta.ScalaBigDecimalMeta.get.unsafeGetNullable(rs, i + 2),
      bonus = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 3),
      commissionpct = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 4),
      salesytd = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 5),
      saleslastyear = Meta.ScalaBigDecimalMeta.get.unsafeGetNonNullable(rs, i + 6),
      rowguid = adventureworks.UUIDMeta.get.unsafeGetNonNullable(rs, i + 7),
      modifieddate = TypoLocalDateTime.get.unsafeGetNonNullable(rs, i + 8)
    )
  )
}
