package testdb.pg_catalog

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgStatProgressCreateIndexRow(
  pid: /* unknown nullability */ Option[Int],
  datid: /* unknown nullability */ Option[Long],
  /** Points to [[testdb.pg_catalog.PgDatabaseRow.datname]] */
  datname: String,
  relid: /* unknown nullability */ Option[Long],
  indexRelid: /* unknown nullability */ Option[Long],
  command: /* unknown nullability */ Option[String],
  phase: /* unknown nullability */ Option[String],
  lockersTotal: /* unknown nullability */ Option[Long],
  lockersDone: /* unknown nullability */ Option[Long],
  currentLockerPid: /* unknown nullability */ Option[Long],
  blocksTotal: /* unknown nullability */ Option[Long],
  blocksDone: /* unknown nullability */ Option[Long],
  tuplesTotal: /* unknown nullability */ Option[Long],
  tuplesDone: /* unknown nullability */ Option[Long],
  partitionsTotal: /* unknown nullability */ Option[Long],
  partitionsDone: /* unknown nullability */ Option[Long]
)

object PgStatProgressCreateIndexRow {
  implicit val rowParser: RowParser[PgStatProgressCreateIndexRow] = { row =>
    Success(
      PgStatProgressCreateIndexRow(
        pid = row[/* unknown nullability */ Option[Int]]("pid"),
        datid = row[/* unknown nullability */ Option[Long]]("datid"),
        datname = row[String]("datname"),
        relid = row[/* unknown nullability */ Option[Long]]("relid"),
        indexRelid = row[/* unknown nullability */ Option[Long]]("index_relid"),
        command = row[/* unknown nullability */ Option[String]]("command"),
        phase = row[/* unknown nullability */ Option[String]]("phase"),
        lockersTotal = row[/* unknown nullability */ Option[Long]]("lockers_total"),
        lockersDone = row[/* unknown nullability */ Option[Long]]("lockers_done"),
        currentLockerPid = row[/* unknown nullability */ Option[Long]]("current_locker_pid"),
        blocksTotal = row[/* unknown nullability */ Option[Long]]("blocks_total"),
        blocksDone = row[/* unknown nullability */ Option[Long]]("blocks_done"),
        tuplesTotal = row[/* unknown nullability */ Option[Long]]("tuples_total"),
        tuplesDone = row[/* unknown nullability */ Option[Long]]("tuples_done"),
        partitionsTotal = row[/* unknown nullability */ Option[Long]]("partitions_total"),
        partitionsDone = row[/* unknown nullability */ Option[Long]]("partitions_done")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatProgressCreateIndexRow] = new OFormat[PgStatProgressCreateIndexRow]{
    override def writes(o: PgStatProgressCreateIndexRow): JsObject =
      Json.obj(
        "pid" -> o.pid,
      "datid" -> o.datid,
      "datname" -> o.datname,
      "relid" -> o.relid,
      "index_relid" -> o.indexRelid,
      "command" -> o.command,
      "phase" -> o.phase,
      "lockers_total" -> o.lockersTotal,
      "lockers_done" -> o.lockersDone,
      "current_locker_pid" -> o.currentLockerPid,
      "blocks_total" -> o.blocksTotal,
      "blocks_done" -> o.blocksDone,
      "tuples_total" -> o.tuplesTotal,
      "tuples_done" -> o.tuplesDone,
      "partitions_total" -> o.partitionsTotal,
      "partitions_done" -> o.partitionsDone
      )

    override def reads(json: JsValue): JsResult[PgStatProgressCreateIndexRow] = {
      JsResult.fromTry(
        Try(
          PgStatProgressCreateIndexRow(
            pid = json.\("pid").toOption.map(_.as[Int]),
            datid = json.\("datid").toOption.map(_.as[Long]),
            datname = json.\("datname").as[String],
            relid = json.\("relid").toOption.map(_.as[Long]),
            indexRelid = json.\("index_relid").toOption.map(_.as[Long]),
            command = json.\("command").toOption.map(_.as[String]),
            phase = json.\("phase").toOption.map(_.as[String]),
            lockersTotal = json.\("lockers_total").toOption.map(_.as[Long]),
            lockersDone = json.\("lockers_done").toOption.map(_.as[Long]),
            currentLockerPid = json.\("current_locker_pid").toOption.map(_.as[Long]),
            blocksTotal = json.\("blocks_total").toOption.map(_.as[Long]),
            blocksDone = json.\("blocks_done").toOption.map(_.as[Long]),
            tuplesTotal = json.\("tuples_total").toOption.map(_.as[Long]),
            tuplesDone = json.\("tuples_done").toOption.map(_.as[Long]),
            partitionsTotal = json.\("partitions_total").toOption.map(_.as[Long]),
            partitionsDone = json.\("partitions_done").toOption.map(_.as[Long])
          )
        )
      )
    }
  }
}
