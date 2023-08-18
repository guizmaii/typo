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
import java.util.UUID
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

/** This class corresponds to a row in table `sales.customer` which has not been persisted yet */
case class CustomerRowUnsaved(
  /** Foreign key to Person.BusinessEntityID
      Points to [[person.person.PersonRow.businessentityid]] */
  personid: Option[BusinessentityId],
  /** Foreign key to Store.BusinessEntityID
      Points to [[store.StoreRow.businessentityid]] */
  storeid: Option[BusinessentityId],
  /** ID of the territory in which the customer is located. Foreign key to SalesTerritory.SalesTerritoryID.
      Points to [[salesterritory.SalesterritoryRow.territoryid]] */
  territoryid: Option[SalesterritoryId],
  /** Default: nextval('sales.customer_customerid_seq'::regclass)
      Primary key. */
  customerid: Defaulted[CustomerId] = Defaulted.UseDefault,
  /** Default: uuid_generate_v1() */
  rowguid: Defaulted[UUID] = Defaulted.UseDefault,
  /** Default: now() */
  modifieddate: Defaulted[TypoLocalDateTime] = Defaulted.UseDefault
) {
  def toRow(customeridDefault: => CustomerId, rowguidDefault: => UUID, modifieddateDefault: => TypoLocalDateTime): CustomerRow =
    CustomerRow(
      personid = personid,
      storeid = storeid,
      territoryid = territoryid,
      customerid = customerid match {
                     case Defaulted.UseDefault => customeridDefault
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
object CustomerRowUnsaved {
  implicit lazy val reads: Reads[CustomerRowUnsaved] = Reads[CustomerRowUnsaved](json => JsResult.fromTry(
      Try(
        CustomerRowUnsaved(
          personid = json.\("personid").toOption.map(_.as(BusinessentityId.reads)),
          storeid = json.\("storeid").toOption.map(_.as(BusinessentityId.reads)),
          territoryid = json.\("territoryid").toOption.map(_.as(SalesterritoryId.reads)),
          customerid = json.\("customerid").as(Defaulted.reads(CustomerId.reads)),
          rowguid = json.\("rowguid").as(Defaulted.reads(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").as(Defaulted.reads(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  implicit lazy val writes: OWrites[CustomerRowUnsaved] = OWrites[CustomerRowUnsaved](o =>
    new JsObject(ListMap[String, JsValue](
      "personid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.personid),
      "storeid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.storeid),
      "territoryid" -> Writes.OptionWrites(SalesterritoryId.writes).writes(o.territoryid),
      "customerid" -> Defaulted.writes(CustomerId.writes).writes(o.customerid),
      "rowguid" -> Defaulted.writes(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Defaulted.writes(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
