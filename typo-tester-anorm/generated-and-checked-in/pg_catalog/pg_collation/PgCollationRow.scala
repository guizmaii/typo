/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_collation

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgCollationRow(
  oid: PgCollationId,
  collname: String,
  collnamespace: /* oid */ Long,
  collowner: /* oid */ Long,
  collprovider: String,
  collisdeterministic: Boolean,
  collencoding: Int,
  collcollate: String,
  collctype: String,
  collversion: Option[String]
)

object PgCollationRow {
  def rowParser(idx: Int): RowParser[PgCollationRow] =
    RowParser[PgCollationRow] { row =>
      Success(
        PgCollationRow(
          oid = row[PgCollationId](idx + 0),
          collname = row[String](idx + 1),
          collnamespace = row[/* oid */ Long](idx + 2),
          collowner = row[/* oid */ Long](idx + 3),
          collprovider = row[String](idx + 4),
          collisdeterministic = row[Boolean](idx + 5),
          collencoding = row[Int](idx + 6),
          collcollate = row[String](idx + 7),
          collctype = row[String](idx + 8),
          collversion = row[Option[String]](idx + 9)
        )
      )
    }
  implicit val oFormat: OFormat[PgCollationRow] = new OFormat[PgCollationRow]{
    override def writes(o: PgCollationRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
        "collname" -> o.collname,
        "collnamespace" -> o.collnamespace,
        "collowner" -> o.collowner,
        "collprovider" -> o.collprovider,
        "collisdeterministic" -> o.collisdeterministic,
        "collencoding" -> o.collencoding,
        "collcollate" -> o.collcollate,
        "collctype" -> o.collctype,
        "collversion" -> o.collversion
      )
  
    override def reads(json: JsValue): JsResult[PgCollationRow] = {
      JsResult.fromTry(
        Try(
          PgCollationRow(
            oid = json.\("oid").as[PgCollationId],
            collname = json.\("collname").as[String],
            collnamespace = json.\("collnamespace").as[/* oid */ Long],
            collowner = json.\("collowner").as[/* oid */ Long],
            collprovider = json.\("collprovider").as[String],
            collisdeterministic = json.\("collisdeterministic").as[Boolean],
            collencoding = json.\("collencoding").as[Int],
            collcollate = json.\("collcollate").as[String],
            collctype = json.\("collctype").as[String],
            collversion = json.\("collversion").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
