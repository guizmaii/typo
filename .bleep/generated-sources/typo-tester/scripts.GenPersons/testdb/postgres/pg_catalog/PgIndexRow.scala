/**
 * File automatically generated by `typo` for its own test suite.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN
 */
package testdb
package postgres
package pg_catalog

import anorm.RowParser
import anorm.Success
import org.postgresql.util.PGobject
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgIndexRow(
  indexrelid: PgIndexId,
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
  indkey: PGobject,
  indcollation: PGobject,
  indclass: PGobject,
  indoption: PGobject,
  indexprs: Option[PGobject],
  indpred: Option[PGobject]
)

object PgIndexRow {
  implicit val rowParser: RowParser[PgIndexRow] = { row =>
    Success(
      PgIndexRow(
        indexrelid = row[PgIndexId]("indexrelid"),
        indrelid = row[Long]("indrelid"),
        indnatts = row[Int]("indnatts"),
        indnkeyatts = row[Int]("indnkeyatts"),
        indisunique = row[Boolean]("indisunique"),
        indisprimary = row[Boolean]("indisprimary"),
        indisexclusion = row[Boolean]("indisexclusion"),
        indimmediate = row[Boolean]("indimmediate"),
        indisclustered = row[Boolean]("indisclustered"),
        indisvalid = row[Boolean]("indisvalid"),
        indcheckxmin = row[Boolean]("indcheckxmin"),
        indisready = row[Boolean]("indisready"),
        indislive = row[Boolean]("indislive"),
        indisreplident = row[Boolean]("indisreplident"),
        indkey = row[PGobject]("indkey"),
        indcollation = row[PGobject]("indcollation"),
        indclass = row[PGobject]("indclass"),
        indoption = row[PGobject]("indoption"),
        indexprs = row[Option[PGobject]]("indexprs"),
        indpred = row[Option[PGobject]]("indpred")
      )
    )
  }

  implicit val oFormat: OFormat[PgIndexRow] = new OFormat[PgIndexRow]{
    override def writes(o: PgIndexRow): JsObject =
      Json.obj(
        "indexrelid" -> o.indexrelid,
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

    override def reads(json: JsValue): JsResult[PgIndexRow] = {
      JsResult.fromTry(
        Try(
          PgIndexRow(
            indexrelid = json.\("indexrelid").as[PgIndexId],
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
            indkey = json.\("indkey").as[PGobject],
            indcollation = json.\("indcollation").as[PGobject],
            indclass = json.\("indclass").as[PGobject],
            indoption = json.\("indoption").as[PGobject],
            indexprs = json.\("indexprs").toOption.map(_.as[PGobject]),
            indpred = json.\("indpred").toOption.map(_.as[PGobject])
          )
        )
      )
    }
  }
}
