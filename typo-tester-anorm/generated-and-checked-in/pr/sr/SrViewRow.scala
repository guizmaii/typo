/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pr
package sr

import adventureworks.production.scrapreason.ScrapreasonId
import adventureworks.public.Name
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

case class SrViewRow(
  id: Option[Int],
  /** Points to [[production.scrapreason.ScrapreasonRow.scrapreasonid]] */
  scrapreasonid: Option[ScrapreasonId],
  /** Points to [[production.scrapreason.ScrapreasonRow.name]] */
  name: Option[Name],
  /** Points to [[production.scrapreason.ScrapreasonRow.modifieddate]] */
  modifieddate: Option[TypoLocalDateTime]
)

object SrViewRow {
  implicit lazy val reads: Reads[SrViewRow] = Reads[SrViewRow](json => JsResult.fromTry(
      Try(
        SrViewRow(
          id = json.\("id").toOption.map(_.as(Reads.IntReads)),
          scrapreasonid = json.\("scrapreasonid").toOption.map(_.as(ScrapreasonId.reads)),
          name = json.\("name").toOption.map(_.as(Name.reads)),
          modifieddate = json.\("modifieddate").toOption.map(_.as(TypoLocalDateTime.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SrViewRow] = RowParser[SrViewRow] { row =>
    Success(
      SrViewRow(
        id = row(idx + 0)(Column.columnToOption(Column.columnToInt)),
        scrapreasonid = row(idx + 1)(Column.columnToOption(ScrapreasonId.column)),
        name = row(idx + 2)(Column.columnToOption(Name.column)),
        modifieddate = row(idx + 3)(Column.columnToOption(TypoLocalDateTime.column))
      )
    )
  }
  implicit lazy val writes: OWrites[SrViewRow] = OWrites[SrViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "id" -> Writes.OptionWrites(Writes.IntWrites).writes(o.id),
      "scrapreasonid" -> Writes.OptionWrites(ScrapreasonId.writes).writes(o.scrapreasonid),
      "name" -> Writes.OptionWrites(Name.writes).writes(o.name),
      "modifieddate" -> Writes.OptionWrites(TypoLocalDateTime.writes).writes(o.modifieddate)
    ))
  )
}
