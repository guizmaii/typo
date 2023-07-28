/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_foreign_server

import adventureworks.TypoAclItem
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgForeignServerRow(
  oid: PgForeignServerId,
  srvname: String,
  srvowner: /* oid */ Long,
  srvfdw: /* oid */ Long,
  srvtype: Option[String],
  srvversion: Option[String],
  srvacl: Option[Array[TypoAclItem]],
  srvoptions: Option[Array[String]]
)

object PgForeignServerRow {
  def rowParser(idx: Int): RowParser[PgForeignServerRow] =
    RowParser[PgForeignServerRow] { row =>
      Success(
        PgForeignServerRow(
          oid = row[PgForeignServerId](idx + 0),
          srvname = row[String](idx + 1),
          srvowner = row[/* oid */ Long](idx + 2),
          srvfdw = row[/* oid */ Long](idx + 3),
          srvtype = row[Option[String]](idx + 4),
          srvversion = row[Option[String]](idx + 5),
          srvacl = row[Option[Array[TypoAclItem]]](idx + 6),
          srvoptions = row[Option[Array[String]]](idx + 7)
        )
      )
    }
  implicit val oFormat: OFormat[PgForeignServerRow] = new OFormat[PgForeignServerRow]{
    override def writes(o: PgForeignServerRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
        "srvname" -> o.srvname,
        "srvowner" -> o.srvowner,
        "srvfdw" -> o.srvfdw,
        "srvtype" -> o.srvtype,
        "srvversion" -> o.srvversion,
        "srvacl" -> o.srvacl,
        "srvoptions" -> o.srvoptions
      )
  
    override def reads(json: JsValue): JsResult[PgForeignServerRow] = {
      JsResult.fromTry(
        Try(
          PgForeignServerRow(
            oid = json.\("oid").as[PgForeignServerId],
            srvname = json.\("srvname").as[String],
            srvowner = json.\("srvowner").as[/* oid */ Long],
            srvfdw = json.\("srvfdw").as[/* oid */ Long],
            srvtype = json.\("srvtype").toOption.map(_.as[String]),
            srvversion = json.\("srvversion").toOption.map(_.as[String]),
            srvacl = json.\("srvacl").toOption.map(_.as[Array[TypoAclItem]]),
            srvoptions = json.\("srvoptions").toOption.map(_.as[Array[String]])
          )
        )
      )
    }
  }
}
