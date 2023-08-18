/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package sa
package pcc

import adventureworks.person.businessentity.BusinessentityId
import adventureworks.sales.creditcard.CreditcardId
import anorm.Column
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.OWrites
import play.api.libs.json.Reads
import play.api.libs.json.Writes
import scala.collection.immutable.ListMap
import scala.util.Try

case class PccViewRow(
  id: Option[Int],
  /** Points to [[sales.personcreditcard.PersoncreditcardRow.businessentityid]] */
  businessentityid: Option[BusinessentityId],
  /** Points to [[sales.personcreditcard.PersoncreditcardRow.creditcardid]] */
  creditcardid: Option[CreditcardId],
  /** Points to [[sales.personcreditcard.PersoncreditcardRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object PccViewRow {
  implicit lazy val reads: Reads[PccViewRow] = Reads[PccViewRow](json => JsResult.fromTry(
      Try(
        PccViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          businessentityid = json.\("businessentityid").toOption.map(_.as(BusinessentityId.reads)),
          creditcardid = json.\("creditcardid").toOption.map(_.as(CreditcardId.reads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[PccViewRow] = RowParser[PccViewRow] { row =>
    Success(
      PccViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        businessentityid = row(idx + 1)(Column.columnToOption(BusinessentityId.column)),
        creditcardid = row(idx + 2)(Column.columnToOption(CreditcardId.column)),
        modifieddate = row(idx + 3)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[PccViewRow] = OWrites[PccViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "businessentityid" -> Writes.OptionWrites(BusinessentityId.writes).writes(o.businessentityid),
      "creditcardid" -> Writes.OptionWrites(CreditcardId.writes).writes(o.creditcardid),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
