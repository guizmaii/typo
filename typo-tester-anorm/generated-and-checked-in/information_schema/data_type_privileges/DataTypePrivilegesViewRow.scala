/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package data_type_privileges

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

case class DataTypePrivilegesViewRow(
  objectCatalog: Option[SqlIdentifier],
  objectSchema: Option[SqlIdentifier],
  objectName: Option[SqlIdentifier],
  objectType: Option[CharacterData],
  /** Points to [[attributes.AttributesViewRow.dtdIdentifier]] */
  dtdIdentifier: Option[SqlIdentifier]
)

object DataTypePrivilegesViewRow {
  implicit lazy val reads: Reads[DataTypePrivilegesViewRow] = Reads[DataTypePrivilegesViewRow](json => JsResult.fromTry(
      Try(
        DataTypePrivilegesViewRow(
          objectCatalog = json.\("object_catalog").toOption.map(_.as(SqlIdentifier.reads)),
          objectSchema = json.\("object_schema").toOption.map(_.as(SqlIdentifier.reads)),
          objectName = json.\("object_name").toOption.map(_.as(SqlIdentifier.reads)),
          objectType = json.\("object_type").toOption.map(_.as(CharacterData.reads)),
          dtdIdentifier = json.\("dtd_identifier").toOption.map(_.as(SqlIdentifier.reads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[DataTypePrivilegesViewRow] = RowParser[DataTypePrivilegesViewRow] { row =>
    Success(
      DataTypePrivilegesViewRow(
        objectCatalog = row(idx + 0)(Column.columnToOption(SqlIdentifier.column)),
        objectSchema = row(idx + 1)(Column.columnToOption(SqlIdentifier.column)),
        objectName = row(idx + 2)(Column.columnToOption(SqlIdentifier.column)),
        objectType = row(idx + 3)(Column.columnToOption(CharacterData.column)),
        dtdIdentifier = row(idx + 4)(Column.columnToOption(SqlIdentifier.column))
      )
    )
  }
  implicit lazy val writes: OWrites[DataTypePrivilegesViewRow] = OWrites[DataTypePrivilegesViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "object_catalog" -> Writes.OptionWrites(SqlIdentifier.writes).writes(o.objectCatalog),
      "object_schema" -> Writes.OptionWrites(SqlIdentifier.writes).writes(o.objectSchema),
      "object_name" -> Writes.OptionWrites(SqlIdentifier.writes).writes(o.objectName),
      "object_type" -> Writes.OptionWrites(CharacterData.writes).writes(o.objectType),
      "dtd_identifier" -> Writes.OptionWrites(SqlIdentifier.writes).writes(o.dtdIdentifier)
    ))
  )
}
