package testdb
package information_schema

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class CheckConstraintsRow(
  constraintCatalog: /* unknown nullability */ Option[String],
  constraintSchema: /* unknown nullability */ Option[String],
  constraintName: /* unknown nullability */ Option[String],
  checkClause: /* unknown nullability */ Option[String]
)

object CheckConstraintsRow {
  implicit val rowParser: RowParser[CheckConstraintsRow] = { row =>
    Success(
      CheckConstraintsRow(
        constraintCatalog = row[/* unknown nullability */ Option[String]]("constraint_catalog"),
        constraintSchema = row[/* unknown nullability */ Option[String]]("constraint_schema"),
        constraintName = row[/* unknown nullability */ Option[String]]("constraint_name"),
        checkClause = row[/* unknown nullability */ Option[String]]("check_clause")
      )
    )
  }

  implicit val oFormat: OFormat[CheckConstraintsRow] = new OFormat[CheckConstraintsRow]{
    override def writes(o: CheckConstraintsRow): JsObject =
      Json.obj(
        "constraint_catalog" -> o.constraintCatalog,
      "constraint_schema" -> o.constraintSchema,
      "constraint_name" -> o.constraintName,
      "check_clause" -> o.checkClause
      )

    override def reads(json: JsValue): JsResult[CheckConstraintsRow] = {
      JsResult.fromTry(
        Try(
          CheckConstraintsRow(
            constraintCatalog = json.\("constraint_catalog").toOption.map(_.as[String]),
            constraintSchema = json.\("constraint_schema").toOption.map(_.as[String]),
            constraintName = json.\("constraint_name").toOption.map(_.as[String]),
            checkClause = json.\("check_clause").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
