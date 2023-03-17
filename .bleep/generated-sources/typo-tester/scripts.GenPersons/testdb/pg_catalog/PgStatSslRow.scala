package testdb.pg_catalog

import anorm.RowParser
import anorm.Success
import play.api.libs.json.JsObject
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.OFormat
import scala.math.BigDecimal
import scala.util.Try

case class PgStatSslRow(
  pid: /* unknown nullability */ Option[Int],
  ssl: /* unknown nullability */ Option[Boolean],
  version: /* unknown nullability */ Option[String],
  cipher: /* unknown nullability */ Option[String],
  bits: /* unknown nullability */ Option[Int],
  clientDn: /* unknown nullability */ Option[String],
  clientSerial: /* unknown nullability */ Option[BigDecimal],
  issuerDn: /* unknown nullability */ Option[String]
)

object PgStatSslRow {
  implicit val rowParser: RowParser[PgStatSslRow] = { row =>
    Success(
      PgStatSslRow(
        pid = row[/* unknown nullability */ Option[Int]]("pid"),
        ssl = row[/* unknown nullability */ Option[Boolean]]("ssl"),
        version = row[/* unknown nullability */ Option[String]]("version"),
        cipher = row[/* unknown nullability */ Option[String]]("cipher"),
        bits = row[/* unknown nullability */ Option[Int]]("bits"),
        clientDn = row[/* unknown nullability */ Option[String]]("client_dn"),
        clientSerial = row[/* unknown nullability */ Option[BigDecimal]]("client_serial"),
        issuerDn = row[/* unknown nullability */ Option[String]]("issuer_dn")
      )
    )
  }

  implicit val oFormat: OFormat[PgStatSslRow] = new OFormat[PgStatSslRow]{
    override def writes(o: PgStatSslRow): JsObject =
      Json.obj(
        "pid" -> o.pid,
      "ssl" -> o.ssl,
      "version" -> o.version,
      "cipher" -> o.cipher,
      "bits" -> o.bits,
      "client_dn" -> o.clientDn,
      "client_serial" -> o.clientSerial,
      "issuer_dn" -> o.issuerDn
      )

    override def reads(json: JsValue): JsResult[PgStatSslRow] = {
      JsResult.fromTry(
        Try(
          PgStatSslRow(
            pid = json.\("pid").toOption.map(_.as[Int]),
            ssl = json.\("ssl").toOption.map(_.as[Boolean]),
            version = json.\("version").toOption.map(_.as[String]),
            cipher = json.\("cipher").toOption.map(_.as[String]),
            bits = json.\("bits").toOption.map(_.as[Int]),
            clientDn = json.\("client_dn").toOption.map(_.as[String]),
            clientSerial = json.\("client_serial").toOption.map(_.as[BigDecimal]),
            issuerDn = json.\("issuer_dn").toOption.map(_.as[String])
          )
        )
      )
    }
  }
}
