package testdb.pg_catalog

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgMatviewsRow(
  /** Points to [[testdb.pg_catalog.PgNamespaceRow.nspname]] */
  schemaname: String,
  /** Points to [[testdb.pg_catalog.PgClassRow.relname]] */
  matviewname: String,
  matviewowner: /* unknown nullability */ Option[String],
  /** Points to [[testdb.pg_catalog.PgTablespaceRow.spcname]] */
  tablespace: String,
  /** Points to [[testdb.pg_catalog.PgClassRow.relhasindex]] */
  hasindexes: Boolean,
  /** Points to [[testdb.pg_catalog.PgClassRow.relispopulated]] */
  ispopulated: Boolean,
  definition: /* unknown nullability */ Option[String]
)

object PgMatviewsRow {
  implicit val rowParser: RowParser[PgMatviewsRow] = { row =>
    Success(
      PgMatviewsRow(
        schemaname = row[String]("schemaname"),
        matviewname = row[String]("matviewname"),
        matviewowner = row[/* unknown nullability */ Option[String]]("matviewowner"),
        tablespace = row[String]("tablespace"),
        hasindexes = row[Boolean]("hasindexes"),
        ispopulated = row[Boolean]("ispopulated"),
        definition = row[/* unknown nullability */ Option[String]]("definition")
      )
    )
  }

  implicit val oFormat: OFormat[PgMatviewsRow] = new OFormat[PgMatviewsRow]{
    override def writes(o: PgMatviewsRow): JsObject =
      Json.obj(
        "schemaname" -> o.schemaname,
      "matviewname" -> o.matviewname,
      "matviewowner" -> o.matviewowner,
      "tablespace" -> o.tablespace,
      "hasindexes" -> o.hasindexes,
      "ispopulated" -> o.ispopulated,
      "definition" -> o.definition
      )

    override def reads(json: JsValue): JsResult[PgMatviewsRow] = {
      JsResult.fromTry(
        Try(
          PgMatviewsRow(
            schemaname = json.\("schemaname").as[String],
            matviewname = json.\("matviewname").as[String],
            matviewowner = json.\("matviewowner").toOption.map(_.as[String]),
            tablespace = json.\("tablespace").as[String],
            hasindexes = json.\("hasindexes").as[Boolean],
            ispopulated = json.\("ispopulated").as[Boolean],
            definition = json.\("definition").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
