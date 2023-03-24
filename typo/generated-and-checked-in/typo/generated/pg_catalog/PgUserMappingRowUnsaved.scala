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

import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgUserMappingRowUnsaved(
  umuser: Long,
  umserver: Long,
  umoptions: Option[Array[String]]
)
object PgUserMappingRowUnsaved {
  implicit val oFormat: OFormat[PgUserMappingRowUnsaved] = new OFormat[PgUserMappingRowUnsaved]{
    override def writes(o: PgUserMappingRowUnsaved): JsObject =
      Json.obj(
        "umuser" -> o.umuser,
      "umserver" -> o.umserver,
      "umoptions" -> o.umoptions
      )

    override def reads(json: JsValue): JsResult[PgUserMappingRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PgUserMappingRowUnsaved(
            umuser = json.\("umuser").as[Long],
            umserver = json.\("umserver").as[Long],
            umoptions = json.\("umoptions").toOption.map(_.as[Array[String]])
          )
        )
      )
    }
  }
}
