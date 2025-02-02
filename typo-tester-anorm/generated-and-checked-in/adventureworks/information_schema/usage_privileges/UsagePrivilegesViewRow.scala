/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package usage_privileges

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

case class UsagePrivilegesViewRow(
  grantor: /* nullability unknown */ Option[String],
  grantee: /* nullability unknown */ Option[String],
  objectCatalog: /* nullability unknown */ Option[String],
  objectSchema: /* nullability unknown */ Option[String],
  objectName: /* nullability unknown */ Option[String],
  objectType: /* nullability unknown */ Option[String],
  privilegeType: /* nullability unknown */ Option[String],
  isGrantable: /* nullability unknown */ Option[/* max 3 chars */ String]
)

object UsagePrivilegesViewRow {
  implicit lazy val reads: Reads[UsagePrivilegesViewRow] = Reads[UsagePrivilegesViewRow](json => JsResult.fromTry(
      Try(
        UsagePrivilegesViewRow(
          grantor = json.\("grantor").toOption.map(_.as(Reads.StringReads)),
          grantee = json.\("grantee").toOption.map(_.as(Reads.StringReads)),
          objectCatalog = json.\("object_catalog").toOption.map(_.as(Reads.StringReads)),
          objectSchema = json.\("object_schema").toOption.map(_.as(Reads.StringReads)),
          objectName = json.\("object_name").toOption.map(_.as(Reads.StringReads)),
          objectType = json.\("object_type").toOption.map(_.as(Reads.StringReads)),
          privilegeType = json.\("privilege_type").toOption.map(_.as(Reads.StringReads)),
          isGrantable = json.\("is_grantable").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[UsagePrivilegesViewRow] = RowParser[UsagePrivilegesViewRow] { row =>
    Success(
      UsagePrivilegesViewRow(
        grantor = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        grantee = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        objectCatalog = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        objectSchema = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        objectName = row(idx + 4)(Column.columnToOption(Column.columnToString)),
        objectType = row(idx + 5)(Column.columnToOption(Column.columnToString)),
        privilegeType = row(idx + 6)(Column.columnToOption(Column.columnToString)),
        isGrantable = row(idx + 7)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[UsagePrivilegesViewRow] = OWrites[UsagePrivilegesViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "grantor" -> Writes.OptionWrites(Writes.StringWrites).writes(o.grantor),
      "grantee" -> Writes.OptionWrites(Writes.StringWrites).writes(o.grantee),
      "object_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.objectCatalog),
      "object_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.objectSchema),
      "object_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.objectName),
      "object_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.objectType),
      "privilege_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.privilegeType),
      "is_grantable" -> Writes.OptionWrites(Writes.StringWrites).writes(o.isGrantable)
    ))
  )
}
