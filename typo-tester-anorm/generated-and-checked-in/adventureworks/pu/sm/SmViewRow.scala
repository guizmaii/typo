/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pu
package sm

import adventureworks.customtypes.TypoLocalDateTime
import adventureworks.public.Name
import adventureworks.purchasing.shipmethod.ShipmethodId
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

case class SmViewRow(
  id: Option[Int],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.shipmethodid]] */
  shipmethodid: Option[ShipmethodId],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.name]] */
  name: Option[Name],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.shipbase]] */
  shipbase: Option[BigDecimal],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.shiprate]] */
  shiprate: Option[BigDecimal],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[purchasing.shipmethod.ShipmethodRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SmViewRow {
  implicit lazy val reads: Reads[SmViewRow] = Reads[SmViewRow](json => JsResult.fromTry(
      Try(
        SmViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          shipmethodid = json.\("shipmethodid").toOption.map(_.as(ShipmethodId.reads)),
          name = json.\("name").toOption.map(_.as(Name.reads)),
          shipbase = json.\("shipbase").toOption.map(_.as(Reads.bigDecReads)),
          shiprate = json.\("shiprate").toOption.map(_.as(Reads.bigDecReads)),
          rowguid = json.\("rowguid").toOption.map(_.as(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SmViewRow] = RowParser[SmViewRow] { row =>
    Success(
      SmViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        shipmethodid = row(idx + 1)(Column.columnToOption(ShipmethodId.column)),
        name = row(idx + 2)(Column.columnToOption(Name.column)),
        shipbase = row(idx + 3)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        shiprate = row(idx + 4)(Column.columnToOption(Column.columnToScalaBigDecimal)),
        rowguid = row(idx + 5)(Column.columnToOption(Column.columnToUUID)),
        modifieddate = row(idx + 6)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[SmViewRow] = OWrites[SmViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "shipmethodid" -> Writes.OptionWrites(ShipmethodId.writes).writes(o.shipmethodid),
      "name" -> Writes.OptionWrites(Name.writes).writes(o.name),
      "shipbase" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.shipbase),
      "shiprate" -> Writes.OptionWrites(Writes.BigDecimalWrites).writes(o.shiprate),
      "rowguid" -> Writes.OptionWrites(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
