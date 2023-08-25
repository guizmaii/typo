/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package bea

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.person.address.AddressId
import adventureworks.person.addresstype.AddresstypeId
import adventureworks.person.businessentity.BusinessentityId
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

case class BeaViewRow(
  id: Option[Int],
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.addressid]] */
  addressid: Option[AddressId],
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.addresstypeid]] */
  addresstypeid: Option[AddresstypeId],
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[person.businessentityaddress.BusinessentityaddressRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object BeaViewRow {
  implicit lazy val reads: Reads[BeaViewRow] = Reads[BeaViewRow](json => JsResult.fromTry(
      Try(
        BeaViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          businessentityid = json.\("businessentityid").toOption.map(_.as(BusinessentityId.reads)),
          addressid = json.\("addressid").toOption.map(_.as(AddressId.reads)),
          addresstypeid = json.\("addresstypeid").toOption.map(_.as(AddresstypeId.reads)),
          rowguid = json.\("rowguid").toOption.map(_.as(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[BeaViewRow] = RowParser[BeaViewRow] { row =>
    Success(
      BeaViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        businessentityid = row(idx + 1)(Column.columnToOption(BusinessentityId.column)),
        addressid = row(idx + 2)(Column.columnToOption(AddressId.column)),
        addresstypeid = row(idx + 3)(Column.columnToOption(AddresstypeId.column)),
        rowguid = row(idx + 4)(Column.columnToOption(Column.columnToUUID)),
        modifieddate = row(idx + 5)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[BeaViewRow] = OWrites[BeaViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "businessentityid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.businessentityid),
      "addressid" -> Writes.OptionWrites(AddressId.writes).writes(o.addressid),
      "addresstypeid" -> Writes.OptionWrites(AddresstypeId.writes).writes(o.addresstypeid),
      "rowguid" -> Writes.OptionWrites(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
