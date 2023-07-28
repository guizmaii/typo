/**
 * File has been automatically generated by `typo`.
 *
 * IF YOU CHANGE THIS FILE YOUR CHANGES WILL BE OVERWRITTEN.
 */
package adventureworks
package pg_catalog
package pg_constraint

import adventureworks.TypoPgNodeTree
import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgConstraintRow(
  oid: PgConstraintId,
  conname: String,
  connamespace: /* oid */ Long,
  contype: String,
  condeferrable: Boolean,
  condeferred: Boolean,
  convalidated: Boolean,
  conrelid: /* oid */ Long,
  contypid: /* oid */ Long,
  conindid: /* oid */ Long,
  conparentid: /* oid */ Long,
  confrelid: /* oid */ Long,
  confupdtype: String,
  confdeltype: String,
  confmatchtype: String,
  conislocal: Boolean,
  coninhcount: Int,
  connoinherit: Boolean,
  conkey: Option[Array[Int]],
  confkey: Option[Array[Int]],
  conpfeqop: Option[Array[/* oid */ Long]],
  conppeqop: Option[Array[/* oid */ Long]],
  conffeqop: Option[Array[/* oid */ Long]],
  conexclop: Option[Array[/* oid */ Long]],
  conbin: Option[TypoPgNodeTree]
)

object PgConstraintRow {
  def rowParser(idx: Int): RowParser[PgConstraintRow] =
    RowParser[PgConstraintRow] { row =>
      Success(
        PgConstraintRow(
          oid = row[PgConstraintId](idx + 0),
          conname = row[String](idx + 1),
          connamespace = row[/* oid */ Long](idx + 2),
          contype = row[String](idx + 3),
          condeferrable = row[Boolean](idx + 4),
          condeferred = row[Boolean](idx + 5),
          convalidated = row[Boolean](idx + 6),
          conrelid = row[/* oid */ Long](idx + 7),
          contypid = row[/* oid */ Long](idx + 8),
          conindid = row[/* oid */ Long](idx + 9),
          conparentid = row[/* oid */ Long](idx + 10),
          confrelid = row[/* oid */ Long](idx + 11),
          confupdtype = row[String](idx + 12),
          confdeltype = row[String](idx + 13),
          confmatchtype = row[String](idx + 14),
          conislocal = row[Boolean](idx + 15),
          coninhcount = row[Int](idx + 16),
          connoinherit = row[Boolean](idx + 17),
          conkey = row[Option[Array[Int]]](idx + 18),
          confkey = row[Option[Array[Int]]](idx + 19),
          conpfeqop = row[Option[Array[/* oid */ Long]]](idx + 20),
          conppeqop = row[Option[Array[/* oid */ Long]]](idx + 21),
          conffeqop = row[Option[Array[/* oid */ Long]]](idx + 22),
          conexclop = row[Option[Array[/* oid */ Long]]](idx + 23),
          conbin = row[Option[TypoPgNodeTree]](idx + 24)
        )
      )
    }
  implicit val oFormat: OFormat[PgConstraintRow] = new OFormat[PgConstraintRow]{
    override def writes(o: PgConstraintRow): JsObject =
      Json.obj(
        "oid" -> o.oid,
        "conname" -> o.conname,
        "connamespace" -> o.connamespace,
        "contype" -> o.contype,
        "condeferrable" -> o.condeferrable,
        "condeferred" -> o.condeferred,
        "convalidated" -> o.convalidated,
        "conrelid" -> o.conrelid,
        "contypid" -> o.contypid,
        "conindid" -> o.conindid,
        "conparentid" -> o.conparentid,
        "confrelid" -> o.confrelid,
        "confupdtype" -> o.confupdtype,
        "confdeltype" -> o.confdeltype,
        "confmatchtype" -> o.confmatchtype,
        "conislocal" -> o.conislocal,
        "coninhcount" -> o.coninhcount,
        "connoinherit" -> o.connoinherit,
        "conkey" -> o.conkey,
        "confkey" -> o.confkey,
        "conpfeqop" -> o.conpfeqop,
        "conppeqop" -> o.conppeqop,
        "conffeqop" -> o.conffeqop,
        "conexclop" -> o.conexclop,
        "conbin" -> o.conbin
      )
  
    override def reads(json: JsValue): JsResult[PgConstraintRow] = {
      JsResult.fromTry(
        Try(
          PgConstraintRow(
            oid = json.\("oid").as[PgConstraintId],
            conname = json.\("conname").as[String],
            connamespace = json.\("connamespace").as[/* oid */ Long],
            contype = json.\("contype").as[String],
            condeferrable = json.\("condeferrable").as[Boolean],
            condeferred = json.\("condeferred").as[Boolean],
            convalidated = json.\("convalidated").as[Boolean],
            conrelid = json.\("conrelid").as[/* oid */ Long],
            contypid = json.\("contypid").as[/* oid */ Long],
            conindid = json.\("conindid").as[/* oid */ Long],
            conparentid = json.\("conparentid").as[/* oid */ Long],
            confrelid = json.\("confrelid").as[/* oid */ Long],
            confupdtype = json.\("confupdtype").as[String],
            confdeltype = json.\("confdeltype").as[String],
            confmatchtype = json.\("confmatchtype").as[String],
            conislocal = json.\("conislocal").as[Boolean],
            coninhcount = json.\("coninhcount").as[Int],
            connoinherit = json.\("connoinherit").as[Boolean],
            conkey = json.\("conkey").toOption.map(_.as[Array[Int]]),
            confkey = json.\("confkey").toOption.map(_.as[Array[Int]]),
            conpfeqop = json.\("conpfeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conppeqop = json.\("conppeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conffeqop = json.\("conffeqop").toOption.map(_.as[Array[/* oid */ Long]]),
            conexclop = json.\("conexclop").toOption.map(_.as[Array[/* oid */ Long]]),
            conbin = json.\("conbin").toOption.map(_.as[TypoPgNodeTree])
          )
        )
      )
    }
  }
}
