/**
 * File has been automatically generated by `typo` for internal use.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 *
 * (If you're developing `typo` and want to change it: run `bleep generate-sources`)
 */
package typo
package generated
package pg_catalog

import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgPartitionedTableRowUnsaved(
  partstrat: String,
  partnatts: Int,
  partdefid: Long,
  partattrs: Array[Int],
  partclass: Array[Long],
  partcollation: Array[Long],
  partexprs: Option[PGobject]
)
object PgPartitionedTableRowUnsaved {
  implicit val oFormat: OFormat[PgPartitionedTableRowUnsaved] = new OFormat[PgPartitionedTableRowUnsaved]{
    override def writes(o: PgPartitionedTableRowUnsaved): JsObject =
      Json.obj(
        "partstrat" -> o.partstrat,
      "partnatts" -> o.partnatts,
      "partdefid" -> o.partdefid,
      "partattrs" -> o.partattrs,
      "partclass" -> o.partclass,
      "partcollation" -> o.partcollation,
      "partexprs" -> o.partexprs
      )

    override def reads(json: JsValue): JsResult[PgPartitionedTableRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PgPartitionedTableRowUnsaved(
            partstrat = json.\("partstrat").as[String],
            partnatts = json.\("partnatts").as[Int],
            partdefid = json.\("partdefid").as[Long],
            partattrs = json.\("partattrs").as[Array[Int]],
            partclass = json.\("partclass").as[Array[Long]],
            partcollation = json.\("partcollation").as[Array[Long]],
            partexprs = json.\("partexprs").toOption.map(_.as[PGobject])
          )
        )
      )
    }
  }
}
