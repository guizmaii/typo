/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesterritory

import adventureworks.person.countryregion.CountryregionId
import adventureworks.public.Name
import io.circe.Decoder
import io.circe.Encoder
import io.circe.HCursor
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

case class SalesterritoryRow(
  /** Primary key for SalesTerritory records. */
  territoryid: SalesterritoryId,
  /** Sales territory description */
  name: Name,
  /** ISO standard country or region code. Foreign key to CountryRegion.CountryRegionCode.
      Points to [[person.countryregion.CountryregionRow.countryregioncode]] */
  countryregioncode: CountryregionId,
  /** Geographic area to which the sales territory belong. */
  group: /* max 50 chars */ String,
  /** Sales in the territory year to date. */
  salesytd: BigDecimal,
  /** Sales in the territory the previous year. */
  saleslastyear: BigDecimal,
  /** Business costs in the territory year to date. */
  costytd: BigDecimal,
  /** Business costs in the territory the previous year. */
  costlastyear: BigDecimal,
  rowguid: UUID,
  modifieddate: LocalDateTime
)

object SalesterritoryRow {
  implicit val decoder: Decoder[SalesterritoryRow] =
    (c: HCursor) =>
      for {
        territoryid <- c.downField("territoryid").as[SalesterritoryId]
        name <- c.downField("name").as[Name]
        countryregioncode <- c.downField("countryregioncode").as[CountryregionId]
        group <- c.downField("group").as[/* max 50 chars */ String]
        salesytd <- c.downField("salesytd").as[BigDecimal]
        saleslastyear <- c.downField("saleslastyear").as[BigDecimal]
        costytd <- c.downField("costytd").as[BigDecimal]
        costlastyear <- c.downField("costlastyear").as[BigDecimal]
        rowguid <- c.downField("rowguid").as[UUID]
        modifieddate <- c.downField("modifieddate").as[LocalDateTime]
      } yield SalesterritoryRow(territoryid, name, countryregioncode, group, salesytd, saleslastyear, costytd, costlastyear, rowguid, modifieddate)
  implicit val encoder: Encoder[SalesterritoryRow] = {
    import io.circe.syntax._
    row =>
      Json.obj(
        "territoryid" := row.territoryid,
        "name" := row.name,
        "countryregioncode" := row.countryregioncode,
        "group" := row.group,
        "salesytd" := row.salesytd,
        "saleslastyear" := row.saleslastyear,
        "costytd" := row.costytd,
        "costlastyear" := row.costlastyear,
        "rowguid" := row.rowguid,
        "modifieddate" := row.modifieddate
      )}
}
