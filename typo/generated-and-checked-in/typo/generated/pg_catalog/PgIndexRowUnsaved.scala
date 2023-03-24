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

case class PgIndexRowUnsaved(
  indrelid: Long,
  indnatts: Int,
  indnkeyatts: Int,
  indisunique: Boolean,
  indisprimary: Boolean,
  indisexclusion: Boolean,
  indimmediate: Boolean,
  indisclustered: Boolean,
  indisvalid: Boolean,
  indcheckxmin: Boolean,
  indisready: Boolean,
  indislive: Boolean,
  indisreplident: Boolean,
  indkey: Array[Int],
  indcollation: Array[Long],
  indclass: Array[Long],
  indoption: Array[Int],
  indexprs: Option[PGobject],
  indpred: Option[PGobject]
)
object PgIndexRowUnsaved {
  implicit val oFormat: OFormat[PgIndexRowUnsaved] = new OFormat[PgIndexRowUnsaved]{
    override def writes(o: PgIndexRowUnsaved): JsObject =
      Json.obj(
        "indrelid" -> o.indrelid,
      "indnatts" -> o.indnatts,
      "indnkeyatts" -> o.indnkeyatts,
      "indisunique" -> o.indisunique,
      "indisprimary" -> o.indisprimary,
      "indisexclusion" -> o.indisexclusion,
      "indimmediate" -> o.indimmediate,
      "indisclustered" -> o.indisclustered,
      "indisvalid" -> o.indisvalid,
      "indcheckxmin" -> o.indcheckxmin,
      "indisready" -> o.indisready,
      "indislive" -> o.indislive,
      "indisreplident" -> o.indisreplident,
      "indkey" -> o.indkey,
      "indcollation" -> o.indcollation,
      "indclass" -> o.indclass,
      "indoption" -> o.indoption,
      "indexprs" -> o.indexprs,
      "indpred" -> o.indpred
      )

    override def reads(json: JsValue): JsResult[PgIndexRowUnsaved] = {
      JsResult.fromTry(
        Try(
          PgIndexRowUnsaved(
            indrelid = json.\("indrelid").as[Long],
            indnatts = json.\("indnatts").as[Int],
            indnkeyatts = json.\("indnkeyatts").as[Int],
            indisunique = json.\("indisunique").as[Boolean],
            indisprimary = json.\("indisprimary").as[Boolean],
            indisexclusion = json.\("indisexclusion").as[Boolean],
            indimmediate = json.\("indimmediate").as[Boolean],
            indisclustered = json.\("indisclustered").as[Boolean],
            indisvalid = json.\("indisvalid").as[Boolean],
            indcheckxmin = json.\("indcheckxmin").as[Boolean],
            indisready = json.\("indisready").as[Boolean],
            indislive = json.\("indislive").as[Boolean],
            indisreplident = json.\("indisreplident").as[Boolean],
            indkey = json.\("indkey").as[Array[Int]],
            indcollation = json.\("indcollation").as[Array[Long]],
            indclass = json.\("indclass").as[Array[Long]],
            indoption = json.\("indoption").as[Array[Int]],
            indexprs = json.\("indexprs").toOption.map(_.as[PGobject]),
            indpred = json.\("indpred").toOption.map(_.as[PGobject])
          )
        )
      )
    }
  }
}
