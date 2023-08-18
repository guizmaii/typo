/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sales
package customer

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.salesterritory.SalesterritoryId
import anorm.Column
import anorm.RowParser
import anorm.Success
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class CustomerRow(
  /** Primary key. */
  customerid: CustomerId,
  /** Foreign key to Person.BusinessEntityID
      Points to [[person.person.PersonRow.businessentityid]] */
  personid: Option[BusinessentityId],
  /** Foreign key to Store.BusinessEntityID
      Points to [[store.StoreRow.businessentityid]] */
  storeid: Option[BusinessentityId],
  /** ID of the territory in which the customer is located. Foreign key to SalesTerritory.SalesTerritoryID.
      Points to [[salesterritory.SalesterritoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  rowguid: UUID,
  modifieddate: TypoLocalDateTime
)

object CustomerRow {
  implicit lazy val reads: Reads[CustomerRow] = Reads[CustomerRow](json => JsResult.fromTry(
      Try(
        CustomerRow(
          customerid = json.\("customerid").as(CustomerId.reads),
          personid = json.\("personid").toOption.map(_.as(BusinessentityId.reads)),
          storeid = json.\("storeid").toOption.map(_.as(BusinessentityId.reads)),
          territoryid = json.\("territoryid").toOption.map(_.as(SalesterritoryId.reads)),
          rowguid = json.\("rowguid").as(Reads.uuidReads),
          modifieddate = json.\("modifieddate").as(TypoLocalDateTime.reads)
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[CustomerRow] = RowParser[CustomerRow] { row =>
    Success(
      CustomerRow(
        customerid = row(idx + 0)(CustomerId.column),
        personid = row(idx + 1)(Column.columnToOption(BusinessentityId.column)),
        storeid = row(idx + 2)(Column.columnToOption(BusinessentityId.column)),
        territoryid = row(idx + 3)(Column.columnToOption(SalesterritoryId.column)),
        rowguid = row(idx + 4)(Column.columnToUUID),
        modifieddate = row(idx + 5)(TypoLocalDateTime.column)
      )
    )
  }
  implicit lazy val writes: OWrites[CustomerRow] = OWrites[CustomerRow](o =>
    new JsObject(ListMap[String, JsValue](
      "customerid" -> CustomerId.writes.writes(o.customerid),
      "personid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.personid),
      "storeid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.storeid),
      "territoryid" -> Writes.OptionWrites(SalesterritoryId.writes).writes(o.territoryid),
      "rowguid" -> Writes.UuidWrites.writes(o.rowguid),
      "modifieddate" -> TypoLocalDateTime.writes.writes(o.modifieddate)
    ))
  )
}
