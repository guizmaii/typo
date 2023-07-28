/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_ts_config_map

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgTsConfigMapRow(
  mapcfg: /* oid */ Long,
  maptokentype: Int,
  mapseqno: Int,
  mapdict: /* oid */ Long
){
   val compositeId: PgTsConfigMapId = PgTsConfigMapId(mapcfg, maptokentype, mapseqno)
 }

object PgTsConfigMapRow {
  def rowParser(idx: Int): RowParser[PgTsConfigMapRow] =
    RowParser[PgTsConfigMapRow] { row =>
      Success(
        PgTsConfigMapRow(
          mapcfg = row[/* oid */ Long](idx + 0),
          maptokentype = row[Int](idx + 1),
          mapseqno = row[Int](idx + 2),
          mapdict = row[/* oid */ Long](idx + 3)
        )
      )
    }
  implicit val oFormat: OFormat[PgTsConfigMapRow] = new OFormat[PgTsConfigMapRow]{
    override def writes(o: PgTsConfigMapRow): JsObject =
      Json.obj(
        "mapcfg" -> o.mapcfg,
        "maptokentype" -> o.maptokentype,
        "mapseqno" -> o.mapseqno,
        "mapdict" -> o.mapdict
      )
  
    override def reads(json: JsValue): JsResult[PgTsConfigMapRow] = {
      JsResult.fromTry(
        Try(
          PgTsConfigMapRow(
            mapcfg = json.\("mapcfg").as[/* oid */ Long],
            maptokentype = json.\("maptokentype").as[Int],
            mapseqno = json.\("mapseqno").as[Int],
            mapdict = json.\("mapdict").as[/* oid */ Long]
          )
        )
      )
    }
  }
}
