/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pe
package be

import adventureworks.customtypes.TypoLocalDateTime
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

case class BeViewRow(
  id: Option[Int],
  /** Points to [[person.businessentity.BusinessentityRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[person.businessentity.BusinessentityRow.rowguid]] */
  rowguid: Option[UUID],
  /** Points to [[person.businessentity.BusinessentityRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object BeViewRow {
  implicit lazy val reads: Reads[BeViewRow] = Reads[BeViewRow](json => JsResult.fromTry(
      Try(
        BeViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          businessentityid = json.\("businessentityid").toOption.map(_.as(BusinessentityId.reads)),
          rowguid = json.\("rowguid").toOption.map(_.as(Reads.uuidReads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[BeViewRow] = RowParser[BeViewRow] { row =>
    Success(
      BeViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        businessentityid = row(idx + 1)(Column.columnToOption(BusinessentityId.column)),
        rowguid = row(idx + 2)(Column.columnToOption(Column.columnToUUID)),
        modifieddate = row(idx + 3)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[BeViewRow] = OWrites[BeViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "businessentityid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.businessentityid),
      "rowguid" -> Writes.OptionWrites(Writes.UuidWrites).writes(o.rowguid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
