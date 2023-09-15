/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package salesperson

import adventureworks.customtypes.Defaulted
import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.customtypes.TypoUUID
import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `sales.salesperson` which has not been persisted yet */
case class SalespersonRowUnsaved(
  /** Primary key for SalesPerson records. Foreign key to Employee.BusinessEntityID
      Points to [[humanresources.employee.EmployeeRow.businessentityid]] */
  businessentityid: BusinessentityId,
  /** Territory currently assigned to. Foreign key to SalesTerritory.SalesTerritoryID.
      Points to [[salesterritory.SalesterritoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Projected yearly sales.
      Constraint CK_SalesPerson_SalesQuota affecting columns "salesquota":  ((salesquota > 0.00)) */
  salesquota: Option[BigDecimal],
  /** Default: 0.00
      Bonus due if quota is met.
      Constraint CK_SalesPerson_Bonus affecting columns "bonus":  ((bonus >= 0.00)) */
  bonus: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Commision percent received per sale.
      Constraint CK_SalesPerson_CommissionPct affecting columns "commissionpct":  ((commissionpct >= 0.00)) */
  commissionpct: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Sales total year to date.
      Constraint CK_SalesPerson_SalesYTD affecting columns "salesytd":  ((salesytd >= 0.00)) */
  salesytd: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: 0.00
      Sales total of previous year.
      Constraint CK_SalesPerson_SalesLastYear affecting columns "saleslastyear":  ((saleslastyear >= 0.00)) */
  saleslastyear: Defaulted[BigDecimal] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[TypoUUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(bonusDefault: => BigDecimal, commissionpctDefault: => BigDecimal, salesytdDefault: => BigDecimal, saleslastyearDefault: => BigDecimal, rowguidDefault: => TypoUUID, modifieddateDefault: => TypoLocalDateTime): SalespersonRow =
    SalespersonRow(
      businessentityid = businessentityid,
      territoryid = territoryid,
      salesquota = salesquota,
      bonus = bonus match {
                case Defaulted.UseDefault => bonusDefault
                case Defaulted.Provided(value) => value
              },
      commissionpct = commissionpct match {
                        case Defaulted.UseDefault => commissionpctDefault
                        case Defaulted.Provided(value) => value
                      },
      salesytd = salesytd match {
                   case Defaulted.UseDefault => salesytdDefault
                   case Defaulted.Provided(value) => value
                 },
      saleslastyear = saleslastyear match {
                        case Defaulted.UseDefault => saleslastyearDefault
                        case Defaulted.Provided(value) => value
                      },
      rowguid = rowguid match {
                  case Defaulted.UseDefault => rowguidDefault
                  case Defaulted.Provided(value) => value
                },
      modifieddate = modifieddate match {
                       case Defaulted.UseDefault => modifieddateDefault
                       case Defaulted.Provided(value) => value
                     }
    )
}
object SalespersonRowUnsaved {
  implicit lazy val reads: Reads[SalespersonRowUnsaved] = Reads[SalespersonRowUnsaved](json => JsResult.fromTry(
      Try(
        SalespersonRowUnsaved(
          businessentityid = json.\("businessentityid").as(BusinessentityId.reads),
          territoryid = json.\("territoryid").toOption.map(_.as(SalesterritoryId.reads)),
          salesquota = json.\("salesquota").toOption.map(_.as(Reads.bigDecReads)),
          bonus = json.\("bonus").as(Defaulted.reads(Reads.bigDecReads)),
          commissionpct = json.\("commissionpct").as(Defaulted.reads(Reads.bigDecReads)),
          salesytd = json.\("salesytd").as(Defaulted.reads(Reads.bigDecReads)),
          saleslastyear = json.\("saleslastyear").as(Defaulted.reads(Reads.bigDecReads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(TypoUUID.reads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[SalespersonRowUnsaved] = OWrites[SalespersonRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "businessentityid" -> BusinessentityId.writes.writes(o.businessentityid),
      "territoryid" -> Writes.OptionWrites(SalesterritoryId.writes).writes(o.territoryid),
      "salesquota" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.salesquota),
      "bonus" -> Defaulted.writes(Writes.BigDecimalWrites).writes(o.bonus),
      "commissionpct" -> Defaulted.writes(Writes.BigDecimalWrites).writes(o.commissionpct),
      "salesytd" -> Defaulted.writes(Writes.BigDecimalWrites).writes(o.salesytd),
      "saleslastyear" -> Defaulted.writes(Writes.BigDecimalWrites).writes(o.saleslastyear),
      "rowguid" -> Defaulted.writes(TypoUUID.writes).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
