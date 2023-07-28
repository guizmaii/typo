/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_largeobject

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgLargeobjectRow(
  loid: /* oid */ Long,
  pageno: Int,
  data: Array[Byte]
){
   val compositeId: PgLargeobjectId = PgLargeobjectId(loid, pageno)
 }

object PgLargeobjectRow {
  def rowParser(idx: Int): RowParser[PgLargeobjectRow] =
    RowParser[PgLargeobjectRow] { row =>
      Success(
        PgLargeobjectRow(
          loid = row[/* oid */ Long](idx + 0),
          pageno = row[Int](idx + 1),
          data = row[Array[Byte]](idx + 2)
        )
      )
    }
  implicit val oFormat: OFormat[PgLargeobjectRow] = new OFormat[PgLargeobjectRow]{
    override def writes(o: PgLargeobjectRow): JsObject =
      Json.obj(
        "loid" -> o.loid,
        "pageno" -> o.pageno,
        "data" -> o.data
      )
  
    override def reads(json: JsValue): JsResult[PgLargeobjectRow] = {
      JsResult.fromTry(
        Try(
          PgLargeobjectRow(
            loid = json.\("loid").as[/* oid */ Long],
            pageno = json.\("pageno").as[Int],
            data = json.\("data").as[Array[Byte]]
          )
        )
      )
    }
  }
}
