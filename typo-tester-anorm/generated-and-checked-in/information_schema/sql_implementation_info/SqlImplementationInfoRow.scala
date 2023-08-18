/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package sql_implementation_info

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

case class SqlImplementationInfoRow(
  implementationInfoId: Option[CharacterData],
  implementationInfoName: Option[CharacterData],
  integerValue: Option[CardinalNumber],
  characterValue: Option[CharacterData],
  comments: Option[CharacterData]
)

object SqlImplementationInfoRow {
  implicit lazy val reads: Reads[SqlImplementationInfoRow] = Reads[SqlImplementationInfoRow](json => JsResult.fromTry(
      Try(
        SqlImplementationInfoRow(
          implementationInfoId = json.\("implementation_info_id").toOption.map(_.as(CharacterData.reads)),
          implementationInfoName = json.\("implementation_info_name").toOption.map(_.as(CharacterData.reads)),
          integerValue = json.\("integer_value").toOption.map(_.as(CardinalNumber.reads)),
          characterValue = json.\("character_value").toOption.map(_.as(CharacterData.reads)),
          comments = json.\("comments").toOption.map(_.as(CharacterData.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[SqlImplementationInfoRow] = RowParser[SqlImplementationInfoRow] { row =>
    Success(
      SqlImplementationInfoRow(
        implementationInfoId = row(idx + 0)(Column.columnToOption(CharacterData.column)),
        implementationInfoName = row(idx + 1)(Column.columnToOption(CharacterData.column)),
        integerValue = row(idx + 2)(Column.columnToOption(CardinalNumber.column)),
        characterValue = row(idx + 3)(Column.columnToOption(CharacterData.column)),
        comments = row(idx + 4)(Column.columnToOption(CharacterData.column))
      )
    )
  }
  implicit lazy val writes: OWrites[SqlImplementationInfoRow] = OWrites[SqlImplementationInfoRow](o =>
    new JsObject(ListMap[String, JsValue](
      "implementation_info_id" -> Writes.OptionWrites(CharacterData.writes).writes(o.implementationInfoId),
      "implementation_info_name" -> Writes.OptionWrites(CharacterData.writes).writes(o.implementationInfoName),
      "integer_value" -> Writes.OptionWrites(CardinalNumber.writes).writes(o.integerValue),
      "character_value" -> Writes.OptionWrites(CharacterData.writes).writes(o.characterValue),
      "comments" -> Writes.OptionWrites(CharacterData.writes).writes(o.comments)
    ))
  )
}
