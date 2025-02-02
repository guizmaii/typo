/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package information_schema
package routine_privileges

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

case class RoutinePrivilegesViewRow(
  grantor: /* nullability unknown */ Option[String],
  grantee: /* nullability unknown */ Option[String],
  specificCatalog: /* nullability unknown */ Option[String],
  specificSchema: /* nullability unknown */ Option[String],
  specificName: /* nullability unknown */ Option[String],
  routineCatalog: /* nullability unknown */ Option[String],
  routineSchema: /* nullability unknown */ Option[String],
  routineName: /* nullability unknown */ Option[String],
  privilegeType: /* nullability unknown */ Option[String],
  isGrantable: /* nullability unknown */ Option[/* max 3 chars */ String]
)

object RoutinePrivilegesViewRow {
  implicit lazy val reads: Reads[RoutinePrivilegesViewRow] = Reads[RoutinePrivilegesViewRow](json => JsResult.fromTry(
      Try(
        RoutinePrivilegesViewRow(
          grantor = json.\("grantor").toOption.map(_.as(Reads.StringReads)),
          grantee = json.\("grantee").toOption.map(_.as(Reads.StringReads)),
          specificCatalog = json.\("specific_catalog").toOption.map(_.as(Reads.StringReads)),
          specificSchema = json.\("specific_schema").toOption.map(_.as(Reads.StringReads)),
          specificName = json.\("specific_name").toOption.map(_.as(Reads.StringReads)),
          routineCatalog = json.\("routine_catalog").toOption.map(_.as(Reads.StringReads)),
          routineSchema = json.\("routine_schema").toOption.map(_.as(Reads.StringReads)),
          routineName = json.\("routine_name").toOption.map(_.as(Reads.StringReads)),
          privilegeType = json.\("privilege_type").toOption.map(_.as(Reads.StringReads)),
          isGrantable = json.\("is_grantable").toOption.map(_.as(Reads.StringReads))
        )
      )
    ),
  )
  def rowParser(idx: Int): RowParser[RoutinePrivilegesViewRow] = RowParser[RoutinePrivilegesViewRow] { row =>
    Success(
      RoutinePrivilegesViewRow(
        grantor = row(idx + 0)(Column.columnToOption(Column.columnToString)),
        grantee = row(idx + 1)(Column.columnToOption(Column.columnToString)),
        specificCatalog = row(idx + 2)(Column.columnToOption(Column.columnToString)),
        specificSchema = row(idx + 3)(Column.columnToOption(Column.columnToString)),
        specificName = row(idx + 4)(Column.columnToOption(Column.columnToString)),
        routineCatalog = row(idx + 5)(Column.columnToOption(Column.columnToString)),
        routineSchema = row(idx + 6)(Column.columnToOption(Column.columnToString)),
        routineName = row(idx + 7)(Column.columnToOption(Column.columnToString)),
        privilegeType = row(idx + 8)(Column.columnToOption(Column.columnToString)),
        isGrantable = row(idx + 9)(Column.columnToOption(Column.columnToString))
      )
    )
  }
  implicit lazy val writes: OWrites[RoutinePrivilegesViewRow] = OWrites[RoutinePrivilegesViewRow](o =>
    new JsObject(ListMap[String, JsValue](
      "grantor" -> Writes.OptionWrites(Writes.StringWrites).writes(o.grantor),
      "grantee" -> Writes.OptionWrites(Writes.StringWrites).writes(o.grantee),
      "specific_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificCatalog),
      "specific_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificSchema),
      "specific_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.specificName),
      "routine_catalog" -> Writes.OptionWrites(Writes.StringWrites).writes(o.routineCatalog),
      "routine_schema" -> Writes.OptionWrites(Writes.StringWrites).writes(o.routineSchema),
      "routine_name" -> Writes.OptionWrites(Writes.StringWrites).writes(o.routineName),
      "privilege_type" -> Writes.OptionWrites(Writes.StringWrites).writes(o.privilegeType),
      "is_grantable" -> Writes.OptionWrites(Writes.StringWrites).writes(o.isGrantable)
    ))
  )
}
