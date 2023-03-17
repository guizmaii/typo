package testdb
package pg_catalog

import anorm.RowParser
import anorm.Success
import java.time.LocalDateTime
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.util.Try

case class PgUserRow(
  /** Points to [[testdb.pg_catalog.PgShadowRow.usename]] */
  usename: Option[String],
  /** Points to [[testdb.pg_catalog.PgShadowRow.usesysid]] */
  usesysid: Option[Long],
  /** Points to [[testdb.pg_catalog.PgShadowRow.usecreatedb]] */
  usecreatedb: Option[Boolean],
  /** Points to [[testdb.pg_catalog.PgShadowRow.usesuper]] */
  usesuper: Option[Boolean],
  /** Points to [[testdb.pg_catalog.PgShadowRow.userepl]] */
  userepl: Option[Boolean],
  /** Points to [[testdb.pg_catalog.PgShadowRow.usebypassrls]] */
  usebypassrls: Option[Boolean],
  passwd: /* unknown nullability */ Option[String],
  /** Points to [[testdb.pg_catalog.PgShadowRow.valuntil]] */
  valuntil: Option[LocalDateTime],
  /** Points to [[testdb.pg_catalog.PgShadowRow.useconfig]] */
  useconfig: Option[Array[String]]
)

object PgUserRow {
  implicit val rowParser: RowParser[PgUserRow] = { row =>
    Success(
      PgUserRow(
        usename = row[Option[String]]("usename"),
        usesysid = row[Option[Long]]("usesysid"),
        usecreatedb = row[Option[Boolean]]("usecreatedb"),
        usesuper = row[Option[Boolean]]("usesuper"),
        userepl = row[Option[Boolean]]("userepl"),
        usebypassrls = row[Option[Boolean]]("usebypassrls"),
        passwd = row[/* unknown nullability */ Option[String]]("passwd"),
        valuntil = row[Option[LocalDateTime]]("valuntil"),
        useconfig = row[Option[Array[String]]]("useconfig")
      )
    )
  }

  implicit val oFormat: OFormat[PgUserRow] = new OFormat[PgUserRow]{
    override def writes(o: PgUserRow): JsObject =
      Json.obj(
        "usename" -> o.usename,
      "usesysid" -> o.usesysid,
      "usecreatedb" -> o.usecreatedb,
      "usesuper" -> o.usesuper,
      "userepl" -> o.userepl,
      "usebypassrls" -> o.usebypassrls,
      "passwd" -> o.passwd,
      "valuntil" -> o.valuntil,
      "useconfig" -> o.useconfig
      )

    override def reads(json: JsValue): JsResult[PgUserRow] = {
      JsResult.fromTry(
        Try(
          PgUserRow(
            usename = json.\("usename").toOption.map(_.as[String]),
            usesysid = json.\("usesysid").toOption.map(_.as[Long]),
            usecreatedb = json.\("usecreatedb").toOption.map(_.as[Boolean]),
            usesuper = json.\("usesuper").toOption.map(_.as[Boolean]),
            userepl = json.\("userepl").toOption.map(_.as[Boolean]),
            usebypassrls = json.\("usebypassrls").toOption.map(_.as[Boolean]),
            passwd = json.\("passwd").toOption.map(_.as[String]),
            valuntil = json.\("valuntil").toOption.map(_.as[LocalDateTime]),
            useconfig = json.\("useconfig").toOption.map(_.as[Array[String]])
          )
        )
      )
    }
  }
}
