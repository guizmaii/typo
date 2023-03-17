package testdb
package pg_catalog

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatProgressBasebackupRow(
  pid: /* unknown nullability */ Option[Int],
  phase: /* unknown nullability */ Option[String],
  backupTotal: /* unknown nullability */ Option[Long],
  backupStreamed: /* unknown nullability */ Option[Long],
  tablespacesTotal: /* unknown nullability */ Option[Long],
  tablespacesStreamed: /* unknown nullability */ Option[Long]
)

object PgStatProgressBasebackupRow {
  implicit val rowParser: RowParser[PgStatProgressBasebackupRow] = { row =>
    Success(
      PgStatProgressBasebackupRow(
        pid = row[/* unknown nullability */ Option[Int]]("pid"),
        phase = row[/* unknown nullability */ Option[String]]("phase"),
        backupTotal = row[/* unknown nullability */ Option[Long]]("backup_total"),
        backupStreamed = row[/* unknown nullability */ Option[Long]]("backup_streamed"),
        tablespacesTotal = row[/* unknown nullability */ Option[Long]]("tablespaces_total"),
        tablespacesStreamed = row[/* unknown nullability */ Option[Long]]("tablespaces_streamed")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatProgressBasebackupRow] = new OFormat[PgStatProgressBasebackupRow]{
    override def writes(o: PgStatProgressBasebackupRow): JsObject =
      Json.obj(
        "pid" -> o.pid,
      "phase" -> o.phase,
      "backup_total" -> o.backupTotal,
      "backup_streamed" -> o.backupStreamed,
      "tablespaces_total" -> o.tablespacesTotal,
      "tablespaces_streamed" -> o.tablespacesStreamed
      )

    override def reads(json: JsValue): JsResult[PgStatProgressBasebackupRow] = {
      JsResult.fromTry(
        Try(
          PgStatProgressBasebackupRow(
            pid = json.\("pid").toOption.map(_.as[Int]),
            phase = json.\("phase").toOption.map(_.as[String]),
            backupTotal = json.\("backup_total").toOption.map(_.as[Long]),
            backupStreamed = json.\("backup_streamed").toOption.map(_.as[Long]),
            tablespacesTotal = json.\("tablespaces_total").toOption.map(_.as[Long]),
            tablespacesStreamed = json.\("tablespaces_streamed").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
